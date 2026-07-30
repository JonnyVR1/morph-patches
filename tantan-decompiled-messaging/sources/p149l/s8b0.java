package p149l;

import android.app.Activity;
import android.app.Dialog;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes9.dex */
public class s8b0 {

    /* JADX INFO: renamed from: a */
    public static WeakReference<Dialog> f163024a = null;

    /* JADX INFO: renamed from: b */
    public static String f163025b = "";

    /* JADX INFO: renamed from: c */
    public static int f163026c;

    /* JADX INFO: renamed from: d */
    public static final Runnable f163027d = new Runnable() { // from class: l.r8b0
        @Override // java.lang.Runnable
        public final void run() {
            s8b0.m182581b();
        }
    };

    /* JADX INFO: renamed from: a */
    public static boolean m182580a() {
        return f163026c == 1;
    }

    /* JADX INFO: renamed from: b */
    public static void m182581b() {
        Dialog dialog;
        if (NullChecker.m81303a(f163024a) && (dialog = f163024a.get()) != null && dialog.isShowing()) {
            Activity ownerActivity = dialog.getOwnerActivity();
            if (!NullChecker.m81303a(ownerActivity) || ownerActivity.isFinishing() || ownerActivity.isDestroyed()) {
                return;
            }
            dialog.dismiss();
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m182582c() {
        f163025b = "";
        e51.m114745J(f163027d);
    }

    /* JADX INFO: renamed from: d */
    public static void m182583d(int i) {
        f163026c = i;
    }

    /* JADX INFO: renamed from: e */
    public static void m182584e(String str) {
        f163025b = str;
    }
}
