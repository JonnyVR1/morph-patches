package p153l;

import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class s0t0 {

    /* JADX INFO: renamed from: a */
    public final wit0 f165731a;

    /* JADX INFO: renamed from: b */
    public final String f165732b;

    public s0t0(wit0 wit0Var, String str) {
        this.f165731a = wit0Var;
        this.f165732b = str;
    }

    /* JADX INFO: renamed from: b */
    public final void m183978b(int i, int i2, int i3, int i4) {
        try {
            this.f165731a.mo13759q("onDefaultPositionReceived", new JSONObject().put(BaseSei.f14624X, i).put(BaseSei.f14625Y, i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            dct0.m115296e("Error occurred while dispatching default position.", e);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m183979c(String str) {
        try {
            JSONObject jSONObjectPut = new JSONObject().put("message", str).put("action", this.f165732b);
            wit0 wit0Var = this.f165731a;
            if (wit0Var != null) {
                wit0Var.mo13759q("onError", jSONObjectPut);
            }
        } catch (JSONException e) {
            dct0.m115296e("Error occurred while dispatching error event.", e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m183980d(String str) {
        try {
            this.f165731a.mo13759q("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e) {
            dct0.m115296e("Error occurred while dispatching ready Event.", e);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m183981e(int i, int i2, int i3, int i4, float f, int i5) {
        try {
            this.f165731a.mo13759q("onScreenInfoChanged", new JSONObject().put("width", i).put("height", i2).put("maxSizeWidth", i3).put("maxSizeHeight", i4).put("density", f).put(BLiveGiftItem.TYPE_ROTATION, i5));
        } catch (JSONException e) {
            dct0.m115296e("Error occurred while obtaining screen information.", e);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m183982f(int i, int i2, int i3, int i4) {
        try {
            this.f165731a.mo13759q("onSizeChanged", new JSONObject().put(BaseSei.f14624X, i).put(BaseSei.f14625Y, i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            dct0.m115296e("Error occurred while dispatching size change.", e);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m183983g(String str) {
        try {
            this.f165731a.mo13759q("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e) {
            dct0.m115296e("Error occurred while dispatching state change.", e);
        }
    }
}
