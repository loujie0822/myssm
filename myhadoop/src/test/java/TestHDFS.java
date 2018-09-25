import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;


public class TestHDFS {
    @Test
    public void testPut() throws Exception {
        Configuration conf =new Configuration();
        conf.set("fs.defaultFS","hdfs://s101:8020");

        FileSystem fs =FileSystem.get(conf);
        InputStream in=fs.open(new Path("hdfs://s101/user/centos/data/2.txt"));
        ByteArrayOutputStream baos =new ByteArrayOutputStream();
        IOUtils.copyBytes(in,baos,1024);
        in.close();
        System.out.println(new String(baos.toByteArray()));
    }
    @Test
    public void getPut() throws Exception {
        Configuration conf =new Configuration();
        conf.set("fs.defaultFS","hdfs://s101:8020");
        FileSystem fs =FileSystem.get(conf);
        FSDataOutputStream out = fs.create(new Path("hdfs://s101/user/centos/data/2.txt"), true, 1024, (short) 2, 1024);
        out.write("abc".getBytes());
        out.close();
    }
}
