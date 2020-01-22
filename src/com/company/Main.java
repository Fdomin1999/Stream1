package com.company;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {

        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        Document doc = dBuilder.parse(new URL("http://gencat.cat/llengua/cinema/provacin.xml").openStream());

        NodeList nodeList = doc.getElementsByTagName("FILM");

        for (int i = 0; i < nodeList.getLength(); i++) {
            Node nNode = nodeList.item(i);

            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;

                System.out.println("ID Film: "
                        + eElement.getElementsByTagName("IDFILM").item(0).getTextContent());
                System.out.println("Prioritat "
                          + eElement.getElementsByTagName("PRIORITAT").item(0).getTextContent());
                System.out.println("Titol "
                        + eElement.getElementsByTagName("TITOL").item(0).getTextContent());
                System.out.println("Situacio: "
                        + eElement.getElementsByTagName("SITUACIO").item(0).getTextContent());
                System.out.println("Any: "
                        + eElement.getElementsByTagName("ANY").item(0).getTextContent());
                System.out.println("Cartell: "
                        + eElement.getElementsByTagName("CARTELL").item(0).getTextContent());
                System.out.println("Original: "
                        + eElement.getElementsByTagName("ORIGINAL").item(0).getTextContent());
                System.out.println("Direccio: "
                        + eElement.getElementsByTagName("DIRECCIO").item(0).getTextContent());
                System.out.println("Interprets"
                        + eElement.getElementsByTagName("INTERPRETS").item(0).getTextContent());
                System.out.println("Sinops: "
                        + eElement.getElementsByTagName("SINOPSI").item(0).getTextContent());
                System.out.println("Versio: "
                        + eElement.getElementsByTagName("VERSIO").item(0).getTextContent());
                System.out.println("Idioma: "
                        + eElement.getElementsByTagName("IDIOMA_x0020_ORIGINAL").item(0).getTextContent());
                System.out.println("Qualificacio: "
                        + eElement.getElementsByTagName("QUALIFICACIO").item(0).getTextContent());
                System.out.println("Trailer: "
                        + eElement.getElementsByTagName("TRAILER").item(0).getTextContent());
                System.out.println("Web: "
                        + eElement.getElementsByTagName("WEB").item(0).getTextContent());
                System.out.println("Estrena: "
                        + eElement.getElementsByTagName("ESTRENA").item(0).getTextContent());


            }
        }
    }
}