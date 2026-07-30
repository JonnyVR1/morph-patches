package tech.sud.base.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class SudZipUtils {
    public static void zipDirectory(File file, File file2) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream);
        zipFile(file, file.getName(), zipOutputStream);
        zipOutputStream.close();
        fileOutputStream.close();
    }

    private static void zipFile(File file, String str, ZipOutputStream zipOutputStream) throws IOException {
        if (file.isHidden()) {
            return;
        }
        if (file.isDirectory()) {
            if (str.endsWith("/")) {
                zipOutputStream.putNextEntry(new ZipEntry(str));
                zipOutputStream.closeEntry();
            } else {
                zipOutputStream.putNextEntry(new ZipEntry(str.concat("/")));
                zipOutputStream.closeEntry();
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                return;
            }
            for (File file2 : fileArrListFiles) {
                zipFile(file2, str + "/" + file2.getName(), zipOutputStream);
            }
            return;
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        zipOutputStream.putNextEntry(new ZipEntry(str));
        byte[] bArr = new byte[1024];
        while (true) {
            int i = fileInputStream.read(bArr);
            if (i < 0) {
                fileInputStream.close();
                return;
            }
            zipOutputStream.write(bArr, 0, i);
        }
    }
}
