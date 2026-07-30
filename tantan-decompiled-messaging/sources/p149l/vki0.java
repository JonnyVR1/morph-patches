package p149l;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes8.dex */
public class vki0 {

    /* JADX INFO: renamed from: a */
    public final float[] f181808a;

    /* JADX INFO: renamed from: b */
    public FloatBuffer f181809b;

    /* JADX INFO: renamed from: c */
    public FloatBuffer f181810c;

    /* JADX INFO: renamed from: e */
    public float[] f181812e;

    /* JADX INFO: renamed from: f */
    public int f181813f;

    /* JADX INFO: renamed from: h */
    public int f181815h;

    /* JADX INFO: renamed from: i */
    public int f181816i;

    /* JADX INFO: renamed from: j */
    public int f181817j;

    /* JADX INFO: renamed from: k */
    public int f181818k;

    /* JADX INFO: renamed from: l */
    public int f181819l;

    /* JADX INFO: renamed from: d */
    public float[] f181811d = new float[16];

    /* JADX INFO: renamed from: g */
    public int f181814g = -12345;

    public vki0(int i) {
        float[] fArr = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        this.f181808a = fArr;
        float[] fArr2 = new float[16];
        this.f181812e = fArr2;
        this.f181819l = i;
        Matrix.setIdentityM(fArr2, 0);
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f181809b = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr).position(0);
        this.f181810c = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    /* JADX INFO: renamed from: a */
    public void m198741a(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        i1k.m133996a(str, ": glError ", iGlGetError);
    }

    /* JADX INFO: renamed from: b */
    public final int m198742b(String str, String str2) {
        int iM198746f;
        int iM198746f2 = m198746f(35633, str);
        if (iM198746f2 == 0 || (iM198746f = m198746f(35632, str2)) == 0) {
            return 0;
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        m198741a("glCreateProgram");
        if (iGlCreateProgram == 0) {
            return 0;
        }
        GLES20.glAttachShader(iGlCreateProgram, iM198746f2);
        m198741a("glAttachShader");
        GLES20.glAttachShader(iGlCreateProgram, iM198746f);
        m198741a("glAttachShader");
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
    public void m198743c(SurfaceTexture surfaceTexture, boolean z) {
        surfaceTexture.getTransformMatrix(this.f181812e);
        if (z) {
            float[] fArr = this.f181812e;
            fArr[5] = -fArr[5];
            fArr[13] = 1.0f - fArr[13];
        }
        GLES20.glUseProgram(this.f181813f);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.f181814g);
        this.f181809b.position(0);
        GLES20.glVertexAttribPointer(this.f181817j, 2, 5126, false, 0, (Buffer) this.f181809b);
        GLES20.glEnableVertexAttribArray(this.f181817j);
        this.f181810c.position(0);
        GLES20.glVertexAttribPointer(this.f181818k, 2, 5126, false, 0, (Buffer) this.f181810c);
        GLES20.glEnableVertexAttribArray(this.f181818k);
        GLES20.glUniformMatrix4fv(this.f181816i, 1, false, this.f181812e, 0);
        GLES20.glUniformMatrix4fv(this.f181815h, 1, false, this.f181811d, 0);
        GLES20.glDrawArrays(5, 0, 4);
    }

    /* JADX INFO: renamed from: d */
    public int m198744d() {
        return this.f181814g;
    }

    /* JADX INFO: renamed from: e */
    public void m198745e(boolean z, float f, int i) {
        if (i == 90 || i == 270 || z) {
            float f2 = f + 0.0f;
            float f3 = 1.0f - f;
            this.f181810c.put(new float[]{0.0f, f2, 1.0f, f2, 0.0f, f3, 1.0f, f3}).position(0);
        } else {
            float f4 = f + 0.0f;
            float f5 = 1.0f - f;
            this.f181810c.put(new float[]{f4, 0.0f, f5, 0.0f, f4, 1.0f, f5, 1.0f}).position(0);
        }
    }

    /* JADX INFO: renamed from: f */
    public final int m198746f(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        m198741a("glCreateShader type=" + i);
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
    public void m198747g() {
        int iM198742b = m198742b("uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n  gl_Position = uMVPMatrix * aPosition;\n  vTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
        this.f181813f = iM198742b;
        if (iM198742b == 0) {
            upk0.m194883a("failed creating program");
            return;
        }
        this.f181817j = GLES20.glGetAttribLocation(iM198742b, "aPosition");
        this.f181818k = GLES20.glGetAttribLocation(this.f181813f, "aTextureCoord");
        this.f181815h = GLES20.glGetUniformLocation(this.f181813f, "uMVPMatrix");
        this.f181816i = GLES20.glGetUniformLocation(this.f181813f, "uSTMatrix");
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i = iArr[0];
        this.f181814g = i;
        GLES20.glBindTexture(36197, i);
        m198741a("glBindTexture mTextureID");
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        m198741a("glTexParameter");
        Matrix.setIdentityM(this.f181811d, 0);
        int i2 = this.f181819l;
        if (i2 != 0) {
            Matrix.rotateM(this.f181811d, 0, i2, 0.0f, 0.0f, 1.0f);
        }
    }
}
