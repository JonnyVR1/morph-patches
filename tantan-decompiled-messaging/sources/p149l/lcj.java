package p149l;

import android.opengl.GLES20;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class lcj extends bcj {

    /* JADX INFO: renamed from: A */
    protected boolean f127415A;

    /* JADX INFO: renamed from: x */
    protected qbj f127418x;

    /* JADX INFO: renamed from: z */
    protected Object f127420z = new Object();

    /* JADX INFO: renamed from: C */
    private boolean f127417C = false;

    /* JADX INFO: renamed from: y */
    protected List<icj> f127419y = new ArrayList();

    /* JADX INFO: renamed from: B */
    private String f127416B = toString();

    /* JADX INFO: renamed from: I */
    private void m149299I() {
        super.mo101079k();
    }

    /* JADX INFO: renamed from: H */
    public synchronized void m149300H(icj icjVar) {
        synchronized (this.f127420z) {
            List<icj> list = this.f127419y;
            if (list == null || !list.contains(icjVar)) {
                this.f127419y.add(icjVar);
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public void mo95677J() {
        m149299I();
    }

    /* JADX INFO: renamed from: K */
    public Object m149301K() {
        return this.f127420z;
    }

    /* JADX INFO: renamed from: L */
    public List<icj> m149302L() {
        return this.f127419y;
    }

    /* JADX INFO: renamed from: M */
    public void mo149303M() {
        qbj qbjVar = this.f127418x;
        if (qbjVar != null) {
            qbjVar.m173827b();
        }
        qbj qbjVar2 = new qbj(m101085s(), m101084q());
        this.f127418x = qbjVar2;
        qbjVar2.m173830e(this.f127417C);
        this.f127418x.m173826a(m101085s(), m101084q());
        int iGlCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (iGlCheckFramebufferStatus != 36053) {
            if (!this.f127417C) {
                StringBuilder sb = new StringBuilder();
                sb.append(this);
                ysf.m215904a(sb, iGlCheckFramebufferStatus, GLES20.glGetError());
                return;
            }
            qbj qbjVar3 = this.f127418x;
            if (qbjVar3 != null) {
                qbjVar3.m173827b();
            }
            qbj qbjVar4 = new qbj(m101085s(), m101084q());
            this.f127418x = qbjVar4;
            this.f127417C = false;
            qbjVar4.m173830e(false);
            this.f127418x.m173826a(m101085s(), m101084q());
            int iGlCheckFramebufferStatus2 = GLES20.glCheckFramebufferStatus(36160);
            if (iGlCheckFramebufferStatus2 == 36053) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this);
            ysf.m215904a(sb2, iGlCheckFramebufferStatus2, GLES20.glGetError());
        }
    }

    /* JADX INFO: renamed from: N */
    public void m149304N() {
        this.f127415A = true;
    }

    /* JADX INFO: renamed from: O */
    public void m149305O(icj icjVar) {
        synchronized (this.f127420z) {
            this.f127419y.remove(icjVar);
        }
    }

    /* JADX INFO: renamed from: P */
    public void m149306P() {
        qbj qbjVar = this.f127418x;
        if (qbjVar != null) {
            qbjVar.m173831f();
        }
    }

    @Override // p149l.bcj
    /* JADX INFO: renamed from: i */
    public void mo95685i() {
        super.mo95685i();
        qbj qbjVar = this.f127418x;
        if (qbjVar != null) {
            qbjVar.m173827b();
            this.f127418x = null;
        }
    }

    @Override // p149l.bcj
    /* JADX INFO: renamed from: k */
    public void mo101079k() {
        boolean z;
        qbj qbjVar;
        System.currentTimeMillis();
        if (this.f127418x == null) {
            if (m101085s() == 0 || m101084q() == 0) {
                return;
            } else {
                mo149303M();
            }
        }
        qbj qbjVar2 = this.f127418x;
        if (qbjVar2 != null && qbjVar2.m173828c() == null) {
            if (m101085s() == 0 || m101084q() == 0) {
                return;
            } else {
                mo149303M();
            }
        }
        if (this.f127415A) {
            GLES20.glBindFramebuffer(36160, this.f127418x.m173828c()[0]);
            GLES20.glClearColor(m101083o(), m101082n(), m101081m(), m101080l());
            GLES20.glClear(16640);
            mo95677J();
            GLES20.glBindFramebuffer(36160, 0);
            z = true;
        } else {
            z = false;
        }
        System.currentTimeMillis();
        synchronized (this.f127420z) {
            try {
                for (icj icjVar : this.f127419y) {
                    if (icjVar != null && (qbjVar = this.f127418x) != null) {
                        icjVar.mo95681b(qbjVar.m173829d()[0], this, z);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.bcj
    /* JADX INFO: renamed from: t */
    public void mo101086t() {
        mo149303M();
    }
}
