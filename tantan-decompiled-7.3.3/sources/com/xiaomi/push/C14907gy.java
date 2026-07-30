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

/* JADX INFO: renamed from: com.xiaomi.push.gy */
/* JADX INFO: loaded from: classes2.dex */
public class C14907gy implements InterfaceC14925hq<C14907gy, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public List<C14896gn> f63131a;

    /* JADX INFO: renamed from: a */
    private static final z3r0 f63130a = new z3r0("XmPushActionCollectData");

    /* JADX INFO: renamed from: a */
    private static final m3r0 f63129a = new m3r0("", (byte) 15, 1);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14907gy c14907gy) {
        int iM148148g;
        if (!getClass().equals(c14907gy.getClass())) {
            return getClass().getName().compareTo(c14907gy.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m87018a()).compareTo(Boolean.valueOf(c14907gy.m87018a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (!m87018a() || (iM148148g = k3r0.m148148g(this.f63131a, c14907gy.f63131a)) == 0) {
            return 0;
        }
        return iM148148g;
    }

    @Override // com.xiaomi.push.InterfaceC14925hq
    /* JADX INFO: renamed from: b */
    public void mo86711b(w3r0 w3r0Var) throws C14929ib {
        m87017a();
        w3r0Var.mo87408v(f63130a);
        if (this.f63131a != null) {
            w3r0Var.mo87405s(f63129a);
            w3r0Var.mo87406t(new n3r0((byte) 12, this.f63131a.size()));
            Iterator<C14896gn> it = this.f63131a.iterator();
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
        if (obj != null && (obj instanceof C14907gy)) {
            return m87019a((C14907gy) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("XmPushActionCollectData(dataCollectionItems:");
        List<C14896gn> list = this.f63131a;
        if (list == null) {
            sb.append("null");
        } else {
            sb.append(list);
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public boolean m87018a() {
        return this.f63131a != null;
    }

    /* JADX INFO: renamed from: a */
    public boolean m87019a(C14907gy c14907gy) {
        if (c14907gy == null) {
            return false;
        }
        boolean zM87018a = m87018a();
        boolean zM87018a2 = c14907gy.m87018a();
        if (zM87018a || zM87018a2) {
            return zM87018a && zM87018a2 && this.f63131a.equals(c14907gy.f63131a);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public C14907gy m87016a(List<C14896gn> list) {
        this.f63131a = list;
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
                w3r0Var.mo87379D();
                m87017a();
                return;
            }
            if (m3r0VarMo87393g.f134701c != 1) {
                x3r0.m209259a(w3r0Var, b);
            } else if (b == 15) {
                n3r0 n3r0VarMo87394h = w3r0Var.mo87394h();
                this.f63131a = new ArrayList(n3r0VarMo87394h.f140033b);
                for (int i = 0; i < n3r0VarMo87394h.f140033b; i++) {
                    C14896gn c14896gn = new C14896gn();
                    c14896gn.mo86705a(w3r0Var);
                    this.f63131a.add(c14896gn);
                }
                w3r0Var.mo87382G();
            } else {
                x3r0.m209259a(w3r0Var, b);
            }
            w3r0Var.mo87380E();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m87017a() throws C14929ib {
        if (this.f63131a != null) {
            return;
        }
        throw new C14929ib("Required field 'dataCollectionItems' was not present! Struct: " + toString());
    }
}
