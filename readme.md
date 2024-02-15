# 简介
drawio导出的png图片是含有原始信息的，本工具用于提取原始的xml信息
# 使用方法
1. 下载添加依赖
``` xml
<dependency>
    <groupId>me.panxin</groupId>
    <artifactId>drawio-data-process</artifactId>
    <version>0.0.1</version>
</dependency>
```

2. 调用
``` java
ExtractDiagramFromPNG.extractData(FileInputStream fis)
```
# 参考
https://github.com/jgraph/drawio/tree/dev
https://juejin.cn/post/7077729413919408136
https://github.com/pzl/drawio-read/tree/master
https://jgraph.github.io/drawio-tools/tools/convert.html
https://www.w3.org/TR/png-3/

