package p153l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes7.dex */
public abstract class smj0 extends it2 {

    /* JADX INFO: renamed from: E */
    protected kej f169585E;

    /* JADX INFO: renamed from: F */
    private int f169586F;

    @Override // p153l.ffj
    /* JADX INFO: renamed from: M */
    public void mo125379M() {
        super.mo125379M();
        kej kejVar = this.f169585E;
        if (kejVar != null) {
            kejVar.m149330b();
        }
        kej kejVar2 = new kej(m201064s(), m201063q());
        this.f169585E = kejVar2;
        kejVar2.m149329a(m201064s(), m201063q());
        int iGlCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (iGlCheckFramebufferStatus == 36053) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        muf.m160142a(sb, iGlCheckFramebufferStatus, GLES20.glGetError());
    }

    /* JADX INFO: renamed from: Q */
    public int m186819Q() {
        return this.f169586F;
    }

    @Override // p153l.ffj, p153l.vej
    /* JADX INFO: renamed from: i */
    public void mo97355i() {
        super.mo97355i();
        kej kejVar = this.f169585E;
        if (kejVar != null) {
            kejVar.m149330b();
            this.f169585E = null;
        }
    }

    @Override // p153l.ffj, p153l.vej
    /* JADX INFO: renamed from: k */
    public void mo125383k() {
        this.f169586F = 1;
        if (this.f169585E == null) {
            if (m201064s() == 0 || m201063q() == 0) {
                return;
            } else {
                mo125379M();
            }
        }
        kej kejVar = this.f169585E;
        if (kejVar != null && kejVar.m149331c() == null) {
            if (m201064s() == 0 || m201063q() == 0) {
                return;
            } else {
                mo125379M();
            }
        }
        GLES20.glBindFramebuffer(36160, this.f169585E.m149331c()[0]);
        if (this.f183786h == 0) {
            return;
        }
        GLES20.glViewport(0, 0, m201064s(), m201063q());
        GLES20.glUseProgram(this.f183782d);
        GLES20.glClear(16640);
        GLES20.glClearColor(m201062o(), m201061n(), m201060m(), m201059l());
        mo97359x();
        GLES20.glDrawArrays(5, 0, 4);
        this.f183786h = this.f169585E.m149332d()[0];
        GLES20.glBindFramebuffer(36160, 0);
        this.f169586F = 2;
        super.mo125383k();
    }
}
