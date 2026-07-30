package p153l;

import android.app.Activity;
import android.os.SystemClock;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.appcompat.widget.Toolbar;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.android.material.badge.BadgeDrawable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.poplevel.CorePopLevel;
import com.p051p1.mobile.putong.data.Picture;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class bfx {

    /* JADX INFO: renamed from: a */
    public static PopupWindow f76551a;

    /* JADX INFO: renamed from: b */
    public static long f76552b;

    /* JADX INFO: renamed from: c */
    public static x20 f76553c;

    /* JADX INFO: renamed from: d */
    public static final Runnable f76554d = new Runnable() { // from class: l.zex
        @Override // java.lang.Runnable
        public final void run() {
            bfx.m104079b();
        }
    };

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m104079b() {
        PopupWindow popupWindow = f76551a;
        if (popupWindow != null) {
            popupWindow.dismiss();
            f76551a = null;
        }
        x20 x20Var = f76553c;
        if (x20Var != null) {
            x20Var.call();
            f76553c = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m104080c(int i, Picture.ImageUri imageUri) {
        if (Act.foreground_() == null || Act.foreground_().f16062a == null || Act.foreground_().f16062a.get() == null) {
            return;
        }
        xex xexVar = new xex(Act.foreground_().f16062a.get(), Act.foreground_().f16062a.get().getString(i), 10, imageUri);
        xexVar.m126745x(CorePopLevel.MATCH_SEND_MSG_DONE);
        llb0.m154703c().m154710i(xexVar);
    }

    /* JADX INFO: renamed from: d */
    public static void m104081d() {
        if (SystemClock.elapsedRealtime() - f76552b < 3000) {
            return;
        }
        Runnable runnable = f76554d;
        l51.m152890J(runnable);
        runnable.run();
    }

    /* JADX INFO: renamed from: e */
    public static PopupWindow m104082e() {
        return f76551a;
    }

    /* JADX INFO: renamed from: f */
    public static void m104083f(final int i, final Picture.ImageUri imageUri) {
        l51.m152888H(CoreModule.f18263b, new Runnable() { // from class: l.yex
            @Override // java.lang.Runnable
            public final void run() {
                bfx.m104080c(i, imageUri);
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: g */
    public static void m104084g(Activity activity, String str, x20 x20Var, Picture.ImageUri imageUri) {
        f76553c = x20Var;
        if (f76551a == null) {
            f76552b = SystemClock.elapsedRealtime();
            f76551a = new PopupWindow(activity.getLayoutInflater().inflate(kec0.f125981o7, (ViewGroup) null), bnl0.m105592y0(), qa00.m175859d(86.0f), false);
        }
        bnl0.m105525M0(f76551a.getContentView(), true);
        if (NullChecker.m82486a(m104085h(activity))) {
            f76551a.showAtLocation(m104085h(activity), BadgeDrawable.TOP_START, qa00.f156322i, m104085h(activity).getHeight() != 0 ? -bnl0.m105504C(activity) : 0);
        } else {
            f76551a.showAtLocation(activity.getWindow().getDecorView(), BadgeDrawable.TOP_START, qa00.f156322i, 0);
        }
        uqb0.f180374G.m127112K((VDraweeView) f76551a.getContentView().findViewById(adc0.f70202X7), dbc0.f86386Mp, 2, 50);
        uqb0.f180374G.m127125Q0((SimpleDraweeView) f76551a.getContentView().findViewById(adc0.f70042O), imageUri);
        ((VText) f76551a.getContentView().findViewById(adc0.f70124Sd)).setText(str);
        l51.m152888H(activity, new Runnable() { // from class: l.afx
            @Override // java.lang.Runnable
            public final void run() {
                bfx.m104081d();
            }
        }, 3000L);
    }

    /* JADX INFO: renamed from: h */
    public static Toolbar m104085h(Activity activity) {
        return (Toolbar) activity.findViewById(vcc0.f183404a);
    }
}
