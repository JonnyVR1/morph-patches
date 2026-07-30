package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import p149l.euq0;
import p149l.guq0;
import p149l.quq0;
import p149l.ruq0;
import p149l.tuq0;

/* JADX INFO: renamed from: com.xiaomi.push.gr */
/* JADX INFO: loaded from: classes2.dex */
public class C14752gr implements InterfaceC14777hq<C14752gr, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public long f62146a;

    /* JADX INFO: renamed from: a */
    public C14753gs f62147a;

    /* JADX INFO: renamed from: a */
    public C14755gu f62148a;

    /* JADX INFO: renamed from: a */
    public String f62149a;

    /* JADX INFO: renamed from: a */
    private BitSet f62150a = new BitSet(4);

    /* JADX INFO: renamed from: a */
    public boolean f62151a = false;

    /* JADX INFO: renamed from: b */
    public long f62152b;

    /* JADX INFO: renamed from: b */
    public String f62153b;

    /* JADX INFO: renamed from: c */
    public long f62154c;

    /* JADX INFO: renamed from: c */
    public String f62155c;

    /* JADX INFO: renamed from: d */
    public String f62156d;

    /* JADX INFO: renamed from: e */
    public String f62157e;

    /* JADX INFO: renamed from: f */
    public String f62158f;

    /* JADX INFO: renamed from: g */
    public String f62159g;

    /* JADX INFO: renamed from: h */
    public String f62160h;

    /* JADX INFO: renamed from: i */
    public String f62161i;

    /* JADX INFO: renamed from: j */
    public String f62162j;

    /* JADX INFO: renamed from: k */
    public String f62163k;

    /* JADX INFO: renamed from: l */
    public String f62164l;

    /* JADX INFO: renamed from: a */
    private static final tuq0 f62128a = new tuq0("PushMessage");

    /* JADX INFO: renamed from: a */
    private static final guq0 f62127a = new guq0("", (byte) 12, 1);

    /* JADX INFO: renamed from: b */
    private static final guq0 f62129b = new guq0("", (byte) 11, 2);

    /* JADX INFO: renamed from: c */
    private static final guq0 f62130c = new guq0("", (byte) 11, 3);

    /* JADX INFO: renamed from: d */
    private static final guq0 f62131d = new guq0("", (byte) 11, 4);

    /* JADX INFO: renamed from: e */
    private static final guq0 f62132e = new guq0("", (byte) 10, 5);

    /* JADX INFO: renamed from: f */
    private static final guq0 f62133f = new guq0("", (byte) 10, 6);

    /* JADX INFO: renamed from: g */
    private static final guq0 f62134g = new guq0("", (byte) 11, 7);

    /* JADX INFO: renamed from: h */
    private static final guq0 f62135h = new guq0("", (byte) 11, 8);

    /* JADX INFO: renamed from: i */
    private static final guq0 f62136i = new guq0("", (byte) 11, 9);

    /* JADX INFO: renamed from: j */
    private static final guq0 f62137j = new guq0("", (byte) 11, 10);

    /* JADX INFO: renamed from: k */
    private static final guq0 f62138k = new guq0("", (byte) 11, 11);

    /* JADX INFO: renamed from: l */
    private static final guq0 f62139l = new guq0("", (byte) 12, 12);

    /* JADX INFO: renamed from: m */
    private static final guq0 f62140m = new guq0("", (byte) 11, 13);

    /* JADX INFO: renamed from: n */
    private static final guq0 f62141n = new guq0("", (byte) 2, 14);

    /* JADX INFO: renamed from: o */
    private static final guq0 f62142o = new guq0("", (byte) 11, 15);

    /* JADX INFO: renamed from: p */
    private static final guq0 f62143p = new guq0("", (byte) 10, 16);

    /* JADX INFO: renamed from: q */
    private static final guq0 f62144q = new guq0("", (byte) 11, 20);

    /* JADX INFO: renamed from: r */
    private static final guq0 f62145r = new guq0("", (byte) 11, 21);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14752gr c14752gr) {
        int iM118194e;
        int iM118194e2;
        int iM118192c;
        int iM118194e3;
        int iM118200k;
        int iM118194e4;
        int iM118193d;
        int iM118194e5;
        int iM118194e6;
        int iM118194e7;
        int iM118194e8;
        int iM118194e9;
        int iM118192c2;
        int iM118192c3;
        int iM118194e10;
        int iM118194e11;
        int iM118194e12;
        int iM118193d2;
        if (!getClass().equals(c14752gr.getClass())) {
            return getClass().getName().compareTo(c14752gr.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m85697a()).compareTo(Boolean.valueOf(c14752gr.m85697a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m85697a() && (iM118193d2 = euq0.m118193d(this.f62148a, c14752gr.f62148a)) != 0) {
            return iM118193d2;
        }
        int iCompareTo2 = Boolean.valueOf(m85701b()).compareTo(Boolean.valueOf(c14752gr.m85701b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m85701b() && (iM118194e12 = euq0.m118194e(this.f62149a, c14752gr.f62149a)) != 0) {
            return iM118194e12;
        }
        int iCompareTo3 = Boolean.valueOf(m85704c()).compareTo(Boolean.valueOf(c14752gr.m85704c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m85704c() && (iM118194e11 = euq0.m118194e(this.f62153b, c14752gr.f62153b)) != 0) {
            return iM118194e11;
        }
        int iCompareTo4 = Boolean.valueOf(m85706d()).compareTo(Boolean.valueOf(c14752gr.m85706d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m85706d() && (iM118194e10 = euq0.m118194e(this.f62155c, c14752gr.f62155c)) != 0) {
            return iM118194e10;
        }
        int iCompareTo5 = Boolean.valueOf(m85707e()).compareTo(Boolean.valueOf(c14752gr.m85707e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m85707e() && (iM118192c3 = euq0.m118192c(this.f62146a, c14752gr.f62146a)) != 0) {
            return iM118192c3;
        }
        int iCompareTo6 = Boolean.valueOf(m85708f()).compareTo(Boolean.valueOf(c14752gr.m85708f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (m85708f() && (iM118192c2 = euq0.m118192c(this.f62152b, c14752gr.f62152b)) != 0) {
            return iM118192c2;
        }
        int iCompareTo7 = Boolean.valueOf(m85709g()).compareTo(Boolean.valueOf(c14752gr.m85709g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (m85709g() && (iM118194e9 = euq0.m118194e(this.f62156d, c14752gr.f62156d)) != 0) {
            return iM118194e9;
        }
        int iCompareTo8 = Boolean.valueOf(m85710h()).compareTo(Boolean.valueOf(c14752gr.m85710h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (m85710h() && (iM118194e8 = euq0.m118194e(this.f62157e, c14752gr.f62157e)) != 0) {
            return iM118194e8;
        }
        int iCompareTo9 = Boolean.valueOf(m85711i()).compareTo(Boolean.valueOf(c14752gr.m85711i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (m85711i() && (iM118194e7 = euq0.m118194e(this.f62158f, c14752gr.f62158f)) != 0) {
            return iM118194e7;
        }
        int iCompareTo10 = Boolean.valueOf(m85712j()).compareTo(Boolean.valueOf(c14752gr.m85712j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (m85712j() && (iM118194e6 = euq0.m118194e(this.f62159g, c14752gr.f62159g)) != 0) {
            return iM118194e6;
        }
        int iCompareTo11 = Boolean.valueOf(m85713k()).compareTo(Boolean.valueOf(c14752gr.m85713k()));
        if (iCompareTo11 != 0) {
            return iCompareTo11;
        }
        if (m85713k() && (iM118194e5 = euq0.m118194e(this.f62160h, c14752gr.f62160h)) != 0) {
            return iM118194e5;
        }
        int iCompareTo12 = Boolean.valueOf(m85714l()).compareTo(Boolean.valueOf(c14752gr.m85714l()));
        if (iCompareTo12 != 0) {
            return iCompareTo12;
        }
        if (m85714l() && (iM118193d = euq0.m118193d(this.f62147a, c14752gr.f62147a)) != 0) {
            return iM118193d;
        }
        int iCompareTo13 = Boolean.valueOf(m85715m()).compareTo(Boolean.valueOf(c14752gr.m85715m()));
        if (iCompareTo13 != 0) {
            return iCompareTo13;
        }
        if (m85715m() && (iM118194e4 = euq0.m118194e(this.f62161i, c14752gr.f62161i)) != 0) {
            return iM118194e4;
        }
        int iCompareTo14 = Boolean.valueOf(m85716n()).compareTo(Boolean.valueOf(c14752gr.m85716n()));
        if (iCompareTo14 != 0) {
            return iCompareTo14;
        }
        if (m85716n() && (iM118200k = euq0.m118200k(this.f62151a, c14752gr.f62151a)) != 0) {
            return iM118200k;
        }
        int iCompareTo15 = Boolean.valueOf(m85717o()).compareTo(Boolean.valueOf(c14752gr.m85717o()));
        if (iCompareTo15 != 0) {
            return iCompareTo15;
        }
        if (m85717o() && (iM118194e3 = euq0.m118194e(this.f62162j, c14752gr.f62162j)) != 0) {
            return iM118194e3;
        }
        int iCompareTo16 = Boolean.valueOf(m85718p()).compareTo(Boolean.valueOf(c14752gr.m85718p()));
        if (iCompareTo16 != 0) {
            return iCompareTo16;
        }
        if (m85718p() && (iM118192c = euq0.m118192c(this.f62154c, c14752gr.f62154c)) != 0) {
            return iM118192c;
        }
        int iCompareTo17 = Boolean.valueOf(m85719q()).compareTo(Boolean.valueOf(c14752gr.m85719q()));
        if (iCompareTo17 != 0) {
            return iCompareTo17;
        }
        if (m85719q() && (iM118194e2 = euq0.m118194e(this.f62163k, c14752gr.f62163k)) != 0) {
            return iM118194e2;
        }
        int iCompareTo18 = Boolean.valueOf(m85720r()).compareTo(Boolean.valueOf(c14752gr.m85720r()));
        if (iCompareTo18 != 0) {
            return iCompareTo18;
        }
        if (!m85720r() || (iM118194e = euq0.m118194e(this.f62164l, c14752gr.f62164l)) == 0) {
            return 0;
        }
        return iM118194e;
    }

    @Override // com.xiaomi.push.InterfaceC14777hq
    /* JADX INFO: renamed from: b */
    public void mo85540b(quq0 quq0Var) throws C14781ib {
        m85695a();
        quq0Var.mo86237v(f62128a);
        if (this.f62148a != null && m85697a()) {
            quq0Var.mo86234s(f62127a);
            this.f62148a.mo85540b(quq0Var);
            quq0Var.mo86241z();
        }
        if (this.f62149a != null) {
            quq0Var.mo86234s(f62129b);
            quq0Var.mo86232q(this.f62149a);
            quq0Var.mo86241z();
        }
        if (this.f62153b != null) {
            quq0Var.mo86234s(f62130c);
            quq0Var.mo86232q(this.f62153b);
            quq0Var.mo86241z();
        }
        if (this.f62155c != null) {
            quq0Var.mo86234s(f62131d);
            quq0Var.mo86232q(this.f62155c);
            quq0Var.mo86241z();
        }
        if (m85707e()) {
            quq0Var.mo86234s(f62132e);
            quq0Var.mo86231p(this.f62146a);
            quq0Var.mo86241z();
        }
        if (m85708f()) {
            quq0Var.mo86234s(f62133f);
            quq0Var.mo86231p(this.f62152b);
            quq0Var.mo86241z();
        }
        if (this.f62156d != null && m85709g()) {
            quq0Var.mo86234s(f62134g);
            quq0Var.mo86232q(this.f62156d);
            quq0Var.mo86241z();
        }
        if (this.f62157e != null && m85710h()) {
            quq0Var.mo86234s(f62135h);
            quq0Var.mo86232q(this.f62157e);
            quq0Var.mo86241z();
        }
        if (this.f62158f != null && m85711i()) {
            quq0Var.mo86234s(f62136i);
            quq0Var.mo86232q(this.f62158f);
            quq0Var.mo86241z();
        }
        if (this.f62159g != null && m85712j()) {
            quq0Var.mo86234s(f62137j);
            quq0Var.mo86232q(this.f62159g);
            quq0Var.mo86241z();
        }
        if (this.f62160h != null && m85713k()) {
            quq0Var.mo86234s(f62138k);
            quq0Var.mo86232q(this.f62160h);
            quq0Var.mo86241z();
        }
        if (this.f62147a != null && m85714l()) {
            quq0Var.mo86234s(f62139l);
            this.f62147a.mo85540b(quq0Var);
            quq0Var.mo86241z();
        }
        if (this.f62161i != null && m85715m()) {
            quq0Var.mo86234s(f62140m);
            quq0Var.mo86232q(this.f62161i);
            quq0Var.mo86241z();
        }
        if (m85716n()) {
            quq0Var.mo86234s(f62141n);
            quq0Var.mo86239x(this.f62151a);
            quq0Var.mo86241z();
        }
        if (this.f62162j != null && m85717o()) {
            quq0Var.mo86234s(f62142o);
            quq0Var.mo86232q(this.f62162j);
            quq0Var.mo86241z();
        }
        if (m85718p()) {
            quq0Var.mo86234s(f62143p);
            quq0Var.mo86231p(this.f62154c);
            quq0Var.mo86241z();
        }
        if (this.f62163k != null && m85719q()) {
            quq0Var.mo86234s(f62144q);
            quq0Var.mo86232q(this.f62163k);
            quq0Var.mo86241z();
        }
        if (this.f62164l != null && m85720r()) {
            quq0Var.mo86234s(f62145r);
            quq0Var.mo86232q(this.f62164l);
            quq0Var.mo86241z();
        }
        quq0Var.mo86205A();
        quq0Var.mo86228m();
    }

    /* JADX INFO: renamed from: c */
    public boolean m85704c() {
        return this.f62153b != null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m85706d() {
        return this.f62155c != null;
    }

    /* JADX INFO: renamed from: e */
    public boolean m85707e() {
        return this.f62150a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C14752gr)) {
            return m85698a((C14752gr) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m85708f() {
        return this.f62150a.get(1);
    }

    /* JADX INFO: renamed from: g */
    public boolean m85709g() {
        return this.f62156d != null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m85710h() {
        return this.f62157e != null;
    }

    public int hashCode() {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public boolean m85711i() {
        return this.f62158f != null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m85712j() {
        return this.f62159g != null;
    }

    /* JADX INFO: renamed from: k */
    public boolean m85713k() {
        return this.f62160h != null;
    }

    /* JADX INFO: renamed from: l */
    public boolean m85714l() {
        return this.f62147a != null;
    }

    /* JADX INFO: renamed from: m */
    public boolean m85715m() {
        return this.f62161i != null;
    }

    /* JADX INFO: renamed from: n */
    public boolean m85716n() {
        return this.f62150a.get(2);
    }

    /* JADX INFO: renamed from: o */
    public boolean m85717o() {
        return this.f62162j != null;
    }

    /* JADX INFO: renamed from: p */
    public boolean m85718p() {
        return this.f62150a.get(3);
    }

    /* JADX INFO: renamed from: q */
    public boolean m85719q() {
        return this.f62163k != null;
    }

    /* JADX INFO: renamed from: r */
    public boolean m85720r() {
        return this.f62164l != null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PushMessage(");
        if (m85697a()) {
            sb.append("to:");
            C14755gu c14755gu = this.f62148a;
            if (c14755gu == null) {
                sb.append("null");
            } else {
                sb.append(c14755gu);
            }
            sb.append(", ");
        }
        sb.append("id:");
        String str = this.f62149a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("appId:");
        String str2 = this.f62153b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("payload:");
        String str3 = this.f62155c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        if (m85707e()) {
            sb.append(", ");
            sb.append("createAt:");
            sb.append(this.f62146a);
        }
        if (m85708f()) {
            sb.append(", ");
            sb.append("ttl:");
            sb.append(this.f62152b);
        }
        if (m85709g()) {
            sb.append(", ");
            sb.append("collapseKey:");
            String str4 = this.f62156d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (m85710h()) {
            sb.append(", ");
            sb.append("packageName:");
            String str5 = this.f62157e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (m85711i()) {
            sb.append(", ");
            sb.append("regId:");
            String str6 = this.f62158f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (m85712j()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.f62159g;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        if (m85713k()) {
            sb.append(", ");
            sb.append("topic:");
            String str8 = this.f62160h;
            if (str8 == null) {
                sb.append("null");
            } else {
                sb.append(str8);
            }
        }
        if (m85714l()) {
            sb.append(", ");
            sb.append("metaInfo:");
            C14753gs c14753gs = this.f62147a;
            if (c14753gs == null) {
                sb.append("null");
            } else {
                sb.append(c14753gs);
            }
        }
        if (m85715m()) {
            sb.append(", ");
            sb.append("aliasName:");
            String str9 = this.f62161i;
            if (str9 == null) {
                sb.append("null");
            } else {
                sb.append(str9);
            }
        }
        if (m85716n()) {
            sb.append(", ");
            sb.append("isOnline:");
            sb.append(this.f62151a);
        }
        if (m85717o()) {
            sb.append(", ");
            sb.append("userAccount:");
            String str10 = this.f62162j;
            if (str10 == null) {
                sb.append("null");
            } else {
                sb.append(str10);
            }
        }
        if (m85718p()) {
            sb.append(", ");
            sb.append("miid:");
            sb.append(this.f62154c);
        }
        if (m85719q()) {
            sb.append(", ");
            sb.append("imeiMd5:");
            String str11 = this.f62163k;
            if (str11 == null) {
                sb.append("null");
            } else {
                sb.append(str11);
            }
        }
        if (m85720r()) {
            sb.append(", ");
            sb.append("deviceId:");
            String str12 = this.f62164l;
            if (str12 == null) {
                sb.append("null");
            } else {
                sb.append(str12);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public String m85702c() {
        return this.f62155c;
    }

    /* JADX INFO: renamed from: d */
    public void m85705d(boolean z) {
        this.f62150a.set(3, z);
    }

    /* JADX INFO: renamed from: c */
    public void m85703c(boolean z) {
        this.f62150a.set(2, z);
    }

    /* JADX INFO: renamed from: b */
    public String m85699b() {
        return this.f62153b;
    }

    /* JADX INFO: renamed from: b */
    public void m85700b(boolean z) {
        this.f62150a.set(1, z);
    }

    /* JADX INFO: renamed from: b */
    public boolean m85701b() {
        return this.f62149a != null;
    }

    /* JADX INFO: renamed from: a */
    public String m85694a() {
        return this.f62149a;
    }

    /* JADX INFO: renamed from: a */
    public long m85693a() {
        return this.f62146a;
    }

    /* JADX INFO: renamed from: a */
    public void m85696a(boolean z) {
        this.f62150a.set(0, z);
    }

    /* JADX INFO: renamed from: a */
    public boolean m85698a(C14752gr c14752gr) {
        if (c14752gr == null) {
            return false;
        }
        boolean zM85697a = m85697a();
        boolean zM85697a2 = c14752gr.m85697a();
        if ((zM85697a || zM85697a2) && !(zM85697a && zM85697a2 && this.f62148a.m85770a(c14752gr.f62148a))) {
            return false;
        }
        boolean zM85701b = m85701b();
        boolean zM85701b2 = c14752gr.m85701b();
        if ((zM85701b || zM85701b2) && !(zM85701b && zM85701b2 && this.f62149a.equals(c14752gr.f62149a))) {
            return false;
        }
        boolean zM85704c = m85704c();
        boolean zM85704c2 = c14752gr.m85704c();
        if ((zM85704c || zM85704c2) && !(zM85704c && zM85704c2 && this.f62153b.equals(c14752gr.f62153b))) {
            return false;
        }
        boolean zM85706d = m85706d();
        boolean zM85706d2 = c14752gr.m85706d();
        if ((zM85706d || zM85706d2) && !(zM85706d && zM85706d2 && this.f62155c.equals(c14752gr.f62155c))) {
            return false;
        }
        boolean zM85707e = m85707e();
        boolean zM85707e2 = c14752gr.m85707e();
        if ((zM85707e || zM85707e2) && !(zM85707e && zM85707e2 && this.f62146a == c14752gr.f62146a)) {
            return false;
        }
        boolean zM85708f = m85708f();
        boolean zM85708f2 = c14752gr.m85708f();
        if ((zM85708f || zM85708f2) && !(zM85708f && zM85708f2 && this.f62152b == c14752gr.f62152b)) {
            return false;
        }
        boolean zM85709g = m85709g();
        boolean zM85709g2 = c14752gr.m85709g();
        if ((zM85709g || zM85709g2) && !(zM85709g && zM85709g2 && this.f62156d.equals(c14752gr.f62156d))) {
            return false;
        }
        boolean zM85710h = m85710h();
        boolean zM85710h2 = c14752gr.m85710h();
        if ((zM85710h || zM85710h2) && !(zM85710h && zM85710h2 && this.f62157e.equals(c14752gr.f62157e))) {
            return false;
        }
        boolean zM85711i = m85711i();
        boolean zM85711i2 = c14752gr.m85711i();
        if ((zM85711i || zM85711i2) && !(zM85711i && zM85711i2 && this.f62158f.equals(c14752gr.f62158f))) {
            return false;
        }
        boolean zM85712j = m85712j();
        boolean zM85712j2 = c14752gr.m85712j();
        if ((zM85712j || zM85712j2) && !(zM85712j && zM85712j2 && this.f62159g.equals(c14752gr.f62159g))) {
            return false;
        }
        boolean zM85713k = m85713k();
        boolean zM85713k2 = c14752gr.m85713k();
        if ((zM85713k || zM85713k2) && !(zM85713k && zM85713k2 && this.f62160h.equals(c14752gr.f62160h))) {
            return false;
        }
        boolean zM85714l = m85714l();
        boolean zM85714l2 = c14752gr.m85714l();
        if ((zM85714l || zM85714l2) && !(zM85714l && zM85714l2 && this.f62147a.m85734a(c14752gr.f62147a))) {
            return false;
        }
        boolean zM85715m = m85715m();
        boolean zM85715m2 = c14752gr.m85715m();
        if ((zM85715m || zM85715m2) && !(zM85715m && zM85715m2 && this.f62161i.equals(c14752gr.f62161i))) {
            return false;
        }
        boolean zM85716n = m85716n();
        boolean zM85716n2 = c14752gr.m85716n();
        if ((zM85716n || zM85716n2) && !(zM85716n && zM85716n2 && this.f62151a == c14752gr.f62151a)) {
            return false;
        }
        boolean zM85717o = m85717o();
        boolean zM85717o2 = c14752gr.m85717o();
        if ((zM85717o || zM85717o2) && !(zM85717o && zM85717o2 && this.f62162j.equals(c14752gr.f62162j))) {
            return false;
        }
        boolean zM85718p = m85718p();
        boolean zM85718p2 = c14752gr.m85718p();
        if ((zM85718p || zM85718p2) && !(zM85718p && zM85718p2 && this.f62154c == c14752gr.f62154c)) {
            return false;
        }
        boolean zM85719q = m85719q();
        boolean zM85719q2 = c14752gr.m85719q();
        if ((zM85719q || zM85719q2) && !(zM85719q && zM85719q2 && this.f62163k.equals(c14752gr.f62163k))) {
            return false;
        }
        boolean zM85720r = m85720r();
        boolean zM85720r2 = c14752gr.m85720r();
        if (zM85720r || zM85720r2) {
            return zM85720r && zM85720r2 && this.f62164l.equals(c14752gr.f62164l);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public boolean m85697a() {
        return this.f62148a != null;
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
                m85695a();
                return;
            }
            short s = guq0VarMo86222g.f104458c;
            if (s != 20) {
                if (s != 21) {
                    switch (s) {
                        case 1:
                            if (b == 12) {
                                C14755gu c14755gu = new C14755gu();
                                this.f62148a = c14755gu;
                                c14755gu.mo85534a(quq0Var);
                            } else {
                                ruq0.m181208a(quq0Var, b);
                            }
                            break;
                        case 2:
                            if (b == 11) {
                                this.f62149a = quq0Var.mo86220e();
                            } else {
                                ruq0.m181208a(quq0Var, b);
                            }
                            break;
                        case 3:
                            if (b == 11) {
                                this.f62153b = quq0Var.mo86220e();
                            } else {
                                ruq0.m181208a(quq0Var, b);
                            }
                            break;
                        case 4:
                            if (b == 11) {
                                this.f62155c = quq0Var.mo86220e();
                            } else {
                                ruq0.m181208a(quq0Var, b);
                            }
                            break;
                        case 5:
                            if (b == 10) {
                                this.f62146a = quq0Var.mo86219d();
                                m85696a(true);
                            } else {
                                ruq0.m181208a(quq0Var, b);
                            }
                            break;
                        case 6:
                            if (b == 10) {
                                this.f62152b = quq0Var.mo86219d();
                                m85700b(true);
                            } else {
                                ruq0.m181208a(quq0Var, b);
                            }
                            break;
                        case 7:
                            if (b == 11) {
                                this.f62156d = quq0Var.mo86220e();
                            } else {
                                ruq0.m181208a(quq0Var, b);
                            }
                            break;
                        case 8:
                            if (b == 11) {
                                this.f62157e = quq0Var.mo86220e();
                            } else {
                                ruq0.m181208a(quq0Var, b);
                            }
                            break;
                        case 9:
                            if (b == 11) {
                                this.f62158f = quq0Var.mo86220e();
                            } else {
                                ruq0.m181208a(quq0Var, b);
                            }
                            break;
                        case 10:
                            if (b == 11) {
                                this.f62159g = quq0Var.mo86220e();
                            } else {
                                ruq0.m181208a(quq0Var, b);
                            }
                            break;
                        case 11:
                            if (b == 11) {
                                this.f62160h = quq0Var.mo86220e();
                            } else {
                                ruq0.m181208a(quq0Var, b);
                            }
                            break;
                        case 12:
                            if (b == 12) {
                                C14753gs c14753gs = new C14753gs();
                                this.f62147a = c14753gs;
                                c14753gs.mo85534a(quq0Var);
                            } else {
                                ruq0.m181208a(quq0Var, b);
                            }
                            break;
                        case 13:
                            if (b == 11) {
                                this.f62161i = quq0Var.mo86220e();
                            } else {
                                ruq0.m181208a(quq0Var, b);
                            }
                            break;
                        case 14:
                            if (b == 2) {
                                this.f62151a = quq0Var.mo86240y();
                                m85703c(true);
                            } else {
                                ruq0.m181208a(quq0Var, b);
                            }
                            break;
                        case 15:
                            if (b == 11) {
                                this.f62162j = quq0Var.mo86220e();
                            } else {
                                ruq0.m181208a(quq0Var, b);
                            }
                            break;
                        case 16:
                            if (b == 10) {
                                this.f62154c = quq0Var.mo86219d();
                                m85705d(true);
                            } else {
                                ruq0.m181208a(quq0Var, b);
                            }
                            break;
                        default:
                            ruq0.m181208a(quq0Var, b);
                            break;
                    }
                } else if (b == 11) {
                    this.f62164l = quq0Var.mo86220e();
                } else {
                    ruq0.m181208a(quq0Var, b);
                }
            } else if (b == 11) {
                this.f62163k = quq0Var.mo86220e();
            } else {
                ruq0.m181208a(quq0Var, b);
            }
            quq0Var.mo86209E();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m85695a() throws C14781ib {
        if (this.f62149a != null) {
            if (this.f62153b != null) {
                if (this.f62155c != null) {
                    return;
                }
                throw new C14781ib("Required field 'payload' was not present! Struct: " + toString());
            }
            throw new C14781ib("Required field 'appId' was not present! Struct: " + toString());
        }
        throw new C14781ib("Required field 'id' was not present! Struct: " + toString());
    }
}
