package tech.sud.runtime.component.p021c;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import tech.sud.runtime.core.C1241g;

/* JADX INFO: renamed from: tech.sud.runtime.component.c.h */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class C1207h {

    /* JADX INFO: renamed from: c */
    private static C1207h f11277c = new C1207h();

    /* JADX INFO: renamed from: d */
    private boolean f11280d = false;

    /* JADX INFO: renamed from: a */
    public int f11278a = 0;

    /* JADX INFO: renamed from: b */
    public int f11279b = 0;

    /* JADX INFO: renamed from: tech.sud.runtime.component.c.h$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private static int f11281a = -1;

        /* JADX INFO: renamed from: a */
        public static int m10194a(Context context, int i) {
            if (f11281a < 0) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((Activity) context).getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
                int i2 = displayMetrics.widthPixels;
                int i3 = displayMetrics.heightPixels;
                if (((i == 0 || i == 2) && i3 > i2) || ((i == 1 || i == 3) && i2 > i3)) {
                    f11281a = 0;
                } else {
                    f11281a = 1;
                }
            }
            if (f11281a == 0) {
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
    public static boolean m10192b(Context context) {
        int iM10191a = m10191a(context);
        return iM10191a == 0 || iM10191a == 2;
    }

    /* JADX INFO: renamed from: a */
    public void m10193a(Context context, C1241g c1241g) {
        if (this.f11278a == 0 || !this.f11280d) {
            this.f11280d = true;
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((Activity) context).getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            if (i > i2) {
                if (C1201b.m10090b()) {
                    this.f11280d = false;
                }
                i2 = i;
                i = i2;
            }
            this.f11278a = i;
            this.f11279b = i2;
            c1241g.m10455a(i, i2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m10191a(Context context) {
        return a.m10194a(context, ((Activity) context).getWindowManager().getDefaultDisplay().getRotation());
    }
}
