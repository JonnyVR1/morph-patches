package p149l;

import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class mrs0 {

    /* JADX INFO: renamed from: a */
    public final q9t0 f135409a;

    /* JADX INFO: renamed from: b */
    public final String f135410b;

    public mrs0(q9t0 q9t0Var, String str) {
        this.f135409a = q9t0Var;
        this.f135410b = str;
    }

    /* JADX INFO: renamed from: b */
    public final void m156079b(int i, int i2, int i3, int i4) {
        try {
            this.f135409a.mo13705q("onDefaultPositionReceived", new JSONObject().put(BaseSei.f13930X, i).put(BaseSei.f13931Y, i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            x2t0.m206867e("Error occurred while dispatching default position.", e);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m156080c(String str) {
        try {
            JSONObject jSONObjectPut = new JSONObject().put("message", str).put("action", this.f135410b);
            q9t0 q9t0Var = this.f135409a;
            if (q9t0Var != null) {
                q9t0Var.mo13705q("onError", jSONObjectPut);
            }
        } catch (JSONException e) {
            x2t0.m206867e("Error occurred while dispatching error event.", e);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m156081d(String str) {
        try {
            this.f135409a.mo13705q("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e) {
            x2t0.m206867e("Error occurred while dispatching ready Event.", e);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m156082e(int i, int i2, int i3, int i4, float f, int i5) {
        try {
            this.f135409a.mo13705q("onScreenInfoChanged", new JSONObject().put("width", i).put("height", i2).put("maxSizeWidth", i3).put("maxSizeHeight", i4).put("density", f).put(BLiveGiftItem.TYPE_ROTATION, i5));
        } catch (JSONException e) {
            x2t0.m206867e("Error occurred while obtaining screen information.", e);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m156083f(int i, int i2, int i3, int i4) {
        try {
            this.f135409a.mo13705q("onSizeChanged", new JSONObject().put(BaseSei.f13930X, i).put(BaseSei.f13931Y, i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            x2t0.m206867e("Error occurred while dispatching size change.", e);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m156084g(String str) {
        try {
            this.f135409a.mo13705q("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e) {
            x2t0.m206867e("Error occurred while dispatching state change.", e);
        }
    }
}
