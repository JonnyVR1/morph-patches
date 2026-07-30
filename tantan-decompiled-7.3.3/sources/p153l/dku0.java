package p153l;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.util.C2098b;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.ads.zzbjb;
import com.google.android.gms.internal.ads.zzcei;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class dku0 implements cmu0 {

    /* JADX INFO: renamed from: B */
    public ytt0 f89445B;

    /* JADX INFO: renamed from: a */
    public final Context f89446a;

    /* JADX INFO: renamed from: b */
    public final fmu0 f89447b;

    /* JADX INFO: renamed from: c */
    public final JSONObject f89448c;

    /* JADX INFO: renamed from: d */
    public final qru0 f89449d;

    /* JADX INFO: renamed from: e */
    public final ulu0 f89450e;

    /* JADX INFO: renamed from: f */
    public final v2s0 f89451f;

    /* JADX INFO: renamed from: g */
    public final h7u0 f89452g;

    /* JADX INFO: renamed from: h */
    public final g6u0 f89453h;

    /* JADX INFO: renamed from: i */
    public final egu0 f89454i;

    /* JADX INFO: renamed from: j */
    public final q6w0 f89455j;

    /* JADX INFO: renamed from: k */
    public final zzcei f89456k;

    /* JADX INFO: renamed from: l */
    public final o7w0 f89457l;

    /* JADX INFO: renamed from: m */
    public final hvt0 f89458m;

    /* JADX INFO: renamed from: n */
    public final enu0 f89459n;

    /* JADX INFO: renamed from: o */
    public final Clock f89460o;

    /* JADX INFO: renamed from: p */
    public final agu0 f89461p;

    /* JADX INFO: renamed from: q */
    public final yew0 f89462q;

    /* JADX INFO: renamed from: r */
    public final cew0 f89463r;

    /* JADX INFO: renamed from: s */
    public final qbv0 f89464s;

    /* JADX INFO: renamed from: u */
    public boolean f89466u;

    /* JADX INFO: renamed from: t */
    public boolean f89465t = false;

    /* JADX INFO: renamed from: v */
    public boolean f89467v = false;

    /* JADX INFO: renamed from: w */
    public boolean f89468w = false;

    /* JADX INFO: renamed from: x */
    public Point f89469x = new Point();

    /* JADX INFO: renamed from: y */
    public Point f89470y = new Point();

    /* JADX INFO: renamed from: z */
    public long f89471z = 0;

    /* JADX INFO: renamed from: A */
    public long f89444A = 0;

    public dku0(Context context, fmu0 fmu0Var, JSONObject jSONObject, qru0 qru0Var, ulu0 ulu0Var, v2s0 v2s0Var, h7u0 h7u0Var, g6u0 g6u0Var, egu0 egu0Var, q6w0 q6w0Var, zzcei zzceiVar, o7w0 o7w0Var, hvt0 hvt0Var, enu0 enu0Var, Clock clock, agu0 agu0Var, yew0 yew0Var, cew0 cew0Var, qbv0 qbv0Var) {
        this.f89446a = context;
        this.f89447b = fmu0Var;
        this.f89448c = jSONObject;
        this.f89449d = qru0Var;
        this.f89450e = ulu0Var;
        this.f89451f = v2s0Var;
        this.f89452g = h7u0Var;
        this.f89453h = g6u0Var;
        this.f89454i = egu0Var;
        this.f89455j = q6w0Var;
        this.f89456k = zzceiVar;
        this.f89457l = o7w0Var;
        this.f89458m = hvt0Var;
        this.f89459n = enu0Var;
        this.f89460o = clock;
        this.f89461p = agu0Var;
        this.f89462q = yew0Var;
        this.f89463r = cew0Var;
        this.f89464s = qbv0Var;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: A */
    public final void m116680A(@Nullable View view, @Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable JSONObject jSONObject3, @Nullable JSONObject jSONObject4, @Nullable String str, @Nullable JSONObject jSONObject5, @Nullable JSONObject jSONObject6, boolean z, boolean z2) {
        String strMo165756c;
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.f89448c);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            jSONObject7.put("has_custom_click_handler", this.f89447b.m126327c(this.f89450e.m196591a()) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.f89450e.m196580P());
            jSONObject8.put("view_aware_api_used", z);
            zzbjb zzbjbVar = this.f89457l.f145323i;
            jSONObject8.put("custom_mute_requested", zzbjbVar != null && zzbjbVar.zzg);
            jSONObject8.put("custom_mute_enabled", (this.f89450e.m196604h().isEmpty() || this.f89450e.m196588X() == null) ? false : true);
            if (this.f89459n.m121561a() != null && this.f89448c.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject8.put("timestamp", this.f89460o.currentTimeMillis());
            if (this.f89468w && m116684v()) {
                jSONObject8.put("custom_click_gesture_eligible", true);
            }
            if (z2) {
                jSONObject8.put("is_custom_click_gesture", true);
            }
            jSONObject8.put("has_custom_click_handler", this.f89447b.m126327c(this.f89450e.m196591a()) != null);
            try {
                JSONObject jSONObjectOptJSONObject = this.f89448c.optJSONObject("tracking_urls_and_actions");
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject = new JSONObject();
                }
                strMo165756c = this.f89451f.m199147c().mo165756c(this.f89446a, jSONObjectOptJSONObject.optString("click_string"), view);
            } catch (Exception e) {
                dct0.m115296e("Exception obtaining click signals", e);
                strMo165756c = null;
            }
            jSONObject8.put("click_signals", strMo165756c);
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168550z4)).booleanValue()) {
                jSONObject8.put("open_chrome_custom_tab", true);
            }
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168530x8)).booleanValue() && PlatformVersion.isAtLeastR()) {
                jSONObject8.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168542y8)).booleanValue() && PlatformVersion.isAtLeastR()) {
                jSONObject8.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject7.put("click", jSONObject8);
            JSONObject jSONObject9 = new JSONObject();
            long jCurrentTimeMillis = this.f89460o.currentTimeMillis();
            jSONObject9.put("time_from_last_touch_down", jCurrentTimeMillis - this.f89471z);
            jSONObject9.put("time_from_last_touch", jCurrentTimeMillis - this.f89444A);
            jSONObject7.put("touch_signal", jSONObject9);
            if (this.f89455j.f155892j0) {
                JSONObject jSONObject10 = (JSONObject) this.f89448c.get("tracking_urls_and_actions");
                String string = jSONObject10 != null ? jSONObject10.getString("gws_query_id") : null;
                if (string != null) {
                    this.f89464s.m176088w8(string, this.f89450e);
                }
            }
            rct0.m180821a(this.f89449d.m177702d("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e2) {
            dct0.m115296e("Unable to create click JSON.", e2);
        }
    }

    @Override // p153l.cmu0
    /* JADX INFO: renamed from: J */
    public final boolean mo111316J() {
        return m116684v();
    }

    @Override // p153l.cmu0
    /* JADX INFO: renamed from: a */
    public final void mo111317a(View view, @Nullable View view2, @Nullable Map map, @Nullable Map map2, boolean z, @Nullable ImageView.ScaleType scaleType) {
        Context context = this.f89446a;
        JSONObject jSONObjectM114238d = d4t0.m114238d(context, map, map2, view2, scaleType);
        JSONObject jSONObjectM114241g = d4t0.m114241g(context, view2);
        JSONObject jSONObjectM114240f = d4t0.m114240f(view2);
        JSONObject jSONObjectM114239e = d4t0.m114239e(context, view2);
        String strM116682r = m116682r(view, map);
        m116680A(true == ((Boolean) jas0.m144075c().m176505a(sgs0.f168513w3)).booleanValue() ? view2 : view, jSONObjectM114241g, jSONObjectM114238d, jSONObjectM114240f, jSONObjectM114239e, strM116682r, d4t0.m114237c(strM116682r, context, this.f89470y, this.f89469x), null, z, false);
    }

    @Override // p153l.cmu0
    /* JADX INFO: renamed from: b */
    public final void mo111318b() {
        this.f89468w = true;
    }

    @Override // p153l.cmu0
    /* JADX INFO: renamed from: c */
    public final void mo111319c(@Nullable czt0 czt0Var) {
        try {
            if (this.f89467v) {
                return;
            }
            if (czt0Var == null) {
                ulu0 ulu0Var = this.f89450e;
                if (ulu0Var.m196588X() != null) {
                    this.f89467v = true;
                    this.f89462q.m215479c(ulu0Var.m196588X().zzf(), this.f89463r);
                    zzg();
                    return;
                }
            }
            this.f89467v = true;
            this.f89462q.m215479c(czt0Var.zzf(), this.f89463r);
            zzg();
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
        }
    }

    @Override // p153l.cmu0
    /* JADX INFO: renamed from: d */
    public final boolean mo111320d(Bundle bundle) {
        if (m116683s("impression_reporting")) {
            return m116685w(null, null, null, null, ((Boolean) jas0.m144075c().m176505a(sgs0.f168106Pa)).booleanValue() ? m116681q(null) : null, k6s0.m148569b().m167057l(bundle, null), false);
        }
        dct0.m115295d("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
        return false;
    }

    @Override // p153l.cmu0
    @Nullable
    /* JADX INFO: renamed from: e */
    public final JSONObject mo111321e(@Nullable View view, @Nullable Map map, @Nullable Map map2, @Nullable ImageView.ScaleType scaleType) {
        Context context = this.f89446a;
        JSONObject jSONObjectM114238d = d4t0.m114238d(context, map, map2, view, scaleType);
        JSONObject jSONObjectM114241g = d4t0.m114241g(context, view);
        JSONObject jSONObjectM114240f = d4t0.m114240f(view);
        JSONObject jSONObjectM114239e = d4t0.m114239e(context, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", jSONObjectM114238d);
            jSONObject.put("ad_view_signal", jSONObjectM114241g);
            jSONObject.put("scroll_view_signal", jSONObjectM114240f);
            jSONObject.put("lock_screen_signal", jSONObjectM114239e);
            return jSONObject;
        } catch (JSONException e) {
            dct0.m115296e("Unable to create native ad view signals JSON.", e);
            return null;
        }
    }

    @Override // p153l.cmu0
    /* JADX INFO: renamed from: f */
    public final void mo111322f(@Nullable View view, @Nullable View view2, @Nullable Map map, @Nullable Map map2, boolean z, @Nullable ImageView.ScaleType scaleType, int i) {
        JSONObject jSONObject;
        boolean z2 = false;
        if (this.f89448c.optBoolean("allow_sdk_custom_click_gesture", false)) {
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168166Ua)).booleanValue()) {
                z2 = true;
            }
        }
        if (!z2) {
            if (!this.f89468w) {
                dct0.m115293b("Custom click reporting failed. enableCustomClickGesture is not set.");
                return;
            } else if (!m116684v()) {
                dct0.m115293b("Custom click reporting failed. Ad unit id not in the allow list.");
                return;
            }
        }
        JSONObject jSONObjectM114238d = d4t0.m114238d(this.f89446a, map, map2, view2, scaleType);
        JSONObject jSONObjectM114241g = d4t0.m114241g(this.f89446a, view2);
        boolean z3 = z2;
        JSONObject jSONObjectM114240f = d4t0.m114240f(view2);
        JSONObject jSONObjectM114239e = d4t0.m114239e(this.f89446a, view2);
        String strM116682r = m116682r(view, map);
        JSONObject jSONObjectM114237c = d4t0.m114237c(strM116682r, this.f89446a, this.f89470y, this.f89469x);
        if (z3) {
            try {
                JSONObject jSONObject2 = this.f89448c;
                Point point = this.f89470y;
                Point point2 = this.f89469x;
                try {
                    jSONObject = new JSONObject();
                    try {
                        JSONObject jSONObject3 = new JSONObject();
                        JSONObject jSONObject4 = new JSONObject();
                        if (point != null) {
                            jSONObject3.put(BaseSei.f14624X, point.x);
                            jSONObject3.put(BaseSei.f14625Y, point.y);
                        }
                        if (point2 != null) {
                            jSONObject4.put(BaseSei.f14624X, point2.x);
                            jSONObject4.put(BaseSei.f14625Y, point2.y);
                        }
                        jSONObject.put("start_point", jSONObject3);
                        jSONObject.put("end_point", jSONObject4);
                        jSONObject.put("duration_ms", i);
                    } catch (Exception e) {
                        e = e;
                        dct0.m115296e("Error occurred while grabbing custom click gesture signals.", e);
                    }
                } catch (Exception e2) {
                    e = e2;
                    jSONObject = null;
                }
                jSONObject2.put("custom_click_gesture_signal", jSONObject);
            } catch (JSONException e3) {
                dct0.m115296e("Error occurred while adding CustomClickGestureSignals to adJson.", e3);
                bxy0.m106933q().m120275w(e3, "FirstPartyNativeAdCore.performCustomClickGesture");
            }
        }
        m116680A(view2, jSONObjectM114241g, jSONObjectM114238d, jSONObjectM114240f, jSONObjectM114239e, strM116682r, jSONObjectM114237c, null, z, true);
    }

    @Override // p153l.cmu0
    @Nullable
    /* JADX INFO: renamed from: g */
    public final JSONObject mo111323g(@Nullable View view, @Nullable Map map, @Nullable Map map2, @Nullable ImageView.ScaleType scaleType) {
        JSONObject jSONObjectMo111321e = mo111321e(view, map, map2, scaleType);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f89468w && m116684v()) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (jSONObjectMo111321e != null) {
                jSONObject.put("nas", jSONObjectMo111321e);
            }
            return jSONObject;
        } catch (JSONException e) {
            dct0.m115296e("Unable to create native click meta data JSON.", e);
            return jSONObject;
        }
    }

    @Override // p153l.cmu0
    /* JADX INFO: renamed from: h */
    public final void mo111324h(@Nullable View view, MotionEvent motionEvent, @Nullable View view2) {
        this.f89469x = d4t0.m114235a(motionEvent, view2);
        long jCurrentTimeMillis = this.f89460o.currentTimeMillis();
        this.f89444A = jCurrentTimeMillis;
        if (motionEvent.getAction() == 0) {
            this.f89471z = jCurrentTimeMillis;
            this.f89470y = this.f89469x;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        Point point = this.f89469x;
        motionEventObtain.setLocation(point.x, point.y);
        this.f89451f.m199148d(motionEventObtain);
        motionEventObtain.recycle();
    }

    @Override // p153l.cmu0
    /* JADX INFO: renamed from: i */
    public final void mo111325i(@Nullable View view, @Nullable Map map, @Nullable Map map2, @Nullable ImageView.ScaleType scaleType) {
        Context context = this.f89446a;
        m116685w(d4t0.m114241g(context, view), d4t0.m114238d(context, map, map2, view, scaleType), d4t0.m114240f(view), d4t0.m114239e(context, view), m116681q(view), null, d4t0.m114242h(context, this.f89455j));
    }

    @Override // p153l.cmu0
    /* JADX INFO: renamed from: j */
    public final void mo111326j(@Nullable Bundle bundle) {
        if (bundle == null) {
            dct0.m115293b("Click data is null. No click is reported.");
        } else if (!m116683s("click_reporting")) {
            dct0.m115295d("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
        } else {
            Bundle bundle2 = bundle.getBundle("click_signal");
            m116680A(null, null, null, null, null, bundle2 != null ? bundle2.getString("asset_id") : null, null, k6s0.m148569b().m167057l(bundle, null), false, false);
        }
    }

    @Override // p153l.cmu0
    /* JADX INFO: renamed from: k */
    public final void mo111327k(@Nullable View view, @Nullable Map map) {
        this.f89469x = new Point();
        this.f89470y = new Point();
        if (view != null) {
            this.f89461p.m97734z0(view);
        }
        this.f89466u = false;
    }

    @Override // p153l.cmu0
    /* JADX INFO: renamed from: l */
    public final void mo111328l(View view) {
        if (!this.f89448c.optBoolean("custom_one_point_five_click_enabled", false)) {
            dct0.m115298g("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        enu0 enu0Var = this.f89459n;
        if (view == null) {
            return;
        }
        view.setOnClickListener(enu0Var);
        view.setClickable(true);
        enu0Var.f94835g = new WeakReference(view);
    }

    @Override // p153l.cmu0
    /* JADX INFO: renamed from: m */
    public final void mo111329m(View view, @Nullable Map map, @Nullable Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.f89469x = new Point();
        this.f89470y = new Point();
        if (!this.f89466u) {
            this.f89461p.m97733w0(view);
            this.f89466u = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.f89458m.m137397k(this);
        boolean zM114243i = d4t0.m114243i(this.f89456k.zzc);
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                View view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (view2 != null) {
                    if (zM114243i) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            Iterator it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                View view3 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                if (view3 != null) {
                    if (zM114243i) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // p153l.cmu0
    /* JADX INFO: renamed from: n */
    public final void mo111330n(@Nullable Bundle bundle) {
        if (bundle == null) {
            dct0.m115293b("Touch event data is null. No touch event is reported.");
            return;
        }
        if (!m116683s("touch_reporting")) {
            dct0.m115295d("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
            return;
        }
        this.f89451f.m199147c().mo165755b((int) bundle.getFloat(BaseSei.f14624X), (int) bundle.getFloat(BaseSei.f14625Y), bundle.getInt("duration_ms"));
    }

    @Override // p153l.cmu0
    /* JADX INFO: renamed from: o */
    public final void mo111331o(kns0 kns0Var) {
        if (this.f89448c.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.f89459n.m121563c(kns0Var);
        } else {
            dct0.m115298g("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        }
    }

    @Override // p153l.cmu0
    /* JADX INFO: renamed from: p */
    public final void mo111332p(ytt0 ytt0Var) {
        this.f89445B = ytt0Var;
    }

    @Nullable
    /* JADX INFO: renamed from: q */
    public final String m116681q(View view) {
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168426p3)).booleanValue()) {
            return null;
        }
        try {
            return this.f89451f.m199147c().mo165761h(this.f89446a, view, null);
        } catch (Exception unused) {
            dct0.m115295d("Exception getting data.");
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: r */
    public final String m116682r(@Nullable View view, @Nullable Map map) {
        if (map != null && view != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    return (String) entry.getKey();
                }
            }
        }
        int iM196580P = this.f89450e.m196580P();
        if (iM196580P == 1) {
            return "1099";
        }
        if (iM196580P == 2) {
            return "2099";
        }
        if (iM196580P != 6) {
            return null;
        }
        return "3099";
    }

    /* JADX INFO: renamed from: s */
    public final boolean m116683s(String str) {
        JSONObject jSONObjectOptJSONObject = this.f89448c.optJSONObject("allow_pub_event_reporting");
        return jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean(str, false);
    }

    @Override // p153l.cmu0
    /* JADX INFO: renamed from: t */
    public final boolean mo111333t() {
        if (zza() == 0) {
            return true;
        }
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168166Ua)).booleanValue()) {
            return this.f89457l.f145323i.zzj;
        }
        return true;
    }

    @Override // p153l.cmu0
    /* JADX INFO: renamed from: u */
    public final void mo111334u(String str) {
        m116680A(null, null, null, null, null, str, null, null, false, false);
    }

    /* JADX INFO: renamed from: v */
    public final boolean m116684v() {
        return this.f89448c.optBoolean("allow_custom_click_gesture", false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w */
    public final boolean m116685w(@Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable JSONObject jSONObject3, @Nullable JSONObject jSONObject4, @Nullable String str, @Nullable JSONObject jSONObject5, boolean z) {
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.f89448c);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168426p3)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z);
            Context context = this.f89446a;
            JSONObject jSONObject7 = new JSONObject();
            bxy0.m106934r();
            DisplayMetrics displayMetricsM12354U = C2098b.m12354U((WindowManager) context.getSystemService(BLiveBottomPopupStyleTypeEnum.window));
            zju0 zju0Var = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            try {
                jSONObject7.put("width", k6s0.m148569b().m167053e(context, displayMetricsM12354U.widthPixels));
                jSONObject7.put("height", k6s0.m148569b().m167053e(context, displayMetricsM12354U.heightPixels));
            } catch (JSONException unused) {
                jSONObject7 = null;
            }
            jSONObject6.put("screen", jSONObject7);
            boolean zBooleanValue = ((Boolean) jas0.m144075c().m176505a(sgs0.f168482t8)).booleanValue();
            qru0 qru0Var = this.f89449d;
            if (zBooleanValue) {
                qru0Var.m177707i("/clickRecorded", new aku0(this, zju0Var));
            } else {
                qru0Var.m177707i("/logScionEvent", new yju0(this, objArr == true ? 1 : 0));
            }
            this.f89449d.m177707i("/nativeImpression", new cku0(this, objArr2 == true ? 1 : 0));
            rct0.m180821a(this.f89449d.m177702d("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            if (this.f89465t) {
                return true;
            }
            this.f89465t = bxy0.m106937u().m114545n(this.f89446a, this.f89456k.zza, this.f89455j.f155850D.toString(), this.f89457l.f145320f);
            return true;
        } catch (JSONException e) {
            dct0.m115296e("Unable to create impression JSON.", e);
            return false;
        }
    }

    @Override // p153l.cmu0
    public final int zza() {
        if (this.f89457l.f145323i == null) {
            return 0;
        }
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168166Ua)).booleanValue()) {
            return this.f89457l.f145323i.zzi;
        }
        return 0;
    }

    @Override // p153l.cmu0
    public final void zzg() {
        try {
            ytt0 ytt0Var = this.f89445B;
            if (ytt0Var != null) {
                ytt0Var.zze();
            }
        } catch (RemoteException e) {
            dct0.m115300i("#007 Could not call remote method.", e);
        }
    }

    @Override // p153l.cmu0
    public final void zzh() {
        if (this.f89448c.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.f89459n.m121562b();
        }
    }

    @Override // p153l.cmu0
    public final void zzi() {
        this.f89449d.m177704f();
    }

    @Override // p153l.cmu0
    public final void zzp() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.f89448c);
            rct0.m180821a(this.f89449d.m177702d("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e) {
            dct0.m115296e("", e);
        }
    }

    @Override // p153l.cmu0
    public final void zzr() {
        m116685w(null, null, null, null, null, null, false);
    }
}
