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

/* JADX INFO: renamed from: com.xiaomi.push.hd */
/* JADX INFO: loaded from: classes2.dex */
public class C14913hd implements InterfaceC14925hq<C14913hd, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public List<C14897go> f63207a;

    /* JADX INFO: renamed from: a */
    private static final z3r0 f63206a = new z3r0("XmPushActionNormalConfig");

    /* JADX INFO: renamed from: a */
    private static final m3r0 f63205a = new m3r0("", (byte) 15, 1);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14913hd c14913hd) {
        int iM148148g;
        if (!getClass().equals(c14913hd.getClass())) {
            return getClass().getName().compareTo(c14913hd.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m87110a()).compareTo(Boolean.valueOf(c14913hd.m87110a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (!m87110a() || (iM148148g = k3r0.m148148g(this.f63207a, c14913hd.f63207a)) == 0) {
            return 0;
        }
        return iM148148g;
    }

    @Override // com.xiaomi.push.InterfaceC14925hq
    /* JADX INFO: renamed from: b */
    public void mo86711b(w3r0 w3r0Var) throws C14929ib {
        m87109a();
        w3r0Var.mo87408v(f63206a);
        if (this.f63207a != null) {
            w3r0Var.mo87405s(f63205a);
            w3r0Var.mo87406t(new n3r0((byte) 12, this.f63207a.size()));
            Iterator<C14897go> it = this.f63207a.iterator();
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
        if (obj != null && (obj instanceof C14913hd)) {
            return m87111a((C14913hd) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("XmPushActionNormalConfig(normalConfigs:");
        List<C14897go> list = this.f63207a;
        if (list == null) {
            sb.append("null");
        } else {
            sb.append(list);
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public boolean m87110a() {
        return this.f63207a != null;
    }

    /* JADX INFO: renamed from: a */
    public boolean m87111a(C14913hd c14913hd) {
        if (c14913hd == null) {
            return false;
        }
        boolean zM87110a = m87110a();
        boolean zM87110a2 = c14913hd.m87110a();
        if (zM87110a || zM87110a2) {
            return zM87110a && zM87110a2 && this.f63207a.equals(c14913hd.f63207a);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public List<C14897go> m87108a() {
        return this.f63207a;
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
                m87109a();
                return;
            }
            if (m3r0VarMo87393g.f134701c != 1) {
                x3r0.m209259a(w3r0Var, b);
            } else if (b == 15) {
                n3r0 n3r0VarMo87394h = w3r0Var.mo87394h();
                this.f63207a = new ArrayList(n3r0VarMo87394h.f140033b);
                for (int i = 0; i < n3r0VarMo87394h.f140033b; i++) {
                    C14897go c14897go = new C14897go();
                    c14897go.mo86705a(w3r0Var);
                    this.f63207a.add(c14897go);
                }
                w3r0Var.mo87382G();
            } else {
                x3r0.m209259a(w3r0Var, b);
            }
            w3r0Var.mo87380E();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m87109a() throws C14929ib {
        if (this.f63207a != null) {
            return;
        }
        throw new C14929ib("Required field 'normalConfigs' was not present! Struct: " + toString());
    }
}
