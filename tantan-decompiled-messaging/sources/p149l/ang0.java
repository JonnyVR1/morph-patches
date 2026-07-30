package p149l;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;
import tech.sud.gip.logger.SudLogger;

/* JADX INFO: loaded from: classes3.dex */
public final class ang0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ mqg0 f70737a;

    public ang0(mqg0 mqg0Var) {
        this.f70737a = mqg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mqg0 mqg0Var = this.f70737a;
        cbg0 cbg0VarM105995a = cbg0.m105995a("reportEvent.sp");
        Map<String, ?> all = cbg0VarM105995a.f80140a.getAll();
        if (all == null || all.size() == 0) {
            return;
        }
        for (String str : all.keySet()) {
            String string = cbg0VarM105995a.f80140a.getString(str, "");
            if (TextUtils.isEmpty(string)) {
                cbg0VarM105995a.m105998d(str);
            } else {
                try {
                    int i = new JSONObject(mqg0.m155894b(mqg0Var.f135231h, string, new JSONObject(string).getString("request_id"), new tog0(), null, null)).getInt("ret_code");
                    if (i != 0) {
                        SudLogger.m221567e(mqg0.f135219p, "reportStats server errcode=" + i);
                    }
                    cbg0VarM105995a.m105998d(str);
                    if (qog0.f155565a) {
                        lmg0.f128795a.execute(new kgg0());
                    } else {
                        ExecutorService executorService = lmg0.f128795a;
                    }
                } catch (Exception unused) {
                }
            }
        }
    }
}
