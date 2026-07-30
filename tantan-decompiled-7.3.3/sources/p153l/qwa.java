package p153l;

import androidx.annotation.NonNull;
import com.cosmos.mdlog.MDLog;
import com.tantanapp.common.utils.CrashHelper;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class qwa {

    /* JADX INFO: renamed from: a */
    public static final String f159874a = System.getProperty("line.separator");

    /* JADX INFO: renamed from: b */
    public static final String[] f159875b = {"../", "~/"};

    /* JADX INFO: renamed from: c */
    public static final char[] f159876c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: a */
    public static boolean m178450a(File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return file.isFile() && file.delete();
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static File m178451b(String str) {
        if (m178456g(str)) {
            return null;
        }
        return new File(str);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m178452c(File file) {
        return file != null && file.exists() && file.isDirectory();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m178453d(File file) {
        return file != null && file.exists() && file.isFile();
    }

    /* JADX INFO: renamed from: e */
    public static boolean m178454e(String str) {
        return m178453d(m178451b(str));
    }

    /* JADX INFO: renamed from: f */
    public static boolean m178455f(File file) {
        return file != null && file.exists();
    }

    /* JADX INFO: renamed from: g */
    public static boolean m178456g(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public static String m178457h(File file) throws Throwable {
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
                            break;
                        }
                        if (sb.length() != 0) {
                            sb.append('\n');
                        }
                        sb.append(line);
                    }
                    String string = sb.toString();
                    try {
                        bufferedReader2.close();
                    } catch (IOException unused) {
                    }
                    return string;
                } catch (IOException e) {
                    e = e;
                    bufferedReader = bufferedReader2;
                    CrashHelper.m82479c(e);
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return "";
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException unused3) {
                        }
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

    /* JADX INFO: renamed from: i */
    public static boolean m178458i(String str, String str2) {
        try {
            m178459j(str, str2);
            return true;
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            MDLog.printErrStackTrace("haniSDK unzip", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m178459j(String str, String str2) throws Exception {
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
                if (!m178460k(name)) {
                    throw new IllegalArgumentException("unSecurity zipfile!");
                }
                File file = new File(str2, name);
                if (!nextEntry.isDirectory()) {
                    File file2 = new File(file.getParent());
                    if (!file2.exists()) {
                        file2.mkdirs();
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
                                if (bufferedOutputStream != null) {
                                    bufferedOutputStream.close();
                                }
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

    /* JADX INFO: renamed from: k */
    public static boolean m178460k(@NonNull String str) {
        for (String str2 : f159875b) {
            if (str.contains(str2)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public static void m178461l(File file, String str) throws Throwable {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(str.getBytes(Charset.forName("UTF-8")));
                fileOutputStream2.flush();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused) {
                }
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
