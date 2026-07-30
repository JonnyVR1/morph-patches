package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import p153l.k3r0;
import p153l.m3r0;
import p153l.w3r0;
import p153l.x3r0;
import p153l.z3r0;

/* JADX INFO: renamed from: com.xiaomi.push.gx */
/* JADX INFO: loaded from: classes2.dex */
public class C14906gx implements InterfaceC14925hq<C14906gx, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public int f63126a;

    /* JADX INFO: renamed from: a */
    private BitSet f63127a = new BitSet(2);

    /* JADX INFO: renamed from: b */
    public int f63128b;

    /* JADX INFO: renamed from: a */
    private static final z3r0 f63124a = new z3r0("XmPushActionCheckClientInfo");

    /* JADX INFO: renamed from: a */
    private static final m3r0 f63123a = new m3r0("", (byte) 8, 1);

    /* JADX INFO: renamed from: b */
    private static final m3r0 f63125b = new m3r0("", (byte) 8, 2);

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
                    x3r0.m209259a(w3r0Var, b);
                } else if (b == 8) {
                    this.f63128b = w3r0Var.mo87389c();
                    m87013b(true);
                } else {
                    x3r0.m209259a(w3r0Var, b);
                }
            } else if (b == 8) {
                this.f63126a = w3r0Var.mo87389c();
                m87009a(true);
            } else {
                x3r0.m209259a(w3r0Var, b);
            }
            w3r0Var.mo87380E();
        }
        w3r0Var.mo87379D();
        if (!m87010a()) {
            throw new C14929ib("Required field 'miscConfigVersion' was not found in serialized data! Struct: " + toString());
        }
        if (m87014b()) {
            m87008a();
        } else {
            throw new C14929ib("Required field 'pluginConfigVersion' was not found in serialized data! Struct: " + toString());
        }
    }

    @Override // com.xiaomi.push.InterfaceC14925hq
    /* JADX INFO: renamed from: b */
    public void mo86711b(w3r0 w3r0Var) {
        m87008a();
        w3r0Var.mo87408v(f63124a);
        w3r0Var.mo87405s(f63123a);
        w3r0Var.mo87401o(this.f63126a);
        w3r0Var.mo87412z();
        w3r0Var.mo87405s(f63125b);
        w3r0Var.mo87401o(this.f63128b);
        w3r0Var.mo87412z();
        w3r0Var.mo87376A();
        w3r0Var.mo87399m();
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C14906gx)) {
            return m87011a((C14906gx) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "XmPushActionCheckClientInfo(miscConfigVersion:" + this.f63126a + ", pluginConfigVersion:" + this.f63128b + ")";
    }

    /* JADX INFO: renamed from: b */
    public boolean m87014b() {
        return this.f63127a.get(1);
    }

    /* JADX INFO: renamed from: b */
    public void m87013b(boolean z) {
        this.f63127a.set(1, z);
    }

    /* JADX INFO: renamed from: b */
    public C14906gx m87012b(int i) {
        this.f63128b = i;
        m87013b(true);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C14906gx m87007a(int i) {
        this.f63126a = i;
        m87009a(true);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public boolean m87010a() {
        return this.f63127a.get(0);
    }

    /* JADX INFO: renamed from: a */
    public void m87009a(boolean z) {
        this.f63127a.set(0, z);
    }

    /* JADX INFO: renamed from: a */
    public boolean m87011a(C14906gx c14906gx) {
        return c14906gx != null && this.f63126a == c14906gx.f63126a && this.f63128b == c14906gx.f63128b;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14906gx c14906gx) {
        int iM148143b;
        int iM148143b2;
        if (!getClass().equals(c14906gx.getClass())) {
            return getClass().getName().compareTo(c14906gx.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m87010a()).compareTo(Boolean.valueOf(c14906gx.m87010a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m87010a() && (iM148143b2 = k3r0.m148143b(this.f63126a, c14906gx.f63126a)) != 0) {
            return iM148143b2;
        }
        int iCompareTo2 = Boolean.valueOf(m87014b()).compareTo(Boolean.valueOf(c14906gx.m87014b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (!m87014b() || (iM148143b = k3r0.m148143b(this.f63128b, c14906gx.f63128b)) == 0) {
            return 0;
        }
        return iM148143b;
    }

    /* JADX INFO: renamed from: a */
    public void m87008a() {
    }
}
