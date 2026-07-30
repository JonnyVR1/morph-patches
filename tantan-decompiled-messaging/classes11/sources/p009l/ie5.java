package p009l;

import android.graphics.Color;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ie5 {
    /* JADX INFO: renamed from: a */
    public static boolean m16504a(int i) {
        return Math.sqrt(((((double) (Color.red(i) * Color.red(i))) * 0.241d) + (((double) (Color.green(i) * Color.green(i))) * 0.691d)) + (((double) (Color.blue(i) * Color.blue(i))) * 0.068d)) > 130.0d;
    }
}
