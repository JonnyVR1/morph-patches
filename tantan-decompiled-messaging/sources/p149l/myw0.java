package p149l;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class myw0 {

    /* JADX INFO: renamed from: a */
    public final Map f136337a;

    /* JADX INFO: renamed from: b */
    public final Map f136338b;

    /* JADX INFO: renamed from: c */
    public final Map f136339c;

    /* JADX INFO: renamed from: d */
    public final Map f136340d;

    public /* synthetic */ myw0(gyw0 gyw0Var, lyw0 lyw0Var) {
        this.f136337a = new HashMap(gyw0Var.f105067a);
        this.f136338b = new HashMap(gyw0Var.f105068b);
        this.f136339c = new HashMap(gyw0Var.f105069c);
        this.f136340d = new HashMap(gyw0Var.f105070d);
    }

    /* JADX INFO: renamed from: a */
    public final rnw0 m157097a(fyw0 fyw0Var, uow0 uow0Var) throws GeneralSecurityException {
        iyw0 iyw0Var = new iyw0(fyw0Var.getClass(), fyw0Var.zzd(), null);
        if (this.f136338b.containsKey(iyw0Var)) {
            return ((dww0) this.f136338b.get(iyw0Var)).mo99329a(fyw0Var, uow0Var);
        }
        fsw0.m122984a(iyw0Var, "No Key Parser for requested key type ", " available");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final fow0 m157098b(fyw0 fyw0Var) throws GeneralSecurityException {
        iyw0 iyw0Var = new iyw0(fyw0Var.getClass(), fyw0Var.zzd(), null);
        if (this.f136340d.containsKey(iyw0Var)) {
            return ((hxw0) this.f136340d.get(iyw0Var)).mo118708a(fyw0Var);
        }
        fsw0.m122984a(iyw0Var, "No Parameters Parser for requested key type ", " available");
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final fyw0 m157099c(rnw0 rnw0Var, Class cls, uow0 uow0Var) throws GeneralSecurityException {
        kyw0 kyw0Var = new kyw0(rnw0Var.getClass(), cls, null);
        if (this.f136337a.containsKey(kyw0Var)) {
            return ((hww0) this.f136337a.get(kyw0Var)).mo118526a(rnw0Var, uow0Var);
        }
        fsw0.m122984a(kyw0Var, "No Key serializer for ", " available");
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final fyw0 m157100d(fow0 fow0Var, Class cls) throws GeneralSecurityException {
        kyw0 kyw0Var = new kyw0(fow0Var.getClass(), cls, null);
        if (this.f136339c.containsKey(kyw0Var)) {
            return ((lxw0) this.f136339c.get(kyw0Var)).mo138900a(fow0Var);
        }
        fsw0.m122984a(kyw0Var, "No Key Format serializer for ", " available");
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m157101i(fyw0 fyw0Var) {
        return this.f136338b.containsKey(new iyw0(fyw0Var.getClass(), fyw0Var.zzd(), null));
    }

    /* JADX INFO: renamed from: j */
    public final boolean m157102j(fyw0 fyw0Var) {
        return this.f136340d.containsKey(new iyw0(fyw0Var.getClass(), fyw0Var.zzd(), null));
    }
}
