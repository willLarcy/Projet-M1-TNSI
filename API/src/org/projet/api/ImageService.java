package org.projet.api;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;



@Path("/upload")
public class ImageService {
	
	private String name = "test.png";
	
	@POST
    @Path("/send")
    public Response postImage(final String input) {
		try {
			System.out.println(input);
			String data = input.split(",")[1];
			byte[] imageBytes = javax.xml.bind.DatatypeConverter.parseBase64Binary(data);
			File outputfile = new File("C:\\Users\\Stephane\\Documents\\testAPI\\"+name);
			OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(outputfile));
	        outputStream.write(imageBytes);
	        outputStream.close();
			PythonCall scriptPython = new PythonCall();
	        scriptPython.runScript("C:\\Users\\Stephane\\Documents\\testAPI\\"+name);
	        
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return Response.serverError().build();
		}
        return Response.ok("Upload done").build();
    } 

}
