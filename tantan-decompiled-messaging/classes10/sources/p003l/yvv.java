package p003l;

import android.content.DialogInterface;
import com.p000p1.mobile.putong.core.member.R$string;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.ui.permission.PermissionHelper;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.dd80;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class yvv {

    /* JADX INFO: renamed from: a */
    public static dd80 f9146a;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m11314a(PermissionHelper.b bVar, Act act, d30 d30Var) {
        PermissionHelper.c().r(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}).l(bVar).w(false).u(false).i(act);
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m11315b(final Act act, final PermissionHelper.b bVar, DialogInterface.OnCancelListener onCancelListener, Runnable runnable, final d30 d30Var) {
        if (m11316c()) {
            return true;
        }
        dd80 dd80Var = f9146a;
        if (dd80Var != null && dd80Var.isShowing()) {
            return false;
        }
        f9146a = new dd80.a(act).S(b3c0.f3235q1).y0("开启权限").t0("开启定位权限才能找到附近的人").P(true).c0("开启权限", new Runnable() { // from class: l.xvv
            @Override // java.lang.Runnable
            public final void run() {
                yvv.m11314a(bVar, act, d30Var);
            }
        }).U(R$string.f289a, runnable).l0(onCancelListener).r0();
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m11316c() {
        return PermissionHelper.b(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"});
    }
}
