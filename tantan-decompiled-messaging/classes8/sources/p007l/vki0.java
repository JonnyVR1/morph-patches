package p007l;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import l.upk0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class vki0 {

    /* JADX INFO: renamed from: a */
    public final float[] f4977a;

    /* JADX INFO: renamed from: b */
    public FloatBuffer f4978b;

    /* JADX INFO: renamed from: c */
    public FloatBuffer f4979c;

    /* JADX INFO: renamed from: e */
    public float[] f4981e;

    /* JADX INFO: renamed from: f */
    public int f4982f;

    /* JADX INFO: renamed from: h */
    public int f4984h;

    /* JADX INFO: renamed from: i */
    public int f4985i;

    /* JADX INFO: renamed from: j */
    public int f4986j;

    /* JADX INFO: renamed from: k */
    public int f4987k;

    /* JADX INFO: renamed from: l */
    public int f4988l;

    /* JADX INFO: renamed from: d */
    public float[] f4980d = new float[16];

    /* JADX INFO: renamed from: g */
    public int f4983g = -12345;

    public vki0(int i) {
        float[] fArr = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        this.f4977a = fArr;
        float[] fArr2 = new float[16];
        this.f4981e = fArr2;
        this.f4988l = i;
        Matrix.setIdentityM(fArr2, 0);
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f4978b = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr).position(0);
        this.f4979c = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    /* JADX INFO: renamed from: a */
    public void m11270a(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        i1k.m9358a(str, ": glError ", iGlGetError);
    }

    /* JADX INFO: renamed from: b */
    public final int m11271b(String str, String str2) {
        int iM11275f;
        int iM11275f2 = m11275f(35633, str);
        if (iM11275f2 == 0 || (iM11275f = m11275f(35632, str2)) == 0) {
            return 0;
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        m11270a("glCreateProgram");
        if (iGlCreateProgram == 0) {
            return 0;
        }
        GLES20.glAttachShader(iGlCreateProgram, iM11275f2);
        m11270a("glAttachShader");
        GLES20.glAttachShader(iGlCreateProgram, iM11275f);
        m11270a("glAttachShader");
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 1) {
            return iGlCreateProgram;
        }
        GLES20.glDeleteProgram(iGlCreateProgram);
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public void m11272c(SurfaceTexture surfaceTexture, boolean z) {
        surfaceTexture.getTransformMatrix(this.f4981e);
        if (z) {
            float[] fArr = this.f4981e;
            fArr[5] = -fArr[5];
            fArr[13] = 1.0f - fArr[13];
        }
        GLES20.glUseProgram(this.f4982f);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.f4983g);
        this.f4978b.position(0);
        GLES20.glVertexAttribPointer(this.f4986j, 2, 5126, false, 0, (Buffer) this.f4978b);
        GLES20.glEnableVertexAttribArray(this.f4986j);
        this.f4979c.position(0);
        GLES20.glVertexAttribPointer(this.f4987k, 2, 5126, false, 0, (Buffer) this.f4979c);
        GLES20.glEnableVertexAttribArray(this.f4987k);
        GLES20.glUniformMatrix4fv(this.f4985i, 1, false, this.f4981e, 0);
        GLES20.glUniformMatrix4fv(this.f4984h, 1, false, this.f4980d, 0);
        GLES20.glDrawArrays(5, 0, 4);
    }

    /* JADX INFO: renamed from: d */
    public int m11273d() {
        return this.f4983g;
    }

    /* JADX INFO: renamed from: e */
    public void m11274e(boolean z, float f, int i) {
        if (i == 90 || i == 270 || z) {
            float f2 = f + 0.0f;
            float f3 = 1.0f - f;
            this.f4979c.put(new float[]{0.0f, f2, 1.0f, f2, 0.0f, f3, 1.0f, f3}).position(0);
        } else {
            float f4 = f + 0.0f;
            float f5 = 1.0f - f;
            this.f4979c.put(new float[]{f4, 0.0f, f5, 0.0f, f4, 1.0f, f5, 1.0f}).position(0);
        }
    }

    /* JADX INFO: renamed from: f */
    public final int m11275f(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        m11270a("glCreateShader type=" + i);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        GLES20.glDeleteShader(iGlCreateShader);
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public void m11276g() {
        int iM11271b = m11271b("uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
        this.f4982f = iM11271b;
        if (iM11271b == 0) {
            upk0.a("failed creating program");
            return;
        }
        this.f4986j = GLES20.glGetAttribLocation(iM11271b, "aPosition");
        this.f4987k = GLES20.glGetAttribLocation(this.f4982f, "aTextureCoord");
        this.f4984h = GLES20.glGetUniformLocation(this.f4982f, "uMVPMatrix");
        this.f4985i = GLES20.glGetUniformLocation(this.f4982f, "uSTMatrix");
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i = iArr[0];
        this.f4983g = i;
        GLES20.glBindTexture(36197, i);
        m11270a("glBindTexture mTextureID");
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        m11270a("glTexParameter");
        Matrix.setIdentityM(this.f4980d, 0);
        int i2 = this.f4988l;
        if (i2 != 0) {
            Matrix.rotateM(this.f4980d, 0, i2, 0.0f, 0.0f, 1.0f);
        }
    }
}
