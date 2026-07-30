package p149l;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class ecj extends bcj implements icj {

    /* JADX INFO: renamed from: A */
    private float f90526A;

    /* JADX INFO: renamed from: F */
    private int f90531F;

    /* JADX INFO: renamed from: G */
    private int f90532G;

    /* JADX INFO: renamed from: H */
    private int f90533H;

    /* JADX INFO: renamed from: J */
    private FloatBuffer[] f90535J;

    /* JADX INFO: renamed from: K */
    private float[] f90536K;

    /* JADX INFO: renamed from: L */
    private float[] f90537L;

    /* JADX INFO: renamed from: M */
    private float[] f90538M;

    /* JADX INFO: renamed from: N */
    private float[] f90539N;

    /* JADX INFO: renamed from: x */
    private float f90541x;

    /* JADX INFO: renamed from: z */
    private float f90543z;

    /* JADX INFO: renamed from: y */
    private float f90542y = 1.0f;

    /* JADX INFO: renamed from: B */
    private boolean f90527B = true;

    /* JADX INFO: renamed from: C */
    public String f90528C = "mediump";

    /* JADX INFO: renamed from: D */
    private int f90529D = 0;

    /* JADX INFO: renamed from: E */
    private int f90530E = 0;

    /* JADX INFO: renamed from: I */
    private int f90534I = 0;

    /* JADX INFO: renamed from: O */
    private boolean f90540O = false;

    /* JADX INFO: renamed from: H */
    private void m115725H(int i, int i2) {
        float f = (i * 1.0f) / this.f90543z;
        float f2 = (i2 * 1.0f) / this.f90526A;
        if (f > 0.5f || f2 > 0.5f) {
            this.f90534I = 0;
        } else {
            this.f90534I = 2;
        }
    }

    /* JADX INFO: renamed from: I */
    private void m115726I(float f) {
        float f2 = this.f90526A;
        int i = (int) (f2 / f);
        float f3 = this.f90543z;
        int i2 = (int) (f * f3);
        float f4 = i;
        if (f4 < f3) {
            float f5 = ((f3 - f4) * 0.5f) / f3;
            m115727J(f5, 1.0f - f5, 0.0f, 1.0f);
        } else {
            float f6 = ((f2 - i2) * 0.5f) / f2;
            m115727J(0.0f, 1.0f, f6, 1.0f - f6);
        }
    }

    /* JADX INFO: renamed from: J */
    private void m115727J(float f, float f2, float f3, float f4) {
        if (!this.f90540O) {
            this.f90535J = new FloatBuffer[4];
            this.f90536K = new float[8];
            this.f90537L = new float[8];
            this.f90538M = new float[8];
            this.f90539N = new float[8];
            this.f90540O = true;
        }
        if (this.f90540O) {
            float[] fArr = this.f90536K;
            fArr[0] = f;
            fArr[1] = f3;
            fArr[2] = f2;
            fArr[3] = f3;
            fArr[4] = f;
            fArr[5] = f4;
            fArr[6] = f2;
            fArr[7] = f4;
            this.f90535J[0] = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.f90535J[0].put(this.f90536K).position(0);
            float[] fArr2 = this.f90537L;
            fArr2[0] = f;
            fArr2[1] = f4;
            fArr2[2] = f;
            fArr2[3] = f3;
            fArr2[4] = f2;
            fArr2[5] = f4;
            fArr2[6] = f2;
            fArr2[7] = f3;
            this.f90535J[1] = ByteBuffer.allocateDirect(fArr2.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.f90535J[1].put(this.f90537L).position(0);
            float[] fArr3 = this.f90538M;
            fArr3[0] = f2;
            fArr3[1] = f4;
            fArr3[2] = f;
            fArr3[3] = f4;
            fArr3[4] = f2;
            fArr3[5] = f3;
            fArr3[6] = f;
            fArr3[7] = f3;
            this.f90535J[2] = ByteBuffer.allocateDirect(fArr3.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.f90535J[2].put(this.f90538M).position(0);
            float[] fArr4 = this.f90539N;
            fArr4[0] = f2;
            fArr4[1] = f3;
            fArr4[2] = f2;
            fArr4[3] = f4;
            fArr4[4] = f;
            fArr4[5] = f3;
            fArr4[6] = f;
            fArr4[7] = f4;
            this.f90535J[3] = ByteBuffer.allocateDirect(fArr4.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            this.f90535J[3].put(this.f90539N).position(0);
        }
    }

    @Override // p149l.bcj
    /* JADX INFO: renamed from: E */
    public void mo101075E(int i, int i2) {
        super.mo101075E(i, i2);
    }

    /* JADX INFO: renamed from: K */
    public void m115728K(int i, int i2) {
        this.f90529D = i;
        this.f90530E = i2;
    }

    @Override // p149l.icj
    /* JADX INFO: renamed from: b */
    public void mo95681b(int i, lcj lcjVar, boolean z) {
        this.f74928h = i;
        m101077G(lcjVar.m101085s());
        m101074D(lcjVar.m101084q());
        if (this.f74921a % 2 == 1) {
            this.f90543z = lcjVar.m101084q();
            this.f90526A = lcjVar.m101085s();
            this.f90541x = lcjVar.m101085s() / lcjVar.m101084q();
        } else {
            this.f90543z = lcjVar.m101085s();
            this.f90526A = lcjVar.m101084q();
            this.f90541x = lcjVar.m101084q() / lcjVar.m101085s();
        }
        mo101088w();
        lcjVar.m149306P();
    }

    @Override // p149l.bcj
    /* JADX INFO: renamed from: i */
    public void mo95685i() {
        super.mo95685i();
    }

    @Override // p149l.bcj
    /* JADX INFO: renamed from: k */
    public void mo101079k() {
        int i;
        if (this.f74928h == 0) {
            return;
        }
        m115725H(m101085s(), m101084q());
        if ((m101084q() * 1.0f) / m101085s() != this.f90541x) {
            m115726I((m101084q() * 1.0f) / m101085s());
        } else {
            m115727J(0.0f, 1.0f, 0.0f, 1.0f);
        }
        int i2 = this.f90529D;
        if (i2 == 0 || (i = this.f90530E) == 0) {
            GLES20.glViewport(0, 0, m101085s(), m101084q());
        } else {
            GLES20.glViewport(0, 0, i2, i);
        }
        GLES20.glUseProgram(this.f74924d);
        GLES20.glClearColor(m101083o(), m101082n(), m101081m(), m101080l());
        mo101089x();
        GLES20.glDrawArrays(5, 0, 4);
        if (this.f90527B) {
            GLES20.glFinish();
        }
    }

    @Override // p149l.bcj
    /* JADX INFO: renamed from: p */
    public String mo95686p() {
        return "precision " + this.f90528C + " float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nvarying vec2 xy_step;\nvarying float smooth; \nvoid main(){\nvec2 point = textureCoordinate; \nvec4 image_c = texture2D(inputImageTexture0,point); \nvec4 image = image_c;\nif (smooth >= 0.1) { \nvec4 image_lt=texture2D(inputImageTexture0, clamp(point+vec2(-xy_step.x,  xy_step.y), 0.0, 1.0)); \nvec4 image_lb=texture2D(inputImageTexture0, clamp(point+vec2(-xy_step.x, -xy_step.y), 0.0, 1.0)); \nvec4 image_rt=texture2D(inputImageTexture0, clamp(point+vec2( xy_step.x,  xy_step.y), 0.0, 1.0)); \nvec4 image_rb=texture2D(inputImageTexture0, clamp(point+vec2( xy_step.x, -xy_step.y), 0.0, 1.0)); \nvec4 image_l =texture2D(inputImageTexture0, clamp(point+vec2(-xy_step.x,     0.0), 0.0, 1.0)); \nvec4 image_r =texture2D(inputImageTexture0, clamp(point+vec2( xy_step.x,     0.0), 0.0, 1.0)); \nvec4 image_t =texture2D(inputImageTexture0, clamp(point+vec2(    0.0,  xy_step.y), 0.0, 1.0)); \nvec4 image_b =texture2D(inputImageTexture0, clamp(point+vec2(    0.0, -xy_step.y), 0.0, 1.0)); \nimage = clamp(image_c*0.25+(image_lt+image_lb+image_rt+image_rb)*0.125+(image_l+image_t+image_b+image_r)*0.0625, 0.0, 1.0); \n} \ngl_FragColor = image;\n}\n";
    }

    @Override // p149l.bcj
    /* JADX INFO: renamed from: r */
    public String mo95687r() {
        return "attribute vec4 position;\nattribute vec2 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\nuniform float widthStep; \nuniform float heightStep; \nuniform float smoothMode; \nvarying float smooth; \nvarying vec2 xy_step;\nvoid main() {\nsmooth = smoothMode; \n  textureCoordinate = inputTextureCoordinate;\nxy_step = vec2(widthStep, heightStep);\ngl_Position = position;\n}\n";
    }

    @Override // p149l.bcj
    /* JADX INFO: renamed from: u */
    public void mo95688u() {
        this.f74925e = GLES20.glGetUniformLocation(this.f74924d, "inputImageTexture0");
        this.f74926f = GLES20.glGetAttribLocation(this.f74924d, "position");
        this.f74927g = GLES20.glGetAttribLocation(this.f74924d, "inputTextureCoordinate");
        this.f90531F = GLES20.glGetUniformLocation(this.f74924d, "widthStep");
        this.f90532G = GLES20.glGetUniformLocation(this.f74924d, "heightStep");
        this.f90533H = GLES20.glGetUniformLocation(this.f74924d, "smoothMode");
    }

    @Override // p149l.bcj
    /* JADX INFO: renamed from: v */
    public void mo101087v() {
        super.mo101087v();
    }

    @Override // p149l.bcj
    /* JADX INFO: renamed from: x */
    public void mo101089x() {
        int i = this.f74921a;
        this.f74922b.position(0);
        float f = 1.0f / this.f90543z;
        float f2 = 1.0f / this.f90526A;
        GLES20.glUniform1f(this.f90531F, f);
        GLES20.glUniform1f(this.f90532G, f2);
        GLES20.glUniform1f(this.f90533H, this.f90534I / 10.0f);
        int i2 = i % 4;
        GLES20.glVertexAttribPointer(this.f74926f, 2, 5126, false, 8, (Buffer) this.f74922b);
        GLES20.glEnableVertexAttribArray(this.f74926f);
        this.f90535J[i2].position(0);
        GLES20.glVertexAttribPointer(this.f74927g, 2, 5126, false, 8, (Buffer) this.f90535J[i2]);
        GLES20.glEnableVertexAttribArray(this.f74927g);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f74928h);
        GLES20.glUniform1i(this.f74925e, 0);
    }
}
