package p153l;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class yej extends vej implements cfj {

    /* JADX INFO: renamed from: A */
    private float f199348A;

    /* JADX INFO: renamed from: F */
    private int f199353F;

    /* JADX INFO: renamed from: G */
    private int f199354G;

    /* JADX INFO: renamed from: H */
    private int f199355H;

    /* JADX INFO: renamed from: J */
    private FloatBuffer[] f199357J;

    /* JADX INFO: renamed from: K */
    private float[] f199358K;

    /* JADX INFO: renamed from: L */
    private float[] f199359L;

    /* JADX INFO: renamed from: M */
    private float[] f199360M;

    /* JADX INFO: renamed from: N */
    private float[] f199361N;

    /* JADX INFO: renamed from: x */
    private float f199363x;

    /* JADX INFO: renamed from: z */
    private float f199365z;

    /* JADX INFO: renamed from: y */
    private float f199364y = 1.0f;

    /* JADX INFO: renamed from: B */
    private boolean f199349B = true;

    /* JADX INFO: renamed from: C */
    public String f199350C = "mediump";

    /* JADX INFO: renamed from: D */
    private int f199351D = 0;

    /* JADX INFO: renamed from: E */
    private int f199352E = 0;

    /* JADX INFO: renamed from: I */
    private int f199356I = 0;

    /* JADX INFO: renamed from: O */
    private boolean f199362O = false;

    /* JADX INFO: renamed from: H */
    private void m215412H(int i, int i2) {
        float f = (i * 1.0f) / this.f199365z;
        float f2 = (i2 * 1.0f) / this.f199348A;
        if (f > 0.5f || f2 > 0.5f) {
            this.f199356I = 0;
        } else {
            this.f199356I = 2;
        }
    }

    /* JADX INFO: renamed from: I */
    private void m215413I(float f) {
        float f2 = this.f199348A;
        int i = (int) (f2 / f);
        float f3 = this.f199365z;
        int i2 = (int) (f * f3);
        float f4 = i;
        if (f4 < f3) {
            float f5 = ((f3 - f4) * 0.5f) / f3;
            m215414J(f5, 1.0f - f5, 0.0f, 1.0f);
        } else {
            float f6 = ((f2 - i2) * 0.5f) / f2;
            m215414J(0.0f, 1.0f, f6, 1.0f - f6);
        }
    }

    /* JADX INFO: renamed from: J */
    private void m215414J(float f, float f2, float f3, float f4) {
        if (!this.f199362O) {
            this.f199357J = new FloatBuffer[4];
            this.f199358K = new float[8];
            this.f199359L = new float[8];
            this.f199360M = new float[8];
            this.f199361N = new float[8];
            this.f199362O = true;
        }
        if (this.f199362O) {
            float[] fArr = this.f199358K;
            fArr[0] = f;
            fArr[1] = f3;
            fArr[2] = f2;
            fArr[3] = f3;
            fArr[4] = f;
            fArr[5] = f4;
            fArr[6] = f2;
            fArr[7] = f4;
            this.f199357J[0] = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.f199357J[0].put(this.f199358K).position(0);
            float[] fArr2 = this.f199359L;
            fArr2[0] = f;
            fArr2[1] = f4;
            fArr2[2] = f;
            fArr2[3] = f3;
            fArr2[4] = f2;
            fArr2[5] = f4;
            fArr2[6] = f2;
            fArr2[7] = f3;
            this.f199357J[1] = ByteBuffer.allocateDirect(fArr2.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.f199357J[1].put(this.f199359L).position(0);
            float[] fArr3 = this.f199360M;
            fArr3[0] = f2;
            fArr3[1] = f4;
            fArr3[2] = f;
            fArr3[3] = f4;
            fArr3[4] = f2;
            fArr3[5] = f3;
            fArr3[6] = f;
            fArr3[7] = f3;
            this.f199357J[2] = ByteBuffer.allocateDirect(fArr3.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.f199357J[2].put(this.f199360M).position(0);
            float[] fArr4 = this.f199361N;
            fArr4[0] = f2;
            fArr4[1] = f3;
            fArr4[2] = f2;
            fArr4[3] = f4;
            fArr4[4] = f;
            fArr4[5] = f3;
            fArr4[6] = f;
            fArr4[7] = f4;
            this.f199357J[3] = ByteBuffer.allocateDirect(fArr4.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.f199357J[3].put(this.f199361N).position(0);
        }
    }

    @Override // p153l.vej
    /* JADX INFO: renamed from: E */
    public void mo162984E(int i, int i2) {
        super.mo162984E(i, i2);
    }

    /* JADX INFO: renamed from: K */
    public void m215415K(int i, int i2) {
        this.f199351D = i;
        this.f199352E = i2;
    }

    @Override // p153l.cfj
    /* JADX INFO: renamed from: b */
    public void mo109544b(int i, ffj ffjVar, boolean z) {
        this.f183786h = i;
        m201057G(ffjVar.m201064s());
        m201055D(ffjVar.m201063q());
        if (this.f183779a % 2 == 1) {
            this.f199365z = ffjVar.m201063q();
            this.f199348A = ffjVar.m201064s();
            this.f199363x = ffjVar.m201064s() / ffjVar.m201063q();
        } else {
            this.f199365z = ffjVar.m201064s();
            this.f199348A = ffjVar.m201063q();
            this.f199363x = ffjVar.m201063q() / ffjVar.m201064s();
        }
        mo141810w();
        ffjVar.m125382P();
    }

    @Override // p153l.vej
    /* JADX INFO: renamed from: i */
    public void mo97355i() {
        super.mo97355i();
    }

    @Override // p153l.vej
    /* JADX INFO: renamed from: k */
    public void mo125383k() {
        int i;
        if (this.f183786h == 0) {
            return;
        }
        m215412H(m201064s(), m201063q());
        if ((m201063q() * 1.0f) / m201064s() != this.f199363x) {
            m215413I((m201063q() * 1.0f) / m201064s());
        } else {
            m215414J(0.0f, 1.0f, 0.0f, 1.0f);
        }
        int i2 = this.f199351D;
        if (i2 == 0 || (i = this.f199352E) == 0) {
            GLES20.glViewport(0, 0, m201064s(), m201063q());
        } else {
            GLES20.glViewport(0, 0, i2, i);
        }
        GLES20.glUseProgram(this.f183782d);
        GLES20.glClearColor(m201062o(), m201061n(), m201060m(), m201059l());
        mo97359x();
        GLES20.glDrawArrays(5, 0, 4);
        if (this.f199349B) {
            GLES20.glFinish();
        }
    }

    @Override // p153l.vej
    /* JADX INFO: renamed from: p */
    public String mo97356p() {
        return "precision " + this.f199350C + " float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nvarying vec2 xy_step;\nvarying float smooth; \nvoid main(){\nvec2 point = textureCoordinate; \nvec4 image_c = texture2D(inputImageTexture0,point); \nvec4 image = image_c;\nif (smooth >= 0.1) { \nvec4 image_lt=texture2D(inputImageTexture0, clamp(point+vec2(-xy_step.x,  xy_step.y), 0.0, 1.0)); \nvec4 image_lb=texture2D(inputImageTexture0, clamp(point+vec2(-xy_step.x, -xy_step.y), 0.0, 1.0)); \nvec4 image_rt=texture2D(inputImageTexture0, clamp(point+vec2( xy_step.x,  xy_step.y), 0.0, 1.0)); \nvec4 image_rb=texture2D(inputImageTexture0, clamp(point+vec2( xy_step.x, -xy_step.y), 0.0, 1.0)); \nvec4 image_l =texture2D(inputImageTexture0, clamp(point+vec2(-xy_step.x,     0.0), 0.0, 1.0)); \nvec4 image_r =texture2D(inputImageTexture0, clamp(point+vec2( xy_step.x,     0.0), 0.0, 1.0)); \nvec4 image_t =texture2D(inputImageTexture0, clamp(point+vec2(    0.0,  xy_step.y), 0.0, 1.0)); \nvec4 image_b =texture2D(inputImageTexture0, clamp(point+vec2(    0.0, -xy_step.y), 0.0, 1.0)); \nimage = clamp(image_c*0.25+(image_lt+image_lb+image_rt+image_rb)*0.125+(image_l+image_t+image_b+image_r)*0.0625, 0.0, 1.0); \n} \ngl_FragColor = image;\n}\n";
    }

    @Override // p153l.vej
    /* JADX INFO: renamed from: r */
    public String mo97357r() {
        return "attribute vec4 position;\nattribute vec2 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\nuniform float widthStep; \nuniform float heightStep; \nuniform float smoothMode; \nvarying float smooth; \nvarying vec2 xy_step;\nvoid main() {\nsmooth = smoothMode; \n  textureCoordinate = inputTextureCoordinate;\nxy_step = vec2(widthStep, heightStep);\ngl_Position = position;\n}\n";
    }

    @Override // p153l.vej
    /* JADX INFO: renamed from: u */
    public void mo97358u() {
        this.f183783e = GLES20.glGetUniformLocation(this.f183782d, "inputImageTexture0");
        this.f183784f = GLES20.glGetAttribLocation(this.f183782d, "position");
        this.f183785g = GLES20.glGetAttribLocation(this.f183782d, "inputTextureCoordinate");
        this.f199353F = GLES20.glGetUniformLocation(this.f183782d, "widthStep");
        this.f199354G = GLES20.glGetUniformLocation(this.f183782d, "heightStep");
        this.f199355H = GLES20.glGetUniformLocation(this.f183782d, "smoothMode");
    }

    @Override // p153l.vej
    /* JADX INFO: renamed from: v */
    public void mo141809v() {
        super.mo141809v();
    }

    @Override // p153l.vej
    /* JADX INFO: renamed from: x */
    public void mo97359x() {
        int i = this.f183779a;
        this.f183780b.position(0);
        float f = 1.0f / this.f199365z;
        float f2 = 1.0f / this.f199348A;
        GLES20.glUniform1f(this.f199353F, f);
        GLES20.glUniform1f(this.f199354G, f2);
        GLES20.glUniform1f(this.f199355H, this.f199356I / 10.0f);
        int i2 = i % 4;
        GLES20.glVertexAttribPointer(this.f183784f, 2, 5126, false, 8, (Buffer) this.f183780b);
        GLES20.glEnableVertexAttribArray(this.f183784f);
        this.f199357J[i2].position(0);
        GLES20.glVertexAttribPointer(this.f183785g, 2, 5126, false, 8, (Buffer) this.f199357J[i2]);
        GLES20.glEnableVertexAttribArray(this.f183785g);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f183786h);
        GLES20.glUniform1i(this.f183783e, 0);
    }
}
