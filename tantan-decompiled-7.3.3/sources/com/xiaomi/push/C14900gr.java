package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import p153l.k3r0;
import p153l.m3r0;
import p153l.w3r0;
import p153l.x3r0;
import p153l.z3r0;

/* JADX INFO: renamed from: com.xiaomi.push.gr */
/* JADX INFO: loaded from: classes2.dex */
public class C14900gr implements InterfaceC14925hq<C14900gr, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public long f62993a;

    /* JADX INFO: renamed from: a */
    public C14901gs f62994a;

    /* JADX INFO: renamed from: a */
    public C14903gu f62995a;

    /* JADX INFO: renamed from: a */
    public String f62996a;

    /* JADX INFO: renamed from: a */
    private BitSet f62997a = new BitSet(4);

    /* JADX INFO: renamed from: a */
    public boolean f62998a = false;

    /* JADX INFO: renamed from: b */
    public long f62999b;

    /* JADX INFO: renamed from: b */
    public String f63000b;

    /* JADX INFO: renamed from: c */
    public long f63001c;

    /* JADX INFO: renamed from: c */
    public String f63002c;

    /* JADX INFO: renamed from: d */
    public String f63003d;

    /* JADX INFO: renamed from: e */
    public String f63004e;

    /* JADX INFO: renamed from: f */
    public String f63005f;

    /* JADX INFO: renamed from: g */
    public String f63006g;

    /* JADX INFO: renamed from: h */
    public String f63007h;

    /* JADX INFO: renamed from: i */
    public String f63008i;

    /* JADX INFO: renamed from: j */
    public String f63009j;

    /* JADX INFO: renamed from: k */
    public String f63010k;

    /* JADX INFO: renamed from: l */
    public String f63011l;

    /* JADX INFO: renamed from: a */
    private static final z3r0 f62975a = new z3r0("PushMessage");

    /* JADX INFO: renamed from: a */
    private static final m3r0 f62974a = new m3r0("", (byte) 12, 1);

    /* JADX INFO: renamed from: b */
    private static final m3r0 f62976b = new m3r0("", (byte) 11, 2);

    /* JADX INFO: renamed from: c */
    private static final m3r0 f62977c = new m3r0("", (byte) 11, 3);

    /* JADX INFO: renamed from: d */
    private static final m3r0 f62978d = new m3r0("", (byte) 11, 4);

    /* JADX INFO: renamed from: e */
    private static final m3r0 f62979e = new m3r0("", (byte) 10, 5);

    /* JADX INFO: renamed from: f */
    private static final m3r0 f62980f = new m3r0("", (byte) 10, 6);

    /* JADX INFO: renamed from: g */
    private static final m3r0 f62981g = new m3r0("", (byte) 11, 7);

    /* JADX INFO: renamed from: h */
    private static final m3r0 f62982h = new m3r0("", (byte) 11, 8);

    /* JADX INFO: renamed from: i */
    private static final m3r0 f62983i = new m3r0("", (byte) 11, 9);

    /* JADX INFO: renamed from: j */
    private static final m3r0 f62984j = new m3r0("", (byte) 11, 10);

    /* JADX INFO: renamed from: k */
    private static final m3r0 f62985k = new m3r0("", (byte) 11, 11);

    /* JADX INFO: renamed from: l */
    private static final m3r0 f62986l = new m3r0("", (byte) 12, 12);

    /* JADX INFO: renamed from: m */
    private static final m3r0 f62987m = new m3r0("", (byte) 11, 13);

    /* JADX INFO: renamed from: n */
    private static final m3r0 f62988n = new m3r0("", (byte) 2, 14);

    /* JADX INFO: renamed from: o */
    private static final m3r0 f62989o = new m3r0("", (byte) 11, 15);

    /* JADX INFO: renamed from: p */
    private static final m3r0 f62990p = new m3r0("", (byte) 10, 16);

    /* JADX INFO: renamed from: q */
    private static final m3r0 f62991q = new m3r0("", (byte) 11, 20);

    /* JADX INFO: renamed from: r */
    private static final m3r0 f62992r = new m3r0("", (byte) 11, 21);

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14900gr c14900gr) {
        int iM148146e;
        int iM148146e2;
        int iM148144c;
        int iM148146e3;
        int iM148152k;
        int iM148146e4;
        int iM148145d;
        int iM148146e5;
        int iM148146e6;
        int iM148146e7;
        int iM148146e8;
        int iM148146e9;
        int iM148144c2;
        int iM148144c3;
        int iM148146e10;
        int iM148146e11;
        int iM148146e12;
        int iM148145d2;
        if (!getClass().equals(c14900gr.getClass())) {
            return getClass().getName().compareTo(c14900gr.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m86868a()).compareTo(Boolean.valueOf(c14900gr.m86868a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m86868a() && (iM148145d2 = k3r0.m148145d(this.f62995a, c14900gr.f62995a)) != 0) {
            return iM148145d2;
        }
        int iCompareTo2 = Boolean.valueOf(m86872b()).compareTo(Boolean.valueOf(c14900gr.m86872b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m86872b() && (iM148146e12 = k3r0.m148146e(this.f62996a, c14900gr.f62996a)) != 0) {
            return iM148146e12;
        }
        int iCompareTo3 = Boolean.valueOf(m86875c()).compareTo(Boolean.valueOf(c14900gr.m86875c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m86875c() && (iM148146e11 = k3r0.m148146e(this.f63000b, c14900gr.f63000b)) != 0) {
            return iM148146e11;
        }
        int iCompareTo4 = Boolean.valueOf(m86877d()).compareTo(Boolean.valueOf(c14900gr.m86877d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m86877d() && (iM148146e10 = k3r0.m148146e(this.f63002c, c14900gr.f63002c)) != 0) {
            return iM148146e10;
        }
        int iCompareTo5 = Boolean.valueOf(m86878e()).compareTo(Boolean.valueOf(c14900gr.m86878e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m86878e() && (iM148144c3 = k3r0.m148144c(this.f62993a, c14900gr.f62993a)) != 0) {
            return iM148144c3;
        }
        int iCompareTo6 = Boolean.valueOf(m86879f()).compareTo(Boolean.valueOf(c14900gr.m86879f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (m86879f() && (iM148144c2 = k3r0.m148144c(this.f62999b, c14900gr.f62999b)) != 0) {
            return iM148144c2;
        }
        int iCompareTo7 = Boolean.valueOf(m86880g()).compareTo(Boolean.valueOf(c14900gr.m86880g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (m86880g() && (iM148146e9 = k3r0.m148146e(this.f63003d, c14900gr.f63003d)) != 0) {
            return iM148146e9;
        }
        int iCompareTo8 = Boolean.valueOf(m86881h()).compareTo(Boolean.valueOf(c14900gr.m86881h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (m86881h() && (iM148146e8 = k3r0.m148146e(this.f63004e, c14900gr.f63004e)) != 0) {
            return iM148146e8;
        }
        int iCompareTo9 = Boolean.valueOf(m86882i()).compareTo(Boolean.valueOf(c14900gr.m86882i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (m86882i() && (iM148146e7 = k3r0.m148146e(this.f63005f, c14900gr.f63005f)) != 0) {
            return iM148146e7;
        }
        int iCompareTo10 = Boolean.valueOf(m86883j()).compareTo(Boolean.valueOf(c14900gr.m86883j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (m86883j() && (iM148146e6 = k3r0.m148146e(this.f63006g, c14900gr.f63006g)) != 0) {
            return iM148146e6;
        }
        int iCompareTo11 = Boolean.valueOf(m86884k()).compareTo(Boolean.valueOf(c14900gr.m86884k()));
        if (iCompareTo11 != 0) {
            return iCompareTo11;
        }
        if (m86884k() && (iM148146e5 = k3r0.m148146e(this.f63007h, c14900gr.f63007h)) != 0) {
            return iM148146e5;
        }
        int iCompareTo12 = Boolean.valueOf(m86885l()).compareTo(Boolean.valueOf(c14900gr.m86885l()));
        if (iCompareTo12 != 0) {
            return iCompareTo12;
        }
        if (m86885l() && (iM148145d = k3r0.m148145d(this.f62994a, c14900gr.f62994a)) != 0) {
            return iM148145d;
        }
        int iCompareTo13 = Boolean.valueOf(m86886m()).compareTo(Boolean.valueOf(c14900gr.m86886m()));
        if (iCompareTo13 != 0) {
            return iCompareTo13;
        }
        if (m86886m() && (iM148146e4 = k3r0.m148146e(this.f63008i, c14900gr.f63008i)) != 0) {
            return iM148146e4;
        }
        int iCompareTo14 = Boolean.valueOf(m86887n()).compareTo(Boolean.valueOf(c14900gr.m86887n()));
        if (iCompareTo14 != 0) {
            return iCompareTo14;
        }
        if (m86887n() && (iM148152k = k3r0.m148152k(this.f62998a, c14900gr.f62998a)) != 0) {
            return iM148152k;
        }
        int iCompareTo15 = Boolean.valueOf(m86888o()).compareTo(Boolean.valueOf(c14900gr.m86888o()));
        if (iCompareTo15 != 0) {
            return iCompareTo15;
        }
        if (m86888o() && (iM148146e3 = k3r0.m148146e(this.f63009j, c14900gr.f63009j)) != 0) {
            return iM148146e3;
        }
        int iCompareTo16 = Boolean.valueOf(m86889p()).compareTo(Boolean.valueOf(c14900gr.m86889p()));
        if (iCompareTo16 != 0) {
            return iCompareTo16;
        }
        if (m86889p() && (iM148144c = k3r0.m148144c(this.f63001c, c14900gr.f63001c)) != 0) {
            return iM148144c;
        }
        int iCompareTo17 = Boolean.valueOf(m86890q()).compareTo(Boolean.valueOf(c14900gr.m86890q()));
        if (iCompareTo17 != 0) {
            return iCompareTo17;
        }
        if (m86890q() && (iM148146e2 = k3r0.m148146e(this.f63010k, c14900gr.f63010k)) != 0) {
            return iM148146e2;
        }
        int iCompareTo18 = Boolean.valueOf(m86891r()).compareTo(Boolean.valueOf(c14900gr.m86891r()));
        if (iCompareTo18 != 0) {
            return iCompareTo18;
        }
        if (!m86891r() || (iM148146e = k3r0.m148146e(this.f63011l, c14900gr.f63011l)) == 0) {
            return 0;
        }
        return iM148146e;
    }

    @Override // com.xiaomi.push.InterfaceC14925hq
    /* JADX INFO: renamed from: b */
    public void mo86711b(w3r0 w3r0Var) throws C14929ib {
        m86866a();
        w3r0Var.mo87408v(f62975a);
        if (this.f62995a != null && m86868a()) {
            w3r0Var.mo87405s(f62974a);
            this.f62995a.mo86711b(w3r0Var);
            w3r0Var.mo87412z();
        }
        if (this.f62996a != null) {
            w3r0Var.mo87405s(f62976b);
            w3r0Var.mo87403q(this.f62996a);
            w3r0Var.mo87412z();
        }
        if (this.f63000b != null) {
            w3r0Var.mo87405s(f62977c);
            w3r0Var.mo87403q(this.f63000b);
            w3r0Var.mo87412z();
        }
        if (this.f63002c != null) {
            w3r0Var.mo87405s(f62978d);
            w3r0Var.mo87403q(this.f63002c);
            w3r0Var.mo87412z();
        }
        if (m86878e()) {
            w3r0Var.mo87405s(f62979e);
            w3r0Var.mo87402p(this.f62993a);
            w3r0Var.mo87412z();
        }
        if (m86879f()) {
            w3r0Var.mo87405s(f62980f);
            w3r0Var.mo87402p(this.f62999b);
            w3r0Var.mo87412z();
        }
        if (this.f63003d != null && m86880g()) {
            w3r0Var.mo87405s(f62981g);
            w3r0Var.mo87403q(this.f63003d);
            w3r0Var.mo87412z();
        }
        if (this.f63004e != null && m86881h()) {
            w3r0Var.mo87405s(f62982h);
            w3r0Var.mo87403q(this.f63004e);
            w3r0Var.mo87412z();
        }
        if (this.f63005f != null && m86882i()) {
            w3r0Var.mo87405s(f62983i);
            w3r0Var.mo87403q(this.f63005f);
            w3r0Var.mo87412z();
        }
        if (this.f63006g != null && m86883j()) {
            w3r0Var.mo87405s(f62984j);
            w3r0Var.mo87403q(this.f63006g);
            w3r0Var.mo87412z();
        }
        if (this.f63007h != null && m86884k()) {
            w3r0Var.mo87405s(f62985k);
            w3r0Var.mo87403q(this.f63007h);
            w3r0Var.mo87412z();
        }
        if (this.f62994a != null && m86885l()) {
            w3r0Var.mo87405s(f62986l);
            this.f62994a.mo86711b(w3r0Var);
            w3r0Var.mo87412z();
        }
        if (this.f63008i != null && m86886m()) {
            w3r0Var.mo87405s(f62987m);
            w3r0Var.mo87403q(this.f63008i);
            w3r0Var.mo87412z();
        }
        if (m86887n()) {
            w3r0Var.mo87405s(f62988n);
            w3r0Var.mo87410x(this.f62998a);
            w3r0Var.mo87412z();
        }
        if (this.f63009j != null && m86888o()) {
            w3r0Var.mo87405s(f62989o);
            w3r0Var.mo87403q(this.f63009j);
            w3r0Var.mo87412z();
        }
        if (m86889p()) {
            w3r0Var.mo87405s(f62990p);
            w3r0Var.mo87402p(this.f63001c);
            w3r0Var.mo87412z();
        }
        if (this.f63010k != null && m86890q()) {
            w3r0Var.mo87405s(f62991q);
            w3r0Var.mo87403q(this.f63010k);
            w3r0Var.mo87412z();
        }
        if (this.f63011l != null && m86891r()) {
            w3r0Var.mo87405s(f62992r);
            w3r0Var.mo87403q(this.f63011l);
            w3r0Var.mo87412z();
        }
        w3r0Var.mo87376A();
        w3r0Var.mo87399m();
    }

    /* JADX INFO: renamed from: c */
    public boolean m86875c() {
        return this.f63000b != null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m86877d() {
        return this.f63002c != null;
    }

    /* JADX INFO: renamed from: e */
    public boolean m86878e() {
        return this.f62997a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C14900gr)) {
            return m86869a((C14900gr) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m86879f() {
        return this.f62997a.get(1);
    }

    /* JADX INFO: renamed from: g */
    public boolean m86880g() {
        return this.f63003d != null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m86881h() {
        return this.f63004e != null;
    }

    public int hashCode() {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public boolean m86882i() {
        return this.f63005f != null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m86883j() {
        return this.f63006g != null;
    }

    /* JADX INFO: renamed from: k */
    public boolean m86884k() {
        return this.f63007h != null;
    }

    /* JADX INFO: renamed from: l */
    public boolean m86885l() {
        return this.f62994a != null;
    }

    /* JADX INFO: renamed from: m */
    public boolean m86886m() {
        return this.f63008i != null;
    }

    /* JADX INFO: renamed from: n */
    public boolean m86887n() {
        return this.f62997a.get(2);
    }

    /* JADX INFO: renamed from: o */
    public boolean m86888o() {
        return this.f63009j != null;
    }

    /* JADX INFO: renamed from: p */
    public boolean m86889p() {
        return this.f62997a.get(3);
    }

    /* JADX INFO: renamed from: q */
    public boolean m86890q() {
        return this.f63010k != null;
    }

    /* JADX INFO: renamed from: r */
    public boolean m86891r() {
        return this.f63011l != null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PushMessage(");
        if (m86868a()) {
            sb.append("to:");
            C14903gu c14903gu = this.f62995a;
            if (c14903gu == null) {
                sb.append("null");
            } else {
                sb.append(c14903gu);
            }
            sb.append(", ");
        }
        sb.append("id:");
        String str = this.f62996a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("appId:");
        String str2 = this.f63000b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(", ");
        sb.append("payload:");
        String str3 = this.f63002c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        if (m86878e()) {
            sb.append(", ");
            sb.append("createAt:");
            sb.append(this.f62993a);
        }
        if (m86879f()) {
            sb.append(", ");
            sb.append("ttl:");
            sb.append(this.f62999b);
        }
        if (m86880g()) {
            sb.append(", ");
            sb.append("collapseKey:");
            String str4 = this.f63003d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (m86881h()) {
            sb.append(", ");
            sb.append("packageName:");
            String str5 = this.f63004e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (m86882i()) {
            sb.append(", ");
            sb.append("regId:");
            String str6 = this.f63005f;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (m86883j()) {
            sb.append(", ");
            sb.append("category:");
            String str7 = this.f63006g;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        if (m86884k()) {
            sb.append(", ");
            sb.append("topic:");
            String str8 = this.f63007h;
            if (str8 == null) {
                sb.append("null");
            } else {
                sb.append(str8);
            }
        }
        if (m86885l()) {
            sb.append(", ");
            sb.append("metaInfo:");
            C14901gs c14901gs = this.f62994a;
            if (c14901gs == null) {
                sb.append("null");
            } else {
                sb.append(c14901gs);
            }
        }
        if (m86886m()) {
            sb.append(", ");
            sb.append("aliasName:");
            String str9 = this.f63008i;
            if (str9 == null) {
                sb.append("null");
            } else {
                sb.append(str9);
            }
        }
        if (m86887n()) {
            sb.append(", ");
            sb.append("isOnline:");
            sb.append(this.f62998a);
        }
        if (m86888o()) {
            sb.append(", ");
            sb.append("userAccount:");
            String str10 = this.f63009j;
            if (str10 == null) {
                sb.append("null");
            } else {
                sb.append(str10);
            }
        }
        if (m86889p()) {
            sb.append(", ");
            sb.append("miid:");
            sb.append(this.f63001c);
        }
        if (m86890q()) {
            sb.append(", ");
            sb.append("imeiMd5:");
            String str11 = this.f63010k;
            if (str11 == null) {
                sb.append("null");
            } else {
                sb.append(str11);
            }
        }
        if (m86891r()) {
            sb.append(", ");
            sb.append("deviceId:");
            String str12 = this.f63011l;
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
    public String m86873c() {
        return this.f63002c;
    }

    /* JADX INFO: renamed from: d */
    public void m86876d(boolean z) {
        this.f62997a.set(3, z);
    }

    /* JADX INFO: renamed from: c */
    public void m86874c(boolean z) {
        this.f62997a.set(2, z);
    }

    /* JADX INFO: renamed from: b */
    public String m86870b() {
        return this.f63000b;
    }

    /* JADX INFO: renamed from: b */
    public void m86871b(boolean z) {
        this.f62997a.set(1, z);
    }

    /* JADX INFO: renamed from: b */
    public boolean m86872b() {
        return this.f62996a != null;
    }

    /* JADX INFO: renamed from: a */
    public String m86865a() {
        return this.f62996a;
    }

    /* JADX INFO: renamed from: a */
    public long m86864a() {
        return this.f62993a;
    }

    /* JADX INFO: renamed from: a */
    public void m86867a(boolean z) {
        this.f62997a.set(0, z);
    }

    /* JADX INFO: renamed from: a */
    public boolean m86869a(C14900gr c14900gr) {
        if (c14900gr == null) {
            return false;
        }
        boolean zM86868a = m86868a();
        boolean zM86868a2 = c14900gr.m86868a();
        if ((zM86868a || zM86868a2) && !(zM86868a && zM86868a2 && this.f62995a.m86941a(c14900gr.f62995a))) {
            return false;
        }
        boolean zM86872b = m86872b();
        boolean zM86872b2 = c14900gr.m86872b();
        if ((zM86872b || zM86872b2) && !(zM86872b && zM86872b2 && this.f62996a.equals(c14900gr.f62996a))) {
            return false;
        }
        boolean zM86875c = m86875c();
        boolean zM86875c2 = c14900gr.m86875c();
        if ((zM86875c || zM86875c2) && !(zM86875c && zM86875c2 && this.f63000b.equals(c14900gr.f63000b))) {
            return false;
        }
        boolean zM86877d = m86877d();
        boolean zM86877d2 = c14900gr.m86877d();
        if ((zM86877d || zM86877d2) && !(zM86877d && zM86877d2 && this.f63002c.equals(c14900gr.f63002c))) {
            return false;
        }
        boolean zM86878e = m86878e();
        boolean zM86878e2 = c14900gr.m86878e();
        if ((zM86878e || zM86878e2) && !(zM86878e && zM86878e2 && this.f62993a == c14900gr.f62993a)) {
            return false;
        }
        boolean zM86879f = m86879f();
        boolean zM86879f2 = c14900gr.m86879f();
        if ((zM86879f || zM86879f2) && !(zM86879f && zM86879f2 && this.f62999b == c14900gr.f62999b)) {
            return false;
        }
        boolean zM86880g = m86880g();
        boolean zM86880g2 = c14900gr.m86880g();
        if ((zM86880g || zM86880g2) && !(zM86880g && zM86880g2 && this.f63003d.equals(c14900gr.f63003d))) {
            return false;
        }
        boolean zM86881h = m86881h();
        boolean zM86881h2 = c14900gr.m86881h();
        if ((zM86881h || zM86881h2) && !(zM86881h && zM86881h2 && this.f63004e.equals(c14900gr.f63004e))) {
            return false;
        }
        boolean zM86882i = m86882i();
        boolean zM86882i2 = c14900gr.m86882i();
        if ((zM86882i || zM86882i2) && !(zM86882i && zM86882i2 && this.f63005f.equals(c14900gr.f63005f))) {
            return false;
        }
        boolean zM86883j = m86883j();
        boolean zM86883j2 = c14900gr.m86883j();
        if ((zM86883j || zM86883j2) && !(zM86883j && zM86883j2 && this.f63006g.equals(c14900gr.f63006g))) {
            return false;
        }
        boolean zM86884k = m86884k();
        boolean zM86884k2 = c14900gr.m86884k();
        if ((zM86884k || zM86884k2) && !(zM86884k && zM86884k2 && this.f63007h.equals(c14900gr.f63007h))) {
            return false;
        }
        boolean zM86885l = m86885l();
        boolean zM86885l2 = c14900gr.m86885l();
        if ((zM86885l || zM86885l2) && !(zM86885l && zM86885l2 && this.f62994a.m86905a(c14900gr.f62994a))) {
            return false;
        }
        boolean zM86886m = m86886m();
        boolean zM86886m2 = c14900gr.m86886m();
        if ((zM86886m || zM86886m2) && !(zM86886m && zM86886m2 && this.f63008i.equals(c14900gr.f63008i))) {
            return false;
        }
        boolean zM86887n = m86887n();
        boolean zM86887n2 = c14900gr.m86887n();
        if ((zM86887n || zM86887n2) && !(zM86887n && zM86887n2 && this.f62998a == c14900gr.f62998a)) {
            return false;
        }
        boolean zM86888o = m86888o();
        boolean zM86888o2 = c14900gr.m86888o();
        if ((zM86888o || zM86888o2) && !(zM86888o && zM86888o2 && this.f63009j.equals(c14900gr.f63009j))) {
            return false;
        }
        boolean zM86889p = m86889p();
        boolean zM86889p2 = c14900gr.m86889p();
        if ((zM86889p || zM86889p2) && !(zM86889p && zM86889p2 && this.f63001c == c14900gr.f63001c)) {
            return false;
        }
        boolean zM86890q = m86890q();
        boolean zM86890q2 = c14900gr.m86890q();
        if ((zM86890q || zM86890q2) && !(zM86890q && zM86890q2 && this.f63010k.equals(c14900gr.f63010k))) {
            return false;
        }
        boolean zM86891r = m86891r();
        boolean zM86891r2 = c14900gr.m86891r();
        if (zM86891r || zM86891r2) {
            return zM86891r && zM86891r2 && this.f63011l.equals(c14900gr.f63011l);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public boolean m86868a() {
        return this.f62995a != null;
    }

    @Override // com.xiaomi.push.InterfaceC14925hq
    /* JADX INFO: renamed from: a */
    public void mo86705a(w3r0 w3r0Var) throws C14929ib {
        w3r0Var.mo87397k();
        while (true) {
            m3r0 m3r0VarMo87393g = w3r0Var.mo87393g();
            byte b = m3r0VarMo87393g.f134700b;
            if (b == 0) {
                w3r0Var.mo87379D();
                m86866a();
                return;
            }
            short s = m3r0VarMo87393g.f134701c;
            if (s != 20) {
                if (s != 21) {
                    switch (s) {
                        case 1:
                            if (b == 12) {
                                C14903gu c14903gu = new C14903gu();
                                this.f62995a = c14903gu;
                                c14903gu.mo86705a(w3r0Var);
                            } else {
                                x3r0.m209259a(w3r0Var, b);
                            }
                            break;
                        case 2:
                            if (b == 11) {
                                this.f62996a = w3r0Var.mo87391e();
                            } else {
                                x3r0.m209259a(w3r0Var, b);
                            }
                            break;
                        case 3:
                            if (b == 11) {
                                this.f63000b = w3r0Var.mo87391e();
                            } else {
                                x3r0.m209259a(w3r0Var, b);
                            }
                            break;
                        case 4:
                            if (b == 11) {
                                this.f63002c = w3r0Var.mo87391e();
                            } else {
                                x3r0.m209259a(w3r0Var, b);
                            }
                            break;
                        case 5:
                            if (b == 10) {
                                this.f62993a = w3r0Var.mo87390d();
                                m86867a(true);
                            } else {
                                x3r0.m209259a(w3r0Var, b);
                            }
                            break;
                        case 6:
                            if (b == 10) {
                                this.f62999b = w3r0Var.mo87390d();
                                m86871b(true);
                            } else {
                                x3r0.m209259a(w3r0Var, b);
                            }
                            break;
                        case 7:
                            if (b == 11) {
                                this.f63003d = w3r0Var.mo87391e();
                            } else {
                                x3r0.m209259a(w3r0Var, b);
                            }
                            break;
                        case 8:
                            if (b == 11) {
                                this.f63004e = w3r0Var.mo87391e();
                            } else {
                                x3r0.m209259a(w3r0Var, b);
                            }
                            break;
                        case 9:
                            if (b == 11) {
                                this.f63005f = w3r0Var.mo87391e();
                            } else {
                                x3r0.m209259a(w3r0Var, b);
                            }
                            break;
                        case 10:
                            if (b == 11) {
                                this.f63006g = w3r0Var.mo87391e();
                            } else {
                                x3r0.m209259a(w3r0Var, b);
                            }
                            break;
                        case 11:
                            if (b == 11) {
                                this.f63007h = w3r0Var.mo87391e();
                            } else {
                                x3r0.m209259a(w3r0Var, b);
                            }
                            break;
                        case 12:
                            if (b == 12) {
                                C14901gs c14901gs = new C14901gs();
                                this.f62994a = c14901gs;
                                c14901gs.mo86705a(w3r0Var);
                            } else {
                                x3r0.m209259a(w3r0Var, b);
                            }
                            break;
                        case 13:
                            if (b == 11) {
                                this.f63008i = w3r0Var.mo87391e();
                            } else {
                                x3r0.m209259a(w3r0Var, b);
                            }
                            break;
                        case 14:
                            if (b == 2) {
                                this.f62998a = w3r0Var.mo87411y();
                                m86874c(true);
                            } else {
                                x3r0.m209259a(w3r0Var, b);
                            }
                            break;
                        case 15:
                            if (b == 11) {
                                this.f63009j = w3r0Var.mo87391e();
                            } else {
                                x3r0.m209259a(w3r0Var, b);
                            }
                            break;
                        case 16:
                            if (b == 10) {
                                this.f63001c = w3r0Var.mo87390d();
                                m86876d(true);
                            } else {
                                x3r0.m209259a(w3r0Var, b);
                            }
                            break;
                        default:
                            x3r0.m209259a(w3r0Var, b);
                            break;
                    }
                } else if (b == 11) {
                    this.f63011l = w3r0Var.mo87391e();
                } else {
                    x3r0.m209259a(w3r0Var, b);
                }
            } else if (b == 11) {
                this.f63010k = w3r0Var.mo87391e();
            } else {
                x3r0.m209259a(w3r0Var, b);
            }
            w3r0Var.mo87380E();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m86866a() throws C14929ib {
        if (this.f62996a != null) {
            if (this.f63000b != null) {
                if (this.f63002c != null) {
                    return;
                }
                throw new C14929ib("Required field 'payload' was not present! Struct: " + toString());
            }
            throw new C14929ib("Required field 'appId' was not present! Struct: " + toString());
        }
        throw new C14929ib("Required field 'id' was not present! Struct: " + toString());
    }
}
