package p149l;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes7.dex */
public abstract class bcj {

    /* JADX INFO: renamed from: a */
    protected int f74921a;

    /* JADX INFO: renamed from: b */
    protected FloatBuffer f74922b;

    /* JADX INFO: renamed from: c */
    public FloatBuffer[] f74923c;

    /* JADX INFO: renamed from: d */
    protected int f74924d;

    /* JADX INFO: renamed from: e */
    protected int f74925e;

    /* JADX INFO: renamed from: f */
    protected int f74926f;

    /* JADX INFO: renamed from: g */
    protected int f74927g;

    /* JADX INFO: renamed from: h */
    protected int f74928h;

    /* JADX INFO: renamed from: j */
    private int f74930j;

    /* JADX INFO: renamed from: k */
    private int f74931k;

    /* JADX INFO: renamed from: l */
    protected int f74932l;

    /* JADX INFO: renamed from: m */
    protected int f74933m;

    /* JADX INFO: renamed from: n */
    private boolean f74934n;

    /* JADX INFO: renamed from: o */
    private boolean f74935o;

    /* JADX INFO: renamed from: p */
    private boolean f74936p;

    /* JADX INFO: renamed from: q */
    private float f74937q;

    /* JADX INFO: renamed from: r */
    private float f74938r;

    /* JADX INFO: renamed from: s */
    private float f74939s;

    /* JADX INFO: renamed from: t */
    private float f74940t;

    /* JADX INFO: renamed from: u */
    protected int f74941u;

    /* JADX INFO: renamed from: i */
    protected boolean f74929i = false;

    /* JADX INFO: renamed from: v */
    private int f74942v = 0;

    /* JADX INFO: renamed from: w */
    private int f74943w = 0;

    public bcj() {
        this.f74941u = 1;
        this.f74935o = false;
        m101076F(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        FloatBuffer[] floatBufferArr = new FloatBuffer[4];
        this.f74923c = floatBufferArr;
        floatBufferArr[0] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f74923c[0].put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f}).position(0);
        this.f74923c[1] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f74923c[1].put(new float[]{0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f}).position(0);
        this.f74923c[2] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f74923c[2].put(new float[]{1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f}).position(0);
        this.f74923c[3] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f74923c[3].put(new float[]{1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}).position(0);
        this.f74921a = 0;
        this.f74928h = 0;
        this.f74934n = false;
        this.f74935o = false;
        this.f74936p = false;
        this.f74941u = 1;
    }

    /* JADX INFO: renamed from: A */
    public void m101071A(float f, float f2, float f3, float f4) {
        m101073C(f);
        m101072B(f2);
        m101091z(f3);
        m101090y(f4);
    }

    /* JADX INFO: renamed from: B */
    public void m101072B(float f) {
        this.f74938r = f;
    }

    /* JADX INFO: renamed from: C */
    public void m101073C(float f) {
        this.f74937q = f;
    }

    /* JADX INFO: renamed from: D */
    public void m101074D(int i) {
        if (this.f74934n || this.f74933m == i) {
            return;
        }
        this.f74933m = i;
        this.f74936p = true;
    }

    /* JADX INFO: renamed from: E */
    public void mo101075E(int i, int i2) {
        if (this.f74921a % 2 == 1) {
            i2 = i;
            i = i2;
        }
        if (!this.f74934n || this.f74932l != i || this.f74933m != i2) {
            this.f74936p = true;
        }
        this.f74932l = i;
        this.f74933m = i2;
        this.f74934n = true;
    }

    /* JADX INFO: renamed from: F */
    public void m101076F(float[] fArr) {
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f74922b = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr).position(0);
    }

    /* JADX INFO: renamed from: G */
    public void m101077G(int i) {
        if (this.f74934n || this.f74932l == i) {
            return;
        }
        this.f74932l = i;
        this.f74936p = true;
    }

    /* JADX INFO: renamed from: h */
    public void mo95684h() {
        GLES20.glBindAttribLocation(this.f74924d, 0, "position");
        GLES20.glBindAttribLocation(this.f74924d, 1, "inputTextureCoordinate");
    }

    /* JADX INFO: renamed from: i */
    public void mo95685i() {
        this.f74935o = false;
        int i = this.f74924d;
        if (i != 0) {
            GLES20.glDeleteProgram(i);
            this.f74924d = 0;
        }
        int i2 = this.f74930j;
        if (i2 != 0) {
            GLES20.glDeleteShader(i2);
            this.f74930j = 0;
        }
        int i3 = this.f74931k;
        if (i3 != 0) {
            GLES20.glDeleteShader(i3);
            this.f74931k = 0;
        }
    }

    /* JADX INFO: renamed from: j */
    public void m101078j() {
        GLES20.glDisableVertexAttribArray(this.f74926f);
        GLES20.glDisableVertexAttribArray(this.f74927g);
        GLES20.glBindTexture(3553, 0);
    }

    /* JADX INFO: renamed from: k */
    public void mo101079k() {
        int i;
        int i2;
        if (this.f74941u == 1) {
            GLES20.glViewport(0, 0, this.f74932l, this.f74933m);
            GLES20.glClearColor(m101083o(), m101082n(), m101081m(), m101080l());
            GLES20.glClear(16640);
        } else {
            int i3 = this.f74933m;
            int i4 = this.f74942v;
            int i5 = this.f74943w;
            int i6 = (int) (i3 * ((i4 * 1.0f) / i5));
            int i7 = this.f74932l;
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
            GLES20.glClearColor(m101083o(), m101082n(), m101081m(), m101080l());
            GLES20.glClear(16640);
        }
        GLES20.glUseProgram(this.f74924d);
        mo101089x();
        GLES20.glDrawArrays(5, 0, 4);
        m101078j();
    }

    /* JADX INFO: renamed from: l */
    public float m101080l() {
        return this.f74940t;
    }

    /* JADX INFO: renamed from: m */
    public float m101081m() {
        return this.f74939s;
    }

    /* JADX INFO: renamed from: n */
    public float m101082n() {
        return this.f74938r;
    }

    /* JADX INFO: renamed from: o */
    public float m101083o() {
        return this.f74937q;
    }

    /* JADX INFO: renamed from: p */
    public String mo95686p() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nvoid main(){\n   gl_FragColor = texture2D(inputImageTexture0,textureCoordinate);\n}\n";
    }

    /* JADX INFO: renamed from: q */
    public int m101084q() {
        return this.f74933m;
    }

    /* JADX INFO: renamed from: r */
    public String mo95687r() {
        return "attribute vec4 position;\nattribute vec2 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\nvoid main() {\n  textureCoordinate = inputTextureCoordinate;\n   gl_Position = position;\n}\n";
    }

    /* JADX INFO: renamed from: s */
    public int m101085s() {
        return this.f74932l;
    }

    /* JADX INFO: renamed from: u */
    public void mo95688u() {
        this.f74925e = GLES20.glGetUniformLocation(this.f74924d, "inputImageTexture0");
        this.f74926f = GLES20.glGetAttribLocation(this.f74924d, "position");
        this.f74927g = GLES20.glGetAttribLocation(this.f74924d, "inputTextureCoordinate");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0039  */
    /* JADX INFO: renamed from: v */
    public void mo101087v() {
        String strGlGetShaderInfoLog;
        String strMo95687r = mo95687r();
        String strMo95686p = mo95686p();
        int iGlCreateShader = GLES20.glCreateShader(35633);
        this.f74930j = iGlCreateShader;
        if (iGlCreateShader != 0) {
            GLES20.glShaderSource(iGlCreateShader, strMo95687r);
            GLES20.glCompileShader(this.f74930j);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(this.f74930j, 35713, iArr, 0);
            if (iArr[0] == 0) {
                strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(this.f74930j);
                GLES20.glDeleteShader(this.f74930j);
                this.f74930j = 0;
            } else {
                strGlGetShaderInfoLog = "none";
            }
        } else {
            strGlGetShaderInfoLog = "none";
        }
        if (this.f74930j == 0) {
            ujw.m194093a(this, ": Could not create vertex shader. Reason: ", strGlGetShaderInfoLog);
            return;
        }
        int iGlCreateShader2 = GLES20.glCreateShader(35632);
        this.f74931k = iGlCreateShader2;
        if (iGlCreateShader2 != 0) {
            GLES20.glShaderSource(iGlCreateShader2, strMo95686p);
            GLES20.glCompileShader(this.f74931k);
            int[] iArr2 = new int[1];
            GLES20.glGetShaderiv(this.f74931k, 35713, iArr2, 0);
            if (iArr2[0] == 0) {
                strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(this.f74931k);
                GLES20.glDeleteShader(this.f74931k);
                this.f74931k = 0;
            }
        }
        if (this.f74931k == 0) {
            ujw.m194093a(this, ": Could not create fragment shader. Reason: ", strGlGetShaderInfoLog);
            return;
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.f74924d = iGlCreateProgram;
        if (iGlCreateProgram != 0) {
            GLES20.glAttachShader(iGlCreateProgram, this.f74930j);
            GLES20.glAttachShader(this.f74924d, this.f74931k);
            mo95684h();
            GLES20.glLinkProgram(this.f74924d);
            int[] iArr3 = new int[1];
            GLES20.glGetProgramiv(this.f74924d, 35714, iArr3, 0);
            if (iArr3[0] == 0) {
                GLES20.glDeleteProgram(this.f74924d);
                this.f74924d = 0;
            }
        }
        if (this.f74924d != 0) {
            mo95688u();
        } else {
            upk0.m194883a("Could not create program.");
        }
    }

    /* JADX INFO: renamed from: w */
    public void mo101088w() {
        if (!this.f74935o) {
            mo101087v();
            this.f74935o = true;
        }
        if (this.f74936p) {
            mo101086t();
            this.f74936p = false;
        }
        mo101079k();
    }

    /* JADX INFO: renamed from: x */
    public void mo101089x() {
        this.f74922b.position(0);
        GLES20.glVertexAttribPointer(this.f74926f, 2, 5126, false, 8, (Buffer) this.f74922b);
        GLES20.glEnableVertexAttribArray(this.f74926f);
        this.f74923c[this.f74921a].position(0);
        GLES20.glVertexAttribPointer(this.f74927g, 2, 5126, false, 8, (Buffer) this.f74923c[this.f74921a]);
        GLES20.glEnableVertexAttribArray(this.f74927g);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f74928h);
        GLES20.glUniform1i(this.f74925e, 0);
    }

    /* JADX INFO: renamed from: y */
    public void m101090y(float f) {
        this.f74940t = f;
    }

    /* JADX INFO: renamed from: z */
    public void m101091z(float f) {
        this.f74939s = f;
    }

    /* JADX INFO: renamed from: t */
    public void mo101086t() {
    }
}
