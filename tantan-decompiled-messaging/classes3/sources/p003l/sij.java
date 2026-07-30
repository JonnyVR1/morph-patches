package p003l;

import android.opengl.GLES20;
import java.nio.IntBuffer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class sij extends pdj0 {

    /* JADX INFO: renamed from: a */
    protected float f7263a;

    public sij(float f) {
        float fFloor = (int) Math.floor(Math.sqrt(Math.pow(4.0d, 2.0d) * (-2.0d) * Math.log(0.00390625d * Math.sqrt(Math.pow(4.0d, 2.0d) * 6.283185307179586d))));
        this.f7263a = fFloor + (fFloor % 2.0f);
    }

    /* JADX INFO: renamed from: Q1 */
    public static final String m7628Q1(float f, float f2) {
        float f3;
        double d;
        double[] dArr = new double[(int) (f + 2.0f)];
        float f4 = 0.0f;
        int i = 0;
        while (true) {
            f3 = 1.0f + f;
            if (i >= f3) {
                break;
            }
            double d2 = f2;
            double dSqrt = (1.0d / Math.sqrt(Math.pow(d2, 2.0d) * 6.283185307179586d)) * Math.exp((-Math.pow(i, 2.0d)) / (Math.pow(d2, 2.0d) * 2.0d));
            dArr[i] = dSqrt;
            if (i == 0) {
                d = f4;
            } else {
                d = f4;
                dSqrt *= 2.0d;
            }
            f4 = (float) (d + dSqrt);
            i++;
        }
        for (int i2 = 0; i2 < f3; i2++) {
            dArr[i2] = dArr[i2] / ((double) f4);
        }
        float f5 = (f / 2.0f) + (f % 2.0f);
        int iMin = (int) Math.min(f5, 7.0f);
        int i3 = (int) f5;
        IntBuffer intBufferAllocate = IntBuffer.allocate(1);
        GLES20.glGetIntegerv(36348, intBufferAllocate);
        if (intBufferAllocate.get(0) > 0 && iMin > (intBufferAllocate.get(0) - 2) / 2) {
            iMin = (intBufferAllocate.get(0) - 2) / 2;
            i3 = iMin;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n     precision mediump float;\n     uniform sampler2D inputImageTexture;\n     uniform float texelWidthOffset;\n     uniform float texelHeightOffset;\n     varying vec2 blurCoordinates[" + ((iMin * 2) + 1) + "];\n     void main()     {        vec4 sum = vec4(0.0);\n");
        stringBuffer.append("sum += texture2D(inputImageTexture, blurCoordinates[0]) * " + dArr[0] + ";\n");
        for (int i4 = 0; i4 < iMin; i4++) {
            int i5 = i4 * 2;
            int i6 = i5 + 1;
            int i7 = i5 + 2;
            double d3 = dArr[i6] + dArr[i7];
            stringBuffer.append("sum += texture2D(inputImageTexture, blurCoordinates[" + i6 + "]) * (" + d3 + ");\n");
            stringBuffer.append("sum += texture2D(inputImageTexture, blurCoordinates[" + i7 + "]) * (" + d3 + ");\n");
        }
        if (i3 > iMin) {
            stringBuffer.append("highp vec2 singleStepOffset = vec2(texelWidthOffset, texelHeightOffset);\n");
            while (iMin < i3) {
                int i8 = iMin * 2;
                int i9 = i8 + 1;
                double d4 = dArr[i9];
                int i10 = i8 + 2;
                double d5 = dArr[i10];
                double d6 = d4 + d5;
                stringBuffer.append("ssum += texture2D(inputImageTexture, blurCoordinates[0] + singleStepOffset *" + (((d4 * ((double) i9)) + (d5 * ((double) i10))) / d6) + ")*" + d6 + ";\n");
                iMin++;
            }
        }
        stringBuffer.append("gl_FragColor = sum;    }\n");
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: R1 */
    public static final String m7629R1(float f, float f2) {
        float f3;
        float[] fArr = new float[(int) (f + 2.0f)];
        float f4 = 0.0f;
        int i = 0;
        while (true) {
            f3 = 1.0f + f;
            if (i >= f3) {
                break;
            }
            double d = f2;
            float fSqrt = (float) ((1.0d / Math.sqrt(Math.pow(d, 2.0d) * 6.283185307179586d)) * Math.exp((-Math.pow(i, 2.0d)) / (Math.pow(d, 2.0d) * 2.0d)));
            fArr[i] = fSqrt;
            f4 = i == 0 ? f4 + fSqrt : (float) (((double) f4) + (((double) fSqrt) * 2.0d));
            i++;
        }
        for (int i2 = 0; i2 < f3; i2++) {
            fArr[i2] = fArr[i2] / f4;
        }
        int iMin = (int) Math.min((f / 2.0f) + (f % 2.0f), 7.0f);
        IntBuffer intBufferAllocate = IntBuffer.allocate(1);
        GLES20.glGetIntegerv(36348, intBufferAllocate);
        if (intBufferAllocate.get(0) > 0 && iMin > (intBufferAllocate.get(0) - 2) / 2) {
            iMin = (intBufferAllocate.get(0) - 2) / 2;
        }
        float[] fArr2 = new float[iMin];
        for (int i3 = 0; i3 < iMin; i3++) {
            int i4 = i3 * 2;
            int i5 = i4 + 1;
            float f5 = fArr[i5];
            int i6 = i4 + 2;
            float f6 = fArr[i6];
            fArr2[i3] = ((f5 * i5) + (f6 * i6)) / (f5 + f6);
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("precision mediump float;\n      attribute vec4 position; \n      attribute vec4 inputTextureCoordinate; \n      uniform float texelWidthOffset; \n      uniform float texelHeightOffset; \n      varying vec2 blurCoordinates[" + ((iMin * 2) + 1) + "];\n      void main() \n      {          gl_Position = position; \n                    vec2 singleStepOffset = vec2(texelWidthOffset, texelHeightOffset);\n");
        stringBuffer.append("blurCoordinates[0] = inputTextureCoordinate.xy;\n");
        for (int i7 = 0; i7 < iMin; i7++) {
            StringBuilder sb = new StringBuilder("blurCoordinates[");
            int i8 = i7 * 2;
            sb.append(i8 + 1);
            sb.append("] = inputTextureCoordinate.xy + singleStepOffset *");
            sb.append(fArr2[i7]);
            sb.append(";\n");
            stringBuffer.append(sb.toString());
            stringBuffer.append("blurCoordinates[" + (i8 + 2) + "] = inputTextureCoordinate.xy - singleStepOffset *" + fArr2[i7] + ";\n");
        }
        stringBuffer.append("}\n");
        return stringBuffer.toString();
    }

    @Override // p003l.ccj
    public String getFragmentShader() {
        float f = this.f7263a;
        return m7628Q1(f, f);
    }

    @Override // p003l.ccj
    public String getVertexShader() {
        float f = this.f7263a;
        return m7629R1(f, f);
    }

    @Override // p003l.pdj0, p003l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
    }

    @Override // p003l.pdj0, p003l.ccj
    public void passShaderValues() {
        super.passShaderValues();
    }
}
