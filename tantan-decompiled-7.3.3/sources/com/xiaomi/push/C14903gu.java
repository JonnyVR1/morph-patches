package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import p153l.k3r0;
import p153l.m3r0;
import p153l.w3r0;
import p153l.x3r0;
import p153l.z3r0;

/* JADX INFO: renamed from: com.xiaomi.push.gu */
/* JADX INFO: loaded from: classes2.dex */
public class C14903gu implements InterfaceC14925hq<C14903gu, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public String f63053a;

    /* JADX INFO: renamed from: d */
    public String f63058d;

    /* JADX INFO: renamed from: a */
    private static final z3r0 f63046a = new z3r0("Target");

    /* JADX INFO: renamed from: a */
    private static final m3r0 f63045a = new m3r0("", (byte) 10, 1);

    /* JADX INFO: renamed from: b */
    private static final m3r0 f63047b = new m3r0("", (byte) 11, 2);

    /* JADX INFO: renamed from: c */
    private static final m3r0 f63048c = new m3r0("", (byte) 11, 3);

    /* JADX INFO: renamed from: d */
    private static final m3r0 f63049d = new m3r0("", (byte) 11, 4);

    /* JADX INFO: renamed from: e */
    private static final m3r0 f63050e = new m3r0("", (byte) 2, 5);

    /* JADX INFO: renamed from: f */
    private static final m3r0 f63051f = new m3r0("", (byte) 11, 7);

    /* JADX INFO: renamed from: a */
    private BitSet f63054a = new BitSet(2);

    /* JADX INFO: renamed from: a */
    public long f63052a = 5;

    /* JADX INFO: renamed from: b */
    public String f63056b = "xiaomi.com";

    /* JADX INFO: renamed from: c */
    public String f63057c = "";

    /* JADX INFO: renamed from: a */
    public boolean f63055a = false;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14903gu c14903gu) {
        int iM148146e;
        int iM148152k;
        int iM148146e2;
        int iM148146e3;
        int iM148146e4;
        int iM148144c;
        if (!getClass().equals(c14903gu.getClass())) {
            return getClass().getName().compareTo(c14903gu.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m86940a()).compareTo(Boolean.valueOf(c14903gu.m86940a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m86940a() && (iM148144c = k3r0.m148144c(this.f63052a, c14903gu.f63052a)) != 0) {
            return iM148144c;
        }
        int iCompareTo2 = Boolean.valueOf(m86943b()).compareTo(Boolean.valueOf(c14903gu.m86943b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m86943b() && (iM148146e4 = k3r0.m148146e(this.f63053a, c14903gu.f63053a)) != 0) {
            return iM148146e4;
        }
        int iCompareTo3 = Boolean.valueOf(m86944c()).compareTo(Boolean.valueOf(c14903gu.m86944c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m86944c() && (iM148146e3 = k3r0.m148146e(this.f63056b, c14903gu.f63056b)) != 0) {
            return iM148146e3;
        }
        int iCompareTo4 = Boolean.valueOf(m86945d()).compareTo(Boolean.valueOf(c14903gu.m86945d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m86945d() && (iM148146e2 = k3r0.m148146e(this.f63057c, c14903gu.f63057c)) != 0) {
            return iM148146e2;
        }
        int iCompareTo5 = Boolean.valueOf(m86946e()).compareTo(Boolean.valueOf(c14903gu.m86946e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m86946e() && (iM148152k = k3r0.m148152k(this.f63055a, c14903gu.f63055a)) != 0) {
            return iM148152k;
        }
        int iCompareTo6 = Boolean.valueOf(m86947f()).compareTo(Boolean.valueOf(c14903gu.m86947f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (!m86947f() || (iM148146e = k3r0.m148146e(this.f63058d, c14903gu.f63058d)) == 0) {
            return 0;
        }
        return iM148146e;
    }

    @Override // com.xiaomi.push.InterfaceC14925hq
    /* JADX INFO: renamed from: b */
    public void mo86711b(w3r0 w3r0Var) {
        m86938a();
        w3r0Var.mo87408v(f63046a);
        w3r0Var.mo87405s(f63045a);
        w3r0Var.mo87402p(this.f63052a);
        w3r0Var.mo87412z();
        if (this.f63053a != null) {
            w3r0Var.mo87405s(f63047b);
            w3r0Var.mo87403q(this.f63053a);
            w3r0Var.mo87412z();
        }
        if (this.f63056b != null && m86944c()) {
            w3r0Var.mo87405s(f63048c);
            w3r0Var.mo87403q(this.f63056b);
            w3r0Var.mo87412z();
        }
        if (this.f63057c != null && m86945d()) {
            w3r0Var.mo87405s(f63049d);
            w3r0Var.mo87403q(this.f63057c);
            w3r0Var.mo87412z();
        }
        if (m86946e()) {
            w3r0Var.mo87405s(f63050e);
            w3r0Var.mo87410x(this.f63055a);
            w3r0Var.mo87412z();
        }
        if (this.f63058d != null && m86947f()) {
            w3r0Var.mo87405s(f63051f);
            w3r0Var.mo87403q(this.f63058d);
            w3r0Var.mo87412z();
        }
        w3r0Var.mo87376A();
        w3r0Var.mo87399m();
    }

    /* JADX INFO: renamed from: c */
    public boolean m86944c() {
        return this.f63056b != null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m86945d() {
        return this.f63057c != null;
    }

    /* JADX INFO: renamed from: e */
    public boolean m86946e() {
        return this.f63054a.get(1);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C14903gu)) {
            return m86941a((C14903gu) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m86947f() {
        return this.f63058d != null;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Target(channelId:");
        sb.append(this.f63052a);
        sb.append(", ");
        sb.append("userId:");
        String str = this.f63053a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        if (m86944c()) {
            sb.append(", ");
            sb.append("server:");
            String str2 = this.f63056b;
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(str2);
            }
        }
        if (m86945d()) {
            sb.append(", ");
            sb.append("resource:");
            String str3 = this.f63057c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
        }
        if (m86946e()) {
            sb.append(", ");
            sb.append("isPreview:");
            sb.append(this.f63055a);
        }
        if (m86947f()) {
            sb.append(", ");
            sb.append("token:");
            String str4 = this.f63058d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public void m86942b(boolean z) {
        this.f63054a.set(1, z);
    }

    /* JADX INFO: renamed from: b */
    public boolean m86943b() {
        return this.f63053a != null;
    }

    /* JADX INFO: renamed from: a */
    public void m86939a(boolean z) {
        this.f63054a.set(0, z);
    }

    /* JADX INFO: renamed from: a */
    public boolean m86941a(C14903gu c14903gu) {
        if (c14903gu == null || this.f63052a != c14903gu.f63052a) {
            return false;
        }
        boolean zM86943b = m86943b();
        boolean zM86943b2 = c14903gu.m86943b();
        if ((zM86943b || zM86943b2) && !(zM86943b && zM86943b2 && this.f63053a.equals(c14903gu.f63053a))) {
            return false;
        }
        boolean zM86944c = m86944c();
        boolean zM86944c2 = c14903gu.m86944c();
        if ((zM86944c || zM86944c2) && !(zM86944c && zM86944c2 && this.f63056b.equals(c14903gu.f63056b))) {
            return false;
        }
        boolean zM86945d = m86945d();
        boolean zM86945d2 = c14903gu.m86945d();
        if ((zM86945d || zM86945d2) && !(zM86945d && zM86945d2 && this.f63057c.equals(c14903gu.f63057c))) {
            return false;
        }
        boolean zM86946e = m86946e();
        boolean zM86946e2 = c14903gu.m86946e();
        if ((zM86946e || zM86946e2) && !(zM86946e && zM86946e2 && this.f63055a == c14903gu.f63055a)) {
            return false;
        }
        boolean zM86947f = m86947f();
        boolean zM86947f2 = c14903gu.m86947f();
        if (zM86947f || zM86947f2) {
            return zM86947f && zM86947f2 && this.f63058d.equals(c14903gu.f63058d);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public boolean m86940a() {
        return this.f63054a.get(0);
    }

    @Override // com.xiaomi.push.InterfaceC14925hq
    /* JADX INFO: renamed from: a */
    public void mo86705a(w3r0 w3r0Var) {
        w3r0Var.mo87397k();
        while (true) {
            m3r0 m3r0VarMo87393g = w3r0Var.mo87393g();
            byte b = m3r0VarMo87393g.f134700b;
            if (b == 0) {
                break;
            }
            short s = m3r0VarMo87393g.f134701c;
            if (s != 1) {
                if (s != 2) {
                    if (s != 3) {
                        if (s != 4) {
                            if (s != 5) {
                                if (s != 7) {
                                    x3r0.m209259a(w3r0Var, b);
                                } else if (b == 11) {
                                    this.f63058d = w3r0Var.mo87391e();
                                } else {
                                    x3r0.m209259a(w3r0Var, b);
                                }
                            } else if (b == 2) {
                                this.f63055a = w3r0Var.mo87411y();
                                m86942b(true);
                            } else {
                                x3r0.m209259a(w3r0Var, b);
                            }
                        } else if (b == 11) {
                            this.f63057c = w3r0Var.mo87391e();
                        } else {
                            x3r0.m209259a(w3r0Var, b);
                        }
                    } else if (b == 11) {
                        this.f63056b = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                } else if (b == 11) {
                    this.f63053a = w3r0Var.mo87391e();
                } else {
                    x3r0.m209259a(w3r0Var, b);
                }
            } else if (b == 10) {
                this.f63052a = w3r0Var.mo87390d();
                m86939a(true);
            } else {
                x3r0.m209259a(w3r0Var, b);
            }
            w3r0Var.mo87380E();
        }
        w3r0Var.mo87379D();
        if (m86940a()) {
            m86938a();
        } else {
            throw new C14929ib("Required field 'channelId' was not found in serialized data! Struct: " + toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m86938a() throws C14929ib {
        if (this.f63053a != null) {
            return;
        }
        throw new C14929ib("Required field 'userId' was not present! Struct: " + toString());
    }
}
