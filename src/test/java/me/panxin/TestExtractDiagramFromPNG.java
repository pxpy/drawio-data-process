package me.panxin;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author panxin
 * @date 2024/02/02
 */
public class TestExtractDiagramFromPNG {

    @Test
    public  void testExtractDiagramFromPNG() {
        // 获取资源文件的路径
        String resourcePath = "1.png";

        // 通过ClassLoader获取资源文件的绝对路径
        String absolutePath = TestExtractDiagramFromPNG.class.getClassLoader().getResource(resourcePath).getFile();

        // 创建File对象
        File file = new File(absolutePath);

        try {
            // 创建FileInputStream以读取文件内容
            FileInputStream fis = new FileInputStream(file);
            String s = ExtractDiagramFromPNG.extractData(fis);
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
