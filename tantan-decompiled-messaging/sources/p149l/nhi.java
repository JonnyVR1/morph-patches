package p149l;

import android.text.TextUtils;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/* JADX INFO: loaded from: classes7.dex */
public class nhi {

    /* JADX INFO: renamed from: a */
    public static final String f138983a;

    /* JADX INFO: renamed from: b */
    public static final String f138984b;

    /* JADX INFO: renamed from: c */
    public static final String f138985c;

    /* JADX INFO: renamed from: d */
    public static final String f138986d;

    /* JADX INFO: renamed from: e */
    public static final String f138987e;

    /* JADX INFO: renamed from: f */
    public static final String f138988f;

    /* JADX INFO: renamed from: g */
    public static final String f138989g;

    /* JADX INFO: renamed from: h */
    public static String f138990h;

    /* JADX INFO: renamed from: i */
    public static String f138991i;

    /* JADX INFO: renamed from: j */
    public static String f138992j;

    /* JADX INFO: renamed from: k */
    private static final String[] f138993k;

    /* JADX INFO: renamed from: l.nhi$a */
    public static class C18696a {
        /* JADX INFO: renamed from: a */
        public static void m159407a(Reader reader) {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException unused) {
                }
            }
        }
    }

    static {
        String strM181557b = rxf0.m181557b();
        f138983a = strM181557b;
        String str = strM181557b + "/cvmomo";
        f138984b = str;
        String str2 = strM181557b + "/cvmomo/temp";
        f138985c = str2;
        String str3 = strM181557b + "/cvmomo/log";
        f138986d = str3;
        f138987e = strM181557b + "/cvmomo/avatar";
        f138988f = strM181557b + "/cvmomo/draft";
        String str4 = strM181557b + "/cvmomo/install";
        f138989g = str4;
        f138990h = "UTF-8";
        f138991i = "GBK";
        f138992j = "ISO-8859-1";
        if (!new File(str).exists()) {
            new File(str).mkdirs();
        }
        if (!new File(str2).exists()) {
            new File(str2).mkdirs();
        }
        if (!new File(str4).exists()) {
            new File(str4).mkdirs();
        }
        if (!new File(str3).exists()) {
            new File(str3).mkdirs();
        }
        f138993k = new String[]{"../", "~/"};
    }

    /* JADX INFO: renamed from: a */
    public static void m159401a(File file) {
        if (file != null && file.exists()) {
            if (file.isFile()) {
                file.delete();
                return;
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                return;
            }
            for (File file2 : fileArrListFiles) {
                m159401a(file2);
            }
            file.delete();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m159402b(String str) {
        m159401a(new File(str));
    }

    /* JADX INFO: renamed from: c */
    public static boolean m159403c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }

    /* JADX INFO: renamed from: d */
    public static String m159404d(File file) throws Throwable {
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
                            C18696a.m159407a(bufferedReader2);
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
                    C18696a.m159407a(bufferedReader);
                    return "";
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    C18696a.m159407a(bufferedReader);
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
    public static String m159405e(String str) {
        return m159404d(new File(str));
    }

    /* JADX INFO: renamed from: f */
    public static void m159406f(byte[] bArr, String str) throws Throwable {
        FileOutputStream fileOutputStream;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(new File(str));
            try {
                try {
                    BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(fileOutputStream);
                    try {
                        bufferedOutputStream2.write(bArr);
                        try {
                            bufferedOutputStream2.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    } catch (Exception e2) {
                        e = e2;
                        bufferedOutputStream = bufferedOutputStream2;
                        e.printStackTrace();
                        if (bufferedOutputStream != null) {
                            try {
                                bufferedOutputStream.close();
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                        }
                        if (fileOutputStream == null) {
                            return;
                        }
                    } catch (Throwable th) {
                        th = th;
                        bufferedOutputStream = bufferedOutputStream2;
                        if (bufferedOutputStream != null) {
                            try {
                                bufferedOutputStream.close();
                            } catch (IOException e4) {
                                e4.printStackTrace();
                            }
                        }
                        if (fileOutputStream == null) {
                            throw th;
                        }
                        try {
                            fileOutputStream.close();
                            throw th;
                        } catch (IOException e5) {
                            e5.printStackTrace();
                            throw th;
                        }
                    }
                } catch (Exception e6) {
                    e = e6;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e7) {
            e = e7;
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
        try {
            fileOutputStream.close();
        } catch (IOException e8) {
            e8.printStackTrace();
        }
    }
}
