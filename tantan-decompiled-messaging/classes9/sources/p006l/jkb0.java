package p006l;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.api.ABManager;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import l.bne0;
import l.bwf0;
import l.cwf0;
import l.dyd;
import l.e30;
import l.e51;
import l.exc0;
import l.izl;
import l.j760;
import l.jo0;
import l.l3f;
import l.lsi0;
import l.lw0;
import l.mkd0;
import l.mqi0;
import l.o660;
import l.p660;
import l.roj0;
import l.stv;
import l.sx3;
import l.tpd0;
import l.u700;
import l.uqd0;
import l.x74;
import l.yni;
import l.zpd0;
import l.zvf0;
import org.json.JSONException;
import org.json.JSONObject;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class jkb0 {

    /* JADX INFO: renamed from: a */
    public static volatile boolean f15193a = true;

    /* JADX INFO: renamed from: b */
    public static volatile String f15194b;

    /* JADX INFO: renamed from: c */
    public static JSONObject f15195c = new JSONObject();

    /* JADX INFO: renamed from: d */
    public static final zpd0 f15196d = new zpd0("last_app_start_time", 0L);

    /* JADX INFO: renamed from: e */
    public static final tpd0 f15197e = new tpd0("loginType", -1);

    /* JADX INFO: renamed from: f */
    public static final zpd0 f15198f = new zpd0("last_app_pv_time", 0L);

    /* JADX INFO: renamed from: g */
    public static final uqd0 f15199g = new uqd0("last_app_pv_id", "");

    /* JADX INFO: renamed from: h */
    public static final uqd0 f15200h = new uqd0("last_mc_eid", "");

    /* JADX INFO: renamed from: i */
    public static final uqd0 f15201i = new uqd0("last_mc_extra", "");

    /* JADX INFO: renamed from: l.jkb0$a */
    public class C0886a implements cwf0.b {
        /* JADX INFO: renamed from: a */
        public void m17516a(String str) {
            cu2.m13642e(str);
            pt2.m21683i(str);
        }

        /* JADX INFO: renamed from: b */
        public void m17517b(String str) {
            pt2.m21682h(str);
        }
    }

    /* JADX INFO: renamed from: l.jkb0$b */
    public class C0887b implements izl {
        /* JADX INFO: renamed from: a */
        public void m17518a(String str, String str2) {
            jkb0.f15200h.put(str);
            jkb0.f15201i.put(str2);
        }

        /* JADX INFO: renamed from: b */
        public void m17519b(o660 o660Var) {
            if (NullChecker.a(o660Var)) {
                jkb0.f15199g.put(o660Var.c());
                jkb0.f15198f.put(Long.valueOf(mqi0.o()));
            }
        }

        /* JADX INFO: renamed from: c */
        public void m17520c(o660 o660Var) {
            o660 o660VarG = p660.g();
            if (NullChecker.a(o660VarG)) {
                jkb0.f15199g.put(o660VarG.c());
            }
        }
    }

    /* JADX INFO: renamed from: l.jkb0$c */
    public class C0888c implements lw0.c {
        public void onBack() {
            zvf0.B("e_active_check", "", new j760[]{new j760("page_id", jkb0.m17503l())});
            jkb0.f15193a = true;
            yni.l(false);
        }

        public void onFront() {
            jkb0.f15193a = false;
            zvf0.B("e_active_check", "", new j760[]{new j760("page_id", "")});
            if (!bne0.m() || Build.VERSION.SDK_INT != 28) {
                jkb0.m17509r();
            }
            jkb0.f15196d.put(Long.valueOf(mqi0.o()));
        }
    }

    /* JADX INFO: renamed from: l.jkb0$d */
    public class C0889d implements e30<Long> {
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Long l2) {
            if (jkb0.f15193a || Act.foreground_() == null) {
                return;
            }
            zvf0.B("e_active_check", "", new j760[]{new j760("page_id", jkb0.m17505n())});
        }
    }

    /* JADX INFO: renamed from: l.jkb0$e */
    public class C0890e implements x74 {
        public void onFailure(sx3 sx3Var, IOException iOException) {
            lsi0.y("连接失败，请重试");
        }

        public void onResponse(sx3 sx3Var, exc0 exc0Var) throws IOException {
            lsi0.y("连接成功");
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m17495d(roj0 roj0Var) {
        t660.m24482c();
        t660.m24481b();
        m17510s(ABManager.m1255i());
        m17512u();
        zvf0.B("e_app_ui_type_show", "", new j760[]{new j760("ui_type", m17506o())});
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m17497f() {
        String strM17897a;
        try {
            strM17897a = k0n.m17897a();
        } catch (Throwable unused) {
            strM17897a = "";
        }
        zvf0.H("aad", strM17897a);
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m17498g(roj0 roj0Var) {
        t660.m24482c();
        t660.m24481b();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_ab", ABManager.m1257j());
            zvf0.H("odevs", jSONObject);
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m17501j() {
        m17510s(ABManager.m1255i());
        if (qib0.m22123J0()) {
            m17512u();
        }
        ABManager.m1260m().subscribe(mkd0.G(new e30() { // from class: l.ckb0
            public final void call(Object obj) {
                jkb0.m17498g((roj0) obj);
            }
        }));
        ABManager.m1264q().compose(u700.H()).subscribe(mkd0.G(new e30() { // from class: l.dkb0
            public final void call(Object obj) {
                jkb0.m17495d((roj0) obj);
            }
        }));
        ABManager.m1262o().subscribe(mkd0.G(new e30() { // from class: l.ekb0
            public final void call(Object obj) {
                jkb0.m17510s(ABManager.m1255i());
            }
        }));
        zvf0.H("lch", "putong");
        dyd.a.first().observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.fkb0
            public final void call(Object obj) {
                zvf0.H("adtk", dyd.a());
            }
        }));
        m17511t();
        zvf0.G(new bwf0() { // from class: l.gkb0
            /* JADX INFO: renamed from: a */
            public final void m15816a(l3f l3fVar) {
                hfw.m16210c(l3fVar);
            }
        });
        zvf0.F(new C0886a());
        uqd0 uqd0Var = f15199g;
        if (!TextUtils.isEmpty((String) uqd0Var.get())) {
            zvf0.B("e_killapp_page", "", new j760[]{new j760("page_id", (String) uqd0Var.get()), new j760("duration", Long.valueOf((mqi0.o() - ((Long) f15198f.get()).longValue()) / 1000)), new j760("mc_event_id", (String) f15200h.get()), new j760("mc_event_extras", (String) f15201i.get())});
        }
        p660.m(new C0887b());
    }

    /* JADX INFO: renamed from: k */
    public static String m17502k() {
        if (TextUtils.isEmpty(f15194b)) {
            try {
                f15194b = bjp0.getDefaultUserAgent(App.e);
            } catch (Exception e) {
                CrashHelper.c(e);
            }
        }
        return f15194b;
    }

    /* JADX INFO: renamed from: l */
    public static String m17503l() {
        o660 o660VarD = p660.d();
        return o660VarD != null ? o660VarD.c() : "";
    }

    /* JADX INFO: renamed from: m */
    public static tpd0 m17504m() {
        return f15197e;
    }

    /* JADX INFO: renamed from: n */
    public static String m17505n() {
        o660 o660VarG = p660.g();
        return o660VarG != null ? o660VarG.c() : "";
    }

    /* JADX INFO: renamed from: o */
    public static String m17506o() {
        return "2.0.0";
    }

    /* JADX INFO: renamed from: p */
    public static void m17507p() {
        if (((Integer) App.i.get()).intValue() == 1) {
            m17509r();
        }
        lw0.c().b(new C0888c());
        c.interval(30L, TimeUnit.SECONDS).subscribe(mkd0.G(new C0889d()));
    }

    /* JADX INFO: renamed from: q */
    public static void m17508q(Intent intent) {
        URL url;
        if (intent == null || intent.getExtras() == null) {
            lsi0.y("连接失败，请重试");
            return;
        }
        Bundle extras = intent.getExtras();
        String string = extras.getInt("result_type") == 1 ? extras.getString("result_string") : "";
        if (TextUtils.isEmpty(string)) {
            lsi0.y("连接失败，请重试");
            return;
        }
        String[] strArrSplit = string.split(":");
        if (strArrSplit.length != 2) {
            lsi0.y("连接失败，请重试");
            return;
        }
        try {
            if ("qr_for_txtstatics".equals(strArrSplit[0])) {
                url = new URL("https://ttdp.p1staff.com/api/v1/verify-tool/sessions/register?deviceId=" + stv.a(App.e) + "&sessionId=" + strArrSplit[1]);
            } else {
                if (!"qr_for_statics_v1".equals(strArrSplit[0])) {
                    lsi0.y("连接失败，请重试");
                    return;
                }
                url = new URL("https://ttdp.p1staff.com/api/v1/verify-tool/sessions/register?deviceId=" + dyd.a() + "&sessionId=" + strArrSplit[1] + "&entranceType=HISTORY_ENTRANCE");
            }
            qib0.f19776D.a(qib0.f19784H.basic().r(url).b()).h(new C0890e());
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m17509r() {
        e51.y(new Runnable() { // from class: l.hkb0
            @Override // java.lang.Runnable
            public final void run() {
                zvf0.D("e_open_app_get_ua", "", new j760[]{new j760("is_first_open", Boolean.valueOf(((Integer) App.i.get()).intValue() == 1)), new j760("user_agent", jkb0.m17502k()), new j760("device_model_raw", Build.MODEL)});
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public static void m17510s(String str) {
        zvf0.H("ab", str);
    }

    /* JADX INFO: renamed from: t */
    public static void m17511t() {
        e51.y(new Runnable() { // from class: l.ikb0
            @Override // java.lang.Runnable
            public final void run() {
                jkb0.m17497f();
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public static void m17512u() {
        try {
            f15195c.put("ui_version", m17506o());
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        zvf0.H("sysext", f15195c);
    }

    /* JADX INFO: renamed from: v */
    public static void m17513v(String str, int i) {
        HashMap map = new HashMap(3);
        map.put("uid", str);
        map.put("lgtp", Integer.valueOf(i));
        zvf0.I(map);
    }

    /* JADX INFO: renamed from: w */
    public static void m17514w(User user) {
        if (NullChecker.b(user)) {
            HashMap map = new HashMap();
            map.put("uid", ((DbObject) user).id);
            if (NullChecker.a(user.source)) {
                map.put("lgtp", Integer.valueOf(user.source.ordinal()));
                f15197e.put(Integer.valueOf(user.source.ordinal()));
                map.put("lgtp_str", user.source.toString());
            }
            zvf0.I(map);
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m17515x() {
        HashMap map = new HashMap();
        map.put("uid", "");
        map.put("lgtp", -1);
        f15197e.put(-1);
        zvf0.I(map);
    }
}
