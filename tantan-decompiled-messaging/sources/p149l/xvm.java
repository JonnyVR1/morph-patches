package p149l;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.UUID;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p131ec.Tnaf;

/* JADX INFO: loaded from: classes7.dex */
public class xvm {

    /* JADX INFO: renamed from: a */
    private static final String f194650a = sgw.m184137a(new byte[]{121, 40, 98, 99, HttpTokens.SPACE, 42, 124, 39, 101, 126, 46, 40, 111, 47, 117});

    /* JADX INFO: renamed from: b */
    private static final String f194651b = sgw.m184137a(new byte[]{121, 40, 98, 99, HttpTokens.SPACE, 42, 124, 39, 101, 126, 46, 40, 111, 50, 120, 122, 36});

    /* JADX INFO: renamed from: c */
    private static String f194652c = null;

    /* JADX INFO: renamed from: d */
    private static String f194653d = null;

    /* JADX INFO: renamed from: e */
    public static String f194654e = null;

    /* JADX INFO: renamed from: a */
    public static synchronized Long m211296a(Context context) {
        long j = -1L;
        synchronized (xvm.class) {
            try {
                f194654e = null;
                if (TextUtils.isEmpty(f194653d)) {
                    String str = f194651b;
                    String strM211298c = m211298c(str);
                    f194653d = strM211298c;
                    if (TextUtils.isEmpty(strM211298c)) {
                        String strM211299d = m211299d(str);
                        f194653d = strM211299d;
                        if (TextUtils.isEmpty(strM211299d)) {
                            String string = Long.toString(System.currentTimeMillis());
                            f194653d = string;
                            m211301f(str, string);
                            m211300e(str, f194653d);
                        }
                    }
                }
                if (TextUtils.isEmpty(f194653d)) {
                    return j;
                }
                try {
                    return Long.valueOf(Long.parseLong(f194653d));
                } catch (NumberFormatException unused) {
                    return j;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static synchronized String m211297b(Context context) {
        try {
            f194654e = null;
            if (TextUtils.isEmpty(f194652c)) {
                String str = f194650a;
                String strM211298c = m211298c(str);
                f194652c = strM211298c;
                if (TextUtils.isEmpty(strM211298c)) {
                    String strM211299d = m211299d(str);
                    f194652c = strM211299d;
                    if (TextUtils.isEmpty(strM211299d)) {
                        String string = UUID.randomUUID().toString();
                        f194652c = string;
                        m211301f(str, string);
                        m211300e(str, f194652c);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return f194652c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.BufferedReader] */
    /* JADX INFO: renamed from: c */
    private static String m211298c(String str) throws Throwable {
        BufferedReader bufferedReader;
        File file = new File(ygw.m214775a().getFilesDir(), str);
        ?? Exists = file.exists();
        ?? r2 = 0;
        try {
            if (Exists == 0) {
                f194654e = String.format(sgw.m184137a(new byte[]{118, 7, 88, 91, 4, 2, Tnaf.POW_2_WIDTH, 18, 94, 23, 19, 3, 81, 2, 119, 69, 14, 11, 121, 8, 69, 82, 19, 8, 81, 10, 98, 67, 14, 20, 81, 1, 84, 23, 68, 21, 28, 70, 84, 69, 19, 9, 66, 92, 17, 81, 8, 10, 85, 70, 95, 88, 21, 70, 85, 30, 88, 68, 21, 21, 30}), str);
                return null;
            }
            try {
                bufferedReader = new BufferedReader(new FileReader(file));
                try {
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb.append(line);
                    }
                    String string = sb.toString();
                    try {
                        bufferedReader.close();
                    } catch (IOException unused) {
                    }
                    return string;
                } catch (IOException e) {
                    e = e;
                    f194654e = String.format(sgw.m184137a(new byte[]{118, 7, 88, 91, 4, 2, Tnaf.POW_2_WIDTH, 18, 94, 23, 19, 3, 81, 2, 119, 69, 14, 11, 121, 8, 69, 82, 19, 8, 81, 10, 98, 67, 14, 20, 81, 1, 84, 23, 68, 21, 28, 70, 84, 69, 19, 9, 66, 92, 17, 18, 18, 72}), str, e.getMessage());
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException unused2) {
                        }
                    }
                    return null;
                }
            } catch (IOException e2) {
                e = e2;
                bufferedReader = null;
            } catch (Throwable th) {
                th = th;
                if (r2 != 0) {
                    try {
                        r2.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            r2 = Exists;
        }
    }

    /* JADX INFO: renamed from: d */
    private static String m211299d(String str) {
        try {
            return ygw.m214775a().getSharedPreferences(sgw.m184137a(new byte[]{99, 37, 94, 89, 7, 15, 87}), 0).getString(str, null);
        } catch (Exception e) {
            f194654e = String.format(sgw.m184137a(new byte[]{118, 7, 88, 91, 4, 2, Tnaf.POW_2_WIDTH, 18, 94, 23, 19, 3, 81, 2, 119, 69, 14, 11, 99, 14, 80, 69, 4, 2, 96, 20, 84, 81, 4, 20, 85, 8, 82, 82, 18, 70, 21, 21, 29, 23, 4, 20, 66, 9, 67, HttpTokens.CARRIAGE_RETURN, 65, 67, 67, 72}), str, e.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    private static void m211300e(String str, String str2) {
        try {
            SharedPreferences.Editor editorEdit = ygw.m214775a().getSharedPreferences(sgw.m184137a(new byte[]{99, 37, 94, 89, 7, 15, 87}), 0).edit();
            editorEdit.putString(str, str2);
            editorEdit.apply();
        } catch (Exception e) {
            f194654e = String.format(sgw.m184137a(new byte[]{118, 7, 88, 91, 4, 2, Tnaf.POW_2_WIDTH, 18, 94, 23, 18, 7, 70, 3, 101, 88, 50, 14, 81, 20, 84, 83, 49, 20, 85, 0, 84, 69, 4, 8, 83, 3, 66, 23, 68, 21, 28, 70, 84, 69, 19, 9, 66, 92, 17, 18, 18, 72}), str, e.getMessage());
        }
    }

    /* JADX INFO: renamed from: f */
    private static void m211301f(String str, String str2) {
        try {
            FileOutputStream fileOutputStreamOpenFileOutput = ygw.m214775a().openFileOutput(str, 0);
            fileOutputStreamOpenFileOutput.write(str2.getBytes());
            fileOutputStreamOpenFileOutput.close();
        } catch (IOException e) {
            f194654e = String.format(sgw.m184137a(new byte[]{118, 7, 88, 91, 4, 2, Tnaf.POW_2_WIDTH, 18, 94, 23, 22, 20, 89, 18, 84, 99, 14, 47, 94, 18, 84, 69, 15, 7, 92, 53, 69, 88, 19, 7, 87, 3, 17, 18, 18, 74, Tnaf.POW_2_WIDTH, 3, 67, 69, 14, 20, 10, 70, 20, 68, 79}), str, e.getMessage());
        }
    }
}
