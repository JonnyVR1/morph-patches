package p153l;

import android.opengl.GLES20;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ffj extends vej {

    /* JADX INFO: renamed from: A */
    protected boolean f98776A;

    /* JADX INFO: renamed from: x */
    protected kej f98779x;

    /* JADX INFO: renamed from: z */
    protected Object f98781z = new Object();

    /* JADX INFO: renamed from: C */
    private boolean f98778C = false;

    /* JADX INFO: renamed from: y */
    protected List<cfj> f98780y = new ArrayList();

    /* JADX INFO: renamed from: B */
    private String f98777B = toString();

    /* JADX INFO: renamed from: I */
    private void m125375I() {
        super.mo125383k();
    }

    /* JADX INFO: renamed from: H */
    public synchronized void m125376H(cfj cfjVar) {
        synchronized (this.f98781z) {
            List<cfj> list = this.f98780y;
            if (list == null || !list.contains(cfjVar)) {
                this.f98780y.add(cfjVar);
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public void mo121060J() {
        m125375I();
    }

    /* JADX INFO: renamed from: K */
    public Object m125377K() {
        return this.f98781z;
    }

    /* JADX INFO: renamed from: L */
    public List<cfj> m125378L() {
        return this.f98780y;
    }

    /* JADX INFO: renamed from: M */
    public void mo125379M() {
        kej kejVar = this.f98779x;
        if (kejVar != null) {
            kejVar.m149330b();
        }
        kej kejVar2 = new kej(m201064s(), m201063q());
        this.f98779x = kejVar2;
        kejVar2.m149333e(this.f98778C);
        this.f98779x.m149329a(m201064s(), m201063q());
        int iGlCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (iGlCheckFramebufferStatus != 36053) {
            if (!this.f98778C) {
                StringBuilder sb = new StringBuilder();
                sb.append(this);
                muf.m160142a(sb, iGlCheckFramebufferStatus, GLES20.glGetError());
                return;
            }
            kej kejVar3 = this.f98779x;
            if (kejVar3 != null) {
                kejVar3.m149330b();
            }
            kej kejVar4 = new kej(m201064s(), m201063q());
            this.f98779x = kejVar4;
            this.f98778C = false;
            kejVar4.m149333e(false);
            this.f98779x.m149329a(m201064s(), m201063q());
            int iGlCheckFramebufferStatus2 = GLES20.glCheckFramebufferStatus(36160);
            if (iGlCheckFramebufferStatus2 == 36053) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this);
            muf.m160142a(sb2, iGlCheckFramebufferStatus2, GLES20.glGetError());
        }
    }

    /* JADX INFO: renamed from: N */
    public void m125380N() {
        this.f98776A = true;
    }

    /* JADX INFO: renamed from: O */
    public void m125381O(cfj cfjVar) {
        synchronized (this.f98781z) {
            this.f98780y.remove(cfjVar);
        }
    }

    /* JADX INFO: renamed from: P */
    public void m125382P() {
        kej kejVar = this.f98779x;
        if (kejVar != null) {
            kejVar.m149334f();
        }
    }

    @Override // p153l.vej
    /* JADX INFO: renamed from: i */
    public void mo97355i() {
        super.mo97355i();
        kej kejVar = this.f98779x;
        if (kejVar != null) {
            kejVar.m149330b();
            this.f98779x = null;
        }
    }

    @Override // p153l.vej
    /* JADX INFO: renamed from: k */
    public void mo125383k() {
        boolean z;
        kej kejVar;
        System.currentTimeMillis();
        if (this.f98779x == null) {
            if (m201064s() == 0 || m201063q() == 0) {
                return;
            } else {
                mo125379M();
            }
        }
        kej kejVar2 = this.f98779x;
        if (kejVar2 != null && kejVar2.m149331c() == null) {
            if (m201064s() == 0 || m201063q() == 0) {
                return;
            } else {
                mo125379M();
            }
        }
        if (this.f98776A) {
            GLES20.glBindFramebuffer(36160, this.f98779x.m149331c()[0]);
            GLES20.glClearColor(m201062o(), m201061n(), m201060m(), m201059l());
            GLES20.glClear(16640);
            mo121060J();
            GLES20.glBindFramebuffer(36160, 0);
            z = true;
        } else {
            z = false;
        }
        System.currentTimeMillis();
        synchronized (this.f98781z) {
            try {
                for (cfj cfjVar : this.f98780y) {
                    if (cfjVar != null && (kejVar = this.f98779x) != null) {
                        cfjVar.mo109544b(kejVar.m149332d()[0], this, z);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.vej
    /* JADX INFO: renamed from: t */
    public void mo125384t() {
        mo125379M();
    }
}
