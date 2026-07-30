package p149l;

import android.content.DialogInterface;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.member.R$string;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes10.dex */
public class yvv {

    /* JADX INFO: renamed from: a */
    public static dd80 f200293a;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m216240a(PermissionHelper.InterfaceC13129b interfaceC13129b, Act act, d30 d30Var) {
        PermissionHelper.m79882c().m79900r("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION").m79894l(interfaceC13129b).m79905w(false).m79903u(false).m79891i(act);
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m216241b(final Act act, final PermissionHelper.InterfaceC13129b interfaceC13129b, DialogInterface.OnCancelListener onCancelListener, Runnable runnable, final d30 d30Var) {
        if (m216242c()) {
            return true;
        }
        dd80 dd80Var = f200293a;
        if (dd80Var != null && dd80Var.isShowing()) {
            return false;
        }
        f200293a = new dd80.C16336a(act).m110964S(b3c0.f73132q1).m110996y0("开启权限").m110991t0("开启定位权限才能找到附近的人").m110961P(true).m110974c0("开启权限", new Runnable() { // from class: l.xvv
            @Override // java.lang.Runnable
            public final void run() {
                yvv.m216240a(interfaceC13129b, act, d30Var);
            }
        }).m110966U(R$string.f20627a, runnable).m110983l0(onCancelListener).m110989r0();
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m216242c() {
        return PermissionHelper.m79881b("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION");
    }
}
