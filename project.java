package kcsj_2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class project {
	public static void main(String[] args) throws IOException{
		//��ȡ�ļ�
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("E:\\������̳���\\yq_in.txt"),"gbk"));
		List<String> list = new ArrayList<String>();
		String line;
		//���ζ�ȡÿһ������
		while((line = br.readLine()) != null) {
				list.add(line);
		}
		br.close();
		
		//д���ļ�
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File("E:\\������̳���\\yq_out1.txt"))));
		String p2 = null;
		for(int i = 0;i<list.size();i++) {
			//��ȡ�����������
			String data = list.get(i);
			String p1 = data.substring(0,3);
			
			//��ͬʡ��ֻ�����һ��
			if (!p1.equals(p2)) {
				bw.newLine();
				System.out.println("");
				bw.newLine();
				bw.write(p1);
				System.out.println(p1);
			}
			//��ȥ������ȷ�����������ݣ�����Ĵ��±�4��ʼ���ֱ�����һ��
			if (!data.contains("����ȷ����")) {
				String city = data.substring(4,data.length());
				bw.write(city);
				System.out.println(city);
			}
			bw.newLine();
			p2 = p1;
		}
		//������
		bw.close();
	}
}