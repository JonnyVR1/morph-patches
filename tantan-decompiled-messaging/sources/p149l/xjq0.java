package p149l;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
class xjq0 {

    /* JADX INFO: renamed from: a */
    static int f193241a;

    /* JADX INFO: renamed from: a */
    public static tjq0 m209738a(Context context) {
        if (fvq0.m123355i()) {
            f193241a = 1;
            return new wjq0(context);
        }
        if (sjq0.m184543g(context)) {
            f193241a = 2;
            return new sjq0(context);
        }
        if (zjq0.m219143j(context)) {
            f193241a = 4;
            return new zjq0(context);
        }
        if (bkq0.m102504c(context)) {
            f193241a = 5;
            return new bkq0(context);
        }
        if (vjq0.m198684b(context)) {
            f193241a = 3;
            return new ujq0(context);
        }
        f193241a = 0;
        return new akq0();
    }
}
