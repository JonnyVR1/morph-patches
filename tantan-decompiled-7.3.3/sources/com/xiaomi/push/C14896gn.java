package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import p153l.k3r0;
import p153l.m3r0;
import p153l.w3r0;
import p153l.x3r0;
import p153l.z3r0;

/* JADX INFO: renamed from: com.xiaomi.push.gn */
/* JADX INFO: loaded from: classes2.dex */
public class C14896gn implements InterfaceC14925hq<C14896gn, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public long f62883a;

    /* JADX INFO: renamed from: a */
    public EnumC14890gh f62884a;

    /* JADX INFO: renamed from: a */
    public String f62885a;

    /* JADX INFO: renamed from: a */
    private BitSet f62886a = new BitSet(1);

    /* JADX INFO: renamed from: a */
    private static final z3r0 f62880a = new z3r0("DataCollectionItem");

    /* JADX INFO: renamed from: a */
    private static final m3r0 f62879a = new m3r0("", (byte) 10, 1);

    /* JADX INFO: renamed from: b */
    private static final m3r0 f62881b = new m3r0("", (byte) 8, 2);

    /* JADX INFO: renamed from: c */
    private static final m3r0 f62882c = new m3r0("", (byte) 11, 3);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14896gn c14896gn) {
        int iM148146e;
        int iM148145d;
        int iM148144c;
        if (!getClass().equals(c14896gn.getClass())) {
            return getClass().getName().compareTo(c14896gn.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m86828a()).compareTo(Boolean.valueOf(c14896gn.m86828a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m86828a() && (iM148144c = k3r0.m148144c(this.f62883a, c14896gn.f62883a)) != 0) {
            return iM148144c;
        }
        int iCompareTo2 = Boolean.valueOf(m86830b()).compareTo(Boolean.valueOf(c14896gn.m86830b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m86830b() && (iM148145d = k3r0.m148145d(this.f62884a, c14896gn.f62884a)) != 0) {
            return iM148145d;
        }
        int iCompareTo3 = Boolean.valueOf(m86831c()).compareTo(Boolean.valueOf(c14896gn.m86831c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (!m86831c() || (iM148146e = k3r0.m148146e(this.f62885a, c14896gn.f62885a)) == 0) {
            return 0;
        }
        return iM148146e;
    }

    @Override // com.xiaomi.push.InterfaceC14925hq
    /* JADX INFO: renamed from: b */
    public void mo86711b(w3r0 w3r0Var) throws C14929ib {
        m86826a();
        w3r0Var.mo87408v(f62880a);
        w3r0Var.mo87405s(f62879a);
        w3r0Var.mo87402p(this.f62883a);
        w3r0Var.mo87412z();
        if (this.f62884a != null) {
            w3r0Var.mo87405s(f62881b);
            w3r0Var.mo87401o(this.f62884a.m86774a());
            w3r0Var.mo87412z();
        }
        if (this.f62885a != null) {
            w3r0Var.mo87405s(f62882c);
            w3r0Var.mo87403q(this.f62885a);
            w3r0Var.mo87412z();
        }
        w3r0Var.mo87376A();
        w3r0Var.mo87399m();
    }

    /* JADX INFO: renamed from: c */
    public boolean m86831c() {
        return this.f62885a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C14896gn)) {
            return m86829a((C14896gn) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DataCollectionItem(collectedAt:");
        sb.append(this.f62883a);
        sb.append(", ");
        sb.append("collectionType:");
        EnumC14890gh enumC14890gh = this.f62884a;
        if (enumC14890gh == null) {
            sb.append("null");
        } else {
            sb.append(enumC14890gh);
        }
        sb.append(", ");
        sb.append("content:");
        String str = this.f62885a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public boolean m86830b() {
        return this.f62884a != null;
    }

    /* JADX INFO: renamed from: a */
    public boolean m86828a() {
        return this.f62886a.get(0);
    }

    /* JADX INFO: renamed from: a */
    public void m86827a(boolean z) {
        this.f62886a.set(0, z);
    }

    /* JADX INFO: renamed from: a */
    public C14896gn m86823a(EnumC14890gh enumC14890gh) {
        this.f62884a = enumC14890gh;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public String m86825a() {
        return this.f62885a;
    }

    /* JADX INFO: renamed from: a */
    public C14896gn m86824a(String str) {
        this.f62885a = str;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public boolean m86829a(C14896gn c14896gn) {
        if (c14896gn == null || this.f62883a != c14896gn.f62883a) {
            return false;
        }
        boolean zM86830b = m86830b();
        boolean zM86830b2 = c14896gn.m86830b();
        if ((zM86830b || zM86830b2) && !(zM86830b && zM86830b2 && this.f62884a.equals(c14896gn.f62884a))) {
            return false;
        }
        boolean zM86831c = m86831c();
        boolean zM86831c2 = c14896gn.m86831c();
        if (zM86831c || zM86831c2) {
            return zM86831c && zM86831c2 && this.f62885a.equals(c14896gn.f62885a);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public C14896gn m86822a(long j) {
        this.f62883a = j;
        m86827a(true);
        return this;
    }

    @Override // com.xiaomi.push.InterfaceC14925hq
    /* JADX INFO: renamed from: a */
    public void mo86705a(w3r0 w3r0Var) throws C14929ib {
        w3r0Var.mo87397k();
        while (true) {
            m3r0 m3r0VarMo87393g = w3r0Var.mo87393g();
            byte b = m3r0VarMo87393g.f134700b;
            if (b == 0) {
                break;
            }
            short s = m3r0VarMo87393g.f134701c;
            if (s != 1) {
                if (s != 2) {
                    if (s != 3) {
                        x3r0.m209259a(w3r0Var, b);
                    } else if (b == 11) {
                        this.f62885a = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                } else if (b == 8) {
                    this.f62884a = EnumC14890gh.m86773a(w3r0Var.mo87389c());
                } else {
                    x3r0.m209259a(w3r0Var, b);
                }
            } else if (b == 10) {
                this.f62883a = w3r0Var.mo87390d();
                m86827a(true);
            } else {
                x3r0.m209259a(w3r0Var, b);
            }
            w3r0Var.mo87380E();
        }
        w3r0Var.mo87379D();
        if (m86828a()) {
            m86826a();
        } else {
            throw new C14929ib("Required field 'collectedAt' was not found in serialized data! Struct: " + toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m86826a() throws C14929ib {
        if (this.f62884a != null) {
            if (this.f62885a != null) {
                return;
            }
            throw new C14929ib("Required field 'content' was not present! Struct: " + toString());
        }
        throw new C14929ib("Required field 'collectionType' was not present! Struct: " + toString());
    }
}
