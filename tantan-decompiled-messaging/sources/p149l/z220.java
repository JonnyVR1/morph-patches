package p149l;

import android.opengl.GLES20;
import com.cosmos.mdlog.MDLog;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class z220 extends ncj implements trl {

    /* JADX INFO: renamed from: D */
    public ByteBuffer f201151D = null;

    /* JADX INFO: renamed from: E */
    public ByteBuffer f201152E = null;

    /* JADX INFO: renamed from: F */
    protected Object f201153F = new Object();

    /* JADX INFO: renamed from: G */
    protected boolean f201154G = true;

    /* JADX INFO: renamed from: H */
    protected int[] f201155H;

    public z220() {
        this.f85423i = true;
    }

    /* JADX INFO: renamed from: O */
    public void mo135613O(int i) {
        this.f85415a = 0;
        m110711x(i / 90);
    }

    /* JADX INFO: renamed from: P */
    public void mo135614P(int i) {
        if (i == 3) {
            m110692A(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
            FloatBuffer[] floatBufferArr = new FloatBuffer[4];
            this.f85417c = floatBufferArr;
            floatBufferArr[0] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.f85417c[0].put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f}).position(0);
            this.f85417c[1] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.f85417c[1].put(new float[]{0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f}).position(0);
            this.f85417c[2] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.f85417c[2].put(new float[]{1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f}).position(0);
            this.f85417c[3] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.f85417c[3].put(new float[]{1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}).position(0);
            return;
        }
        float[] fArrMo116918S = mo116918S(i);
        float f = fArrMo116918S[0];
        float f2 = fArrMo116918S[1];
        float f3 = fArrMo116918S[2];
        float f4 = fArrMo116918S[3];
        this.f85417c[0] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f85417c[0].put(new float[]{f, f3, f2, f3, f, f4, f2, f4}).position(0);
        this.f85417c[1] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f85417c[1].put(new float[]{f3, f2, f3, f, f4, f2, f4, f}).position(0);
        this.f85417c[2] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f85417c[2].put(new float[]{f2, f4, f, f4, f2, f3, f, f3}).position(0);
        this.f85417c[3] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f85417c[3].put(new float[]{f4, f, f4, f2, f3, f, f3, f2}).position(0);
    }

    /* JADX INFO: renamed from: Q */
    public int mo116916Q() {
        int iM110701n = m110701n();
        if (this.f85415a % 2 == 1) {
            iM110701n = m110705r();
        }
        return iM110701n / 2;
    }

    /* JADX INFO: renamed from: R */
    public int mo116917R() {
        int iM110705r = m110705r();
        if (this.f85415a % 2 == 1) {
            iM110705r = m110701n();
        }
        return iM110705r / 2;
    }

    /* JADX INFO: renamed from: S */
    public float[] mo116918S(int i) {
        float f;
        float f2;
        float f3 = 0.0f;
        float f4 = 1.0f;
        if (i == 0) {
            f = 0.0f;
            f2 = 1.0f;
            f4 = 0.0f;
            f3 = 1.0f;
        } else if (i == 1) {
            f2 = 0.0f;
            f = 1.0f;
        } else if (i != 2) {
            f = 0.0f;
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
            f = 1.0f;
            f4 = 0.0f;
            f3 = 1.0f;
        }
        return new float[]{f3, f4, f, f2};
    }

    /* JADX INFO: renamed from: T */
    public int mo116919T() {
        return this.f85415a % 2 == 1 ? m110705r() : m110701n();
    }

    /* JADX INFO: renamed from: U */
    public int mo116920U() {
        return this.f85415a % 2 == 1 ? m110701n() : m110705r();
    }

    /* JADX INFO: renamed from: V */
    public void mo135615V(byte[] bArr, int i) {
        if (bArr == null) {
            return;
        }
        synchronized (this.f201153F) {
            try {
                try {
                    ByteBuffer byteBuffer = this.f201151D;
                    if (byteBuffer == null || byteBuffer.capacity() != i) {
                        this.f201151D = ByteBuffer.allocateDirect(i);
                    }
                    ByteBuffer byteBuffer2 = this.f201152E;
                    if (byteBuffer2 == null || byteBuffer2.capacity() != i / 2) {
                        this.f201152E = ByteBuffer.allocateDirect(i / 2);
                    }
                    this.f201151D.clear();
                    this.f201152E.clear();
                    this.f201151D.position(0);
                    this.f201152E.position(0);
                    this.f201151D.put(bArr, 0, i);
                    this.f201152E.put(bArr, i, i / 2);
                    this.f201151D.position(0);
                    this.f201152E.position(0);
                    this.f201154G = false;
                } catch (Exception e) {
                    MDLog.m7391e("NV21PreviewInput", "exception: " + e.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.trl
    /* JADX INFO: renamed from: b */
    public boolean mo157270b() {
        return this.f201154G;
    }

    @Override // p149l.ncj, p149l.dcj
    /* JADX INFO: renamed from: f */
    public void mo102038f() {
        super.mo102038f();
        try {
            int i = this.f85422h;
            if (i != 0) {
                GLES20.glDeleteTextures(1, new int[]{i}, 0);
                this.f85422h = 0;
            }
        } catch (Exception unused) {
        }
        try {
            GLES20.glDeleteTextures(1, this.f201155H, 0);
        } catch (Exception unused2) {
        }
    }

    @Override // p149l.dcj
    /* JADX INFO: renamed from: m */
    public String mo102573m() {
        return "precision mediump float;uniform sampler2D SamplerY;uniform sampler2D SamplerUV;varying mediump vec2 coordinate;void main(){   float r, g, b, y, u, v;\n   y = texture2D(SamplerY, coordinate).r;\n   u = texture2D(SamplerUV, coordinate).a - 0.5;\n   v = texture2D(SamplerUV, coordinate).r - 0.5;\n   r = y + 1.13983*v;\n   g = y - 0.39465*u - 0.58060*v;\n   b = y + 2.03211*u;\n   gl_FragColor = vec4(r, g, b, 1.0);\n}";
    }

    @Override // p149l.dcj
    /* JADX INFO: renamed from: o */
    public String mo110702o() {
        return "attribute vec4 position;attribute mediump vec4 inputTextureCoordinate;varying mediump vec2 coordinate;void main(){    gl_Position = position;    coordinate = inputTextureCoordinate.xy;}";
    }

    @Override // p149l.dcj
    /* JADX INFO: renamed from: t */
    public void mo110707t() {
        super.mo110707t();
    }

    @Override // p149l.dcj
    /* JADX INFO: renamed from: u */
    public void mo110708u() {
        super.mo110708u();
        int[] iArr = new int[2];
        this.f201155H = iArr;
        GLES20.glGenTextures(2, iArr, 0);
        for (int i = 0; i < 2; i++) {
            int i2 = this.f201155H[i];
            GLES20.glActiveTexture(33984 + i);
            GLES20.glBindTexture(3553, i2);
            GLES20.glPixelStorei(3317, 1);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
        }
        GLES20.glUseProgram(this.f85418d);
        GLES20.glUniform1i(GLES20.glGetUniformLocation(this.f85418d, "SamplerY"), 0);
        GLES20.glUniform1i(GLES20.glGetUniformLocation(this.f85418d, "SamplerUV"), 1);
    }

    @Override // p149l.dcj
    /* JADX INFO: renamed from: v */
    public void mo110709v() {
        m158950L();
        super.mo110709v();
    }

    @Override // p149l.dcj
    /* JADX INFO: renamed from: w */
    public void mo110710w() {
        super.mo110710w();
        this.f85416b.position(0);
        GLES20.glUseProgram(this.f85418d);
        GLES20.glUniform1i(GLES20.glGetUniformLocation(this.f85418d, "SamplerY"), 0);
        GLES20.glUniform1i(GLES20.glGetUniformLocation(this.f85418d, "SamplerUV"), 1);
        GLES20.glVertexAttribPointer(this.f85420f, 2, 5126, false, 0, (Buffer) this.f85416b);
        GLES20.glEnableVertexAttribArray(this.f85420f);
        this.f85417c[this.f85415a].position(0);
        GLES20.glVertexAttribPointer(this.f85421g, 2, 5126, false, 0, (Buffer) this.f85417c[this.f85415a]);
        GLES20.glEnableVertexAttribArray(this.f85421g);
        synchronized (this.f201153F) {
            ByteBuffer byteBuffer = this.f201151D;
            if (byteBuffer != null && this.f201152E != null) {
                byteBuffer.position(0);
                this.f201152E.position(0);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, this.f201155H[0]);
                GLES20.glTexImage2D(3553, 0, 6409, mo116920U(), mo116919T(), 0, 6409, 5121, this.f201151D);
                GLES20.glActiveTexture(33985);
                GLES20.glBindTexture(3553, this.f201155H[1]);
                GLES20.glTexImage2D(3553, 0, 6410, mo116917R(), mo116916Q(), 0, 6410, 5121, this.f201152E);
                this.f201154G = true;
                GLES20.glClear(16384);
                return;
            }
            this.f201154G = true;
        }
    }
}
