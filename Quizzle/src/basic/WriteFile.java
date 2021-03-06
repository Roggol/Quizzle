package basic;

import java.io.*;

public class WriteFile {// taken from : http://www.homeandlearn.co.uk/java/write_to_textfile.html

	private String path;

	private boolean append_to_file = false;

	public WriteFile(String file_path) {

		path = file_path;

	}

	public WriteFile(String file_path, boolean append_value) {

		path = file_path;

		append_to_file = append_value;

	}

	public void writeToFile(String textLine) throws IOException {

		FileWriter writer = new FileWriter(path, append_to_file);

		PrintWriter print_line = new PrintWriter(writer);

		print_line.printf("%s" + "%n", textLine);

		print_line.close();

	}

}
