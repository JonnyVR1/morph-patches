package p003l;

import android.graphics.Point;
import android.opengl.GLES20;
import java.lang.reflect.Array;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class wsi0 extends xj10 {

    /* JADX INFO: renamed from: a */
    private int[] f8610a;

    /* JADX INFO: renamed from: b */
    private int[] f8611b;

    /* JADX INFO: renamed from: c */
    private int[] f8612c;

    /* JADX INFO: renamed from: d */
    private int[] f8613d;

    /* JADX INFO: renamed from: l.wsi0$a */
    public class C0618a implements Comparator<Point> {
        public C0618a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Point point, Point point2) {
            return point.x - point2.x;
        }
    }

    public wsi0(Point[] pointArr, Point[] pointArr2, Point[] pointArr3, Point[] pointArr4) {
        super(2);
        float[] fArrM8579R1 = m8579R1(pointArr);
        float[] fArrM8579R2 = m8579R1(pointArr3);
        float[] fArrM8579R3 = m8579R1(pointArr2);
        float[] fArrM8579R4 = m8579R1(pointArr4);
        this.f8610a = new int[256];
        this.f8611b = new int[256];
        this.f8612c = new int[256];
        for (int i = 0; i < 256; i++) {
            float f = i;
            this.f8610a[i] = (int) Math.min(Math.max(fArrM8579R1[i] + f + fArrM8579R4[i], 0.0f), 255.0f);
            this.f8611b[i] = (int) Math.min(Math.max(fArrM8579R3[i] + f + fArrM8579R4[i], 0.0f), 255.0f);
            this.f8612c[i] = (int) Math.min(Math.max(f + fArrM8579R2[i] + fArrM8579R4[i], 0.0f), 255.0f);
        }
    }

    /* JADX INFO: renamed from: Q1 */
    private void m8578Q1() {
        int[] iArr = new int[256];
        for (int i = 0; i < 256; i++) {
            iArr[i] = (this.f8610a[i] & 255) | ((this.f8611b[i] << 8) & 65280) | ((this.f8612c[i] << 16) & 16711680) | RoundedDrawable.DEFAULT_BORDER_COLOR;
        }
        int[] iArr2 = new int[1];
        this.f8613d = iArr2;
        GLES20.glGenTextures(1, iArr2, 0);
        GLES20.glBindTexture(3553, this.f8613d[0]);
        GLES20.glTexParameteri(3553, 10241, 9728);
        GLES20.glTexParameteri(3553, 10240, 9728);
        GLES20.glTexImage2D(3553, 0, 6408, 256, 1, 0, 6408, 5121, IntBuffer.wrap(iArr));
    }

    /* JADX INFO: renamed from: R1 */
    private float[] m8579R1(Point[] pointArr) {
        Arrays.sort(pointArr, new C0618a());
        List<Point> listM8580S1 = m8580S1(pointArr);
        if (listM8580S1.get(0).x > 0) {
            for (int i = listM8580S1.get(0).x; i >= 0; i--) {
                listM8580S1.add(0, new Point(i, 0));
            }
        }
        if (listM8580S1.get(listM8580S1.size() - 1).x < 255) {
            for (int i2 = listM8580S1.get(listM8580S1.size() - 1).x; i2 < 256; i2++) {
                listM8580S1.add(new Point(i2, 255));
            }
        }
        float[] fArr = new float[listM8580S1.size()];
        for (int i3 = 0; i3 < listM8580S1.size(); i3++) {
            Point point = listM8580S1.get(i3);
            int i4 = point.x;
            Point point2 = new Point(i4, i4);
            float fSqrt = (float) Math.sqrt(Math.pow(point2.x - point.x, 2.0d) + Math.pow(point2.y - point.y, 2.0d));
            if (point2.y > point.y) {
                fSqrt = -fSqrt;
            }
            fArr[i3] = fSqrt;
        }
        return fArr;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0068 A[PHI: r10
      0x0068: PHI (r10v8 double) = (r10v6 double), (r10v7 double) binds: [B:13:0x0066, B:16:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: S1 */
    private List<Point> m8580S1(Point[] pointArr) {
        double[] dArrM8581T1 = m8581T1(pointArr);
        int length = dArrM8581T1.length;
        boolean z = true;
        if (length < 1) {
            return null;
        }
        ArrayList arrayList = new ArrayList(length + 1);
        int i = 0;
        while (i < length - 1) {
            Point point = pointArr[i];
            int i2 = i + 1;
            Point point2 = pointArr[i2];
            int i3 = point.x;
            while (true) {
                int i4 = point2.x;
                if (i3 < i4) {
                    int i5 = point.x;
                    double d = ((double) (i3 - i5)) / ((double) (i4 - i5));
                    double d2 = 1.0d - d;
                    double d3 = i4 - i5;
                    boolean z2 = z;
                    double[] dArr = dArrM8581T1;
                    int i6 = length;
                    double d4 = (((double) point.y) * d2) + (((double) point2.y) * d) + (((d3 * d3) / 6.0d) * (((((d2 * d2) * d2) - d2) * dArr[i]) + ((((d * d) * d) - d) * dArr[i2])));
                    double d5 = 255.0d;
                    if (d4 > 255.0d) {
                        d4 = d5;
                    } else {
                        d5 = 0.0d;
                        if (d4 < 0.0d) {
                            d4 = d5;
                        }
                    }
                    arrayList.add(new Point(i3, (int) d4));
                    i3++;
                    z = z2;
                    dArrM8581T1 = dArr;
                    length = i6;
                }
            }
            i = i2;
        }
        if (arrayList.size() == 255) {
            arrayList.add(pointArr[pointArr.length - 1]);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: T1 */
    private double[] m8581T1(Point[] pointArr) {
        int i;
        int length = pointArr.length;
        int i2 = 1;
        if (length <= 1) {
            return null;
        }
        char c = 2;
        int i3 = 0;
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, 3);
        double[] dArr2 = new double[length];
        double[] dArr3 = dArr[0];
        double d = 1.0d;
        dArr3[1] = 1.0d;
        double d2 = 0.0d;
        dArr3[0] = 0.0d;
        dArr3[2] = 0.0d;
        int i4 = 1;
        while (true) {
            i = length - 1;
            if (i4 >= i) {
                break;
            }
            Point point = pointArr[i4 - 1];
            Point point2 = pointArr[i4];
            int i5 = i4 + 1;
            Point point3 = pointArr[i5];
            double[] dArr4 = dArr[i4];
            int i6 = i2;
            int i7 = point2.x;
            char c2 = c;
            int i8 = point.x;
            int i9 = i3;
            double d3 = d;
            dArr4[i9] = ((double) (i7 - i8)) / 6.0d;
            int i10 = point3.x;
            dArr4[i6] = ((double) (i10 - i8)) / 3.0d;
            dArr4[c2] = ((double) (i10 - i7)) / 6.0d;
            int i11 = point3.y;
            int i12 = point2.y;
            dArr2[i4] = (((double) (i11 - i12)) / ((double) (i10 - i7))) - (((double) (i12 - point.y)) / ((double) (i7 - i8)));
            i2 = i6;
            i4 = i5;
            d2 = d2;
            c = c2;
            i3 = i9;
            d = d3;
        }
        int i13 = i2;
        char c3 = c;
        int i14 = i3;
        double d4 = d2;
        dArr2[i14] = d4;
        dArr2[i] = d4;
        double[] dArr5 = dArr[i];
        dArr5[i13] = d;
        dArr5[i14] = d4;
        dArr5[c3] = d4;
        for (int i15 = i13; i15 < length; i15++) {
            double[] dArr6 = dArr[i15];
            double d5 = dArr6[i14];
            int i16 = i15 - 1;
            double[] dArr7 = dArr[i16];
            double d6 = d5 / dArr7[i13];
            dArr6[i13] = dArr6[i13] - (dArr7[c3] * d6);
            dArr6[i14] = d4;
            dArr2[i15] = dArr2[i15] - (d6 * dArr2[i16]);
        }
        for (int i17 = length - 2; i17 >= 0; i17--) {
            double[] dArr8 = dArr[i17];
            double d7 = dArr8[c3];
            int i18 = i17 + 1;
            double[] dArr9 = dArr[i18];
            double d8 = d7 / dArr9[i13];
            dArr8[i13] = dArr8[i13] - (dArr9[i14] * d8);
            dArr8[c3] = d4;
            dArr2[i17] = dArr2[i17] - (d8 * dArr2[i18]);
        }
        double[] dArr10 = new double[length];
        for (int i19 = i14; i19 < length; i19++) {
            dArr10[i19] = dArr2[i19] / dArr[i19][i13];
        }
        return dArr10;
    }

    @Override // p003l.xj10, p003l.mcj, p003l.ccj
    public void destroy() {
        super.destroy();
        int[] iArr = this.f8613d;
        if (iArr == null || iArr[0] == 0) {
            return;
        }
        GLES20.glDeleteTextures(1, iArr, 0);
        this.f8613d = null;
    }

    @Override // p003l.ccj
    public String getFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nconst float halfPixelWidth = 1.0/512.0;void main(){\n   vec4 texColour = texture2D(inputImageTexture0,textureCoordinate);\n   float rVal;\n   if(texColour.r < halfPixelWidth) {     rVal = texture2D(inputImageTexture1, vec2(texColour.r + halfPixelWidth, 0.5)).r;\n   } else {\n     rVal = texture2D(inputImageTexture1, vec2(texColour.r - halfPixelWidth, 0.5)).r;\n   }\n   float gVal;\n   if(texColour.g < halfPixelWidth) {     gVal = texture2D(inputImageTexture1, vec2(texColour.g + halfPixelWidth, 0.5)).r;\n   } else {\n     gVal = texture2D(inputImageTexture1, vec2(texColour.g - halfPixelWidth, 0.5)).r;\n   }\n   float bVal;\n   if(texColour.b < halfPixelWidth) {     bVal = texture2D(inputImageTexture1, vec2(texColour.b + halfPixelWidth, 0.5)).r;\n   } else {\n     bVal = texture2D(inputImageTexture1, vec2(texColour.b - halfPixelWidth, 0.5)).r;\n   }\n   gl_FragColor = vec4(rVal,gVal,bVal,texColour.a);\n}\n";
    }

    @Override // p003l.xj10, p003l.ts2, p003l.jcj
    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        if (this.filterLocations.size() < 2 || !mcjVar.equals(this.filterLocations.get(0))) {
            clearRegisteredFilterLocations();
            registerFilterLocation(mcjVar, 0);
            registerFilterLocation(this, 1);
        }
        int[] iArr = this.f8613d;
        if (iArr == null || iArr[0] == 0) {
            m8578Q1();
        }
        super.newTextureReady(this.f8613d[0], this, z);
        super.newTextureReady(i, mcjVar, z);
    }
}
