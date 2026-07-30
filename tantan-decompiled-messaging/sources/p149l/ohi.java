package p149l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes7.dex */
public class ohi {
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: a */
    public static String m164365a(String str) throws Throwable {
        FileInputStream fileInputStream;
        InputStreamReader inputStreamReader;
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith("file:///")) {
            str = str.substring(8);
        }
        StringBuilder sb = new StringBuilder();
        try {
            try {
                fileInputStream = new FileInputStream(str);
                try {
                    inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
                    try {
                        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                        while (true) {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            sb.append(line);
                            sb.append(SignParameters.NEW_LINE);
                        }
                        ja5.m140688a(inputStreamReader, fileInputStream);
                    } catch (Exception e) {
                        e = e;
                        e.printStackTrace();
                        ja5.m140688a(inputStreamReader, fileInputStream);
                    }
                } catch (Exception e2) {
                    e = e2;
                    inputStreamReader = null;
                } catch (Throwable th) {
                    th = th;
                    ja5.m140688a(str2, fileInputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                str2 = str;
            }
        } catch (Exception e3) {
            e = e3;
            inputStreamReader = null;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
        }
        if (sb.length() == 0) {
            return null;
        }
        return sb.toString();
    }
}
