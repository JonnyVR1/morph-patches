package com.xiaomi.push;

import java.io.Serializable;
import java.util.BitSet;
import p149l.euq0;
import p149l.guq0;
import p149l.quq0;
import p149l.ruq0;
import p149l.tuq0;

/* JADX INFO: renamed from: com.xiaomi.push.gu */
/* JADX INFO: loaded from: classes2.dex */
public class C14755gu implements InterfaceC14777hq<C14755gu, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public String f62206a;

    /* JADX INFO: renamed from: d */
    public String f62211d;

    /* JADX INFO: renamed from: a */
    private static final tuq0 f62199a = new tuq0("Target");

    /* JADX INFO: renamed from: a */
    private static final guq0 f62198a = new guq0("", (byte) 10, 1);

    /* JADX INFO: renamed from: b */
    private static final guq0 f62200b = new guq0("", (byte) 11, 2);

    /* JADX INFO: renamed from: c */
    private static final guq0 f62201c = new guq0("", (byte) 11, 3);

    /* JADX INFO: renamed from: d */
    private static final guq0 f62202d = new guq0("", (byte) 11, 4);

    /* JADX INFO: renamed from: e */
    private static final guq0 f62203e = new guq0("", (byte) 2, 5);

    /* JADX INFO: renamed from: f */
    private static final guq0 f62204f = new guq0("", (byte) 11, 7);

    /* JADX INFO: renamed from: a */
    private BitSet f62207a = new BitSet(2);

    /* JADX INFO: renamed from: a */
    public long f62205a = 5;

    /* JADX INFO: renamed from: b */
    public String f62209b = "xiaomi.com";

    /* JADX INFO: renamed from: c */
    public String f62210c = "";

    /* JADX INFO: renamed from: a */
    public boolean f62208a = false;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14755gu c14755gu) {
        int iM118194e;
        int iM118200k;
        int iM118194e2;
        int iM118194e3;
        int iM118194e4;
        int iM118192c;
        if (!getClass().equals(c14755gu.getClass())) {
            return getClass().getName().compareTo(c14755gu.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m85769a()).compareTo(Boolean.valueOf(c14755gu.m85769a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m85769a() && (iM118192c = euq0.m118192c(this.f62205a, c14755gu.f62205a)) != 0) {
            return iM118192c;
        }
        int iCompareTo2 = Boolean.valueOf(m85772b()).compareTo(Boolean.valueOf(c14755gu.m85772b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m85772b() && (iM118194e4 = euq0.m118194e(this.f62206a, c14755gu.f62206a)) != 0) {
            return iM118194e4;
        }
        int iCompareTo3 = Boolean.valueOf(m85773c()).compareTo(Boolean.valueOf(c14755gu.m85773c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m85773c() && (iM118194e3 = euq0.m118194e(this.f62209b, c14755gu.f62209b)) != 0) {
            return iM118194e3;
        }
        int iCompareTo4 = Boolean.valueOf(m85774d()).compareTo(Boolean.valueOf(c14755gu.m85774d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m85774d() && (iM118194e2 = euq0.m118194e(this.f62210c, c14755gu.f62210c)) != 0) {
            return iM118194e2;
        }
        int iCompareTo5 = Boolean.valueOf(m85775e()).compareTo(Boolean.valueOf(c14755gu.m85775e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m85775e() && (iM118200k = euq0.m118200k(this.f62208a, c14755gu.f62208a)) != 0) {
            return iM118200k;
        }
        int iCompareTo6 = Boolean.valueOf(m85776f()).compareTo(Boolean.valueOf(c14755gu.m85776f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (!m85776f() || (iM118194e = euq0.m118194e(this.f62211d, c14755gu.f62211d)) == 0) {
            return 0;
        }
        return iM118194e;
    }

    @Override // com.xiaomi.push.InterfaceC14777hq
    /* JADX INFO: renamed from: b */
    public void mo85540b(quq0 quq0Var) {
        m85767a();
        quq0Var.mo86237v(f62199a);
        quq0Var.mo86234s(f62198a);
        quq0Var.mo86231p(this.f62205a);
        quq0Var.mo86241z();
        if (this.f62206a != null) {
            quq0Var.mo86234s(f62200b);
            quq0Var.mo86232q(this.f62206a);
            quq0Var.mo86241z();
        }
        if (this.f62209b != null && m85773c()) {
            quq0Var.mo86234s(f62201c);
            quq0Var.mo86232q(this.f62209b);
            quq0Var.mo86241z();
        }
        if (this.f62210c != null && m85774d()) {
            quq0Var.mo86234s(f62202d);
            quq0Var.mo86232q(this.f62210c);
            quq0Var.mo86241z();
        }
        if (m85775e()) {
            quq0Var.mo86234s(f62203e);
            quq0Var.mo86239x(this.f62208a);
            quq0Var.mo86241z();
        }
        if (this.f62211d != null && m85776f()) {
            quq0Var.mo86234s(f62204f);
            quq0Var.mo86232q(this.f62211d);
            quq0Var.mo86241z();
        }
        quq0Var.mo86205A();
        quq0Var.mo86228m();
    }

    /* JADX INFO: renamed from: c */
    public boolean m85773c() {
        return this.f62209b != null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m85774d() {
        return this.f62210c != null;
    }

    /* JADX INFO: renamed from: e */
    public boolean m85775e() {
        return this.f62207a.get(1);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C14755gu)) {
            return m85770a((C14755gu) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m85776f() {
        return this.f62211d != null;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Target(channelId:");
        sb.append(this.f62205a);
        sb.append(", ");
        sb.append("userId:");
        String str = this.f62206a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        if (m85773c()) {
            sb.append(", ");
            sb.append("server:");
            String str2 = this.f62209b;
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(str2);
            }
        }
        if (m85774d()) {
            sb.append(", ");
            sb.append("resource:");
            String str3 = this.f62210c;
            if (str3 == null) {
                sb.append("null");
            } else {
                sb.append(str3);
            }
        }
        if (m85775e()) {
            sb.append(", ");
            sb.append("isPreview:");
            sb.append(this.f62208a);
        }
        if (m85776f()) {
            sb.append(", ");
            sb.append("token:");
            String str4 = this.f62211d;
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
    public void m85771b(boolean z) {
        this.f62207a.set(1, z);
    }

    /* JADX INFO: renamed from: b */
    public boolean m85772b() {
        return this.f62206a != null;
    }

    /* JADX INFO: renamed from: a */
    public void m85768a(boolean z) {
        this.f62207a.set(0, z);
    }

    /* JADX INFO: renamed from: a */
    public boolean m85770a(C14755gu c14755gu) {
        if (c14755gu == null || this.f62205a != c14755gu.f62205a) {
            return false;
        }
        boolean zM85772b = m85772b();
        boolean zM85772b2 = c14755gu.m85772b();
        if ((zM85772b || zM85772b2) && !(zM85772b && zM85772b2 && this.f62206a.equals(c14755gu.f62206a))) {
            return false;
        }
        boolean zM85773c = m85773c();
        boolean zM85773c2 = c14755gu.m85773c();
        if ((zM85773c || zM85773c2) && !(zM85773c && zM85773c2 && this.f62209b.equals(c14755gu.f62209b))) {
            return false;
        }
        boolean zM85774d = m85774d();
        boolean zM85774d2 = c14755gu.m85774d();
        if ((zM85774d || zM85774d2) && !(zM85774d && zM85774d2 && this.f62210c.equals(c14755gu.f62210c))) {
            return false;
        }
        boolean zM85775e = m85775e();
        boolean zM85775e2 = c14755gu.m85775e();
        if ((zM85775e || zM85775e2) && !(zM85775e && zM85775e2 && this.f62208a == c14755gu.f62208a)) {
            return false;
        }
        boolean zM85776f = m85776f();
        boolean zM85776f2 = c14755gu.m85776f();
        if (zM85776f || zM85776f2) {
            return zM85776f && zM85776f2 && this.f62211d.equals(c14755gu.f62211d);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public boolean m85769a() {
        return this.f62207a.get(0);
    }

    @Override // com.xiaomi.push.InterfaceC14777hq
    /* JADX INFO: renamed from: a */
    public void mo85534a(quq0 quq0Var) {
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
                        if (s != 4) {
                            if (s != 5) {
                                if (s != 7) {
                                    ruq0.m181208a(quq0Var, b);
                                } else if (b == 11) {
                                    this.f62211d = quq0Var.mo86220e();
                                } else {
                                    ruq0.m181208a(quq0Var, b);
                                }
                            } else if (b == 2) {
                                this.f62208a = quq0Var.mo86240y();
                                m85771b(true);
                            } else {
                                ruq0.m181208a(quq0Var, b);
                            }
                        } else if (b == 11) {
                            this.f62210c = quq0Var.mo86220e();
                        } else {
                            ruq0.m181208a(quq0Var, b);
                        }
                    } else if (b == 11) {
                        this.f62209b = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                } else if (b == 11) {
                    this.f62206a = quq0Var.mo86220e();
                } else {
                    ruq0.m181208a(quq0Var, b);
                }
            } else if (b == 10) {
                this.f62205a = quq0Var.mo86219d();
                m85768a(true);
            } else {
                ruq0.m181208a(quq0Var, b);
            }
            quq0Var.mo86209E();
        }
        quq0Var.mo86208D();
        if (m85769a()) {
            m85767a();
        } else {
            throw new C14781ib("Required field 'channelId' was not found in serialized data! Struct: " + toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m85767a() throws C14781ib {
        if (this.f62206a != null) {
            return;
        }
        throw new C14781ib("Required field 'userId' was not present! Struct: " + toString());
    }
}
