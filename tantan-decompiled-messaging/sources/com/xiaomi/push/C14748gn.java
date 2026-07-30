package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import p149l.euq0;
import p149l.guq0;
import p149l.quq0;
import p149l.ruq0;
import p149l.tuq0;

/* JADX INFO: renamed from: com.xiaomi.push.gn */
/* JADX INFO: loaded from: classes2.dex */
public class C14748gn implements InterfaceC14777hq<C14748gn, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public long f62036a;

    /* JADX INFO: renamed from: a */
    public EnumC14742gh f62037a;

    /* JADX INFO: renamed from: a */
    public String f62038a;

    /* JADX INFO: renamed from: a */
    private BitSet f62039a = new BitSet(1);

    /* JADX INFO: renamed from: a */
    private static final tuq0 f62033a = new tuq0("DataCollectionItem");

    /* JADX INFO: renamed from: a */
    private static final guq0 f62032a = new guq0("", (byte) 10, 1);

    /* JADX INFO: renamed from: b */
    private static final guq0 f62034b = new guq0("", (byte) 8, 2);

    /* JADX INFO: renamed from: c */
    private static final guq0 f62035c = new guq0("", (byte) 11, 3);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14748gn c14748gn) {
        int iM118194e;
        int iM118193d;
        int iM118192c;
        if (!getClass().equals(c14748gn.getClass())) {
            return getClass().getName().compareTo(c14748gn.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m85657a()).compareTo(Boolean.valueOf(c14748gn.m85657a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m85657a() && (iM118192c = euq0.m118192c(this.f62036a, c14748gn.f62036a)) != 0) {
            return iM118192c;
        }
        int iCompareTo2 = Boolean.valueOf(m85659b()).compareTo(Boolean.valueOf(c14748gn.m85659b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m85659b() && (iM118193d = euq0.m118193d(this.f62037a, c14748gn.f62037a)) != 0) {
            return iM118193d;
        }
        int iCompareTo3 = Boolean.valueOf(m85660c()).compareTo(Boolean.valueOf(c14748gn.m85660c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (!m85660c() || (iM118194e = euq0.m118194e(this.f62038a, c14748gn.f62038a)) == 0) {
            return 0;
        }
        return iM118194e;
    }

    @Override // com.xiaomi.push.InterfaceC14777hq
    /* JADX INFO: renamed from: b */
    public void mo85540b(quq0 quq0Var) throws C14781ib {
        m85655a();
        quq0Var.mo86237v(f62033a);
        quq0Var.mo86234s(f62032a);
        quq0Var.mo86231p(this.f62036a);
        quq0Var.mo86241z();
        if (this.f62037a != null) {
            quq0Var.mo86234s(f62034b);
            quq0Var.mo86230o(this.f62037a.m85603a());
            quq0Var.mo86241z();
        }
        if (this.f62038a != null) {
            quq0Var.mo86234s(f62035c);
            quq0Var.mo86232q(this.f62038a);
            quq0Var.mo86241z();
        }
        quq0Var.mo86205A();
        quq0Var.mo86228m();
    }

    /* JADX INFO: renamed from: c */
    public boolean m85660c() {
        return this.f62038a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C14748gn)) {
            return m85658a((C14748gn) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DataCollectionItem(collectedAt:");
        sb.append(this.f62036a);
        sb.append(", ");
        sb.append("collectionType:");
        EnumC14742gh enumC14742gh = this.f62037a;
        if (enumC14742gh == null) {
            sb.append("null");
        } else {
            sb.append(enumC14742gh);
        }
        sb.append(", ");
        sb.append("content:");
        String str = this.f62038a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public boolean m85659b() {
        return this.f62037a != null;
    }

    /* JADX INFO: renamed from: a */
    public boolean m85657a() {
        return this.f62039a.get(0);
    }

    /* JADX INFO: renamed from: a */
    public void m85656a(boolean z) {
        this.f62039a.set(0, z);
    }

    /* JADX INFO: renamed from: a */
    public C14748gn m85652a(EnumC14742gh enumC14742gh) {
        this.f62037a = enumC14742gh;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public String m85654a() {
        return this.f62038a;
    }

    /* JADX INFO: renamed from: a */
    public C14748gn m85653a(String str) {
        this.f62038a = str;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public boolean m85658a(C14748gn c14748gn) {
        if (c14748gn == null || this.f62036a != c14748gn.f62036a) {
            return false;
        }
        boolean zM85659b = m85659b();
        boolean zM85659b2 = c14748gn.m85659b();
        if ((zM85659b || zM85659b2) && !(zM85659b && zM85659b2 && this.f62037a.equals(c14748gn.f62037a))) {
            return false;
        }
        boolean zM85660c = m85660c();
        boolean zM85660c2 = c14748gn.m85660c();
        if (zM85660c || zM85660c2) {
            return zM85660c && zM85660c2 && this.f62038a.equals(c14748gn.f62038a);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public C14748gn m85651a(long j) {
        this.f62036a = j;
        m85656a(true);
        return this;
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
                    } else if (b == 11) {
                        this.f62038a = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                } else if (b == 8) {
                    this.f62037a = EnumC14742gh.m85602a(quq0Var.mo86218c());
                } else {
                    ruq0.m181208a(quq0Var, b);
                }
            } else if (b == 10) {
                this.f62036a = quq0Var.mo86219d();
                m85656a(true);
            } else {
                ruq0.m181208a(quq0Var, b);
            }
            quq0Var.mo86209E();
        }
        quq0Var.mo86208D();
        if (m85657a()) {
            m85655a();
        } else {
            throw new C14781ib("Required field 'collectedAt' was not found in serialized data! Struct: " + toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m85655a() throws C14781ib {
        if (this.f62037a != null) {
            if (this.f62038a != null) {
                return;
            }
            throw new C14781ib("Required field 'content' was not present! Struct: " + toString());
        }
        throw new C14781ib("Required field 'collectionType' was not present! Struct: " + toString());
    }
}
