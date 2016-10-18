package kr.co.cbnu.hive;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IOUtils;
import org.apache.hadoop.util.Progressable;

public class ABC {
//	public static void main(String[] args) throws IOException, URISyntaxException {
//		System.setProperty("hadoop.home.dir", "C:/winutils/hadoop-2.7.1");
//		Configuration conf = new Configuration();
//		conf.set("fs.defaultFS", "hdfs://192.168.131.145:9000");
//		FileSystem fileSystem = FileSystem.get(new URI("hdfs://192.168.131.145:9000"), conf);
//		if (fileSystem instanceof DistributedFileSystem) {
//			System.out.println("HDFS is the underlying filesystem");
//		} else {
//			System.out.println("Other type of file system " + fileSystem.getClass());
//		}
//
//		FileStatus[] fileStatus = fileSystem.listStatus(new Path("hdfs://192.168.131.145:9000/"));
//		// 4. Using FileUtil, getting the Paths for all the FileStatus
//		Path[] paths = FileUtil.stat2Paths(fileStatus);
//		// 5. Iterate through the directory and display the files in it
//		System.out.println("***** Contents of the Directory *****");
//		for (Path path : paths) {
//			System.out.println(path);
//		}
//
//		try {
//			Path pt = new Path("hdfs://192.168.131.145:9000/home/hadoop/abc.txt");
//			FileSystem fs = FileSystem.get(new Configuration());
//			BufferedWriter br = new BufferedWriter(new OutputStreamWriter(fs.create(pt, true)));
//			// TO append data to a file, use fs.append(Path f)
//			String line;
//			line = "Hello";
//			System.out.println(line);
//			br.write(line);
//			br.close();
//		} catch (Exception e) {
//			System.out.println("File not found");
//		}
//
//	}
	
//	public static void main(String[] args) throws IOException, URISyntaxException 
//	   {
//		  System.setProperty("hadoop.home.dir", "C:/winutils/hadoop-2.7.1");
//	      //1. Get the instance of COnfiguration
//	      Configuration configuration = new Configuration();
//	      //2. Create an InputStream to read the data from local file
//	      InputStream inputStream = new BufferedInputStream(new FileInputStream("C:/Users/PENHCHET/Downloads/Compressed/Pluralsight.Introduction.To.Qt.A.C.Plus.Plus.Cross.Platform.Application.Framework_p30download.com.rar"));
//	      //3. Get the HDFS instance
//	      FileSystem hdfs = FileSystem.get(new URI("hdfs://192.168.131.145:9000"), configuration);
//	      //4. Open a OutputStream to write the data, this can be obtained from the FileSytem
//	      OutputStream outputStream = hdfs.create(new Path("hdfs://192.168.131.145:9000/user/hadoop/Pluralsight.Introduction.To.Qt.A.C.Plus.Plus.Cross.Platform.Application.Framework_p30download.com.rar"),
//	      new Progressable() {  
//	              @Override
//	              public void progress() {
//	            	  System.out.print("....");
//	              }
//          });
//	      try
//	      {
//	        IOUtils.copyBytes(inputStream, outputStream, 4096, false); 
//	      }
//	      finally
//	      {
//	        IOUtils.closeStream(inputStream);
//	        IOUtils.closeStream(outputStream);
//	      } 
//	  }
	
	public static void main(String[] args) throws IOException, URISyntaxException 
	 {
		System.setProperty("hadoop.home.dir", "C:/winutils/hadoop-2.7.1");
	  //1. Get the instance of Configuration
	  Configuration configuration = new Configuration();
	  //2. URI of the file to be read
	  URI uri = new URI("hdfs://192.168.131.145:9000/user/hadoop/Hadoop_File.txt");
	  //3. Get the instance of the HDFS 
	  FileSystem hdfs = FileSystem.get(uri, configuration);
	  //4. A reference to hold the InputStream
	  InputStream inputStream = null;
	  try{
	   //5. Prepare the Path, i.e similar to File class in Java, Path represents file in HDFS
	   Path path = new Path(uri);
	   //6. Open a Input Stream to read the data from HDFS
	   inputStream = hdfs.open(path);
	   //7. Use the IOUtils to flush the data from the file to console
	   IOUtils.copyBytes(inputStream, System.out, 4096, false);
	  }finally{
	   //8. Close the InputStream once the data is read
	   IOUtils.closeStream(inputStream);
	  }

	 }
}
