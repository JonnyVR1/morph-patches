package p153l;

import org.json.JSONObject;
import tech.sud.gip.base.ThreadUtils;
import tech.sud.gip.core.GameInfo;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes3.dex */
public final class lpg0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ long f133058a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f133059b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f133060c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f133061d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ fhg0 f133062e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ uyg0 f133063f;

    public lpg0(uyg0 uyg0Var, long j, String str, String str2, String str3, fhg0 fhg0Var) {
        this.f133063f = uyg0Var;
        this.f133058a = j;
        this.f133059b = str;
        this.f133060c = str2;
        this.f133061d = str3;
        this.f133062e = fhg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int iM167366a;
        GameInfo gameInfo = new GameInfo();
        ukg0 ukg0Var = new ukg0("getAuthMGInfo");
        ukg0Var.f179398g = String.valueOf(this.f133058a);
        bxg0 bxg0Var = new bxg0();
        ukg0Var.f179405n = bxg0Var;
        String string = null;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdk_token", this.f133059b);
            jSONObject.put("authorization_secret", this.f133060c);
            jSONObject.put("mg_id", this.f133058a);
            jSONObject.put("client_version", 0);
            String str = utg0.f180946a;
            jSONObject.put("platform", 2);
            jSONObject.put("uengine_version", "2022.3.62f2c1");
            jSONObject.put("user_id", fug0.f100911a);
            jSONObject.put("room_id", this.f133061d);
            JSONObject jSONObject2 = new JSONObject(uyg0.m198627b(this.f133063f.f181607g, jSONObject.toString(), ukg0Var.f179394c, bxg0Var, null, null));
            iM167366a = jSONObject2.getInt("ret_code");
            try {
                string = jSONObject2.getString("ret_msg");
                this.f133063f.getClass();
                uyg0.m198634w(jSONObject2, gameInfo);
            } catch (Exception e) {
                e = e;
                String str2 = "authMgInfo error :" + LogUtils.getErrorInfo(e);
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
        uyg0 uyg0Var = this.f133063f;
        img0 img0Var = new img0(this, iM167366a, gameInfo, string);
        uyg0Var.getClass();
        ThreadUtils.postUITask(img0Var);
    }
}
