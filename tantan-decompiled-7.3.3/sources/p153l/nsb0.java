package p153l;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.api.ABManager;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class nsb0 {

    /* JADX INFO: renamed from: a */
    public static volatile boolean f143481a = true;

    /* JADX INFO: renamed from: b */
    public static volatile String f143482b;

    /* JADX INFO: renamed from: c */
    public static JSONObject f143483c = new JSONObject();

    /* JADX INFO: renamed from: d */
    public static final byd0 f143484d = new byd0("last_app_start_time", 0L);

    /* JADX INFO: renamed from: e */
    public static final vxd0 f143485e = new vxd0("loginType", -1);

    /* JADX INFO: renamed from: f */
    public static final byd0 f143486f = new byd0("last_app_pv_time", 0L);

    /* JADX INFO: renamed from: g */
    public static final wyd0 f143487g = new wyd0("last_app_pv_id", "");

    /* JADX INFO: renamed from: h */
    public static final wyd0 f143488h = new wyd0("last_mc_eid", "");

    /* JADX INFO: renamed from: i */
    public static final wyd0 f143489i = new wyd0("last_mc_extra", "");

    /* JADX INFO: renamed from: l.nsb0$a */
    public class C18938a implements l4g0.InterfaceC18345b {
        @Override // p153l.l4g0.InterfaceC18345b
        /* JADX INFO: renamed from: a */
        public void mo152785a(String str) {
            su2.m187984e(str);
            fu2.m127431i(str);
        }

        @Override // p153l.l4g0.InterfaceC18345b
        /* JADX INFO: renamed from: b */
        public void mo152786b(String str) {
            fu2.m127430h(str);
        }
    }

    /* JADX INFO: renamed from: l.nsb0$b */
    public class C18939b implements c2m {
        @Override // p153l.c2m
        /* JADX INFO: renamed from: a */
        public void mo107720a(String str, String str2) {
            nsb0.f143488h.put(str);
            nsb0.f143489i.put(str2);
        }

        @Override // p153l.c2m
        /* JADX INFO: renamed from: b */
        public void mo107721b(ue60 ue60Var) {
            if (NullChecker.m82486a(ue60Var)) {
                nsb0.f143487g.put(ue60Var.m195739c());
                nsb0.f143486f.put(Long.valueOf(pzi0.m174454o()));
            }
        }

        @Override // p153l.c2m
        /* JADX INFO: renamed from: c */
        public void mo107722c(ue60 ue60Var) {
            ue60 ue60VarM201040g = ve60.m201040g();
            if (NullChecker.m82486a(ue60VarM201040g)) {
                nsb0.f143487g.put(ue60VarM201040g.m195739c());
            }
        }
    }

    /* JADX INFO: renamed from: l.nsb0$c */
    public class C18940c implements sw0.InterfaceC20166c {
        @Override // p153l.sw0.InterfaceC20166c
        public void onBack() {
            i4g0.m138493B("e_active_check", "", new pf60("page_id", nsb0.m164578l()));
            nsb0.f143481a = true;
            uqi.m197345l(false);
        }

        @Override // p153l.sw0.InterfaceC20166c
        public void onFront() {
            nsb0.f143481a = false;
            i4g0.m138493B("e_active_check", "", new pf60("page_id", ""));
            if (!ive0.m142299m() || Build.VERSION.SDK_INT != 28) {
                nsb0.m164584r();
            }
            nsb0.f143484d.put(Long.valueOf(pzi0.m174454o()));
        }
    }

    /* JADX INFO: renamed from: l.nsb0$d */
    public class C18941d implements y20<Long> {
        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Long l2) {
            if (nsb0.f143481a || Act.foreground_() == null) {
                return;
            }
            i4g0.m138493B("e_active_check", "", new pf60("page_id", nsb0.m164580n()));
        }
    }

    /* JADX INFO: renamed from: l.nsb0$e */
    public class C18942e implements w84 {
        @Override // p153l.w84
        public void onFailure(ry3 ry3Var, IOException iOException) {
            o1j0.m165651y("连接失败，请重试");
        }

        @Override // p153l.w84
        public void onResponse(ry3 ry3Var, i5d0 i5d0Var) throws IOException {
            o1j0.m165651y("连接成功");
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m164570d(uxj0 uxj0Var) {
        ze60.m219404c();
        ze60.m219403b();
        m164585s(ABManager.m30347i());
        m164587u();
        i4g0.m138493B("e_app_ui_type_show", "", new pf60("ui_type", m164581o()));
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m164572f() {
        String strM147979a;
        try {
            strM147979a = k2n.m147979a();
        } catch (Throwable unused) {
            strM147979a = "";
        }
        i4g0.m138499H("aad", strM147979a);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m164573g(uxj0 uxj0Var) {
        ze60.m219404c();
        ze60.m219403b();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_ab", ABManager.m30349j());
            i4g0.m138499H("odevs", jSONObject);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m164576j() {
        m164585s(ABManager.m30347i());
        if (uqb0.m197233J0()) {
            m164587u();
        }
        ABManager.m30352m().subscribe(psd0.m173596G(new y20() { // from class: l.gsb0
            @Override // p153l.y20
            public final void call(Object obj) {
                nsb0.m164573g((uxj0) obj);
            }
        }));
        ABManager.m30356q().compose(dg00.m115569H()).subscribe(psd0.m173596G(new y20() { // from class: l.hsb0
            @Override // p153l.y20
            public final void call(Object obj) {
                nsb0.m164570d((uxj0) obj);
            }
        }));
        ABManager.m30354o().subscribe(psd0.m173596G(new y20() { // from class: l.isb0
            @Override // p153l.y20
            public final void call(Object obj) {
                nsb0.m164585s(ABManager.m30347i());
            }
        }));
        i4g0.m138499H("lch", "putong");
        qzd.f160242a.first().observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.jsb0
            @Override // p153l.y20
            public final void call(Object obj) {
                i4g0.m138499H("adtk", qzd.m178768a());
            }
        }));
        m164586t();
        i4g0.m138498G(new k4g0() { // from class: l.ksb0
            @Override // p153l.k4g0
            /* JADX INFO: renamed from: a */
            public final void mo148243a(q4f q4fVar) {
                fhw.m125607c(q4fVar);
            }
        });
        i4g0.m138497F(new C18938a());
        wyd0 wyd0Var = f143487g;
        if (!TextUtils.isEmpty(wyd0Var.get())) {
            i4g0.m138493B("e_killapp_page", "", new pf60("page_id", wyd0Var.get()), new pf60(BLiveOperationTitleShowType.duration, Long.valueOf((pzi0.m174454o() - f143486f.get().longValue()) / 1000)), new pf60("mc_event_id", f143488h.get()), new pf60("mc_event_extras", f143489i.get()));
        }
        ve60.m201046m(new C18939b());
    }

    /* JADX INFO: renamed from: k */
    public static String m164577k() {
        if (TextUtils.isEmpty(f143482b)) {
            try {
                f143482b = gsp0.getDefaultUserAgent(App.f16088e);
            } catch (Exception e) {
                CrashHelper.m82479c(e);
            }
        }
        return f143482b;
    }

    /* JADX INFO: renamed from: l */
    public static String m164578l() {
        ue60 ue60VarM201037d = ve60.m201037d();
        return ue60VarM201037d != null ? ue60VarM201037d.m195739c() : "";
    }

    /* JADX INFO: renamed from: m */
    public static vxd0 m164579m() {
        return f143485e;
    }

    /* JADX INFO: renamed from: n */
    public static String m164580n() {
        ue60 ue60VarM201040g = ve60.m201040g();
        return ue60VarM201040g != null ? ue60VarM201040g.m195739c() : "";
    }

    /* JADX INFO: renamed from: o */
    public static String m164581o() {
        return "2.0.0";
    }

    /* JADX INFO: renamed from: p */
    public static void m164582p() {
        if (App.f16092i.get().intValue() == 1) {
            m164584r();
        }
        sw0.m188232c().m188233b(new C18940c());
        C22421c.interval(30L, TimeUnit.SECONDS).subscribe(psd0.m173596G(new C18941d()));
    }

    /* JADX INFO: renamed from: q */
    public static void m164583q(Intent intent) {
        URL url;
        if (intent == null || intent.getExtras() == null) {
            o1j0.m165651y("连接失败，请重试");
            return;
        }
        Bundle extras = intent.getExtras();
        String string = extras.getInt("result_type") == 1 ? extras.getString("result_string") : "";
        if (TextUtils.isEmpty(string)) {
            o1j0.m165651y("连接失败，请重试");
            return;
        }
        String[] strArrSplit = string.split(":");
        if (strArrSplit.length != 2) {
            o1j0.m165651y("连接失败，请重试");
            return;
        }
        try {
            if ("qr_for_txtstatics".equals(strArrSplit[0])) {
                url = new URL("https://ttdp.p1staff.com/api/v1/verify-tool/sessions/register?deviceId=" + tvv.m192837a(App.f16088e) + "&sessionId=" + strArrSplit[1]);
            } else {
                if (!"qr_for_statics_v1".equals(strArrSplit[0])) {
                    o1j0.m165651y("连接失败，请重试");
                    return;
                }
                url = new URL("https://ttdp.p1staff.com/api/v1/verify-tool/sessions/register?deviceId=" + qzd.m178768a() + "&sessionId=" + strArrSplit[1] + "&entranceType=HISTORY_ENTRANCE");
            }
            uqb0.f180368D.mo181341a(uqb0.f180376H.basic().m209044r(url).m209028b()).mo135840h(new C18942e());
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m164584r() {
        l51.m152919y(new Runnable() { // from class: l.lsb0
            @Override // java.lang.Runnable
            public final void run() {
                i4g0.m138495D("e_open_app_get_ua", "", new pf60("is_first_open", Boolean.valueOf(App.f16092i.get().intValue() == 1)), new pf60("user_agent", nsb0.m164577k()), new pf60("device_model_raw", Build.MODEL));
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public static void m164585s(String str) {
        i4g0.m138499H("ab", str);
    }

    /* JADX INFO: renamed from: t */
    public static void m164586t() {
        l51.m152919y(new Runnable() { // from class: l.msb0
            @Override // java.lang.Runnable
            public final void run() {
                nsb0.m164572f();
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public static void m164587u() {
        try {
            f143483c.put("ui_version", m164581o());
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        i4g0.m138499H("sysext", f143483c);
    }

    /* JADX INFO: renamed from: v */
    public static void m164588v(String str, int i) {
        HashMap map = new HashMap(3);
        map.put(Oauth2AccessToken.KEY_UID, str);
        map.put("lgtp", Integer.valueOf(i));
        i4g0.m138500I(map);
    }

    /* JADX INFO: renamed from: w */
    public static void m164589w(User user) {
        if (NullChecker.m82487b(user)) {
            HashMap map = new HashMap();
            map.put(Oauth2AccessToken.KEY_UID, user.f56859id);
            if (NullChecker.m82486a(user.source)) {
                map.put("lgtp", Integer.valueOf(user.source.ordinal()));
                f143485e.put(Integer.valueOf(user.source.ordinal()));
                map.put("lgtp_str", user.source.toString());
            }
            i4g0.m138500I(map);
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m164590x() {
        HashMap map = new HashMap();
        map.put(Oauth2AccessToken.KEY_UID, "");
        map.put("lgtp", -1);
        f143485e.put(-1);
        i4g0.m138500I(map);
    }
}
