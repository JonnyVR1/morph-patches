package p153l;

import androidx.annotation.NonNull;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.p070ui.jsbridge.implement.DeviceBridgeImplementation;
import com.tantanapp.common.utils.CrashHelper;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class xci0 extends wc00 {
    public xci0(PutongAct putongAct, String str, MKWebView mKWebView) {
        super(putongAct, str, mKWebView);
    }

    /* JADX INFO: renamed from: K */
    public final String m210148K() {
        if (!uqb0.f180397c0.signedIn_()) {
            return "";
        }
        String str = uqb0.f180397c0.queryMe().location.region.city;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cityName", str);
            return jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
            return "";
        }
    }

    /* JADX INFO: renamed from: L */
    public final String m210149L(@NonNull xc00 xc00Var) {
        boolean zM165092h = nx40.m165092h(xc00Var.mo99543c());
        int iM165085a = nx40.m165085a(xc00Var.mo99543c());
        float f = k26.m147943a().getResources().getDisplayMetrics().density;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isNotch", zM165092h);
            if (f != 0.0f) {
                jSONObject.put("notchHeight", iM165085a / f);
            }
            jSONObject.put("statusBarHeight", bnl0.m105511F0() / f);
            return jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
            return "";
        }
    }

    /* JADX INFO: renamed from: M */
    public final String m210150M(@NonNull xc00 xc00Var, JSONObject jSONObject) {
        return new DeviceBridgeImplementation().m80902d(xc00Var, jSONObject);
    }

    @Override // p153l.wc00
    /* JADX INFO: renamed from: v */
    public boolean mo47831v(@NonNull xc00 xc00Var, String str, String str2, JSONObject jSONObject) {
        str2.getClass();
        switch (str2) {
            case "getDeviceNotchInfo":
                m205740H(jSONObject, m210149L(xc00Var));
                return true;
            case "getSystemInfo":
                m205740H(jSONObject, m210150M(xc00Var, jSONObject));
                return true;
            case "getCityInfo":
                m205740H(jSONObject, m210148K());
                return true;
            default:
                return false;
        }
    }
}
