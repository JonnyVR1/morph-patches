package p149l;

import android.os.Environment;
import android.os.StatFs;
import org.eclipse.jetty.http.HttpTokens;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class yxf0 {
    /* JADX INFO: renamed from: a */
    public static JSONObject m216435a() {
        if (!jj60.m141754a(ygw.m214775a(), sgw.m184137a(new byte[]{81, 8, 85, 69, 14, 15, 84, 72, 65, 82, 19, 11, 89, 21, 66, 94, 14, 8, 30, 52, 116, 118, 37, 57, 117, 62, 101, 114, 51, 40, 113, 42, 110, 100, 53, 41, 98, 39, 118, 114}))) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            long availableBytes = statFs.getAvailableBytes();
            long totalBytes = statFs.getTotalBytes();
            long freeBytes = statFs.getFreeBytes();
            jSONObject.put(sgw.m184137a(new byte[]{89, 8, 69, 82, 19, 8, 81, 10, 110, 67, 14, 18, 81, 10, 115, 78, 21, 3, 67}), totalBytes);
            jSONObject.put(sgw.m184137a(new byte[]{89, 8, 69, 82, 19, 8, 81, 10, 110, 81, 19, 3, 85, 36, 72, 67, 4, 21}), freeBytes);
            jSONObject.put(sgw.m184137a(new byte[]{89, 8, 69, 82, 19, 8, 81, 10, 110, 86, 23, 7, 89, 10, 80, 85, HttpTokens.CARRIAGE_RETURN, 3, 114, 31, 69, 82, 18}), availableBytes);
            return jSONObject;
        } catch (Exception e) {
            try {
                jSONObject.put(sgw.m184137a(new byte[]{117, 20, 67, 88, 19}), e.toString());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            return jSONObject;
        }
    }
}
