package p149l;

import android.text.TextUtils;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lmg0 {

    /* JADX INFO: renamed from: a */
    public static final ExecutorService f128795a = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: a */
    public static void m150588a() {
        String string = cbg0.m105995a("TechSudMGPGlobal.sp").f80140a.getString("key_upload_anr_log_info", "");
        if (TextUtils.isEmpty(string)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            m150589b(jSONObject.getLong("mgId"), 1, jSONObject.getString("logId"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m150589b(long j, int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        nog0 nog0Var = new nog0();
        nog0Var.f139840a = mlg0.f134432g;
        nog0Var.f139841b = j;
        nog0Var.f139842c = str;
        nog0Var.f139843d = mlg0.m155147f();
        nog0Var.f139844e = i;
        f128795a.execute(new hrg0(nog0Var));
    }
}
