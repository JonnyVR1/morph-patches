package p149l;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public interface ia5 extends aa5 {
    /* JADX INFO: renamed from: A */
    static ia5 m135128A(Bitmap bitmap, twc0<Bitmap> twc0Var, mnb0 mnb0Var, int i, int i2) {
        return uh2.m193609Q() ? new uh2(bitmap, twc0Var, mnb0Var, i, i2) : new lmd(bitmap, twc0Var, mnb0Var, i, i2);
    }

    /* JADX INFO: renamed from: O */
    static ia5 m135129O(fa5<Bitmap> fa5Var, mnb0 mnb0Var, int i, int i2) {
        return uh2.m193609Q() ? new uh2(fa5Var, mnb0Var, i, i2) : new lmd(fa5Var, mnb0Var, i, i2);
    }

    /* JADX INFO: renamed from: w */
    static ia5 m135130w(Bitmap bitmap, twc0<Bitmap> twc0Var, mnb0 mnb0Var, int i) {
        return m135128A(bitmap, twc0Var, mnb0Var, i, 0);
    }

    /* JADX INFO: renamed from: z */
    static ia5 m135131z(fa5<Bitmap> fa5Var, mnb0 mnb0Var, int i) {
        return m135129O(fa5Var, mnb0Var, i, 0);
    }

    /* JADX INFO: renamed from: U */
    int mo135132U();

    /* JADX INFO: renamed from: s */
    fa5<Bitmap> mo135133s();

    /* JADX INFO: renamed from: x */
    int mo135134x();
}
