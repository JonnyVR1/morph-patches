package p153l;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class s7x0 {

    /* JADX INFO: renamed from: a */
    public final Map f166717a;

    /* JADX INFO: renamed from: b */
    public final Map f166718b;

    /* JADX INFO: renamed from: c */
    public final Map f166719c;

    /* JADX INFO: renamed from: d */
    public final Map f166720d;

    public /* synthetic */ s7x0(m7x0 m7x0Var, r7x0 r7x0Var) {
        this.f166717a = new HashMap(m7x0Var.f135133a);
        this.f166718b = new HashMap(m7x0Var.f135134b);
        this.f166719c = new HashMap(m7x0Var.f135135c);
        this.f166720d = new HashMap(m7x0Var.f135136d);
    }

    /* JADX INFO: renamed from: a */
    public final xww0 m185044a(l7x0 l7x0Var, ayw0 ayw0Var) throws GeneralSecurityException {
        o7x0 o7x0Var = new o7x0(l7x0Var.getClass(), l7x0Var.zzd(), null);
        if (this.f166718b.containsKey(o7x0Var)) {
            return ((j5x0) this.f166718b.get(o7x0Var)).mo129076a(l7x0Var, ayw0Var);
        }
        l1x0.m152514a(o7x0Var, "No Key Parser for requested key type ", " available");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final lxw0 m185045b(l7x0 l7x0Var) throws GeneralSecurityException {
        o7x0 o7x0Var = new o7x0(l7x0Var.getClass(), l7x0Var.zzd(), null);
        if (this.f166720d.containsKey(o7x0Var)) {
            return ((n6x0) this.f166720d.get(o7x0Var)).mo148587a(l7x0Var);
        }
        l1x0.m152514a(o7x0Var, "No Parameters Parser for requested key type ", " available");
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final l7x0 m185046c(xww0 xww0Var, Class cls, ayw0 ayw0Var) throws GeneralSecurityException {
        q7x0 q7x0Var = new q7x0(xww0Var.getClass(), cls, null);
        if (this.f166717a.containsKey(q7x0Var)) {
            return ((n5x0) this.f166717a.get(q7x0Var)).mo148506a(xww0Var, ayw0Var);
        }
        l1x0.m152514a(q7x0Var, "No Key serializer for ", " available");
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final l7x0 m185047d(lxw0 lxw0Var, Class cls) throws GeneralSecurityException {
        q7x0 q7x0Var = new q7x0(lxw0Var.getClass(), cls, null);
        if (this.f166719c.containsKey(q7x0Var)) {
            return ((r6x0) this.f166719c.get(q7x0Var)).mo166300a(lxw0Var);
        }
        l1x0.m152514a(q7x0Var, "No Key Format serializer for ", " available");
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m185048i(l7x0 l7x0Var) {
        return this.f166718b.containsKey(new o7x0(l7x0Var.getClass(), l7x0Var.zzd(), null));
    }

    /* JADX INFO: renamed from: j */
    public final boolean m185049j(l7x0 l7x0Var) {
        return this.f166720d.containsKey(new o7x0(l7x0Var.getClass(), l7x0Var.zzd(), null));
    }
}
