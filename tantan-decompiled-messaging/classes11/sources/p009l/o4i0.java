package p009l;

import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.p004ui.jsbridge.implement.DeviceBridgeImplementation;
import com.p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.CrashHelper;
import immomo.com.mklibrary.core.base.ui.MKWebView;
import l.f16;
import l.qib0;
import l.xdl0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class o4i0 extends e400 {
    public o4i0(PutongAct putongAct, String str, MKWebView mKWebView) {
        super(putongAct, str, mKWebView);
    }

    /* JADX INFO: renamed from: C */
    public final String m19613C() {
        if (!qib0.c0.signedIn_()) {
            return "";
        }
        String str = qib0.c0.queryMe().location.region.city;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cityName", str);
            return jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.c(e);
            return "";
        }
    }

    /* JADX INFO: renamed from: D */
    public final String m19614D(@NonNull f400 f400Var) {
        boolean zM25895h = zo40.m25895h(f400Var.mo12184c());
        int iM25888a = zo40.m25888a(f400Var.mo12184c());
        float f = f16.a().getResources().getDisplayMetrics().density;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isNotch", zM25895h);
            if (f != 0.0f) {
                jSONObject.put("notchHeight", iM25888a / f);
            }
            jSONObject.put("statusBarHeight", xdl0.F0() / f);
            return jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.c(e);
            return "";
        }
    }

    /* JADX INFO: renamed from: E */
    public final String m19615E(@NonNull f400 f400Var, JSONObject jSONObject) {
        return new DeviceBridgeImplementation().m10041d(f400Var, jSONObject);
    }

    @Override // p009l.e400
    /* JADX INFO: renamed from: n */
    public boolean mo10568n(@NonNull f400 f400Var, String str, String str2, JSONObject jSONObject) {
        str2.getClass();
        switch (str2) {
            case "getDeviceNotchInfo":
                m13720z(jSONObject, m19614D(f400Var));
                return true;
            case "getSystemInfo":
                m13720z(jSONObject, m19615E(f400Var, jSONObject));
                return true;
            case "getCityInfo":
                m13720z(jSONObject, m19613C());
                return true;
            default:
                return false;
        }
    }
}
