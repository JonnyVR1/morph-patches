package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p149l.euq0;
import p149l.guq0;
import p149l.huq0;
import p149l.quq0;
import p149l.ruq0;
import p149l.tuq0;

/* JADX INFO: renamed from: com.xiaomi.push.ek */
/* JADX INFO: loaded from: classes2.dex */
public class C14735ek implements InterfaceC14777hq<C14735ek, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public String f61753a;

    /* JADX INFO: renamed from: a */
    public List<C14734ej> f61754a;

    /* JADX INFO: renamed from: b */
    public String f61755b;

    /* JADX INFO: renamed from: a */
    private static final tuq0 f61750a = new tuq0("StatsEvents");

    /* JADX INFO: renamed from: a */
    private static final guq0 f61749a = new guq0("", (byte) 11, 1);

    /* JADX INFO: renamed from: b */
    private static final guq0 f61751b = new guq0("", (byte) 11, 2);

    /* JADX INFO: renamed from: c */
    private static final guq0 f61752c = new guq0("", (byte) 15, 3);

    public C14735ek(String str, List<C14734ej> list) {
        this();
        this.f61753a = str;
        this.f61754a = list;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14735ek c14735ek) {
        int iM118196g;
        int iM118194e;
        int iM118194e2;
        if (!getClass().equals(c14735ek.getClass())) {
            return getClass().getName().compareTo(c14735ek.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m85562a()).compareTo(Boolean.valueOf(c14735ek.m85562a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m85562a() && (iM118194e2 = euq0.m118194e(this.f61753a, c14735ek.f61753a)) != 0) {
            return iM118194e2;
        }
        int iCompareTo2 = Boolean.valueOf(m85564b()).compareTo(Boolean.valueOf(c14735ek.m85564b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m85564b() && (iM118194e = euq0.m118194e(this.f61755b, c14735ek.f61755b)) != 0) {
            return iM118194e;
        }
        int iCompareTo3 = Boolean.valueOf(m85565c()).compareTo(Boolean.valueOf(c14735ek.m85565c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (!m85565c() || (iM118196g = euq0.m118196g(this.f61754a, c14735ek.f61754a)) == 0) {
            return 0;
        }
        return iM118196g;
    }

    @Override // com.xiaomi.push.InterfaceC14777hq
    /* JADX INFO: renamed from: b */
    public void mo85540b(quq0 quq0Var) throws C14781ib {
        m85561a();
        quq0Var.mo86237v(f61750a);
        if (this.f61753a != null) {
            quq0Var.mo86234s(f61749a);
            quq0Var.mo86232q(this.f61753a);
            quq0Var.mo86241z();
        }
        if (this.f61755b != null && m85564b()) {
            quq0Var.mo86234s(f61751b);
            quq0Var.mo86232q(this.f61755b);
            quq0Var.mo86241z();
        }
        if (this.f61754a != null) {
            quq0Var.mo86234s(f61752c);
            quq0Var.mo86235t(new huq0((byte) 12, this.f61754a.size()));
            Iterator<C14734ej> it = this.f61754a.iterator();
            while (it.hasNext()) {
                it.next().mo85540b(quq0Var);
            }
            quq0Var.mo86207C();
            quq0Var.mo86241z();
        }
        quq0Var.mo86205A();
        quq0Var.mo86228m();
    }

    /* JADX INFO: renamed from: c */
    public boolean m85565c() {
        return this.f61754a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C14735ek)) {
            return m85563a((C14735ek) obj);
        }
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("StatsEvents(uuid:");
        String str = this.f61753a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        if (m85564b()) {
            sb.append(", ");
            sb.append("operator:");
            String str2 = this.f61755b;
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(str2);
            }
        }
        sb.append(", ");
        sb.append("events:");
        List<C14734ej> list = this.f61754a;
        if (list == null) {
            sb.append("null");
        } else {
            sb.append(list);
        }
        sb.append(")");
        return sb.toString();
    }

    public C14735ek() {
    }

    /* JADX INFO: renamed from: b */
    public boolean m85564b() {
        return this.f61755b != null;
    }

    /* JADX INFO: renamed from: a */
    public C14735ek m85560a(String str) {
        this.f61755b = str;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public boolean m85563a(C14735ek c14735ek) {
        if (c14735ek == null) {
            return false;
        }
        boolean zM85562a = m85562a();
        boolean zM85562a2 = c14735ek.m85562a();
        if ((zM85562a || zM85562a2) && !(zM85562a && zM85562a2 && this.f61753a.equals(c14735ek.f61753a))) {
            return false;
        }
        boolean zM85564b = m85564b();
        boolean zM85564b2 = c14735ek.m85564b();
        if ((zM85564b || zM85564b2) && !(zM85564b && zM85564b2 && this.f61755b.equals(c14735ek.f61755b))) {
            return false;
        }
        boolean zM85565c = m85565c();
        boolean zM85565c2 = c14735ek.m85565c();
        if (zM85565c || zM85565c2) {
            return zM85565c && zM85565c2 && this.f61754a.equals(c14735ek.f61754a);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public boolean m85562a() {
        return this.f61753a != null;
    }

    @Override // com.xiaomi.push.InterfaceC14777hq
    /* JADX INFO: renamed from: a */
    public void mo85534a(quq0 quq0Var) throws C14781ib {
        quq0Var.mo86226k();
        while (true) {
            guq0 guq0VarMo86222g = quq0Var.mo86222g();
            byte b = guq0VarMo86222g.f104457b;
            if (b == 0) {
                quq0Var.mo86208D();
                m85561a();
                return;
            }
            short s = guq0VarMo86222g.f104458c;
            if (s != 1) {
                if (s != 2) {
                    if (s != 3) {
                        ruq0.m181208a(quq0Var, b);
                    } else if (b == 15) {
                        huq0 huq0VarMo86223h = quq0Var.mo86223h();
                        this.f61754a = new ArrayList(huq0VarMo86223h.f109582b);
                        for (int i = 0; i < huq0VarMo86223h.f109582b; i++) {
                            C14734ej c14734ej = new C14734ej();
                            c14734ej.mo85534a(quq0Var);
                            this.f61754a.add(c14734ej);
                        }
                        quq0Var.mo86211G();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                } else if (b == 11) {
                    this.f61755b = quq0Var.mo86220e();
                } else {
                    ruq0.m181208a(quq0Var, b);
                }
            } else if (b == 11) {
                this.f61753a = quq0Var.mo86220e();
            } else {
                ruq0.m181208a(quq0Var, b);
            }
            quq0Var.mo86209E();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m85561a() throws C14781ib {
        if (this.f61753a != null) {
            if (this.f61754a != null) {
                return;
            }
            throw new C14781ib("Required field 'events' was not present! Struct: " + toString());
        }
        throw new C14781ib("Required field 'uuid' was not present! Struct: " + toString());
    }
}
