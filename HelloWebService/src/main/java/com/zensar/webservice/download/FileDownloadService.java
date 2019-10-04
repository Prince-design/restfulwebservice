package com.zensar.webservice.download;

import java.io.File;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

@Path("/download")
public class FileDownloadService {
	private static final String textfile = "D:/pr.txt";
	private static final String imageFile= "D:\\prince1/p3.jfif";
	private static final String pdfFile= "D:\\prince1/p5.pdf";
@GET
@Path("/text")
@Produces("text/plain")
	public Response getTextFile() {
		File file = new File(textfile);
		ResponseBuilder reponseBuilder = Response.ok(file);
		 reponseBuilder.header("Content-Disposition", "attachment;filename=pr.txt");
		return  reponseBuilder.build();
	}
@GET
@Path("/image")
@Produces("image/jfif")
	public Response getImageFile() {
		File file = new File(imageFile);
		ResponseBuilder reponseBuilder = Response.ok(file);
		 reponseBuilder.header("Content-Disposition", "attachment;filename=p3.jfif");
		return  reponseBuilder.build();
		
}
@GET
@Path("/pdf")
@Produces("application/pdf")
	public Response getPdfFile() {
		File file = new File(pdfFile);
		ResponseBuilder reponseBuilder = Response.ok(file);
		 reponseBuilder.header("Content-Disposition", "attachment;filename=p5.pdf");
		return  reponseBuilder.build();
}
}

