package com.ConfigurationProp;

import java.io.IOException;

import com.ConfiguratioReader.ConfigReader;

public class FileReaderManager {
	
	private FileReaderManager() {
	
	}
	
public static FileReaderManager getInstanceFRM() {
	FileReaderManager frm = new FileReaderManager();
	return frm;
}
	
	
public ConfigReader getInstanceCR() throws IOException {
	ConfigReader cr = new ConfigReader();
	return cr;
}

}
