package p149l;

import android.app.Activity;
import android.os.SystemClock;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.appcompat.widget.Toolbar;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.material.badge.BadgeDrawable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.poplevel.CorePopLevel;
import com.p046p1.mobile.putong.data.Picture;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class ccx {

    /* JADX INFO: renamed from: a */
    public static PopupWindow f80331a;

    /* JADX INFO: renamed from: b */
    public static long f80332b;

    /* JADX INFO: renamed from: c */
    public static d30 f80333c;

    /* JADX INFO: renamed from: d */
    public static final Runnable f80334d = new Runnable() { // from class: l.acx
        @Override // java.lang.Runnable
        public final void run() {
            ccx.m106205b();
        }
    };

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m106205b() {
        PopupWindow popupWindow = f80331a;
        if (popupWindow != null) {
            popupWindow.dismiss();
            f80331a = null;
        }
        d30 d30Var = f80333c;
        if (d30Var != null) {
            d30Var.call();
            f80333c = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m106206c(int i, Picture.ImageUri imageUri) {
        if (Act.foreground_() == null || Act.foreground_().f15343a == null || Act.foreground_().f15343a.get() == null) {
            return;
        }
        ybx ybxVar = new ybx(Act.foreground_().f15343a.get(), Act.foreground_().f15343a.get().getString(i), 10, imageUri);
        ybxVar.m96808x(CorePopLevel.MATCH_SEND_MSG_DONE);
        hdb0.m130575c().m130582i(ybxVar);
    }

    /* JADX INFO: renamed from: d */
    public static void m106207d() {
        if (SystemClock.elapsedRealtime() - f80332b < 3000) {
            return;
        }
        Runnable runnable = f80334d;
        e51.m114745J(runnable);
        runnable.run();
    }

    /* JADX INFO: renamed from: e */
    public static PopupWindow m106208e() {
        return f80331a;
    }

    /* JADX INFO: renamed from: f */
    public static void m106209f(final int i, final Picture.ImageUri imageUri) {
        e51.m114743H(CoreModule.f17544b, new Runnable() { // from class: l.zbx
            @Override // java.lang.Runnable
            public final void run() {
                ccx.m106206c(i, imageUri);
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: g */
    public static void m106210g(Activity activity, String str, d30 d30Var, Picture.ImageUri imageUri) {
        f80333c = d30Var;
        if (f80331a == null) {
            f80332b = SystemClock.elapsedRealtime();
            f80331a = new PopupWindow(activity.getLayoutInflater().inflate(f6c0.f95910n7, (ViewGroup) null), xdl0.m208412y0(), t100.m186890d(86.0f), false);
        }
        xdl0.m208345M0(f80331a.getContentView(), true);
        if (NullChecker.m81303a(m106211h(activity))) {
            f80331a.showAtLocation(m106211h(activity), BadgeDrawable.TOP_START, t100.f167260i, m106211h(activity).getHeight() != 0 ? -xdl0.m208324C(activity) : 0);
        } else {
            f80331a.showAtLocation(activity.getWindow().getDecorView(), BadgeDrawable.TOP_START, t100.f167260i, 0);
        }
        qib0.f154691G.m102328K((VDraweeView) f80331a.getContentView().findViewById(u4c0.f174079V7), x2c0.f189928Yo, 2, 50);
        qib0.f154691G.m102341Q0((SimpleDraweeView) f80331a.getContentView().findViewById(u4c0.f173954O), imageUri);
        ((VText) f80331a.getContentView().findViewById(u4c0.f173985Pd)).setText(str);
        e51.m114743H(activity, new Runnable() { // from class: l.bcx
            @Override // java.lang.Runnable
            public final void run() {
                ccx.m106207d();
            }
        }, 3000L);
    }

    /* JADX INFO: renamed from: h */
    public static Toolbar m106211h(Activity activity) {
        return (Toolbar) activity.findViewById(p4c0.f147104a);
    }
}
