package p153l;

import androidx.annotation.Nullable;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes6.dex */
public final class haw0 {

    /* JADX INFO: renamed from: a */
    public final h9w0 f108532a;

    /* JADX INFO: renamed from: b */
    public final faw0 f108533b;

    /* JADX INFO: renamed from: c */
    public final d9w0 f108534c;

    /* JADX INFO: renamed from: e */
    public naw0 f108536e;

    /* JADX INFO: renamed from: f */
    public int f108537f = 1;

    /* JADX INFO: renamed from: d */
    public final ArrayDeque f108535d = new ArrayDeque();

    public haw0(h9w0 h9w0Var, d9w0 d9w0Var, faw0 faw0Var) {
        this.f108532a = h9w0Var;
        this.f108534c = d9w0Var;
        this.f108533b = faw0Var;
        d9w0Var.m115100b(new caw0(this));
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public final synchronized hpr m134325a(gaw0 gaw0Var) {
        this.f108537f = 2;
        if (m134329i()) {
            return null;
        }
        return this.f108536e.m162101a(gaw0Var);
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m134326e(gaw0 gaw0Var) {
        this.f108535d.add(gaw0Var);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m134327f() {
        synchronized (this) {
            this.f108537f = 1;
            m134328h();
        }
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m134328h() {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168429p6)).booleanValue() && !bxy0.m106933q().m120264i().zzh().m214930h()) {
            this.f108535d.clear();
            return;
        }
        if (m134329i()) {
            while (!this.f108535d.isEmpty()) {
                gaw0 gaw0Var = (gaw0) this.f108535d.pollFirst();
                if (gaw0Var == null || (gaw0Var.zza() != null && this.f108532a.mo134089c(gaw0Var.zza()))) {
                    naw0 naw0Var = new naw0(this.f108532a, this.f108533b, gaw0Var);
                    this.f108536e = naw0Var;
                    naw0Var.m162104d(new daw0(this, gaw0Var));
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final synchronized boolean m134329i() {
        return this.f108536e == null;
    }
}
