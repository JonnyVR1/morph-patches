package p149l;

import com.tantanapp.putong.module.Module;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes13.dex */
public abstract class sp2 {

    /* JADX INFO: renamed from: a */
    public boolean f165743a = false;

    /* JADX INFO: renamed from: b */
    public boolean f165744b = false;

    /* JADX INFO: renamed from: c */
    public boolean f165745c = false;

    /* JADX INFO: renamed from: d */
    public boolean f165746d = false;

    /* JADX INFO: renamed from: a */
    public void m185313a() {
        if (mo33279g() != null) {
            mo33279g().mo29911Ai();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m185314b() {
        if (mo33279g() == null || this.f165744b) {
            return;
        }
        mo33279g().mo28137Qh();
        this.f165744b = true;
    }

    /* JADX INFO: renamed from: c */
    public void m185315c(boolean z) {
        if (mo33279g() != null) {
            mo33279g().mo28140tr(z);
            this.f165746d = true;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m185316d() {
        if (mo33279g() != null) {
            mo33279g().mo29912Wn();
        }
    }

    /* JADX INFO: renamed from: e */
    public void m185317e() {
        if (mo33279g() == null || this.f165743a) {
            return;
        }
        mo33279g().mo28134Ec();
        this.f165743a = true;
    }

    /* JADX INFO: renamed from: f */
    public void m185318f() {
        if (mo33279g() != null) {
            mo33279g().mo28136Ma();
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract Module mo33279g();

    /* JADX INFO: renamed from: h */
    public void m185319h() {
        ksm.m147096d().m147101g(this);
    }

    /* JADX INFO: renamed from: i */
    public void m185320i() {
        if (mo33279g() == null || this.f165745c) {
            return;
        }
        mo33279g().mo29940zf();
        this.f165745c = true;
    }

    /* JADX INFO: renamed from: j */
    public void m185321j() {
        if (mo33279g() != null) {
            mo33279g().onLowMemory();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m185322k() {
        if (mo33279g() == null || !this.f165746d) {
            return;
        }
        this.f165746d = false;
        mo33279g().mo28139ms();
    }

    /* JADX INFO: renamed from: l */
    public void m185323l(int i) {
        if (mo33279g() != null) {
            mo33279g().onTrimMemory(i);
        }
    }

    /* JADX INFO: renamed from: m */
    public C22306c<roj0> m185324m() {
        return mo33279g() != null ? mo33279g().mo28138ft() : C22306c.just(roj0.f160388a);
    }

    /* JADX INFO: renamed from: n */
    public C22306c<roj0> m185325n() {
        return mo33279g() != null ? mo33279g().mo28135Jh() : C22306c.just(roj0.f160388a);
    }
}
