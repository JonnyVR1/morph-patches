package p153l;

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
public final class kwg0 implements vlg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ hrg0 f129066a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ chg0 f129067b;

    public kwg0(chg0 chg0Var, hrg0 hrg0Var) {
        this.f129067b = chg0Var;
        this.f129066a = hrg0Var;
    }

    @Override // p153l.vlg0
    public final void onFailure(int i, String str) {
        LogUtils.file("NetworkDetectionTask", "initSDK failure:" + i + " retMsg:" + str);
        NetworkDetectionStepResult networkDetectionStepResult = new NetworkDetectionStepResult();
        networkDetectionStepResult.code = i;
        networkDetectionStepResult.msg = str;
        NetworkDetectionStep networkDetectionStep = this.f129066a.f111341a;
        networkDetectionStep.status = NetworkDetectionStatus.COMPLETED;
        networkDetectionStep.result = networkDetectionStepResult;
        this.f129067b.m109776g(i, str);
    }

    @Override // p153l.vlg0
    public final void onSuccess(String str) {
        String string;
        int i;
        NetworkDetectionStepResult networkDetectionStepResult = new NetworkDetectionStepResult();
        int i2 = 0;
        networkDetectionStepResult.code = 0;
        networkDetectionStepResult.msg = "success";
        NetworkDetectionStep networkDetectionStep = this.f129066a.f111341a;
        networkDetectionStep.status = NetworkDetectionStatus.COMPLETED;
        networkDetectionStep.result = networkDetectionStepResult;
        chg0 chg0Var = this.f129067b;
        if (chg0Var.f81806d) {
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
                        wjg0 wjg0Var = new wjg0();
                        wjg0Var.f189454a = jSONObject2.optString(AuthenticationTokenClaims.JSON_KEY_NAME);
                        wjg0Var.f189455b = jSONObject2.optString("protocol");
                        wjg0Var.f189456c = jSONObject2.optString(FirebaseAnalytics.Param.METHOD);
                        wjg0Var.f189457d = jSONObject2.optString("url");
                        arrayList2.add(wjg0Var);
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
            chg0Var.m109776g(i, string);
            return;
        }
        if (arrayList == null || arrayList.size() == 0) {
            chg0Var.m109777h();
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            wjg0 wjg0Var2 = (wjg0) obj;
            if (!TextUtils.isEmpty(wjg0Var2.f189457d)) {
                if ("http".equalsIgnoreCase(wjg0Var2.f189455b) || "https".equalsIgnoreCase(wjg0Var2.f189455b)) {
                    if ("get".equalsIgnoreCase(wjg0Var2.f189456c) || "post".equalsIgnoreCase(wjg0Var2.f189456c)) {
                        arrayList3.add(wjg0Var2);
                    }
                } else if ("ws".equalsIgnoreCase(wjg0Var2.f189455b) || "wss".equalsIgnoreCase(wjg0Var2.f189455b)) {
                    arrayList3.add(wjg0Var2);
                }
            }
        }
        if (arrayList3.size() == 0) {
            chg0Var.m109777h();
            return;
        }
        chg0Var.f81808f = arrayList3.size();
        uyg0 uyg0Var = utg0.f180947b;
        int size2 = arrayList3.size();
        while (i2 < size2) {
            Object obj2 = arrayList3.get(i2);
            i2++;
            wjg0 wjg0Var3 = (wjg0) obj2;
            hrg0 hrg0Var = new hrg0();
            hrg0Var.f111342b = wjg0Var3.f189454a;
            hrg0Var.f111343c = wjg0Var3.f189457d;
            NetworkDetectionStep networkDetectionStep2 = hrg0Var.f111341a;
            int i5 = chg0Var.f81811i + 1;
            chg0Var.f81811i = i5;
            networkDetectionStep2.identifier = i5;
            networkDetectionStep2.protocol = wjg0Var3.f189455b;
            networkDetectionStep2.method = wjg0Var3.f189456c;
            chg0Var.f81807e.add(hrg0Var);
            yng0 yng0Var = new yng0(hrg0Var.f111341a);
            fzg0 fzg0Var = new fzg0(chg0Var, hrg0Var);
            if ("http".equalsIgnoreCase(wjg0Var3.f189455b) || "https".equalsIgnoreCase(wjg0Var3.f189455b)) {
                if ("get".equalsIgnoreCase(wjg0Var3.f189456c)) {
                    String str2 = wjg0Var3.f189457d;
                    neg0 neg0Var = new neg0();
                    chg0Var.f81810h.add(neg0Var);
                    uyg0Var.m198644o(str2, yng0Var, fzg0Var, neg0Var);
                } else if ("post".equalsIgnoreCase(wjg0Var3.f189456c)) {
                    String str3 = wjg0Var3.f189457d;
                    neg0 neg0Var2 = new neg0();
                    chg0Var.f81810h.add(neg0Var2);
                    uyg0Var.m198641l(str3, "", yng0Var, fzg0Var, neg0Var2);
                }
            } else if ("ws".equalsIgnoreCase(wjg0Var3.f189455b) || "wss".equalsIgnoreCase(wjg0Var3.f189455b)) {
                String str4 = wjg0Var3.f189457d;
                tsg0.f175996b.m181360x(new x1d0.C21228a().m209043q(str4).m209028b(), new zeg0(chg0Var, str4, hrg0Var));
            }
        }
    }
}
