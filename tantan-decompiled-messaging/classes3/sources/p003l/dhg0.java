package p003l;

import l.fgg0;
import l.g6g0;
import l.mcg0;
import l.mlg0;
import l.x8g0;
import l.xlg0;
import org.json.JSONObject;
import tech.sud.gip.base.ThreadUtils;
import tech.sud.gip.core.GameInfo;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class dhg0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f2999a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f3000b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f3001c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f3002d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ x8g0 f3003e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ mqg0 f3004f;

    public dhg0(mqg0 mqg0Var, long j, String str, String str2, String str3, x8g0 x8g0Var) {
        this.f3004f = mqg0Var;
        this.f2999a = j;
        this.f3000b = str;
        this.f3001c = str2;
        this.f3002d = str3;
        this.f3003e = x8g0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int iA;
        GameInfo gameInfo = new GameInfo();
        mcg0 mcg0Var = new mcg0("getAuthMGInfo");
        mcg0Var.g = String.valueOf(this.f2999a);
        tog0 tog0Var = new tog0();
        mcg0Var.n = tog0Var;
        String string = null;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdk_token", this.f3000b);
            jSONObject.put("authorization_secret", this.f3001c);
            jSONObject.put("mg_id", this.f2999a);
            jSONObject.put("client_version", 0);
            String str = mlg0.a;
            jSONObject.put("platform", 2);
            jSONObject.put("uengine_version", "2022.3.62f2c1");
            jSONObject.put("user_id", xlg0.a);
            jSONObject.put("room_id", this.f3002d);
            JSONObject jSONObject2 = new JSONObject(mqg0.m6423b(this.f3004f.f5732g, jSONObject.toString(), mcg0Var.c, tog0Var, null, null));
            iA = jSONObject2.getInt("ret_code");
            try {
                string = jSONObject2.getString("ret_msg");
                this.f3004f.getClass();
                mqg0.m6430w(jSONObject2, gameInfo);
            } catch (Exception e) {
                e = e;
                String str2 = "authMgInfo error :" + LogUtils.getErrorInfo(e);
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
        mcg0Var.e = iA;
        if (string != null) {
            mcg0Var.f = string;
        }
        ThreadUtils.postUITask(new fgg0(mcg0Var.toString(), false, mcg0Var.a, iA));
        mqg0 mqg0Var = this.f3004f;
        aeg0 aeg0Var = new aeg0(this, iA, gameInfo, string);
        mqg0Var.getClass();
        ThreadUtils.postUITask(aeg0Var);
    }
}
