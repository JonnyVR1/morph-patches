package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.jetty.http.HttpTokens;
import p153l.k3r0;
import p153l.m3r0;
import p153l.o3r0;
import p153l.w3r0;
import p153l.x3r0;
import p153l.z3r0;

/* JADX INFO: renamed from: com.xiaomi.push.gj */
/* JADX INFO: loaded from: classes2.dex */
public class C14892gj implements InterfaceC14925hq<C14892gj, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public long f62725a;

    /* JADX INFO: renamed from: a */
    public String f62726a;

    /* JADX INFO: renamed from: a */
    private BitSet f62727a = new BitSet(3);

    /* JADX INFO: renamed from: a */
    public Map<String, String> f62728a;

    /* JADX INFO: renamed from: a */
    public boolean f62729a;

    /* JADX INFO: renamed from: b */
    public long f62730b;

    /* JADX INFO: renamed from: b */
    public String f62731b;

    /* JADX INFO: renamed from: c */
    public String f62732c;

    /* JADX INFO: renamed from: d */
    public String f62733d;

    /* JADX INFO: renamed from: e */
    public String f62734e;

    /* JADX INFO: renamed from: f */
    public String f62735f;

    /* JADX INFO: renamed from: g */
    public String f62736g;

    /* JADX INFO: renamed from: a */
    private static final z3r0 f62714a = new z3r0("ClientUploadDataItem");

    /* JADX INFO: renamed from: a */
    private static final m3r0 f62713a = new m3r0("", (byte) 11, 1);

    /* JADX INFO: renamed from: b */
    private static final m3r0 f62715b = new m3r0("", (byte) 11, 2);

    /* JADX INFO: renamed from: c */
    private static final m3r0 f62716c = new m3r0("", (byte) 11, 3);

    /* JADX INFO: renamed from: d */
    private static final m3r0 f62717d = new m3r0("", (byte) 10, 4);

    /* JADX INFO: renamed from: e */
    private static final m3r0 f62718e = new m3r0("", (byte) 10, 5);

    /* JADX INFO: renamed from: f */
    private static final m3r0 f62719f = new m3r0("", (byte) 2, 6);

    /* JADX INFO: renamed from: g */
    private static final m3r0 f62720g = new m3r0("", (byte) 11, 7);

    /* JADX INFO: renamed from: h */
    private static final m3r0 f62721h = new m3r0("", (byte) 11, 8);

    /* JADX INFO: renamed from: i */
    private static final m3r0 f62722i = new m3r0("", (byte) 11, 9);

    /* JADX INFO: renamed from: j */
    private static final m3r0 f62723j = new m3r0("", HttpTokens.CARRIAGE_RETURN, 10);

    /* JADX INFO: renamed from: k */
    private static final m3r0 f62724k = new m3r0("", (byte) 11, 11);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14892gj c14892gj) {
        int iM148146e;
        int iM148149h;
        int iM148146e2;
        int iM148146e3;
        int iM148146e4;
        int iM148152k;
        int iM148144c;
        int iM148144c2;
        int iM148146e5;
        int iM148146e6;
        int iM148146e7;
        if (!getClass().equals(c14892gj.getClass())) {
            return getClass().getName().compareTo(c14892gj.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m86792a()).compareTo(Boolean.valueOf(c14892gj.m86792a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m86792a() && (iM148146e7 = k3r0.m148146e(this.f62726a, c14892gj.f62726a)) != 0) {
            return iM148146e7;
        }
        int iCompareTo2 = Boolean.valueOf(m86798b()).compareTo(Boolean.valueOf(c14892gj.m86798b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m86798b() && (iM148146e6 = k3r0.m148146e(this.f62731b, c14892gj.f62731b)) != 0) {
            return iM148146e6;
        }
        int iCompareTo3 = Boolean.valueOf(m86802c()).compareTo(Boolean.valueOf(c14892gj.m86802c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m86802c() && (iM148146e5 = k3r0.m148146e(this.f62732c, c14892gj.f62732c)) != 0) {
            return iM148146e5;
        }
        int iCompareTo4 = Boolean.valueOf(m86805d()).compareTo(Boolean.valueOf(c14892gj.m86805d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m86805d() && (iM148144c2 = k3r0.m148144c(this.f62725a, c14892gj.f62725a)) != 0) {
            return iM148144c2;
        }
        int iCompareTo5 = Boolean.valueOf(m86808e()).compareTo(Boolean.valueOf(c14892gj.m86808e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m86808e() && (iM148144c = k3r0.m148144c(this.f62730b, c14892gj.f62730b)) != 0) {
            return iM148144c;
        }
        int iCompareTo6 = Boolean.valueOf(m86810f()).compareTo(Boolean.valueOf(c14892gj.m86810f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (m86810f() && (iM148152k = k3r0.m148152k(this.f62729a, c14892gj.f62729a)) != 0) {
            return iM148152k;
        }
        int iCompareTo7 = Boolean.valueOf(m86812g()).compareTo(Boolean.valueOf(c14892gj.m86812g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (m86812g() && (iM148146e4 = k3r0.m148146e(this.f62733d, c14892gj.f62733d)) != 0) {
            return iM148146e4;
        }
        int iCompareTo8 = Boolean.valueOf(m86813h()).compareTo(Boolean.valueOf(c14892gj.m86813h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (m86813h() && (iM148146e3 = k3r0.m148146e(this.f62734e, c14892gj.f62734e)) != 0) {
            return iM148146e3;
        }
        int iCompareTo9 = Boolean.valueOf(m86814i()).compareTo(Boolean.valueOf(c14892gj.m86814i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (m86814i() && (iM148146e2 = k3r0.m148146e(this.f62735f, c14892gj.f62735f)) != 0) {
            return iM148146e2;
        }
        int iCompareTo10 = Boolean.valueOf(m86815j()).compareTo(Boolean.valueOf(c14892gj.m86815j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (m86815j() && (iM148149h = k3r0.m148149h(this.f62728a, c14892gj.f62728a)) != 0) {
            return iM148149h;
        }
        int iCompareTo11 = Boolean.valueOf(m86816k()).compareTo(Boolean.valueOf(c14892gj.m86816k()));
        if (iCompareTo11 != 0) {
            return iCompareTo11;
        }
        if (!m86816k() || (iM148146e = k3r0.m148146e(this.f62736g, c14892gj.f62736g)) == 0) {
            return 0;
        }
        return iM148146e;
    }

    @Override // com.xiaomi.push.InterfaceC14925hq
    /* JADX INFO: renamed from: b */
    public void mo86711b(w3r0 w3r0Var) {
        m86789a();
        w3r0Var.mo87408v(f62714a);
        if (this.f62726a != null && m86792a()) {
            w3r0Var.mo87405s(f62713a);
            w3r0Var.mo87403q(this.f62726a);
            w3r0Var.mo87412z();
        }
        if (this.f62731b != null && m86798b()) {
            w3r0Var.mo87405s(f62715b);
            w3r0Var.mo87403q(this.f62731b);
            w3r0Var.mo87412z();
        }
        if (this.f62732c != null && m86802c()) {
            w3r0Var.mo87405s(f62716c);
            w3r0Var.mo87403q(this.f62732c);
            w3r0Var.mo87412z();
        }
        if (m86805d()) {
            w3r0Var.mo87405s(f62717d);
            w3r0Var.mo87402p(this.f62725a);
            w3r0Var.mo87412z();
        }
        if (m86808e()) {
            w3r0Var.mo87405s(f62718e);
            w3r0Var.mo87402p(this.f62730b);
            w3r0Var.mo87412z();
        }
        if (m86810f()) {
            w3r0Var.mo87405s(f62719f);
            w3r0Var.mo87410x(this.f62729a);
            w3r0Var.mo87412z();
        }
        if (this.f62733d != null && m86812g()) {
            w3r0Var.mo87405s(f62720g);
            w3r0Var.mo87403q(this.f62733d);
            w3r0Var.mo87412z();
        }
        if (this.f62734e != null && m86813h()) {
            w3r0Var.mo87405s(f62721h);
            w3r0Var.mo87403q(this.f62734e);
            w3r0Var.mo87412z();
        }
        if (this.f62735f != null && m86814i()) {
            w3r0Var.mo87405s(f62722i);
            w3r0Var.mo87403q(this.f62735f);
            w3r0Var.mo87412z();
        }
        if (this.f62728a != null && m86815j()) {
            w3r0Var.mo87405s(f62723j);
            w3r0Var.mo87407u(new o3r0((byte) 11, (byte) 11, this.f62728a.size()));
            for (Map.Entry<String, String> entry : this.f62728a.entrySet()) {
                w3r0Var.mo87403q(entry.getKey());
                w3r0Var.mo87403q(entry.getValue());
            }
            w3r0Var.mo87377B();
            w3r0Var.mo87412z();
        }
        if (this.f62736g != null && m86816k()) {
            w3r0Var.mo87405s(f62724k);
            w3r0Var.mo87403q(this.f62736g);
            w3r0Var.mo87412z();
        }
        w3r0Var.mo87376A();
        w3r0Var.mo87399m();
    }

    /* JADX INFO: renamed from: c */
    public boolean m86802c() {
        return this.f62732c != null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m86805d() {
        return this.f62727a.get(0);
    }

    /* JADX INFO: renamed from: e */
    public boolean m86808e() {
        return this.f62727a.get(1);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C14892gj)) {
            return m86793a((C14892gj) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m86810f() {
        return this.f62727a.get(2);
    }

    /* JADX INFO: renamed from: g */
    public boolean m86812g() {
        return this.f62733d != null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m86813h() {
        return this.f62734e != null;
    }

    public int hashCode() {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public boolean m86814i() {
        return this.f62735f != null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m86815j() {
        return this.f62728a != null;
    }

    /* JADX INFO: renamed from: k */
    public boolean m86816k() {
        return this.f62736g != null;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("ClientUploadDataItem(");
        boolean z2 = false;
        if (m86792a()) {
            sb.append("channel:");
            String str = this.f62726a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (m86798b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("data:");
            String str2 = this.f62731b;
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(str2);
            }
            z = false;
        }
        if (m86802c()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("name:");
            String str3 = this.f62732c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
            z = false;
        }
        if (m86805d()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("counter:");
            sb.append(this.f62725a);
            z = false;
        }
        if (m86808e()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("timestamp:");
            sb.append(this.f62730b);
            z = false;
        }
        if (m86810f()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("fromSdk:");
            sb.append(this.f62729a);
            z = false;
        }
        if (m86812g()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("category:");
            String str4 = this.f62733d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
            z = false;
        }
        if (m86813h()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("sourcePackage:");
            String str5 = this.f62734e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
            z = false;
        }
        if (m86814i()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("id:");
            String str6 = this.f62735f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
            z = false;
        }
        if (m86815j()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("extra:");
            Map<String, String> map = this.f62728a;
            if (map == null) {
                sb.append("null");
            } else {
                sb.append(map);
            }
        } else {
            z2 = z;
        }
        if (m86816k()) {
            if (!z2) {
                sb.append(", ");
            }
            sb.append("pkgName:");
            String str7 = this.f62736g;
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
    public C14892gj m86799c(String str) {
        this.f62732c = str;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public C14892gj m86803d(String str) {
        this.f62733d = str;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public C14892gj m86806e(String str) {
        this.f62734e = str;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public C14892gj m86809f(String str) {
        this.f62735f = str;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public C14892gj m86811g(String str) {
        this.f62736g = str;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public void m86801c(boolean z) {
        this.f62727a.set(2, z);
    }

    /* JADX INFO: renamed from: d */
    public String m86804d() {
        return this.f62735f;
    }

    /* JADX INFO: renamed from: e */
    public String m86807e() {
        return this.f62736g;
    }

    /* JADX INFO: renamed from: c */
    public String m86800c() {
        return this.f62734e;
    }

    /* JADX INFO: renamed from: b */
    public boolean m86798b() {
        return this.f62731b != null;
    }

    /* JADX INFO: renamed from: b */
    public String m86796b() {
        return this.f62732c;
    }

    /* JADX INFO: renamed from: b */
    public C14892gj m86794b(long j) {
        this.f62730b = j;
        m86797b(true);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public void m86797b(boolean z) {
        this.f62727a.set(1, z);
    }

    /* JADX INFO: renamed from: b */
    public C14892gj m86795b(String str) {
        this.f62731b = str;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public String m86787a() {
        return this.f62726a;
    }

    /* JADX INFO: renamed from: a */
    public C14892gj m86784a(String str) {
        this.f62726a = str;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public boolean m86792a() {
        return this.f62726a != null;
    }

    /* JADX INFO: renamed from: a */
    public C14892gj m86783a(long j) {
        this.f62725a = j;
        m86791a(true);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public void m86791a(boolean z) {
        this.f62727a.set(0, z);
    }

    /* JADX INFO: renamed from: a */
    public long m86782a() {
        return this.f62730b;
    }

    /* JADX INFO: renamed from: a */
    public C14892gj m86786a(boolean z) {
        this.f62729a = z;
        m86801c(true);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public void m86790a(String str, String str2) {
        if (this.f62728a == null) {
            this.f62728a = new HashMap();
        }
        this.f62728a.put(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public Map<String, String> m86788a() {
        return this.f62728a;
    }

    /* JADX INFO: renamed from: a */
    public C14892gj m86785a(Map<String, String> map) {
        this.f62728a = map;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public boolean m86793a(C14892gj c14892gj) {
        if (c14892gj == null) {
            return false;
        }
        boolean zM86792a = m86792a();
        boolean zM86792a2 = c14892gj.m86792a();
        if ((zM86792a || zM86792a2) && !(zM86792a && zM86792a2 && this.f62726a.equals(c14892gj.f62726a))) {
            return false;
        }
        boolean zM86798b = m86798b();
        boolean zM86798b2 = c14892gj.m86798b();
        if ((zM86798b || zM86798b2) && !(zM86798b && zM86798b2 && this.f62731b.equals(c14892gj.f62731b))) {
            return false;
        }
        boolean zM86802c = m86802c();
        boolean zM86802c2 = c14892gj.m86802c();
        if ((zM86802c || zM86802c2) && !(zM86802c && zM86802c2 && this.f62732c.equals(c14892gj.f62732c))) {
            return false;
        }
        boolean zM86805d = m86805d();
        boolean zM86805d2 = c14892gj.m86805d();
        if ((zM86805d || zM86805d2) && !(zM86805d && zM86805d2 && this.f62725a == c14892gj.f62725a)) {
            return false;
        }
        boolean zM86808e = m86808e();
        boolean zM86808e2 = c14892gj.m86808e();
        if ((zM86808e || zM86808e2) && !(zM86808e && zM86808e2 && this.f62730b == c14892gj.f62730b)) {
            return false;
        }
        boolean zM86810f = m86810f();
        boolean zM86810f2 = c14892gj.m86810f();
        if ((zM86810f || zM86810f2) && !(zM86810f && zM86810f2 && this.f62729a == c14892gj.f62729a)) {
            return false;
        }
        boolean zM86812g = m86812g();
        boolean zM86812g2 = c14892gj.m86812g();
        if ((zM86812g || zM86812g2) && !(zM86812g && zM86812g2 && this.f62733d.equals(c14892gj.f62733d))) {
            return false;
        }
        boolean zM86813h = m86813h();
        boolean zM86813h2 = c14892gj.m86813h();
        if ((zM86813h || zM86813h2) && !(zM86813h && zM86813h2 && this.f62734e.equals(c14892gj.f62734e))) {
            return false;
        }
        boolean zM86814i = m86814i();
        boolean zM86814i2 = c14892gj.m86814i();
        if ((zM86814i || zM86814i2) && !(zM86814i && zM86814i2 && this.f62735f.equals(c14892gj.f62735f))) {
            return false;
        }
        boolean zM86815j = m86815j();
        boolean zM86815j2 = c14892gj.m86815j();
        if ((zM86815j || zM86815j2) && !(zM86815j && zM86815j2 && this.f62728a.equals(c14892gj.f62728a))) {
            return false;
        }
        boolean zM86816k = m86816k();
        boolean zM86816k2 = c14892gj.m86816k();
        if (zM86816k || zM86816k2) {
            return zM86816k && zM86816k2 && this.f62736g.equals(c14892gj.f62736g);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public void m86789a() {
    }

    @Override // com.xiaomi.push.InterfaceC14925hq
    /* JADX INFO: renamed from: a */
    public void mo86705a(w3r0 w3r0Var) {
        w3r0Var.mo87397k();
        while (true) {
            m3r0 m3r0VarMo87393g = w3r0Var.mo87393g();
            byte b = m3r0VarMo87393g.f134700b;
            if (b == 0) {
                w3r0Var.mo87379D();
                m86789a();
                return;
            }
            switch (m3r0VarMo87393g.f134701c) {
                case 1:
                    if (b == 11) {
                        this.f62726a = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 2:
                    if (b == 11) {
                        this.f62731b = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 3:
                    if (b == 11) {
                        this.f62732c = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 4:
                    if (b == 10) {
                        this.f62725a = w3r0Var.mo87390d();
                        m86791a(true);
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 5:
                    if (b == 10) {
                        this.f62730b = w3r0Var.mo87390d();
                        m86797b(true);
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 6:
                    if (b == 2) {
                        this.f62729a = w3r0Var.mo87411y();
                        m86801c(true);
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 7:
                    if (b == 11) {
                        this.f62733d = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 8:
                    if (b == 11) {
                        this.f62734e = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 9:
                    if (b == 11) {
                        this.f62735f = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 10:
                    if (b == 13) {
                        o3r0 o3r0VarMo87395i = w3r0Var.mo87395i();
                        this.f62728a = new HashMap(o3r0VarMo87395i.f144851c * 2);
                        for (int i = 0; i < o3r0VarMo87395i.f144851c; i++) {
                            this.f62728a.put(w3r0Var.mo87391e(), w3r0Var.mo87391e());
                        }
                        w3r0Var.mo87381F();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 11:
                    if (b == 11) {
                        this.f62736g = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                default:
                    x3r0.m209259a(w3r0Var, b);
                    break;
            }
            w3r0Var.mo87380E();
        }
    }
}
