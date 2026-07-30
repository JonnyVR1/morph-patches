package p149l;

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
public class dxq0 {

    /* JADX INFO: renamed from: a */
    public static final String[] f88316a = {"jpg", "png", "bmp", "gif", "webp"};

    /* JADX INFO: renamed from: l.dxq0$a */
    public static class C16498a implements FileFilter {
        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return file.isDirectory();
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m114017a(File file) throws Throwable {
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
                            m114018b(inputStreamReader);
                            m114018b(stringWriter);
                            return string;
                        }
                        stringWriter.write(cArr, 0, i);
                        th = th;
                        inputStreamReader2 = inputStreamReader;
                        m114018b(inputStreamReader2);
                        m114018b(stringWriter);
                        throw th;
                    }
                } catch (IOException e) {
                    e = e;
                    ilq0.m137053z("read file :" + file.getAbsolutePath() + " failure :" + e.getMessage());
                    m114018b(inputStreamReader);
                    m114018b(stringWriter);
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
    public static void m114018b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m114019c(File file, File file2) throws Throwable {
        ZipOutputStream zipOutputStream = null;
        try {
            try {
                ZipOutputStream zipOutputStream2 = new ZipOutputStream(new FileOutputStream(file, false));
                try {
                    m114021e(zipOutputStream2, file2, null, null);
                    m114018b(zipOutputStream2);
                } catch (FileNotFoundException unused) {
                    zipOutputStream = zipOutputStream2;
                    m114018b(zipOutputStream);
                } catch (IOException e) {
                    e = e;
                    zipOutputStream = zipOutputStream2;
                    ilq0.m137040m("zip file failure + " + e.getMessage());
                    m114018b(zipOutputStream);
                } catch (Throwable th) {
                    th = th;
                    zipOutputStream = zipOutputStream2;
                    m114018b(zipOutputStream);
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
    public static void m114020d(File file, String str) throws Throwable {
        if (!file.exists()) {
            ilq0.m137053z("mkdir " + file.getAbsolutePath());
            file.getParentFile().mkdirs();
        }
        BufferedWriter bufferedWriter = null;
        try {
            try {
                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
                try {
                    bufferedWriter2.write(str);
                    m114018b(bufferedWriter2);
                } catch (IOException e) {
                    e = e;
                    bufferedWriter = bufferedWriter2;
                    ilq0.m137053z("write file :" + file.getAbsolutePath() + " failure :" + e.getMessage());
                    m114018b(bufferedWriter);
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = bufferedWriter2;
                    m114018b(bufferedWriter);
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
    public static void m114021e(ZipOutputStream zipOutputStream, File file, String str, FileFilter fileFilter) throws Throwable {
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
                        m114021e(zipOutputStream, fileArrListFiles[i], str2 + fileArrListFiles[i].getName(), null);
                    }
                    File[] fileArrListFiles2 = file.listFiles(new C16498a());
                    if (fileArrListFiles2 != null) {
                        for (File file2 : fileArrListFiles2) {
                            m114021e(zipOutputStream, file2, str2 + File.separator + file2.getName(), fileFilter);
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
                        ilq0.m137025B("zipFiction failed with exception:" + e.toString());
                        m114018b(fileInputStream);
                        return;
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        m114018b(fileInputStream);
                        throw th;
                    }
                }
                m114018b(fileInputStream);
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m114022f(File file) {
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
    public static byte[] m114023g(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            try {
                try {
                    int i = inputStream.read(bArr, 0, 8192);
                    if (i <= 0) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        m114018b(inputStream);
                        m114018b(byteArrayOutputStream);
                        return byteArray;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                } catch (Exception e) {
                    e.printStackTrace();
                    m114018b(inputStream);
                    m114018b(byteArrayOutputStream);
                    return null;
                }
            } catch (Throwable th) {
                m114018b(inputStream);
                m114018b(byteArrayOutputStream);
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static byte[] m114024h(byte[] bArr) {
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
    public static void m114025i(File file, File file2) throws Throwable {
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
