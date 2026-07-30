package p153l;

import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.UUID;
import org.eclipse.jetty.http.HttpTokens;

/* JADX INFO: loaded from: classes7.dex */
public class axm {

    /* JADX INFO: renamed from: b */
    private static final String f73870b = qmw.m177151a(new byte[]{121, 40, 98, 99, HttpTokens.SPACE, 42, 124, 39, 101, 126, 46, 40, 111, 47, 117});

    /* JADX INFO: renamed from: a */
    private static String f73869a = null;

    /* JADX INFO: renamed from: a */
    public static synchronized String m100777a() {
        try {
            if (TextUtils.isEmpty(f73869a)) {
                String strM100778b = m100778b();
                f73869a = strM100778b;
                if (TextUtils.isEmpty(strM100778b)) {
                    String strM100779c = m100779c();
                    f73869a = strM100779c;
                    if (TextUtils.isEmpty(strM100779c)) {
                        String string = UUID.randomUUID().toString();
                        f73869a = string;
                        m100781e(string);
                        m100780d(f73869a);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return f73869a;
    }

    /* JADX INFO: renamed from: b */
    private static String m100778b() throws Throwable {
        BufferedReader bufferedReader;
        File file = new File(eiw.m120945a().getFilesDir(), f73870b);
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
    private static String m100779c() {
        return g4f0.m128876b(qmw.m177151a(new byte[]{99, 37, 94, 89, 7, 15, 87}), f73870b);
    }

    /* JADX INFO: renamed from: d */
    private static void m100780d(String str) {
        g4f0.m128877c(qmw.m177151a(new byte[]{99, 37, 94, 89, 7, 15, 87}), f73870b, str);
    }

    /* JADX INFO: renamed from: e */
    private static void m100781e(String str) {
        try {
            FileOutputStream fileOutputStreamOpenFileOutput = eiw.m120945a().openFileOutput(f73870b, 0);
            fileOutputStreamOpenFileOutput.write(str.getBytes());
            fileOutputStreamOpenFileOutput.close();
        } catch (IOException unused) {
        }
    }
}
