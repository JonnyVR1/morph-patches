package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import p153l.k3r0;
import p153l.m3r0;
import p153l.n3r0;
import p153l.w3r0;
import p153l.x3r0;
import p153l.z3r0;

/* JADX INFO: renamed from: com.xiaomi.push.go */
/* JADX INFO: loaded from: classes2.dex */
public class C14897go implements InterfaceC14925hq<C14897go, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public int f62891a;

    /* JADX INFO: renamed from: a */
    public EnumC14894gl f62892a;

    /* JADX INFO: renamed from: a */
    private BitSet f62893a = new BitSet(1);

    /* JADX INFO: renamed from: a */
    public List<C14899gq> f62894a;

    /* JADX INFO: renamed from: a */
    private static final z3r0 f62888a = new z3r0("NormalConfig");

    /* JADX INFO: renamed from: a */
    private static final m3r0 f62887a = new m3r0("", (byte) 8, 1);

    /* JADX INFO: renamed from: b */
    private static final m3r0 f62889b = new m3r0("", (byte) 15, 2);

    /* JADX INFO: renamed from: c */
    private static final m3r0 f62890c = new m3r0("", (byte) 8, 3);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14897go c14897go) {
        int iM148145d;
        int iM148148g;
        int iM148143b;
        if (!getClass().equals(c14897go.getClass())) {
            return getClass().getName().compareTo(c14897go.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m86837a()).compareTo(Boolean.valueOf(c14897go.m86837a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m86837a() && (iM148143b = k3r0.m148143b(this.f62891a, c14897go.f62891a)) != 0) {
            return iM148143b;
        }
        int iCompareTo2 = Boolean.valueOf(m86839b()).compareTo(Boolean.valueOf(c14897go.m86839b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m86839b() && (iM148148g = k3r0.m148148g(this.f62894a, c14897go.f62894a)) != 0) {
            return iM148148g;
        }
        int iCompareTo3 = Boolean.valueOf(m86840c()).compareTo(Boolean.valueOf(c14897go.m86840c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (!m86840c() || (iM148145d = k3r0.m148145d(this.f62892a, c14897go.f62892a)) == 0) {
            return 0;
        }
        return iM148145d;
    }

    @Override // com.xiaomi.push.InterfaceC14925hq
    /* JADX INFO: renamed from: b */
    public void mo86711b(w3r0 w3r0Var) throws C14929ib {
        m86835a();
        w3r0Var.mo87408v(f62888a);
        w3r0Var.mo87405s(f62887a);
        w3r0Var.mo87401o(this.f62891a);
        w3r0Var.mo87412z();
        if (this.f62894a != null) {
            w3r0Var.mo87405s(f62889b);
            w3r0Var.mo87406t(new n3r0((byte) 12, this.f62894a.size()));
            Iterator<C14899gq> it = this.f62894a.iterator();
            while (it.hasNext()) {
                it.next().mo86711b(w3r0Var);
            }
            w3r0Var.mo87378C();
            w3r0Var.mo87412z();
        }
        if (this.f62892a != null && m86840c()) {
            w3r0Var.mo87405s(f62890c);
            w3r0Var.mo87401o(this.f62892a.m86819a());
            w3r0Var.mo87412z();
        }
        w3r0Var.mo87376A();
        w3r0Var.mo87399m();
    }

    /* JADX INFO: renamed from: c */
    public boolean m86840c() {
        return this.f62892a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C14897go)) {
            return m86838a((C14897go) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NormalConfig(version:");
        sb.append(this.f62891a);
        sb.append(", ");
        sb.append("configItems:");
        List<C14899gq> list = this.f62894a;
        if (list == null) {
            sb.append("null");
        } else {
            sb.append(list);
        }
        if (m86840c()) {
            sb.append(", ");
            sb.append("type:");
            EnumC14894gl enumC14894gl = this.f62892a;
            if (enumC14894gl == null) {
                sb.append("null");
            } else {
                sb.append(enumC14894gl);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public boolean m86839b() {
        return this.f62894a != null;
    }

    /* JADX INFO: renamed from: a */
    public boolean m86837a() {
        return this.f62893a.get(0);
    }

    /* JADX INFO: renamed from: a */
    public void m86836a(boolean z) {
        this.f62893a.set(0, z);
    }

    /* JADX INFO: renamed from: a */
    public EnumC14894gl m86834a() {
        return this.f62892a;
    }

    /* JADX INFO: renamed from: a */
    public boolean m86838a(C14897go c14897go) {
        if (c14897go == null || this.f62891a != c14897go.f62891a) {
            return false;
        }
        boolean zM86839b = m86839b();
        boolean zM86839b2 = c14897go.m86839b();
        if ((zM86839b || zM86839b2) && !(zM86839b && zM86839b2 && this.f62894a.equals(c14897go.f62894a))) {
            return false;
        }
        boolean zM86840c = m86840c();
        boolean zM86840c2 = c14897go.m86840c();
        if (zM86840c || zM86840c2) {
            return zM86840c && zM86840c2 && this.f62892a.equals(c14897go.f62892a);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public int m86832a() {
        return this.f62891a;
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
                    } else if (b == 8) {
                        this.f62892a = EnumC14894gl.m86818a(w3r0Var.mo87389c());
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                } else if (b == 15) {
                    n3r0 n3r0VarMo87394h = w3r0Var.mo87394h();
                    this.f62894a = new ArrayList(n3r0VarMo87394h.f140033b);
                    for (int i = 0; i < n3r0VarMo87394h.f140033b; i++) {
                        C14899gq c14899gq = new C14899gq();
                        c14899gq.mo86705a(w3r0Var);
                        this.f62894a.add(c14899gq);
                    }
                    w3r0Var.mo87382G();
                } else {
                    x3r0.m209259a(w3r0Var, b);
                }
            } else if (b == 8) {
                this.f62891a = w3r0Var.mo87389c();
                m86836a(true);
            } else {
                x3r0.m209259a(w3r0Var, b);
            }
            w3r0Var.mo87380E();
        }
        w3r0Var.mo87379D();
        if (m86837a()) {
            m86835a();
        } else {
            throw new C14929ib("Required field 'version' was not found in serialized data! Struct: " + toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m86835a() throws C14929ib {
        if (this.f62894a != null) {
            return;
        }
        throw new C14929ib("Required field 'configItems' was not present! Struct: " + toString());
    }
}
