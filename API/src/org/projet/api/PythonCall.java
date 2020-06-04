package org.projet.api;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class PythonCall {

	Process mProcess;

	public void runScript(String path) {
		Process process;
		try {
			//ProcessBuilder pb = new ProcessBuilder("python", "C:\\Users\\Romain\\Documents\\Projet-M1-TNSI - Copie\\Modele_IA\\classifieur.py", path);
			ProcessBuilder pb = new ProcessBuilder("python", "C:\\Users\\Stephane\\Documents\\hw.py", "a1");
			process = pb.start();
			mProcess = process;
		} catch (Exception e) {
			System.out.println("Exception Raised" + e.toString());
		}
		InputStream stdout = mProcess.getInputStream();
		InputStream stsin = mProcess.getErrorStream();
		BufferedReader reader = new BufferedReader(new InputStreamReader(stdout, StandardCharsets.UTF_8));
		BufferedReader readerError = new BufferedReader(new InputStreamReader(stsin, StandardCharsets.UTF_8));
		String line;
		try {
			while (((line = reader.readLine()) != null) || ((line = readerError.readLine()) != null)) {
				System.out.println("stdout: " + line);
			}
		} catch (IOException e) {
			System.out.println("Exception in reading output" + e.toString());
		}
	}

}
