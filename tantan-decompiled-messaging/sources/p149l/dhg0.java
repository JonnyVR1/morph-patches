package p149l;

import org.json.JSONObject;
import tech.sud.gip.base.ThreadUtils;
import tech.sud.gip.core.GameInfo;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class dhg0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f86283a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f86284b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f86285c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f86286d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ x8g0 f86287e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ mqg0 f86288f;

    public dhg0(mqg0 mqg0Var, long j, String str, String str2, String str3, x8g0 x8g0Var) {
        this.f86288f = mqg0Var;
        this.f86283a = j;
        this.f86284b = str;
        this.f86285c = str2;
        this.f86286d = str3;
        this.f86287e = x8g0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int iM124589a;
        GameInfo gameInfo = new GameInfo();
        mcg0 mcg0Var = new mcg0("getAuthMGInfo");
        mcg0Var.f133117g = String.valueOf(this.f86283a);
        tog0 tog0Var = new tog0();
        mcg0Var.f133124n = tog0Var;
        String string = null;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdk_token", this.f86284b);
            jSONObject.put("authorization_secret", this.f86285c);
            jSONObject.put("mg_id", this.f86283a);
            jSONObject.put("client_version", 0);
            String str = mlg0.f134426a;
            jSONObject.put("platform", 2);
            jSONObject.put("uengine_version", "2022.3.62f2c1");
            jSONObject.put("user_id", xlg0.f193417a);
            jSONObject.put("room_id", this.f86286d);
            JSONObject jSONObject2 = new JSONObject(mqg0.m155894b(this.f86288f.f135230g, jSONObject.toString(), mcg0Var.f133113c, tog0Var, null, null));
            iM124589a = jSONObject2.getInt("ret_code");
            try {
                string = jSONObject2.getString("ret_msg");
                this.f86288f.getClass();
                mqg0.m155901w(jSONObject2, gameInfo);
            } catch (Exception e) {
                e = e;
                String str2 = "authMgInfo error :" + LogUtils.getErrorInfo(e);
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
        mcg0Var.f133115e = iM124589a;
        if (string != null) {
            mcg0Var.f133116f = string;
        }
        ThreadUtils.postUITask(new fgg0(mcg0Var.toString(), false, mcg0Var.f133111a, iM124589a));
        mqg0 mqg0Var = this.f86288f;
        aeg0 aeg0Var = new aeg0(this, iM124589a, gameInfo, string);
        mqg0Var.getClass();
        ThreadUtils.postUITask(aeg0Var);
    }
}
