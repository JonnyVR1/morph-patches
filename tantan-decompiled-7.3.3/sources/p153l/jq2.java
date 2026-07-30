package p153l;

import com.tantanapp.putong.module.Module;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes12.dex */
public abstract class jq2 {

    /* JADX INFO: renamed from: a */
    public boolean f122176a = false;

    /* JADX INFO: renamed from: b */
    public boolean f122177b = false;

    /* JADX INFO: renamed from: c */
    public boolean f122178c = false;

    /* JADX INFO: renamed from: d */
    public boolean f122179d = false;

    /* JADX INFO: renamed from: a */
    public void m146538a() {
        if (mo34282g() != null) {
            mo34282g().mo30909Ai();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m146539b() {
        if (mo34282g() == null || this.f122177b) {
            return;
        }
        mo34282g().mo29136Qh();
        this.f122177b = true;
    }

    /* JADX INFO: renamed from: c */
    public void m146540c(boolean z) {
        if (mo34282g() != null) {
            mo34282g().mo29139tr(z);
            this.f122179d = true;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m146541d() {
        if (mo34282g() != null) {
            mo34282g().mo30910Wn();
        }
    }

    /* JADX INFO: renamed from: e */
    public void m146542e() {
        if (mo34282g() == null || this.f122176a) {
            return;
        }
        mo34282g().mo29133Ec();
        this.f122176a = true;
    }

    /* JADX INFO: renamed from: f */
    public void m146543f() {
        if (mo34282g() != null) {
            mo34282g().mo29135Ma();
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract Module mo34282g();

    /* JADX INFO: renamed from: h */
    public void m146544h() {
        mum.m160228d().m160233g(this);
    }

    /* JADX INFO: renamed from: i */
    public void m146545i() {
        if (mo34282g() == null || this.f122178c) {
            return;
        }
        mo34282g().mo30938zf();
        this.f122178c = true;
    }

    /* JADX INFO: renamed from: j */
    public void m146546j() {
        if (mo34282g() != null) {
            mo34282g().onLowMemory();
        }
    }

    /* JADX INFO: renamed from: k */
    public void m146547k() {
        if (mo34282g() == null || !this.f122179d) {
            return;
        }
        this.f122179d = false;
        mo34282g().mo29138ms();
    }

    /* JADX INFO: renamed from: l */
    public void m146548l(int i) {
        if (mo34282g() != null) {
            mo34282g().onTrimMemory(i);
        }
    }

    /* JADX INFO: renamed from: m */
    public C22421c<uxj0> m146549m() {
        return mo34282g() != null ? mo34282g().mo29137ft() : C22421c.just(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: n */
    public C22421c<uxj0> m146550n() {
        return mo34282g() != null ? mo34282g().mo29134Jh() : C22421c.just(uxj0.f181467a);
    }
}
