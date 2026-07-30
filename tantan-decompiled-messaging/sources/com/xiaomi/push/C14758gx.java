package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import p149l.euq0;
import p149l.guq0;
import p149l.quq0;
import p149l.ruq0;
import p149l.tuq0;

/* JADX INFO: renamed from: com.xiaomi.push.gx */
/* JADX INFO: loaded from: classes2.dex */
public class C14758gx implements InterfaceC14777hq<C14758gx, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public int f62279a;

    /* JADX INFO: renamed from: a */
    private BitSet f62280a = new BitSet(2);

    /* JADX INFO: renamed from: b */
    public int f62281b;

    /* JADX INFO: renamed from: a */
    private static final tuq0 f62277a = new tuq0("XmPushActionCheckClientInfo");

    /* JADX INFO: renamed from: a */
    private static final guq0 f62276a = new guq0("", (byte) 8, 1);

    /* JADX INFO: renamed from: b */
    private static final guq0 f62278b = new guq0("", (byte) 8, 2);

    @Override // com.xiaomi.push.InterfaceC14777hq
    /* JADX INFO: renamed from: a */
    public void mo85534a(quq0 quq0Var) throws C14781ib {
        quq0Var.mo86226k();
        while (true) {
            guq0 guq0VarMo86222g = quq0Var.mo86222g();
            byte b = guq0VarMo86222g.f104457b;
            if (b == 0) {
                break;
            }
            short s = guq0VarMo86222g.f104458c;
            if (s != 1) {
                if (s != 2) {
                    ruq0.m181208a(quq0Var, b);
                } else if (b == 8) {
                    this.f62281b = quq0Var.mo86218c();
                    m85842b(true);
                } else {
                    ruq0.m181208a(quq0Var, b);
                }
            } else if (b == 8) {
                this.f62279a = quq0Var.mo86218c();
                m85838a(true);
            } else {
                ruq0.m181208a(quq0Var, b);
            }
            quq0Var.mo86209E();
        }
        quq0Var.mo86208D();
        if (!m85839a()) {
            throw new C14781ib("Required field 'miscConfigVersion' was not found in serialized data! Struct: " + toString());
        }
        if (m85843b()) {
            m85837a();
        } else {
            throw new C14781ib("Required field 'pluginConfigVersion' was not found in serialized data! Struct: " + toString());
        }
    }

    @Override // com.xiaomi.push.InterfaceC14777hq
    /* JADX INFO: renamed from: b */
    public void mo85540b(quq0 quq0Var) {
        m85837a();
        quq0Var.mo86237v(f62277a);
        quq0Var.mo86234s(f62276a);
        quq0Var.mo86230o(this.f62279a);
        quq0Var.mo86241z();
        quq0Var.mo86234s(f62278b);
        quq0Var.mo86230o(this.f62281b);
        quq0Var.mo86241z();
        quq0Var.mo86205A();
        quq0Var.mo86228m();
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C14758gx)) {
            return m85840a((C14758gx) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "XmPushActionCheckClientInfo(miscConfigVersion:" + this.f62279a + ", pluginConfigVersion:" + this.f62281b + ")";
    }

    /* JADX INFO: renamed from: b */
    public boolean m85843b() {
        return this.f62280a.get(1);
    }

    /* JADX INFO: renamed from: b */
    public void m85842b(boolean z) {
        this.f62280a.set(1, z);
    }

    /* JADX INFO: renamed from: b */
    public C14758gx m85841b(int i) {
        this.f62281b = i;
        m85842b(true);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C14758gx m85836a(int i) {
        this.f62279a = i;
        m85838a(true);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public boolean m85839a() {
        return this.f62280a.get(0);
    }

    /* JADX INFO: renamed from: a */
    public void m85838a(boolean z) {
        this.f62280a.set(0, z);
    }

    /* JADX INFO: renamed from: a */
    public boolean m85840a(C14758gx c14758gx) {
        return c14758gx != null && this.f62279a == c14758gx.f62279a && this.f62281b == c14758gx.f62281b;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14758gx c14758gx) {
        int iM118191b;
        int iM118191b2;
        if (!getClass().equals(c14758gx.getClass())) {
            return getClass().getName().compareTo(c14758gx.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m85839a()).compareTo(Boolean.valueOf(c14758gx.m85839a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m85839a() && (iM118191b2 = euq0.m118191b(this.f62279a, c14758gx.f62279a)) != 0) {
            return iM118191b2;
        }
        int iCompareTo2 = Boolean.valueOf(m85843b()).compareTo(Boolean.valueOf(c14758gx.m85843b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (!m85843b() || (iM118191b = euq0.m118191b(this.f62281b, c14758gx.f62281b)) == 0) {
            return 0;
        }
        return iM118191b;
    }

    /* JADX INFO: renamed from: a */
    public void m85837a() {
    }
}
