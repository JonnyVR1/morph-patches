package p149l;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes7.dex */
public abstract class dcj {

    /* JADX INFO: renamed from: a */
    protected int f85415a;

    /* JADX INFO: renamed from: b */
    protected FloatBuffer f85416b;

    /* JADX INFO: renamed from: c */
    public FloatBuffer[] f85417c;

    /* JADX INFO: renamed from: d */
    protected int f85418d;

    /* JADX INFO: renamed from: e */
    protected int f85419e;

    /* JADX INFO: renamed from: f */
    protected int f85420f;

    /* JADX INFO: renamed from: g */
    protected int f85421g;

    /* JADX INFO: renamed from: h */
    protected int f85422h;

    /* JADX INFO: renamed from: j */
    private int f85424j;

    /* JADX INFO: renamed from: k */
    private int f85425k;

    /* JADX INFO: renamed from: l */
    protected int f85426l;

    /* JADX INFO: renamed from: m */
    protected int f85427m;

    /* JADX INFO: renamed from: n */
    private boolean f85428n;

    /* JADX INFO: renamed from: o */
    private boolean f85429o;

    /* JADX INFO: renamed from: p */
    private boolean f85430p;

    /* JADX INFO: renamed from: q */
    private float f85431q;

    /* JADX INFO: renamed from: r */
    private float f85432r;

    /* JADX INFO: renamed from: s */
    private float f85433s;

    /* JADX INFO: renamed from: t */
    private float f85434t;

    /* JADX INFO: renamed from: u */
    protected int f85435u;

    /* JADX INFO: renamed from: i */
    protected boolean f85423i = false;

    /* JADX INFO: renamed from: v */
    private int f85436v = 0;

    /* JADX INFO: renamed from: w */
    private int f85437w = 0;

    public dcj() {
        this.f85435u = 1;
        this.f85429o = false;
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
        this.f85415a = 0;
        this.f85422h = 0;
        this.f85428n = false;
        this.f85429o = false;
        this.f85430p = false;
        this.f85435u = 1;
    }

    /* JADX INFO: renamed from: A */
    public void m110692A(float[] fArr) {
        if (fArr != null) {
            FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.f85416b = floatBufferAsFloatBuffer;
            floatBufferAsFloatBuffer.put(fArr).position(0);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m110693B(int i) {
        if (this.f85428n || this.f85426l == i) {
            return;
        }
        this.f85426l = i;
        this.f85430p = true;
    }

    /* JADX INFO: renamed from: e */
    public void mo110694e() {
        GLES20.glBindAttribLocation(this.f85418d, 0, "position");
        GLES20.glBindAttribLocation(this.f85418d, 1, "inputTextureCoordinate");
    }

    /* JADX INFO: renamed from: f */
    public void mo102038f() {
        this.f85429o = false;
        int i = this.f85418d;
        if (i != 0) {
            GLES20.glDeleteProgram(i);
            this.f85418d = 0;
        }
        int i2 = this.f85424j;
        if (i2 != 0) {
            GLES20.glDeleteShader(i2);
            this.f85424j = 0;
        }
        int i3 = this.f85425k;
        if (i3 != 0) {
            GLES20.glDeleteShader(i3);
            this.f85425k = 0;
        }
    }

    /* JADX INFO: renamed from: g */
    public void m110695g() {
        GLES20.glDisableVertexAttribArray(this.f85420f);
        GLES20.glDisableVertexAttribArray(this.f85421g);
        GLES20.glBindTexture(3553, 0);
    }

    /* JADX INFO: renamed from: h */
    public void mo110696h() {
        int i;
        int i2;
        if (this.f85435u == 1) {
            GLES20.glViewport(0, 0, mo110704q(), mo110703p());
            GLES20.glClearColor(m110700l(), m110699k(), m110698j(), m110697i());
            GLES20.glClear(16640);
        } else {
            int i3 = this.f85427m;
            int i4 = this.f85436v;
            int i5 = this.f85437w;
            int i6 = (int) (i3 * ((i4 * 1.0f) / i5));
            int i7 = this.f85426l;
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
            GLES20.glClearColor(m110700l(), m110699k(), m110698j(), m110697i());
            GLES20.glClear(16640);
        }
        GLES20.glUseProgram(this.f85418d);
        mo110710w();
        GLES20.glDrawArrays(5, 0, 4);
        m110695g();
    }

    /* JADX INFO: renamed from: i */
    public float m110697i() {
        return this.f85434t;
    }

    /* JADX INFO: renamed from: j */
    public float m110698j() {
        return this.f85433s;
    }

    /* JADX INFO: renamed from: k */
    public float m110699k() {
        return this.f85432r;
    }

    /* JADX INFO: renamed from: l */
    public float m110700l() {
        return this.f85431q;
    }

    /* JADX INFO: renamed from: m */
    public String mo102573m() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nvoid main(){\n   gl_FragColor = texture2D(inputImageTexture0,textureCoordinate);\n}\n";
    }

    /* JADX INFO: renamed from: n */
    public int m110701n() {
        return this.f85427m;
    }

    /* JADX INFO: renamed from: o */
    public String mo110702o() {
        return "attribute vec4 position;\nattribute vec2 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\nvoid main() {\n  textureCoordinate = inputTextureCoordinate;\n   gl_Position = position;\n}\n";
    }

    /* JADX INFO: renamed from: p */
    public int mo110703p() {
        return this.f85427m;
    }

    /* JADX INFO: renamed from: q */
    public int mo110704q() {
        return this.f85426l;
    }

    /* JADX INFO: renamed from: r */
    public int m110705r() {
        return this.f85426l;
    }

    /* JADX INFO: renamed from: t */
    public void mo110707t() {
        this.f85419e = GLES20.glGetUniformLocation(this.f85418d, "inputImageTexture0");
        this.f85420f = GLES20.glGetAttribLocation(this.f85418d, "position");
        this.f85421g = GLES20.glGetAttribLocation(this.f85418d, "inputTextureCoordinate");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0039  */
    /* JADX INFO: renamed from: u */
    public void mo110708u() {
        String strGlGetShaderInfoLog;
        String strMo110702o = mo110702o();
        String strMo102573m = mo102573m();
        int iGlCreateShader = GLES20.glCreateShader(35633);
        this.f85424j = iGlCreateShader;
        if (iGlCreateShader != 0) {
            GLES20.glShaderSource(iGlCreateShader, strMo110702o);
            GLES20.glCompileShader(this.f85424j);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(this.f85424j, 35713, iArr, 0);
            if (iArr[0] == 0) {
                strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(this.f85424j);
                GLES20.glDeleteShader(this.f85424j);
                this.f85424j = 0;
            } else {
                strGlGetShaderInfoLog = "none";
            }
        } else {
            strGlGetShaderInfoLog = "none";
        }
        if (this.f85424j == 0) {
            ujw.m194093a(this, ": Could not create vertex shader. Reason: ", strGlGetShaderInfoLog);
            return;
        }
        int iGlCreateShader2 = GLES20.glCreateShader(35632);
        this.f85425k = iGlCreateShader2;
        if (iGlCreateShader2 != 0) {
            GLES20.glShaderSource(iGlCreateShader2, strMo102573m);
            GLES20.glCompileShader(this.f85425k);
            int[] iArr2 = new int[1];
            GLES20.glGetShaderiv(this.f85425k, 35713, iArr2, 0);
            if (iArr2[0] == 0) {
                strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(this.f85425k);
                GLES20.glDeleteShader(this.f85425k);
                this.f85425k = 0;
            }
        }
        if (this.f85425k == 0) {
            ujw.m194093a(this, ": Could not create fragment shader. Reason: ", strGlGetShaderInfoLog);
            return;
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.f85418d = iGlCreateProgram;
        if (iGlCreateProgram != 0) {
            GLES20.glAttachShader(iGlCreateProgram, this.f85424j);
            GLES20.glAttachShader(this.f85418d, this.f85425k);
            mo110694e();
            GLES20.glLinkProgram(this.f85418d);
            int[] iArr3 = new int[1];
            GLES20.glGetProgramiv(this.f85418d, 35714, iArr3, 0);
            if (iArr3[0] == 0) {
                GLES20.glDeleteProgram(this.f85418d);
                this.f85418d = 0;
            }
        }
        if (this.f85418d != 0) {
            mo110707t();
        } else {
            upk0.m194883a("Could not create program.");
        }
    }

    /* JADX INFO: renamed from: v */
    public void mo110709v() {
        if (!this.f85429o) {
            mo110708u();
            this.f85429o = true;
        }
        if (this.f85430p) {
            mo110706s();
            this.f85430p = false;
        }
        mo110696h();
    }

    /* JADX INFO: renamed from: w */
    public void mo110710w() {
        this.f85416b.position(0);
        GLES20.glVertexAttribPointer(this.f85420f, 2, 5126, false, 8, (Buffer) this.f85416b);
        GLES20.glEnableVertexAttribArray(this.f85420f);
        this.f85417c[this.f85415a].position(0);
        GLES20.glVertexAttribPointer(this.f85421g, 2, 5126, false, 8, (Buffer) this.f85417c[this.f85415a]);
        GLES20.glEnableVertexAttribArray(this.f85421g);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f85422h);
        GLES20.glUniform1i(this.f85419e, 0);
    }

    /* JADX INFO: renamed from: x */
    public void m110711x(int i) {
        this.f85415a = (this.f85415a + i) % 4;
        if (i % 2 == 1) {
            int i2 = this.f85426l;
            this.f85426l = this.f85427m;
            this.f85427m = i2;
        }
    }

    /* JADX INFO: renamed from: y */
    public void m110712y(int i) {
        if (this.f85428n || this.f85427m == i) {
            return;
        }
        this.f85427m = i;
        this.f85430p = true;
    }

    /* JADX INFO: renamed from: z */
    public void mo110713z(int i, int i2) {
        if (this.f85415a % 2 == 1) {
            i2 = i;
            i = i2;
        }
        if (!this.f85428n || this.f85426l != i || this.f85427m != i2) {
            this.f85430p = true;
        }
        this.f85426l = i;
        this.f85427m = i2;
        this.f85428n = true;
    }

    /* JADX INFO: renamed from: s */
    public void mo110706s() {
    }
}
