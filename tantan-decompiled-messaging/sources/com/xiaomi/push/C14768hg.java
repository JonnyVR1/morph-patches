package com.xiaomi.push;

import com.xiaomi.push.service.C14839aj;
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

/* JADX INFO: renamed from: com.xiaomi.push.hg */
/* JADX INFO: loaded from: classes2.dex */
public class C14768hg implements InterfaceC14777hq<C14768hg, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public int f62474a;

    /* JADX INFO: renamed from: a */
    public long f62475a;

    /* JADX INFO: renamed from: a */
    public C14755gu f62476a;

    /* JADX INFO: renamed from: a */
    public String f62477a;

    /* JADX INFO: renamed from: a */
    public List<String> f62479a;

    /* JADX INFO: renamed from: b */
    public int f62481b;

    /* JADX INFO: renamed from: b */
    public long f62482b;

    /* JADX INFO: renamed from: b */
    public String f62483b;

    /* JADX INFO: renamed from: c */
    public long f62484c;

    /* JADX INFO: renamed from: c */
    public String f62485c;

    /* JADX INFO: renamed from: d */
    public String f62486d;

    /* JADX INFO: renamed from: e */
    public String f62487e;

    /* JADX INFO: renamed from: f */
    public String f62488f;

    /* JADX INFO: renamed from: g */
    public String f62489g;

    /* JADX INFO: renamed from: h */
    public String f62490h;

    /* JADX INFO: renamed from: i */
    public String f62491i;

    /* JADX INFO: renamed from: j */
    public String f62492j;

    /* JADX INFO: renamed from: k */
    public String f62493k;

    /* JADX INFO: renamed from: l */
    public String f62494l;

    /* JADX INFO: renamed from: a */
    private static final tuq0 f62454a = new tuq0("XmPushActionRegistrationResult");

    /* JADX INFO: renamed from: a */
    private static final guq0 f62453a = new guq0("", (byte) 11, 1);

    /* JADX INFO: renamed from: b */
    private static final guq0 f62455b = new guq0("", (byte) 12, 2);

    /* JADX INFO: renamed from: c */
    private static final guq0 f62456c = new guq0("", (byte) 11, 3);

    /* JADX INFO: renamed from: d */
    private static final guq0 f62457d = new guq0("", (byte) 11, 4);

    /* JADX INFO: renamed from: e */
    private static final guq0 f62458e = new guq0("", (byte) 10, 6);

    /* JADX INFO: renamed from: f */
    private static final guq0 f62459f = new guq0("", (byte) 11, 7);

    /* JADX INFO: renamed from: g */
    private static final guq0 f62460g = new guq0("", (byte) 11, 8);

    /* JADX INFO: renamed from: h */
    private static final guq0 f62461h = new guq0("", (byte) 11, 9);

    /* JADX INFO: renamed from: i */
    private static final guq0 f62462i = new guq0("", (byte) 11, 10);

    /* JADX INFO: renamed from: j */
    private static final guq0 f62463j = new guq0("", (byte) 10, 11);

    /* JADX INFO: renamed from: k */
    private static final guq0 f62464k = new guq0("", (byte) 11, 12);

    /* JADX INFO: renamed from: l */
    private static final guq0 f62465l = new guq0("", (byte) 11, 13);

    /* JADX INFO: renamed from: m */
    private static final guq0 f62466m = new guq0("", (byte) 10, 14);

    /* JADX INFO: renamed from: n */
    private static final guq0 f62467n = new guq0("", (byte) 11, 15);

    /* JADX INFO: renamed from: o */
    private static final guq0 f62468o = new guq0("", (byte) 8, 16);

    /* JADX INFO: renamed from: p */
    private static final guq0 f62469p = new guq0("", (byte) 11, 17);

    /* JADX INFO: renamed from: q */
    private static final guq0 f62470q = new guq0("", (byte) 8, 18);

    /* JADX INFO: renamed from: r */
    private static final guq0 f62471r = new guq0("", (byte) 11, 19);

    /* JADX INFO: renamed from: s */
    private static final guq0 f62472s = new guq0("", (byte) 2, 20);

    /* JADX INFO: renamed from: t */
    private static final guq0 f62473t = new guq0("", (byte) 15, 21);

    /* JADX INFO: renamed from: a */
    private BitSet f62478a = new BitSet(6);

    /* JADX INFO: renamed from: a */
    public boolean f62480a = false;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14768hg c14768hg) {
        int iM118196g;
        int iM118200k;
        int iM118194e;
        int iM118191b;
        int iM118194e2;
        int iM118191b2;
        int iM118194e3;
        int iM118192c;
        int iM118194e4;
        int iM118194e5;
        int iM118192c2;
        int iM118194e6;
        int iM118194e7;
        int iM118194e8;
        int iM118194e9;
        int iM118192c3;
        int iM118194e10;
        int iM118194e11;
        int iM118193d;
        int iM118194e12;
        if (!getClass().equals(c14768hg.getClass())) {
            return getClass().getName().compareTo(c14768hg.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m86040a()).compareTo(Boolean.valueOf(c14768hg.m86040a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m86040a() && (iM118194e12 = euq0.m118194e(this.f62477a, c14768hg.f62477a)) != 0) {
            return iM118194e12;
        }
        int iCompareTo2 = Boolean.valueOf(m86044b()).compareTo(Boolean.valueOf(c14768hg.m86044b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m86044b() && (iM118193d = euq0.m118193d(this.f62476a, c14768hg.f62476a)) != 0) {
            return iM118193d;
        }
        int iCompareTo3 = Boolean.valueOf(m86047c()).compareTo(Boolean.valueOf(c14768hg.m86047c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m86047c() && (iM118194e11 = euq0.m118194e(this.f62483b, c14768hg.f62483b)) != 0) {
            return iM118194e11;
        }
        int iCompareTo4 = Boolean.valueOf(m86049d()).compareTo(Boolean.valueOf(c14768hg.m86049d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m86049d() && (iM118194e10 = euq0.m118194e(this.f62485c, c14768hg.f62485c)) != 0) {
            return iM118194e10;
        }
        int iCompareTo5 = Boolean.valueOf(m86051e()).compareTo(Boolean.valueOf(c14768hg.m86051e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m86051e() && (iM118192c3 = euq0.m118192c(this.f62475a, c14768hg.f62475a)) != 0) {
            return iM118192c3;
        }
        int iCompareTo6 = Boolean.valueOf(m86053f()).compareTo(Boolean.valueOf(c14768hg.m86053f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (m86053f() && (iM118194e9 = euq0.m118194e(this.f62486d, c14768hg.f62486d)) != 0) {
            return iM118194e9;
        }
        int iCompareTo7 = Boolean.valueOf(m86054g()).compareTo(Boolean.valueOf(c14768hg.m86054g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (m86054g() && (iM118194e8 = euq0.m118194e(this.f62487e, c14768hg.f62487e)) != 0) {
            return iM118194e8;
        }
        int iCompareTo8 = Boolean.valueOf(m86055h()).compareTo(Boolean.valueOf(c14768hg.m86055h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (m86055h() && (iM118194e7 = euq0.m118194e(this.f62488f, c14768hg.f62488f)) != 0) {
            return iM118194e7;
        }
        int iCompareTo9 = Boolean.valueOf(m86056i()).compareTo(Boolean.valueOf(c14768hg.m86056i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (m86056i() && (iM118194e6 = euq0.m118194e(this.f62489g, c14768hg.f62489g)) != 0) {
            return iM118194e6;
        }
        int iCompareTo10 = Boolean.valueOf(m86057j()).compareTo(Boolean.valueOf(c14768hg.m86057j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (m86057j() && (iM118192c2 = euq0.m118192c(this.f62482b, c14768hg.f62482b)) != 0) {
            return iM118192c2;
        }
        int iCompareTo11 = Boolean.valueOf(m86058k()).compareTo(Boolean.valueOf(c14768hg.m86058k()));
        if (iCompareTo11 != 0) {
            return iCompareTo11;
        }
        if (m86058k() && (iM118194e5 = euq0.m118194e(this.f62490h, c14768hg.f62490h)) != 0) {
            return iM118194e5;
        }
        int iCompareTo12 = Boolean.valueOf(m86059l()).compareTo(Boolean.valueOf(c14768hg.m86059l()));
        if (iCompareTo12 != 0) {
            return iCompareTo12;
        }
        if (m86059l() && (iM118194e4 = euq0.m118194e(this.f62491i, c14768hg.f62491i)) != 0) {
            return iM118194e4;
        }
        int iCompareTo13 = Boolean.valueOf(m86060m()).compareTo(Boolean.valueOf(c14768hg.m86060m()));
        if (iCompareTo13 != 0) {
            return iCompareTo13;
        }
        if (m86060m() && (iM118192c = euq0.m118192c(this.f62484c, c14768hg.f62484c)) != 0) {
            return iM118192c;
        }
        int iCompareTo14 = Boolean.valueOf(m86061n()).compareTo(Boolean.valueOf(c14768hg.m86061n()));
        if (iCompareTo14 != 0) {
            return iCompareTo14;
        }
        if (m86061n() && (iM118194e3 = euq0.m118194e(this.f62492j, c14768hg.f62492j)) != 0) {
            return iM118194e3;
        }
        int iCompareTo15 = Boolean.valueOf(m86062o()).compareTo(Boolean.valueOf(c14768hg.m86062o()));
        if (iCompareTo15 != 0) {
            return iCompareTo15;
        }
        if (m86062o() && (iM118191b2 = euq0.m118191b(this.f62474a, c14768hg.f62474a)) != 0) {
            return iM118191b2;
        }
        int iCompareTo16 = Boolean.valueOf(m86063p()).compareTo(Boolean.valueOf(c14768hg.m86063p()));
        if (iCompareTo16 != 0) {
            return iCompareTo16;
        }
        if (m86063p() && (iM118194e2 = euq0.m118194e(this.f62493k, c14768hg.f62493k)) != 0) {
            return iM118194e2;
        }
        int iCompareTo17 = Boolean.valueOf(m86064q()).compareTo(Boolean.valueOf(c14768hg.m86064q()));
        if (iCompareTo17 != 0) {
            return iCompareTo17;
        }
        if (m86064q() && (iM118191b = euq0.m118191b(this.f62481b, c14768hg.f62481b)) != 0) {
            return iM118191b;
        }
        int iCompareTo18 = Boolean.valueOf(m86065r()).compareTo(Boolean.valueOf(c14768hg.m86065r()));
        if (iCompareTo18 != 0) {
            return iCompareTo18;
        }
        if (m86065r() && (iM118194e = euq0.m118194e(this.f62494l, c14768hg.f62494l)) != 0) {
            return iM118194e;
        }
        int iCompareTo19 = Boolean.valueOf(m86066s()).compareTo(Boolean.valueOf(c14768hg.m86066s()));
        if (iCompareTo19 != 0) {
            return iCompareTo19;
        }
        if (m86066s() && (iM118200k = euq0.m118200k(this.f62480a, c14768hg.f62480a)) != 0) {
            return iM118200k;
        }
        int iCompareTo20 = Boolean.valueOf(m86067t()).compareTo(Boolean.valueOf(c14768hg.m86067t()));
        if (iCompareTo20 != 0) {
            return iCompareTo20;
        }
        if (!m86067t() || (iM118196g = euq0.m118196g(this.f62479a, c14768hg.f62479a)) == 0) {
            return 0;
        }
        return iM118196g;
    }

    @Override // com.xiaomi.push.InterfaceC14777hq
    /* JADX INFO: renamed from: b */
    public void mo85540b(quq0 quq0Var) throws C14781ib {
        m86038a();
        quq0Var.mo86237v(f62454a);
        if (this.f62477a != null && m86040a()) {
            quq0Var.mo86234s(f62453a);
            quq0Var.mo86232q(this.f62477a);
            quq0Var.mo86241z();
        }
        if (this.f62476a != null && m86044b()) {
            quq0Var.mo86234s(f62455b);
            this.f62476a.mo85540b(quq0Var);
            quq0Var.mo86241z();
        }
        if (this.f62483b != null) {
            quq0Var.mo86234s(f62456c);
            quq0Var.mo86232q(this.f62483b);
            quq0Var.mo86241z();
        }
        if (this.f62485c != null) {
            quq0Var.mo86234s(f62457d);
            quq0Var.mo86232q(this.f62485c);
            quq0Var.mo86241z();
        }
        quq0Var.mo86234s(f62458e);
        quq0Var.mo86231p(this.f62475a);
        quq0Var.mo86241z();
        if (this.f62486d != null && m86053f()) {
            quq0Var.mo86234s(f62459f);
            quq0Var.mo86232q(this.f62486d);
            quq0Var.mo86241z();
        }
        if (this.f62487e != null && m86054g()) {
            quq0Var.mo86234s(f62460g);
            quq0Var.mo86232q(this.f62487e);
            quq0Var.mo86241z();
        }
        if (this.f62488f != null && m86055h()) {
            quq0Var.mo86234s(f62461h);
            quq0Var.mo86232q(this.f62488f);
            quq0Var.mo86241z();
        }
        if (this.f62489g != null && m86056i()) {
            quq0Var.mo86234s(f62462i);
            quq0Var.mo86232q(this.f62489g);
            quq0Var.mo86241z();
        }
        if (m86057j()) {
            quq0Var.mo86234s(f62463j);
            quq0Var.mo86231p(this.f62482b);
            quq0Var.mo86241z();
        }
        if (this.f62490h != null && m86058k()) {
            quq0Var.mo86234s(f62464k);
            quq0Var.mo86232q(this.f62490h);
            quq0Var.mo86241z();
        }
        if (this.f62491i != null && m86059l()) {
            quq0Var.mo86234s(f62465l);
            quq0Var.mo86232q(this.f62491i);
            quq0Var.mo86241z();
        }
        if (m86060m()) {
            quq0Var.mo86234s(f62466m);
            quq0Var.mo86231p(this.f62484c);
            quq0Var.mo86241z();
        }
        if (this.f62492j != null && m86061n()) {
            quq0Var.mo86234s(f62467n);
            quq0Var.mo86232q(this.f62492j);
            quq0Var.mo86241z();
        }
        if (m86062o()) {
            quq0Var.mo86234s(f62468o);
            quq0Var.mo86230o(this.f62474a);
            quq0Var.mo86241z();
        }
        if (this.f62493k != null && m86063p()) {
            quq0Var.mo86234s(f62469p);
            quq0Var.mo86232q(this.f62493k);
            quq0Var.mo86241z();
        }
        if (m86064q()) {
            quq0Var.mo86234s(f62470q);
            quq0Var.mo86230o(this.f62481b);
            quq0Var.mo86241z();
        }
        if (this.f62494l != null && m86065r()) {
            quq0Var.mo86234s(f62471r);
            quq0Var.mo86232q(this.f62494l);
            quq0Var.mo86241z();
        }
        if (m86066s()) {
            quq0Var.mo86234s(f62472s);
            quq0Var.mo86239x(this.f62480a);
            quq0Var.mo86241z();
        }
        if (this.f62479a != null && m86067t()) {
            quq0Var.mo86234s(f62473t);
            quq0Var.mo86235t(new huq0((byte) 11, this.f62479a.size()));
            Iterator<String> it = this.f62479a.iterator();
            while (it.hasNext()) {
                quq0Var.mo86232q(it.next());
            }
            quq0Var.mo86207C();
            quq0Var.mo86241z();
        }
        quq0Var.mo86205A();
        quq0Var.mo86228m();
    }

    /* JADX INFO: renamed from: c */
    public boolean m86047c() {
        return this.f62483b != null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m86049d() {
        return this.f62485c != null;
    }

    /* JADX INFO: renamed from: e */
    public boolean m86051e() {
        return this.f62478a.get(0);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C14768hg)) {
            return m86041a((C14768hg) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m86053f() {
        return this.f62486d != null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m86054g() {
        return this.f62487e != null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m86055h() {
        return this.f62488f != null;
    }

    public int hashCode() {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public boolean m86056i() {
        return this.f62489g != null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m86057j() {
        return this.f62478a.get(1);
    }

    /* JADX INFO: renamed from: k */
    public boolean m86058k() {
        return this.f62490h != null;
    }

    /* JADX INFO: renamed from: l */
    public boolean m86059l() {
        return this.f62491i != null;
    }

    /* JADX INFO: renamed from: m */
    public boolean m86060m() {
        return this.f62478a.get(2);
    }

    /* JADX INFO: renamed from: n */
    public boolean m86061n() {
        return this.f62492j != null;
    }

    /* JADX INFO: renamed from: o */
    public boolean m86062o() {
        return this.f62478a.get(3);
    }

    /* JADX INFO: renamed from: p */
    public boolean m86063p() {
        return this.f62493k != null;
    }

    /* JADX INFO: renamed from: q */
    public boolean m86064q() {
        return this.f62478a.get(4);
    }

    /* JADX INFO: renamed from: r */
    public boolean m86065r() {
        return this.f62494l != null;
    }

    /* JADX INFO: renamed from: s */
    public boolean m86066s() {
        return this.f62478a.get(5);
    }

    /* JADX INFO: renamed from: t */
    public boolean m86067t() {
        return this.f62479a != null;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionRegistrationResult(");
        boolean z2 = false;
        if (m86040a()) {
            sb.append("debug:");
            String str = this.f62477a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (m86044b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            C14755gu c14755gu = this.f62476a;
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
        String str2 = this.f62483b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(C14839aj.m86496a(str2));
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f62485c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("errorCode:");
        sb.append(this.f62475a);
        if (m86053f()) {
            sb.append(", ");
            sb.append("reason:");
            String str4 = this.f62486d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (m86054g()) {
            sb.append(", ");
            sb.append("regId:");
            String str5 = this.f62487e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        if (m86056i()) {
            sb.append(", ");
            sb.append("packageName:");
            String str6 = this.f62489g;
            if (str6 == null) {
                sb.append("null");
            } else {
                sb.append(str6);
            }
        }
        if (m86057j()) {
            sb.append(", ");
            sb.append("registeredAt:");
            sb.append(this.f62482b);
        }
        if (m86058k()) {
            sb.append(", ");
            sb.append("aliasName:");
            String str7 = this.f62490h;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        if (m86059l()) {
            sb.append(", ");
            sb.append("clientId:");
            String str8 = this.f62491i;
            if (str8 == null) {
                sb.append("null");
            } else {
                sb.append(str8);
            }
        }
        if (m86060m()) {
            sb.append(", ");
            sb.append("costTime:");
            sb.append(this.f62484c);
        }
        if (m86061n()) {
            sb.append(", ");
            sb.append("appVersion:");
            String str9 = this.f62492j;
            if (str9 == null) {
                sb.append("null");
            } else {
                sb.append(str9);
            }
        }
        if (m86062o()) {
            sb.append(", ");
            sb.append("pushSdkVersionCode:");
            sb.append(this.f62474a);
        }
        if (m86063p()) {
            sb.append(", ");
            sb.append("hybridPushEndpoint:");
            String str10 = this.f62493k;
            if (str10 == null) {
                sb.append("null");
            } else {
                sb.append(str10);
            }
        }
        if (m86064q()) {
            sb.append(", ");
            sb.append("appVersionCode:");
            sb.append(this.f62481b);
        }
        if (m86065r()) {
            sb.append(", ");
            sb.append("region:");
            String str11 = this.f62494l;
            if (str11 == null) {
                sb.append("null");
            } else {
                sb.append(str11);
            }
        }
        if (m86066s()) {
            sb.append(", ");
            sb.append("isHybridFrame:");
            sb.append(this.f62480a);
        }
        if (m86067t()) {
            sb.append(", ");
            sb.append("autoMarkPkgs:");
            List<String> list = this.f62479a;
            if (list == null) {
                sb.append("null");
            } else {
                sb.append(list);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public String m86045c() {
        return this.f62489g;
    }

    /* JADX INFO: renamed from: d */
    public void m86048d(boolean z) {
        this.f62478a.set(3, z);
    }

    /* JADX INFO: renamed from: e */
    public void m86050e(boolean z) {
        this.f62478a.set(4, z);
    }

    /* JADX INFO: renamed from: f */
    public void m86052f(boolean z) {
        this.f62478a.set(5, z);
    }

    /* JADX INFO: renamed from: c */
    public void m86046c(boolean z) {
        this.f62478a.set(2, z);
    }

    /* JADX INFO: renamed from: b */
    public String m86042b() {
        return this.f62488f;
    }

    /* JADX INFO: renamed from: b */
    public void m86043b(boolean z) {
        this.f62478a.set(1, z);
    }

    /* JADX INFO: renamed from: b */
    public boolean m86044b() {
        return this.f62476a != null;
    }

    /* JADX INFO: renamed from: a */
    public String m86036a() {
        return this.f62483b;
    }

    /* JADX INFO: renamed from: a */
    public long m86035a() {
        return this.f62475a;
    }

    /* JADX INFO: renamed from: a */
    public void m86039a(boolean z) {
        this.f62478a.set(0, z);
    }

    /* JADX INFO: renamed from: a */
    public List<String> m86037a() {
        return this.f62479a;
    }

    /* JADX INFO: renamed from: a */
    public boolean m86041a(C14768hg c14768hg) {
        if (c14768hg == null) {
            return false;
        }
        boolean zM86040a = m86040a();
        boolean zM86040a2 = c14768hg.m86040a();
        if ((zM86040a || zM86040a2) && !(zM86040a && zM86040a2 && this.f62477a.equals(c14768hg.f62477a))) {
            return false;
        }
        boolean zM86044b = m86044b();
        boolean zM86044b2 = c14768hg.m86044b();
        if ((zM86044b || zM86044b2) && !(zM86044b && zM86044b2 && this.f62476a.m85770a(c14768hg.f62476a))) {
            return false;
        }
        boolean zM86047c = m86047c();
        boolean zM86047c2 = c14768hg.m86047c();
        if ((zM86047c || zM86047c2) && !(zM86047c && zM86047c2 && this.f62483b.equals(c14768hg.f62483b))) {
            return false;
        }
        boolean zM86049d = m86049d();
        boolean zM86049d2 = c14768hg.m86049d();
        if (((zM86049d || zM86049d2) && !(zM86049d && zM86049d2 && this.f62485c.equals(c14768hg.f62485c))) || this.f62475a != c14768hg.f62475a) {
            return false;
        }
        boolean zM86053f = m86053f();
        boolean zM86053f2 = c14768hg.m86053f();
        if ((zM86053f || zM86053f2) && !(zM86053f && zM86053f2 && this.f62486d.equals(c14768hg.f62486d))) {
            return false;
        }
        boolean zM86054g = m86054g();
        boolean zM86054g2 = c14768hg.m86054g();
        if ((zM86054g || zM86054g2) && !(zM86054g && zM86054g2 && this.f62487e.equals(c14768hg.f62487e))) {
            return false;
        }
        boolean zM86055h = m86055h();
        boolean zM86055h2 = c14768hg.m86055h();
        if ((zM86055h || zM86055h2) && !(zM86055h && zM86055h2 && this.f62488f.equals(c14768hg.f62488f))) {
            return false;
        }
        boolean zM86056i = m86056i();
        boolean zM86056i2 = c14768hg.m86056i();
        if ((zM86056i || zM86056i2) && !(zM86056i && zM86056i2 && this.f62489g.equals(c14768hg.f62489g))) {
            return false;
        }
        boolean zM86057j = m86057j();
        boolean zM86057j2 = c14768hg.m86057j();
        if ((zM86057j || zM86057j2) && !(zM86057j && zM86057j2 && this.f62482b == c14768hg.f62482b)) {
            return false;
        }
        boolean zM86058k = m86058k();
        boolean zM86058k2 = c14768hg.m86058k();
        if ((zM86058k || zM86058k2) && !(zM86058k && zM86058k2 && this.f62490h.equals(c14768hg.f62490h))) {
            return false;
        }
        boolean zM86059l = m86059l();
        boolean zM86059l2 = c14768hg.m86059l();
        if ((zM86059l || zM86059l2) && !(zM86059l && zM86059l2 && this.f62491i.equals(c14768hg.f62491i))) {
            return false;
        }
        boolean zM86060m = m86060m();
        boolean zM86060m2 = c14768hg.m86060m();
        if ((zM86060m || zM86060m2) && !(zM86060m && zM86060m2 && this.f62484c == c14768hg.f62484c)) {
            return false;
        }
        boolean zM86061n = m86061n();
        boolean zM86061n2 = c14768hg.m86061n();
        if ((zM86061n || zM86061n2) && !(zM86061n && zM86061n2 && this.f62492j.equals(c14768hg.f62492j))) {
            return false;
        }
        boolean zM86062o = m86062o();
        boolean zM86062o2 = c14768hg.m86062o();
        if ((zM86062o || zM86062o2) && !(zM86062o && zM86062o2 && this.f62474a == c14768hg.f62474a)) {
            return false;
        }
        boolean zM86063p = m86063p();
        boolean zM86063p2 = c14768hg.m86063p();
        if ((zM86063p || zM86063p2) && !(zM86063p && zM86063p2 && this.f62493k.equals(c14768hg.f62493k))) {
            return false;
        }
        boolean zM86064q = m86064q();
        boolean zM86064q2 = c14768hg.m86064q();
        if ((zM86064q || zM86064q2) && !(zM86064q && zM86064q2 && this.f62481b == c14768hg.f62481b)) {
            return false;
        }
        boolean zM86065r = m86065r();
        boolean zM86065r2 = c14768hg.m86065r();
        if ((zM86065r || zM86065r2) && !(zM86065r && zM86065r2 && this.f62494l.equals(c14768hg.f62494l))) {
            return false;
        }
        boolean zM86066s = m86066s();
        boolean zM86066s2 = c14768hg.m86066s();
        if ((zM86066s || zM86066s2) && !(zM86066s && zM86066s2 && this.f62480a == c14768hg.f62480a)) {
            return false;
        }
        boolean zM86067t = m86067t();
        boolean zM86067t2 = c14768hg.m86067t();
        if (zM86067t || zM86067t2) {
            return zM86067t && zM86067t2 && this.f62479a.equals(c14768hg.f62479a);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public boolean m86040a() {
        return this.f62477a != null;
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
                if (m86051e()) {
                    m86038a();
                    return;
                }
                throw new C14781ib("Required field 'errorCode' was not found in serialized data! Struct: " + toString());
            }
            switch (guq0VarMo86222g.f104458c) {
                case 1:
                    if (b == 11) {
                        this.f62477a = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 2:
                    if (b == 12) {
                        C14755gu c14755gu = new C14755gu();
                        this.f62476a = c14755gu;
                        c14755gu.mo85534a(quq0Var);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 3:
                    if (b == 11) {
                        this.f62483b = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 4:
                    if (b == 11) {
                        this.f62485c = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 5:
                default:
                    ruq0.m181208a(quq0Var, b);
                    break;
                case 6:
                    if (b == 10) {
                        this.f62475a = quq0Var.mo86219d();
                        m86039a(true);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 7:
                    if (b == 11) {
                        this.f62486d = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 8:
                    if (b == 11) {
                        this.f62487e = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 9:
                    if (b == 11) {
                        this.f62488f = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 10:
                    if (b == 11) {
                        this.f62489g = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 11:
                    if (b == 10) {
                        this.f62482b = quq0Var.mo86219d();
                        m86043b(true);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 12:
                    if (b == 11) {
                        this.f62490h = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 13:
                    if (b == 11) {
                        this.f62491i = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 14:
                    if (b == 10) {
                        this.f62484c = quq0Var.mo86219d();
                        m86046c(true);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 15:
                    if (b == 11) {
                        this.f62492j = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 16:
                    if (b == 8) {
                        this.f62474a = quq0Var.mo86218c();
                        m86048d(true);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 17:
                    if (b == 11) {
                        this.f62493k = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 18:
                    if (b == 8) {
                        this.f62481b = quq0Var.mo86218c();
                        m86050e(true);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 19:
                    if (b == 11) {
                        this.f62494l = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 20:
                    if (b == 2) {
                        this.f62480a = quq0Var.mo86240y();
                        m86052f(true);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 21:
                    if (b == 15) {
                        huq0 huq0VarMo86223h = quq0Var.mo86223h();
                        this.f62479a = new ArrayList(huq0VarMo86223h.f109582b);
                        for (int i = 0; i < huq0VarMo86223h.f109582b; i++) {
                            this.f62479a.add(quq0Var.mo86220e());
                        }
                        quq0Var.mo86211G();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
            }
            quq0Var.mo86209E();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m86038a() throws C14781ib {
        if (this.f62483b != null) {
            if (this.f62485c != null) {
                return;
            }
            throw new C14781ib("Required field 'appId' was not present! Struct: " + toString());
        }
        throw new C14781ib("Required field 'id' was not present! Struct: " + toString());
    }
}
