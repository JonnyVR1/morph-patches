package p003l;

import l.fgg0;
import l.g6g0;
import l.mcg0;
import l.mlg0;
import org.json.JSONObject;
import tech.sud.gip.base.ThreadUtils;
import tech.sud.gip.core.ISudListenerGetMGList;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class c7g0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f2582a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ISudListenerGetMGList f2583b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ mqg0 f2584c;

    public c7g0(mqg0 mqg0Var, String str, ISudListenerGetMGList iSudListenerGetMGList) {
        this.f2584c = mqg0Var;
        this.f2582a = str;
        this.f2583b = iSudListenerGetMGList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int iA;
        String strM6423b;
        mcg0 mcg0Var = new mcg0("getMGList");
        tog0 tog0Var = new tog0();
        mcg0Var.n = tog0Var;
        String string = null;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdk_token", this.f2582a);
            String str = mlg0.a;
            jSONObject.put("platform", 2);
            strM6423b = mqg0.m6423b(this.f2584c.f5729d, jSONObject.toString(), mcg0Var.c, tog0Var, null, null);
            try {
                JSONObject jSONObject2 = new JSONObject(strM6423b);
                iA = jSONObject2.getInt("ret_code");
                try {
                    string = jSONObject2.getString("ret_msg");
                } catch (Exception e) {
                    e = e;
                    String str2 = "mgList error :" + LogUtils.getErrorInfo(e);
                    SudLogger.m10034e(mqg0.f5721p, str2);
                    LogUtils.file("HttpService", str2);
                    if (iA == 0) {
                        iA = g6g0.a(e);
                        string = e.toString();
                    }
                }
            } catch (Exception e2) {
                e = e2;
                iA = 0;
            }
        } catch (Exception e3) {
            e = e3;
            iA = 0;
            strM6423b = null;
        }
        mcg0Var.e = iA;
        if (string != null) {
            mcg0Var.f = string;
        }
        ThreadUtils.postUITask(new fgg0(mcg0Var.toString(), false, mcg0Var.a, iA));
        mqg0 mqg0Var = this.f2584c;
        jrg0 jrg0Var = new jrg0(this, iA, strM6423b, string);
        mqg0Var.getClass();
        ThreadUtils.postUITask(jrg0Var);
    }
}
