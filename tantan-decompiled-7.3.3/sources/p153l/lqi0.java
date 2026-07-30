package p153l;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class lqi0 extends kt2 implements gzc0 {

    /* JADX INFO: renamed from: D */
    uje f133216D;

    /* JADX INFO: renamed from: E */
    uje f133217E;

    /* JADX INFO: renamed from: H */
    private float f133220H;

    /* JADX INFO: renamed from: I */
    private float f133221I;

    /* JADX INFO: renamed from: J */
    private float f133222J;

    /* JADX INFO: renamed from: K */
    private float f133223K;

    /* JADX INFO: renamed from: F */
    private float f133218F = 1.0f;

    /* JADX INFO: renamed from: G */
    private float f133219G = 1.0f;

    /* JADX INFO: renamed from: L */
    private boolean f133224L = true;

    /* JADX INFO: renamed from: M */
    private FloatBuffer f133225M = null;

    /* JADX INFO: renamed from: P */
    private void m155490P() {
        float fM210702r = (this.f133220H * 1.0f) / m210702r();
        float fM210701n = (this.f133221I * 1.0f) / m210701n();
        if (fM210702r >= fM210701n) {
            fM210702r = fM210701n;
        }
        this.f133222J = m210702r() * fM210702r;
        this.f133223K = m210701n() * fM210702r;
    }

    /* JADX INFO: renamed from: Q */
    public void m155492Q(boolean z) {
        this.f133224L = z;
    }

    @Override // p153l.gzc0
    /* JADX INFO: renamed from: a */
    public void mo133080a(uje ujeVar, uje ujeVar2) {
        if (ujeVar != null) {
            this.f133216D = ujeVar;
        }
        if (ujeVar2 != null) {
            this.f133217E = ujeVar2;
        }
    }

    @Override // p153l.kt2, p153l.efj
    /* JADX INFO: renamed from: c */
    public void mo96079c(int i, hfj hfjVar, boolean z) {
        int iM210702r;
        int iM210701n;
        if (z) {
            m134802L();
        }
        this.f193947h = i;
        m210695B(hfjVar.m210702r());
        m210704y(hfjVar.m210701n());
        if (this.f193940a % 2 == 1) {
            iM210702r = hfjVar.m210701n();
            iM210701n = hfjVar.m210702r();
        } else {
            iM210702r = hfjVar.m210702r();
            iM210701n = hfjVar.m210701n();
        }
        float f = this.f133220H;
        float f2 = this.f133221I;
        this.f133220H = iM210702r;
        this.f133221I = iM210701n;
        if (f != 0.0f && (((int) f) != iM210702r || ((int) f2) != iM210701n)) {
            mo134806s();
        }
        mo134345v();
        hfjVar.m134804N();
    }

    @Override // p153l.hfj, p153l.xej
    /* JADX INFO: renamed from: h */
    public void mo134805h() {
        if (this.f193947h == 0) {
            return;
        }
        GLES20.glFinish();
        uje ujeVar = this.f133216D;
        if (ujeVar != null) {
            ujeVar.m196327f();
        }
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glViewport(0, 0, m210702r(), m210701n());
        GLES20.glUseProgram(this.f193943d);
        GLES20.glClearColor(m210700l(), m210699k(), m210698j(), m210697i());
        GLES20.glClear(16640);
        mo112469w();
        GLES20.glDrawArrays(5, 0, 4);
        m210696g();
        mo155491O();
        uje ujeVar2 = this.f133216D;
        if (ujeVar2 != null) {
            ujeVar2.m196329i();
        }
        uje ujeVar3 = this.f133217E;
        if (ujeVar3 != null) {
            ujeVar3.m196327f();
        }
    }

    @Override // p153l.hfj, p153l.xej
    /* JADX INFO: renamed from: s */
    public void mo134806s() {
        float[] fArr = new float[8];
        this.f193942c[this.f193940a].position(0);
        this.f193942c[this.f193940a].get(fArr);
        m155490P();
        float f = this.f133222J / this.f133220H;
        this.f133219G = f;
        float f2 = this.f133223K / this.f133221I;
        this.f133218F = f2;
        float f3 = (1.0f - f2) / 2.0f;
        float f4 = (1.0f - f) / 2.0f;
        this.f133225M = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        if (this.f133224L) {
            if (this.f193940a % 2 != 0) {
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
        this.f133225M.position(0);
        this.f133225M.put(fArr);
        this.f133225M.position(0);
        super.mo134806s();
    }

    @Override // p153l.xej
    /* JADX INFO: renamed from: w */
    public void mo112469w() {
        if (this.f133225M == null) {
            super.mo112469w();
            return;
        }
        this.f193941b.position(0);
        GLES20.glVertexAttribPointer(this.f193945f, 2, 5126, false, 8, (Buffer) this.f193941b);
        GLES20.glEnableVertexAttribArray(this.f193945f);
        this.f133225M.position(0);
        GLES20.glVertexAttribPointer(this.f193946g, 2, 5126, false, 8, (Buffer) this.f133225M);
        GLES20.glEnableVertexAttribArray(this.f193946g);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f193947h);
        GLES20.glUniform1i(this.f193944e, 0);
    }

    /* JADX INFO: renamed from: O */
    public void mo155491O() {
    }
}
