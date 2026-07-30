package p149l;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.api.ABManager;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class jkb0 {

    /* JADX INFO: renamed from: a */
    public static volatile boolean f118348a = true;

    /* JADX INFO: renamed from: b */
    public static volatile String f118349b;

    /* JADX INFO: renamed from: c */
    public static JSONObject f118350c = new JSONObject();

    /* JADX INFO: renamed from: d */
    public static final zpd0 f118351d = new zpd0("last_app_start_time", 0L);

    /* JADX INFO: renamed from: e */
    public static final tpd0 f118352e = new tpd0("loginType", -1);

    /* JADX INFO: renamed from: f */
    public static final zpd0 f118353f = new zpd0("last_app_pv_time", 0L);

    /* JADX INFO: renamed from: g */
    public static final uqd0 f118354g = new uqd0("last_app_pv_id", "");

    /* JADX INFO: renamed from: h */
    public static final uqd0 f118355h = new uqd0("last_mc_eid", "");

    /* JADX INFO: renamed from: i */
    public static final uqd0 f118356i = new uqd0("last_mc_extra", "");

    /* JADX INFO: renamed from: l.jkb0$a */
    public class C17803a implements cwf0.InterfaceC16263b {
        @Override // p149l.cwf0.InterfaceC16263b
        /* JADX INFO: renamed from: a */
        public void mo109044a(String str) {
            cu2.m108723e(str);
            pt2.m171275i(str);
        }

        @Override // p149l.cwf0.InterfaceC16263b
        /* JADX INFO: renamed from: b */
        public void mo109045b(String str) {
            pt2.m171274h(str);
        }
    }

    /* JADX INFO: renamed from: l.jkb0$b */
    public class C17804b implements izl {
        @Override // p149l.izl
        /* JADX INFO: renamed from: a */
        public void mo139067a(String str, String str2) {
            jkb0.f118355h.put(str);
            jkb0.f118356i.put(str2);
        }

        @Override // p149l.izl
        /* JADX INFO: renamed from: b */
        public void mo139068b(o660 o660Var) {
            if (NullChecker.m81303a(o660Var)) {
                jkb0.f118354g.put(o660Var.m162820c());
                jkb0.f118353f.put(Long.valueOf(mqi0.m155944o()));
            }
        }

        @Override // p149l.izl
        /* JADX INFO: renamed from: c */
        public void mo139069c(o660 o660Var) {
            o660 o660VarM167648g = p660.m167648g();
            if (NullChecker.m81303a(o660VarM167648g)) {
                jkb0.f118354g.put(o660VarM167648g.m162820c());
            }
        }
    }

    /* JADX INFO: renamed from: l.jkb0$c */
    public class C17805c implements lw0.InterfaceC18329c {
        @Override // p149l.lw0.InterfaceC18329c
        public void onBack() {
            zvf0.m220369B("e_active_check", "", new j760("page_id", jkb0.m141842l()));
            jkb0.f118348a = true;
            yni.m215423l(false);
        }

        @Override // p149l.lw0.InterfaceC18329c
        public void onFront() {
            jkb0.f118348a = false;
            zvf0.m220369B("e_active_check", "", new j760("page_id", ""));
            if (!bne0.m102784m() || Build.VERSION.SDK_INT != 28) {
                jkb0.m141848r();
            }
            jkb0.f118351d.put(Long.valueOf(mqi0.m155944o()));
        }
    }

    /* JADX INFO: renamed from: l.jkb0$d */
    public class C17806d implements e30<Long> {
        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Long l2) {
            if (jkb0.f118348a || Act.foreground_() == null) {
                return;
            }
            zvf0.m220369B("e_active_check", "", new j760("page_id", jkb0.m141844n()));
        }
    }

    /* JADX INFO: renamed from: l.jkb0$e */
    public class C17807e implements x74 {
        @Override // p149l.x74
        public void onFailure(sx3 sx3Var, IOException iOException) {
            lsi0.m151595y("连接失败，请重试");
        }

        @Override // p149l.x74
        public void onResponse(sx3 sx3Var, exc0 exc0Var) throws IOException {
            lsi0.m151595y("连接成功");
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m141834d(roj0 roj0Var) {
        t660.m187361c();
        t660.m187360b();
        m141849s(ABManager.m29349i());
        m141851u();
        zvf0.m220369B("e_app_ui_type_show", "", new j760("ui_type", m141845o()));
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m141836f() {
        String strM144071a;
        try {
            strM144071a = k0n.m144071a();
        } catch (Throwable unused) {
            strM144071a = "";
        }
        zvf0.m220375H("aad", strM144071a);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m141837g(roj0 roj0Var) {
        t660.m187361c();
        t660.m187360b();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_ab", ABManager.m29351j());
            zvf0.m220375H("odevs", jSONObject);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m141840j() {
        m141849s(ABManager.m29349i());
        if (qib0.m174779J0()) {
            m141851u();
        }
        ABManager.m29354m().subscribe(mkd0.m154955G(new e30() { // from class: l.ckb0
            @Override // p149l.e30
            public final void call(Object obj) {
                jkb0.m141837g((roj0) obj);
            }
        }));
        ABManager.m29358q().compose(u700.m192039H()).subscribe(mkd0.m154955G(new e30() { // from class: l.dkb0
            @Override // p149l.e30
            public final void call(Object obj) {
                jkb0.m141834d((roj0) obj);
            }
        }));
        ABManager.m29356o().subscribe(mkd0.m154955G(new e30() { // from class: l.ekb0
            @Override // p149l.e30
            public final void call(Object obj) {
                jkb0.m141849s(ABManager.m29349i());
            }
        }));
        zvf0.m220375H("lch", "putong");
        dyd.f88364a.first().observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.fkb0
            @Override // p149l.e30
            public final void call(Object obj) {
                zvf0.m220375H("adtk", dyd.m114055a());
            }
        }));
        m141850t();
        zvf0.m220374G(new bwf0() { // from class: l.gkb0
            @Override // p149l.bwf0
            /* JADX INFO: renamed from: a */
            public final void mo104155a(l3f l3fVar) {
                hfw.m130792c(l3fVar);
            }
        });
        zvf0.m220373F(new C17803a());
        uqd0 uqd0Var = f118354g;
        if (!TextUtils.isEmpty(uqd0Var.get())) {
            zvf0.m220369B("e_killapp_page", "", new j760("page_id", uqd0Var.get()), new j760(BLiveOperationTitleShowType.duration, Long.valueOf((mqi0.m155944o() - f118353f.get().longValue()) / 1000)), new j760("mc_event_id", f118355h.get()), new j760("mc_event_extras", f118356i.get()));
        }
        p660.m167654m(new C17804b());
    }

    /* JADX INFO: renamed from: k */
    public static String m141841k() {
        if (TextUtils.isEmpty(f118349b)) {
            try {
                f118349b = bjp0.getDefaultUserAgent(App.f15369e);
            } catch (Exception e) {
                CrashHelper.m81296c(e);
            }
        }
        return f118349b;
    }

    /* JADX INFO: renamed from: l */
    public static String m141842l() {
        o660 o660VarM167645d = p660.m167645d();
        return o660VarM167645d != null ? o660VarM167645d.m162820c() : "";
    }

    /* JADX INFO: renamed from: m */
    public static tpd0 m141843m() {
        return f118352e;
    }

    /* JADX INFO: renamed from: n */
    public static String m141844n() {
        o660 o660VarM167648g = p660.m167648g();
        return o660VarM167648g != null ? o660VarM167648g.m162820c() : "";
    }

    /* JADX INFO: renamed from: o */
    public static String m141845o() {
        return "2.0.0";
    }

    /* JADX INFO: renamed from: p */
    public static void m141846p() {
        if (App.f15373i.get().intValue() == 1) {
            m141848r();
        }
        lw0.m151927c().m151928b(new C17805c());
        C22306c.interval(30L, TimeUnit.SECONDS).subscribe(mkd0.m154955G(new C17806d()));
    }

    /* JADX INFO: renamed from: q */
    public static void m141847q(Intent intent) {
        URL url;
        if (intent == null || intent.getExtras() == null) {
            lsi0.m151595y("连接失败，请重试");
            return;
        }
        Bundle extras = intent.getExtras();
        String string = extras.getInt("result_type") == 1 ? extras.getString("result_string") : "";
        if (TextUtils.isEmpty(string)) {
            lsi0.m151595y("连接失败，请重试");
            return;
        }
        String[] strArrSplit = string.split(":");
        if (strArrSplit.length != 2) {
            lsi0.m151595y("连接失败，请重试");
            return;
        }
        try {
            if ("qr_for_txtstatics".equals(strArrSplit[0])) {
                url = new URL("https://ttdp.p1staff.com/api/v1/verify-tool/sessions/register?deviceId=" + stv.m185972a(App.f15369e) + "&sessionId=" + strArrSplit[1]);
            } else {
                if (!"qr_for_statics_v1".equals(strArrSplit[0])) {
                    lsi0.m151595y("连接失败，请重试");
                    return;
                }
                url = new URL("https://ttdp.p1staff.com/api/v1/verify-tool/sessions/register?deviceId=" + dyd.m114055a() + "&sessionId=" + strArrSplit[1] + "&entranceType=HISTORY_ENTRANCE");
            }
            qib0.f154685D.mo144849a(qib0.f154693H.basic().m185899r(url).m185883b()).mo96077h(new C17807e());
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m141848r() {
        e51.m114774y(new Runnable() { // from class: l.hkb0
            @Override // java.lang.Runnable
            public final void run() {
                zvf0.m220371D("e_open_app_get_ua", "", new j760("is_first_open", Boolean.valueOf(App.f15373i.get().intValue() == 1)), new j760("user_agent", jkb0.m141841k()), new j760("device_model_raw", Build.MODEL));
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public static void m141849s(String str) {
        zvf0.m220375H("ab", str);
    }

    /* JADX INFO: renamed from: t */
    public static void m141850t() {
        e51.m114774y(new Runnable() { // from class: l.ikb0
            @Override // java.lang.Runnable
            public final void run() {
                jkb0.m141836f();
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public static void m141851u() {
        try {
            f118350c.put("ui_version", m141845o());
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        zvf0.m220375H("sysext", f118350c);
    }

    /* JADX INFO: renamed from: v */
    public static void m141852v(String str, int i) {
        HashMap map = new HashMap(3);
        map.put(Oauth2AccessToken.KEY_UID, str);
        map.put("lgtp", Integer.valueOf(i));
        zvf0.m220376I(map);
    }

    /* JADX INFO: renamed from: w */
    public static void m141853w(User user) {
        if (NullChecker.m81304b(user)) {
            HashMap map = new HashMap();
            map.put(Oauth2AccessToken.KEY_UID, user.f56011id);
            if (NullChecker.m81303a(user.source)) {
                map.put("lgtp", Integer.valueOf(user.source.ordinal()));
                f118352e.put(Integer.valueOf(user.source.ordinal()));
                map.put("lgtp_str", user.source.toString());
            }
            zvf0.m220376I(map);
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m141854x() {
        HashMap map = new HashMap();
        map.put(Oauth2AccessToken.KEY_UID, "");
        map.put("lgtp", -1);
        f118352e.put(-1);
        zvf0.m220376I(map);
    }
}
