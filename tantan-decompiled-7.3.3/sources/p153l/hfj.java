package p153l;

import android.opengl.GLES20;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class hfj extends xej {

    /* JADX INFO: renamed from: A */
    protected boolean f109302A;

    /* JADX INFO: renamed from: x */
    public mej f109305x;

    /* JADX INFO: renamed from: z */
    protected Object f109307z = new Object();

    /* JADX INFO: renamed from: C */
    protected boolean f109304C = false;

    /* JADX INFO: renamed from: y */
    protected List<efj> f109306y = new ArrayList();

    /* JADX INFO: renamed from: B */
    private String f109303B = toString();

    /* JADX INFO: renamed from: E */
    private void m134794E() {
        super.mo134805h();
    }

    /* JADX INFO: renamed from: C */
    public synchronized void m134795C(efj efjVar) {
        synchronized (this.f109307z) {
            List<efj> list = this.f109306y;
            if (list == null || !list.contains(efjVar)) {
                this.f109306y.add(efjVar);
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public void m134796D() {
        synchronized (this.f109307z) {
            try {
                this.f109306y.clear();
                mej mejVar = this.f109305x;
                if (mejVar != null) {
                    mejVar.m158025c();
                    this.f109305x = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public void mo134797F() {
        m134794E();
    }

    /* JADX INFO: renamed from: G */
    public int mo134798G() {
        return m210701n();
    }

    /* JADX INFO: renamed from: H */
    public int mo134799H() {
        return m210702r();
    }

    /* JADX INFO: renamed from: I */
    public Object m134800I() {
        return this.f109307z;
    }

    /* JADX INFO: renamed from: J */
    public List<efj> m134801J() {
        return this.f109306y;
    }

    /* JADX INFO: renamed from: K */
    public void mo96077K() {
        mej mejVar = this.f109305x;
        if (mejVar != null) {
            mejVar.m158025c();
        }
        mej mejVar2 = new mej(mo134799H(), mo134798G());
        this.f109305x = mejVar2;
        mejVar2.m158028f(this.f109304C);
        this.f109305x.m158024b(mo134799H(), mo134798G());
        int iGlCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (iGlCheckFramebufferStatus != 36053) {
            if (!this.f109304C) {
                StringBuilder sb = new StringBuilder();
                sb.append(this);
                muf.m160142a(sb, iGlCheckFramebufferStatus, GLES20.glGetError());
                return;
            }
            mej mejVar3 = this.f109305x;
            if (mejVar3 != null) {
                mejVar3.m158025c();
            }
            mej mejVar4 = new mej(mo134799H(), mo134798G());
            this.f109305x = mejVar4;
            this.f109304C = false;
            mejVar4.m158028f(false);
            this.f109305x.m158024b(mo134799H(), mo134798G());
            int iGlCheckFramebufferStatus2 = GLES20.glCheckFramebufferStatus(36160);
            if (iGlCheckFramebufferStatus2 == 36053) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this);
            muf.m160142a(sb2, iGlCheckFramebufferStatus2, GLES20.glGetError());
        }
    }

    /* JADX INFO: renamed from: L */
    public void m134802L() {
        this.f109302A = true;
    }

    /* JADX INFO: renamed from: M */
    public void m134803M(efj efjVar) {
        synchronized (this.f109307z) {
            this.f109306y.remove(efjVar);
        }
    }

    /* JADX INFO: renamed from: N */
    public void m134804N() {
        mej mejVar = this.f109305x;
        if (mejVar != null) {
            mejVar.m158029g();
        }
    }

    @Override // p153l.xej
    /* JADX INFO: renamed from: f */
    public void mo96080f() {
        super.mo96080f();
        mej mejVar = this.f109305x;
        if (mejVar != null) {
            mejVar.m158025c();
            this.f109305x = null;
        }
    }

    @Override // p153l.xej
    /* JADX INFO: renamed from: h */
    public void mo134805h() {
        boolean z;
        mej mejVar;
        System.currentTimeMillis();
        if (this.f109305x == null) {
            if (m210702r() == 0 || m210701n() == 0) {
                return;
            } else {
                mo96077K();
            }
        }
        mej mejVar2 = this.f109305x;
        if (mejVar2 != null && mejVar2.m158026d() == null) {
            if (m210702r() == 0 || m210701n() == 0) {
                return;
            } else {
                mo96077K();
            }
        }
        if (this.f109302A) {
            GLES20.glBindFramebuffer(36160, this.f109305x.m158026d()[0]);
            GLES20.glClearColor(m210700l(), m210699k(), m210698j(), m210697i());
            GLES20.glClear(16640);
            mo134797F();
            GLES20.glBindFramebuffer(36160, 0);
            z = true;
        } else {
            z = false;
        }
        System.currentTimeMillis();
        synchronized (this.f109307z) {
            try {
                for (efj efjVar : this.f109306y) {
                    if (efjVar != null && (mejVar = this.f109305x) != null) {
                        efjVar.mo96079c(mejVar.m158027e()[0], this, z);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.xej
    /* JADX INFO: renamed from: s */
    public void mo134806s() {
        mo96077K();
    }
}
