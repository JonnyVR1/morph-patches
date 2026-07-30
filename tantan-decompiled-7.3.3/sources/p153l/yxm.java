package p153l;

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
import org.spongycastle.math.p135ec.Tnaf;

/* JADX INFO: loaded from: classes7.dex */
public class yxm {

    /* JADX INFO: renamed from: a */
    private static final String f201989a = riw.m181611a(new byte[]{121, 40, 98, 99, HttpTokens.SPACE, 42, 124, 39, 101, 126, 46, 40, 111, 47, 117});

    /* JADX INFO: renamed from: b */
    private static final String f201990b = riw.m181611a(new byte[]{121, 40, 98, 99, HttpTokens.SPACE, 42, 124, 39, 101, 126, 46, 40, 111, 50, 120, 122, 36});

    /* JADX INFO: renamed from: c */
    private static String f201991c = null;

    /* JADX INFO: renamed from: d */
    private static String f201992d = null;

    /* JADX INFO: renamed from: e */
    public static String f201993e = null;

    /* JADX INFO: renamed from: a */
    public static synchronized Long m217729a(Context context) {
        long j = -1L;
        synchronized (yxm.class) {
            try {
                f201993e = null;
                if (TextUtils.isEmpty(f201992d)) {
                    String str = f201990b;
                    String strM217731c = m217731c(str);
                    f201992d = strM217731c;
                    if (TextUtils.isEmpty(strM217731c)) {
                        String strM217732d = m217732d(str);
                        f201992d = strM217732d;
                        if (TextUtils.isEmpty(strM217732d)) {
                            String string = Long.toString(System.currentTimeMillis());
                            f201992d = string;
                            m217734f(str, string);
                            m217733e(str, f201992d);
                        }
                    }
                }
                if (TextUtils.isEmpty(f201992d)) {
                    return j;
                }
                try {
                    return Long.valueOf(Long.parseLong(f201992d));
                } catch (NumberFormatException unused) {
                    return j;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static synchronized String m217730b(Context context) {
        try {
            f201993e = null;
            if (TextUtils.isEmpty(f201991c)) {
                String str = f201989a;
                String strM217731c = m217731c(str);
                f201991c = strM217731c;
                if (TextUtils.isEmpty(strM217731c)) {
                    String strM217732d = m217732d(str);
                    f201991c = strM217732d;
                    if (TextUtils.isEmpty(strM217732d)) {
                        String string = UUID.randomUUID().toString();
                        f201991c = string;
                        m217734f(str, string);
                        m217733e(str, f201991c);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return f201991c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.BufferedReader] */
    /* JADX INFO: renamed from: c */
    private static String m217731c(String str) throws Throwable {
        BufferedReader bufferedReader;
        File file = new File(xiw.m211170a().getFilesDir(), str);
        ?? Exists = file.exists();
        ?? r2 = 0;
        try {
            if (Exists == 0) {
                f201993e = String.format(riw.m181611a(new byte[]{118, 7, 88, 91, 4, 2, Tnaf.POW_2_WIDTH, 18, 94, 23, 19, 3, 81, 2, 119, 69, 14, 11, 121, 8, 69, 82, 19, 8, 81, 10, 98, 67, 14, 20, 81, 1, 84, 23, 68, 21, 28, 70, 84, 69, 19, 9, 66, 92, 17, 81, 8, 10, 85, 70, 95, 88, 21, 70, 85, 30, 88, 68, 21, 21, 30}), str);
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
                    f201993e = String.format(riw.m181611a(new byte[]{118, 7, 88, 91, 4, 2, Tnaf.POW_2_WIDTH, 18, 94, 23, 19, 3, 81, 2, 119, 69, 14, 11, 121, 8, 69, 82, 19, 8, 81, 10, 98, 67, 14, 20, 81, 1, 84, 23, 68, 21, 28, 70, 84, 69, 19, 9, 66, 92, 17, 18, 18, 72}), str, e.getMessage());
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
    private static String m217732d(String str) {
        try {
            return xiw.m211170a().getSharedPreferences(riw.m181611a(new byte[]{99, 37, 94, 89, 7, 15, 87}), 0).getString(str, null);
        } catch (Exception e) {
            f201993e = String.format(riw.m181611a(new byte[]{118, 7, 88, 91, 4, 2, Tnaf.POW_2_WIDTH, 18, 94, 23, 19, 3, 81, 2, 119, 69, 14, 11, 99, 14, 80, 69, 4, 2, 96, 20, 84, 81, 4, 20, 85, 8, 82, 82, 18, 70, 21, 21, 29, 23, 4, 20, 66, 9, 67, HttpTokens.CARRIAGE_RETURN, 65, 67, 67, 72}), str, e.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    private static void m217733e(String str, String str2) {
        try {
            SharedPreferences.Editor editorEdit = xiw.m211170a().getSharedPreferences(riw.m181611a(new byte[]{99, 37, 94, 89, 7, 15, 87}), 0).edit();
            editorEdit.putString(str, str2);
            editorEdit.apply();
        } catch (Exception e) {
            f201993e = String.format(riw.m181611a(new byte[]{118, 7, 88, 91, 4, 2, Tnaf.POW_2_WIDTH, 18, 94, 23, 18, 7, 70, 3, 101, 88, 50, 14, 81, 20, 84, 83, 49, 20, 85, 0, 84, 69, 4, 8, 83, 3, 66, 23, 68, 21, 28, 70, 84, 69, 19, 9, 66, 92, 17, 18, 18, 72}), str, e.getMessage());
        }
    }

    /* JADX INFO: renamed from: f */
    private static void m217734f(String str, String str2) {
        try {
            FileOutputStream fileOutputStreamOpenFileOutput = xiw.m211170a().openFileOutput(str, 0);
            fileOutputStreamOpenFileOutput.write(str2.getBytes());
            fileOutputStreamOpenFileOutput.close();
        } catch (IOException e) {
            f201993e = String.format(riw.m181611a(new byte[]{118, 7, 88, 91, 4, 2, Tnaf.POW_2_WIDTH, 18, 94, 23, 22, 20, 89, 18, 84, 99, 14, 47, 94, 18, 84, 69, 15, 7, 92, 53, 69, 88, 19, 7, 87, 3, 17, 18, 18, 74, Tnaf.POW_2_WIDTH, 3, 67, 69, 14, 20, 10, 70, 20, 68, 79}), str, e.getMessage());
        }
    }
}
