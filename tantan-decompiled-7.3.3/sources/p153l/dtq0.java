package p153l;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
class dtq0 {

    /* JADX INFO: renamed from: a */
    static int f90623a;

    /* JADX INFO: renamed from: a */
    public static zsq0 m117898a(Context context) {
        if (l4r0.m152824i()) {
            f90623a = 1;
            return new ctq0(context);
        }
        if (ysq0.m217268g(context)) {
            f90623a = 2;
            return new ysq0(context);
        }
        if (ftq0.m127395j(context)) {
            f90623a = 4;
            return new ftq0(context);
        }
        if (htq0.m137098c(context)) {
            f90623a = 5;
            return new htq0(context);
        }
        if (btq0.m106379b(context)) {
            f90623a = 3;
            return new atq0(context);
        }
        f90623a = 0;
        return new gtq0();
    }
}
