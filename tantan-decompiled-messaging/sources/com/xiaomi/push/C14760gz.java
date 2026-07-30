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

/* JADX INFO: renamed from: com.xiaomi.push.gz */
/* JADX INFO: loaded from: classes2.dex */
public class C14760gz implements InterfaceC14777hq<C14760gz, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public long f62296a;

    /* JADX INFO: renamed from: a */
    public C14755gu f62297a;

    /* JADX INFO: renamed from: a */
    public String f62298a;

    /* JADX INFO: renamed from: a */
    public List<String> f62300a;

    /* JADX INFO: renamed from: b */
    public String f62302b;

    /* JADX INFO: renamed from: c */
    public String f62304c;

    /* JADX INFO: renamed from: d */
    public String f62305d;

    /* JADX INFO: renamed from: e */
    public String f62306e;

    /* JADX INFO: renamed from: a */
    private static final tuq0 f62286a = new tuq0("XmPushActionCommand");

    /* JADX INFO: renamed from: a */
    private static final guq0 f62285a = new guq0("", (byte) 12, 2);

    /* JADX INFO: renamed from: b */
    private static final guq0 f62287b = new guq0("", (byte) 11, 3);

    /* JADX INFO: renamed from: c */
    private static final guq0 f62288c = new guq0("", (byte) 11, 4);

    /* JADX INFO: renamed from: d */
    private static final guq0 f62289d = new guq0("", (byte) 11, 5);

    /* JADX INFO: renamed from: e */
    private static final guq0 f62290e = new guq0("", (byte) 15, 6);

    /* JADX INFO: renamed from: f */
    private static final guq0 f62291f = new guq0("", (byte) 11, 7);

    /* JADX INFO: renamed from: g */
    private static final guq0 f62292g = new guq0("", (byte) 11, 9);

    /* JADX INFO: renamed from: h */
    private static final guq0 f62293h = new guq0("", (byte) 2, 10);

    /* JADX INFO: renamed from: i */
    private static final guq0 f62294i = new guq0("", (byte) 2, 11);

    /* JADX INFO: renamed from: j */
    private static final guq0 f62295j = new guq0("", (byte) 10, 12);

    /* JADX INFO: renamed from: a */
    private BitSet f62299a = new BitSet(3);

    /* JADX INFO: renamed from: a */
    public boolean f62301a = false;

    /* JADX INFO: renamed from: b */
    public boolean f62303b = true;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14760gz c14760gz) {
        int iM118192c;
        int iM118200k;
        int iM118200k2;
        int iM118194e;
        int iM118194e2;
        int iM118196g;
        int iM118194e3;
        int iM118194e4;
        int iM118194e5;
        int iM118193d;
        if (!getClass().equals(c14760gz.getClass())) {
            return getClass().getName().compareTo(c14760gz.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m85855a()).compareTo(Boolean.valueOf(c14760gz.m85855a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m85855a() && (iM118193d = euq0.m118193d(this.f62297a, c14760gz.f62297a)) != 0) {
            return iM118193d;
        }
        int iCompareTo2 = Boolean.valueOf(m85859b()).compareTo(Boolean.valueOf(c14760gz.m85859b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m85859b() && (iM118194e5 = euq0.m118194e(this.f62298a, c14760gz.f62298a)) != 0) {
            return iM118194e5;
        }
        int iCompareTo3 = Boolean.valueOf(m85862c()).compareTo(Boolean.valueOf(c14760gz.m85862c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m85862c() && (iM118194e4 = euq0.m118194e(this.f62302b, c14760gz.f62302b)) != 0) {
            return iM118194e4;
        }
        int iCompareTo4 = Boolean.valueOf(m85864d()).compareTo(Boolean.valueOf(c14760gz.m85864d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m85864d() && (iM118194e3 = euq0.m118194e(this.f62304c, c14760gz.f62304c)) != 0) {
            return iM118194e3;
        }
        int iCompareTo5 = Boolean.valueOf(m85866e()).compareTo(Boolean.valueOf(c14760gz.m85866e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m85866e() && (iM118196g = euq0.m118196g(this.f62300a, c14760gz.f62300a)) != 0) {
            return iM118196g;
        }
        int iCompareTo6 = Boolean.valueOf(m85867f()).compareTo(Boolean.valueOf(c14760gz.m85867f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (m85867f() && (iM118194e2 = euq0.m118194e(this.f62305d, c14760gz.f62305d)) != 0) {
            return iM118194e2;
        }
        int iCompareTo7 = Boolean.valueOf(m85868g()).compareTo(Boolean.valueOf(c14760gz.m85868g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (m85868g() && (iM118194e = euq0.m118194e(this.f62306e, c14760gz.f62306e)) != 0) {
            return iM118194e;
        }
        int iCompareTo8 = Boolean.valueOf(m85869h()).compareTo(Boolean.valueOf(c14760gz.m85869h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (m85869h() && (iM118200k2 = euq0.m118200k(this.f62301a, c14760gz.f62301a)) != 0) {
            return iM118200k2;
        }
        int iCompareTo9 = Boolean.valueOf(m85870i()).compareTo(Boolean.valueOf(c14760gz.m85870i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (m85870i() && (iM118200k = euq0.m118200k(this.f62303b, c14760gz.f62303b)) != 0) {
            return iM118200k;
        }
        int iCompareTo10 = Boolean.valueOf(m85871j()).compareTo(Boolean.valueOf(c14760gz.m85871j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (!m85871j() || (iM118192c = euq0.m118192c(this.f62296a, c14760gz.f62296a)) == 0) {
            return 0;
        }
        return iM118192c;
    }

    @Override // com.xiaomi.push.InterfaceC14777hq
    /* JADX INFO: renamed from: b */
    public void mo85540b(quq0 quq0Var) throws C14781ib {
        m85852a();
        quq0Var.mo86237v(f62286a);
        if (this.f62297a != null && m85855a()) {
            quq0Var.mo86234s(f62285a);
            this.f62297a.mo85540b(quq0Var);
            quq0Var.mo86241z();
        }
        if (this.f62298a != null) {
            quq0Var.mo86234s(f62287b);
            quq0Var.mo86232q(this.f62298a);
            quq0Var.mo86241z();
        }
        if (this.f62302b != null) {
            quq0Var.mo86234s(f62288c);
            quq0Var.mo86232q(this.f62302b);
            quq0Var.mo86241z();
        }
        if (this.f62304c != null) {
            quq0Var.mo86234s(f62289d);
            quq0Var.mo86232q(this.f62304c);
            quq0Var.mo86241z();
        }
        if (this.f62300a != null && m85866e()) {
            quq0Var.mo86234s(f62290e);
            quq0Var.mo86235t(new huq0((byte) 11, this.f62300a.size()));
            Iterator<String> it = this.f62300a.iterator();
            while (it.hasNext()) {
                quq0Var.mo86232q(it.next());
            }
            quq0Var.mo86207C();
            quq0Var.mo86241z();
        }
        if (this.f62305d != null && m85867f()) {
            quq0Var.mo86234s(f62291f);
            quq0Var.mo86232q(this.f62305d);
            quq0Var.mo86241z();
        }
        if (this.f62306e != null && m85868g()) {
            quq0Var.mo86234s(f62292g);
            quq0Var.mo86232q(this.f62306e);
            quq0Var.mo86241z();
        }
        if (m85869h()) {
            quq0Var.mo86234s(f62293h);
            quq0Var.mo86239x(this.f62301a);
            quq0Var.mo86241z();
        }
        if (m85870i()) {
            quq0Var.mo86234s(f62294i);
            quq0Var.mo86239x(this.f62303b);
            quq0Var.mo86241z();
        }
        if (m85871j()) {
            quq0Var.mo86234s(f62295j);
            quq0Var.mo86231p(this.f62296a);
            quq0Var.mo86241z();
        }
        quq0Var.mo86205A();
        quq0Var.mo86228m();
    }

    /* JADX INFO: renamed from: c */
    public boolean m85862c() {
        return this.f62302b != null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m85864d() {
        return this.f62304c != null;
    }

    /* JADX INFO: renamed from: e */
    public boolean m85866e() {
        return this.f62300a != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C14760gz)) {
            return m85856a((C14760gz) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m85867f() {
        return this.f62305d != null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m85868g() {
        return this.f62306e != null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m85869h() {
        return this.f62299a.get(0);
    }

    public int hashCode() {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public boolean m85870i() {
        return this.f62299a.get(1);
    }

    /* JADX INFO: renamed from: j */
    public boolean m85871j() {
        return this.f62299a.get(2);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("XmPushActionCommand(");
        if (m85855a()) {
            sb.append("target:");
            C14755gu c14755gu = this.f62297a;
            if (c14755gu == null) {
                sb.append("null");
            } else {
                sb.append(c14755gu);
            }
            sb.append(", ");
        }
        sb.append("id:");
        String str = this.f62298a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("appId:");
        String str2 = this.f62302b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("cmdName:");
        String str3 = this.f62304c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        if (m85866e()) {
            sb.append(", ");
            sb.append("cmdArgs:");
            List<String> list = this.f62300a;
            if (list == null) {
                sb.append("null");
            } else {
                sb.append(list);
            }
        }
        if (m85867f()) {
            sb.append(", ");
            sb.append("packageName:");
            String str4 = this.f62305d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (m85868g()) {
            sb.append(", ");
            sb.append("category:");
            String str5 = this.f62306e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (m85869h()) {
            sb.append(", ");
            sb.append("updateCache:");
            sb.append(this.f62301a);
        }
        if (m85870i()) {
            sb.append(", ");
            sb.append("response2Client:");
            sb.append(this.f62303b);
        }
        if (m85871j()) {
            sb.append(", ");
            sb.append("createdTs:");
            sb.append(this.f62296a);
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public C14760gz m85860c(String str) {
        this.f62304c = str;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public C14760gz m85863d(String str) {
        this.f62305d = str;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public C14760gz m85865e(String str) {
        this.f62306e = str;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public void m85861c(boolean z) {
        this.f62299a.set(2, z);
    }

    /* JADX INFO: renamed from: b */
    public C14760gz m85857b(String str) {
        this.f62302b = str;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public void m85858b(boolean z) {
        this.f62299a.set(1, z);
    }

    /* JADX INFO: renamed from: b */
    public boolean m85859b() {
        return this.f62298a != null;
    }

    /* JADX INFO: renamed from: a */
    public C14760gz m85850a(String str) {
        this.f62298a = str;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public String m85851a() {
        return this.f62304c;
    }

    /* JADX INFO: renamed from: a */
    public void m85853a(String str) {
        if (this.f62300a == null) {
            this.f62300a = new ArrayList();
        }
        this.f62300a.add(str);
    }

    /* JADX INFO: renamed from: a */
    public void m85854a(boolean z) {
        this.f62299a.set(0, z);
    }

    /* JADX INFO: renamed from: a */
    public boolean m85856a(C14760gz c14760gz) {
        if (c14760gz == null) {
            return false;
        }
        boolean zM85855a = m85855a();
        boolean zM85855a2 = c14760gz.m85855a();
        if ((zM85855a || zM85855a2) && !(zM85855a && zM85855a2 && this.f62297a.m85770a(c14760gz.f62297a))) {
            return false;
        }
        boolean zM85859b = m85859b();
        boolean zM85859b2 = c14760gz.m85859b();
        if ((zM85859b || zM85859b2) && !(zM85859b && zM85859b2 && this.f62298a.equals(c14760gz.f62298a))) {
            return false;
        }
        boolean zM85862c = m85862c();
        boolean zM85862c2 = c14760gz.m85862c();
        if ((zM85862c || zM85862c2) && !(zM85862c && zM85862c2 && this.f62302b.equals(c14760gz.f62302b))) {
            return false;
        }
        boolean zM85864d = m85864d();
        boolean zM85864d2 = c14760gz.m85864d();
        if ((zM85864d || zM85864d2) && !(zM85864d && zM85864d2 && this.f62304c.equals(c14760gz.f62304c))) {
            return false;
        }
        boolean zM85866e = m85866e();
        boolean zM85866e2 = c14760gz.m85866e();
        if ((zM85866e || zM85866e2) && !(zM85866e && zM85866e2 && this.f62300a.equals(c14760gz.f62300a))) {
            return false;
        }
        boolean zM85867f = m85867f();
        boolean zM85867f2 = c14760gz.m85867f();
        if ((zM85867f || zM85867f2) && !(zM85867f && zM85867f2 && this.f62305d.equals(c14760gz.f62305d))) {
            return false;
        }
        boolean zM85868g = m85868g();
        boolean zM85868g2 = c14760gz.m85868g();
        if ((zM85868g || zM85868g2) && !(zM85868g && zM85868g2 && this.f62306e.equals(c14760gz.f62306e))) {
            return false;
        }
        boolean zM85869h = m85869h();
        boolean zM85869h2 = c14760gz.m85869h();
        if ((zM85869h || zM85869h2) && !(zM85869h && zM85869h2 && this.f62301a == c14760gz.f62301a)) {
            return false;
        }
        boolean zM85870i = m85870i();
        boolean zM85870i2 = c14760gz.m85870i();
        if ((zM85870i || zM85870i2) && !(zM85870i && zM85870i2 && this.f62303b == c14760gz.f62303b)) {
            return false;
        }
        boolean zM85871j = m85871j();
        boolean zM85871j2 = c14760gz.m85871j();
        if (zM85871j || zM85871j2) {
            return zM85871j && zM85871j2 && this.f62296a == c14760gz.f62296a;
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public boolean m85855a() {
        return this.f62297a != null;
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
                m85852a();
                return;
            }
            switch (guq0VarMo86222g.f104458c) {
                case 2:
                    if (b == 12) {
                        C14755gu c14755gu = new C14755gu();
                        this.f62297a = c14755gu;
                        c14755gu.mo85534a(quq0Var);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 3:
                    if (b == 11) {
                        this.f62298a = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 4:
                    if (b == 11) {
                        this.f62302b = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 5:
                    if (b == 11) {
                        this.f62304c = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 6:
                    if (b == 15) {
                        huq0 huq0VarMo86223h = quq0Var.mo86223h();
                        this.f62300a = new ArrayList(huq0VarMo86223h.f109582b);
                        for (int i = 0; i < huq0VarMo86223h.f109582b; i++) {
                            this.f62300a.add(quq0Var.mo86220e());
                        }
                        quq0Var.mo86211G();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 7:
                    if (b == 11) {
                        this.f62305d = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 8:
                default:
                    ruq0.m181208a(quq0Var, b);
                    break;
                case 9:
                    if (b == 11) {
                        this.f62306e = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 10:
                    if (b == 2) {
                        this.f62301a = quq0Var.mo86240y();
                        m85854a(true);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 11:
                    if (b == 2) {
                        this.f62303b = quq0Var.mo86240y();
                        m85858b(true);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 12:
                    if (b == 10) {
                        this.f62296a = quq0Var.mo86219d();
                        m85861c(true);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
            }
            quq0Var.mo86209E();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m85852a() throws C14781ib {
        if (this.f62298a != null) {
            if (this.f62302b != null) {
                if (this.f62304c != null) {
                    return;
                }
                throw new C14781ib("Required field 'cmdName' was not present! Struct: " + toString());
            }
            throw new C14781ib("Required field 'appId' was not present! Struct: " + toString());
        }
        throw new C14781ib("Required field 'id' was not present! Struct: " + toString());
    }
}
