package p153l;

/* JADX INFO: loaded from: classes7.dex */
public final class ihx {
    /* JADX INFO: renamed from: a */
    public static float m140043a(float f, float f2, float f3, float f4) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        return (float) Math.sqrt((f5 * f5) + (f6 * f6));
    }

    /* JADX INFO: renamed from: b */
    public static float m140044b(int i, int i2, int i3, int i4) {
        int i5 = i - i3;
        int i6 = i2 - i4;
        return (float) Math.sqrt((i5 * i5) + (i6 * i6));
    }

    /* JADX INFO: renamed from: c */
    public static int m140045c(float f) {
        return (int) (f + (f < 0.0f ? -0.5f : 0.5f));
    }

    /* JADX INFO: renamed from: d */
    public static int m140046d(int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        return i;
    }
}
