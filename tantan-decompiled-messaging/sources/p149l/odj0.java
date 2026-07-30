package p149l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes7.dex */
public abstract class odj0 extends ss2 {

    /* JADX INFO: renamed from: E */
    protected qbj f143207E;

    /* JADX INFO: renamed from: F */
    private int f143208F;

    @Override // p149l.lcj
    /* JADX INFO: renamed from: M */
    public void mo149303M() {
        super.mo149303M();
        qbj qbjVar = this.f143207E;
        if (qbjVar != null) {
            qbjVar.m173827b();
        }
        qbj qbjVar2 = new qbj(m101085s(), m101084q());
        this.f143207E = qbjVar2;
        qbjVar2.m173826a(m101085s(), m101084q());
        int iGlCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (iGlCheckFramebufferStatus == 36053) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this);
        ysf.m215904a(sb, iGlCheckFramebufferStatus, GLES20.glGetError());
    }

    /* JADX INFO: renamed from: Q */
    public int m163668Q() {
        return this.f143208F;
    }

    @Override // p149l.lcj, p149l.bcj
    /* JADX INFO: renamed from: i */
    public void mo95685i() {
        super.mo95685i();
        qbj qbjVar = this.f143207E;
        if (qbjVar != null) {
            qbjVar.m173827b();
            this.f143207E = null;
        }
    }

    @Override // p149l.lcj, p149l.bcj
    /* JADX INFO: renamed from: k */
    public void mo101079k() {
        this.f143208F = 1;
        if (this.f143207E == null) {
            if (m101085s() == 0 || m101084q() == 0) {
                return;
            } else {
                mo149303M();
            }
        }
        qbj qbjVar = this.f143207E;
        if (qbjVar != null && qbjVar.m173828c() == null) {
            if (m101085s() == 0 || m101084q() == 0) {
                return;
            } else {
                mo149303M();
            }
        }
        GLES20.glBindFramebuffer(36160, this.f143207E.m173828c()[0]);
        if (this.f74928h == 0) {
            return;
        }
        GLES20.glViewport(0, 0, m101085s(), m101084q());
        GLES20.glUseProgram(this.f74924d);
        GLES20.glClear(16640);
        GLES20.glClearColor(m101083o(), m101082n(), m101081m(), m101080l());
        mo101089x();
        GLES20.glDrawArrays(5, 0, 4);
        this.f74928h = this.f143207E.m173829d()[0];
        GLES20.glBindFramebuffer(36160, 0);
        this.f143208F = 2;
        super.mo101079k();
    }
}
