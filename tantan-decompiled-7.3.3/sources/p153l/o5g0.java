package p153l;

import android.opengl.GLES20;
import android.opengl.Matrix;
import com.immomo.components.interfaces.IProcessOutput;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class o5g0 extends puf implements ham {

    /* JADX INFO: renamed from: D */
    protected final float[] f145070D;

    /* JADX INFO: renamed from: E */
    private final short[] f145071E;

    /* JADX INFO: renamed from: F */
    protected Object f145072F;

    /* JADX INFO: renamed from: G */
    List<float[]> f145073G;

    /* JADX INFO: renamed from: H */
    protected w4g0 f145074H;

    /* JADX INFO: renamed from: I */
    private FloatBuffer f145075I;

    /* JADX INFO: renamed from: J */
    private FloatBuffer f145076J;

    /* JADX INFO: renamed from: K */
    private ShortBuffer f145077K;

    /* JADX INFO: renamed from: L */
    private int f145078L;

    /* JADX INFO: renamed from: M */
    private int f145079M;

    /* JADX INFO: renamed from: N */
    protected int f145080N;

    /* JADX INFO: renamed from: O */
    private boolean f145081O;

    /* JADX INFO: renamed from: P */
    private boolean f145082P;

    /* JADX INFO: renamed from: Q */
    private boolean f145083Q;

    /* JADX INFO: renamed from: R */
    private String f145084R;

    @Override // p153l.hfj
    /* JADX INFO: renamed from: F */
    public void mo134797F() {
        GLES20.glViewport(0, 0, m210702r(), m210701n());
        GLES20.glUseProgram(this.f193943d);
        GLES20.glClear(16640);
        GLES20.glClearColor(m210700l(), m210699k(), m210698j(), m210697i());
        synchronized (this.f145072F) {
            try {
                Iterator<float[]> it = this.f145073G.iterator();
                while (it.hasNext()) {
                    m166126T(it.next());
                    m166124R();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.puf
    /* JADX INFO: renamed from: O */
    public void mo166121O() {
        synchronized (m134800I()) {
            this.f145081O = false;
            this.f145083Q = false;
            throw null;
        }
    }

    /* JADX INFO: renamed from: P */
    public void m166122P() {
        synchronized (this.f145072F) {
            this.f145073G.clear();
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m166123Q() {
        int i = this.f193947h;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.f193947h = 0;
        }
    }

    /* JADX INFO: renamed from: R */
    public void m166124R() {
        GLES20.glUniform2f(this.f145078L, 1.0f, this.f145074H.m204885b() / this.f145074H.m204886c());
        GLES20.glDrawElements(4, this.f145071E.length, 5123, this.f145077K);
        GLES20.glDisableVertexAttribArray(this.f193945f);
    }

    /* JADX INFO: renamed from: S */
    public String m166125S() {
        return this.f145084R;
    }

    /* JADX INFO: renamed from: T */
    public void m166126T(float[] fArr) {
        this.f193941b.position(0);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        this.f145076J = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr);
        this.f145076J.position(0);
        GLES20.glVertexAttribPointer(this.f193945f, 2, 5126, false, 8, (Buffer) this.f145076J);
        GLES20.glVertexAttribPointer(this.f145080N, 2, 5126, false, 8, (Buffer) this.f145075I);
        GLES20.glEnableVertexAttribArray(this.f193945f);
        GLES20.glEnableVertexAttribArray(this.f145080N);
        this.f193942c[this.f193940a].position(0);
        GLES20.glVertexAttribPointer(this.f193946g, 2, 5126, false, 8, (Buffer) this.f193942c[this.f193940a]);
        GLES20.glEnableVertexAttribArray(this.f193946g);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f193947h);
        GLES20.glUniform1i(this.f193944e, 0);
    }

    @Override // p153l.kt2, p153l.efj
    /* JADX INFO: renamed from: c */
    public void mo96079c(int i, hfj hfjVar, boolean z) {
        List<float[]> list;
        if (z) {
            m134802L();
        }
        if (!this.f145082P || this.f193947h <= 0 || (list = this.f145073G) == null || list.size() <= 0) {
            List<float[]> list2 = this.f145073G;
            if (list2 == null || list2.size() <= 0) {
                this.f145081O = false;
            } else {
                if (!this.f145081O) {
                    m166122P();
                } else {
                    if (this.f145083Q) {
                        throw null;
                    }
                    m166123Q();
                    m166122P();
                }
                if (this.f193947h == 0) {
                    m166122P();
                }
                this.f145081O = true;
            }
        } else {
            this.f145081O = true;
        }
        m210695B(hfjVar.m210702r());
        m210704y(hfjVar.m210701n());
        float fM210702r = m210702r() / m210701n();
        Matrix.orthoM(this.f145070D, 0, -1.0f, 1.0f, (-1.0f) / fM210702r, 1.0f / fM210702r, 3.0f, 7.0f);
        mo134345v();
        hfjVar.m134804N();
    }

    @Override // p153l.xej
    /* JADX INFO: renamed from: e */
    public void mo166127e() {
        super.mo166127e();
        GLES20.glBindAttribLocation(this.f193943d, 2, "uMVPMatrix");
        GLES20.glBindAttribLocation(this.f193943d, 3, "decorationSize");
    }

    @Override // p153l.hfj, p153l.xej
    /* JADX INFO: renamed from: f */
    public void mo96080f() {
        super.mo96080f();
        m166123Q();
    }

    @Override // p153l.xej
    /* JADX INFO: renamed from: m */
    public String mo112466m() {
        return "precision mediump float;uniform sampler2D inputImageTexture;varying vec2 textureCoordinate;\nvoid main() {   vec4 color1  = texture2D(inputImageTexture,textureCoordinate);\n   gl_FragColor = color1;\n}";
    }

    @Override // p153l.xej
    /* JADX INFO: renamed from: o */
    public String mo112467o() {
        return "uniform mat4 uMVPMatrix;attribute vec4 position;\nattribute vec4   position2 ; attribute vec4 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\nuniform vec2 decorationSize;\nvoid main() {  gl_Position = position;   vec2 coord = position2.xy;  coord = (coord) / decorationSize;\n  textureCoordinate = vec2(1.0 - (coord.x + 0.5),1.0-(coord.y + 0.5));\n}";
    }

    @Override // p153l.xej
    /* JADX INFO: renamed from: t */
    public void mo112468t() {
        super.mo112468t();
        this.f145080N = GLES20.glGetAttribLocation(this.f193943d, "position2");
        this.f145079M = GLES20.glGetUniformLocation(this.f193943d, "uMVPMatrix");
        this.f145078L = GLES20.glGetUniformLocation(this.f193943d, "decorationSize");
    }

    @Override // p153l.ruf
    /* JADX INFO: renamed from: d */
    public void mo102835d(IProcessOutput iProcessOutput) {
    }

    @Override // p153l.ham
    public void setTimeStamp(long j) {
    }
}
