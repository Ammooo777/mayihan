package kcsj_2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class project {
	public static void main(String[] args) throws IOException{
		//读取文件
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("E:\\软件工程程序\\yq_in.txt"),"gbk"));
		List<String> list = new ArrayList<String>();
		String line;
		//依次读取每一条数据
		while((line = br.readLine()) != null) {
				list.add(line);
		}
		br.close();
		
		//写入文件
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File("E:\\软件工程程序\\yq_out1.txt"))));
		String p2 = null;
		for(int i = 0;i<list.size();i++) {
			//读取数组里的数据
			String data = list.get(i);
			String p1 = data.substring(0,3);
			
			//相同省份只输出第一个
			if (!p1.equals(p2)) {
				bw.newLine();
				System.out.println("");
				bw.newLine();
				bw.write(p1);
				System.out.println(p1);
			}
			//除去“待明确地区”的数据，其余的从下标4开始输出直到最后一个
			if (!data.contains("待明确地区")) {
				String city = data.substring(4,data.length());
				bw.write(city);
				System.out.println(city);
			}
			bw.newLine();
			p2 = p1;
		}
		//输出结果
		bw.close();
	}
}