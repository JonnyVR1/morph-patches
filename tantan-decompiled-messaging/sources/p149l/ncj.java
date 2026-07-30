package p149l;

import android.opengl.GLES20;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ncj extends dcj {

    /* JADX INFO: renamed from: A */
    protected boolean f138172A;

    /* JADX INFO: renamed from: x */
    public sbj f138175x;

    /* JADX INFO: renamed from: z */
    protected Object f138177z = new Object();

    /* JADX INFO: renamed from: C */
    protected boolean f138174C = false;

    /* JADX INFO: renamed from: y */
    protected List<kcj> f138176y = new ArrayList();

    /* JADX INFO: renamed from: B */
    private String f138173B = toString();

    /* JADX INFO: renamed from: E */
    private void m158944E() {
        super.mo110696h();
    }

    /* JADX INFO: renamed from: C */
    public synchronized void m158945C(kcj kcjVar) {
        synchronized (this.f138177z) {
            List<kcj> list = this.f138176y;
            if (list == null || !list.contains(kcjVar)) {
                this.f138176y.add(kcjVar);
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public void m158946D() {
        synchronized (this.f138177z) {
            try {
                this.f138176y.clear();
                sbj sbjVar = this.f138175x;
                if (sbjVar != null) {
                    sbjVar.m183223c();
                    this.f138175x = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: F */
    public void mo118663F() {
        m158944E();
    }

    /* JADX INFO: renamed from: G */
    public int mo116914G() {
        return m110701n();
    }

    /* JADX INFO: renamed from: H */
    public int mo116915H() {
        return m110705r();
    }

    /* JADX INFO: renamed from: I */
    public Object m158947I() {
        return this.f138177z;
    }

    /* JADX INFO: renamed from: J */
    public List<kcj> m158948J() {
        return this.f138176y;
    }

    /* JADX INFO: renamed from: K */
    public void mo158949K() {
        sbj sbjVar = this.f138175x;
        if (sbjVar != null) {
            sbjVar.m183223c();
        }
        sbj sbjVar2 = new sbj(mo116915H(), mo116914G());
        this.f138175x = sbjVar2;
        sbjVar2.m183226f(this.f138174C);
        this.f138175x.m183222b(mo116915H(), mo116914G());
        int iGlCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (iGlCheckFramebufferStatus != 36053) {
            if (!this.f138174C) {
                StringBuilder sb = new StringBuilder();
                sb.append(this);
                ysf.m215904a(sb, iGlCheckFramebufferStatus, GLES20.glGetError());
                return;
            }
            sbj sbjVar3 = this.f138175x;
            if (sbjVar3 != null) {
                sbjVar3.m183223c();
            }
            sbj sbjVar4 = new sbj(mo116915H(), mo116914G());
            this.f138175x = sbjVar4;
            this.f138174C = false;
            sbjVar4.m183226f(false);
            this.f138175x.m183222b(mo116915H(), mo116914G());
            int iGlCheckFramebufferStatus2 = GLES20.glCheckFramebufferStatus(36160);
            if (iGlCheckFramebufferStatus2 == 36053) {
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this);
            ysf.m215904a(sb2, iGlCheckFramebufferStatus2, GLES20.glGetError());
        }
    }

    /* JADX INFO: renamed from: L */
    public void m158950L() {
        this.f138172A = true;
    }

    /* JADX INFO: renamed from: M */
    public void m158951M(kcj kcjVar) {
        synchronized (this.f138177z) {
            this.f138176y.remove(kcjVar);
        }
    }

    /* JADX INFO: renamed from: N */
    public void m158952N() {
        sbj sbjVar = this.f138175x;
        if (sbjVar != null) {
            sbjVar.m183227g();
        }
    }

    @Override // p149l.dcj
    /* JADX INFO: renamed from: f */
    public void mo102038f() {
        super.mo102038f();
        sbj sbjVar = this.f138175x;
        if (sbjVar != null) {
            sbjVar.m183223c();
            this.f138175x = null;
        }
    }

    @Override // p149l.dcj
    /* JADX INFO: renamed from: h */
    public void mo110696h() {
        boolean z;
        sbj sbjVar;
        System.currentTimeMillis();
        if (this.f138175x == null) {
            if (m110705r() == 0 || m110701n() == 0) {
                return;
            } else {
                mo158949K();
            }
        }
        sbj sbjVar2 = this.f138175x;
        if (sbjVar2 != null && sbjVar2.m183224d() == null) {
            if (m110705r() == 0 || m110701n() == 0) {
                return;
            } else {
                mo158949K();
            }
        }
        if (this.f138172A) {
            GLES20.glBindFramebuffer(36160, this.f138175x.m183224d()[0]);
            GLES20.glClearColor(m110700l(), m110699k(), m110698j(), m110697i());
            GLES20.glClear(16640);
            mo118663F();
            GLES20.glBindFramebuffer(36160, 0);
            z = true;
        } else {
            z = false;
        }
        System.currentTimeMillis();
        synchronized (this.f138177z) {
            try {
                for (kcj kcjVar : this.f138176y) {
                    if (kcjVar != null && (sbjVar = this.f138175x) != null) {
                        kcjVar.mo102037c(sbjVar.m183225e()[0], this, z);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.dcj
    /* JADX INFO: renamed from: s */
    public void mo110706s() {
        mo158949K();
    }
}
