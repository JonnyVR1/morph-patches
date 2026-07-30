package p149l;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class skw extends lcj {

    /* JADX INFO: renamed from: W */
    public static final float[] f165021W = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: D */
    private int f165022D;

    /* JADX INFO: renamed from: J */
    private boolean f165028J;

    /* JADX INFO: renamed from: K */
    private Bitmap f165029K;

    /* JADX INFO: renamed from: N */
    private int f165032N;

    /* JADX INFO: renamed from: O */
    private SurfaceTexture f165033O;

    /* JADX INFO: renamed from: Q */
    protected int f165035Q;

    /* JADX INFO: renamed from: R */
    private int f165036R;

    /* JADX INFO: renamed from: E */
    public SurfaceTexture f165023E = null;

    /* JADX INFO: renamed from: F */
    protected int f165024F = 0;

    /* JADX INFO: renamed from: G */
    private int f165025G = 0;

    /* JADX INFO: renamed from: H */
    private int f165026H = 0;

    /* JADX INFO: renamed from: I */
    protected boolean f165027I = false;

    /* JADX INFO: renamed from: L */
    private int f165030L = -1;

    /* JADX INFO: renamed from: M */
    private int f165031M = -1;

    /* JADX INFO: renamed from: P */
    private int[] f165034P = null;

    /* JADX INFO: renamed from: S */
    private float f165037S = 1.0f;

    /* JADX INFO: renamed from: T */
    private int f165038T = 1;

    /* JADX INFO: renamed from: U */
    private int f165039U = 0;

    /* JADX INFO: renamed from: V */
    private int f165040V = 0;

    public skw() {
        this.f165028J = true;
        this.f165029K = null;
        this.f165032N = 0;
        this.f165033O = null;
        FloatBuffer[] floatBufferArr = new FloatBuffer[4];
        this.f74923c = floatBufferArr;
        floatBufferArr[0] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f74923c[0].put(new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f}).position(0);
        this.f74923c[1] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f74923c[1].put(new float[]{1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f}).position(0);
        this.f74923c[2] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f74923c[2].put(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f}).position(0);
        this.f74923c[3] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f74923c[3].put(new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f}).position(0);
        this.f165032N = 0;
        this.f165033O = null;
        this.f165028J = true;
        this.f165029K = null;
    }

    /* JADX INFO: renamed from: Q */
    private void m184620Q() {
        GLES20.glActiveTexture(33984);
        if (this.f165028J) {
            GLES20.glBindTexture(36197, this.f74928h);
        } else {
            GLES20.glActiveTexture(33985);
            GLES20.glBindTexture(3553, this.f74928h);
        }
    }

    @Override // p149l.bcj
    /* JADX INFO: renamed from: E */
    public void mo101075E(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        if (i != this.f165026H || i2 != this.f165025G) {
            this.f165027I = true;
            this.f165025G = i2;
            this.f165026H = i;
        }
        if (this.f165027I) {
            super.mo101075E(i, i2);
        }
    }

    @Override // p149l.lcj
    /* JADX INFO: renamed from: M */
    public void mo149303M() {
        qbj qbjVar = this.f127418x;
        if (qbjVar != null) {
            qbjVar.m173827b();
        }
        qbj qbjVar2 = new qbj(m101085s(), m101084q());
        this.f127418x = qbjVar2;
        qbjVar2.m173826a(m101085s(), m101084q());
        int iGlCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (iGlCheckFramebufferStatus == 36053) {
            if (this.f165027I) {
                this.f165027I = false;
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(this);
            ysf.m215904a(sb, iGlCheckFramebufferStatus, GLES20.glGetError());
        }
    }

    /* JADX INFO: renamed from: R */
    public void m184621R(int i, SurfaceTexture surfaceTexture) {
        if (this.f165028J) {
            this.f74928h = i;
            this.f165023E = surfaceTexture;
            this.f165024F = 1;
            m149304N();
        }
    }

    @Override // p149l.lcj, p149l.bcj
    /* JADX INFO: renamed from: i */
    public void mo95685i() {
        super.mo95685i();
        SurfaceTexture surfaceTexture = this.f165023E;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        int i = this.f74928h;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
        }
        SurfaceTexture surfaceTexture2 = this.f165033O;
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
            this.f165033O = null;
        }
        this.f165023E = null;
        this.f165032N = 0;
        this.f165033O = null;
        this.f165028J = true;
        this.f165029K = null;
    }

    @Override // p149l.lcj, p149l.bcj
    /* JADX INFO: renamed from: k */
    public void mo101079k() {
        SurfaceTexture surfaceTexture = this.f165023E;
        if (surfaceTexture != null && this.f165024F == 1) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
            this.f165024F = 0;
        }
        if (this.f165027I) {
            mo101086t();
            this.f165027I = false;
        }
        super.mo101079k();
    }

    @Override // p149l.bcj
    /* JADX INFO: renamed from: p */
    public String mo95686p() {
        return "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvarying float oes_flag; \nvoid main() {\nif (oes_flag ==1.0) {   gl_FragColor = texture2D(inputImageTexture0, textureCoordinate);\n} else { \ngl_FragColor = texture2D(inputImageTexture1, textureCoordinate);} \n}\n";
    }

    @Override // p149l.bcj
    /* JADX INFO: renamed from: r */
    public String mo95687r() {
        return "uniform mat4 u_Matrix;\nattribute vec4 position;\nattribute vec2 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\nuniform float oesFlag; \nvarying float oes_flag; \nvoid main() {\n   oes_flag = oesFlag; \n   vec4 texPos = u_Matrix * vec4(inputTextureCoordinate, 1, 1);\n   textureCoordinate = texPos.xy;\n   gl_Position = position;\n}\n";
    }

    @Override // p149l.bcj
    /* JADX INFO: renamed from: u */
    public void mo95688u() {
        super.mo95688u();
        this.f165022D = GLES20.glGetUniformLocation(this.f74924d, "u_Matrix");
        this.f165035Q = GLES20.glGetUniformLocation(this.f74924d, "inputImageTexture1");
        this.f165036R = GLES20.glGetUniformLocation(this.f74924d, "oesFlag");
    }

    @Override // p149l.bcj
    /* JADX INFO: renamed from: v */
    public void mo101087v() {
        super.mo101087v();
    }

    @Override // p149l.bcj
    /* JADX INFO: renamed from: x */
    public void mo101089x() {
        this.f74922b.position(0);
        GLES20.glVertexAttribPointer(this.f74926f, 2, 5126, false, 8, (Buffer) this.f74922b);
        GLES20.glEnableVertexAttribArray(this.f74926f);
        this.f74923c[this.f74921a].position(0);
        GLES20.glVertexAttribPointer(this.f74927g, 2, 5126, false, 8, (Buffer) this.f74923c[this.f74921a]);
        GLES20.glEnableVertexAttribArray(this.f74927g);
        boolean z = this.f165028J;
        int i = this.f165036R;
        if (z) {
            GLES20.glUniform1f(i, 1.0f);
        } else {
            GLES20.glUniform1f(i, 0.0f);
        }
        m184620Q();
        GLES20.glUniform1i(this.f74925e, 0);
        GLES20.glUniform1i(this.f165035Q, 1);
        GLES20.glUniformMatrix4fv(this.f165022D, 1, false, f165021W, 0);
    }
}
