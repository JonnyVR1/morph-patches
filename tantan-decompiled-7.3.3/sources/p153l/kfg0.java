package p153l;

import org.json.JSONObject;
import tech.sud.gip.base.ThreadUtils;
import tech.sud.gip.core.ISudListenerGetMGList;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class kfg0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f126393a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ISudListenerGetMGList f126394b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ uyg0 f126395c;

    public kfg0(uyg0 uyg0Var, String str, ISudListenerGetMGList iSudListenerGetMGList) {
        this.f126395c = uyg0Var;
        this.f126393a = str;
        this.f126394b = iSudListenerGetMGList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int iM167366a;
        String strM198627b;
        ukg0 ukg0Var = new ukg0("getMGList");
        bxg0 bxg0Var = new bxg0();
        ukg0Var.f179405n = bxg0Var;
        String string = null;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdk_token", this.f126393a);
            String str = utg0.f180946a;
            jSONObject.put("platform", 2);
            strM198627b = uyg0.m198627b(this.f126395c.f181604d, jSONObject.toString(), ukg0Var.f179394c, bxg0Var, null, null);
            try {
                JSONObject jSONObject2 = new JSONObject(strM198627b);
                iM167366a = jSONObject2.getInt("ret_code");
                try {
                    string = jSONObject2.getString("ret_msg");
                } catch (Exception e) {
                    e = e;
                    String str2 = "mgList error :" + LogUtils.getErrorInfo(e);
                    SudLogger.m222813e(uyg0.f181596p, str2);
                    LogUtils.file("HttpService", str2);
                    if (iM167366a == 0) {
                        iM167366a = oeg0.m167366a(e);
                        string = e.toString();
                    }
                }
            } catch (Exception e2) {
                e = e2;
                iM167366a = 0;
            }
        } catch (Exception e3) {
            e = e3;
            iM167366a = 0;
            strM198627b = null;
        }
        ukg0Var.f179396e = iM167366a;
        if (string != null) {
            ukg0Var.f179397f = string;
        }
        ThreadUtils.postUITask(new nog0(ukg0Var.toString(), false, ukg0Var.f179392a, iM167366a));
        uyg0 uyg0Var = this.f126395c;
        rzg0 rzg0Var = new rzg0(this, iM167366a, strM198627b, string);
        uyg0Var.getClass();
        ThreadUtils.postUITask(rzg0Var);
    }
}
