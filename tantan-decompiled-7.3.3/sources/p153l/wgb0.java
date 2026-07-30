package p153l;

import android.app.Activity;
import android.app.Dialog;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes12.dex */
public class wgb0 {

    /* JADX INFO: renamed from: a */
    public static WeakReference<Dialog> f188929a = null;

    /* JADX INFO: renamed from: b */
    public static String f188930b = "";

    /* JADX INFO: renamed from: c */
    public static int f188931c;

    /* JADX INFO: renamed from: d */
    public static final Runnable f188932d = new Runnable() { // from class: l.vgb0
        @Override // java.lang.Runnable
        public final void run() {
            wgb0.m206190b();
        }
    };

    /* JADX INFO: renamed from: a */
    public static boolean m206189a() {
        return f188931c == 1;
    }

    /* JADX INFO: renamed from: b */
    public static void m206190b() {
        Dialog dialog;
        if (NullChecker.m82486a(f188929a) && (dialog = f188929a.get()) != null && dialog.isShowing()) {
            Activity ownerActivity = dialog.getOwnerActivity();
            if (!NullChecker.m82486a(ownerActivity) || ownerActivity.isFinishing() || ownerActivity.isDestroyed()) {
                return;
            }
            dialog.dismiss();
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m206191c() {
        f188930b = "";
        l51.m152890J(f188932d);
    }

    /* JADX INFO: renamed from: d */
    public static void m206192d(int i) {
        f188931c = i;
    }

    /* JADX INFO: renamed from: e */
    public static void m206193e(String str) {
        f188930b = str;
    }
}
