package p153l;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class rnw extends ffj {

    /* JADX INFO: renamed from: W */
    public static final float[] f164112W = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};

    /* JADX INFO: renamed from: D */
    private int f164113D;

    /* JADX INFO: renamed from: J */
    private boolean f164119J;

    /* JADX INFO: renamed from: K */
    private Bitmap f164120K;

    /* JADX INFO: renamed from: N */
    private int f164123N;

    /* JADX INFO: renamed from: O */
    private SurfaceTexture f164124O;

    /* JADX INFO: renamed from: Q */
    protected int f164126Q;

    /* JADX INFO: renamed from: R */
    private int f164127R;

    /* JADX INFO: renamed from: E */
    public SurfaceTexture f164114E = null;

    /* JADX INFO: renamed from: F */
    protected int f164115F = 0;

    /* JADX INFO: renamed from: G */
    private int f164116G = 0;

    /* JADX INFO: renamed from: H */
    private int f164117H = 0;

    /* JADX INFO: renamed from: I */
    protected boolean f164118I = false;

    /* JADX INFO: renamed from: L */
    private int f164121L = -1;

    /* JADX INFO: renamed from: M */
    private int f164122M = -1;

    /* JADX INFO: renamed from: P */
    private int[] f164125P = null;

    /* JADX INFO: renamed from: S */
    private float f164128S = 1.0f;

    /* JADX INFO: renamed from: T */
    private int f164129T = 1;

    /* JADX INFO: renamed from: U */
    private int f164130U = 0;

    /* JADX INFO: renamed from: V */
    private int f164131V = 0;

    public rnw() {
        this.f164119J = true;
        this.f164120K = null;
        this.f164123N = 0;
        this.f164124O = null;
        FloatBuffer[] floatBufferArr = new FloatBuffer[4];
        this.f183781c = floatBufferArr;
        floatBufferArr[0] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f183781c[0].put(new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f}).position(0);
        this.f183781c[1] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f183781c[1].put(new float[]{1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f}).position(0);
        this.f183781c[2] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f183781c[2].put(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f}).position(0);
        this.f183781c[3] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f183781c[3].put(new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f}).position(0);
        this.f164123N = 0;
        this.f164124O = null;
        this.f164119J = true;
        this.f164120K = null;
    }

    /* JADX INFO: renamed from: Q */
    private void m182350Q() {
        GLES20.glActiveTexture(33984);
        if (this.f164119J) {
            GLES20.glBindTexture(36197, this.f183786h);
        } else {
            GLES20.glActiveTexture(33985);
            GLES20.glBindTexture(3553, this.f183786h);
        }
    }

    @Override // p153l.vej
    /* JADX INFO: renamed from: E */
    public void mo162984E(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            return;
        }
        if (i != this.f164117H || i2 != this.f164116G) {
            this.f164118I = true;
            this.f164116G = i2;
            this.f164117H = i;
        }
        if (this.f164118I) {
            super.mo162984E(i, i2);
        }
    }

    @Override // p153l.ffj
    /* JADX INFO: renamed from: M */
    public void mo125379M() {
        kej kejVar = this.f98779x;
        if (kejVar != null) {
            kejVar.m149330b();
        }
        kej kejVar2 = new kej(m201064s(), m201063q());
        this.f98779x = kejVar2;
        kejVar2.m149329a(m201064s(), m201063q());
        int iGlCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (iGlCheckFramebufferStatus == 36053) {
            if (this.f164118I) {
                this.f164118I = false;
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(this);
            muf.m160142a(sb, iGlCheckFramebufferStatus, GLES20.glGetError());
        }
    }

    /* JADX INFO: renamed from: R */
    public void m182351R(int i, SurfaceTexture surfaceTexture) {
        if (this.f164119J) {
            this.f183786h = i;
            this.f164114E = surfaceTexture;
            this.f164115F = 1;
            m125380N();
        }
    }

    @Override // p153l.ffj, p153l.vej
    /* JADX INFO: renamed from: i */
    public void mo97355i() {
        super.mo97355i();
        SurfaceTexture surfaceTexture = this.f164114E;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        int i = this.f183786h;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
        }
        SurfaceTexture surfaceTexture2 = this.f164124O;
        if (surfaceTexture2 != null) {
            surfaceTexture2.release();
            this.f164124O = null;
        }
        this.f164114E = null;
        this.f164123N = 0;
        this.f164124O = null;
        this.f164119J = true;
        this.f164120K = null;
    }

    @Override // p153l.ffj, p153l.vej
    /* JADX INFO: renamed from: k */
    public void mo125383k() {
        SurfaceTexture surfaceTexture = this.f164114E;
        if (surfaceTexture != null && this.f164115F == 1) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
            this.f164115F = 0;
        }
        if (this.f164118I) {
            mo125384t();
            this.f164118I = false;
        }
        super.mo125383k();
    }

    @Override // p153l.vej
    /* JADX INFO: renamed from: p */
    public String mo97356p() {
        return "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nuniform samplerExternalOES inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvarying float oes_flag; \nvoid main() {\nif (oes_flag ==1.0) {   gl_FragColor = texture2D(inputImageTexture0, textureCoordinate);\n} else { \ngl_FragColor = texture2D(inputImageTexture1, textureCoordinate);} \n}\n";
    }

    @Override // p153l.vej
    /* JADX INFO: renamed from: r */
    public String mo97357r() {
        return "uniform mat4 u_Matrix;\nattribute vec4 position;\nattribute vec2 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\nuniform float oesFlag; \nvarying float oes_flag; \nvoid main() {\n   oes_flag = oesFlag; \n   vec4 texPos = u_Matrix * vec4(inputTextureCoordinate, 1, 1);\n   textureCoordinate = texPos.xy;\n   gl_Position = position;\n}\n";
    }

    @Override // p153l.vej
    /* JADX INFO: renamed from: u */
    public void mo97358u() {
        super.mo97358u();
        this.f164113D = GLES20.glGetUniformLocation(this.f183782d, "u_Matrix");
        this.f164126Q = GLES20.glGetUniformLocation(this.f183782d, "inputImageTexture1");
        this.f164127R = GLES20.glGetUniformLocation(this.f183782d, "oesFlag");
    }

    @Override // p153l.vej
    /* JADX INFO: renamed from: v */
    public void mo141809v() {
        super.mo141809v();
    }

    @Override // p153l.vej
    /* JADX INFO: renamed from: x */
    public void mo97359x() {
        this.f183780b.position(0);
        GLES20.glVertexAttribPointer(this.f183784f, 2, 5126, false, 8, (Buffer) this.f183780b);
        GLES20.glEnableVertexAttribArray(this.f183784f);
        this.f183781c[this.f183779a].position(0);
        GLES20.glVertexAttribPointer(this.f183785g, 2, 5126, false, 8, (Buffer) this.f183781c[this.f183779a]);
        GLES20.glEnableVertexAttribArray(this.f183785g);
        boolean z = this.f164119J;
        int i = this.f164127R;
        if (z) {
            GLES20.glUniform1f(i, 1.0f);
        } else {
            GLES20.glUniform1f(i, 0.0f);
        }
        m182350Q();
        GLES20.glUniform1i(this.f183783e, 0);
        GLES20.glUniform1i(this.f164126Q, 1);
        GLES20.glUniformMatrix4fv(this.f164113D, 1, false, f164112W, 0);
    }
}
