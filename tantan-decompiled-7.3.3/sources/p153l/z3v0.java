package p153l;

import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes6.dex */
public final class z3v0 implements lvw0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ a4v0 f202866a;

    public z3v0(a4v0 a4v0Var) {
        this.f202866a = a4v0Var;
    }

    @Override // p153l.lvw0
    public final void zza(Throwable th) {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168351j6)).booleanValue()) {
            Matcher matcher = a4v0.f68446h.matcher(th.getMessage());
            if (matcher.matches()) {
                this.f202866a.f68451e.m195140i(Integer.parseInt(matcher.group(1)));
            }
        }
    }

    @Override // p153l.lvw0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        b7w0 b7w0Var = (b7w0) obj;
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168351j6)).booleanValue()) {
            this.f202866a.f68451e.m195140i(b7w0Var.f75343b.f68854b.f172371e);
            this.f202866a.f68451e.m195141j(b7w0Var.f75343b.f68854b.f172372f);
        }
    }
}
