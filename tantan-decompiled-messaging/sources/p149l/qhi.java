package p149l;

import android.os.StatFs;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* JADX INFO: loaded from: classes13.dex */
public class qhi {
    /* JADX INFO: renamed from: a */
    public static boolean m174540a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || str3 == null) {
            return false;
        }
        return m174541b(str, "\n\n" + str2 + ":\n" + str3 + "\n\n");
    }

    /* JADX INFO: renamed from: b */
    public static boolean m174541b(String str, String str2) throws Throwable {
        Exception exc;
        Throwable th;
        RandomAccessFile randomAccessFile = null;
        try {
            try {
                RandomAccessFile randomAccessFile2 = new RandomAccessFile(str, "rws");
                try {
                    long j = 0;
                    if (randomAccessFile2.length() > 0) {
                        MappedByteBuffer map = randomAccessFile2.getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, randomAccessFile2.length());
                        long length = randomAccessFile2.length();
                        while (length > 0 && map.get(((int) length) - 1) == 0) {
                            length--;
                        }
                        j = length;
                    }
                    randomAccessFile2.seek(j);
                    randomAccessFile2.write(str2.getBytes("UTF-8"));
                    ryl.m181666a(randomAccessFile2);
                    return true;
                } catch (Exception e) {
                    exc = e;
                    randomAccessFile = randomAccessFile2;
                    vx00.m200472b("FileManager appendText failed -> e = " + exc.getMessage(), new Object[0]);
                    ryl.m181666a(randomAccessFile);
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    randomAccessFile = randomAccessFile2;
                    ryl.m181666a(randomAccessFile);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e2) {
            exc = e2;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m174542c(File file, File file2, String str) {
        vx00.m200471a("prepareLogFile %s", file.getAbsolutePath());
        if (!file2.exists() && !file2.mkdirs()) {
            return null;
        }
        if (!m174543d(file.getAbsolutePath(), new File(file2, str).getAbsolutePath())) {
            return null;
        }
        vx00.m200471a("prepare to zip file %s", file2.getAbsolutePath());
        return file2.getAbsolutePath();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m174543d(String str, String str2) throws Throwable {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(new File(str));
            try {
                fileOutputStream = new FileOutputStream(new File(str2));
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = fileInputStream2.read(bArr);
                        if (i < 0) {
                            fileOutputStream.flush();
                            ryl.m181666a(fileInputStream2);
                            ryl.m181666a(fileOutputStream);
                            return true;
                        }
                        fileOutputStream.write(bArr, 0, i);
                    }
                } catch (FileNotFoundException | IOException unused) {
                    fileInputStream = fileInputStream2;
                    ryl.m181666a(fileInputStream);
                    ryl.m181666a(fileOutputStream);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    ryl.m181666a(fileInputStream);
                    ryl.m181666a(fileOutputStream);
                    throw th;
                }
            } catch (FileNotFoundException unused2) {
                fileOutputStream = null;
            } catch (IOException unused3) {
                fileOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (FileNotFoundException | IOException unused4) {
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m174544e(File file) {
        File[] fileArrListFiles;
        if (!file.exists() || !file.isDirectory() || (fileArrListFiles = file.listFiles()) == null) {
            return false;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isFile()) {
                if (!m174545f(file2)) {
                    return false;
                }
            } else if (file2.isDirectory() && !m174544e(file2)) {
                return false;
            }
        }
        return file.delete();
    }

    /* JADX INFO: renamed from: f */
    public static boolean m174545f(File file) {
        if (file == null || !file.exists()) {
            return false;
        }
        return file.isFile() ? file.delete() : m174544e(file);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m174546g(String str) {
        return m174545f(new File(str));
    }

    /* JADX INFO: renamed from: h */
    public static List<File> m174547h(File file, FilenameFilter filenameFilter) {
        if (!file.exists()) {
            return new ArrayList();
        }
        if (file.isFile()) {
            return Arrays.asList(file);
        }
        if (filenameFilter == null) {
            File[] fileArrListFiles = file.listFiles();
            return fileArrListFiles == null ? new ArrayList() : Arrays.asList(fileArrListFiles);
        }
        File[] fileArrListFiles2 = file.listFiles(filenameFilter);
        return fileArrListFiles2 == null ? new ArrayList() : Arrays.asList(fileArrListFiles2);
    }

    /* JADX INFO: renamed from: i */
    public static long m174548i(File file) {
        long jM174548i = 0;
        if (file != null && file.exists()) {
            if (file.isFile()) {
                return file.length();
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    jM174548i += m174548i(file2);
                }
            }
        }
        return jM174548i;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m174549j(String str, long j) {
        try {
            StatFs statFs = new StatFs(str);
            long availableBlocksLong = statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
            vx00.m200474d("totalSize:" + availableBlocksLong, new Object[0]);
            return availableBlocksLong > j;
        } catch (IllegalArgumentException e) {
            vx00.m200474d("isCanWrite:" + e.getMessage(), new Object[0]);
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m174550k(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        return file.exists() && file.isDirectory();
    }

    /* JADX INFO: renamed from: l */
    public static boolean m174551l(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        File file = new File(str);
        return file.exists() && file.isFile();
    }

    /* JADX INFO: renamed from: m */
    public static boolean m174552m(String str, String str2) {
        try {
            File file = new File(str);
            new File(str2).mkdirs();
            File file2 = new File(str2 + File.separator + file.getName());
            file.renameTo(file2);
            return file2.exists();
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: n */
    public static boolean m174553n(File file, long j) {
        return file.length() >= j;
    }

    /* JADX INFO: renamed from: o */
    public static String m174554o(String str) throws Throwable {
        BufferedInputStream bufferedInputStream;
        Throwable th;
        ByteArrayOutputStream byteArrayOutputStream;
        BufferedInputStream bufferedInputStream2 = null;
        try {
            bufferedInputStream = new BufferedInputStream(new FileInputStream(str));
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i = bufferedInputStream.read(bArr);
                        if (i == -1) {
                            String str2 = new String(byteArrayOutputStream.toByteArray());
                            ryl.m181666a(bufferedInputStream);
                            ryl.m181666a(byteArrayOutputStream);
                            return str2;
                        }
                        byteArrayOutputStream.write(bArr, 0, i);
                    }
                } catch (IOException unused) {
                    bufferedInputStream2 = bufferedInputStream;
                    ryl.m181666a(bufferedInputStream2);
                    ryl.m181666a(byteArrayOutputStream);
                    return "";
                } catch (Throwable th2) {
                    th = th2;
                    ryl.m181666a(bufferedInputStream);
                    ryl.m181666a(byteArrayOutputStream);
                    throw th;
                }
            } catch (IOException unused2) {
                byteArrayOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                byteArrayOutputStream = null;
            }
        } catch (IOException unused3) {
            byteArrayOutputStream = null;
        } catch (Throwable th4) {
            bufferedInputStream = null;
            th = th4;
            byteArrayOutputStream = null;
        }
    }

    /* JADX INFO: renamed from: p */
    public static void m174555p(String str, PrintWriter printWriter) {
        printWriter.print(str);
        printWriter.flush();
    }

    /* JADX INFO: renamed from: q */
    public static boolean m174556q(String str, String str2, String str3) throws Throwable {
        FileWriter fileWriter = null;
        try {
            File file = new File(str2);
            if (!file.exists() && !file.mkdirs()) {
                throw new RuntimeException("Can not create File!");
            }
            FileWriter fileWriter2 = new FileWriter(new File(file, str3));
            try {
                fileWriter2.write(str);
                fileWriter2.flush();
                ryl.m181666a(fileWriter2);
                return true;
            } catch (Throwable th) {
                th = th;
                fileWriter = fileWriter2;
                ryl.m181666a(fileWriter);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: r */
    public static String m174557r(String str) throws Throwable {
        File file = new File(str);
        String strConcat = str.concat(".tmp");
        vx00.m200474d("start zip as tmp :".concat(strConcat), new Object[0]);
        m174559t(str, strConcat);
        m174545f(file);
        File file2 = new File(strConcat);
        File file3 = new File(file2.getParent(), file2.getName().replace(".tmp", "") + ".zip");
        file2.renameTo(file3);
        return file3.getAbsolutePath();
    }

    /* JADX INFO: renamed from: s */
    public static void m174558s(File file, ZipOutputStream zipOutputStream) throws IOException {
        if (zipOutputStream == null) {
            return;
        }
        if (!file.isFile()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles.length <= 0) {
                zipOutputStream.putNextEntry(new ZipEntry(file.getName() + File.separator));
                zipOutputStream.closeEntry();
            }
            for (File file2 : fileArrListFiles) {
                m174558s(file2, zipOutputStream);
            }
            return;
        }
        ZipEntry zipEntry = new ZipEntry(file.getName());
        FileInputStream fileInputStream = new FileInputStream(file);
        zipOutputStream.putNextEntry(zipEntry);
        byte[] bArr = new byte[4096];
        while (true) {
            int i = fileInputStream.read(bArr);
            if (i == -1) {
                zipOutputStream.closeEntry();
                return;
            }
            zipOutputStream.write(bArr, 0, i);
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m174559t(String str, String str2) throws Throwable {
        ZipOutputStream zipOutputStream = null;
        try {
            try {
                ZipOutputStream zipOutputStream2 = new ZipOutputStream(new FileOutputStream(str2));
                try {
                    m174558s(new File(str), zipOutputStream2);
                    zipOutputStream2.finish();
                    zipOutputStream2.close();
                } catch (IOException e) {
                    e = e;
                    m174545f(new File(str2));
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    zipOutputStream = zipOutputStream2;
                    if (zipOutputStream != null) {
                        zipOutputStream.finish();
                        zipOutputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e2) {
            e = e2;
        }
    }
}
