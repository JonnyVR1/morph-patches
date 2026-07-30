package p153l;

import android.text.TextUtils;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class tug0 {

    /* JADX INFO: renamed from: a */
    public static final ExecutorService f176192a = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: a */
    public static void m192749a() {
        String string = kjg0.m150043a("TechSudMGPGlobal.sp").f127100a.getString("key_upload_anr_log_info", "");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            m192750b(jSONObject.getLong("mgId"), 1, jSONObject.getString("logId"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m192750b(long j, int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        vwg0 vwg0Var = new vwg0();
        vwg0Var.f186135a = utg0.f180952g;
        vwg0Var.f186136b = j;
        vwg0Var.f186137c = str;
        vwg0Var.f186138d = utg0.m198038f();
        vwg0Var.f186139e = i;
        f176192a.execute(new pzg0(vwg0Var));
    }
}
