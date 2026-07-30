package p153l;

import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.util.Date;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* JADX INFO: loaded from: classes2.dex */
public class j6r0 {

    /* JADX INFO: renamed from: a */
    public static final String[] f118594a = {"jpg", "png", "bmp", "gif", "webp"};

    /* JADX INFO: renamed from: l.j6r0$a */
    public static class C17889a implements FileFilter {
        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return file.isDirectory();
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m143690a(File file) throws Throwable {
        InputStreamReader inputStreamReader;
        StringWriter stringWriter = new StringWriter();
        InputStreamReader inputStreamReader2 = null;
        try {
            inputStreamReader = new InputStreamReader(new BufferedInputStream(new FileInputStream(file)));
            try {
                try {
                    char[] cArr = new char[2048];
                    while (true) {
                        int i = inputStreamReader.read(cArr);
                        if (i == -1) {
                            String string = stringWriter.toString();
                            m143691b(inputStreamReader);
                            m143691b(stringWriter);
                            return string;
                        }
                        stringWriter.write(cArr, 0, i);
                        th = th;
                        inputStreamReader2 = inputStreamReader;
                        m143691b(inputStreamReader2);
                        m143691b(stringWriter);
                        throw th;
                    }
                } catch (IOException e) {
                    e = e;
                    ouq0.m169406z("read file :" + file.getAbsolutePath() + " failure :" + e.getMessage());
                    m143691b(inputStreamReader);
                    m143691b(stringWriter);
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                inputStreamReader2 = inputStreamReader;
            }
        } catch (IOException e2) {
            e = e2;
            inputStreamReader = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m143691b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m143692c(File file, File file2) throws Throwable {
        ZipOutputStream zipOutputStream = null;
        try {
            try {
                ZipOutputStream zipOutputStream2 = new ZipOutputStream(new FileOutputStream(file, false));
                try {
                    m143694e(zipOutputStream2, file2, null, null);
                    m143691b(zipOutputStream2);
                } catch (FileNotFoundException unused) {
                    zipOutputStream = zipOutputStream2;
                    m143691b(zipOutputStream);
                } catch (IOException e) {
                    e = e;
                    zipOutputStream = zipOutputStream2;
                    ouq0.m169393m("zip file failure + " + e.getMessage());
                    m143691b(zipOutputStream);
                } catch (Throwable th) {
                    th = th;
                    zipOutputStream = zipOutputStream2;
                    m143691b(zipOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (FileNotFoundException unused2) {
        } catch (IOException e2) {
            e = e2;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m143693d(File file, String str) throws Throwable {
        if (!file.exists()) {
            ouq0.m169406z("mkdir " + file.getAbsolutePath());
            file.getParentFile().mkdirs();
        }
        BufferedWriter bufferedWriter = null;
        try {
            try {
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
                try {
                    bufferedWriter2.write(str);
                    m143691b(bufferedWriter2);
                } catch (IOException e) {
                    e = e;
                    bufferedWriter = bufferedWriter2;
                    ouq0.m169406z("write file :" + file.getAbsolutePath() + " failure :" + e.getMessage());
                    m143691b(bufferedWriter);
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    m143691b(bufferedWriter);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e2) {
            e = e2;
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m143694e(ZipOutputStream zipOutputStream, File file, String str, FileFilter fileFilter) throws Throwable {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        FileInputStream fileInputStream = null;
        try {
            try {
                if (file.isDirectory()) {
                    File[] fileArrListFiles = fileFilter != null ? file.listFiles(fileFilter) : file.listFiles();
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    String str3 = File.separator;
                    sb.append(str3);
                    zipOutputStream.putNextEntry(new ZipEntry(sb.toString()));
                    if (!TextUtils.isEmpty(str)) {
                        str2 = str + str3;
                    }
                    for (int i = 0; i < fileArrListFiles.length; i++) {
                        m143694e(zipOutputStream, fileArrListFiles[i], str2 + fileArrListFiles[i].getName(), null);
                    }
                    File[] fileArrListFiles2 = file.listFiles(new C17889a());
                    if (fileArrListFiles2 != null) {
                        for (File file2 : fileArrListFiles2) {
                            m143694e(zipOutputStream, file2, str2 + File.separator + file2.getName(), fileFilter);
                        }
                    }
                } else {
                    if (TextUtils.isEmpty(str)) {
                        zipOutputStream.putNextEntry(new ZipEntry(String.valueOf(new Date().getTime()) + ".txt"));
                    } else {
                        zipOutputStream.putNextEntry(new ZipEntry(str));
                    }
                    FileInputStream fileInputStream2 = new FileInputStream(file);
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int i2 = fileInputStream2.read(bArr);
                            if (i2 == -1) {
                                break;
                            } else {
                                zipOutputStream.write(bArr, 0, i2);
                            }
                        }
                        fileInputStream = fileInputStream2;
                    } catch (IOException e) {
                        e = e;
                        fileInputStream = fileInputStream2;
                        ouq0.m169378B("zipFiction failed with exception:" + e.toString());
                        m143691b(fileInputStream);
                        return;
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        m143691b(fileInputStream);
                        throw th;
                    }
                }
                m143691b(fileInputStream);
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m143695f(File file) {
        try {
            if (file.isDirectory()) {
                return false;
            }
            if (file.exists()) {
                return true;
            }
            File parentFile = file.getParentFile();
            if (parentFile.exists() || parentFile.mkdirs()) {
                return file.createNewFile();
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    public static byte[] m143696g(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            try {
                try {
                    int i = inputStream.read(bArr, 0, 8192);
                    if (i <= 0) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        m143691b(inputStream);
                        m143691b(byteArrayOutputStream);
                        return byteArray;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                } catch (Exception e) {
                    e.printStackTrace();
                    m143691b(inputStream);
                    m143691b(byteArrayOutputStream);
                    return null;
                }
            } catch (Throwable th) {
                m143691b(inputStream);
                m143691b(byteArrayOutputStream);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static byte[] m143697h(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.finish();
            gZIPOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Exception unused) {
            return bArr;
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m143698i(File file, File file2) throws Throwable {
        FileOutputStream fileOutputStream;
        if (file.getAbsolutePath().equals(file2.getAbsolutePath())) {
            return;
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = fileInputStream2.read(bArr);
                        if (i < 0) {
                            fileInputStream2.close();
                            fileOutputStream.close();
                            return;
                        }
                        fileOutputStream.write(bArr, 0, i);
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
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
}
