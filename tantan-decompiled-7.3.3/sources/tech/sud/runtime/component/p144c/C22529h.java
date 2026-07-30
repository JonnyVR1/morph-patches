package tech.sud.runtime.component.p144c;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import tech.sud.runtime.core.C22563g;

/* JADX INFO: renamed from: tech.sud.runtime.component.c.h */
/* JADX INFO: loaded from: classes3.dex */
public class C22529h {

    /* JADX INFO: renamed from: c */
    private static C22529h f208574c = new C22529h();

    /* JADX INFO: renamed from: d */
    private boolean f208577d = false;

    /* JADX INFO: renamed from: a */
    public int f208575a = 0;

    /* JADX INFO: renamed from: b */
    public int f208576b = 0;

    /* JADX INFO: renamed from: tech.sud.runtime.component.c.h$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private static int f208578a = -1;

        /* JADX INFO: renamed from: a */
        public static int m222969a(Context context, int i) {
            if (f208578a < 0) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((Activity) context).getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
                int i2 = displayMetrics.widthPixels;
                int i3 = displayMetrics.heightPixels;
                if (((i == 0 || i == 2) && i3 > i2) || ((i == 1 || i == 3) && i2 > i3)) {
                    f208578a = 0;
                } else {
                    f208578a = 1;
                }
            }
            if (f208578a == 0) {
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
    public static boolean m222967b(Context context) {
        int iM222966a = m222966a(context);
        return iM222966a == 0 || iM222966a == 2;
    }

    /* JADX INFO: renamed from: a */
    public void m222968a(Context context, C22563g c22563g) {
        if (this.f208575a == 0 || !this.f208577d) {
            this.f208577d = true;
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((Activity) context).getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            if (i > i2) {
                if (C22523b.m222865b()) {
                    this.f208577d = false;
                }
                i2 = i;
                i = i2;
            }
            this.f208575a = i;
            this.f208576b = i2;
            c22563g.m223230a(i, i2);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m222966a(Context context) {
        return a.m222969a(context, ((Activity) context).getWindowManager().getDefaultDisplay().getRotation());
    }
}
