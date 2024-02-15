package me.panxin;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import java.io.ByteArrayInputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

public class XMLUtil {
    public static boolean hasChildren(String xmlString) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new ByteArrayInputStream(xmlString.getBytes()));
            NodeList diagramNodes = document.getElementsByTagName("diagram");
            if (diagramNodes.getLength() > 0) {
                Node diagramNode = diagramNodes.item(0);
                NodeList children = diagramNode.getChildNodes();
                for (int i = 0; i < children.getLength(); i++) {
                    if (children.item(i) instanceof Element) {
                        return true; // Found at least one child element
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    /**
     * @param xmlString
     * @return {@link String}
     */
    public static String extractDiagramText(String xmlString) {
        // 使用正则表达式提取 <diagram> 标签下的内容
        Pattern pattern = Pattern.compile("<diagram.*?>(.*?)</diagram>", Pattern.DOTALL);
        Matcher matcher = pattern.matcher(xmlString);

        while (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }
}

