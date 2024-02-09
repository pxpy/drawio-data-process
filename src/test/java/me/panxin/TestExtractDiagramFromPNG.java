package me.panxin;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.Inflater;

/**
 * @author panxin
 * @date 2024/02/02
 */
public class TestExtractDiagramFromPNG {



    public static void testExtractDiagramFromPNG(String[] args) {
        // 获取资源文件的路径
        String resourcePath = "1.png";

        // 通过ClassLoader获取资源文件的绝对路径
        String absolutePath = TestExtractDiagramFromPNG.class.getClassLoader().getResource(resourcePath).getFile();

        // 创建File对象
        File file = new File(absolutePath);

        Map<String, byte[]> ztxt = new HashMap<>();
        try {
            // 创建FileInputStream以读取文件内容
            FileInputStream fis = new FileInputStream(file);
            String s = ExtractDiagramFromPNG.extractData(fis);

            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
