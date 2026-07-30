package p149l;

import org.json.JSONObject;
import tech.sud.gip.base.ThreadUtils;
import tech.sud.gip.core.GameInfo;
import tech.sud.gip.core.ISudListenerGetMGInfo;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class z8g0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f202151a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f202152b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f202153c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f202154d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ISudListenerGetMGInfo f202155e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ mqg0 f202156f;

    public z8g0(mqg0 mqg0Var, long j, String str, long j2, String str2, ISudListenerGetMGInfo iSudListenerGetMGInfo) {
        this.f202156f = mqg0Var;
        this.f202151a = j;
        this.f202152b = str;
        this.f202153c = j2;
        this.f202154d = str2;
        this.f202155e = iSudListenerGetMGInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int iM124589a;
        GameInfo gameInfo = new GameInfo();
        mcg0 mcg0Var = new mcg0("getMGInfo");
        mcg0Var.f133117g = String.valueOf(this.f202151a);
        tog0 tog0Var = new tog0();
        mcg0Var.f133124n = tog0Var;
        String string = null;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdk_token", this.f202152b);
            jSONObject.put("mg_id", this.f202151a);
            jSONObject.put("client_version", this.f202153c);
            String str = mlg0.f134426a;
            jSONObject.put("platform", 2);
            jSONObject.put("uengine_version", "2022.3.62f2c1");
            jSONObject.put("user_id", xlg0.f193417a);
            jSONObject.put("room_id", this.f202154d);
            JSONObject jSONObject2 = new JSONObject(mqg0.m155894b(this.f202156f.f135228e, jSONObject.toString(), mcg0Var.f133113c, tog0Var, null, null));
            iM124589a = jSONObject2.getInt("ret_code");
            try {
                string = jSONObject2.getString("ret_msg");
                mqg0.m155901w(jSONObject2, gameInfo);
            } catch (Exception e) {
                e = e;
                String str2 = "mgInfo error :" + LogUtils.getErrorInfo(e);
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
        ThreadUtils.postUITask(new w7g0(this, iM124589a, gameInfo, string));
    }
}
