package p153l;

import android.opengl.Matrix;
import com.google.android.exoplayer2.util.GlUtil;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class t7j {

    /* JADX INFO: renamed from: a */
    public final float[] f172439a = new float[16];

    /* JADX INFO: renamed from: b */
    public final float[] f172440b = new float[16];

    /* JADX INFO: renamed from: c */
    public final wzi0<float[]> f172441c = new wzi0<>();

    /* JADX INFO: renamed from: d */
    public boolean f172442d;

    /* JADX INFO: renamed from: a */
    public static void m189611a(float[] fArr, float[] fArr2) {
        GlUtil.m12191j(fArr);
        float f = fArr2[10];
        float f2 = fArr2[8];
        float fSqrt = (float) Math.sqrt((f * f) + (f2 * f2));
        float f3 = fArr2[10];
        fArr[0] = f3 / fSqrt;
        float f4 = fArr2[8];
        fArr[2] = f4 / fSqrt;
        fArr[8] = (-f4) / fSqrt;
        fArr[10] = f3 / fSqrt;
    }

    /* JADX INFO: renamed from: b */
    public static void m189612b(float[] fArr, float[] fArr2) {
        float f = fArr2[0];
        float f2 = -fArr2[1];
        float f3 = -fArr2[2];
        float length = Matrix.length(f, f2, f3);
        if (length != 0.0f) {
            Matrix.setRotateM(fArr, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
        } else {
            GlUtil.m12191j(fArr);
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m189613c(float[] fArr, long j) {
        float[] fArrM208734j = this.f172441c.m208734j(j);
        if (fArrM208734j == null) {
            return false;
        }
        m189612b(this.f172440b, fArrM208734j);
        if (!this.f172442d) {
            m189611a(this.f172439a, this.f172440b);
            this.f172442d = true;
        }
        Matrix.multiplyMM(fArr, 0, this.f172439a, 0, this.f172440b, 0);
        return true;
    }

    /* JADX INFO: renamed from: d */
    public void m189614d() {
        this.f172441c.m208728c();
        this.f172442d = false;
    }

    /* JADX INFO: renamed from: e */
    public void m189615e(long j, float[] fArr) {
        this.f172441c.m208726a(j, fArr);
    }
}
