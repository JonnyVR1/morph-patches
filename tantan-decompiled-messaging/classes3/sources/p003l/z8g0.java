package p003l;

import l.fgg0;
import l.g6g0;
import l.mcg0;
import l.mlg0;
import l.xlg0;
import org.json.JSONObject;
import tech.sud.gip.base.ThreadUtils;
import tech.sud.gip.core.GameInfo;
import tech.sud.gip.core.ISudListenerGetMGInfo;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class z8g0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f9270a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f9271b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f9272c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f9273d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ISudListenerGetMGInfo f9274e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ mqg0 f9275f;

    public z8g0(mqg0 mqg0Var, long j, String str, long j2, String str2, ISudListenerGetMGInfo iSudListenerGetMGInfo) {
        this.f9275f = mqg0Var;
        this.f9270a = j;
        this.f9271b = str;
        this.f9272c = j2;
        this.f9273d = str2;
        this.f9274e = iSudListenerGetMGInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int iA;
        GameInfo gameInfo = new GameInfo();
        mcg0 mcg0Var = new mcg0("getMGInfo");
        mcg0Var.g = String.valueOf(this.f9270a);
        tog0 tog0Var = new tog0();
        mcg0Var.n = tog0Var;
        String string = null;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdk_token", this.f9271b);
            jSONObject.put("mg_id", this.f9270a);
            jSONObject.put("client_version", this.f9272c);
            String str = mlg0.a;
            jSONObject.put("platform", 2);
            jSONObject.put("uengine_version", "2022.3.62f2c1");
            jSONObject.put("user_id", xlg0.a);
            jSONObject.put("room_id", this.f9273d);
            JSONObject jSONObject2 = new JSONObject(mqg0.m6423b(this.f9275f.f5730e, jSONObject.toString(), mcg0Var.c, tog0Var, null, null));
            iA = jSONObject2.getInt("ret_code");
            try {
                string = jSONObject2.getString("ret_msg");
                mqg0.m6430w(jSONObject2, gameInfo);
            } catch (Exception e) {
                e = e;
                String str2 = "mgInfo error :" + LogUtils.getErrorInfo(e);
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
        ThreadUtils.postUITask(new w7g0(this, iA, gameInfo, string));
    }
}
