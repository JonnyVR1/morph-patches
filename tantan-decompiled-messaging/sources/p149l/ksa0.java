package p149l;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.appcompat.widget.Toolbar;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.poplevel.CorePopLevel;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class ksa0 {

    /* JADX INFO: renamed from: a */
    public static PopupWindow f124431a;

    /* JADX INFO: renamed from: b */
    public static long f124432b;

    /* JADX INFO: renamed from: c */
    public static d30 f124433c;

    /* JADX INFO: renamed from: d */
    public static final Runnable f124434d = new Runnable() { // from class: l.isa0
        @Override // java.lang.Runnable
        public final void run() {
            ksa0.m147039c();
        }
    };

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m147038b(String str, Picture.ImageUri imageUri, User user) {
        if (Act.foreground_() == null || Act.foreground_().f15343a == null || Act.foreground_().f15343a.get() == null || m147043g()) {
            return;
        }
        fsa0 fsa0Var = new fsa0(Act.foreground_().f15343a.get(), str, 10, imageUri, user.onlineMatchLocked());
        fsa0Var.m96808x(CorePopLevel.PROFILE_SEND_MSG_DONE);
        hdb0.m130575c().m130582i(fsa0Var);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m147039c() {
        PopupWindow popupWindow = f124431a;
        if (popupWindow != null) {
            popupWindow.dismiss();
            f124431a = null;
        }
        d30 d30Var = f124433c;
        if (d30Var != null) {
            d30Var.call();
            f124433c = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m147040d(int i, Picture.ImageUri imageUri, User user) {
        if (Act.foreground_() == null || Act.foreground_().f15343a == null || Act.foreground_().f15343a.get() == null || m147043g()) {
            return;
        }
        fsa0 fsa0Var = new fsa0(Act.foreground_().f15343a.get(), Act.foreground_().f15343a.get().getString(i), 10, imageUri, user.onlineMatchLocked());
        fsa0Var.m96808x(CorePopLevel.PROFILE_SEND_MSG_DONE);
        hdb0.m130575c().m130582i(fsa0Var);
    }

    /* JADX INFO: renamed from: e */
    public static void m147041e() {
        if (SystemClock.elapsedRealtime() - f124432b < 3000) {
            return;
        }
        Runnable runnable = f124434d;
        e51.m114745J(runnable);
        runnable.run();
    }

    /* JADX INFO: renamed from: f */
    public static PopupWindow m147042f() {
        return f124431a;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m147043g() {
        if (NullChecker.m81303a(f124431a)) {
            return f124431a.isShowing();
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public static void m147044h(final int i, final User user) {
        final Picture.ImageUri imageUriProfileSmall = user.m60124fp().profileSmall();
        e51.m114743H(CoreModule.f17544b, new Runnable() { // from class: l.hsa0
            @Override // java.lang.Runnable
            public final void run() {
                ksa0.m147040d(i, imageUriProfileSmall, user);
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: i */
    public static void m147045i(final String str, final User user) {
        final Picture.ImageUri imageUriProfileSmall = user.m60124fp().profileSmall();
        e51.m114743H(CoreModule.f17544b, new Runnable() { // from class: l.gsa0
            @Override // java.lang.Runnable
            public final void run() {
                ksa0.m147038b(str, imageUriProfileSmall, user);
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: j */
    public static void m147046j(Activity activity, String str, d30 d30Var, Picture.ImageUri imageUri, boolean z) {
        f124433c = d30Var;
        f124432b = SystemClock.elapsedRealtime();
        PopupWindow popupWindow = new PopupWindow(activity.getLayoutInflater().inflate(f6c0.f95961q7, (ViewGroup) null), -2, -2, false);
        f124431a = popupWindow;
        xdl0.m208345M0(popupWindow.getContentView(), true);
        if (NullChecker.m81303a(m147047k(activity))) {
            f124431a.showAtLocation(m147047k(activity), 49, 0, m147047k(activity).getHeight() == 0 ? 0 : -xdl0.m208324C(activity));
        } else {
            f124431a.showAtLocation(activity.getWindow().getDecorView(), 49, 0, 0);
        }
        VDraweeView vDraweeView = (VDraweeView) f124431a.getContentView().findViewById(u4c0.f174209d6);
        vDraweeView.setVisibility(0);
        if (z) {
            qib0.f154691G.m102336O(vDraweeView, imageUri.formatted(), 4, 5);
        } else {
            qib0.f154691G.m102341Q0(vDraweeView, imageUri);
        }
        VText vText = (VText) f124431a.getContentView().findViewById(u4c0.f174268ge);
        vText.setTypeface(Typeface.DEFAULT_BOLD);
        vText.setVisibility(0);
        vText.setText(str);
        e51.m114743H(activity, new Runnable() { // from class: l.jsa0
            @Override // java.lang.Runnable
            public final void run() {
                ksa0.m147041e();
            }
        }, 3000L);
    }

    /* JADX INFO: renamed from: k */
    public static Toolbar m147047k(Activity activity) {
        return (Toolbar) activity.findViewById(p4c0.f147104a);
    }
}
