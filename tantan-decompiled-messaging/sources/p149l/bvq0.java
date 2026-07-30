package p149l;

import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public class bvq0 {
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0031: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:50), block:B:10:0x0031 */
    /* JADX INFO: renamed from: a */
    public static JSONArray m104073a(String str) throws Throwable {
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
                            gvq0.m128290a(bufferedReader);
                            return jSONArray;
                        }
                        jSONArray.put(line);
                    }
                } catch (IOException e) {
                    e = e;
                    e.printStackTrace();
                    gvq0.m128290a(bufferedReader);
                    return null;
                }
            } catch (IOException e2) {
                e = e2;
                bufferedReader = null;
            } catch (Throwable th) {
                th = th;
                gvq0.m128290a(closeable2);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            closeable2 = closeable;
        }
    }

    /* JADX INFO: renamed from: b */
    public static JSONArray m104074b(String str) {
        try {
            return m104073a(jsq0.m143055a(str, hrq0.m132702k().m143402f(), hrq0.m132702k().m143403g()).getAbsolutePath());
        } catch (Throwable th) {
            jnq0.m142383a();
            jnq0.m142384b("NPTH_CATCH", th);
            return null;
        }
    }
}
