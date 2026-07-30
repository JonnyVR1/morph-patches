package p153l;

import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public class h4r0 {
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0031: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:50), block:B:10:0x0031 */
    /* JADX INFO: renamed from: a */
    public static JSONArray m133593a(String str) throws Throwable {
        Closeable closeable;
        BufferedReader bufferedReader;
        Closeable closeable2 = null;
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                JSONArray jSONArray = new JSONArray();
                bufferedReader = new BufferedReader(new FileReader(str));
                try {
                    File file = new File(str);
                    if (file.length() > 512000) {
                        bufferedReader.skip(file.length() - 512000);
                    }
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            m4r0.m157051a(bufferedReader);
                            return jSONArray;
                        }
                        jSONArray.put(line);
                    }
                } catch (IOException e) {
                    e = e;
                    e.printStackTrace();
                    m4r0.m157051a(bufferedReader);
                    return null;
                }
            } catch (IOException e2) {
                e = e2;
                bufferedReader = null;
            } catch (Throwable th) {
                th = th;
                m4r0.m157051a(closeable2);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            closeable2 = closeable;
        }
    }

    /* JADX INFO: renamed from: b */
    public static JSONArray m133594b(String str) {
        try {
            return m133593a(p1r0.m170259a(str, n0r0.m161024k().m169523f(), n0r0.m161024k().m169524g()).getAbsolutePath());
        } catch (Throwable th) {
            pwq0.m174074a();
            pwq0.m174075b("NPTH_CATCH", th);
            return null;
        }
    }
}
