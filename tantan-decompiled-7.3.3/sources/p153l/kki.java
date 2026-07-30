package p153l;

import android.text.TextUtils;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/* JADX INFO: loaded from: classes7.dex */
public class kki {

    /* JADX INFO: renamed from: a */
    public static final String f127198a;

    /* JADX INFO: renamed from: b */
    public static final String f127199b;

    /* JADX INFO: renamed from: c */
    public static final String f127200c;

    /* JADX INFO: renamed from: d */
    public static final String f127201d;

    /* JADX INFO: renamed from: e */
    public static final String f127202e;

    /* JADX INFO: renamed from: f */
    public static final String f127203f;

    /* JADX INFO: renamed from: g */
    public static final String f127204g;

    /* JADX INFO: renamed from: h */
    public static String f127205h;

    /* JADX INFO: renamed from: i */
    public static String f127206i;

    /* JADX INFO: renamed from: j */
    public static String f127207j;

    /* JADX INFO: renamed from: k */
    private static final String[] f127208k;

    /* JADX INFO: renamed from: l.kki$a */
    public static class C18178a {
        /* JADX INFO: renamed from: a */
        public static void m150104a(Reader reader) {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException unused) {
                }
            }
        }
    }

    static {
        String strM218660b = z5g0.m218660b();
        f127198a = strM218660b;
        String str = strM218660b + "/cvmomo";
        f127199b = str;
        String str2 = strM218660b + "/cvmomo/temp";
        f127200c = str2;
        String str3 = strM218660b + "/cvmomo/log";
        f127201d = str3;
        f127202e = strM218660b + "/cvmomo/avatar";
        f127203f = strM218660b + "/cvmomo/draft";
        String str4 = strM218660b + "/cvmomo/install";
        f127204g = str4;
        f127205h = "UTF-8";
        f127206i = "GBK";
        f127207j = "ISO-8859-1";
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
        f127208k = new String[]{"../", "~/"};
    }

    /* JADX INFO: renamed from: a */
    public static void m150098a(File file) {
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
                m150098a(file2);
            }
            file.delete();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m150099b(String str) {
        m150098a(new File(str));
    }

    /* JADX INFO: renamed from: c */
    public static boolean m150100c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }

    /* JADX INFO: renamed from: d */
    public static String m150101d(File file) throws Throwable {
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
                            C18178a.m150104a(bufferedReader2);
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
                    C18178a.m150104a(bufferedReader);
                    return "";
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    C18178a.m150104a(bufferedReader);
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
    public static String m150102e(String str) {
        return m150101d(new File(str));
    }

    /* JADX INFO: renamed from: f */
    public static void m150103f(byte[] bArr, String str) throws Throwable {
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
