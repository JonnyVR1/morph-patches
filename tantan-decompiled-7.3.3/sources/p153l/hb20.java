package p153l;

import android.opengl.GLES20;
import com.cosmos.mdlog.MDLog;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class hb20 extends hfj implements gul {

    /* JADX INFO: renamed from: D */
    public ByteBuffer f108556D = null;

    /* JADX INFO: renamed from: E */
    public ByteBuffer f108557E = null;

    /* JADX INFO: renamed from: F */
    protected Object f108558F = new Object();

    /* JADX INFO: renamed from: G */
    protected boolean f108559G = true;

    /* JADX INFO: renamed from: H */
    protected int[] f108560H;

    public hb20() {
        this.f193948i = true;
    }

    /* JADX INFO: renamed from: O */
    public void mo134336O(int i) {
        this.f193940a = 0;
        m210703x(i / 90);
    }

    /* JADX INFO: renamed from: P */
    public void mo134337P(int i) {
        if (i == 3) {
            m210694A(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
            FloatBuffer[] floatBufferArr = new FloatBuffer[4];
            this.f193942c = floatBufferArr;
            floatBufferArr[0] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.f193942c[0].put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f}).position(0);
            this.f193942c[1] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.f193942c[1].put(new float[]{0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f}).position(0);
            this.f193942c[2] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.f193942c[2].put(new float[]{1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f}).position(0);
            this.f193942c[3] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.f193942c[3].put(new float[]{1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}).position(0);
            return;
        }
        float[] fArrMo134340S = mo134340S(i);
        float f = fArrMo134340S[0];
        float f2 = fArrMo134340S[1];
        float f3 = fArrMo134340S[2];
        float f4 = fArrMo134340S[3];
        this.f193942c[0] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f193942c[0].put(new float[]{f, f3, f2, f3, f, f4, f2, f4}).position(0);
        this.f193942c[1] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f193942c[1].put(new float[]{f3, f2, f3, f, f4, f2, f4, f}).position(0);
        this.f193942c[2] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f193942c[2].put(new float[]{f2, f4, f, f4, f2, f3, f, f3}).position(0);
        this.f193942c[3] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f193942c[3].put(new float[]{f4, f, f4, f2, f3, f, f3, f2}).position(0);
    }

    /* JADX INFO: renamed from: Q */
    public int mo134338Q() {
        int iM210701n = m210701n();
        if (this.f193940a % 2 == 1) {
            iM210701n = m210702r();
        }
        return iM210701n / 2;
    }

    /* JADX INFO: renamed from: R */
    public int mo134339R() {
        int iM210702r = m210702r();
        if (this.f193940a % 2 == 1) {
            iM210702r = m210701n();
        }
        return iM210702r / 2;
    }

    /* JADX INFO: renamed from: S */
    public float[] mo134340S(int i) {
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
    public int mo134341T() {
        return this.f193940a % 2 == 1 ? m210702r() : m210701n();
    }

    /* JADX INFO: renamed from: U */
    public int mo134342U() {
        return this.f193940a % 2 == 1 ? m210701n() : m210702r();
    }

    /* JADX INFO: renamed from: V */
    public void mo134343V(byte[] bArr, int i) {
        if (bArr == null) {
            return;
        }
        synchronized (this.f108558F) {
            try {
                try {
                    ByteBuffer byteBuffer = this.f108556D;
                    if (byteBuffer == null || byteBuffer.capacity() != i) {
                        this.f108556D = ByteBuffer.allocateDirect(i);
                    }
                    ByteBuffer byteBuffer2 = this.f108557E;
                    if (byteBuffer2 == null || byteBuffer2.capacity() != i / 2) {
                        this.f108557E = ByteBuffer.allocateDirect(i / 2);
                    }
                    this.f108556D.clear();
                    this.f108557E.clear();
                    this.f108556D.position(0);
                    this.f108557E.position(0);
                    this.f108556D.put(bArr, 0, i);
                    this.f108557E.put(bArr, i, i / 2);
                    this.f108556D.position(0);
                    this.f108557E.position(0);
                    this.f108559G = false;
                } catch (Exception e) {
                    MDLog.m7445e("NV21PreviewInput", "exception: " + e.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.gul
    /* JADX INFO: renamed from: b */
    public boolean mo132335b() {
        return this.f108559G;
    }

    @Override // p153l.hfj, p153l.xej
    /* JADX INFO: renamed from: f */
    public void mo96080f() {
        super.mo96080f();
        try {
            int i = this.f193947h;
            if (i != 0) {
                GLES20.glDeleteTextures(1, new int[]{i}, 0);
                this.f193947h = 0;
            }
        } catch (Exception unused) {
        }
        try {
            GLES20.glDeleteTextures(1, this.f108560H, 0);
        } catch (Exception unused2) {
        }
    }

    @Override // p153l.xej
    /* JADX INFO: renamed from: m */
    public String mo112466m() {
        return "precision mediump float;uniform sampler2D SamplerY;uniform sampler2D SamplerUV;varying mediump vec2 coordinate;void main(){   float r, g, b, y, u, v;\n   y = texture2D(SamplerY, coordinate).r;\n   u = texture2D(SamplerUV, coordinate).a - 0.5;\n   v = texture2D(SamplerUV, coordinate).r - 0.5;\n   r = y + 1.13983*v;\n   g = y - 0.39465*u - 0.58060*v;\n   b = y + 2.03211*u;\n   gl_FragColor = vec4(r, g, b, 1.0);\n}";
    }

    @Override // p153l.xej
    /* JADX INFO: renamed from: o */
    public String mo112467o() {
        return "attribute vec4 position;attribute mediump vec4 inputTextureCoordinate;varying mediump vec2 coordinate;void main(){    gl_Position = position;    coordinate = inputTextureCoordinate.xy;}";
    }

    @Override // p153l.xej
    /* JADX INFO: renamed from: t */
    public void mo112468t() {
        super.mo112468t();
    }

    @Override // p153l.xej
    /* JADX INFO: renamed from: u */
    public void mo134344u() {
        super.mo134344u();
        int[] iArr = new int[2];
        this.f108560H = iArr;
        GLES20.glGenTextures(2, iArr, 0);
        for (int i = 0; i < 2; i++) {
            int i2 = this.f108560H[i];
            GLES20.glActiveTexture(33984 + i);
            GLES20.glBindTexture(3553, i2);
            GLES20.glPixelStorei(3317, 1);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, 10240, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
        }
        GLES20.glUseProgram(this.f193943d);
        GLES20.glUniform1i(GLES20.glGetUniformLocation(this.f193943d, "SamplerY"), 0);
        GLES20.glUniform1i(GLES20.glGetUniformLocation(this.f193943d, "SamplerUV"), 1);
    }

    @Override // p153l.xej
    /* JADX INFO: renamed from: v */
    public void mo134345v() {
        m134802L();
        super.mo134345v();
    }

    @Override // p153l.xej
    /* JADX INFO: renamed from: w */
    public void mo112469w() {
        super.mo112469w();
        this.f193941b.position(0);
        GLES20.glUseProgram(this.f193943d);
        GLES20.glUniform1i(GLES20.glGetUniformLocation(this.f193943d, "SamplerY"), 0);
        GLES20.glUniform1i(GLES20.glGetUniformLocation(this.f193943d, "SamplerUV"), 1);
        GLES20.glVertexAttribPointer(this.f193945f, 2, 5126, false, 0, (Buffer) this.f193941b);
        GLES20.glEnableVertexAttribArray(this.f193945f);
        this.f193942c[this.f193940a].position(0);
        GLES20.glVertexAttribPointer(this.f193946g, 2, 5126, false, 0, (Buffer) this.f193942c[this.f193940a]);
        GLES20.glEnableVertexAttribArray(this.f193946g);
        synchronized (this.f108558F) {
            ByteBuffer byteBuffer = this.f108556D;
            if (byteBuffer != null && this.f108557E != null) {
                byteBuffer.position(0);
                this.f108557E.position(0);
                GLES20.glActiveTexture(33984);
                GLES20.glBindTexture(3553, this.f108560H[0]);
                GLES20.glTexImage2D(3553, 0, 6409, mo134342U(), mo134341T(), 0, 6409, 5121, this.f108556D);
                GLES20.glActiveTexture(33985);
                GLES20.glBindTexture(3553, this.f108560H[1]);
                GLES20.glTexImage2D(3553, 0, 6410, mo134339R(), mo134338Q(), 0, 6410, 5121, this.f108557E);
                this.f108559G = true;
                GLES20.glClear(16384);
                return;
            }
            this.f108559G = true;
        }
    }
}
