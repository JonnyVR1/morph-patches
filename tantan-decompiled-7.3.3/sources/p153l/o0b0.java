package p153l;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.appcompat.widget.Toolbar;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.poplevel.CorePopLevel;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class o0b0 {

    /* JADX INFO: renamed from: a */
    public static PopupWindow f144509a;

    /* JADX INFO: renamed from: b */
    public static long f144510b;

    /* JADX INFO: renamed from: c */
    public static x20 f144511c;

    /* JADX INFO: renamed from: d */
    public static final Runnable f144512d = new Runnable() { // from class: l.m0b0
        @Override // java.lang.Runnable
        public final void run() {
            o0b0.m165427c();
        }
    };

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m165426b(String str, Picture.ImageUri imageUri, User user) {
        if (Act.foreground_() == null || Act.foreground_().f16062a == null || Act.foreground_().f16062a.get() == null || m165431g()) {
            return;
        }
        j0b0 j0b0Var = new j0b0(Act.foreground_().f16062a.get(), str, 10, imageUri, user.onlineMatchLocked());
        j0b0Var.m126745x(CorePopLevel.PROFILE_SEND_MSG_DONE);
        llb0.m154703c().m154710i(j0b0Var);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m165427c() {
        PopupWindow popupWindow = f144509a;
        if (popupWindow != null) {
            popupWindow.dismiss();
            f144509a = null;
        }
        x20 x20Var = f144511c;
        if (x20Var != null) {
            x20Var.call();
            f144511c = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m165428d(int i, Picture.ImageUri imageUri, User user) {
        if (Act.foreground_() == null || Act.foreground_().f16062a == null || Act.foreground_().f16062a.get() == null || m165431g()) {
            return;
        }
        j0b0 j0b0Var = new j0b0(Act.foreground_().f16062a.get(), Act.foreground_().f16062a.get().getString(i), 10, imageUri, user.onlineMatchLocked());
        j0b0Var.m126745x(CorePopLevel.PROFILE_SEND_MSG_DONE);
        llb0.m154703c().m154710i(j0b0Var);
    }

    /* JADX INFO: renamed from: e */
    public static void m165429e() {
        if (SystemClock.elapsedRealtime() - f144510b < 3000) {
            return;
        }
        Runnable runnable = f144512d;
        l51.m152890J(runnable);
        runnable.run();
    }

    /* JADX INFO: renamed from: f */
    public static PopupWindow m165430f() {
        return f144509a;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m165431g() {
        if (NullChecker.m82486a(f144509a)) {
            return f144509a.isShowing();
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static void m165432h(final int i, final User user) {
        final Picture.ImageUri imageUriProfileSmall = user.m61308fp().profileSmall();
        l51.m152888H(CoreModule.f18263b, new Runnable() { // from class: l.l0b0
            @Override // java.lang.Runnable
            public final void run() {
                o0b0.m165428d(i, imageUriProfileSmall, user);
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: i */
    public static void m165433i(final String str, final User user) {
        final Picture.ImageUri imageUriProfileSmall = user.m61308fp().profileSmall();
        l51.m152888H(CoreModule.f18263b, new Runnable() { // from class: l.k0b0
            @Override // java.lang.Runnable
            public final void run() {
                o0b0.m165426b(str, imageUriProfileSmall, user);
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: j */
    public static void m165434j(Activity activity, String str, x20 x20Var, Picture.ImageUri imageUri, boolean z) {
        f144511c = x20Var;
        f144510b = SystemClock.elapsedRealtime();
        PopupWindow popupWindow = new PopupWindow(activity.getLayoutInflater().inflate(kec0.f126134x7, (ViewGroup) null), -2, -2, false);
        f144509a = popupWindow;
        bnl0.m105525M0(popupWindow.getContentView(), true);
        if (NullChecker.m82486a(m165435k(activity))) {
            f144509a.showAtLocation(m165435k(activity), 49, 0, m165435k(activity).getHeight() == 0 ? 0 : -bnl0.m105504C(activity));
        } else {
            f144509a.showAtLocation(activity.getWindow().getDecorView(), 49, 0, 0);
        }
        VDraweeView vDraweeView = (VDraweeView) f144509a.getContentView().findViewById(adc0.f70334f6);
        vDraweeView.setVisibility(0);
        if (z) {
            uqb0.f180374G.m127120O(vDraweeView, imageUri.formatted(), 4, 5);
        } else {
            uqb0.f180374G.m127125Q0(vDraweeView, imageUri);
        }
        VText vText = (VText) f144509a.getContentView().findViewById(adc0.f70409je);
        vText.setTypeface(Typeface.DEFAULT_BOLD);
        vText.setVisibility(0);
        vText.setText(str);
        l51.m152888H(activity, new Runnable() { // from class: l.n0b0
            @Override // java.lang.Runnable
            public final void run() {
                o0b0.m165429e();
            }
        }, 3000L);
    }

    /* JADX INFO: renamed from: k */
    public static Toolbar m165435k(Activity activity) {
        return (Toolbar) activity.findViewById(vcc0.f183404a);
    }
}
