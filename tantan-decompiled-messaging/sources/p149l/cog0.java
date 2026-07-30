package p149l;

import android.text.TextUtils;
import com.facebook.AuthenticationTokenClaims;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import tech.sud.gip.core.network.detection.NetworkDetectionStatus;
import tech.sud.gip.core.network.detection.NetworkDetectionStep;
import tech.sud.gip.core.network.detection.NetworkDetectionStepResult;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class cog0 implements ndg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zig0 f81838a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ u8g0 f81839b;

    public cog0(u8g0 u8g0Var, zig0 zig0Var) {
        this.f81839b = u8g0Var;
        this.f81838a = zig0Var;
    }

    @Override // p149l.ndg0
    public final void onFailure(int i, String str) {
        LogUtils.file("NetworkDetectionTask", "initSDK failure:" + i + " retMsg:" + str);
        NetworkDetectionStepResult networkDetectionStepResult = new NetworkDetectionStepResult();
        networkDetectionStepResult.code = i;
        networkDetectionStepResult.msg = str;
        NetworkDetectionStep networkDetectionStep = this.f81838a.f203327a;
        networkDetectionStep.status = NetworkDetectionStatus.COMPLETED;
        networkDetectionStep.result = networkDetectionStepResult;
        this.f81839b.m192200g(i, str);
    }

    @Override // p149l.ndg0
    public final void onSuccess(String str) {
        String string;
        int i;
        NetworkDetectionStepResult networkDetectionStepResult = new NetworkDetectionStepResult();
        int i2 = 0;
        networkDetectionStepResult.code = 0;
        networkDetectionStepResult.msg = "success";
        NetworkDetectionStep networkDetectionStep = this.f81838a.f203327a;
        networkDetectionStep.status = NetworkDetectionStatus.COMPLETED;
        networkDetectionStep.result = networkDetectionStepResult;
        u8g0 u8g0Var = this.f81839b;
        if (u8g0Var.f175130d) {
            return;
        }
        ArrayList arrayList = null;
        try {
            JSONObject jSONObject = new JSONObject(str);
            i = jSONObject.getInt("ret_code");
            string = jSONObject.optString("ret_msg");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("data");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                ArrayList arrayList2 = new ArrayList();
                for (int i3 = 0; i3 < jSONArrayOptJSONArray.length(); i3++) {
                    try {
                        JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i3);
                        obg0 obg0Var = new obg0();
                        obg0Var.f142939a = jSONObject2.optString(AuthenticationTokenClaims.JSON_KEY_NAME);
                        obg0Var.f142940b = jSONObject2.optString("protocol");
                        obg0Var.f142941c = jSONObject2.optString(FirebaseAnalytics.Param.METHOD);
                        obg0Var.f142942d = jSONObject2.optString("url");
                        arrayList2.add(obg0Var);
                    } catch (Exception e) {
                        e = e;
                        arrayList = arrayList2;
                        LogUtils.file("NetworkDetectionTask", "parseCheckerUrlConfig error:" + LogUtils.getErrorInfo(e));
                        string = e.toString();
                        i = -1;
                    }
                }
                arrayList = arrayList2;
            }
        } catch (Exception e2) {
            e = e2;
        }
        if (i != 0) {
            u8g0Var.m192200g(i, string);
            return;
        }
        if (arrayList == null || arrayList.size() == 0) {
            u8g0Var.m192201h();
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            obg0 obg0Var2 = (obg0) obj;
            if (!TextUtils.isEmpty(obg0Var2.f142942d)) {
                if ("http".equalsIgnoreCase(obg0Var2.f142940b) || "https".equalsIgnoreCase(obg0Var2.f142940b)) {
                    if ("get".equalsIgnoreCase(obg0Var2.f142941c) || "post".equalsIgnoreCase(obg0Var2.f142941c)) {
                        arrayList3.add(obg0Var2);
                    }
                } else if ("ws".equalsIgnoreCase(obg0Var2.f142940b) || "wss".equalsIgnoreCase(obg0Var2.f142940b)) {
                    arrayList3.add(obg0Var2);
                }
            }
        }
        if (arrayList3.size() == 0) {
            u8g0Var.m192201h();
            return;
        }
        u8g0Var.f175132f = arrayList3.size();
        mqg0 mqg0Var = mlg0.f134427b;
        int size2 = arrayList3.size();
        while (i2 < size2) {
            Object obj2 = arrayList3.get(i2);
            i2++;
            obg0 obg0Var3 = (obg0) obj2;
            zig0 zig0Var = new zig0();
            zig0Var.f203328b = obg0Var3.f142939a;
            zig0Var.f203329c = obg0Var3.f142942d;
            NetworkDetectionStep networkDetectionStep2 = zig0Var.f203327a;
            int i5 = u8g0Var.f175135i + 1;
            u8g0Var.f175135i = i5;
            networkDetectionStep2.identifier = i5;
            networkDetectionStep2.protocol = obg0Var3.f142940b;
            networkDetectionStep2.method = obg0Var3.f142941c;
            u8g0Var.f175131e.add(zig0Var);
            qfg0 qfg0Var = new qfg0(zig0Var.f203327a);
            xqg0 xqg0Var = new xqg0(u8g0Var, zig0Var);
            if ("http".equalsIgnoreCase(obg0Var3.f142940b) || "https".equalsIgnoreCase(obg0Var3.f142940b)) {
                if ("get".equalsIgnoreCase(obg0Var3.f142941c)) {
                    String str2 = obg0Var3.f142942d;
                    f6g0 f6g0Var = new f6g0();
                    u8g0Var.f175134h.add(f6g0Var);
                    mqg0Var.m155911o(str2, qfg0Var, xqg0Var, f6g0Var);
                } else if ("post".equalsIgnoreCase(obg0Var3.f142941c)) {
                    String str3 = obg0Var3.f142942d;
                    f6g0 f6g0Var2 = new f6g0();
                    u8g0Var.f175134h.add(f6g0Var2);
                    mqg0Var.m155908l(str3, "", qfg0Var, xqg0Var, f6g0Var2);
                }
            } else if ("ws".equalsIgnoreCase(obg0Var3.f142940b) || "wss".equalsIgnoreCase(obg0Var3.f142940b)) {
                String str4 = obg0Var3.f142942d;
                lkg0.f128531b.m144868x(new stc0.C20027a().m185898q(str4).m185883b(), new r6g0(u8g0Var, str4, zig0Var));
            }
        }
    }
}
