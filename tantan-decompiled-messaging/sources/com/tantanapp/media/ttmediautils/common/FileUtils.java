package com.tantanapp.media.ttmediautils.common;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import p149l.csg0;
import p149l.hj10;
import p149l.jfd0;
import p149l.kj10;
import p149l.lhi;
import p149l.mll;

/* JADX INFO: loaded from: classes13.dex */
public class FileUtils {
    public static void cleanDirectory(File file) throws IOException {
        if (!file.exists()) {
            lhi.m149843a(file, " does not exist");
            return;
        }
        if (!file.isDirectory()) {
            lhi.m149843a(file, " is not a directory");
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            mll.m155165a("Failed to list contents of ", file);
            return;
        }
        IOException e = null;
        for (File file2 : fileArrListFiles) {
            try {
                forceDelete(file2);
            } catch (IOException e2) {
                e = e2;
            }
        }
        if (e != null) {
            throw e;
        }
    }

    public static void close(Reader reader) {
        if (reader != null) {
            try {
                reader.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    private static void decompress(File file, ZipInputStream zipInputStream) throws Exception {
        while (true) {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry == null) {
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
            zipInputStream.closeEntry();
        }
    }

    private static void decompressFile(File file, ZipInputStream zipInputStream) throws Exception {
        FileOutputStream fileOutputStream;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            try {
                try {
                    BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(fileOutputStream);
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int i = zipInputStream.read(bArr, 0, 1024);
                            if (i == -1) {
                                closeQuietly(bufferedOutputStream2);
                                closeQuietly(fileOutputStream);
                                return;
                            }
                            bufferedOutputStream2.write(bArr, 0, i);
                        }
                    } catch (Exception e) {
                    } catch (Throwable th) {
                        th = th;
                        bufferedOutputStream = bufferedOutputStream2;
                        closeQuietly(bufferedOutputStream);
                        closeQuietly(fileOutputStream);
                        throw th;
                    }
                } catch (Exception e2) {
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e3) {
            fileOutputStream = null;
            throw e3;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    public static void deleteDirectory(File file) throws IOException {
        if (file.exists()) {
            if (!isSymlink(file)) {
                cleanDirectory(file);
            }
            if (file.delete()) {
                return;
            }
            kj10.m146167a("Unable to delete directory ", file, ".");
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

    public static void forceDelete(File file) throws IOException {
        if (file.isDirectory()) {
            deleteDirectory(file);
            return;
        }
        boolean zExists = file.exists();
        if (file.delete()) {
            return;
        }
        if (zExists) {
            hj10.m131352a("Unable to delete file: ", file);
        } else {
            csg0.m108511a("File does not exist: ", file);
        }
    }

    public static boolean isSymlink(File file) throws IOException {
        if (file == null) {
            jfd0.m141176a("File must not be null");
            return false;
        }
        if (file.getParent() != null) {
            file = new File(file.getParentFile().getCanonicalFile(), file.getName());
        }
        return !file.getCanonicalFile().equals(file.getAbsoluteFile());
    }

    public static String readString(File file) throws Throwable {
        if (file == null || !file.exists()) {
            return "";
        }
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file));
                try {
                    StringBuilder sb = new StringBuilder((int) file.length());
                    while (true) {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            String string = sb.toString();
                            close(bufferedReader2);
                            return string;
                        }
                        if (sb.length() != 0) {
                            sb.append('\n');
                        }
                        sb.append(line);
                    }
                } catch (IOException e) {
                    e = e;
                    bufferedReader = bufferedReader2;
                    e.printStackTrace();
                    close(bufferedReader);
                    return "";
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    close(bufferedReader);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e2) {
            e = e2;
        }
    }

    public static void decompress(InputStream inputStream, File file) throws Exception {
        FilterInputStream checkedInputStream;
        ZipInputStream zipInputStream;
        FilterInputStream filterInputStream = null;
        try {
            checkedInputStream = new CheckedInputStream(inputStream, new CRC32());
            try {
                zipInputStream = new ZipInputStream(checkedInputStream);
                try {
                    decompress(file, zipInputStream);
                    closeQuietly(zipInputStream);
                    closeQuietly(checkedInputStream);
                } catch (Exception e) {
                    e = e;
                    filterInputStream = checkedInputStream;
                    try {
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        checkedInputStream = filterInputStream;
                        filterInputStream = zipInputStream;
                        closeQuietly(filterInputStream);
                        closeQuietly(checkedInputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    filterInputStream = zipInputStream;
                    closeQuietly(filterInputStream);
                    closeQuietly(checkedInputStream);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                zipInputStream = null;
            } catch (Throwable th3) {
                th = th3;
                closeQuietly(filterInputStream);
                closeQuietly(checkedInputStream);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            zipInputStream = null;
        } catch (Throwable th4) {
            th = th4;
            checkedInputStream = null;
        }
    }

    public static String readString(String str) {
        return readString(new File(str));
    }

    public static void decompress(File file, File file2) throws Exception {
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(file);
                try {
                    decompress(fileInputStream2, file2);
                    closeQuietly(fileInputStream2);
                } catch (Exception e) {
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    closeQuietly(fileInputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }
}
