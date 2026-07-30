package com.immomo.mmutil;

import android.os.Environment;
import androidx.annotation.Nullable;
import com.cosmos.mdlog.MDLog;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import p149l.ev0;
import p149l.qkq0;
import p149l.syl;

/* JADX INFO: loaded from: classes7.dex */
public class FileUtil {

    /* JADX INFO: renamed from: a */
    private static StorageMode f12963a;

    /* JADX INFO: renamed from: b */
    private static final String[] f12964b = {"../", "~/"};

    public enum StorageMode {
        SDCARD,
        SDCARD_INNER,
        INNER
    }

    /* JADX INFO: renamed from: com.immomo.mmutil.FileUtil$a */
    public static /* synthetic */ class C3795a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f12965a;

        static {
            int[] iArr = new int[StorageMode.values().length];
            f12965a = iArr;
            try {
                iArr[StorageMode.SDCARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12965a[StorageMode.SDCARD_INNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12965a[StorageMode.INNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m18404a(File file, File file2) throws Throwable {
        try {
            m18405b(new FileInputStream(file), new FileOutputStream(file2));
        } catch (IOException e) {
            if (file2.exists()) {
                file2.delete();
            }
            throw e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x003d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x003f A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #1 {all -> 0x0042, blocks: (B:27:0x003a, B:29:0x003f), top: B:33:0x003a }] */
    /* JADX WARN: Code duplicated, block: B:33:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static void m18405b(InputStream inputStream, OutputStream outputStream) throws Throwable {
        BufferedOutputStream bufferedOutputStream;
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(inputStream, 4096);
            try {
                bufferedOutputStream = new BufferedOutputStream(outputStream, 4096);
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

    /* JADX INFO: renamed from: c */
    public static void m18406c(File file) {
        if (file == null) {
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    m18406c(file2);
                } else {
                    file2.delete();
                }
            }
        }
        file.delete();
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static File m18407d() {
        if (f12963a == null) {
            qkq0.m175383a("can not access safe external storage before init");
            return null;
        }
        int i = C3795a.f12965a[f12963a.ordinal()];
        if (i == 1) {
            return Environment.getExternalStorageDirectory();
        }
        if (i == 2) {
            return ev0.m118233a().getExternalFilesDir("MOMOCARD");
        }
        File file = new File(ev0.m118233a().getFilesDir(), "MOMOCARD");
        try {
            if (file.exists()) {
                return file;
            }
            file.mkdir();
            return file;
        } catch (Exception e) {
            e.printStackTrace();
            return file;
        }
    }

    /* JADX INFO: renamed from: e */
    public static boolean m18408e(File file) {
        return file != null && file.exists() && file.length() > 0;
    }

    /* JADX INFO: renamed from: f */
    public static File m18409f(String str) {
        File file = new File(str);
        try {
            if (file.exists()) {
                return file;
            }
            file.createNewFile();
            return file;
        } catch (Throwable th) {
            MDLog.printErrStackTrace("momo FileUtil", th);
            return file;
        }
    }

    /* JADX INFO: renamed from: g */
    public static byte[] m18410g(File file) throws Throwable {
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
                            syl.m186709b(fileInputStream2);
                            return bArr2;
                        } catch (IOException e) {
                            e = e;
                            bArr = bArr2;
                            fileInputStream = fileInputStream2;
                            MDLog.printErrStackTrace("momo FileUtil", e);
                            syl.m186709b(fileInputStream);
                            return bArr;
                        } catch (Throwable th) {
                            th = th;
                            fileInputStream = fileInputStream2;
                            syl.m186709b(fileInputStream);
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public static String m18411h(File file) throws Throwable {
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
                                syl.m186708a(bufferedInputStream, byteArrayOutputStream);
                                return str;
                            }
                            byteArrayOutputStream.write(bArr, 0, i);
                        }
                    } catch (IOException e2) {
                        e = e2;
                        MDLog.printErrStackTrace("momo FileUtil", e);
                        throw e;
                    }
                } catch (IOException e3) {
                    e = e3;
                } catch (Throwable th2) {
                    th = th2;
                    file = null;
                    syl.m186708a(bufferedInputStream, file);
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

    /* JADX INFO: renamed from: i */
    public static void m18412i(StorageMode storageMode) {
        f12963a = storageMode;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m18413j(byte[] bArr, File file) throws Throwable {
        if (bArr != null && file != null && !file.isDirectory()) {
            FileOutputStream fileOutputStream = null;
            try {
                if (!file.exists()) {
                    file.createNewFile();
                }
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    fileOutputStream2.write(bArr);
                    syl.m186709b(fileOutputStream2);
                    return true;
                } catch (IOException unused) {
                    fileOutputStream = fileOutputStream2;
                    syl.m186709b(fileOutputStream);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    syl.m186709b(fileOutputStream);
                    throw th;
                }
            } catch (IOException unused2) {
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public static void m18414k(File file, String str) throws Throwable {
        m18415l(file, str, false);
    }

    /* JADX INFO: renamed from: l */
    private static void m18415l(File file, String str, boolean z) throws Throwable {
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, z);
                try {
                    fileOutputStream2.write(str.getBytes(Charset.forName("UTF-8")));
                    syl.m186709b(fileOutputStream2);
                } catch (IOException e) {
                    e = e;
                    fileOutputStream = fileOutputStream2;
                    MDLog.printErrStackTrace("momo FileUtil", e);
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    syl.m186709b(fileOutputStream);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m18416m(File file, String str) throws Throwable {
        m18415l(file, str, true);
    }
}
