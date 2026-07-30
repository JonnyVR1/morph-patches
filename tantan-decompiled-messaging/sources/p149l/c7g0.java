package p149l;

import org.json.JSONObject;
import tech.sud.gip.base.ThreadUtils;
import tech.sud.gip.core.ISudListenerGetMGList;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class c7g0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f79614a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ISudListenerGetMGList f79615b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ mqg0 f79616c;

    public c7g0(mqg0 mqg0Var, String str, ISudListenerGetMGList iSudListenerGetMGList) {
        this.f79616c = mqg0Var;
        this.f79614a = str;
        this.f79615b = iSudListenerGetMGList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int iM124589a;
        String strM155894b;
        mcg0 mcg0Var = new mcg0("getMGList");
        tog0 tog0Var = new tog0();
        mcg0Var.f133124n = tog0Var;
        String string = null;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdk_token", this.f79614a);
            String str = mlg0.f134426a;
            jSONObject.put("platform", 2);
            strM155894b = mqg0.m155894b(this.f79616c.f135227d, jSONObject.toString(), mcg0Var.f133113c, tog0Var, null, null);
            try {
                JSONObject jSONObject2 = new JSONObject(strM155894b);
                iM124589a = jSONObject2.getInt("ret_code");
                try {
                    string = jSONObject2.getString("ret_msg");
                } catch (Exception e) {
                    e = e;
                    String str2 = "mgList error :" + LogUtils.getErrorInfo(e);
                    SudLogger.m221567e(mqg0.f135219p, str2);
                    LogUtils.file("HttpService", str2);
                    if (iM124589a == 0) {
                        iM124589a = g6g0.m124589a(e);
                        string = e.toString();
                    }
                }
            } catch (Exception e2) {
                e = e2;
                iM124589a = 0;
            }
        } catch (Exception e3) {
            e = e3;
            iM124589a = 0;
            strM155894b = null;
        }
        mcg0Var.f133115e = iM124589a;
        if (string != null) {
            mcg0Var.f133116f = string;
        }
        ThreadUtils.postUITask(new fgg0(mcg0Var.toString(), false, mcg0Var.f133111a, iM124589a));
        mqg0 mqg0Var = this.f79616c;
        jrg0 jrg0Var = new jrg0(this, iM124589a, strM155894b, string);
        mqg0Var.getClass();
        ThreadUtils.postUITask(jrg0Var);
    }
}
