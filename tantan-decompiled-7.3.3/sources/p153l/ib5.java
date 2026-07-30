package p153l;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public interface ib5 extends ab5 {
    /* JADX INFO: renamed from: A */
    static ib5 m139279A(Bitmap bitmap, w4d0<Bitmap> w4d0Var, qvb0 qvb0Var, int i, int i2) {
        return bi2.m104386Q() ? new bi2(bitmap, w4d0Var, qvb0Var, i, i2) : new rnd(bitmap, w4d0Var, qvb0Var, i, i2);
    }

    /* JADX INFO: renamed from: O */
    static ib5 m139280O(fb5<Bitmap> fb5Var, qvb0 qvb0Var, int i, int i2) {
        return bi2.m104386Q() ? new bi2(fb5Var, qvb0Var, i, i2) : new rnd(fb5Var, qvb0Var, i, i2);
    }

    /* JADX INFO: renamed from: w */
    static ib5 m139281w(Bitmap bitmap, w4d0<Bitmap> w4d0Var, qvb0 qvb0Var, int i) {
        return m139279A(bitmap, w4d0Var, qvb0Var, i, 0);
    }

    /* JADX INFO: renamed from: z */
    static ib5 m139282z(fb5<Bitmap> fb5Var, qvb0 qvb0Var, int i) {
        return m139280O(fb5Var, qvb0Var, i, 0);
    }

    /* JADX INFO: renamed from: V */
    int mo104388V();

    /* JADX INFO: renamed from: s */
    fb5<Bitmap> mo104389s();

    /* JADX INFO: renamed from: x */
    int mo104390x();
}
