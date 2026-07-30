package p153l;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;
import tech.sud.gip.logger.SudLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class ivg0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ uyg0 f117068a;

    public ivg0(uyg0 uyg0Var) {
        this.f117068a = uyg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        uyg0 uyg0Var = this.f117068a;
        kjg0 kjg0VarM150043a = kjg0.m150043a("reportEvent.sp");
        Map<String, ?> all = kjg0VarM150043a.f127100a.getAll();
        if (all == null || all.size() == 0) {
            return;
        }
        for (String str : all.keySet()) {
            String string = kjg0VarM150043a.f127100a.getString(str, "");
            if (TextUtils.isEmpty(string)) {
                kjg0VarM150043a.m150046d(str);
            } else {
                try {
                    int i = new JSONObject(uyg0.m198627b(uyg0Var.f181608h, string, new JSONObject(string).getString("request_id"), new bxg0(), null, null)).getInt("ret_code");
                    if (i != 0) {
                        SudLogger.m222813e(uyg0.f181596p, "reportStats server errcode=" + i);
                    }
                    kjg0VarM150043a.m150046d(str);
                    if (ywg0.f201836a) {
                        tug0.f176192a.execute(new sog0());
                    } else {
                        ExecutorService executorService = tug0.f176192a;
                    }
                } catch (Exception unused) {
                }
            }
        }
    }
}
