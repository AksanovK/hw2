package ru.itis.downloader.utils;

import java.net.*;
import java.io.*;
import java.util.*;

public class Downloader {

    public static void download(String url, String path) {

        try {
            URL link  = new URL(url);
            InputStream in = new BufferedInputStream(link.openStream());
            File file = new File(String.valueOf(UUID.randomUUID()));
            OutputStream out = new BufferedOutputStream(new FileOutputStream(path + "/" + file.getName() + ".jpg"));
            int i = in.read();
            while (i >= 0) {
                out.write(i);
                i = in.read();
            }
            in.close();
            out.close();           
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(e);
        } catch (FileNotFoundException e1) {
            throw new IllegalArgumentException(e1);
        } catch (IOException e2) {
            throw new IllegalArgumentException(e2);
        }
    }
}
