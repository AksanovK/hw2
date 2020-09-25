package ru.itis.downloader.app;

import com.beust.jcommander.JCommander;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import ru.itis.downloader.utils.*;

public class Program {
	public static void main(String[] args) {

		Args argv = new Args();
		JCommander.newBuilder()
		.addObject(argv)
		.build()
		.parse(args);

		String [] urls = argv.files.split(",");
		String folder = argv.folder;
		int count = argv.count;
		ExecutorService service = Executors.newFixedThreadPool(count);		
		for(String url : urls) {
			service.submit(new Runnable () {
				public void run () {
					Downloader.download(url, folder);
				}
			});
		}
	}
}
