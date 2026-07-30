package p149l;

import android.opengl.Matrix;
import com.google.android.exoplayer2.util.GlUtil;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class y4j {

    /* JADX INFO: renamed from: a */
    public final float[] f196293a = new float[16];

    /* JADX INFO: renamed from: b */
    public final float[] f196294b = new float[16];

    /* JADX INFO: renamed from: c */
    public final tqi0<float[]> f196295c = new tqi0<>();

    /* JADX INFO: renamed from: d */
    public boolean f196296d;

    /* JADX INFO: renamed from: a */
    public static void m212911a(float[] fArr, float[] fArr2) {
        GlUtil.m12137j(fArr);
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
    public static void m212912b(float[] fArr, float[] fArr2) {
        float f = fArr2[0];
        float f2 = -fArr2[1];
        float f3 = -fArr2[2];
        float length = Matrix.length(f, f2, f3);
        if (length != 0.0f) {
            Matrix.setRotateM(fArr, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
        } else {
            GlUtil.m12137j(fArr);
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m212913c(float[] fArr, long j) {
        float[] fArrM190121j = this.f196295c.m190121j(j);
        if (fArrM190121j == null) {
            return false;
        }
        m212912b(this.f196294b, fArrM190121j);
        if (!this.f196296d) {
            m212911a(this.f196293a, this.f196294b);
            this.f196296d = true;
        }
        Matrix.multiplyMM(fArr, 0, this.f196293a, 0, this.f196294b, 0);
        return true;
    }

    /* JADX INFO: renamed from: d */
    public void m212914d() {
        this.f196295c.m190115c();
        this.f196296d = false;
    }

    /* JADX INFO: renamed from: e */
    public void m212915e(long j, float[] fArr) {
        this.f196295c.m190113a(j, fArr);
    }
}
