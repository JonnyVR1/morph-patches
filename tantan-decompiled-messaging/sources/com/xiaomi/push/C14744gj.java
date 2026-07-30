package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.jetty.http.HttpTokens;
import p149l.euq0;
import p149l.guq0;
import p149l.iuq0;
import p149l.quq0;
import p149l.ruq0;
import p149l.tuq0;

/* JADX INFO: renamed from: com.xiaomi.push.gj */
/* JADX INFO: loaded from: classes2.dex */
public class C14744gj implements InterfaceC14777hq<C14744gj, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public long f61878a;

    /* JADX INFO: renamed from: a */
    public String f61879a;

    /* JADX INFO: renamed from: a */
    private BitSet f61880a = new BitSet(3);

    /* JADX INFO: renamed from: a */
    public Map<String, String> f61881a;

    /* JADX INFO: renamed from: a */
    public boolean f61882a;

    /* JADX INFO: renamed from: b */
    public long f61883b;

    /* JADX INFO: renamed from: b */
    public String f61884b;

    /* JADX INFO: renamed from: c */
    public String f61885c;

    /* JADX INFO: renamed from: d */
    public String f61886d;

    /* JADX INFO: renamed from: e */
    public String f61887e;

    /* JADX INFO: renamed from: f */
    public String f61888f;

    /* JADX INFO: renamed from: g */
    public String f61889g;

    /* JADX INFO: renamed from: a */
    private static final tuq0 f61867a = new tuq0("ClientUploadDataItem");

    /* JADX INFO: renamed from: a */
    private static final guq0 f61866a = new guq0("", (byte) 11, 1);

    /* JADX INFO: renamed from: b */
    private static final guq0 f61868b = new guq0("", (byte) 11, 2);

    /* JADX INFO: renamed from: c */
    private static final guq0 f61869c = new guq0("", (byte) 11, 3);

    /* JADX INFO: renamed from: d */
    private static final guq0 f61870d = new guq0("", (byte) 10, 4);

    /* JADX INFO: renamed from: e */
    private static final guq0 f61871e = new guq0("", (byte) 10, 5);

    /* JADX INFO: renamed from: f */
    private static final guq0 f61872f = new guq0("", (byte) 2, 6);

    /* JADX INFO: renamed from: g */
    private static final guq0 f61873g = new guq0("", (byte) 11, 7);

    /* JADX INFO: renamed from: h */
    private static final guq0 f61874h = new guq0("", (byte) 11, 8);

    /* JADX INFO: renamed from: i */
    private static final guq0 f61875i = new guq0("", (byte) 11, 9);

    /* JADX INFO: renamed from: j */
    private static final guq0 f61876j = new guq0("", HttpTokens.CARRIAGE_RETURN, 10);

    /* JADX INFO: renamed from: k */
    private static final guq0 f61877k = new guq0("", (byte) 11, 11);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14744gj c14744gj) {
        int iM118194e;
        int iM118197h;
        int iM118194e2;
        int iM118194e3;
        int iM118194e4;
        int iM118200k;
        int iM118192c;
        int iM118192c2;
        int iM118194e5;
        int iM118194e6;
        int iM118194e7;
        if (!getClass().equals(c14744gj.getClass())) {
            return getClass().getName().compareTo(c14744gj.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m85621a()).compareTo(Boolean.valueOf(c14744gj.m85621a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m85621a() && (iM118194e7 = euq0.m118194e(this.f61879a, c14744gj.f61879a)) != 0) {
            return iM118194e7;
        }
        int iCompareTo2 = Boolean.valueOf(m85627b()).compareTo(Boolean.valueOf(c14744gj.m85627b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m85627b() && (iM118194e6 = euq0.m118194e(this.f61884b, c14744gj.f61884b)) != 0) {
            return iM118194e6;
        }
        int iCompareTo3 = Boolean.valueOf(m85631c()).compareTo(Boolean.valueOf(c14744gj.m85631c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m85631c() && (iM118194e5 = euq0.m118194e(this.f61885c, c14744gj.f61885c)) != 0) {
            return iM118194e5;
        }
        int iCompareTo4 = Boolean.valueOf(m85634d()).compareTo(Boolean.valueOf(c14744gj.m85634d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m85634d() && (iM118192c2 = euq0.m118192c(this.f61878a, c14744gj.f61878a)) != 0) {
            return iM118192c2;
        }
        int iCompareTo5 = Boolean.valueOf(m85637e()).compareTo(Boolean.valueOf(c14744gj.m85637e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m85637e() && (iM118192c = euq0.m118192c(this.f61883b, c14744gj.f61883b)) != 0) {
            return iM118192c;
        }
        int iCompareTo6 = Boolean.valueOf(m85639f()).compareTo(Boolean.valueOf(c14744gj.m85639f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (m85639f() && (iM118200k = euq0.m118200k(this.f61882a, c14744gj.f61882a)) != 0) {
            return iM118200k;
        }
        int iCompareTo7 = Boolean.valueOf(m85641g()).compareTo(Boolean.valueOf(c14744gj.m85641g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (m85641g() && (iM118194e4 = euq0.m118194e(this.f61886d, c14744gj.f61886d)) != 0) {
            return iM118194e4;
        }
        int iCompareTo8 = Boolean.valueOf(m85642h()).compareTo(Boolean.valueOf(c14744gj.m85642h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (m85642h() && (iM118194e3 = euq0.m118194e(this.f61887e, c14744gj.f61887e)) != 0) {
            return iM118194e3;
        }
        int iCompareTo9 = Boolean.valueOf(m85643i()).compareTo(Boolean.valueOf(c14744gj.m85643i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (m85643i() && (iM118194e2 = euq0.m118194e(this.f61888f, c14744gj.f61888f)) != 0) {
            return iM118194e2;
        }
        int iCompareTo10 = Boolean.valueOf(m85644j()).compareTo(Boolean.valueOf(c14744gj.m85644j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (m85644j() && (iM118197h = euq0.m118197h(this.f61881a, c14744gj.f61881a)) != 0) {
            return iM118197h;
        }
        int iCompareTo11 = Boolean.valueOf(m85645k()).compareTo(Boolean.valueOf(c14744gj.m85645k()));
        if (iCompareTo11 != 0) {
            return iCompareTo11;
        }
        if (!m85645k() || (iM118194e = euq0.m118194e(this.f61889g, c14744gj.f61889g)) == 0) {
            return 0;
        }
        return iM118194e;
    }

    @Override // com.xiaomi.push.InterfaceC14777hq
    /* JADX INFO: renamed from: b */
    public void mo85540b(quq0 quq0Var) {
        m85618a();
        quq0Var.mo86237v(f61867a);
        if (this.f61879a != null && m85621a()) {
            quq0Var.mo86234s(f61866a);
            quq0Var.mo86232q(this.f61879a);
            quq0Var.mo86241z();
        }
        if (this.f61884b != null && m85627b()) {
            quq0Var.mo86234s(f61868b);
            quq0Var.mo86232q(this.f61884b);
            quq0Var.mo86241z();
        }
        if (this.f61885c != null && m85631c()) {
            quq0Var.mo86234s(f61869c);
            quq0Var.mo86232q(this.f61885c);
            quq0Var.mo86241z();
        }
        if (m85634d()) {
            quq0Var.mo86234s(f61870d);
            quq0Var.mo86231p(this.f61878a);
            quq0Var.mo86241z();
        }
        if (m85637e()) {
            quq0Var.mo86234s(f61871e);
            quq0Var.mo86231p(this.f61883b);
            quq0Var.mo86241z();
        }
        if (m85639f()) {
            quq0Var.mo86234s(f61872f);
            quq0Var.mo86239x(this.f61882a);
            quq0Var.mo86241z();
        }
        if (this.f61886d != null && m85641g()) {
            quq0Var.mo86234s(f61873g);
            quq0Var.mo86232q(this.f61886d);
            quq0Var.mo86241z();
        }
        if (this.f61887e != null && m85642h()) {
            quq0Var.mo86234s(f61874h);
            quq0Var.mo86232q(this.f61887e);
            quq0Var.mo86241z();
        }
        if (this.f61888f != null && m85643i()) {
            quq0Var.mo86234s(f61875i);
            quq0Var.mo86232q(this.f61888f);
            quq0Var.mo86241z();
        }
        if (this.f61881a != null && m85644j()) {
            quq0Var.mo86234s(f61876j);
            quq0Var.mo86236u(new iuq0((byte) 11, (byte) 11, this.f61881a.size()));
            for (Map.Entry<String, String> entry : this.f61881a.entrySet()) {
                quq0Var.mo86232q(entry.getKey());
                quq0Var.mo86232q(entry.getValue());
            }
            quq0Var.mo86206B();
            quq0Var.mo86241z();
        }
        if (this.f61889g != null && m85645k()) {
            quq0Var.mo86234s(f61877k);
            quq0Var.mo86232q(this.f61889g);
            quq0Var.mo86241z();
        }
        quq0Var.mo86205A();
        quq0Var.mo86228m();
    }

    /* JADX INFO: renamed from: c */
    public boolean m85631c() {
        return this.f61885c != null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m85634d() {
        return this.f61880a.get(0);
    }

    /* JADX INFO: renamed from: e */
    public boolean m85637e() {
        return this.f61880a.get(1);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C14744gj)) {
            return m85622a((C14744gj) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m85639f() {
        return this.f61880a.get(2);
    }

    /* JADX INFO: renamed from: g */
    public boolean m85641g() {
        return this.f61886d != null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m85642h() {
        return this.f61887e != null;
    }

    public int hashCode() {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public boolean m85643i() {
        return this.f61888f != null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m85644j() {
        return this.f61881a != null;
    }

    /* JADX INFO: renamed from: k */
    public boolean m85645k() {
        return this.f61889g != null;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("ClientUploadDataItem(");
        boolean z2 = false;
        if (m85621a()) {
            sb.append("channel:");
            String str = this.f61879a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (m85627b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("data:");
            String str2 = this.f61884b;
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(str2);
            }
            z = false;
        }
        if (m85631c()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("name:");
            String str3 = this.f61885c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
            z = false;
        }
        if (m85634d()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("counter:");
            sb.append(this.f61878a);
            z = false;
        }
        if (m85637e()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("timestamp:");
            sb.append(this.f61883b);
            z = false;
        }
        if (m85639f()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("fromSdk:");
            sb.append(this.f61882a);
            z = false;
        }
        if (m85641g()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("category:");
            String str4 = this.f61886d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
            z = false;
        }
        if (m85642h()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("sourcePackage:");
            String str5 = this.f61887e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
            z = false;
        }
        if (m85643i()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("id:");
            String str6 = this.f61888f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
            z = false;
        }
        if (m85644j()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("extra:");
            Map<String, String> map = this.f61881a;
            if (map == null) {
                sb.append("null");
            } else {
                sb.append(map);
            }
        } else {
            z2 = z;
        }
        if (m85645k()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("pkgName:");
            String str7 = this.f61889g;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public C14744gj m85628c(String str) {
        this.f61885c = str;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public C14744gj m85632d(String str) {
        this.f61886d = str;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public C14744gj m85635e(String str) {
        this.f61887e = str;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public C14744gj m85638f(String str) {
        this.f61888f = str;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public C14744gj m85640g(String str) {
        this.f61889g = str;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public void m85630c(boolean z) {
        this.f61880a.set(2, z);
    }

    /* JADX INFO: renamed from: d */
    public String m85633d() {
        return this.f61888f;
    }

    /* JADX INFO: renamed from: e */
    public String m85636e() {
        return this.f61889g;
    }

    /* JADX INFO: renamed from: c */
    public String m85629c() {
        return this.f61887e;
    }

    /* JADX INFO: renamed from: b */
    public boolean m85627b() {
        return this.f61884b != null;
    }

    /* JADX INFO: renamed from: b */
    public String m85625b() {
        return this.f61885c;
    }

    /* JADX INFO: renamed from: b */
    public C14744gj m85623b(long j) {
        this.f61883b = j;
        m85626b(true);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public void m85626b(boolean z) {
        this.f61880a.set(1, z);
    }

    /* JADX INFO: renamed from: b */
    public C14744gj m85624b(String str) {
        this.f61884b = str;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public String m85616a() {
        return this.f61879a;
    }

    /* JADX INFO: renamed from: a */
    public C14744gj m85613a(String str) {
        this.f61879a = str;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public boolean m85621a() {
        return this.f61879a != null;
    }

    /* JADX INFO: renamed from: a */
    public C14744gj m85612a(long j) {
        this.f61878a = j;
        m85620a(true);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public void m85620a(boolean z) {
        this.f61880a.set(0, z);
    }

    /* JADX INFO: renamed from: a */
    public long m85611a() {
        return this.f61883b;
    }

    /* JADX INFO: renamed from: a */
    public C14744gj m85615a(boolean z) {
        this.f61882a = z;
        m85630c(true);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public void m85619a(String str, String str2) {
        if (this.f61881a == null) {
            this.f61881a = new HashMap();
        }
        this.f61881a.put(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public Map<String, String> m85617a() {
        return this.f61881a;
    }

    /* JADX INFO: renamed from: a */
    public C14744gj m85614a(Map<String, String> map) {
        this.f61881a = map;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public boolean m85622a(C14744gj c14744gj) {
        if (c14744gj == null) {
            return false;
        }
        boolean zM85621a = m85621a();
        boolean zM85621a2 = c14744gj.m85621a();
        if ((zM85621a || zM85621a2) && !(zM85621a && zM85621a2 && this.f61879a.equals(c14744gj.f61879a))) {
            return false;
        }
        boolean zM85627b = m85627b();
        boolean zM85627b2 = c14744gj.m85627b();
        if ((zM85627b || zM85627b2) && !(zM85627b && zM85627b2 && this.f61884b.equals(c14744gj.f61884b))) {
            return false;
        }
        boolean zM85631c = m85631c();
        boolean zM85631c2 = c14744gj.m85631c();
        if ((zM85631c || zM85631c2) && !(zM85631c && zM85631c2 && this.f61885c.equals(c14744gj.f61885c))) {
            return false;
        }
        boolean zM85634d = m85634d();
        boolean zM85634d2 = c14744gj.m85634d();
        if ((zM85634d || zM85634d2) && !(zM85634d && zM85634d2 && this.f61878a == c14744gj.f61878a)) {
            return false;
        }
        boolean zM85637e = m85637e();
        boolean zM85637e2 = c14744gj.m85637e();
        if ((zM85637e || zM85637e2) && !(zM85637e && zM85637e2 && this.f61883b == c14744gj.f61883b)) {
            return false;
        }
        boolean zM85639f = m85639f();
        boolean zM85639f2 = c14744gj.m85639f();
        if ((zM85639f || zM85639f2) && !(zM85639f && zM85639f2 && this.f61882a == c14744gj.f61882a)) {
            return false;
        }
        boolean zM85641g = m85641g();
        boolean zM85641g2 = c14744gj.m85641g();
        if ((zM85641g || zM85641g2) && !(zM85641g && zM85641g2 && this.f61886d.equals(c14744gj.f61886d))) {
            return false;
        }
        boolean zM85642h = m85642h();
        boolean zM85642h2 = c14744gj.m85642h();
        if ((zM85642h || zM85642h2) && !(zM85642h && zM85642h2 && this.f61887e.equals(c14744gj.f61887e))) {
            return false;
        }
        boolean zM85643i = m85643i();
        boolean zM85643i2 = c14744gj.m85643i();
        if ((zM85643i || zM85643i2) && !(zM85643i && zM85643i2 && this.f61888f.equals(c14744gj.f61888f))) {
            return false;
        }
        boolean zM85644j = m85644j();
        boolean zM85644j2 = c14744gj.m85644j();
        if ((zM85644j || zM85644j2) && !(zM85644j && zM85644j2 && this.f61881a.equals(c14744gj.f61881a))) {
            return false;
        }
        boolean zM85645k = m85645k();
        boolean zM85645k2 = c14744gj.m85645k();
        if (zM85645k || zM85645k2) {
            return zM85645k && zM85645k2 && this.f61889g.equals(c14744gj.f61889g);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public void m85618a() {
    }

    @Override // com.xiaomi.push.InterfaceC14777hq
    /* JADX INFO: renamed from: a */
    public void mo85534a(quq0 quq0Var) {
        quq0Var.mo86226k();
        while (true) {
            guq0 guq0VarMo86222g = quq0Var.mo86222g();
            byte b = guq0VarMo86222g.f104457b;
            if (b == 0) {
                quq0Var.mo86208D();
                m85618a();
                return;
            }
            switch (guq0VarMo86222g.f104458c) {
                case 1:
                    if (b == 11) {
                        this.f61879a = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 2:
                    if (b == 11) {
                        this.f61884b = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 3:
                    if (b == 11) {
                        this.f61885c = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 4:
                    if (b == 10) {
                        this.f61878a = quq0Var.mo86219d();
                        m85620a(true);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 5:
                    if (b == 10) {
                        this.f61883b = quq0Var.mo86219d();
                        m85626b(true);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 6:
                    if (b == 2) {
                        this.f61882a = quq0Var.mo86240y();
                        m85630c(true);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 7:
                    if (b == 11) {
                        this.f61886d = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 8:
                    if (b == 11) {
                        this.f61887e = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 9:
                    if (b == 11) {
                        this.f61888f = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 10:
                    if (b == 13) {
                        iuq0 iuq0VarMo86224i = quq0Var.mo86224i();
                        this.f61881a = new HashMap(iuq0VarMo86224i.f115048c * 2);
                        for (int i = 0; i < iuq0VarMo86224i.f115048c; i++) {
                            this.f61881a.put(quq0Var.mo86220e(), quq0Var.mo86220e());
                        }
                        quq0Var.mo86210F();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 11:
                    if (b == 11) {
                        this.f61889g = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                default:
                    ruq0.m181208a(quq0Var, b);
                    break;
            }
            quq0Var.mo86209E();
        }
    }
}
