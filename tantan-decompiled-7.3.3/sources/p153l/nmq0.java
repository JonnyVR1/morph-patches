package p153l;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class nmq0 extends hb20 {

    /* JADX INFO: renamed from: I */
    public ByteBuffer f142735I = null;

    /* JADX INFO: renamed from: J */
    public ByteBuffer f142736J = null;

    /* JADX INFO: renamed from: K */
    public ByteBuffer f142737K = null;

    /* JADX INFO: renamed from: L */
    private int[] f142738L;

    public nmq0() {
        this.f193948i = true;
    }

    @Override // p153l.hb20
    /* JADX INFO: renamed from: O */
    public void mo134336O(int i) {
        this.f193940a = 0;
        m210703x(i / 90);
    }

    @Override // p153l.hb20
    /* JADX INFO: renamed from: P */
    public void mo134337P(int i) {
        float f;
        float f2;
        if (i == 3) {
            m210694A(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
            FloatBuffer[] floatBufferArr = new FloatBuffer[4];
            this.f193942c = floatBufferArr;
            floatBufferArr[0] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.f193942c[0].put(new float[]{1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f}).position(0);
            this.f193942c[1] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.f193942c[1].put(new float[]{0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f}).position(0);
            this.f193942c[2] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.f193942c[2].put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f}).position(0);
            this.f193942c[3] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.f193942c[3].put(new float[]{1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}).position(0);
            return;
        }
        float f3 = 1.0f;
        float f4 = 0.0f;
        if (i == 0) {
            f = 1.0f;
            f2 = 0.0f;
            f4 = 1.0f;
            f3 = 0.0f;
        } else if (i == 1) {
            f2 = 1.0f;
            f = 0.0f;
        } else if (i != 2) {
            f = 0.0f;
            f2 = 0.0f;
            f4 = 1.0f;
        } else {
            f = 1.0f;
            f2 = 1.0f;
            f3 = 0.0f;
        }
        this.f193942c[0] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f193942c[0].put(new float[]{f3, f4, f, f4, f3, f2, f, f2}).position(0);
        this.f193942c[1] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f193942c[1].put(new float[]{f2, f3, f2, f, f4, f3, f4, f}).position(0);
        this.f193942c[2] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f193942c[2].put(new float[]{f, f2, f3, f2, f, f4, f3, f4}).position(0);
        this.f193942c[3] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f193942c[3].put(new float[]{f4, f, f4, f3, f2, f, f2, f3}).position(0);
    }

    @Override // p153l.hb20
    /* JADX INFO: renamed from: V */
    public void mo134343V(byte[] bArr, int i) {
        if (bArr == null) {
            return;
        }
        synchronized (this.f108558F) {
            try {
                int i2 = (i * 2) / 3;
                int i3 = i / 6;
                int i4 = i / 6;
                ByteBuffer byteBuffer = this.f142735I;
                if (byteBuffer == null || i2 > byteBuffer.capacity()) {
                    this.f142735I = ByteBuffer.allocate(i2);
                }
                ByteBuffer byteBuffer2 = this.f142736J;
                if (byteBuffer2 == null || i3 > byteBuffer2.capacity()) {
                    this.f142736J = ByteBuffer.allocate(i3);
                }
                ByteBuffer byteBuffer3 = this.f142737K;
                if (byteBuffer3 == null || i4 > byteBuffer3.capacity()) {
                    this.f142737K = ByteBuffer.allocate(i4);
                }
                this.f142735I.position(0);
                this.f142736J.position(0);
                this.f142737K.position(0);
                this.f142735I.put(bArr, 0, i2);
                this.f142736J.put(bArr, i2, i3);
                this.f142737K.put(bArr, i2 + i3, i4);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.hb20, p153l.hfj, p153l.xej
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
            GLES20.glDeleteTextures(1, this.f142738L, 0);
        } catch (Exception unused2) {
        }
    }

    @Override // p153l.hb20, p153l.xej
    /* JADX INFO: renamed from: m */
    public String mo112466m() {
        return "precision mediump float;uniform sampler2D SamplerY;uniform sampler2D SamplerU;uniform sampler2D SamplerV;varying mediump vec2 coordinate;void main(){vec3 rgb;vec3 yuv;yuv.r = texture2D(SamplerY, coordinate).r - (16.0/255.0);\nyuv.g = texture2D(SamplerU, coordinate).r - 0.5;\nyuv.b = texture2D(SamplerV, coordinate).r - 0.5;\n mat3 colorConvertion = mat3(1.164, 1.164, 1.164,\n                             0.0, -0.392, 2.017,\n                             1.596, -0.813, 0.0);\n rgb = colorConvertion * yuv;   gl_FragColor = vec4(rgb, 1.0);\n}";
    }

    @Override // p153l.hb20, p153l.xej
    /* JADX INFO: renamed from: o */
    public String mo112467o() {
        return "attribute vec4 position;attribute mediump vec4 inputTextureCoordinate;varying mediump vec2 coordinate;void main(){    gl_Position = position;    coordinate = inputTextureCoordinate.xy;}";
    }

    @Override // p153l.hb20, p153l.xej
    /* JADX INFO: renamed from: t */
    public void mo112468t() {
        super.mo112468t();
    }

    @Override // p153l.hb20, p153l.xej
    /* JADX INFO: renamed from: u */
    public void mo134344u() {
        super.mo134344u();
        int[] iArr = new int[3];
        this.f142738L = iArr;
        GLES20.glGenTextures(3, iArr, 0);
        for (int i = 0; i < 3; i++) {
            int i2 = this.f142738L[i];
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
        GLES20.glUniform1i(GLES20.glGetUniformLocation(this.f193943d, "SamplerU"), 1);
        GLES20.glUniform1i(GLES20.glGetUniformLocation(this.f193943d, "SamplerV"), 2);
    }

    @Override // p153l.hb20, p153l.xej
    /* JADX INFO: renamed from: v */
    public void mo134345v() {
        m134802L();
        super.mo134345v();
    }

    @Override // p153l.hb20, p153l.xej
    /* JADX INFO: renamed from: w */
    public void mo112469w() {
        super.mo112469w();
        this.f193941b.position(0);
        int iM210702r = m210702r();
        int iM210701n = m210701n();
        if (this.f193940a % 2 == 1) {
            iM210702r = m210701n();
            iM210701n = m210702r();
        }
        int i = iM210702r;
        int i2 = iM210701n;
        GLES20.glUseProgram(this.f193943d);
        GLES20.glUniform1i(GLES20.glGetUniformLocation(this.f193943d, "SamplerY"), 0);
        GLES20.glUniform1i(GLES20.glGetUniformLocation(this.f193943d, "SamplerU"), 1);
        GLES20.glUniform1i(GLES20.glGetUniformLocation(this.f193943d, "SamplerV"), 2);
        GLES20.glVertexAttribPointer(this.f193945f, 2, 5126, false, 0, (Buffer) this.f193941b);
        GLES20.glEnableVertexAttribArray(this.f193945f);
        this.f193942c[this.f193940a].position(0);
        GLES20.glVertexAttribPointer(this.f193946g, 2, 5126, false, 0, (Buffer) this.f193942c[this.f193940a]);
        GLES20.glEnableVertexAttribArray(this.f193946g);
        synchronized (this.f108558F) {
            try {
                ByteBuffer byteBuffer = this.f142735I;
                ByteBuffer byteBuffer2 = this.f142736J;
                ByteBuffer byteBuffer3 = this.f142737K;
                if (byteBuffer != null && byteBuffer2 != null && byteBuffer3 != null) {
                    byteBuffer.position(0);
                    byteBuffer2.position(0);
                    byteBuffer3.position(0);
                    GLES20.glActiveTexture(33984);
                    GLES20.glBindTexture(3553, this.f142738L[0]);
                    GLES20.glTexImage2D(3553, 0, 6409, i, i2, 0, 6409, 5121, byteBuffer);
                    GLES20.glActiveTexture(33985);
                    GLES20.glBindTexture(3553, this.f142738L[1]);
                    GLES20.glTexImage2D(3553, 0, 6409, i / 2, i2 / 2, 0, 6409, 5121, byteBuffer2);
                    GLES20.glActiveTexture(33986);
                    GLES20.glBindTexture(3553, this.f142738L[2]);
                    GLES20.glTexImage2D(3553, 0, 6409, i / 2, i2 / 2, 0, 6409, 5121, byteBuffer3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
