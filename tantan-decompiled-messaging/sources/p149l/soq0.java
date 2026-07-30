package p149l;

import android.annotation.SuppressLint;
import android.content.Context;
import com.apm.lite.CrashType;
import com.apm.lite.p009j.C0922e;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class soq0 {

    /* JADX INFO: renamed from: b */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile soq0 f165717b;

    /* JADX INFO: renamed from: a */
    private volatile Context f165718a;

    private soq0(Context context) {
        this.f165718a = context;
    }

    /* JADX INFO: renamed from: a */
    public static soq0 m185294a() {
        if (f165717b == null) {
            f165717b = new soq0(hrq0.m132700i());
        }
        return f165717b;
    }

    /* JADX INFO: renamed from: b */
    public void m185295b(JSONObject jSONObject, long j, boolean z) {
        File[] fileArr;
        if (jSONObject == null || jSONObject.length() <= 0) {
            return;
        }
        try {
            String strM5131s = C0922e.m5131s();
            int i = 0;
            File file = new File(dwq0.m113914b(this.f165718a), hrq0.m132692a(j, CrashType.ANR, false, false));
            luq0.m151790d(file, file.getName(), strM5131s, jSONObject, C0922e.m5129q());
            if (z && !mu40.m156375d()) {
                jSONObject.put("upload_scene", "direct");
                jSONObject.put("crash_uuid", file.getName());
                if (iiq0.m136441p()) {
                    HashMap<String, bwq0.C16000b> mapM104239b = bwq0.m104239b(j, "anr_trace");
                    fileArr = new File[mapM104239b.size() + 2];
                    for (Map.Entry<String, bwq0.C16000b> entry : mapM104239b.entrySet()) {
                        if (!entry.getKey().equals(giq0.m126397l(this.f165718a))) {
                            fileArr[i] = dwq0.m113915c(this.f165718a, entry.getValue().f77702b);
                            i++;
                        }
                    }
                } else {
                    fileArr = new File[2];
                }
                fileArr[fileArr.length - 1] = dwq0.m113915c(this.f165718a, hrq0.m132699h());
                fileArr[fileArr.length - 2] = bwq0.m104238a(j);
                if (C0922e.m5119g(strM5131s, jSONObject.toString(), fileArr).m151903a()) {
                    luq0.m151804r(file);
                    if (!mu40.m156373b()) {
                        luq0.m151804r(dwq0.m113930r(hrq0.m132700i()));
                    }
                    mtq0.m156349a(dwq0.m113906F(hrq0.m132700i()), CrashType.ANR, file.getName());
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m185296c(JSONObject jSONObject, File file, File file2) {
        try {
            return C0922e.m5119g(C0922e.m5135w(), jSONObject.toString(), file, file2, bwq0.m104238a(System.currentTimeMillis())).m151903a();
        } catch (Throwable th) {
            kwq0.m147634g(th);
            return false;
        }
    }
}
