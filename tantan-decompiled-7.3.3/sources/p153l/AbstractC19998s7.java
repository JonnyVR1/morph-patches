package p153l;

import com.google.android.gms.common.api.Api;
import com.google.zxing.NotFoundException;

/* JADX INFO: renamed from: l.s7 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC19998s7 extends sp50 {

    /* JADX INFO: renamed from: b */
    public final int[] f166627b;

    /* JADX INFO: renamed from: e */
    public final int[] f166630e;

    /* JADX INFO: renamed from: f */
    public final int[] f166631f;

    /* JADX INFO: renamed from: a */
    public final int[] f166626a = new int[4];

    /* JADX INFO: renamed from: c */
    public final float[] f166628c = new float[4];

    /* JADX INFO: renamed from: d */
    public final float[] f166629d = new float[4];

    public AbstractC19998s7() {
        int[] iArr = new int[8];
        this.f166627b = iArr;
        this.f166630e = new int[iArr.length / 2];
        this.f166631f = new int[iArr.length / 2];
    }

    /* JADX INFO: renamed from: g */
    public static void m184930g(int[] iArr, float[] fArr) {
        int i = 0;
        float f = fArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            float f2 = fArr[i2];
            if (f2 < f) {
                i = i2;
                f = f2;
            }
        }
        iArr[i] = iArr[i] - 1;
    }

    /* JADX INFO: renamed from: n */
    public static void m184931n(int[] iArr, float[] fArr) {
        int i = 0;
        float f = fArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            float f2 = fArr[i2];
            if (f2 > f) {
                i = i2;
                f = f2;
            }
        }
        iArr[i] = iArr[i] + 1;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m184932o(int[] iArr) {
        int i = iArr[0] + iArr[1];
        float f = i / ((iArr[2] + i) + iArr[3]);
        if (f >= 0.7916667f && f <= 0.89285713f) {
            int i2 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            int i3 = Integer.MIN_VALUE;
            for (int i4 : iArr) {
                if (i4 > i3) {
                    i3 = i4;
                }
                if (i4 < i2) {
                    i2 = i4;
                }
            }
            if (i3 < i2 * 10) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: p */
    public static int m184933p(int[] iArr, int[][] iArr2) throws NotFoundException {
        for (int i = 0; i < iArr2.length; i++) {
            if (sp50.m187324d(iArr, iArr2[i], 0.45f) < 0.2f) {
                return i;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* JADX INFO: renamed from: h */
    public final int[] m184934h() {
        return this.f166627b;
    }

    /* JADX INFO: renamed from: i */
    public final int[] m184935i() {
        return this.f166626a;
    }

    /* JADX INFO: renamed from: j */
    public final int[] m184936j() {
        return this.f166631f;
    }

    /* JADX INFO: renamed from: k */
    public final float[] m184937k() {
        return this.f166629d;
    }

    /* JADX INFO: renamed from: l */
    public final int[] m184938l() {
        return this.f166630e;
    }

    /* JADX INFO: renamed from: m */
    public final float[] m184939m() {
        return this.f166628c;
    }
}
