package p149l;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class lhi0 extends us2 implements brc0 {

    /* JADX INFO: renamed from: D */
    qie f128102D;

    /* JADX INFO: renamed from: E */
    qie f128103E;

    /* JADX INFO: renamed from: H */
    private float f128106H;

    /* JADX INFO: renamed from: I */
    private float f128107I;

    /* JADX INFO: renamed from: J */
    private float f128108J;

    /* JADX INFO: renamed from: K */
    private float f128109K;

    /* JADX INFO: renamed from: F */
    private float f128104F = 1.0f;

    /* JADX INFO: renamed from: G */
    private float f128105G = 1.0f;

    /* JADX INFO: renamed from: L */
    private boolean f128110L = true;

    /* JADX INFO: renamed from: M */
    private FloatBuffer f128111M = null;

    /* JADX INFO: renamed from: P */
    private void m149844P() {
        float fM110705r = (this.f128106H * 1.0f) / m110705r();
        float fM110701n = (this.f128107I * 1.0f) / m110701n();
        if (fM110705r >= fM110701n) {
            fM110705r = fM110701n;
        }
        this.f128108J = m110705r() * fM110705r;
        this.f128109K = m110701n() * fM110705r;
    }

    /* JADX INFO: renamed from: Q */
    public void m149845Q(boolean z) {
        this.f128110L = z;
    }

    @Override // p149l.brc0
    /* JADX INFO: renamed from: a */
    public void mo103527a(qie qieVar, qie qieVar2) {
        if (qieVar != null) {
            this.f128102D = qieVar;
        }
        if (qieVar2 != null) {
            this.f128103E = qieVar2;
        }
    }

    @Override // p149l.us2, p149l.kcj
    /* JADX INFO: renamed from: c */
    public void mo102037c(int i, ncj ncjVar, boolean z) {
        int iM110705r;
        int iM110701n;
        if (z) {
            m158950L();
        }
        this.f85422h = i;
        m110693B(ncjVar.m110705r());
        m110712y(ncjVar.m110701n());
        if (this.f85415a % 2 == 1) {
            iM110705r = ncjVar.m110701n();
            iM110701n = ncjVar.m110705r();
        } else {
            iM110705r = ncjVar.m110705r();
            iM110701n = ncjVar.m110701n();
        }
        float f = this.f128106H;
        float f2 = this.f128107I;
        this.f128106H = iM110705r;
        this.f128107I = iM110701n;
        if (f != 0.0f && (((int) f) != iM110705r || ((int) f2) != iM110701n)) {
            mo110706s();
        }
        mo110709v();
        ncjVar.m158952N();
    }

    @Override // p149l.ncj, p149l.dcj
    /* JADX INFO: renamed from: h */
    public void mo110696h() {
        if (this.f85422h == 0) {
            return;
        }
        GLES20.glFinish();
        qie qieVar = this.f128102D;
        if (qieVar != null) {
            qieVar.m174872f();
        }
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glViewport(0, 0, m110705r(), m110701n());
        GLES20.glUseProgram(this.f85418d);
        GLES20.glClearColor(m110700l(), m110699k(), m110698j(), m110697i());
        GLES20.glClear(16640);
        mo110710w();
        GLES20.glDrawArrays(5, 0, 4);
        m110695g();
        mo134471O();
        qie qieVar2 = this.f128102D;
        if (qieVar2 != null) {
            qieVar2.m174874i();
        }
        qie qieVar3 = this.f128103E;
        if (qieVar3 != null) {
            qieVar3.m174872f();
        }
    }

    @Override // p149l.ncj, p149l.dcj
    /* JADX INFO: renamed from: s */
    public void mo110706s() {
        float[] fArr = new float[8];
        this.f85417c[this.f85415a].position(0);
        this.f85417c[this.f85415a].get(fArr);
        m149844P();
        float f = this.f128108J / this.f128106H;
        this.f128105G = f;
        float f2 = this.f128109K / this.f128107I;
        this.f128104F = f2;
        float f3 = (1.0f - f2) / 2.0f;
        float f4 = (1.0f - f) / 2.0f;
        this.f128111M = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        if (this.f128110L) {
            if (this.f85415a % 2 != 0) {
                for (int i = 0; i < 4; i++) {
                    int i2 = i * 2;
                    float f5 = fArr[i2];
                    fArr[i2] = ((double) f5) < 0.5d ? f5 + f3 : f5 - f3;
                    int i3 = i2 + 1;
                    float f6 = fArr[i3];
                    fArr[i3] = ((double) f6) < 0.5d ? f6 + f4 : f6 - f4;
                }
            } else {
                for (int i4 = 0; i4 < 4; i4++) {
                    int i5 = i4 * 2;
                    float f7 = fArr[i5];
                    fArr[i5] = ((double) f7) < 0.5d ? f7 + f4 : f7 - f4;
                    int i6 = i5 + 1;
                    float f8 = fArr[i6];
                    fArr[i6] = ((double) f8) < 0.5d ? f8 + f3 : f8 - f3;
                }
            }
        }
        this.f128111M.position(0);
        this.f128111M.put(fArr);
        this.f128111M.position(0);
        super.mo110706s();
    }

    @Override // p149l.dcj
    /* JADX INFO: renamed from: w */
    public void mo110710w() {
        if (this.f128111M == null) {
            super.mo110710w();
            return;
        }
        this.f85416b.position(0);
        GLES20.glVertexAttribPointer(this.f85420f, 2, 5126, false, 8, (Buffer) this.f85416b);
        GLES20.glEnableVertexAttribArray(this.f85420f);
        this.f128111M.position(0);
        GLES20.glVertexAttribPointer(this.f85421g, 2, 5126, false, 8, (Buffer) this.f128111M);
        GLES20.glEnableVertexAttribArray(this.f85421g);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f85422h);
        GLES20.glUniform1i(this.f85419e, 0);
    }

    /* JADX INFO: renamed from: O */
    public void mo134471O() {
    }
}
