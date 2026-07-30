package p149l;

import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.UUID;
import org.eclipse.jetty.http.HttpTokens;

/* JADX INFO: loaded from: classes7.dex */
public class zum {

    /* JADX INFO: renamed from: b */
    private static final String f204864b = rjw.m179664a(new byte[]{121, 40, 98, 99, HttpTokens.SPACE, 42, 124, 39, 101, 126, 46, 40, 111, 47, 117});

    /* JADX INFO: renamed from: a */
    private static String f204863a = null;

    /* JADX INFO: renamed from: a */
    public static synchronized String m220233a() {
        try {
            if (TextUtils.isEmpty(f204863a)) {
                String strM220234b = m220234b();
                f204863a = strM220234b;
                if (TextUtils.isEmpty(strM220234b)) {
                    String strM220235c = m220235c();
                    f204863a = strM220235c;
                    if (TextUtils.isEmpty(strM220235c)) {
                        String string = UUID.randomUUID().toString();
                        f204863a = string;
                        m220237e(string);
                        m220236d(f204863a);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return f204863a;
    }

    /* JADX INFO: renamed from: b */
    private static String m220234b() throws Throwable {
        BufferedReader bufferedReader;
        File file = new File(ggw.m126041a().getFilesDir(), f204864b);
        BufferedReader bufferedReader2 = null;
        if (!file.exists()) {
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
            } catch (IOException unused2) {
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException unused3) {
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (IOException unused5) {
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: c */
    private static String m220235c() {
        return zve0.m220364b(rjw.m179664a(new byte[]{99, 37, 94, 89, 7, 15, 87}), f204864b);
    }

    /* JADX INFO: renamed from: d */
    private static void m220236d(String str) {
        zve0.m220365c(rjw.m179664a(new byte[]{99, 37, 94, 89, 7, 15, 87}), f204864b, str);
    }

    /* JADX INFO: renamed from: e */
    private static void m220237e(String str) {
        try {
            FileOutputStream fileOutputStreamOpenFileOutput = ggw.m126041a().openFileOutput(f204864b, 0);
            fileOutputStreamOpenFileOutput.write(str.getBytes());
            fileOutputStreamOpenFileOutput.close();
        } catch (IOException unused) {
        }
    }
}
