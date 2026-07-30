package com.xiaomi.push;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import p149l.cuq0;
import p149l.euq0;
import p149l.guq0;
import p149l.huq0;
import p149l.quq0;
import p149l.ruq0;
import p149l.tuq0;

/* JADX INFO: renamed from: com.xiaomi.push.ha */
/* JADX INFO: loaded from: classes2.dex */
public class C14762ha implements InterfaceC14777hq<C14762ha, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public long f62326a;

    /* JADX INFO: renamed from: a */
    public C14755gu f62327a;

    /* JADX INFO: renamed from: a */
    public String f62328a;

    /* JADX INFO: renamed from: a */
    public List<String> f62330a;

    /* JADX INFO: renamed from: b */
    public String f62332b;

    /* JADX INFO: renamed from: c */
    public String f62333c;

    /* JADX INFO: renamed from: d */
    public String f62334d;

    /* JADX INFO: renamed from: e */
    public String f62335e;

    /* JADX INFO: renamed from: f */
    public String f62336f;

    /* JADX INFO: renamed from: a */
    private static final tuq0 f62316a = new tuq0("XmPushActionCommandResult");

    /* JADX INFO: renamed from: a */
    private static final guq0 f62315a = new guq0("", (byte) 12, 2);

    /* JADX INFO: renamed from: b */
    private static final guq0 f62317b = new guq0("", (byte) 11, 3);

    /* JADX INFO: renamed from: c */
    private static final guq0 f62318c = new guq0("", (byte) 11, 4);

    /* JADX INFO: renamed from: d */
    private static final guq0 f62319d = new guq0("", (byte) 11, 5);

    /* JADX INFO: renamed from: e */
    private static final guq0 f62320e = new guq0("", (byte) 10, 7);

    /* JADX INFO: renamed from: f */
    private static final guq0 f62321f = new guq0("", (byte) 11, 8);

    /* JADX INFO: renamed from: g */
    private static final guq0 f62322g = new guq0("", (byte) 11, 9);

    /* JADX INFO: renamed from: h */
    private static final guq0 f62323h = new guq0("", (byte) 15, 10);

    /* JADX INFO: renamed from: i */
    private static final guq0 f62324i = new guq0("", (byte) 11, 12);

    /* JADX INFO: renamed from: j */
    private static final guq0 f62325j = new guq0("", (byte) 2, 13);

    /* JADX INFO: renamed from: a */
    private BitSet f62329a = new BitSet(2);

    /* JADX INFO: renamed from: a */
    public boolean f62331a = true;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14762ha c14762ha) {
        int iM118200k;
        int iM118194e;
        int iM118196g;
        int iM118194e2;
        int iM118194e3;
        int iM118192c;
        int iM118194e4;
        int iM118194e5;
        int iM118194e6;
        int iM118193d;
        if (!getClass().equals(c14762ha.getClass())) {
            return getClass().getName().compareTo(c14762ha.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m85890a()).compareTo(Boolean.valueOf(c14762ha.m85890a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m85890a() && (iM118193d = euq0.m118193d(this.f62327a, c14762ha.f62327a)) != 0) {
            return iM118193d;
        }
        int iCompareTo2 = Boolean.valueOf(m85894b()).compareTo(Boolean.valueOf(c14762ha.m85894b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m85894b() && (iM118194e6 = euq0.m118194e(this.f62328a, c14762ha.f62328a)) != 0) {
            return iM118194e6;
        }
        int iCompareTo3 = Boolean.valueOf(m85896c()).compareTo(Boolean.valueOf(c14762ha.m85896c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m85896c() && (iM118194e5 = euq0.m118194e(this.f62332b, c14762ha.f62332b)) != 0) {
            return iM118194e5;
        }
        int iCompareTo4 = Boolean.valueOf(m85897d()).compareTo(Boolean.valueOf(c14762ha.m85897d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m85897d() && (iM118194e4 = euq0.m118194e(this.f62333c, c14762ha.f62333c)) != 0) {
            return iM118194e4;
        }
        int iCompareTo5 = Boolean.valueOf(m85898e()).compareTo(Boolean.valueOf(c14762ha.m85898e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m85898e() && (iM118192c = euq0.m118192c(this.f62326a, c14762ha.f62326a)) != 0) {
            return iM118192c;
        }
        int iCompareTo6 = Boolean.valueOf(m85899f()).compareTo(Boolean.valueOf(c14762ha.m85899f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (m85899f() && (iM118194e3 = euq0.m118194e(this.f62334d, c14762ha.f62334d)) != 0) {
            return iM118194e3;
        }
        int iCompareTo7 = Boolean.valueOf(m85900g()).compareTo(Boolean.valueOf(c14762ha.m85900g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (m85900g() && (iM118194e2 = euq0.m118194e(this.f62335e, c14762ha.f62335e)) != 0) {
            return iM118194e2;
        }
        int iCompareTo8 = Boolean.valueOf(m85901h()).compareTo(Boolean.valueOf(c14762ha.m85901h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (m85901h() && (iM118196g = euq0.m118196g(this.f62330a, c14762ha.f62330a)) != 0) {
            return iM118196g;
        }
        int iCompareTo9 = Boolean.valueOf(m85902i()).compareTo(Boolean.valueOf(c14762ha.m85902i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (m85902i() && (iM118194e = euq0.m118194e(this.f62336f, c14762ha.f62336f)) != 0) {
            return iM118194e;
        }
        int iCompareTo10 = Boolean.valueOf(m85903j()).compareTo(Boolean.valueOf(c14762ha.m85903j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (!m85903j() || (iM118200k = euq0.m118200k(this.f62331a, c14762ha.f62331a)) == 0) {
            return 0;
        }
        return iM118200k;
    }

    @Override // com.xiaomi.push.InterfaceC14777hq
    /* JADX INFO: renamed from: b */
    public void mo85540b(quq0 quq0Var) throws C14781ib {
        m85888a();
        quq0Var.mo86237v(f62316a);
        if (this.f62327a != null && m85890a()) {
            quq0Var.mo86234s(f62315a);
            this.f62327a.mo85540b(quq0Var);
            quq0Var.mo86241z();
        }
        if (this.f62328a != null) {
            quq0Var.mo86234s(f62317b);
            quq0Var.mo86232q(this.f62328a);
            quq0Var.mo86241z();
        }
        if (this.f62332b != null) {
            quq0Var.mo86234s(f62318c);
            quq0Var.mo86232q(this.f62332b);
            quq0Var.mo86241z();
        }
        if (this.f62333c != null) {
            quq0Var.mo86234s(f62319d);
            quq0Var.mo86232q(this.f62333c);
            quq0Var.mo86241z();
        }
        quq0Var.mo86234s(f62320e);
        quq0Var.mo86231p(this.f62326a);
        quq0Var.mo86241z();
        if (this.f62334d != null && m85899f()) {
            quq0Var.mo86234s(f62321f);
            quq0Var.mo86232q(this.f62334d);
            quq0Var.mo86241z();
        }
        if (this.f62335e != null && m85900g()) {
            quq0Var.mo86234s(f62322g);
            quq0Var.mo86232q(this.f62335e);
            quq0Var.mo86241z();
        }
        if (this.f62330a != null && m85901h()) {
            quq0Var.mo86234s(f62323h);
            quq0Var.mo86235t(new huq0((byte) 11, this.f62330a.size()));
            Iterator<String> it = this.f62330a.iterator();
            while (it.hasNext()) {
                quq0Var.mo86232q(it.next());
            }
            quq0Var.mo86207C();
            quq0Var.mo86241z();
        }
        if (this.f62336f != null && m85902i()) {
            quq0Var.mo86234s(f62324i);
            quq0Var.mo86232q(this.f62336f);
            quq0Var.mo86241z();
        }
        if (m85903j()) {
            quq0Var.mo86234s(f62325j);
            quq0Var.mo86239x(this.f62331a);
            quq0Var.mo86241z();
        }
        quq0Var.mo86205A();
        quq0Var.mo86228m();
    }

    /* JADX INFO: renamed from: c */
    public boolean m85896c() {
        return this.f62332b != null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m85897d() {
        return this.f62333c != null;
    }

    /* JADX INFO: renamed from: e */
    public boolean m85898e() {
        return this.f62329a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C14762ha)) {
            return m85891a((C14762ha) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m85899f() {
        return this.f62334d != null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m85900g() {
        return this.f62335e != null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m85901h() {
        return this.f62330a != null;
    }

    public int hashCode() {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public boolean m85902i() {
        return this.f62336f != null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m85903j() {
        return this.f62329a.get(1);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("XmPushActionCommandResult(");
        if (m85890a()) {
            sb.append("target:");
            C14755gu c14755gu = this.f62327a;
            if (c14755gu == null) {
                sb.append("null");
            } else {
                sb.append(c14755gu);
            }
            sb.append(", ");
        }
        sb.append("id:");
        String str = this.f62328a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("appId:");
        String str2 = this.f62332b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("cmdName:");
        String str3 = this.f62333c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("errorCode:");
        sb.append(this.f62326a);
        if (m85899f()) {
            sb.append(", ");
            sb.append("reason:");
            String str4 = this.f62334d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (m85900g()) {
            sb.append(", ");
            sb.append("packageName:");
            String str5 = this.f62335e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (m85901h()) {
            sb.append(", ");
            sb.append("cmdArgs:");
            List<String> list = this.f62330a;
            if (list == null) {
                sb.append("null");
            } else {
                sb.append(list);
            }
        }
        if (m85902i()) {
            sb.append(", ");
            sb.append("category:");
            String str6 = this.f62336f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (m85903j()) {
            sb.append(", ");
            sb.append("response2Client:");
            sb.append(this.f62331a);
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public String m85895c() {
        return this.f62336f;
    }

    /* JADX INFO: renamed from: b */
    public String m85892b() {
        return this.f62333c;
    }

    /* JADX INFO: renamed from: b */
    public void m85893b(boolean z) {
        this.f62329a.set(1, z);
    }

    /* JADX INFO: renamed from: b */
    public boolean m85894b() {
        return this.f62328a != null;
    }

    /* JADX INFO: renamed from: a */
    public String m85886a() {
        return this.f62328a;
    }

    /* JADX INFO: renamed from: a */
    public void m85889a(boolean z) {
        this.f62329a.set(0, z);
    }

    /* JADX INFO: renamed from: a */
    public List<String> m85887a() {
        return this.f62330a;
    }

    /* JADX INFO: renamed from: a */
    public boolean m85891a(C14762ha c14762ha) {
        if (c14762ha == null) {
            return false;
        }
        boolean zM85890a = m85890a();
        boolean zM85890a2 = c14762ha.m85890a();
        if ((zM85890a || zM85890a2) && !(zM85890a && zM85890a2 && this.f62327a.m85770a(c14762ha.f62327a))) {
            return false;
        }
        boolean zM85894b = m85894b();
        boolean zM85894b2 = c14762ha.m85894b();
        if ((zM85894b || zM85894b2) && !(zM85894b && zM85894b2 && this.f62328a.equals(c14762ha.f62328a))) {
            return false;
        }
        boolean zM85896c = m85896c();
        boolean zM85896c2 = c14762ha.m85896c();
        if ((zM85896c || zM85896c2) && !(zM85896c && zM85896c2 && this.f62332b.equals(c14762ha.f62332b))) {
            return false;
        }
        boolean zM85897d = m85897d();
        boolean zM85897d2 = c14762ha.m85897d();
        if (((zM85897d || zM85897d2) && !(zM85897d && zM85897d2 && this.f62333c.equals(c14762ha.f62333c))) || this.f62326a != c14762ha.f62326a) {
            return false;
        }
        boolean zM85899f = m85899f();
        boolean zM85899f2 = c14762ha.m85899f();
        if ((zM85899f || zM85899f2) && !(zM85899f && zM85899f2 && this.f62334d.equals(c14762ha.f62334d))) {
            return false;
        }
        boolean zM85900g = m85900g();
        boolean zM85900g2 = c14762ha.m85900g();
        if ((zM85900g || zM85900g2) && !(zM85900g && zM85900g2 && this.f62335e.equals(c14762ha.f62335e))) {
            return false;
        }
        boolean zM85901h = m85901h();
        boolean zM85901h2 = c14762ha.m85901h();
        if ((zM85901h || zM85901h2) && !(zM85901h && zM85901h2 && this.f62330a.equals(c14762ha.f62330a))) {
            return false;
        }
        boolean zM85902i = m85902i();
        boolean zM85902i2 = c14762ha.m85902i();
        if ((zM85902i || zM85902i2) && !(zM85902i && zM85902i2 && this.f62336f.equals(c14762ha.f62336f))) {
            return false;
        }
        boolean zM85903j = m85903j();
        boolean zM85903j2 = c14762ha.m85903j();
        if (zM85903j || zM85903j2) {
            return zM85903j && zM85903j2 && this.f62331a == c14762ha.f62331a;
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public boolean m85890a() {
        return this.f62327a != null;
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
                if (m85898e()) {
                    m85888a();
                    return;
                } else {
                    cuq0.m108810a("Required field 'errorCode' was not found in serialized data! Struct: ", this);
                    return;
                }
            }
            switch (guq0VarMo86222g.f104458c) {
                case 2:
                    if (b == 12) {
                        C14755gu c14755gu = new C14755gu();
                        this.f62327a = c14755gu;
                        c14755gu.mo85534a(quq0Var);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 3:
                    if (b == 11) {
                        this.f62328a = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 4:
                    if (b == 11) {
                        this.f62332b = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 5:
                    if (b == 11) {
                        this.f62333c = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 6:
                case 11:
                default:
                    ruq0.m181208a(quq0Var, b);
                    break;
                case 7:
                    if (b == 10) {
                        this.f62326a = quq0Var.mo86219d();
                        m85889a(true);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 8:
                    if (b == 11) {
                        this.f62334d = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 9:
                    if (b == 11) {
                        this.f62335e = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 10:
                    if (b == 15) {
                        huq0 huq0VarMo86223h = quq0Var.mo86223h();
                        this.f62330a = new ArrayList(huq0VarMo86223h.f109582b);
                        for (int i = 0; i < huq0VarMo86223h.f109582b; i++) {
                            this.f62330a.add(quq0Var.mo86220e());
                        }
                        quq0Var.mo86211G();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 12:
                    if (b == 11) {
                        this.f62336f = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 13:
                    if (b == 2) {
                        this.f62331a = quq0Var.mo86240y();
                        m85893b(true);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
            }
            quq0Var.mo86209E();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m85888a() throws C14781ib {
        if (this.f62328a != null) {
            if (this.f62332b != null) {
                if (this.f62333c != null) {
                    return;
                }
                cuq0.m108810a("Required field 'cmdName' was not present! Struct: ", this);
                return;
            }
            cuq0.m108810a("Required field 'appId' was not present! Struct: ", this);
            return;
        }
        cuq0.m108810a("Required field 'id' was not present! Struct: ", this);
    }
}
