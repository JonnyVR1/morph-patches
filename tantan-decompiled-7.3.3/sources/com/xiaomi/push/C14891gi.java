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

/* JADX INFO: renamed from: com.xiaomi.push.gi */
/* JADX INFO: loaded from: classes2.dex */
public class C14891gi implements InterfaceC14925hq<C14891gi, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public List<C14892gj> f62712a;

    /* JADX INFO: renamed from: a */
    private static final z3r0 f62711a = new z3r0("ClientUploadData");

    /* JADX INFO: renamed from: a */
    private static final m3r0 f62710a = new m3r0("", (byte) 15, 1);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14891gi c14891gi) {
        int iM148148g;
        if (!getClass().equals(c14891gi.getClass())) {
            return getClass().getName().compareTo(c14891gi.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m86779a()).compareTo(Boolean.valueOf(c14891gi.m86779a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (!m86779a() || (iM148148g = k3r0.m148148g(this.f62712a, c14891gi.f62712a)) == 0) {
            return 0;
        }
        return iM148148g;
    }

    @Override // com.xiaomi.push.InterfaceC14925hq
    /* JADX INFO: renamed from: b */
    public void mo86711b(w3r0 w3r0Var) throws C14929ib {
        m86777a();
        w3r0Var.mo87408v(f62711a);
        if (this.f62712a != null) {
            w3r0Var.mo87405s(f62710a);
            w3r0Var.mo87406t(new n3r0((byte) 12, this.f62712a.size()));
            Iterator<C14892gj> it = this.f62712a.iterator();
            while (it.hasNext()) {
                it.next().mo86711b(w3r0Var);
            }
            w3r0Var.mo87378C();
            w3r0Var.mo87412z();
        }
        w3r0Var.mo87376A();
        w3r0Var.mo87399m();
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C14891gi)) {
            return m86780a((C14891gi) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ClientUploadData(uploadDataItems:");
        List<C14892gj> list = this.f62712a;
        if (list == null) {
            sb.append("null");
        } else {
            sb.append(list);
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public void m86778a(C14892gj c14892gj) {
        if (this.f62712a == null) {
            this.f62712a = new ArrayList();
        }
        this.f62712a.add(c14892gj);
    }

    /* JADX INFO: renamed from: a */
    public boolean m86779a() {
        return this.f62712a != null;
    }

    /* JADX INFO: renamed from: a */
    public boolean m86780a(C14891gi c14891gi) {
        if (c14891gi == null) {
            return false;
        }
        boolean zM86779a = m86779a();
        boolean zM86779a2 = c14891gi.m86779a();
        if (zM86779a || zM86779a2) {
            return zM86779a && zM86779a2 && this.f62712a.equals(c14891gi.f62712a);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public int m86775a() {
        List<C14892gj> list = this.f62712a;
        if (list == null) {
            return 0;
        }
        return list.size();
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
                m86777a();
                return;
            }
            if (m3r0VarMo87393g.f134701c != 1) {
                x3r0.m209259a(w3r0Var, b);
            } else if (b == 15) {
                n3r0 n3r0VarMo87394h = w3r0Var.mo87394h();
                this.f62712a = new ArrayList(n3r0VarMo87394h.f140033b);
                for (int i = 0; i < n3r0VarMo87394h.f140033b; i++) {
                    C14892gj c14892gj = new C14892gj();
                    c14892gj.mo86705a(w3r0Var);
                    this.f62712a.add(c14892gj);
                }
                w3r0Var.mo87382G();
            } else {
                x3r0.m209259a(w3r0Var, b);
            }
            w3r0Var.mo87380E();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m86777a() throws C14929ib {
        if (this.f62712a != null) {
            return;
        }
        throw new C14929ib("Required field 'uploadDataItems' was not present! Struct: " + toString());
    }
}
