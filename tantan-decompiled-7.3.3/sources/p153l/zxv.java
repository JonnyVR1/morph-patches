package p153l;

import android.content.DialogInterface;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.member.R$string;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes12.dex */
public class zxv {

    /* JADX INFO: renamed from: a */
    public static jl80 f206522a;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m222084a(PermissionHelper.InterfaceC13292b interfaceC13292b, Act act, x20 x20Var) {
        PermissionHelper.m81065c().m81083r("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION").m81077l(interfaceC13292b).m81088w(false).m81086u(false).m81074i(act);
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m222085b(final Act act, final PermissionHelper.InterfaceC13292b interfaceC13292b, DialogInterface.OnCancelListener onCancelListener, Runnable runnable, final x20 x20Var) {
        if (m222086c()) {
            return true;
        }
        jl80 jl80Var = f206522a;
        if (jl80Var != null && jl80Var.isShowing()) {
            return false;
        }
        f206522a = new jl80.C17971a(act).m146024S(gbc0.f103383q1).m146056y0("开启权限").m146051t0("开启定位权限才能找到附近的人").m146021P(true).m146034c0("开启权限", new Runnable() { // from class: l.yxv
            @Override // java.lang.Runnable
            public final void run() {
                zxv.m222084a(interfaceC13292b, act, x20Var);
            }
        }).m146026U(R$string.f21369a, runnable).m146043l0(onCancelListener).m146049r0();
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m222086c() {
        return PermissionHelper.m81064b("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION");
    }
}
