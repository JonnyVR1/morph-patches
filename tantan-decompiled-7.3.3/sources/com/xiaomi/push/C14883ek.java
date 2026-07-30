package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p153l.k3r0;
import p153l.m3r0;
import p153l.n3r0;
import p153l.w3r0;
import p153l.x3r0;
import p153l.z3r0;

/* JADX INFO: renamed from: com.xiaomi.push.ek */
/* JADX INFO: loaded from: classes2.dex */
public class C14883ek implements InterfaceC14925hq<C14883ek, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public String f62600a;

    /* JADX INFO: renamed from: a */
    public List<C14882ej> f62601a;

    /* JADX INFO: renamed from: b */
    public String f62602b;

    /* JADX INFO: renamed from: a */
    private static final z3r0 f62597a = new z3r0("StatsEvents");

    /* JADX INFO: renamed from: a */
    private static final m3r0 f62596a = new m3r0("", (byte) 11, 1);

    /* JADX INFO: renamed from: b */
    private static final m3r0 f62598b = new m3r0("", (byte) 11, 2);

    /* JADX INFO: renamed from: c */
    private static final m3r0 f62599c = new m3r0("", (byte) 15, 3);

    public C14883ek(String str, List<C14882ej> list) {
        this();
        this.f62600a = str;
        this.f62601a = list;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14883ek c14883ek) {
        int iM148148g;
        int iM148146e;
        int iM148146e2;
        if (!getClass().equals(c14883ek.getClass())) {
            return getClass().getName().compareTo(c14883ek.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m86733a()).compareTo(Boolean.valueOf(c14883ek.m86733a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m86733a() && (iM148146e2 = k3r0.m148146e(this.f62600a, c14883ek.f62600a)) != 0) {
            return iM148146e2;
        }
        int iCompareTo2 = Boolean.valueOf(m86735b()).compareTo(Boolean.valueOf(c14883ek.m86735b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m86735b() && (iM148146e = k3r0.m148146e(this.f62602b, c14883ek.f62602b)) != 0) {
            return iM148146e;
        }
        int iCompareTo3 = Boolean.valueOf(m86736c()).compareTo(Boolean.valueOf(c14883ek.m86736c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (!m86736c() || (iM148148g = k3r0.m148148g(this.f62601a, c14883ek.f62601a)) == 0) {
            return 0;
        }
        return iM148148g;
    }

    @Override // com.xiaomi.push.InterfaceC14925hq
    /* JADX INFO: renamed from: b */
    public void mo86711b(w3r0 w3r0Var) throws C14929ib {
        m86732a();
        w3r0Var.mo87408v(f62597a);
        if (this.f62600a != null) {
            w3r0Var.mo87405s(f62596a);
            w3r0Var.mo87403q(this.f62600a);
            w3r0Var.mo87412z();
        }
        if (this.f62602b != null && m86735b()) {
            w3r0Var.mo87405s(f62598b);
            w3r0Var.mo87403q(this.f62602b);
            w3r0Var.mo87412z();
        }
        if (this.f62601a != null) {
            w3r0Var.mo87405s(f62599c);
            w3r0Var.mo87406t(new n3r0((byte) 12, this.f62601a.size()));
            Iterator<C14882ej> it = this.f62601a.iterator();
            while (it.hasNext()) {
                it.next().mo86711b(w3r0Var);
            }
            w3r0Var.mo87378C();
            w3r0Var.mo87412z();
        }
        w3r0Var.mo87376A();
        w3r0Var.mo87399m();
    }

    /* JADX INFO: renamed from: c */
    public boolean m86736c() {
        return this.f62601a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C14883ek)) {
            return m86734a((C14883ek) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StatsEvents(uuid:");
        String str = this.f62600a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        if (m86735b()) {
            sb.append(", ");
            sb.append("operator:");
            String str2 = this.f62602b;
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(str2);
            }
        }
        sb.append(", ");
        sb.append("events:");
        List<C14882ej> list = this.f62601a;
        if (list == null) {
            sb.append("null");
        } else {
            sb.append(list);
        }
        sb.append(")");
        return sb.toString();
    }

    public C14883ek() {
    }

    /* JADX INFO: renamed from: b */
    public boolean m86735b() {
        return this.f62602b != null;
    }

    /* JADX INFO: renamed from: a */
    public C14883ek m86731a(String str) {
        this.f62602b = str;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public boolean m86734a(C14883ek c14883ek) {
        if (c14883ek == null) {
            return false;
        }
        boolean zM86733a = m86733a();
        boolean zM86733a2 = c14883ek.m86733a();
        if ((zM86733a || zM86733a2) && !(zM86733a && zM86733a2 && this.f62600a.equals(c14883ek.f62600a))) {
            return false;
        }
        boolean zM86735b = m86735b();
        boolean zM86735b2 = c14883ek.m86735b();
        if ((zM86735b || zM86735b2) && !(zM86735b && zM86735b2 && this.f62602b.equals(c14883ek.f62602b))) {
            return false;
        }
        boolean zM86736c = m86736c();
        boolean zM86736c2 = c14883ek.m86736c();
        if (zM86736c || zM86736c2) {
            return zM86736c && zM86736c2 && this.f62601a.equals(c14883ek.f62601a);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public boolean m86733a() {
        return this.f62600a != null;
    }

    @Override // com.xiaomi.push.InterfaceC14925hq
    /* JADX INFO: renamed from: a */
    public void mo86705a(w3r0 w3r0Var) throws C14929ib {
        w3r0Var.mo87397k();
        while (true) {
            m3r0 m3r0VarMo87393g = w3r0Var.mo87393g();
            byte b = m3r0VarMo87393g.f134700b;
            if (b == 0) {
                w3r0Var.mo87379D();
                m86732a();
                return;
            }
            short s = m3r0VarMo87393g.f134701c;
            if (s != 1) {
                if (s != 2) {
                    if (s != 3) {
                        x3r0.m209259a(w3r0Var, b);
                    } else if (b == 15) {
                        n3r0 n3r0VarMo87394h = w3r0Var.mo87394h();
                        this.f62601a = new ArrayList(n3r0VarMo87394h.f140033b);
                        for (int i = 0; i < n3r0VarMo87394h.f140033b; i++) {
                            C14882ej c14882ej = new C14882ej();
                            c14882ej.mo86705a(w3r0Var);
                            this.f62601a.add(c14882ej);
                        }
                        w3r0Var.mo87382G();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                } else if (b == 11) {
                    this.f62602b = w3r0Var.mo87391e();
                } else {
                    x3r0.m209259a(w3r0Var, b);
                }
            } else if (b == 11) {
                this.f62600a = w3r0Var.mo87391e();
            } else {
                x3r0.m209259a(w3r0Var, b);
            }
            w3r0Var.mo87380E();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m86732a() throws C14929ib {
        if (this.f62600a != null) {
            if (this.f62601a != null) {
                return;
            }
            throw new C14929ib("Required field 'events' was not present! Struct: " + toString());
        }
        throw new C14929ib("Required field 'uuid' was not present! Struct: " + toString());
    }
}
