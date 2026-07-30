package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import p149l.euq0;
import p149l.guq0;
import p149l.huq0;
import p149l.quq0;
import p149l.ruq0;
import p149l.tuq0;

/* JADX INFO: renamed from: com.xiaomi.push.go */
/* JADX INFO: loaded from: classes2.dex */
public class C14749go implements InterfaceC14777hq<C14749go, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public int f62044a;

    /* JADX INFO: renamed from: a */
    public EnumC14746gl f62045a;

    /* JADX INFO: renamed from: a */
    private BitSet f62046a = new BitSet(1);

    /* JADX INFO: renamed from: a */
    public List<C14751gq> f62047a;

    /* JADX INFO: renamed from: a */
    private static final tuq0 f62041a = new tuq0("NormalConfig");

    /* JADX INFO: renamed from: a */
    private static final guq0 f62040a = new guq0("", (byte) 8, 1);

    /* JADX INFO: renamed from: b */
    private static final guq0 f62042b = new guq0("", (byte) 15, 2);

    /* JADX INFO: renamed from: c */
    private static final guq0 f62043c = new guq0("", (byte) 8, 3);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14749go c14749go) {
        int iM118193d;
        int iM118196g;
        int iM118191b;
        if (!getClass().equals(c14749go.getClass())) {
            return getClass().getName().compareTo(c14749go.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m85666a()).compareTo(Boolean.valueOf(c14749go.m85666a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m85666a() && (iM118191b = euq0.m118191b(this.f62044a, c14749go.f62044a)) != 0) {
            return iM118191b;
        }
        int iCompareTo2 = Boolean.valueOf(m85668b()).compareTo(Boolean.valueOf(c14749go.m85668b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m85668b() && (iM118196g = euq0.m118196g(this.f62047a, c14749go.f62047a)) != 0) {
            return iM118196g;
        }
        int iCompareTo3 = Boolean.valueOf(m85669c()).compareTo(Boolean.valueOf(c14749go.m85669c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (!m85669c() || (iM118193d = euq0.m118193d(this.f62045a, c14749go.f62045a)) == 0) {
            return 0;
        }
        return iM118193d;
    }

    @Override // com.xiaomi.push.InterfaceC14777hq
    /* JADX INFO: renamed from: b */
    public void mo85540b(quq0 quq0Var) throws C14781ib {
        m85664a();
        quq0Var.mo86237v(f62041a);
        quq0Var.mo86234s(f62040a);
        quq0Var.mo86230o(this.f62044a);
        quq0Var.mo86241z();
        if (this.f62047a != null) {
            quq0Var.mo86234s(f62042b);
            quq0Var.mo86235t(new huq0((byte) 12, this.f62047a.size()));
            Iterator<C14751gq> it = this.f62047a.iterator();
            while (it.hasNext()) {
                it.next().mo85540b(quq0Var);
            }
            quq0Var.mo86207C();
            quq0Var.mo86241z();
        }
        if (this.f62045a != null && m85669c()) {
            quq0Var.mo86234s(f62043c);
            quq0Var.mo86230o(this.f62045a.m85648a());
            quq0Var.mo86241z();
        }
        quq0Var.mo86205A();
        quq0Var.mo86228m();
    }

    /* JADX INFO: renamed from: c */
    public boolean m85669c() {
        return this.f62045a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C14749go)) {
            return m85667a((C14749go) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NormalConfig(version:");
        sb.append(this.f62044a);
        sb.append(", ");
        sb.append("configItems:");
        List<C14751gq> list = this.f62047a;
        if (list == null) {
            sb.append("null");
        } else {
            sb.append(list);
        }
        if (m85669c()) {
            sb.append(", ");
            sb.append("type:");
            EnumC14746gl enumC14746gl = this.f62045a;
            if (enumC14746gl == null) {
                sb.append("null");
            } else {
                sb.append(enumC14746gl);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public boolean m85668b() {
        return this.f62047a != null;
    }

    /* JADX INFO: renamed from: a */
    public boolean m85666a() {
        return this.f62046a.get(0);
    }

    /* JADX INFO: renamed from: a */
    public void m85665a(boolean z) {
        this.f62046a.set(0, z);
    }

    /* JADX INFO: renamed from: a */
    public EnumC14746gl m85663a() {
        return this.f62045a;
    }

    /* JADX INFO: renamed from: a */
    public boolean m85667a(C14749go c14749go) {
        if (c14749go == null || this.f62044a != c14749go.f62044a) {
            return false;
        }
        boolean zM85668b = m85668b();
        boolean zM85668b2 = c14749go.m85668b();
        if ((zM85668b || zM85668b2) && !(zM85668b && zM85668b2 && this.f62047a.equals(c14749go.f62047a))) {
            return false;
        }
        boolean zM85669c = m85669c();
        boolean zM85669c2 = c14749go.m85669c();
        if (zM85669c || zM85669c2) {
            return zM85669c && zM85669c2 && this.f62045a.equals(c14749go.f62045a);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public int m85661a() {
        return this.f62044a;
    }

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
                    if (s != 3) {
                        ruq0.m181208a(quq0Var, b);
                    } else if (b == 8) {
                        this.f62045a = EnumC14746gl.m85647a(quq0Var.mo86218c());
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                } else if (b == 15) {
                    huq0 huq0VarMo86223h = quq0Var.mo86223h();
                    this.f62047a = new ArrayList(huq0VarMo86223h.f109582b);
                    for (int i = 0; i < huq0VarMo86223h.f109582b; i++) {
                        C14751gq c14751gq = new C14751gq();
                        c14751gq.mo85534a(quq0Var);
                        this.f62047a.add(c14751gq);
                    }
                    quq0Var.mo86211G();
                } else {
                    ruq0.m181208a(quq0Var, b);
                }
            } else if (b == 8) {
                this.f62044a = quq0Var.mo86218c();
                m85665a(true);
            } else {
                ruq0.m181208a(quq0Var, b);
            }
            quq0Var.mo86209E();
        }
        quq0Var.mo86208D();
        if (m85666a()) {
            m85664a();
        } else {
            throw new C14781ib("Required field 'version' was not found in serialized data! Struct: " + toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m85664a() throws C14781ib {
        if (this.f62047a != null) {
            return;
        }
        throw new C14781ib("Required field 'configItems' was not present! Struct: " + toString());
    }
}
