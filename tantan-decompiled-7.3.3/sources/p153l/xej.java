package p153l;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes7.dex */
public abstract class xej {

    /* JADX INFO: renamed from: a */
    protected int f193940a;

    /* JADX INFO: renamed from: b */
    protected FloatBuffer f193941b;

    /* JADX INFO: renamed from: c */
    public FloatBuffer[] f193942c;

    /* JADX INFO: renamed from: d */
    protected int f193943d;

    /* JADX INFO: renamed from: e */
    protected int f193944e;

    /* JADX INFO: renamed from: f */
    protected int f193945f;

    /* JADX INFO: renamed from: g */
    protected int f193946g;

    /* JADX INFO: renamed from: h */
    protected int f193947h;

    /* JADX INFO: renamed from: j */
    private int f193949j;

    /* JADX INFO: renamed from: k */
    private int f193950k;

    /* JADX INFO: renamed from: l */
    protected int f193951l;

    /* JADX INFO: renamed from: m */
    protected int f193952m;

    /* JADX INFO: renamed from: n */
    private boolean f193953n;

    /* JADX INFO: renamed from: o */
    private boolean f193954o;

    /* JADX INFO: renamed from: p */
    private boolean f193955p;

    /* JADX INFO: renamed from: q */
    private float f193956q;

    /* JADX INFO: renamed from: r */
    private float f193957r;

    /* JADX INFO: renamed from: s */
    private float f193958s;

    /* JADX INFO: renamed from: t */
    private float f193959t;

    /* JADX INFO: renamed from: u */
    protected int f193960u;

    /* JADX INFO: renamed from: i */
    protected boolean f193948i = false;

    /* JADX INFO: renamed from: v */
    private int f193961v = 0;

    /* JADX INFO: renamed from: w */
    private int f193962w = 0;

    public xej() {
        this.f193960u = 1;
        this.f193954o = false;
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
        this.f193940a = 0;
        this.f193947h = 0;
        this.f193953n = false;
        this.f193954o = false;
        this.f193955p = false;
        this.f193960u = 1;
    }

    /* JADX INFO: renamed from: A */
    public void m210694A(float[] fArr) {
        if (fArr != null) {
            FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.f193941b = floatBufferAsFloatBuffer;
            floatBufferAsFloatBuffer.put(fArr).position(0);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m210695B(int i) {
        if (this.f193953n || this.f193951l == i) {
            return;
        }
        this.f193951l = i;
        this.f193955p = true;
    }

    /* JADX INFO: renamed from: e */
    public void mo166127e() {
        GLES20.glBindAttribLocation(this.f193943d, 0, "position");
        GLES20.glBindAttribLocation(this.f193943d, 1, "inputTextureCoordinate");
    }

    /* JADX INFO: renamed from: f */
    public void mo96080f() {
        this.f193954o = false;
        int i = this.f193943d;
        if (i != 0) {
            GLES20.glDeleteProgram(i);
            this.f193943d = 0;
        }
        int i2 = this.f193949j;
        if (i2 != 0) {
            GLES20.glDeleteShader(i2);
            this.f193949j = 0;
        }
        int i3 = this.f193950k;
        if (i3 != 0) {
            GLES20.glDeleteShader(i3);
            this.f193950k = 0;
        }
    }

    /* JADX INFO: renamed from: g */
    public void m210696g() {
        GLES20.glDisableVertexAttribArray(this.f193945f);
        GLES20.glDisableVertexAttribArray(this.f193946g);
        GLES20.glBindTexture(3553, 0);
    }

    /* JADX INFO: renamed from: h */
    public void mo134805h() {
        int i;
        int i2;
        if (this.f193960u == 1) {
            GLES20.glViewport(0, 0, mo187687q(), mo187686p());
            GLES20.glClearColor(m210700l(), m210699k(), m210698j(), m210697i());
            GLES20.glClear(16640);
        } else {
            int i3 = this.f193952m;
            int i4 = this.f193961v;
            int i5 = this.f193962w;
            int i6 = (int) (i3 * ((i4 * 1.0f) / i5));
            int i7 = this.f193951l;
            int i8 = (int) (i7 * ((i5 * 1.0f) / i4));
            if (i6 < i7) {
                i2 = (i7 - i6) / 2;
                i8 = i3;
                i = 0;
            } else if (i8 < i3) {
                i = (i3 - i8) / 2;
                i6 = i7;
                i2 = 0;
            } else {
                i8 = i3;
                i = 0;
                i6 = i7;
                i2 = 0;
            }
            GLES20.glViewport(i2, i, i6 + 1, i8);
            GLES20.glClearColor(m210700l(), m210699k(), m210698j(), m210697i());
            GLES20.glClear(16640);
        }
        GLES20.glUseProgram(this.f193943d);
        mo112469w();
        GLES20.glDrawArrays(5, 0, 4);
        m210696g();
    }

    /* JADX INFO: renamed from: i */
    public float m210697i() {
        return this.f193959t;
    }

    /* JADX INFO: renamed from: j */
    public float m210698j() {
        return this.f193958s;
    }

    /* JADX INFO: renamed from: k */
    public float m210699k() {
        return this.f193957r;
    }

    /* JADX INFO: renamed from: l */
    public float m210700l() {
        return this.f193956q;
    }

    /* JADX INFO: renamed from: m */
    public String mo112466m() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nvoid main(){\n   gl_FragColor = texture2D(inputImageTexture0,textureCoordinate);\n}\n";
    }

    /* JADX INFO: renamed from: n */
    public int m210701n() {
        return this.f193952m;
    }

    /* JADX INFO: renamed from: o */
    public String mo112467o() {
        return "attribute vec4 position;\nattribute vec2 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\nvoid main() {\n  textureCoordinate = inputTextureCoordinate;\n   gl_Position = position;\n}\n";
    }

    /* JADX INFO: renamed from: p */
    public int mo187686p() {
        return this.f193952m;
    }

    /* JADX INFO: renamed from: q */
    public int mo187687q() {
        return this.f193951l;
    }

    /* JADX INFO: renamed from: r */
    public int m210702r() {
        return this.f193951l;
    }

    /* JADX INFO: renamed from: t */
    public void mo112468t() {
        this.f193944e = GLES20.glGetUniformLocation(this.f193943d, "inputImageTexture0");
        this.f193945f = GLES20.glGetAttribLocation(this.f193943d, "position");
        this.f193946g = GLES20.glGetAttribLocation(this.f193943d, "inputTextureCoordinate");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0039  */
    /* JADX INFO: renamed from: u */
    public void mo134344u() {
        String strGlGetShaderInfoLog;
        String strMo112467o = mo112467o();
        String strMo112466m = mo112466m();
        int iGlCreateShader = GLES20.glCreateShader(35633);
        this.f193949j = iGlCreateShader;
        if (iGlCreateShader != 0) {
            GLES20.glShaderSource(iGlCreateShader, strMo112467o);
            GLES20.glCompileShader(this.f193949j);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(this.f193949j, 35713, iArr, 0);
            if (iArr[0] == 0) {
                strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(this.f193949j);
                GLES20.glDeleteShader(this.f193949j);
                this.f193949j = 0;
            } else {
                strGlGetShaderInfoLog = "none";
            }
        } else {
            strGlGetShaderInfoLog = "none";
        }
        if (this.f193949j == 0) {
            tmw.m191859a(this, ": Could not create vertex shader. Reason: ", strGlGetShaderInfoLog);
            return;
        }
        int iGlCreateShader2 = GLES20.glCreateShader(35632);
        this.f193950k = iGlCreateShader2;
        if (iGlCreateShader2 != 0) {
            GLES20.glShaderSource(iGlCreateShader2, strMo112466m);
            GLES20.glCompileShader(this.f193950k);
            int[] iArr2 = new int[1];
            GLES20.glGetShaderiv(this.f193950k, 35713, iArr2, 0);
            if (iArr2[0] == 0) {
                strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(this.f193950k);
                GLES20.glDeleteShader(this.f193950k);
                this.f193950k = 0;
            }
        }
        if (this.f193950k == 0) {
            tmw.m191859a(this, ": Could not create fragment shader. Reason: ", strGlGetShaderInfoLog);
            return;
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.f193943d = iGlCreateProgram;
        if (iGlCreateProgram != 0) {
            GLES20.glAttachShader(iGlCreateProgram, this.f193949j);
            GLES20.glAttachShader(this.f193943d, this.f193950k);
            mo166127e();
            GLES20.glLinkProgram(this.f193943d);
            int[] iArr3 = new int[1];
            GLES20.glGetProgramiv(this.f193943d, 35714, iArr3, 0);
            if (iArr3[0] == 0) {
                GLES20.glDeleteProgram(this.f193943d);
                this.f193943d = 0;
            }
        }
        if (this.f193943d != 0) {
            mo112468t();
        } else {
            azk0.m101074a("Could not create program.");
        }
    }

    /* JADX INFO: renamed from: v */
    public void mo134345v() {
        if (!this.f193954o) {
            mo134344u();
            this.f193954o = true;
        }
        if (this.f193955p) {
            mo134806s();
            this.f193955p = false;
        }
        mo134805h();
    }

    /* JADX INFO: renamed from: w */
    public void mo112469w() {
        this.f193941b.position(0);
        GLES20.glVertexAttribPointer(this.f193945f, 2, 5126, false, 8, (Buffer) this.f193941b);
        GLES20.glEnableVertexAttribArray(this.f193945f);
        this.f193942c[this.f193940a].position(0);
        GLES20.glVertexAttribPointer(this.f193946g, 2, 5126, false, 8, (Buffer) this.f193942c[this.f193940a]);
        GLES20.glEnableVertexAttribArray(this.f193946g);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f193947h);
        GLES20.glUniform1i(this.f193944e, 0);
    }

    /* JADX INFO: renamed from: x */
    public void m210703x(int i) {
        this.f193940a = (this.f193940a + i) % 4;
        if (i % 2 == 1) {
            int i2 = this.f193951l;
            this.f193951l = this.f193952m;
            this.f193952m = i2;
        }
    }

    /* JADX INFO: renamed from: y */
    public void m210704y(int i) {
        if (this.f193953n || this.f193952m == i) {
            return;
        }
        this.f193952m = i;
        this.f193955p = true;
    }

    /* JADX INFO: renamed from: z */
    public void mo172261z(int i, int i2) {
        if (this.f193940a % 2 == 1) {
            i2 = i;
            i = i2;
        }
        if (!this.f193953n || this.f193951l != i || this.f193952m != i2) {
            this.f193955p = true;
        }
        this.f193951l = i;
        this.f193952m = i2;
        this.f193953n = true;
    }

    /* JADX INFO: renamed from: s */
    public void mo134806s() {
    }
}
