package p153l;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
public class t0q extends bzm {

    /* JADX INFO: renamed from: e */
    public AtomicBoolean f171552e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b */
    public fh3 f171549b = new fh3();

    /* JADX INFO: renamed from: c */
    public gh3 f171550c = new gh3();

    /* JADX INFO: renamed from: d */
    public woc0 f171551d = new woc0(2);

    @Override // p153l.bzm
    /* JADX INFO: renamed from: a */
    public void mo76663a(ur4 ur4Var) throws Exception {
        try {
            yc60 yc60VarM125551a = this.f171549b.m125551a(ur4Var.mo196643b());
            if (yc60VarM125551a != null) {
                ur4Var.mo196642a(yc60VarM125551a);
            }
        } catch (Exception e) {
            if (this.f171552e.compareAndSet(true, true)) {
                throw e;
            }
        }
        if (this.f171552e.get()) {
            m188823f(ur4Var.mo196643b());
            m188824g(ur4Var);
        }
    }

    @Override // p153l.bzm
    /* JADX INFO: renamed from: b */
    public void mo76664b(ur4 ur4Var) throws Exception {
        try {
            this.f171550c.m130242a(ur4Var.mo196643b(), ur4Var.mo196644c());
        } catch (Exception e) {
            if (!m107178c()) {
                throw e;
            }
            ur4Var.mo196643b().m186795m().mo204127b(e);
        }
        if (this.f171552e.compareAndSet(false, true)) {
            m188823f(ur4Var.mo196643b());
        }
    }

    @Override // p153l.bzm
    /* JADX INFO: renamed from: d */
    public void mo76666d() {
        super.mo76666d();
        this.f171552e.set(false);
    }

    /* JADX INFO: renamed from: f */
    public final void m188823f(smc0 smc0Var) {
        if (m107178c()) {
            smc0Var.m186795m().mo204126a("already release return the receive");
        } else {
            this.f171551d.m157561b().mo76672a(smc0Var);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m188824g(ur4 ur4Var) {
        if (ur4Var.call() instanceof irc0) {
            irc0 irc0Var = (irc0) ur4Var.call();
            if (m107178c()) {
                irc0Var.recycle();
            } else {
                this.f171551d.m157562c(irc0Var);
            }
        }
    }
}
