package p149l;

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
public class exf0 extends btf implements r7m {

    /* JADX INFO: renamed from: D */
    protected final float[] f93655D;

    /* JADX INFO: renamed from: E */
    private final short[] f93656E;

    /* JADX INFO: renamed from: F */
    protected Object f93657F;

    /* JADX INFO: renamed from: G */
    List<float[]> f93658G;

    /* JADX INFO: renamed from: H */
    protected mwf0 f93659H;

    /* JADX INFO: renamed from: I */
    private FloatBuffer f93660I;

    /* JADX INFO: renamed from: J */
    private FloatBuffer f93661J;

    /* JADX INFO: renamed from: K */
    private ShortBuffer f93662K;

    /* JADX INFO: renamed from: L */
    private int f93663L;

    /* JADX INFO: renamed from: M */
    private int f93664M;

    /* JADX INFO: renamed from: N */
    protected int f93665N;

    /* JADX INFO: renamed from: O */
    private boolean f93666O;

    /* JADX INFO: renamed from: P */
    private boolean f93667P;

    /* JADX INFO: renamed from: Q */
    private boolean f93668Q;

    /* JADX INFO: renamed from: R */
    private String f93669R;

    @Override // p149l.ncj
    /* JADX INFO: renamed from: F */
    public void mo118663F() {
        GLES20.glViewport(0, 0, m110705r(), m110701n());
        GLES20.glUseProgram(this.f85418d);
        GLES20.glClear(16640);
        GLES20.glClearColor(m110700l(), m110699k(), m110698j(), m110697i());
        synchronized (this.f93657F) {
            try {
                Iterator<float[]> it = this.f93658G.iterator();
                while (it.hasNext()) {
                    m118668T(it.next());
                    m118666R();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.btf
    /* JADX INFO: renamed from: O */
    public void mo103827O() {
        synchronized (m158947I()) {
            this.f93666O = false;
            this.f93668Q = false;
            throw null;
        }
    }

    /* JADX INFO: renamed from: P */
    public void m118664P() {
        synchronized (this.f93657F) {
            this.f93658G.clear();
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m118665Q() {
        int i = this.f85422h;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.f85422h = 0;
        }
    }

    /* JADX INFO: renamed from: R */
    public void m118666R() {
        GLES20.glUniform2f(this.f93663L, 1.0f, this.f93659H.m156622b() / this.f93659H.m156623c());
        GLES20.glDrawElements(4, this.f93656E.length, 5123, this.f93662K);
        GLES20.glDisableVertexAttribArray(this.f85420f);
    }

    /* JADX INFO: renamed from: S */
    public String m118667S() {
        return this.f93669R;
    }

    /* JADX INFO: renamed from: T */
    public void m118668T(float[] fArr) {
        this.f85416b.position(0);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        this.f93661J = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr);
        this.f93661J.position(0);
        GLES20.glVertexAttribPointer(this.f85420f, 2, 5126, false, 8, (Buffer) this.f93661J);
        GLES20.glVertexAttribPointer(this.f93665N, 2, 5126, false, 8, (Buffer) this.f93660I);
        GLES20.glEnableVertexAttribArray(this.f85420f);
        GLES20.glEnableVertexAttribArray(this.f93665N);
        this.f85417c[this.f85415a].position(0);
        GLES20.glVertexAttribPointer(this.f85421g, 2, 5126, false, 8, (Buffer) this.f85417c[this.f85415a]);
        GLES20.glEnableVertexAttribArray(this.f85421g);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f85422h);
        GLES20.glUniform1i(this.f85419e, 0);
    }

    @Override // p149l.us2, p149l.kcj
    /* JADX INFO: renamed from: c */
    public void mo102037c(int i, ncj ncjVar, boolean z) {
        List<float[]> list;
        if (z) {
            m158950L();
        }
        if (!this.f93667P || this.f85422h <= 0 || (list = this.f93658G) == null || list.size() <= 0) {
            List<float[]> list2 = this.f93658G;
            if (list2 == null || list2.size() <= 0) {
                this.f93666O = false;
            } else {
                if (!this.f93666O) {
                    m118664P();
                } else {
                    if (this.f93668Q) {
                        throw null;
                    }
                    m118665Q();
                    m118664P();
                }
                if (this.f85422h == 0) {
                    m118664P();
                }
                this.f93666O = true;
            }
        } else {
            this.f93666O = true;
        }
        m110693B(ncjVar.m110705r());
        m110712y(ncjVar.m110701n());
        float fM110705r = m110705r() / m110701n();
        Matrix.orthoM(this.f93655D, 0, -1.0f, 1.0f, (-1.0f) / fM110705r, 1.0f / fM110705r, 3.0f, 7.0f);
        mo110709v();
        ncjVar.m158952N();
    }

    @Override // p149l.dcj
    /* JADX INFO: renamed from: e */
    public void mo110694e() {
        super.mo110694e();
        GLES20.glBindAttribLocation(this.f85418d, 2, "uMVPMatrix");
        GLES20.glBindAttribLocation(this.f85418d, 3, "decorationSize");
    }

    @Override // p149l.ncj, p149l.dcj
    /* JADX INFO: renamed from: f */
    public void mo102038f() {
        super.mo102038f();
        m118665Q();
    }

    @Override // p149l.dcj
    /* JADX INFO: renamed from: m */
    public String mo102573m() {
        return "precision mediump float;uniform sampler2D inputImageTexture;varying vec2 textureCoordinate;\nvoid main() {   vec4 color1  = texture2D(inputImageTexture,textureCoordinate);\n   gl_FragColor = color1;\n}";
    }

    @Override // p149l.dcj
    /* JADX INFO: renamed from: o */
    public String mo110702o() {
        return "uniform mat4 uMVPMatrix;attribute vec4 position;\nattribute vec4   position2 ; attribute vec4 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\nuniform vec2 decorationSize;\nvoid main() {  gl_Position = position;   vec2 coord = position2.xy;  coord = (coord) / decorationSize;\n  textureCoordinate = vec2(1.0 - (coord.x + 0.5),1.0-(coord.y + 0.5));\n}";
    }

    @Override // p149l.dcj
    /* JADX INFO: renamed from: t */
    public void mo110707t() {
        super.mo110707t();
        this.f93665N = GLES20.glGetAttribLocation(this.f85418d, "position2");
        this.f93664M = GLES20.glGetUniformLocation(this.f85418d, "uMVPMatrix");
        this.f93663L = GLES20.glGetUniformLocation(this.f85418d, "decorationSize");
    }

    @Override // p149l.dtf
    /* JADX INFO: renamed from: d */
    public void mo104314d(IProcessOutput iProcessOutput) {
    }

    @Override // p149l.r7m
    public void setTimeStamp(long j) {
    }
}
