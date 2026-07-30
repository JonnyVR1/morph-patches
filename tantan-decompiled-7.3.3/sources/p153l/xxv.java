package p153l;

import android.app.Activity;
import android.content.DialogInterface;
import android.provider.Settings;
import androidx.annotation.StringRes;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.dlg.CoreDlg;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;

/* JADX INFO: loaded from: classes12.dex */
public class xxv {

    /* JADX INFO: renamed from: a */
    public static jxd0 f196699a;

    /* JADX INFO: renamed from: b */
    public static jxd0 f196700b;

    static {
        Boolean bool = Boolean.FALSE;
        f196699a = new jxd0("already_request_location_permission", bool);
        f196700b = new jxd0("has_requested_location_permission", bool);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m213574a(Act act, PermissionHelper.InterfaceC13292b interfaceC13292b, boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        if (qxv.m178618c() && !m213588o()) {
            CoreDlg.m46221X1(act, true);
        }
        if (interfaceC13292b != null) {
            interfaceC13292b.mo81089a(z, permissionDeniedReason);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m213576c(final Act act, final PermissionHelper.InterfaceC13292b interfaceC13292b, x20 x20Var) {
        PermissionHelper.m81065c().m81083r("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION").m81077l(new PermissionHelper.InterfaceC13292b() { // from class: l.wxv
            @Override // com.p051p1.mobile.putong.p070ui.permission.PermissionHelper.InterfaceC13292b
            /* JADX INFO: renamed from: a */
            public final void mo81089a(boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
                xxv.m213574a(act, interfaceC13292b, z, permissionDeniedReason);
            }
        }).m81088w(false).m81086u(false).m81074i(act);
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m213577d(Act act, x20 x20Var) {
        if (!qxv.m178618c() || m213588o()) {
            return;
        }
        CoreDlg.m46224Y1(act, true, x20Var);
    }

    /* JADX INFO: renamed from: e */
    public static void m213578e() {
        jxd0 jxd0Var = f196699a;
        Boolean bool = Boolean.TRUE;
        jxd0Var.put(bool);
        f196700b.put(bool);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m213579f() {
        boolean zM213588o = m213588o();
        if (!zM213588o) {
            o1j0.m165651y("开启定位服务,获取精准定位");
        }
        return zM213588o;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m213580g(Activity activity) {
        boolean zM213588o = m213588o();
        if (!zM213588o) {
            o1j0.m165652z("开启定位服务,获取精准定位", activity.getWindow().getDecorView());
        }
        return zM213588o;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m213581h(Act act) {
        return m213584k(act, null);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m213582i(Act act, @StringRes int i, x20 x20Var) {
        return m213583j(act, i, x20Var, false);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m213583j(final Act act, @StringRes int i, final x20 x20Var, boolean z) {
        if (m213590q() && (!qxv.m178618c() || m213588o())) {
            return true;
        }
        if (!m213590q()) {
            jl80.C17971a c17971aM146055x0 = new jl80.C17971a(act).m146024S(gra.m131778z() ? dbc0.f86926di : dbc0.f87353qj).m146035d0(gra.m131778z() ? dbc0.f86520R : -1).m146055x0(R$string.f18582Jh, new Object[0]);
            if (i == 0) {
                i = R$string.f19652sk;
            }
            c17971aM146055x0.m146050s0(i, new Object[0]).m146021P(true).m146032a0(R$string.f18304Ai, new Runnable() { // from class: l.uxv
                @Override // java.lang.Runnable
                public final void run() {
                    Act act2 = act;
                    PermissionHelper.m81065c().m81083r("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION").m81080o(new x20() { // from class: l.vxv
                        @Override // p153l.x20
                        public final void call() {
                            xxv.m213577d(act2, x20Var);
                        }
                    }).m81088w(false).m81086u(false).m81074i(act2);
                }
            }).m146027V(R$string.f19138c, new Object[0]).m146049r0();
        } else if (qxv.m178618c() && !m213588o()) {
            CoreDlg.m46224Y1(act, true, x20Var);
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m213584k(Act act, x20 x20Var) {
        return m213582i(act, 0, x20Var);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m213585l(final Act act, final PermissionHelper.InterfaceC13292b interfaceC13292b, DialogInterface.OnCancelListener onCancelListener, Runnable runnable, final x20 x20Var) {
        if (m213590q() && (!qxv.m178618c() || m213588o())) {
            return true;
        }
        new jl80.C17971a(act).m146024S(gra.m131778z() ? dbc0.f86926di : dbc0.f87353qj).m146035d0(gra.m131778z() ? dbc0.f86520R : -1).m146055x0(R$string.f18582Jh, new Object[0]).m146050s0(R$string.f19652sk, new Object[0]).m146021P(true).m146032a0(R$string.f19476n, new Runnable() { // from class: l.txv
            @Override // java.lang.Runnable
            public final void run() {
                xxv.m213576c(act, interfaceC13292b, x20Var);
            }
        }).m146026U(R$string.f19138c, runnable).m146043l0(onCancelListener).m146049r0();
        return false;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m213586m() {
        return f196700b.get().booleanValue();
    }

    /* JADX INFO: renamed from: n */
    public static boolean m213587n(Act act) {
        return v40.m199647x(act, "android.permission.ACCESS_FINE_LOCATION") && v40.m199647x(act, "android.permission.ACCESS_COARSE_LOCATION");
    }

    /* JADX INFO: renamed from: o */
    public static boolean m213588o() {
        try {
            return Settings.Secure.getInt(CoreModule.f18263b.getContentResolver(), "location_mode") != 0;
        } catch (Settings.SettingNotFoundException e) {
            CrashHelper.m82479c(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: p */
    public static boolean m213589p(Act act) {
        if (PermissionHelper.m81064b("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION")) {
            return false;
        }
        return !f196699a.get().booleanValue() || m213587n(act);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m213590q() {
        return PermissionHelper.m81064b("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION");
    }

    /* JADX INFO: renamed from: r */
    public static void m213591r() {
        f196699a.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: s */
    public static void m213592s(Act act, x20 x20Var) {
        PermissionHelper.m81065c().m81083r("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION").m81080o(x20Var).m81088w(false).m81086u(false).m81074i(act);
    }

    /* JADX INFO: renamed from: t */
    public static boolean m213593t() {
        return uqb0.f180370E.m80048q() == null;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m213594u() {
        Locale locale = CoreModule.f18263b.getResources().getConfiguration().locale;
        return "zh".equalsIgnoreCase(locale.getLanguage()) && "CN".equalsIgnoreCase(locale.getCountry()) && !PermissionHelper.m81064b("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION");
    }
}
