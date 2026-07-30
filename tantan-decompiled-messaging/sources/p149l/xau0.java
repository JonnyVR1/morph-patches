package p149l;

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
import com.google.android.gms.ads.internal.util.C2075b;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.ads.zzbjb;
import com.google.android.gms.internal.ads.zzcei;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class xau0 implements wcu0 {

    /* JADX INFO: renamed from: B */
    public skt0 f191818B;

    /* JADX INFO: renamed from: a */
    public final Context f191819a;

    /* JADX INFO: renamed from: b */
    public final zcu0 f191820b;

    /* JADX INFO: renamed from: c */
    public final JSONObject f191821c;

    /* JADX INFO: renamed from: d */
    public final kiu0 f191822d;

    /* JADX INFO: renamed from: e */
    public final ocu0 f191823e;

    /* JADX INFO: renamed from: f */
    public final ptr0 f191824f;

    /* JADX INFO: renamed from: g */
    public final byt0 f191825g;

    /* JADX INFO: renamed from: h */
    public final axt0 f191826h;

    /* JADX INFO: renamed from: i */
    public final y6u0 f191827i;

    /* JADX INFO: renamed from: j */
    public final kxv0 f191828j;

    /* JADX INFO: renamed from: k */
    public final zzcei f191829k;

    /* JADX INFO: renamed from: l */
    public final iyv0 f191830l;

    /* JADX INFO: renamed from: m */
    public final bmt0 f191831m;

    /* JADX INFO: renamed from: n */
    public final ydu0 f191832n;

    /* JADX INFO: renamed from: o */
    public final Clock f191833o;

    /* JADX INFO: renamed from: p */
    public final u6u0 f191834p;

    /* JADX INFO: renamed from: q */
    public final s5w0 f191835q;

    /* JADX INFO: renamed from: r */
    public final w4w0 f191836r;

    /* JADX INFO: renamed from: s */
    public final k2v0 f191837s;

    /* JADX INFO: renamed from: u */
    public boolean f191839u;

    /* JADX INFO: renamed from: t */
    public boolean f191838t = false;

    /* JADX INFO: renamed from: v */
    public boolean f191840v = false;

    /* JADX INFO: renamed from: w */
    public boolean f191841w = false;

    /* JADX INFO: renamed from: x */
    public Point f191842x = new Point();

    /* JADX INFO: renamed from: y */
    public Point f191843y = new Point();

    /* JADX INFO: renamed from: z */
    public long f191844z = 0;

    /* JADX INFO: renamed from: A */
    public long f191817A = 0;

    public xau0(Context context, zcu0 zcu0Var, JSONObject jSONObject, kiu0 kiu0Var, ocu0 ocu0Var, ptr0 ptr0Var, byt0 byt0Var, axt0 axt0Var, y6u0 y6u0Var, kxv0 kxv0Var, zzcei zzceiVar, iyv0 iyv0Var, bmt0 bmt0Var, ydu0 ydu0Var, Clock clock, u6u0 u6u0Var, s5w0 s5w0Var, w4w0 w4w0Var, k2v0 k2v0Var) {
        this.f191819a = context;
        this.f191820b = zcu0Var;
        this.f191821c = jSONObject;
        this.f191822d = kiu0Var;
        this.f191823e = ocu0Var;
        this.f191824f = ptr0Var;
        this.f191825g = byt0Var;
        this.f191826h = axt0Var;
        this.f191827i = y6u0Var;
        this.f191828j = kxv0Var;
        this.f191829k = zzceiVar;
        this.f191830l = iyv0Var;
        this.f191831m = bmt0Var;
        this.f191832n = ydu0Var;
        this.f191833o = clock;
        this.f191834p = u6u0Var;
        this.f191835q = s5w0Var;
        this.f191836r = w4w0Var;
        this.f191837s = k2v0Var;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: A */
    public final void m207673A(@Nullable View view, @Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable JSONObject jSONObject3, @Nullable JSONObject jSONObject4, @Nullable String str, @Nullable JSONObject jSONObject5, @Nullable JSONObject jSONObject6, boolean z, boolean z2) {
        String strMo136906c;
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.f191821c);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            jSONObject7.put("has_custom_click_handler", this.f191820b.m218104c(this.f191823e.m163584a()) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.f191823e.m163573P());
            jSONObject8.put("view_aware_api_used", z);
            zzbjb zzbjbVar = this.f191830l.f115499i;
            jSONObject8.put("custom_mute_requested", zzbjbVar != null && zzbjbVar.zzg);
            jSONObject8.put("custom_mute_enabled", (this.f191823e.m163597h().isEmpty() || this.f191823e.m163581X() == null) ? false : true);
            if (this.f191832n.m214327a() != null && this.f191821c.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject8.put("timestamp", this.f191833o.currentTimeMillis());
            if (this.f191841w && m207677v()) {
                jSONObject8.put("custom_click_gesture_eligible", true);
            }
            if (z2) {
                jSONObject8.put("is_custom_click_gesture", true);
            }
            jSONObject8.put("has_custom_click_handler", this.f191820b.m218104c(this.f191823e.m163584a()) != null);
            try {
                JSONObject jSONObjectOptJSONObject = this.f191821c.optJSONObject("tracking_urls_and_actions");
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject = new JSONObject();
                }
                strMo136906c = this.f191824f.m171378c().mo136906c(this.f191819a, jSONObjectOptJSONObject.optString("click_string"), view);
            } catch (Exception e) {
                x2t0.m206867e("Exception obtaining click signals", e);
                strMo136906c = null;
            }
            jSONObject8.put("click_signals", strMo136906c);
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132479z4)).booleanValue()) {
                jSONObject8.put("open_chrome_custom_tab", true);
            }
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132459x8)).booleanValue() && PlatformVersion.isAtLeastR()) {
                jSONObject8.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132471y8)).booleanValue() && PlatformVersion.isAtLeastR()) {
                jSONObject8.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject7.put("click", jSONObject8);
            JSONObject jSONObject9 = new JSONObject();
            long jCurrentTimeMillis = this.f191833o.currentTimeMillis();
            jSONObject9.put("time_from_last_touch_down", jCurrentTimeMillis - this.f191844z);
            jSONObject9.put("time_from_last_touch", jCurrentTimeMillis - this.f191817A);
            jSONObject7.put("touch_signal", jSONObject9);
            if (this.f191828j.f125202j0) {
                JSONObject jSONObject10 = (JSONObject) this.f191821c.get("tracking_urls_and_actions");
                String string = jSONObject10 != null ? jSONObject10.getString("gws_query_id") : null;
                if (string != null) {
                    this.f191837s.m144351w8(string, this.f191823e);
                }
            }
            l3t0.m148407a(this.f191822d.m146139d("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e2) {
            x2t0.m206867e("Unable to create click JSON.", e2);
        }
    }

    @Override // p149l.wcu0
    /* JADX INFO: renamed from: J */
    public final boolean mo101566J() {
        return m207677v();
    }

    @Override // p149l.wcu0
    /* JADX INFO: renamed from: a */
    public final void mo101567a(View view, @Nullable View view2, @Nullable Map map, @Nullable Map map2, boolean z, @Nullable ImageView.ScaleType scaleType) {
        Context context = this.f191819a;
        JSONObject jSONObjectM211187d = xus0.m211187d(context, map, map2, view2, scaleType);
        JSONObject jSONObjectM211190g = xus0.m211190g(context, view2);
        JSONObject jSONObjectM211189f = xus0.m211189f(view2);
        JSONObject jSONObjectM211188e = xus0.m211188e(context, view2);
        String strM207675r = m207675r(view, map);
        m207673A(true == ((Boolean) d1s0.m109677c().m144697a(m7s0.f132442w3)).booleanValue() ? view2 : view, jSONObjectM211190g, jSONObjectM211187d, jSONObjectM211189f, jSONObjectM211188e, strM207675r, xus0.m211186c(strM207675r, context, this.f191843y, this.f191842x), null, z, false);
    }

    @Override // p149l.wcu0
    /* JADX INFO: renamed from: b */
    public final void mo101568b() {
        this.f191841w = true;
    }

    @Override // p149l.wcu0
    /* JADX INFO: renamed from: c */
    public final void mo101569c(@Nullable wpt0 wpt0Var) {
        try {
            if (this.f191840v) {
                return;
            }
            if (wpt0Var == null) {
                ocu0 ocu0Var = this.f191823e;
                if (ocu0Var.m163581X() != null) {
                    this.f191840v = true;
                    this.f191835q.m182382c(ocu0Var.m163581X().zzf(), this.f191836r);
                    zzg();
                    return;
                }
            }
            this.f191840v = true;
            this.f191835q.m182382c(wpt0Var.zzf(), this.f191836r);
            zzg();
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
        }
    }

    @Override // p149l.wcu0
    /* JADX INFO: renamed from: d */
    public final boolean mo101570d(Bundle bundle) {
        if (m207676s("impression_reporting")) {
            return m207678w(null, null, null, null, ((Boolean) d1s0.m109677c().m144697a(m7s0.f132035Pa)).booleanValue() ? m207674q(null) : null, exr0.m118703b().m134104l(bundle, null), false);
        }
        x2t0.m206866d("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
        return false;
    }

    @Override // p149l.wcu0
    @Nullable
    /* JADX INFO: renamed from: e */
    public final JSONObject mo101571e(@Nullable View view, @Nullable Map map, @Nullable Map map2, @Nullable ImageView.ScaleType scaleType) {
        Context context = this.f191819a;
        JSONObject jSONObjectM211187d = xus0.m211187d(context, map, map2, view, scaleType);
        JSONObject jSONObjectM211190g = xus0.m211190g(context, view);
        JSONObject jSONObjectM211189f = xus0.m211189f(view);
        JSONObject jSONObjectM211188e = xus0.m211188e(context, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", jSONObjectM211187d);
            jSONObject.put("ad_view_signal", jSONObjectM211190g);
            jSONObject.put("scroll_view_signal", jSONObjectM211189f);
            jSONObject.put("lock_screen_signal", jSONObjectM211188e);
            return jSONObject;
        } catch (JSONException e) {
            x2t0.m206867e("Unable to create native ad view signals JSON.", e);
            return null;
        }
    }

    @Override // p149l.wcu0
    /* JADX INFO: renamed from: f */
    public final void mo101572f(@Nullable View view, @Nullable View view2, @Nullable Map map, @Nullable Map map2, boolean z, @Nullable ImageView.ScaleType scaleType, int i) {
        JSONObject jSONObject;
        boolean z2 = false;
        if (this.f191821c.optBoolean("allow_sdk_custom_click_gesture", false)) {
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132095Ua)).booleanValue()) {
                z2 = true;
            }
        }
        if (!z2) {
            if (!this.f191841w) {
                x2t0.m206864b("Custom click reporting failed. enableCustomClickGesture is not set.");
                return;
            } else if (!m207677v()) {
                x2t0.m206864b("Custom click reporting failed. Ad unit id not in the allow list.");
                return;
            }
        }
        JSONObject jSONObjectM211187d = xus0.m211187d(this.f191819a, map, map2, view2, scaleType);
        JSONObject jSONObjectM211190g = xus0.m211190g(this.f191819a, view2);
        boolean z3 = z2;
        JSONObject jSONObjectM211189f = xus0.m211189f(view2);
        JSONObject jSONObjectM211188e = xus0.m211188e(this.f191819a, view2);
        String strM207675r = m207675r(view, map);
        JSONObject jSONObjectM211186c = xus0.m211186c(strM207675r, this.f191819a, this.f191843y, this.f191842x);
        if (z3) {
            try {
                JSONObject jSONObject2 = this.f191821c;
                Point point = this.f191843y;
                Point point2 = this.f191842x;
                try {
                    jSONObject = new JSONObject();
                    try {
                        JSONObject jSONObject3 = new JSONObject();
                        JSONObject jSONObject4 = new JSONObject();
                        if (point != null) {
                            jSONObject3.put(BaseSei.f13930X, point.x);
                            jSONObject3.put(BaseSei.f13931Y, point.y);
                        }
                        if (point2 != null) {
                            jSONObject4.put(BaseSei.f13930X, point2.x);
                            jSONObject4.put(BaseSei.f13931Y, point2.y);
                        }
                        jSONObject.put("start_point", jSONObject3);
                        jSONObject.put("end_point", jSONObject4);
                        jSONObject.put("duration_ms", i);
                    } catch (Exception e) {
                        e = e;
                        x2t0.m206867e("Error occurred while grabbing custom click gesture signals.", e);
                    }
                } catch (Exception e2) {
                    e = e2;
                    jSONObject = null;
                }
                jSONObject2.put("custom_click_gesture_signal", jSONObject);
            } catch (JSONException e3) {
                x2t0.m206867e("Error occurred while adding CustomClickGestureSignals to adJson.", e3);
                vny0.m199079q().m212290w(e3, "FirstPartyNativeAdCore.performCustomClickGesture");
            }
        }
        m207673A(view2, jSONObjectM211190g, jSONObjectM211187d, jSONObjectM211189f, jSONObjectM211188e, strM207675r, jSONObjectM211186c, null, z, true);
    }

    @Override // p149l.wcu0
    @Nullable
    /* JADX INFO: renamed from: g */
    public final JSONObject mo101573g(@Nullable View view, @Nullable Map map, @Nullable Map map2, @Nullable ImageView.ScaleType scaleType) {
        JSONObject jSONObjectMo101571e = mo101571e(view, map, map2, scaleType);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f191841w && m207677v()) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (jSONObjectMo101571e != null) {
                jSONObject.put("nas", jSONObjectMo101571e);
            }
            return jSONObject;
        } catch (JSONException e) {
            x2t0.m206867e("Unable to create native click meta data JSON.", e);
            return jSONObject;
        }
    }

    @Override // p149l.wcu0
    /* JADX INFO: renamed from: h */
    public final void mo101574h(@Nullable View view, MotionEvent motionEvent, @Nullable View view2) {
        this.f191842x = xus0.m211184a(motionEvent, view2);
        long jCurrentTimeMillis = this.f191833o.currentTimeMillis();
        this.f191817A = jCurrentTimeMillis;
        if (motionEvent.getAction() == 0) {
            this.f191844z = jCurrentTimeMillis;
            this.f191843y = this.f191842x;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        Point point = this.f191842x;
        motionEventObtain.setLocation(point.x, point.y);
        this.f191824f.m171379d(motionEventObtain);
        motionEventObtain.recycle();
    }

    @Override // p149l.wcu0
    /* JADX INFO: renamed from: i */
    public final void mo101575i(@Nullable View view, @Nullable Map map, @Nullable Map map2, @Nullable ImageView.ScaleType scaleType) {
        Context context = this.f191819a;
        m207678w(xus0.m211190g(context, view), xus0.m211187d(context, map, map2, view, scaleType), xus0.m211189f(view), xus0.m211188e(context, view), m207674q(view), null, xus0.m211191h(context, this.f191828j));
    }

    @Override // p149l.wcu0
    /* JADX INFO: renamed from: j */
    public final void mo101576j(@Nullable Bundle bundle) {
        if (bundle == null) {
            x2t0.m206864b("Click data is null. No click is reported.");
        } else if (!m207676s("click_reporting")) {
            x2t0.m206866d("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
        } else {
            Bundle bundle2 = bundle.getBundle("click_signal");
            m207673A(null, null, null, null, null, bundle2 != null ? bundle2.getString("asset_id") : null, null, exr0.m118703b().m134104l(bundle, null), false, false);
        }
    }

    @Override // p149l.wcu0
    /* JADX INFO: renamed from: k */
    public final void mo101577k(@Nullable View view, @Nullable Map map) {
        this.f191842x = new Point();
        this.f191843y = new Point();
        if (view != null) {
            this.f191834p.m192030z0(view);
        }
        this.f191839u = false;
    }

    @Override // p149l.wcu0
    /* JADX INFO: renamed from: l */
    public final void mo101578l(View view) {
        if (!this.f191821c.optBoolean("custom_one_point_five_click_enabled", false)) {
            x2t0.m206869g("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        ydu0 ydu0Var = this.f191832n;
        if (view == null) {
            return;
        }
        view.setOnClickListener(ydu0Var);
        view.setClickable(true);
        ydu0Var.f197646g = new WeakReference(view);
    }

    @Override // p149l.wcu0
    /* JADX INFO: renamed from: m */
    public final void mo101579m(View view, @Nullable Map map, @Nullable Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.f191842x = new Point();
        this.f191843y = new Point();
        if (!this.f191839u) {
            this.f191834p.m192029w0(view);
            this.f191839u = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.f191831m.m102685k(this);
        boolean zM211192i = xus0.m211192i(this.f191829k.zzc);
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                View view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (view2 != null) {
                    if (zM211192i) {
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
                    if (zM211192i) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // p149l.wcu0
    /* JADX INFO: renamed from: n */
    public final void mo101580n(@Nullable Bundle bundle) {
        if (bundle == null) {
            x2t0.m206864b("Touch event data is null. No touch event is reported.");
            return;
        }
        if (!m207676s("touch_reporting")) {
            x2t0.m206866d("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
            return;
        }
        this.f191824f.m171378c().mo136905b((int) bundle.getFloat(BaseSei.f13930X), (int) bundle.getFloat(BaseSei.f13931Y), bundle.getInt("duration_ms"));
    }

    @Override // p149l.wcu0
    /* JADX INFO: renamed from: o */
    public final void mo101581o(ees0 ees0Var) {
        if (this.f191821c.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.f191832n.m214329c(ees0Var);
        } else {
            x2t0.m206869g("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        }
    }

    @Override // p149l.wcu0
    /* JADX INFO: renamed from: p */
    public final void mo101582p(skt0 skt0Var) {
        this.f191818B = skt0Var;
    }

    @Nullable
    /* JADX INFO: renamed from: q */
    public final String m207674q(View view) {
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132355p3)).booleanValue()) {
            return null;
        }
        try {
            return this.f191824f.m171378c().mo136911h(this.f191819a, view, null);
        } catch (Exception unused) {
            x2t0.m206866d("Exception getting data.");
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: r */
    public final String m207675r(@Nullable View view, @Nullable Map map) {
        if (map != null && view != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    return (String) entry.getKey();
                }
            }
        }
        int iM163573P = this.f191823e.m163573P();
        if (iM163573P == 1) {
            return "1099";
        }
        if (iM163573P == 2) {
            return "2099";
        }
        if (iM163573P != 6) {
            return null;
        }
        return "3099";
    }

    /* JADX INFO: renamed from: s */
    public final boolean m207676s(String str) {
        JSONObject jSONObjectOptJSONObject = this.f191821c.optJSONObject("allow_pub_event_reporting");
        return jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean(str, false);
    }

    @Override // p149l.wcu0
    /* JADX INFO: renamed from: t */
    public final boolean mo101584t() {
        if (zza() == 0) {
            return true;
        }
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132095Ua)).booleanValue()) {
            return this.f191830l.f115499i.zzj;
        }
        return true;
    }

    @Override // p149l.wcu0
    /* JADX INFO: renamed from: u */
    public final void mo101585u(String str) {
        m207673A(null, null, null, null, null, str, null, null, false, false);
    }

    /* JADX INFO: renamed from: v */
    public final boolean m207677v() {
        return this.f191821c.optBoolean("allow_custom_click_gesture", false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w */
    public final boolean m207678w(@Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable JSONObject jSONObject3, @Nullable JSONObject jSONObject4, @Nullable String str, @Nullable JSONObject jSONObject5, boolean z) {
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.f191821c);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132355p3)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z);
            Context context = this.f191819a;
            JSONObject jSONObject7 = new JSONObject();
            vny0.m199080r();
            DisplayMetrics displayMetricsM12300U = C2075b.m12300U((WindowManager) context.getSystemService(BLiveBottomPopupStyleTypeEnum.window));
            tau0 tau0Var = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            try {
                jSONObject7.put("width", exr0.m118703b().m134100e(context, displayMetricsM12300U.widthPixels));
                jSONObject7.put("height", exr0.m118703b().m134100e(context, displayMetricsM12300U.heightPixels));
            } catch (JSONException unused) {
                jSONObject7 = null;
            }
            jSONObject6.put("screen", jSONObject7);
            boolean zBooleanValue = ((Boolean) d1s0.m109677c().m144697a(m7s0.f132411t8)).booleanValue();
            kiu0 kiu0Var = this.f191822d;
            if (zBooleanValue) {
                kiu0Var.m146144i("/clickRecorded", new uau0(this, tau0Var));
            } else {
                kiu0Var.m146144i("/logScionEvent", new sau0(this, objArr == true ? 1 : 0));
            }
            this.f191822d.m146144i("/nativeImpression", new wau0(this, objArr2 == true ? 1 : 0));
            l3t0.m148407a(this.f191822d.m146139d("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            if (this.f191838t) {
                return true;
            }
            this.f191838t = vny0.m199083u().m211401n(this.f191819a, this.f191829k.zza, this.f191828j.f125160D.toString(), this.f191830l.f115496f);
            return true;
        } catch (JSONException e) {
            x2t0.m206867e("Unable to create impression JSON.", e);
            return false;
        }
    }

    @Override // p149l.wcu0
    public final int zza() {
        if (this.f191830l.f115499i == null) {
            return 0;
        }
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132095Ua)).booleanValue()) {
            return this.f191830l.f115499i.zzi;
        }
        return 0;
    }

    @Override // p149l.wcu0
    public final void zzg() {
        try {
            skt0 skt0Var = this.f191818B;
            if (skt0Var != null) {
                skt0Var.zze();
            }
        } catch (RemoteException e) {
            x2t0.m206871i("#007 Could not call remote method.", e);
        }
    }

    @Override // p149l.wcu0
    public final void zzh() {
        if (this.f191821c.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.f191832n.m214328b();
        }
    }

    @Override // p149l.wcu0
    public final void zzi() {
        this.f191822d.m146141f();
    }

    @Override // p149l.wcu0
    public final void zzp() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.f191821c);
            l3t0.m148407a(this.f191822d.m146139d("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e) {
            x2t0.m206867e("", e);
        }
    }

    @Override // p149l.wcu0
    public final void zzr() {
        m207678w(null, null, null, null, null, null, false);
    }
}
