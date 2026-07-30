package p149l;

import android.graphics.Color;

/* JADX INFO: loaded from: classes8.dex */
public class yd5 extends Color {
    /* JADX INFO: renamed from: a */
    public static int m214214a(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.rgb((int) ((Color.red(i) * f) + (Color.red(i2) * f2)), (int) ((Color.green(i) * f) + (Color.green(i2) * f2)), (int) ((Color.blue(i) * f) + (Color.blue(i2) * f2)));
    }
}
