package com.tantanapp.media.ttmediautils.p074io;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes13.dex */
public class ZipUtil {
    private static final String BASE_DIR = "";
    private static final int BUFFER = 1024;
    public static final String EXT = ".zip";
    private static final String PATH = File.separator;

    private static void decompress(File file, ZipInputStream zipInputStream) throws IOException {
        while (true) {
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    zipInputStream.closeEntry();
                    return;
                }
                if (nextEntry.getName().contains("../")) {
                    throw new SecurityException("unsecurity zipfile!");
                }
                File file2 = new File(file.getPath() + File.separator + nextEntry.getName());
                fileProber(file2);
                if (nextEntry.isDirectory()) {
                    file2.mkdirs();
                } else {
                    decompressFile(file2, zipInputStream);
                }
            } catch (Throwable th) {
                if (zipInputStream != null) {
                    zipInputStream.closeEntry();
                }
                throw th;
            }
        }
    }

    private static void decompressFile(File file, ZipInputStream zipInputStream) throws IOException {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i = zipInputStream.read(bArr, 0, 1024);
                if (i == -1) {
                    bufferedOutputStream.close();
                    return;
                }
                bufferedOutputStream.write(bArr, 0, i);
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    bufferedOutputStream.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    private static void fileProber(File file) {
        File parentFile = file.getParentFile();
        if (parentFile.exists()) {
            return;
        }
        fileProber(parentFile);
        parentFile.mkdir();
    }

    public static void decompress(File file) throws IOException {
        decompress(file, file.getParent());
    }

    public static void decompress(File file, File file2) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            decompress(fileInputStream, file2);
            fileInputStream.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public static void decompress(InputStream inputStream, File file) throws IOException {
        CheckedInputStream checkedInputStream = new CheckedInputStream(inputStream, new CRC32());
        try {
            ZipInputStream zipInputStream = new ZipInputStream(checkedInputStream);
            try {
                decompress(file, zipInputStream);
                zipInputStream.close();
                checkedInputStream.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        zipInputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                try {
                    checkedInputStream.close();
                } catch (Throwable th6) {
                    th4.addSuppressed(th6);
                }
                throw th5;
            }
        }
    }

    public static void decompress(File file, String str) throws IOException {
        decompress(file, new File(str));
    }

    public static void decompress(String str, String str2) throws IOException {
        decompress(new File(str), str2);
    }

    public static void decompress(String str) throws IOException {
        decompress(new File(str));
    }
}
