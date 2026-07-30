package p006l;

import android.app.Activity;
import android.app.Dialog;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import l.e51;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class s8b0 {

    /* JADX INFO: renamed from: a */
    public static WeakReference<Dialog> f21140a = null;

    /* JADX INFO: renamed from: b */
    public static String f21141b = "";

    /* JADX INFO: renamed from: c */
    public static int f21142c;

    /* JADX INFO: renamed from: d */
    public static final Runnable f21143d = new Runnable() { // from class: l.r8b0
        @Override // java.lang.Runnable
        public final void run() {
            s8b0.m23521b();
        }
    };

    /* JADX INFO: renamed from: a */
    public static boolean m23520a() {
        return f21142c == 1;
    }

    /* JADX INFO: renamed from: b */
    public static void m23521b() {
        Dialog dialog;
        if (NullChecker.a(f21140a) && (dialog = f21140a.get()) != null && dialog.isShowing()) {
            Activity ownerActivity = dialog.getOwnerActivity();
            if (!NullChecker.a(ownerActivity) || ownerActivity.isFinishing() || ownerActivity.isDestroyed()) {
                return;
            }
            dialog.dismiss();
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m23522c() {
        f21141b = "";
        e51.J(f21143d);
    }

    /* JADX INFO: renamed from: d */
    public static void m23523d(int i) {
        f21142c = i;
    }

    /* JADX INFO: renamed from: e */
    public static void m23524e(String str) {
        f21141b = str;
    }
}
