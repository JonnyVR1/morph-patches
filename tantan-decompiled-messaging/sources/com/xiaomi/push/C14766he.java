package com.xiaomi.push;

import java.io.Serializable;
import java.nio.ByteBuffer;
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

/* JADX INFO: renamed from: com.xiaomi.push.he */
/* JADX INFO: loaded from: classes2.dex */
public class C14766he implements InterfaceC14777hq<C14766he, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public long f62377a;

    /* JADX INFO: renamed from: a */
    public C14755gu f62378a;

    /* JADX INFO: renamed from: a */
    public String f62379a;

    /* JADX INFO: renamed from: a */
    public ByteBuffer f62380a;

    /* JADX INFO: renamed from: a */
    private BitSet f62381a;

    /* JADX INFO: renamed from: a */
    public Map<String, String> f62382a;

    /* JADX INFO: renamed from: a */
    public boolean f62383a;

    /* JADX INFO: renamed from: b */
    public String f62384b;

    /* JADX INFO: renamed from: b */
    public boolean f62385b;

    /* JADX INFO: renamed from: c */
    public String f62386c;

    /* JADX INFO: renamed from: d */
    public String f62387d;

    /* JADX INFO: renamed from: e */
    public String f62388e;

    /* JADX INFO: renamed from: f */
    public String f62389f;

    /* JADX INFO: renamed from: g */
    public String f62390g;

    /* JADX INFO: renamed from: h */
    public String f62391h;

    /* JADX INFO: renamed from: i */
    public String f62392i;

    /* JADX INFO: renamed from: a */
    private static final tuq0 f62362a = new tuq0("XmPushActionNotification");

    /* JADX INFO: renamed from: a */
    private static final guq0 f62361a = new guq0("", (byte) 11, 1);

    /* JADX INFO: renamed from: b */
    private static final guq0 f62363b = new guq0("", (byte) 12, 2);

    /* JADX INFO: renamed from: c */
    private static final guq0 f62364c = new guq0("", (byte) 11, 3);

    /* JADX INFO: renamed from: d */
    private static final guq0 f62365d = new guq0("", (byte) 11, 4);

    /* JADX INFO: renamed from: e */
    private static final guq0 f62366e = new guq0("", (byte) 11, 5);

    /* JADX INFO: renamed from: f */
    private static final guq0 f62367f = new guq0("", (byte) 2, 6);

    /* JADX INFO: renamed from: g */
    private static final guq0 f62368g = new guq0("", (byte) 11, 7);

    /* JADX INFO: renamed from: h */
    private static final guq0 f62369h = new guq0("", HttpTokens.CARRIAGE_RETURN, 8);

    /* JADX INFO: renamed from: i */
    private static final guq0 f62370i = new guq0("", (byte) 11, 9);

    /* JADX INFO: renamed from: j */
    private static final guq0 f62371j = new guq0("", (byte) 11, 10);

    /* JADX INFO: renamed from: k */
    private static final guq0 f62372k = new guq0("", (byte) 11, 12);

    /* JADX INFO: renamed from: l */
    private static final guq0 f62373l = new guq0("", (byte) 11, 13);

    /* JADX INFO: renamed from: m */
    private static final guq0 f62374m = new guq0("", (byte) 11, 14);

    /* JADX INFO: renamed from: n */
    private static final guq0 f62375n = new guq0("", (byte) 10, 15);

    /* JADX INFO: renamed from: o */
    private static final guq0 f62376o = new guq0("", (byte) 2, 20);

    public C14766he() {
        this.f62381a = new BitSet(3);
        this.f62383a = true;
        this.f62385b = false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14766he c14766he) {
        int iM118200k;
        int iM118192c;
        int iM118193d;
        int iM118194e;
        int iM118194e2;
        int iM118194e3;
        int iM118194e4;
        int iM118197h;
        int iM118194e5;
        int iM118200k2;
        int iM118194e6;
        int iM118194e7;
        int iM118194e8;
        int iM118193d2;
        int iM118194e9;
        if (!getClass().equals(c14766he.getClass())) {
            return getClass().getName().compareTo(c14766he.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m85953a()).compareTo(Boolean.valueOf(c14766he.m85953a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m85953a() && (iM118194e9 = euq0.m118194e(this.f62379a, c14766he.f62379a)) != 0) {
            return iM118194e9;
        }
        int iCompareTo2 = Boolean.valueOf(m85959b()).compareTo(Boolean.valueOf(c14766he.m85959b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m85959b() && (iM118193d2 = euq0.m118193d(this.f62378a, c14766he.f62378a)) != 0) {
            return iM118193d2;
        }
        int iCompareTo3 = Boolean.valueOf(m85963c()).compareTo(Boolean.valueOf(c14766he.m85963c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m85963c() && (iM118194e8 = euq0.m118194e(this.f62384b, c14766he.f62384b)) != 0) {
            return iM118194e8;
        }
        int iCompareTo4 = Boolean.valueOf(m85966d()).compareTo(Boolean.valueOf(c14766he.m85966d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m85966d() && (iM118194e7 = euq0.m118194e(this.f62386c, c14766he.f62386c)) != 0) {
            return iM118194e7;
        }
        int iCompareTo5 = Boolean.valueOf(m85967e()).compareTo(Boolean.valueOf(c14766he.m85967e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m85967e() && (iM118194e6 = euq0.m118194e(this.f62387d, c14766he.f62387d)) != 0) {
            return iM118194e6;
        }
        int iCompareTo6 = Boolean.valueOf(m85968f()).compareTo(Boolean.valueOf(c14766he.m85968f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (m85968f() && (iM118200k2 = euq0.m118200k(this.f62383a, c14766he.f62383a)) != 0) {
            return iM118200k2;
        }
        int iCompareTo7 = Boolean.valueOf(m85969g()).compareTo(Boolean.valueOf(c14766he.m85969g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (m85969g() && (iM118194e5 = euq0.m118194e(this.f62388e, c14766he.f62388e)) != 0) {
            return iM118194e5;
        }
        int iCompareTo8 = Boolean.valueOf(m85970h()).compareTo(Boolean.valueOf(c14766he.m85970h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (m85970h() && (iM118197h = euq0.m118197h(this.f62382a, c14766he.f62382a)) != 0) {
            return iM118197h;
        }
        int iCompareTo9 = Boolean.valueOf(m85971i()).compareTo(Boolean.valueOf(c14766he.m85971i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (m85971i() && (iM118194e4 = euq0.m118194e(this.f62389f, c14766he.f62389f)) != 0) {
            return iM118194e4;
        }
        int iCompareTo10 = Boolean.valueOf(m85972j()).compareTo(Boolean.valueOf(c14766he.m85972j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (m85972j() && (iM118194e3 = euq0.m118194e(this.f62390g, c14766he.f62390g)) != 0) {
            return iM118194e3;
        }
        int iCompareTo11 = Boolean.valueOf(m85973k()).compareTo(Boolean.valueOf(c14766he.m85973k()));
        if (iCompareTo11 != 0) {
            return iCompareTo11;
        }
        if (m85973k() && (iM118194e2 = euq0.m118194e(this.f62391h, c14766he.f62391h)) != 0) {
            return iM118194e2;
        }
        int iCompareTo12 = Boolean.valueOf(m85974l()).compareTo(Boolean.valueOf(c14766he.m85974l()));
        if (iCompareTo12 != 0) {
            return iCompareTo12;
        }
        if (m85974l() && (iM118194e = euq0.m118194e(this.f62392i, c14766he.f62392i)) != 0) {
            return iM118194e;
        }
        int iCompareTo13 = Boolean.valueOf(m85975m()).compareTo(Boolean.valueOf(c14766he.m85975m()));
        if (iCompareTo13 != 0) {
            return iCompareTo13;
        }
        if (m85975m() && (iM118193d = euq0.m118193d(this.f62380a, c14766he.f62380a)) != 0) {
            return iM118193d;
        }
        int iCompareTo14 = Boolean.valueOf(m85976n()).compareTo(Boolean.valueOf(c14766he.m85976n()));
        if (iCompareTo14 != 0) {
            return iCompareTo14;
        }
        if (m85976n() && (iM118192c = euq0.m118192c(this.f62377a, c14766he.f62377a)) != 0) {
            return iM118192c;
        }
        int iCompareTo15 = Boolean.valueOf(m85977o()).compareTo(Boolean.valueOf(c14766he.m85977o()));
        if (iCompareTo15 != 0) {
            return iCompareTo15;
        }
        if (!m85977o() || (iM118200k = euq0.m118200k(this.f62385b, c14766he.f62385b)) == 0) {
            return 0;
        }
        return iM118200k;
    }

    @Override // com.xiaomi.push.InterfaceC14777hq
    /* JADX INFO: renamed from: b */
    public void mo85540b(quq0 quq0Var) throws C14781ib {
        m85950a();
        quq0Var.mo86237v(f62362a);
        if (this.f62379a != null && m85953a()) {
            quq0Var.mo86234s(f62361a);
            quq0Var.mo86232q(this.f62379a);
            quq0Var.mo86241z();
        }
        if (this.f62378a != null && m85959b()) {
            quq0Var.mo86234s(f62363b);
            this.f62378a.mo85540b(quq0Var);
            quq0Var.mo86241z();
        }
        if (this.f62384b != null) {
            quq0Var.mo86234s(f62364c);
            quq0Var.mo86232q(this.f62384b);
            quq0Var.mo86241z();
        }
        if (this.f62386c != null && m85966d()) {
            quq0Var.mo86234s(f62365d);
            quq0Var.mo86232q(this.f62386c);
            quq0Var.mo86241z();
        }
        if (this.f62387d != null && m85967e()) {
            quq0Var.mo86234s(f62366e);
            quq0Var.mo86232q(this.f62387d);
            quq0Var.mo86241z();
        }
        quq0Var.mo86234s(f62367f);
        quq0Var.mo86239x(this.f62383a);
        quq0Var.mo86241z();
        if (this.f62388e != null && m85969g()) {
            quq0Var.mo86234s(f62368g);
            quq0Var.mo86232q(this.f62388e);
            quq0Var.mo86241z();
        }
        if (this.f62382a != null && m85970h()) {
            quq0Var.mo86234s(f62369h);
            quq0Var.mo86236u(new iuq0((byte) 11, (byte) 11, this.f62382a.size()));
            for (Map.Entry<String, String> entry : this.f62382a.entrySet()) {
                quq0Var.mo86232q(entry.getKey());
                quq0Var.mo86232q(entry.getValue());
            }
            quq0Var.mo86206B();
            quq0Var.mo86241z();
        }
        if (this.f62389f != null && m85971i()) {
            quq0Var.mo86234s(f62370i);
            quq0Var.mo86232q(this.f62389f);
            quq0Var.mo86241z();
        }
        if (this.f62390g != null && m85972j()) {
            quq0Var.mo86234s(f62371j);
            quq0Var.mo86232q(this.f62390g);
            quq0Var.mo86241z();
        }
        if (this.f62391h != null && m85973k()) {
            quq0Var.mo86234s(f62372k);
            quq0Var.mo86232q(this.f62391h);
            quq0Var.mo86241z();
        }
        if (this.f62392i != null && m85974l()) {
            quq0Var.mo86234s(f62373l);
            quq0Var.mo86232q(this.f62392i);
            quq0Var.mo86241z();
        }
        if (this.f62380a != null && m85975m()) {
            quq0Var.mo86234s(f62374m);
            quq0Var.mo86233r(this.f62380a);
            quq0Var.mo86241z();
        }
        if (m85976n()) {
            quq0Var.mo86234s(f62375n);
            quq0Var.mo86231p(this.f62377a);
            quq0Var.mo86241z();
        }
        if (m85977o()) {
            quq0Var.mo86234s(f62376o);
            quq0Var.mo86239x(this.f62385b);
            quq0Var.mo86241z();
        }
        quq0Var.mo86205A();
        quq0Var.mo86228m();
    }

    /* JADX INFO: renamed from: c */
    public boolean m85963c() {
        return this.f62384b != null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m85966d() {
        return this.f62386c != null;
    }

    /* JADX INFO: renamed from: e */
    public boolean m85967e() {
        return this.f62387d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C14766he)) {
            return m85954a((C14766he) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m85968f() {
        return this.f62381a.get(0);
    }

    /* JADX INFO: renamed from: g */
    public boolean m85969g() {
        return this.f62388e != null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m85970h() {
        return this.f62382a != null;
    }

    public int hashCode() {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public boolean m85971i() {
        return this.f62389f != null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m85972j() {
        return this.f62390g != null;
    }

    /* JADX INFO: renamed from: k */
    public boolean m85973k() {
        return this.f62391h != null;
    }

    /* JADX INFO: renamed from: l */
    public boolean m85974l() {
        return this.f62392i != null;
    }

    /* JADX INFO: renamed from: m */
    public boolean m85975m() {
        return this.f62380a != null;
    }

    /* JADX INFO: renamed from: n */
    public boolean m85976n() {
        return this.f62381a.get(1);
    }

    /* JADX INFO: renamed from: o */
    public boolean m85977o() {
        return this.f62381a.get(2);
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionNotification(");
        boolean z2 = false;
        if (m85953a()) {
            sb.append("debug:");
            String str = this.f62379a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (m85959b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            C14755gu c14755gu = this.f62378a;
            if (c14755gu == null) {
                sb.append("null");
            } else {
                sb.append(c14755gu);
            }
        } else {
            z2 = z;
        }
        if (!z2) {
            sb.append(", ");
        }
        sb.append("id:");
        String str2 = this.f62384b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        if (m85966d()) {
            sb.append(", ");
            sb.append("appId:");
            String str3 = this.f62386c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
        }
        if (m85967e()) {
            sb.append(", ");
            sb.append("type:");
            String str4 = this.f62387d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        sb.append(", ");
        sb.append("requireAck:");
        sb.append(this.f62383a);
        if (m85969g()) {
            sb.append(", ");
            sb.append("payload:");
            String str5 = this.f62388e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (m85970h()) {
            sb.append(", ");
            sb.append("extra:");
            Map<String, String> map = this.f62382a;
            if (map == null) {
                sb.append("null");
            } else {
                sb.append(map);
            }
        }
        if (m85971i()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f62389f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (m85972j()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.f62390g;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        if (m85973k()) {
            sb.append(", ");
            sb.append("regId:");
            String str8 = this.f62391h;
            if (str8 == null) {
                sb.append("null");
            } else {
                sb.append(str8);
            }
        }
        if (m85974l()) {
            sb.append(", ");
            sb.append("aliasName:");
            String str9 = this.f62392i;
            if (str9 == null) {
                sb.append("null");
            } else {
                sb.append(str9);
            }
        }
        if (m85975m()) {
            sb.append(", ");
            sb.append("binaryExtra:");
            ByteBuffer byteBuffer = this.f62380a;
            if (byteBuffer == null) {
                sb.append("null");
            } else {
                euq0.m118204o(byteBuffer, sb);
            }
        }
        if (m85976n()) {
            sb.append(", ");
            sb.append("createdTs:");
            sb.append(this.f62377a);
        }
        if (m85977o()) {
            sb.append(", ");
            sb.append("alreadyLogClickInXmq:");
            sb.append(this.f62385b);
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public String m85961c() {
        return this.f62387d;
    }

    /* JADX INFO: renamed from: d */
    public String m85965d() {
        return this.f62389f;
    }

    /* JADX INFO: renamed from: c */
    public C14766he m85960c(String str) {
        this.f62387d = str;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public C14766he m85964d(String str) {
        this.f62389f = str;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public void m85962c(boolean z) {
        this.f62381a.set(2, z);
    }

    public C14766he(String str, boolean z) {
        this();
        this.f62384b = str;
        this.f62383a = z;
        m85952a(true);
    }

    /* JADX INFO: renamed from: b */
    public String m85957b() {
        return this.f62386c;
    }

    /* JADX INFO: renamed from: b */
    public C14766he m85956b(String str) {
        this.f62386c = str;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public void m85958b(boolean z) {
        this.f62381a.set(1, z);
    }

    /* JADX INFO: renamed from: b */
    public boolean m85959b() {
        return this.f62378a != null;
    }

    /* JADX INFO: renamed from: a */
    public C14755gu m85942a() {
        return this.f62378a;
    }

    /* JADX INFO: renamed from: a */
    public String m85948a() {
        return this.f62384b;
    }

    /* JADX INFO: renamed from: a */
    public C14766he m85943a(String str) {
        this.f62384b = str;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C14766he m85946a(boolean z) {
        this.f62383a = z;
        m85952a(true);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public void m85952a(boolean z) {
        this.f62381a.set(0, z);
    }

    /* JADX INFO: renamed from: a */
    public void m85951a(String str, String str2) {
        if (this.f62382a == null) {
            this.f62382a = new HashMap();
        }
        this.f62382a.put(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public Map<String, String> m85949a() {
        return this.f62382a;
    }

    /* JADX INFO: renamed from: a */
    public C14766he m85945a(Map<String, String> map) {
        this.f62382a = map;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public byte[] m85955a() {
        m85944a(euq0.m118203n(this.f62380a));
        return this.f62380a.array();
    }

    /* JADX INFO: renamed from: a */
    public C14766he m85947a(byte[] bArr) {
        m85944a(ByteBuffer.wrap(bArr));
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C14766he m85944a(ByteBuffer byteBuffer) {
        this.f62380a = byteBuffer;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public boolean m85954a(C14766he c14766he) {
        if (c14766he == null) {
            return false;
        }
        boolean zM85953a = m85953a();
        boolean zM85953a2 = c14766he.m85953a();
        if ((zM85953a || zM85953a2) && !(zM85953a && zM85953a2 && this.f62379a.equals(c14766he.f62379a))) {
            return false;
        }
        boolean zM85959b = m85959b();
        boolean zM85959b2 = c14766he.m85959b();
        if ((zM85959b || zM85959b2) && !(zM85959b && zM85959b2 && this.f62378a.m85770a(c14766he.f62378a))) {
            return false;
        }
        boolean zM85963c = m85963c();
        boolean zM85963c2 = c14766he.m85963c();
        if ((zM85963c || zM85963c2) && !(zM85963c && zM85963c2 && this.f62384b.equals(c14766he.f62384b))) {
            return false;
        }
        boolean zM85966d = m85966d();
        boolean zM85966d2 = c14766he.m85966d();
        if ((zM85966d || zM85966d2) && !(zM85966d && zM85966d2 && this.f62386c.equals(c14766he.f62386c))) {
            return false;
        }
        boolean zM85967e = m85967e();
        boolean zM85967e2 = c14766he.m85967e();
        if (((zM85967e || zM85967e2) && !(zM85967e && zM85967e2 && this.f62387d.equals(c14766he.f62387d))) || this.f62383a != c14766he.f62383a) {
            return false;
        }
        boolean zM85969g = m85969g();
        boolean zM85969g2 = c14766he.m85969g();
        if ((zM85969g || zM85969g2) && !(zM85969g && zM85969g2 && this.f62388e.equals(c14766he.f62388e))) {
            return false;
        }
        boolean zM85970h = m85970h();
        boolean zM85970h2 = c14766he.m85970h();
        if ((zM85970h || zM85970h2) && !(zM85970h && zM85970h2 && this.f62382a.equals(c14766he.f62382a))) {
            return false;
        }
        boolean zM85971i = m85971i();
        boolean zM85971i2 = c14766he.m85971i();
        if ((zM85971i || zM85971i2) && !(zM85971i && zM85971i2 && this.f62389f.equals(c14766he.f62389f))) {
            return false;
        }
        boolean zM85972j = m85972j();
        boolean zM85972j2 = c14766he.m85972j();
        if ((zM85972j || zM85972j2) && !(zM85972j && zM85972j2 && this.f62390g.equals(c14766he.f62390g))) {
            return false;
        }
        boolean zM85973k = m85973k();
        boolean zM85973k2 = c14766he.m85973k();
        if ((zM85973k || zM85973k2) && !(zM85973k && zM85973k2 && this.f62391h.equals(c14766he.f62391h))) {
            return false;
        }
        boolean zM85974l = m85974l();
        boolean zM85974l2 = c14766he.m85974l();
        if ((zM85974l || zM85974l2) && !(zM85974l && zM85974l2 && this.f62392i.equals(c14766he.f62392i))) {
            return false;
        }
        boolean zM85975m = m85975m();
        boolean zM85975m2 = c14766he.m85975m();
        if ((zM85975m || zM85975m2) && !(zM85975m && zM85975m2 && this.f62380a.equals(c14766he.f62380a))) {
            return false;
        }
        boolean zM85976n = m85976n();
        boolean zM85976n2 = c14766he.m85976n();
        if ((zM85976n || zM85976n2) && !(zM85976n && zM85976n2 && this.f62377a == c14766he.f62377a)) {
            return false;
        }
        boolean zM85977o = m85977o();
        boolean zM85977o2 = c14766he.m85977o();
        if (zM85977o || zM85977o2) {
            return zM85977o && zM85977o2 && this.f62385b == c14766he.f62385b;
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public boolean m85953a() {
        return this.f62379a != null;
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
                if (m85968f()) {
                    m85950a();
                    return;
                }
                throw new C14781ib("Required field 'requireAck' was not found in serialized data! Struct: " + toString());
            }
            switch (guq0VarMo86222g.f104458c) {
                case 1:
                    if (b == 11) {
                        this.f62379a = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 2:
                    if (b == 12) {
                        C14755gu c14755gu = new C14755gu();
                        this.f62378a = c14755gu;
                        c14755gu.mo85534a(quq0Var);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 3:
                    if (b == 11) {
                        this.f62384b = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 4:
                    if (b == 11) {
                        this.f62386c = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 5:
                    if (b == 11) {
                        this.f62387d = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 6:
                    if (b == 2) {
                        this.f62383a = quq0Var.mo86240y();
                        m85952a(true);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 7:
                    if (b == 11) {
                        this.f62388e = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 8:
                    if (b == 13) {
                        iuq0 iuq0VarMo86224i = quq0Var.mo86224i();
                        this.f62382a = new HashMap(iuq0VarMo86224i.f115048c * 2);
                        for (int i = 0; i < iuq0VarMo86224i.f115048c; i++) {
                            this.f62382a.put(quq0Var.mo86220e(), quq0Var.mo86220e());
                        }
                        quq0Var.mo86210F();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 9:
                    if (b == 11) {
                        this.f62389f = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 10:
                    if (b == 11) {
                        this.f62390g = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 11:
                case 16:
                case 17:
                case 18:
                case 19:
                default:
                    ruq0.m181208a(quq0Var, b);
                    break;
                case 12:
                    if (b == 11) {
                        this.f62391h = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 13:
                    if (b == 11) {
                        this.f62392i = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 14:
                    if (b == 11) {
                        this.f62380a = quq0Var.mo86221f();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 15:
                    if (b == 10) {
                        this.f62377a = quq0Var.mo86219d();
                        m85958b(true);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 20:
                    if (b == 2) {
                        this.f62385b = quq0Var.mo86240y();
                        m85962c(true);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
            }
            quq0Var.mo86209E();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m85950a() throws C14781ib {
        if (this.f62384b != null) {
            return;
        }
        throw new C14781ib("Required field 'id' was not present! Struct: " + toString());
    }
}
