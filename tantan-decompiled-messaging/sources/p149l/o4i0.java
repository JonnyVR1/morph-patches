package p149l;

import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.p065ui.jsbridge.implement.DeviceBridgeImplementation;
import com.tantanapp.common.utils.CrashHelper;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class o4i0 extends e400 {
    public o4i0(PutongAct putongAct, String str, MKWebView mKWebView) {
        super(putongAct, str, mKWebView);
    }

    /* JADX INFO: renamed from: C */
    public final String m162596C() {
        if (!qib0.f154714c0.signedIn_()) {
            return "";
        }
        String str = qib0.f154714c0.queryMe().location.region.city;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cityName", str);
            return jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
            return "";
        }
    }

    /* JADX INFO: renamed from: D */
    public final String m162597D(@NonNull f400 f400Var) {
        boolean zM219551h = zo40.m219551h(f400Var.mo102961c());
        int iM219544a = zo40.m219544a(f400Var.mo102961c());
        float f = f16.m119092a().getResources().getDisplayMetrics().density;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isNotch", zM219551h);
            if (f != 0.0f) {
                jSONObject.put("notchHeight", iM219544a / f);
            }
            jSONObject.put("statusBarHeight", xdl0.m208331F0() / f);
            return jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
            return "";
        }
    }

    /* JADX INFO: renamed from: E */
    public final String m162598E(@NonNull f400 f400Var, JSONObject jSONObject) {
        return new DeviceBridgeImplementation().m79719d(f400Var, jSONObject);
    }

    @Override // p149l.e400
    /* JADX INFO: renamed from: n */
    public boolean mo46640n(@NonNull f400 f400Var, String str, String str2, JSONObject jSONObject) {
        str2.getClass();
        switch (str2) {
            case "getDeviceNotchInfo":
                m114661z(jSONObject, m162597D(f400Var));
                return true;
            case "getSystemInfo":
                m114661z(jSONObject, m162598E(f400Var, jSONObject));
                return true;
            case "getCityInfo":
                m114661z(jSONObject, m162596C());
                return true;
            default:
                return false;
        }
    }
}
