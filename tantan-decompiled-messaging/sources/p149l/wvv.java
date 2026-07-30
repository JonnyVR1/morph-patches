package p149l;

import android.app.Activity;
import android.content.DialogInterface;
import android.provider.Settings;
import androidx.annotation.StringRes;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.dlg.CoreDlg;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public class wvv {

    /* JADX INFO: renamed from: a */
    public static hpd0 f188291a;

    /* JADX INFO: renamed from: b */
    public static hpd0 f188292b;

    static {
        Boolean bool = Boolean.FALSE;
        f188291a = new hpd0("already_request_location_permission", bool);
        f188292b = new hpd0("has_requested_location_permission", bool);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m205761a(Act act, PermissionHelper.InterfaceC13129b interfaceC13129b, boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        if (pvv.m171693c() && !m205775o()) {
            CoreDlg.m45038X1(act, true);
        }
        if (interfaceC13129b != null) {
            interfaceC13129b.mo79906a(z, permissionDeniedReason);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m205763c(final Act act, final PermissionHelper.InterfaceC13129b interfaceC13129b, d30 d30Var) {
        PermissionHelper.m79882c().m79900r("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION").m79894l(new PermissionHelper.InterfaceC13129b() { // from class: l.vvv
            @Override // com.p046p1.mobile.putong.p065ui.permission.PermissionHelper.InterfaceC13129b
            /* JADX INFO: renamed from: a */
            public final void mo79906a(boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
                wvv.m205761a(act, interfaceC13129b, z, permissionDeniedReason);
            }
        }).m79905w(false).m79903u(false).m79891i(act);
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m205764d(Act act, d30 d30Var) {
        if (!pvv.m171693c() || m205775o()) {
            return;
        }
        CoreDlg.m45041Y1(act, true, d30Var);
    }

    /* JADX INFO: renamed from: e */
    public static void m205765e() {
        hpd0 hpd0Var = f188291a;
        Boolean bool = Boolean.TRUE;
        hpd0Var.put(bool);
        f188292b.put(bool);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m205766f() {
        boolean zM205775o = m205775o();
        if (!zM205775o) {
            lsi0.m151595y("开启定位服务,获取精准定位");
        }
        return zM205775o;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m205767g(Activity activity) {
        boolean zM205775o = m205775o();
        if (!zM205775o) {
            lsi0.m151596z("开启定位服务,获取精准定位", activity.getWindow().getDecorView());
        }
        return zM205775o;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m205768h(Act act) {
        return m205771k(act, null);
    }

    /* JADX INFO: renamed from: i */
    public static boolean m205769i(Act act, @StringRes int i, d30 d30Var) {
        return m205770j(act, i, d30Var, false);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m205770j(final Act act, @StringRes int i, final d30 d30Var, boolean z) {
        if (m205777q() && (!pvv.m171693c() || m205775o())) {
            return true;
        }
        if (!m205777q()) {
            dd80.C16336a c16336aM110995x0 = new dd80.C16336a(act).m110964S(upa.m194847z() ? x2c0.f190460ph : x2c0.f189236Ci).m110975d0(upa.m194847z() ? x2c0.f189655Q : -1).m110995x0(R$string.f18795oh, new Object[0]);
            if (i == 0) {
                i = R$string.f18246Wj;
            }
            c16336aM110995x0.m110990s0(i, new Object[0]).m110961P(true).m110972a0(R$string.f18519fi, new Runnable() { // from class: l.tvv
                @Override // java.lang.Runnable
                public final void run() {
                    Act act2 = act;
                    PermissionHelper.m79882c().m79900r("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION").m79897o(new d30() { // from class: l.uvv
                        @Override // p149l.d30
                        public final void call() {
                            wvv.m205764d(act2, d30Var);
                        }
                    }).m79905w(false).m79903u(false).m79891i(act2);
                }
            }).m110967V(R$string.f18408c, new Object[0]).m110989r0();
        } else if (pvv.m171693c() && !m205775o()) {
            CoreDlg.m45041Y1(act, true, d30Var);
        }
        return false;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m205771k(Act act, d30 d30Var) {
        return m205769i(act, 0, d30Var);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m205772l(final Act act, final PermissionHelper.InterfaceC13129b interfaceC13129b, DialogInterface.OnCancelListener onCancelListener, Runnable runnable, final d30 d30Var) {
        if (m205777q() && (!pvv.m171693c() || m205775o())) {
            return true;
        }
        new dd80.C16336a(act).m110964S(upa.m194847z() ? x2c0.f190460ph : x2c0.f189236Ci).m110975d0(upa.m194847z() ? x2c0.f189655Q : -1).m110995x0(R$string.f18795oh, new Object[0]).m110990s0(R$string.f18246Wj, new Object[0]).m110961P(true).m110972a0(R$string.f18746n, new Runnable() { // from class: l.svv
            @Override // java.lang.Runnable
            public final void run() {
                wvv.m205763c(act, interfaceC13129b, d30Var);
            }
        }).m110966U(R$string.f18408c, runnable).m110983l0(onCancelListener).m110989r0();
        return false;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m205773m() {
        return f188292b.get().booleanValue();
    }

    /* JADX INFO: renamed from: n */
    public static boolean m205774n(Act act) {
        return b50.m100290x(act, "android.permission.ACCESS_FINE_LOCATION") && b50.m100290x(act, "android.permission.ACCESS_COARSE_LOCATION");
    }

    /* JADX INFO: renamed from: o */
    public static boolean m205775o() {
        try {
            return Settings.Secure.getInt(CoreModule.f17544b.getContentResolver(), "location_mode") != 0;
        } catch (Settings.SettingNotFoundException e) {
            CrashHelper.m81296c(e);
            return false;
        }
    }

    /* JADX INFO: renamed from: p */
    public static boolean m205776p(Act act) {
        if (PermissionHelper.m79881b("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION")) {
            return false;
        }
        return !f188291a.get().booleanValue() || m205774n(act);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m205777q() {
        return PermissionHelper.m79881b("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION");
    }

    /* JADX INFO: renamed from: r */
    public static void m205778r() {
        f188291a.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: s */
    public static void m205779s(Act act, d30 d30Var) {
        PermissionHelper.m79882c().m79900r("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION").m79897o(d30Var).m79905w(false).m79903u(false).m79891i(act);
    }

    /* JADX INFO: renamed from: t */
    public static boolean m205780t() {
        return qib0.f154687E.m78865q() == null;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m205781u() {
        Locale locale = CoreModule.f17544b.getResources().getConfiguration().locale;
        return "zh".equalsIgnoreCase(locale.getLanguage()) && "CN".equalsIgnoreCase(locale.getCountry()) && !PermissionHelper.m79881b("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION");
    }
}
