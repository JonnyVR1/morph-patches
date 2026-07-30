package p149l;

import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes6.dex */
public final class tuu0 implements fmw0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ uuu0 f172221a;

    public tuu0(uuu0 uuu0Var) {
        this.f172221a = uuu0Var;
    }

    @Override // p149l.fmw0
    public final void zza(Throwable th) {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132280j6)).booleanValue()) {
            Matcher matcher = uuu0.f178422h.matcher(th.getMessage());
            if (matcher.matches()) {
                this.f172221a.f178427e.m162185i(Integer.parseInt(matcher.group(1)));
            }
        }
    }

    @Override // p149l.fmw0
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        vxv0 vxv0Var = (vxv0) obj;
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132280j6)).booleanValue()) {
            this.f172221a.f178427e.m162185i(vxv0Var.f183478b.f178773b.f141058e);
            this.f172221a.f178427e.m162186j(vxv0Var.f183478b.f178773b.f141059f);
        }
    }
}
