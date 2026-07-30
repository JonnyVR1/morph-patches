package p153l;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes7.dex */
public abstract class vej {

    /* JADX INFO: renamed from: a */
    protected int f183779a;

    /* JADX INFO: renamed from: b */
    protected FloatBuffer f183780b;

    /* JADX INFO: renamed from: c */
    public FloatBuffer[] f183781c;

    /* JADX INFO: renamed from: d */
    protected int f183782d;

    /* JADX INFO: renamed from: e */
    protected int f183783e;

    /* JADX INFO: renamed from: f */
    protected int f183784f;

    /* JADX INFO: renamed from: g */
    protected int f183785g;

    /* JADX INFO: renamed from: h */
    protected int f183786h;

    /* JADX INFO: renamed from: j */
    private int f183788j;

    /* JADX INFO: renamed from: k */
    private int f183789k;

    /* JADX INFO: renamed from: l */
    protected int f183790l;

    /* JADX INFO: renamed from: m */
    protected int f183791m;

    /* JADX INFO: renamed from: n */
    private boolean f183792n;

    /* JADX INFO: renamed from: o */
    private boolean f183793o;

    /* JADX INFO: renamed from: p */
    private boolean f183794p;

    /* JADX INFO: renamed from: q */
    private float f183795q;

    /* JADX INFO: renamed from: r */
    private float f183796r;

    /* JADX INFO: renamed from: s */
    private float f183797s;

    /* JADX INFO: renamed from: t */
    private float f183798t;

    /* JADX INFO: renamed from: u */
    protected int f183799u;

    /* JADX INFO: renamed from: i */
    protected boolean f183787i = false;

    /* JADX INFO: renamed from: v */
    private int f183800v = 0;

    /* JADX INFO: renamed from: w */
    private int f183801w = 0;

    public vej() {
        this.f183799u = 1;
        this.f183793o = false;
        m201056F(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        FloatBuffer[] floatBufferArr = new FloatBuffer[4];
        this.f183781c = floatBufferArr;
        floatBufferArr[0] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f183781c[0].put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f}).position(0);
        this.f183781c[1] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f183781c[1].put(new float[]{0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f}).position(0);
        this.f183781c[2] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f183781c[2].put(new float[]{1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f}).position(0);
        this.f183781c[3] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f183781c[3].put(new float[]{1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}).position(0);
        this.f183779a = 0;
        this.f183786h = 0;
        this.f183792n = false;
        this.f183793o = false;
        this.f183794p = false;
        this.f183799u = 1;
    }

    /* JADX INFO: renamed from: A */
    public void m201052A(float f, float f2, float f3, float f4) {
        m201054C(f);
        m201053B(f2);
        m201066z(f3);
        m201065y(f4);
    }

    /* JADX INFO: renamed from: B */
    public void m201053B(float f) {
        this.f183796r = f;
    }

    /* JADX INFO: renamed from: C */
    public void m201054C(float f) {
        this.f183795q = f;
    }

    /* JADX INFO: renamed from: D */
    public void m201055D(int i) {
        if (this.f183792n || this.f183791m == i) {
            return;
        }
        this.f183791m = i;
        this.f183794p = true;
    }

    /* JADX INFO: renamed from: E */
    public void mo162984E(int i, int i2) {
        if (this.f183779a % 2 == 1) {
            i2 = i;
            i = i2;
        }
        if (!this.f183792n || this.f183790l != i || this.f183791m != i2) {
            this.f183794p = true;
        }
        this.f183790l = i;
        this.f183791m = i2;
        this.f183792n = true;
    }

    /* JADX INFO: renamed from: F */
    public void m201056F(float[] fArr) {
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f183780b = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr).position(0);
    }

    /* JADX INFO: renamed from: G */
    public void m201057G(int i) {
        if (this.f183792n || this.f183790l == i) {
            return;
        }
        this.f183790l = i;
        this.f183794p = true;
    }

    /* JADX INFO: renamed from: h */
    public void mo121066h() {
        GLES20.glBindAttribLocation(this.f183782d, 0, "position");
        GLES20.glBindAttribLocation(this.f183782d, 1, "inputTextureCoordinate");
    }

    /* JADX INFO: renamed from: i */
    public void mo97355i() {
        this.f183793o = false;
        int i = this.f183782d;
        if (i != 0) {
            GLES20.glDeleteProgram(i);
            this.f183782d = 0;
        }
        int i2 = this.f183788j;
        if (i2 != 0) {
            GLES20.glDeleteShader(i2);
            this.f183788j = 0;
        }
        int i3 = this.f183789k;
        if (i3 != 0) {
            GLES20.glDeleteShader(i3);
            this.f183789k = 0;
        }
    }

    /* JADX INFO: renamed from: j */
    public void m201058j() {
        GLES20.glDisableVertexAttribArray(this.f183784f);
        GLES20.glDisableVertexAttribArray(this.f183785g);
        GLES20.glBindTexture(3553, 0);
    }

    /* JADX INFO: renamed from: k */
    public void mo125383k() {
        int i;
        int i2;
        if (this.f183799u == 1) {
            GLES20.glViewport(0, 0, this.f183790l, this.f183791m);
            GLES20.glClearColor(m201062o(), m201061n(), m201060m(), m201059l());
            GLES20.glClear(16640);
        } else {
            int i3 = this.f183791m;
            int i4 = this.f183800v;
            int i5 = this.f183801w;
            int i6 = (int) (i3 * ((i4 * 1.0f) / i5));
            int i7 = this.f183790l;
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
            GLES20.glClearColor(m201062o(), m201061n(), m201060m(), m201059l());
            GLES20.glClear(16640);
        }
        GLES20.glUseProgram(this.f183782d);
        mo97359x();
        GLES20.glDrawArrays(5, 0, 4);
        m201058j();
    }

    /* JADX INFO: renamed from: l */
    public float m201059l() {
        return this.f183798t;
    }

    /* JADX INFO: renamed from: m */
    public float m201060m() {
        return this.f183797s;
    }

    /* JADX INFO: renamed from: n */
    public float m201061n() {
        return this.f183796r;
    }

    /* JADX INFO: renamed from: o */
    public float m201062o() {
        return this.f183795q;
    }

    /* JADX INFO: renamed from: p */
    public String mo97356p() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nvoid main(){\n   gl_FragColor = texture2D(inputImageTexture0,textureCoordinate);\n}\n";
    }

    /* JADX INFO: renamed from: q */
    public int m201063q() {
        return this.f183791m;
    }

    /* JADX INFO: renamed from: r */
    public String mo97357r() {
        return "attribute vec4 position;\nattribute vec2 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\nvoid main() {\n  textureCoordinate = inputTextureCoordinate;\n   gl_Position = position;\n}\n";
    }

    /* JADX INFO: renamed from: s */
    public int m201064s() {
        return this.f183790l;
    }

    /* JADX INFO: renamed from: u */
    public void mo97358u() {
        this.f183783e = GLES20.glGetUniformLocation(this.f183782d, "inputImageTexture0");
        this.f183784f = GLES20.glGetAttribLocation(this.f183782d, "position");
        this.f183785g = GLES20.glGetAttribLocation(this.f183782d, "inputTextureCoordinate");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0039  */
    /* JADX INFO: renamed from: v */
    public void mo141809v() {
        String strGlGetShaderInfoLog;
        String strMo97357r = mo97357r();
        String strMo97356p = mo97356p();
        int iGlCreateShader = GLES20.glCreateShader(35633);
        this.f183788j = iGlCreateShader;
        if (iGlCreateShader != 0) {
            GLES20.glShaderSource(iGlCreateShader, strMo97357r);
            GLES20.glCompileShader(this.f183788j);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(this.f183788j, 35713, iArr, 0);
            if (iArr[0] == 0) {
                strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(this.f183788j);
                GLES20.glDeleteShader(this.f183788j);
                this.f183788j = 0;
            } else {
                strGlGetShaderInfoLog = "none";
            }
        } else {
            strGlGetShaderInfoLog = "none";
        }
        if (this.f183788j == 0) {
            tmw.m191859a(this, ": Could not create vertex shader. Reason: ", strGlGetShaderInfoLog);
            return;
        }
        int iGlCreateShader2 = GLES20.glCreateShader(35632);
        this.f183789k = iGlCreateShader2;
        if (iGlCreateShader2 != 0) {
            GLES20.glShaderSource(iGlCreateShader2, strMo97356p);
            GLES20.glCompileShader(this.f183789k);
            int[] iArr2 = new int[1];
            GLES20.glGetShaderiv(this.f183789k, 35713, iArr2, 0);
            if (iArr2[0] == 0) {
                strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(this.f183789k);
                GLES20.glDeleteShader(this.f183789k);
                this.f183789k = 0;
            }
        }
        if (this.f183789k == 0) {
            tmw.m191859a(this, ": Could not create fragment shader. Reason: ", strGlGetShaderInfoLog);
            return;
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.f183782d = iGlCreateProgram;
        if (iGlCreateProgram != 0) {
            GLES20.glAttachShader(iGlCreateProgram, this.f183788j);
            GLES20.glAttachShader(this.f183782d, this.f183789k);
            mo121066h();
            GLES20.glLinkProgram(this.f183782d);
            int[] iArr3 = new int[1];
            GLES20.glGetProgramiv(this.f183782d, 35714, iArr3, 0);
            if (iArr3[0] == 0) {
                GLES20.glDeleteProgram(this.f183782d);
                this.f183782d = 0;
            }
        }
        if (this.f183782d != 0) {
            mo97358u();
        } else {
            azk0.m101074a("Could not create program.");
        }
    }

    /* JADX INFO: renamed from: w */
    public void mo141810w() {
        if (!this.f183793o) {
            mo141809v();
            this.f183793o = true;
        }
        if (this.f183794p) {
            mo125384t();
            this.f183794p = false;
        }
        mo125383k();
    }

    /* JADX INFO: renamed from: x */
    public void mo97359x() {
        this.f183780b.position(0);
        GLES20.glVertexAttribPointer(this.f183784f, 2, 5126, false, 8, (Buffer) this.f183780b);
        GLES20.glEnableVertexAttribArray(this.f183784f);
        this.f183781c[this.f183779a].position(0);
        GLES20.glVertexAttribPointer(this.f183785g, 2, 5126, false, 8, (Buffer) this.f183781c[this.f183779a]);
        GLES20.glEnableVertexAttribArray(this.f183785g);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f183786h);
        GLES20.glUniform1i(this.f183783e, 0);
    }

    /* JADX INFO: renamed from: y */
    public void m201065y(float f) {
        this.f183798t = f;
    }

    /* JADX INFO: renamed from: z */
    public void m201066z(float f) {
        this.f183797s = f;
    }

    /* JADX INFO: renamed from: t */
    public void mo125384t() {
    }
}
