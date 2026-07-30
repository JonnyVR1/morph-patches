package p003l;

import android.app.Activity;
import android.os.SystemClock;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.appcompat.widget.Toolbar;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.poplevel.CorePopLevel;
import com.p1.mobile.putong.data.Picture;
import com.tantanapp.common.utils.NullChecker;
import l.e51;
import l.f6c0;
import l.hdb0;
import l.p4c0;
import l.qib0;
import l.t100;
import l.u4c0;
import l.x2c0;
import l.xdl0;
import p028v.VDraweeView;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ccx {

    /* JADX INFO: renamed from: a */
    public static PopupWindow f2616a;

    /* JADX INFO: renamed from: b */
    public static long f2617b;

    /* JADX INFO: renamed from: c */
    public static d30 f2618c;

    /* JADX INFO: renamed from: d */
    public static final Runnable f2619d = new Runnable() { // from class: l.acx
        @Override // java.lang.Runnable
        public final void run() {
            ccx.m3244b();
        }
    };

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m3244b() {
        PopupWindow popupWindow = f2616a;
        if (popupWindow != null) {
            popupWindow.dismiss();
            f2616a = null;
        }
        d30 d30Var = f2618c;
        if (d30Var != null) {
            d30Var.call();
            f2618c = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m3245c(int i, Picture.ImageUri imageUri) {
        if (Act.foreground_() == null || Act.foreground_().a == null || Act.foreground_().a.get() == null) {
            return;
        }
        ybx ybxVar = new ybx((Activity) Act.foreground_().a.get(), ((Activity) Act.foreground_().a.get()).getString(i), 10, imageUri);
        ybxVar.x(CorePopLevel.MATCH_SEND_MSG_DONE);
        hdb0.c().i(ybxVar);
    }

    /* JADX INFO: renamed from: d */
    public static void m3246d() {
        if (SystemClock.elapsedRealtime() - f2617b < 3000) {
            return;
        }
        Runnable runnable = f2619d;
        e51.J(runnable);
        runnable.run();
    }

    /* JADX INFO: renamed from: e */
    public static PopupWindow m3247e() {
        return f2616a;
    }

    /* JADX INFO: renamed from: f */
    public static void m3248f(final int i, final Picture.ImageUri imageUri) {
        e51.H(CoreModule.b, new Runnable() { // from class: l.zbx
            @Override // java.lang.Runnable
            public final void run() {
                ccx.m3245c(i, imageUri);
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: g */
    public static void m3249g(Activity activity, String str, d30 d30Var, Picture.ImageUri imageUri) {
        f2618c = d30Var;
        if (f2616a == null) {
            f2617b = SystemClock.elapsedRealtime();
            f2616a = new PopupWindow(activity.getLayoutInflater().inflate(f6c0.n7, (ViewGroup) null), xdl0.y0(), t100.d(86.0f), false);
        }
        xdl0.M0(f2616a.getContentView(), true);
        if (NullChecker.a(m3250h(activity))) {
            f2616a.showAtLocation(m3250h(activity), 8388659, t100.i, m3250h(activity).getHeight() != 0 ? -xdl0.C(activity) : 0);
        } else {
            f2616a.showAtLocation(activity.getWindow().getDecorView(), 8388659, t100.i, 0);
        }
        qib0.G.K((VDraweeView) f2616a.getContentView().findViewById(u4c0.V7), x2c0.Yo, 2, 50);
        qib0.G.Q0(f2616a.getContentView().findViewById(u4c0.O), imageUri);
        ((VText) f2616a.getContentView().findViewById(u4c0.Pd)).setText(str);
        e51.H(activity, new Runnable() { // from class: l.bcx
            @Override // java.lang.Runnable
            public final void run() {
                ccx.m3246d();
            }
        }, 3000L);
    }

    /* JADX INFO: renamed from: h */
    public static Toolbar m3250h(Activity activity) {
        return activity.findViewById(p4c0.a);
    }
}
