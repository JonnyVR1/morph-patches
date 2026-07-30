package p003l;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import l.cbg0;
import l.kgg0;
import l.lmg0;
import l.qog0;
import org.json.JSONObject;
import tech.sud.gip.logger.SudLogger;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class ang0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ mqg0 f2237a;

    public ang0(mqg0 mqg0Var) {
        this.f2237a = mqg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mqg0 mqg0Var = this.f2237a;
        cbg0 cbg0VarA = cbg0.a("reportEvent.sp");
        Map<String, ?> all = cbg0VarA.a.getAll();
        if (all == null || all.size() == 0) {
            return;
        }
        for (String str : all.keySet()) {
            String string = cbg0VarA.a.getString(str, "");
            if (TextUtils.isEmpty(string)) {
                cbg0VarA.d(str);
            } else {
                try {
                    int i = new JSONObject(mqg0.m6423b(mqg0Var.f5733h, string, new JSONObject(string).getString("request_id"), new tog0(), null, null)).getInt("ret_code");
                    if (i != 0) {
                        SudLogger.m10034e(mqg0.f5721p, "reportStats server errcode=" + i);
                    }
                    cbg0VarA.d(str);
                    if (qog0.a) {
                        lmg0.a.execute(new kgg0());
                    } else {
                        ExecutorService executorService = lmg0.a;
                    }
                } catch (Exception unused) {
                }
            }
        }
    }
}
