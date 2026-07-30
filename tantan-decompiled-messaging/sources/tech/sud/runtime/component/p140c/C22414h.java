package tech.sud.runtime.component.p140c;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import tech.sud.runtime.core.C22448g;

/* JADX INFO: renamed from: tech.sud.runtime.component.c.h */
/* JADX INFO: loaded from: classes3.dex */
public class C22414h {

    /* JADX INFO: renamed from: c */
    private static C22414h f207652c = new C22414h();

    /* JADX INFO: renamed from: d */
    private boolean f207655d = false;

    /* JADX INFO: renamed from: a */
    public int f207653a = 0;

    /* JADX INFO: renamed from: b */
    public int f207654b = 0;

    /* JADX INFO: renamed from: tech.sud.runtime.component.c.h$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private static int f207656a = -1;

        /* JADX INFO: renamed from: a */
        public static int m221723a(Context context, int i) {
            if (f207656a < 0) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((Activity) context).getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
                int i2 = displayMetrics.widthPixels;
                int i3 = displayMetrics.heightPixels;
                if (((i == 0 || i == 2) && i3 > i2) || ((i == 1 || i == 3) && i2 > i3)) {
                    f207656a = 0;
                } else {
                    f207656a = 1;
                }
            }
            if (f207656a == 0) {
                if (i == 0) {
                    return 0;
                }
                if (i == 1) {
                    return 1;
                }
                if (i != 2) {
                    return i != 3 ? 4 : 3;
                }
                return 2;
            }
            if (i == 0) {
                return 3;
            }
            if (i == 1) {
                return 0;
            }
            if (i != 2) {
                return i != 3 ? 4 : 2;
            }
            return 1;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m221721b(Context context) {
        int iM221720a = m221720a(context);
        return iM221720a == 0 || iM221720a == 2;
    }

    /* JADX INFO: renamed from: a */
    public void m221722a(Context context, C22448g c22448g) {
        if (this.f207653a == 0 || !this.f207655d) {
            this.f207655d = true;
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((Activity) context).getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            if (i > i2) {
                if (C22408b.m221619b()) {
                    this.f207655d = false;
                }
                i2 = i;
                i = i2;
            }
            this.f207653a = i;
            this.f207654b = i2;
            c22448g.m221984a(i, i2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m221720a(Context context) {
        return a.m221723a(context, ((Activity) context).getWindowManager().getDefaultDisplay().getRotation());
    }
}
