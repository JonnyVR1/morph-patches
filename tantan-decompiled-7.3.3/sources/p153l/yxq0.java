package p153l;

import android.annotation.SuppressLint;
import android.content.Context;
import com.apm.lite.CrashType;
import com.apm.lite.p010j.C0926e;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class yxq0 {

    /* JADX INFO: renamed from: b */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile yxq0 f202003b;

    /* JADX INFO: renamed from: a */
    private volatile Context f202004a;

    private yxq0(Context context) {
        this.f202004a = context;
    }

    /* JADX INFO: renamed from: a */
    public static yxq0 m217735a() {
        if (f202003b == null) {
            f202003b = new yxq0(n0r0.m161022i());
        }
        return f202003b;
    }

    /* JADX INFO: renamed from: b */
    public void m217736b(JSONObject jSONObject, long j, boolean z) {
        File[] fileArr;
        if (jSONObject == null || jSONObject.length() <= 0) {
            return;
        }
        try {
            String strM5141s = C0926e.m5141s();
            int i = 0;
            File file = new File(j5r0.m143566b(this.f202004a), n0r0.m161014a(j, CrashType.ANR, false, false));
            r3r0.m179678d(file, file.getName(), strM5141s, jSONObject, C0926e.m5139q());
            if (z && !b350.m102272d()) {
                jSONObject.put("upload_scene", "direct");
                jSONObject.put("crash_uuid", file.getName());
                if (nrq0.m164519p()) {
                    HashMap<String, h5r0.C17406b> mapM133672b = h5r0.m133672b(j, "anr_trace");
                    fileArr = new File[mapM133672b.size() + 2];
                    for (Map.Entry<String, h5r0.C17406b> entry : mapM133672b.entrySet()) {
                        if (!entry.getKey().equals(lrq0.m155648l(this.f202004a))) {
                            fileArr[i] = j5r0.m143567c(this.f202004a, entry.getValue().f107969b);
                            i++;
                        }
                    }
                } else {
                    fileArr = new File[2];
                }
                fileArr[fileArr.length - 1] = j5r0.m143567c(this.f202004a, n0r0.m161021h());
                fileArr[fileArr.length - 2] = h5r0.m133671a(j);
                if (C0926e.m5129g(strM5141s, jSONObject.toString(), fileArr).m179816a()) {
                    r3r0.m179692r(file);
                    if (!b350.m102270b()) {
                        r3r0.m179692r(j5r0.m143582r(n0r0.m161022i()));
                    }
                    s2r0.m184133a(j5r0.m143558F(n0r0.m161022i()), CrashType.ANR, file.getName());
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m217737c(JSONObject jSONObject, File file, File file2) {
        try {
            return C0926e.m5129g(C0926e.m5145w(), jSONObject.toString(), file, file2, h5r0.m133671a(System.currentTimeMillis())).m179816a();
        } catch (Throwable th) {
            q5r0.m175517g(th);
            return false;
        }
    }
}
