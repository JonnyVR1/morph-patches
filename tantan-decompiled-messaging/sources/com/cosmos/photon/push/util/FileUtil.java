package com.cosmos.photon.push.util;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.cosmos.mdlog.MDLog;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.text.NumberFormat;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes.dex */
public class FileUtil {
    private static final char DIRECTORY_SEPARATOR = '/';
    private static final char EXTENSION_SEPARATOR = '.';
    private static final String[] INVALID_ZIP_ENTRY_NAME = {"../", "~/"};
    public static String KEY_UNIQUE_ID = "";
    private static final String Tag = "momo FileUtil";

    /* JADX WARN: Code duplicated, block: B:45:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0060 A[Catch: IOException -> 0x005c, TRY_LEAVE, TryCatch #8 {IOException -> 0x005c, blocks: (B:42:0x0058, B:46:0x0060), top: B:57:0x0058 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0058 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static boolean copyAssets(Context context, String str, File file) throws Throwable {
        FileOutputStream fileOutputStream;
        if (TextUtils.isEmpty(str) || file == null) {
            return false;
        }
        InputStream inputStream = null;
        try {
            InputStream inputStreamOpen = context.getAssets().open(str);
            try {
                fileOutputStream = new FileOutputStream(file);
                try {
                    copyFile(inputStreamOpen, fileOutputStream);
                    if (inputStreamOpen != null) {
                        try {
                            inputStreamOpen.close();
                        } catch (IOException e) {
                            MDLog.printErrStackTrace(Tag, e);
                        }
                    }
                    fileOutputStream.close();
                    return true;
                } catch (IOException e2) {
                    e = e2;
                    inputStream = inputStreamOpen;
                    try {
                        MDLog.printErrStackTrace(Tag, e);
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e3) {
                                MDLog.printErrStackTrace(Tag, e3);
                                return false;
                            }
                        }
                        if (fileOutputStream == null) {
                            return false;
                        }
                        fileOutputStream.close();
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                            } catch (IOException e4) {
                                MDLog.printErrStackTrace(Tag, e4);
                                throw th;
                            }
                        } else if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = inputStreamOpen;
                    if (inputStream != null) {
                        inputStream.close();
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                    } else if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    throw th;
                }
            } catch (IOException e5) {
                e = e5;
                fileOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        } catch (IOException e6) {
            e = e6;
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0052 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0054 A[Catch: all -> 0x0057, TRY_LEAVE, TryCatch #5 {all -> 0x0057, blocks: (B:31:0x004f, B:33:0x0054), top: B:39:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:39:0x004f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static void copyFile(File file, File file2) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file), 4096);
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2), 4096);
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i = bufferedInputStream2.read(bArr);
                        if (i == -1) {
                            bufferedOutputStream.flush();
                            try {
                                bufferedInputStream2.close();
                                bufferedOutputStream.close();
                                return;
                            } catch (Throwable unused) {
                                return;
                            }
                        }
                        bufferedOutputStream.write(bArr, 0, i);
                    }
                } catch (IOException e) {
                    e = e;
                    bufferedInputStream = bufferedInputStream2;
                    try {
                        if (file2.exists()) {
                            file2.delete();
                        }
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        if (bufferedInputStream != null) {
                            try {
                                bufferedInputStream.close();
                                if (bufferedOutputStream != null) {
                                    bufferedOutputStream.close();
                                }
                            } catch (Throwable unused2) {
                                throw th;
                            }
                        } else if (bufferedOutputStream != null) {
                            bufferedOutputStream.close();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedInputStream = bufferedInputStream2;
                    if (bufferedInputStream != null) {
                        bufferedInputStream.close();
                        if (bufferedOutputStream != null) {
                            bufferedOutputStream.close();
                        }
                    } else if (bufferedOutputStream != null) {
                        bufferedOutputStream.close();
                    }
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                bufferedOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                bufferedOutputStream = null;
            }
        } catch (IOException e3) {
            e = e3;
            bufferedOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            bufferedOutputStream = null;
        }
    }

    public static void deleteDir(File file) {
        if (file == null) {
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    deleteDir(file2);
                } else {
                    file2.delete();
                }
            }
        }
        file.delete();
    }

    public static boolean deleteFile(File file) {
        return file != null && file.delete();
    }

    public static String formartFileSize(long j) {
        long j2 = j / 1024;
        double d = j2 / 1024.0f;
        if (d <= 1.0d) {
            return j2 + "K";
        }
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        numberInstance.setMaximumFractionDigits(2);
        return numberInstance.format(d) + "M";
    }

    public static int indexOfExtension(String str) {
        if (str == null) {
            return -1;
        }
        int iLastIndexOf = str.lastIndexOf(46);
        if (str.lastIndexOf(47) <= iLastIndexOf) {
            return iLastIndexOf;
        }
        MDLog.m7399w(Tag, "A directory separator appears after the file extension, assuming there is no file extension");
        return -1;
    }

    public static boolean isUserFileValid() {
        return !TextUtils.isEmpty(KEY_UNIQUE_ID);
    }

    public static boolean isValidFile(File file) {
        return file != null && file.exists() && file.length() > 0;
    }

    public static File newFile(String str) {
        File file = new File(str);
        try {
            if (file.exists()) {
                return file;
            }
            file.createNewFile();
            return file;
        } catch (Throwable th) {
            MDLog.printErrStackTrace(Tag, th);
            return file;
        }
    }

    public static byte[] readBytes(File file) throws Throwable {
        byte[] bArr;
        FileInputStream fileInputStream = null;
        byte[] bArr2 = null;
        fileInputStream = null;
        if (file != null) {
            try {
                if (file.exists()) {
                    try {
                        FileInputStream fileInputStream2 = new FileInputStream(file);
                        try {
                            bArr2 = new byte[fileInputStream2.available()];
                            fileInputStream2.read(bArr2);
                            IOUtils.closeQuietly(fileInputStream2);
                            return bArr2;
                        } catch (IOException e) {
                            e = e;
                            bArr = bArr2;
                            fileInputStream = fileInputStream2;
                            MDLog.printErrStackTrace(Tag, e);
                            IOUtils.closeQuietly(fileInputStream);
                            return bArr;
                        } catch (Throwable th) {
                            th = th;
                            fileInputStream = fileInputStream2;
                            IOUtils.closeQuietly(fileInputStream);
                            throw th;
                        }
                    } catch (IOException e2) {
                        e = e2;
                        bArr = null;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return null;
    }

    public static Object readObjectFromFile(File file) throws Throwable {
        ObjectInputStream objectInputStream;
        ObjectInputStream objectInputStream2 = null;
        try {
            objectInputStream = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
            try {
                try {
                    Object object = objectInputStream.readObject();
                    IOUtils.closeQuietly(objectInputStream);
                    return object;
                } catch (Exception e) {
                    e = e;
                    MDLog.printErrStackTrace(Tag, e);
                    IOUtils.closeQuietly(objectInputStream);
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                objectInputStream2 = objectInputStream;
                IOUtils.closeQuietly(objectInputStream2);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            objectInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            IOUtils.closeQuietly(objectInputStream2);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String readStr(File file) throws Throwable {
        BufferedInputStream bufferedInputStream;
        Throwable th;
        IOException e;
        if (!file.exists()) {
            return "";
        }
        try {
            try {
                bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int i = bufferedInputStream.read(bArr);
                            if (i == -1) {
                                String str = new String(byteArrayOutputStream.toByteArray());
                                IOUtils.closeAllQuietly(bufferedInputStream, byteArrayOutputStream);
                                return str;
                            }
                            byteArrayOutputStream.write(bArr, 0, i);
                        }
                    } catch (IOException e2) {
                        e = e2;
                        MDLog.printErrStackTrace(Tag, e);
                        throw e;
                    }
                } catch (IOException e3) {
                    e = e3;
                } catch (Throwable th2) {
                    th = th2;
                    file = null;
                    IOUtils.closeAllQuietly(bufferedInputStream, file);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e4) {
            e = e4;
        } catch (Throwable th4) {
            bufferedInputStream = null;
            th = th4;
            file = null;
        }
    }

    public static String removeExtension(String str) {
        if (str == null) {
            return null;
        }
        int iIndexOfExtension = indexOfExtension(str);
        return iIndexOfExtension == -1 ? str : str.substring(0, iIndexOfExtension);
    }

    public static void renameTo(File file, File file2) throws Throwable {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
                try {
                    byte[] bArr = new byte[2048];
                    while (true) {
                        int i = fileInputStream2.read(bArr);
                        if (i == -1) {
                            file.delete();
                            IOUtils.closeAllQuietly(fileInputStream2, fileOutputStream);
                            return;
                        }
                        fileOutputStream.write(bArr, 0, i);
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    IOUtils.closeAllQuietly(fileInputStream, fileOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    public static boolean renameToSimple(File file, File file2) throws IOException {
        return (file == null || file2 == null || !file.renameTo(file2)) ? false : true;
    }

    public static void resetCurrentUser() {
        KEY_UNIQUE_ID = "";
    }

    public static void setUniqueIDKey(String str) {
        KEY_UNIQUE_ID = str;
    }

    public static boolean unzip(String str, String str2, boolean z) {
        try {
            unzipWithExeption(str, str2, z);
            return true;
        } catch (Exception e) {
            MDLog.printErrStackTrace(Tag, e);
            return false;
        }
    }

    public static void unzipWithExeption(String str, String str2, boolean z) throws Exception {
        ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(str)));
        BufferedOutputStream bufferedOutputStream = null;
        while (true) {
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    zipInputStream.close();
                    return;
                }
                byte[] bArr = new byte[4096];
                String name = nextEntry.getName();
                if (!validEntry(name)) {
                    throw new IllegalArgumentException("unsecurity zipfile!");
                }
                File file = new File(str2, name);
                if (!nextEntry.isDirectory()) {
                    File file2 = new File(file.getParent());
                    if (!file2.exists()) {
                        file2.mkdirs();
                    }
                    if (z) {
                        File file3 = new File(file2, ".nomedia");
                        if (!file3.exists()) {
                            file3.createNewFile();
                        }
                    }
                    try {
                        BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(new FileOutputStream(file), 4096);
                        while (true) {
                            try {
                                int i = zipInputStream.read(bArr, 0, 4096);
                                if (i == -1) {
                                    break;
                                } else {
                                    bufferedOutputStream2.write(bArr, 0, i);
                                }
                            } catch (Throwable th) {
                                th = th;
                                bufferedOutputStream = bufferedOutputStream2;
                                bufferedOutputStream.close();
                                throw th;
                            }
                        }
                        bufferedOutputStream2.flush();
                        bufferedOutputStream2.close();
                        bufferedOutputStream = bufferedOutputStream2;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else if (!file.exists()) {
                    file.mkdirs();
                }
            } catch (Throwable th3) {
                zipInputStream.close();
                throw th3;
            }
        }
    }

    public static boolean validEntry(@NonNull String str) {
        int length = INVALID_ZIP_ENTRY_NAME.length;
        for (int i = 0; i < length; i++) {
            if (str.contains(INVALID_ZIP_ENTRY_NAME[i])) {
                return false;
            }
        }
        return true;
    }

    public static boolean writeBytes(byte[] bArr, File file) throws Throwable {
        if (bArr != null && file != null && !file.isDirectory()) {
            FileOutputStream fileOutputStream = null;
            try {
                if (!file.exists()) {
                    file.createNewFile();
                }
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    fileOutputStream2.write(bArr);
                    IOUtils.closeQuietly(fileOutputStream2);
                    return true;
                } catch (IOException unused) {
                    fileOutputStream = fileOutputStream2;
                    IOUtils.closeQuietly(fileOutputStream);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    IOUtils.closeQuietly(fileOutputStream);
                    throw th;
                }
            } catch (IOException unused2) {
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return false;
    }

    public static void writeObjectToFile(File file, Serializable serializable) throws Throwable {
        if (!file.exists()) {
            return;
        }
        ObjectOutputStream objectOutputStream = null;
        try {
            try {
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
                try {
                    objectOutputStream2.writeObject(serializable);
                    IOUtils.closeQuietly(objectOutputStream2);
                } catch (IOException e) {
                    e = e;
                    objectOutputStream = objectOutputStream2;
                    MDLog.printErrStackTrace(Tag, e);
                    IOUtils.closeQuietly(objectOutputStream);
                } catch (Throwable th) {
                    th = th;
                    objectOutputStream = objectOutputStream2;
                    IOUtils.closeQuietly(objectOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e2) {
            e = e2;
        }
    }

    private static void writeStr(File file, String str, boolean z) throws Throwable {
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, z);
                try {
                    fileOutputStream2.write(str.getBytes(Charset.forName("UTF-8")));
                    IOUtils.closeQuietly(fileOutputStream2);
                } catch (IOException e) {
                    e = e;
                    fileOutputStream = fileOutputStream2;
                    MDLog.printErrStackTrace(Tag, e);
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    IOUtils.closeQuietly(fileOutputStream);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void writeStrAppend(String str, String str2) throws Throwable {
        writeStr(str, str2, true);
    }

    public static boolean writeStream(InputStream inputStream, File file) throws Throwable {
        if (inputStream != null && file != null) {
            FileOutputStream fileOutputStream = null;
            try {
                if (!file.exists()) {
                    file.createNewFile();
                }
                byte[] bArr = new byte[2048];
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                while (true) {
                    try {
                        int i = inputStream.read(bArr);
                        if (i == -1) {
                            IOUtils.closeAllQuietly(inputStream, fileOutputStream2);
                            return true;
                        }
                        fileOutputStream2.write(bArr, 0, i);
                    } catch (IOException unused) {
                        fileOutputStream = fileOutputStream2;
                        IOUtils.closeAllQuietly(inputStream, fileOutputStream);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        IOUtils.closeAllQuietly(inputStream, fileOutputStream);
                        throw th;
                    }
                }
            } catch (IOException unused2) {
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return false;
    }

    public static void writeStrAppend(File file, String str) throws Throwable {
        writeStr(file, str, true);
    }

    public static boolean unzip(String str, String str2) {
        return unzip(str, str2, false);
    }

    public static File newFile(File file, String str) {
        File file2 = new File(file, str);
        try {
            if (file2.exists()) {
                return file2;
            }
            file2.createNewFile();
            return file2;
        } catch (IOException e) {
            MDLog.printErrStackTrace(Tag, e);
            return file2;
        }
    }

    public static void writeStr(File file, String str) throws Throwable {
        writeStr(file, str, false);
    }

    public static void writeStr(String str, String str2) throws Throwable {
        writeStr(str, str2, false);
    }

    private static void writeStr(String str, String str2, boolean z) throws Throwable {
        File fileNewFile = newFile(str);
        if (fileNewFile.exists()) {
            writeStr(fileNewFile, str2, z);
        } else {
            MDLog.printErrStackTrace(Tag, new Exception("File doesn't exist!"));
        }
    }

    private static void copyFile(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[1024];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i);
            }
        }
    }

    public static String readStr(String str) throws IOException {
        return readStr(newFile(str));
    }

    public static void unzipWithExeption(String str, String str2) throws Exception {
        unzipWithExeption(str, str2, false);
    }
}
