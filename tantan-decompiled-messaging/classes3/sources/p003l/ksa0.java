package p003l;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.poplevel.CorePopLevel;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.e51;
import l.f6c0;
import l.hdb0;
import l.p4c0;
import l.qib0;
import l.u4c0;
import l.xdl0;
import p028v.VDraweeView;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ksa0 {

    /* JADX INFO: renamed from: a */
    public static PopupWindow f5022a;

    /* JADX INFO: renamed from: b */
    public static long f5023b;

    /* JADX INFO: renamed from: c */
    public static d30 f5024c;

    /* JADX INFO: renamed from: d */
    public static final Runnable f5025d = new Runnable() { // from class: l.isa0
        @Override // java.lang.Runnable
        public final void run() {
            ksa0.m5770c();
        }
    };

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m5769b(String str, Picture.ImageUri imageUri, User user) {
        if (Act.foreground_() == null || Act.foreground_().a == null || Act.foreground_().a.get() == null || m5774g()) {
            return;
        }
        fsa0 fsa0Var = new fsa0((Activity) Act.foreground_().a.get(), str, 10, imageUri, user.onlineMatchLocked());
        fsa0Var.x(CorePopLevel.PROFILE_SEND_MSG_DONE);
        hdb0.c().i(fsa0Var);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m5770c() {
        PopupWindow popupWindow = f5022a;
        if (popupWindow != null) {
            popupWindow.dismiss();
            f5022a = null;
        }
        d30 d30Var = f5024c;
        if (d30Var != null) {
            d30Var.call();
            f5024c = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m5771d(int i, Picture.ImageUri imageUri, User user) {
        if (Act.foreground_() == null || Act.foreground_().a == null || Act.foreground_().a.get() == null || m5774g()) {
            return;
        }
        fsa0 fsa0Var = new fsa0((Activity) Act.foreground_().a.get(), ((Activity) Act.foreground_().a.get()).getString(i), 10, imageUri, user.onlineMatchLocked());
        fsa0Var.x(CorePopLevel.PROFILE_SEND_MSG_DONE);
        hdb0.c().i(fsa0Var);
    }

    /* JADX INFO: renamed from: e */
    public static void m5772e() {
        if (SystemClock.elapsedRealtime() - f5023b < 3000) {
            return;
        }
        Runnable runnable = f5025d;
        e51.J(runnable);
        runnable.run();
    }

    /* JADX INFO: renamed from: f */
    public static PopupWindow m5773f() {
        return f5022a;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m5774g() {
        if (NullChecker.a(f5022a)) {
            return f5022a.isShowing();
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static void m5775h(final int i, final User user) {
        final Picture.ImageUri imageUriProfileSmall = user.fp().profileSmall();
        e51.H(CoreModule.b, new Runnable() { // from class: l.hsa0
            @Override // java.lang.Runnable
            public final void run() {
                ksa0.m5771d(i, imageUriProfileSmall, user);
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: i */
    public static void m5776i(final String str, final User user) {
        final Picture.ImageUri imageUriProfileSmall = user.fp().profileSmall();
        e51.H(CoreModule.b, new Runnable() { // from class: l.gsa0
            @Override // java.lang.Runnable
            public final void run() {
                ksa0.m5769b(str, imageUriProfileSmall, user);
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: j */
    public static void m5777j(Activity activity, String str, d30 d30Var, Picture.ImageUri imageUri, boolean z) {
        f5024c = d30Var;
        f5023b = SystemClock.elapsedRealtime();
        PopupWindow popupWindow = new PopupWindow(activity.getLayoutInflater().inflate(f6c0.q7, (ViewGroup) null), -2, -2, false);
        f5022a = popupWindow;
        xdl0.M0(popupWindow.getContentView(), true);
        if (NullChecker.a(m5778k(activity))) {
            f5022a.showAtLocation(m5778k(activity), 49, 0, m5778k(activity).getHeight() == 0 ? 0 : -xdl0.C(activity));
        } else {
            f5022a.showAtLocation(activity.getWindow().getDecorView(), 49, 0, 0);
        }
        SimpleDraweeView simpleDraweeView = (VDraweeView) f5022a.getContentView().findViewById(u4c0.d6);
        simpleDraweeView.setVisibility(0);
        if (z) {
            qib0.G.O(simpleDraweeView, imageUri.formatted(), 4, 5);
        } else {
            qib0.G.Q0(simpleDraweeView, imageUri);
        }
        AppCompatTextView appCompatTextView = (VText) f5022a.getContentView().findViewById(u4c0.ge);
        appCompatTextView.setTypeface(Typeface.DEFAULT_BOLD);
        appCompatTextView.setVisibility(0);
        appCompatTextView.setText(str);
        e51.H(activity, new Runnable() { // from class: l.jsa0
            @Override // java.lang.Runnable
            public final void run() {
                ksa0.m5772e();
            }
        }, 3000L);
    }

    /* JADX INFO: renamed from: k */
    public static Toolbar m5778k(Activity activity) {
        return activity.findViewById(p4c0.a);
    }
}
