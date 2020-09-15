package tw.com.uvbank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoadingCSV {

	public static void main(String[] args) throws IOException {
		try {
			InputStreamReader isr = new InputStreamReader(new FileInputStream("D://TestZone//file_input.csv"));
			BufferedReader reader = new BufferedReader(isr);
			BufferedWriter bw = new BufferedWriter(new FileWriter("D://TestZone//file_output.csv"));
			String line = null;
			while ((line = reader.readLine()) != null) {
				String item[] = line.split(",");
				String data1 = item[0].trim();
				String data2 = item[1].trim();
				String data3 = item[2].trim();
				String data4 = item[3].trim();
				String data5 = item[4].trim();
				String data6 = item[5].trim();
				String data7 = item[6].trim();

				if (data5.equals("0")) {
					System.out.println("");
				} else if (data5.equals("1")) {
					System.out.println(data7);
				}

				System.out.print(
						data1 + "\t" + data2 + "\t" + data3 + "\t" + data4 + "\t" + data5 + "\t" + data6 + "\t" + "\n");
			}
			bw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
