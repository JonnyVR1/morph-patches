package p153l;

import org.json.JSONObject;
import tech.sud.gip.base.ThreadUtils;
import tech.sud.gip.core.GameInfo;
import tech.sud.gip.core.ISudListenerGetMGInfo;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class hhg0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f109887a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f109888b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f109889c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f109890d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ISudListenerGetMGInfo f109891e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ uyg0 f109892f;

    public hhg0(uyg0 uyg0Var, long j, String str, long j2, String str2, ISudListenerGetMGInfo iSudListenerGetMGInfo) {
        this.f109892f = uyg0Var;
        this.f109887a = j;
        this.f109888b = str;
        this.f109889c = j2;
        this.f109890d = str2;
        this.f109891e = iSudListenerGetMGInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int iM167366a;
        GameInfo gameInfo = new GameInfo();
        ukg0 ukg0Var = new ukg0("getMGInfo");
        ukg0Var.f179398g = String.valueOf(this.f109887a);
        bxg0 bxg0Var = new bxg0();
        ukg0Var.f179405n = bxg0Var;
        String string = null;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdk_token", this.f109888b);
            jSONObject.put("mg_id", this.f109887a);
            jSONObject.put("client_version", this.f109889c);
            String str = utg0.f180946a;
            jSONObject.put("platform", 2);
            jSONObject.put("uengine_version", "2022.3.62f2c1");
            jSONObject.put("user_id", fug0.f100911a);
            jSONObject.put("room_id", this.f109890d);
            JSONObject jSONObject2 = new JSONObject(uyg0.m198627b(this.f109892f.f181605e, jSONObject.toString(), ukg0Var.f179394c, bxg0Var, null, null));
            iM167366a = jSONObject2.getInt("ret_code");
            try {
                string = jSONObject2.getString("ret_msg");
                uyg0.m198634w(jSONObject2, gameInfo);
            } catch (Exception e) {
                e = e;
                String str2 = "mgInfo error :" + LogUtils.getErrorInfo(e);
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
        ukg0Var.f179396e = iM167366a;
        if (string != null) {
            ukg0Var.f179397f = string;
        }
        ThreadUtils.postUITask(new nog0(ukg0Var.toString(), false, ukg0Var.f179392a, iM167366a));
        ThreadUtils.postUITask(new egg0(this, iM167366a, gameInfo, string));
    }
}
