package ru.itis.downloader.utils;
 
import com.beust.jcommander.*;
import java.util.ArrayList;
import java.util.List;
 
@Parameters(separators = "=")
public class Args {
 
	@Parameter(names = "--mode", description = "Mode")
	public String mode = "one-thread";
 
	@Parameter(names = "--count", description = "Thread count")
	public int count = 1;

	@Parameter(names = "--files", description = "URLs")
	public String files;
 
	@Parameter(names = "--folder", description = "Folder")
	public String folder = "C:/Users/Камиль/Desktop/JAR/images";
}
