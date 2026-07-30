package p153l;

import android.view.View;

/* JADX INFO: loaded from: classes11.dex */
public class dox {
    /* JADX INFO: renamed from: a */
    public static int m117363a(int i) {
        return View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: b */
    public static int m117364b(int i) {
        return View.MeasureSpec.makeMeasureSpec(i, 1073741824);
    }

    /* JADX INFO: renamed from: c */
    public static int m117365c(int i) {
        return View.MeasureSpec.getMode(i);
    }

    /* JADX INFO: renamed from: d */
    public static int m117366d(int i) {
        return View.MeasureSpec.getSize(i);
    }

    /* JADX INFO: renamed from: e */
    public static int m117367e() {
        return View.MeasureSpec.makeMeasureSpec(0, 0);
    }
}
