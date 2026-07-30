package p149l;

import android.os.Environment;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/* JADX INFO: loaded from: classes13.dex */
public class wxf0 {
    /* JADX INFO: renamed from: a */
    public static String m205983a(String str) {
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            return "";
        }
        String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
        StringBuilder sb = new StringBuilder();
        String str2 = File.separator;
        if (!absolutePath.endsWith(str2)) {
            sb.append(absolutePath);
            sb.append(str2);
        }
        sb.append(str);
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static String m205984b(String str) throws Throwable {
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(str));
                try {
                    StringBuilder sb = new StringBuilder();
                    while (true) {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            break;
                        }
                        sb.append(line);
                        sb.append(SignParameters.NEW_LINE);
                    }
                    int iLastIndexOf = sb.lastIndexOf(SignParameters.NEW_LINE);
                    if (iLastIndexOf != -1) {
                        sb.replace(iLastIndexOf, sb.length(), "");
                    }
                    String string = sb.toString();
                    u95.m192263a(bufferedReader2);
                    return string;
                } catch (Exception e) {
                    e = e;
                    bufferedReader = bufferedReader2;
                    sm80.m184942b(e);
                    u95.m192263a(bufferedReader);
                    return "";
                } catch (Throwable th) {
                    th = th;
                    bufferedReader = bufferedReader2;
                    u95.m192263a(bufferedReader);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m205985c(String str, String str2) throws Throwable {
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
        BufferedWriter bufferedWriter = null;
        try {
            try {
                File parentFile = file.getParentFile();
                if ((!parentFile.exists() ? parentFile.mkdirs() : true) && file.createNewFile()) {
                    BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(file));
                    try {
                        bufferedWriter2.write(str2);
                        bufferedWriter2.flush();
                        bufferedWriter = bufferedWriter2;
                    } catch (Exception e) {
                        e = e;
                        bufferedWriter = bufferedWriter2;
                        sm80.m184942b(e);
                        u95.m192263a(bufferedWriter);
                        return;
                    } catch (Throwable th) {
                        th = th;
                        bufferedWriter = bufferedWriter2;
                        u95.m192263a(bufferedWriter);
                        throw th;
                    }
                }
                u95.m192263a(bufferedWriter);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
