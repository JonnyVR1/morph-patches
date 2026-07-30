package p003l;

import android.app.Activity;
import android.content.DialogInterface;
import android.provider.Settings;
import androidx.annotation.StringRes;
import com.p000p1.mobile.putong.core.p001ui.dlg.CoreDlg;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.ui.permission.PermissionHelper;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import l.b50;
import l.d30;
import l.dd80;
import l.hpd0;
import l.lsi0;
import l.pvv;
import l.qib0;
import l.upa;
import l.x2c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class wvv {

    /* JADX INFO: renamed from: a */
    public static hpd0 f8255a;

    /* JADX INFO: renamed from: b */
    public static hpd0 f8256b;

    static {
        Boolean bool = Boolean.FALSE;
        f8255a = new hpd0("already_request_location_permission", bool);
        f8256b = new hpd0("has_requested_location_permission", bool);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m10567a(Act act, PermissionHelper.b bVar, boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        if (pvv.c() && !m10581o()) {
            CoreDlg.m2354X1(act, true);
        }
        if (bVar != null) {
            bVar.a(z, permissionDeniedReason);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m10569c(final Act act, final PermissionHelper.b bVar, d30 d30Var) {
        PermissionHelper.c().r(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}).l(new PermissionHelper.b() { // from class: l.vvv
            /* JADX INFO: renamed from: a */
            public final void m10385a(boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
                wvv.m10567a(act, bVar, z, permissionDeniedReason);
            }
        }).w(false).u(false).i(act);
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m10570d(Act act, d30 d30Var) {
        if (!pvv.c() || m10581o()) {
            return;
        }
        CoreDlg.m2357Y1(act, true, d30Var);
    }

    /* JADX INFO: renamed from: e */
    public static void m10571e() {
        hpd0 hpd0Var = f8255a;
        Boolean bool = Boolean.TRUE;
        hpd0Var.put(bool);
        f8256b.put(bool);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m10572f() {
        boolean zM10581o = m10581o();
        if (!zM10581o) {
            lsi0.y("开启定位服务,获取精准定位");
        }
        return zM10581o;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m10573g(Activity activity) {
        boolean zM10581o = m10581o();
        if (!zM10581o) {
            lsi0.z("开启定位服务,获取精准定位", activity.getWindow().getDecorView());
        }
        return zM10581o;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m10574h(Act act) {
        return m10577k(act, null);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m10575i(Act act, @StringRes int i, d30 d30Var) {
        return m10576j(act, i, d30Var, false);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m10576j(final Act act, @StringRes int i, final d30 d30Var, boolean z) {
        if (m10583q() && (!pvv.c() || m10581o())) {
            return true;
        }
        if (!m10583q()) {
            dd80.a aVarX0 = new dd80.a(act).S(upa.z() ? x2c0.ph : x2c0.Ci).d0(upa.z() ? x2c0.Q : -1).x0(R.string.oh, new Object[0]);
            if (i == 0) {
                i = R.string.Wj;
            }
            aVarX0.s0(i, new Object[0]).P(true).a0(R.string.fi, new Runnable() { // from class: l.tvv
                @Override // java.lang.Runnable
                public final void run() {
                    Act act2 = act;
                    PermissionHelper.c().r(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}).o(new d30() { // from class: l.uvv
                        public final void call() {
                            wvv.m10570d(act2, d30Var);
                        }
                    }).w(false).u(false).i(act2);
                }
            }).V(R.string.c, new Object[0]).r0();
        } else if (pvv.c() && !m10581o()) {
            CoreDlg.m2357Y1(act, true, d30Var);
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m10577k(Act act, d30 d30Var) {
        return m10575i(act, 0, d30Var);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m10578l(final Act act, final PermissionHelper.b bVar, DialogInterface.OnCancelListener onCancelListener, Runnable runnable, final d30 d30Var) {
        if (m10583q() && (!pvv.c() || m10581o())) {
            return true;
        }
        new dd80.a(act).S(upa.z() ? x2c0.ph : x2c0.Ci).d0(upa.z() ? x2c0.Q : -1).x0(R.string.oh, new Object[0]).s0(R.string.Wj, new Object[0]).P(true).a0(R.string.n, new Runnable() { // from class: l.svv
            @Override // java.lang.Runnable
            public final void run() {
                wvv.m10569c(act, bVar, d30Var);
            }
        }).U(R.string.c, runnable).l0(onCancelListener).r0();
        return false;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m10579m() {
        return ((Boolean) f8256b.get()).booleanValue();
    }

    /* JADX INFO: renamed from: n */
    public static boolean m10580n(Act act) {
        return b50.x(act, "android.permission.ACCESS_FINE_LOCATION") && b50.x(act, "android.permission.ACCESS_COARSE_LOCATION");
    }

    /* JADX INFO: renamed from: o */
    public static boolean m10581o() {
        try {
            return Settings.Secure.getInt(CoreModule.b.getContentResolver(), "location_mode") != 0;
        } catch (Settings.SettingNotFoundException e) {
            CrashHelper.c(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: p */
    public static boolean m10582p(Act act) {
        if (PermissionHelper.b(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"})) {
            return false;
        }
        return !((Boolean) f8255a.get()).booleanValue() || m10580n(act);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m10583q() {
        return PermissionHelper.b(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"});
    }

    /* JADX INFO: renamed from: r */
    public static void m10584r() {
        f8255a.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: s */
    public static void m10585s(Act act, d30 d30Var) {
        PermissionHelper.c().r(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}).o(d30Var).w(false).u(false).i(act);
    }

    /* JADX INFO: renamed from: t */
    public static boolean m10586t() {
        return qib0.E.q() == null;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m10587u() {
        Locale locale = CoreModule.b.getResources().getConfiguration().locale;
        return "zh".equalsIgnoreCase(locale.getLanguage()) && "CN".equalsIgnoreCase(locale.getCountry()) && !PermissionHelper.b(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"});
    }
}
