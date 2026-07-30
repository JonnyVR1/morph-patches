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

/* JADX INFO: renamed from: com.xiaomi.push.hc */
/* JADX INFO: loaded from: classes2.dex */
public class C14912hc implements InterfaceC14925hq<C14912hc, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public List<C14899gq> f63204a;

    /* JADX INFO: renamed from: a */
    private static final z3r0 f63203a = new z3r0("XmPushActionCustomConfig");

    /* JADX INFO: renamed from: a */
    private static final m3r0 f63202a = new m3r0("", (byte) 15, 1);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14912hc c14912hc) {
        int iM148148g;
        if (!getClass().equals(c14912hc.getClass())) {
            return getClass().getName().compareTo(c14912hc.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m87105a()).compareTo(Boolean.valueOf(c14912hc.m87105a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (!m87105a() || (iM148148g = k3r0.m148148g(this.f63204a, c14912hc.f63204a)) == 0) {
            return 0;
        }
        return iM148148g;
    }

    @Override // com.xiaomi.push.InterfaceC14925hq
    /* JADX INFO: renamed from: b */
    public void mo86711b(w3r0 w3r0Var) throws C14929ib {
        m87104a();
        w3r0Var.mo87408v(f63203a);
        if (this.f63204a != null) {
            w3r0Var.mo87405s(f63202a);
            w3r0Var.mo87406t(new n3r0((byte) 12, this.f63204a.size()));
            Iterator<C14899gq> it = this.f63204a.iterator();
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
        if (obj != null && (obj instanceof C14912hc)) {
            return m87106a((C14912hc) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("XmPushActionCustomConfig(customConfigs:");
        List<C14899gq> list = this.f63204a;
        if (list == null) {
            sb.append("null");
        } else {
            sb.append(list);
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: a */
    public boolean m87105a() {
        return this.f63204a != null;
    }

    /* JADX INFO: renamed from: a */
    public boolean m87106a(C14912hc c14912hc) {
        if (c14912hc == null) {
            return false;
        }
        boolean zM87105a = m87105a();
        boolean zM87105a2 = c14912hc.m87105a();
        if (zM87105a || zM87105a2) {
            return zM87105a && zM87105a2 && this.f63204a.equals(c14912hc.f63204a);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public List<C14899gq> m87103a() {
        return this.f63204a;
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
                m87104a();
                return;
            }
            if (m3r0VarMo87393g.f134701c != 1) {
                x3r0.m209259a(w3r0Var, b);
            } else if (b == 15) {
                n3r0 n3r0VarMo87394h = w3r0Var.mo87394h();
                this.f63204a = new ArrayList(n3r0VarMo87394h.f140033b);
                for (int i = 0; i < n3r0VarMo87394h.f140033b; i++) {
                    C14899gq c14899gq = new C14899gq();
                    c14899gq.mo86705a(w3r0Var);
                    this.f63204a.add(c14899gq);
                }
                w3r0Var.mo87382G();
            } else {
                x3r0.m209259a(w3r0Var, b);
            }
            w3r0Var.mo87380E();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m87104a() throws C14929ib {
        if (this.f63204a != null) {
            return;
        }
        throw new C14929ib("Required field 'customConfigs' was not present! Struct: " + toString());
    }
}
