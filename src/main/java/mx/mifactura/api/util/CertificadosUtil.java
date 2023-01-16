package mx.mifactura.api.util;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.StringWriter;
import java.nio.file.Files;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import javax.xml.bind.DatatypeConverter;

public class CertificadosUtil {
	public static void main(String[] args) {
		
		String path = "C:\\temp\\ramdy\\Csd-Pruebas\\RFC-PAC-SC\\Personas Fisicas\\FIEL_CACX7605101P8_20190528152826\\cacx7605101p8.cer";
		System.out.println(exportarCertificadoPem(path));
	}
	
	public static String exportarCertificadoPem(String pathCertificado) {
        try {
          CertificateFactory certFactory = CertificateFactory.getInstance("X.509");
          byte[] buffer = Files.readAllBytes(new File(pathCertificado).toPath());
          X509Certificate cert = (X509Certificate)certFactory.generateCertificate(new ByteArrayInputStream(buffer));
          return formatoPemCertificado(cert, new StringWriter());
        } catch (Exception ioe) {
          System.out.println(ioe.toString());
          return null;
        } 
      }

      private static String formatoPemCertificado(X509Certificate certificado, StringWriter writer) {
        try {
          writer.write("-----BEGIN CERTIFICATE-----\n");
          writer.write(DatatypeConverter.printBase64Binary(certificado.getEncoded()).replaceAll("(.{64})", "$1\n"));
          writer.write("\n-----END CERTIFICATE-----\n");
        } catch (CertificateEncodingException e) {
          return null;
        }
        return writer.toString();
      }

}
