package com.xiaomi.push;

import com.xiaomi.push.service.C14839aj;
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

/* JADX INFO: renamed from: com.xiaomi.push.hf */
/* JADX INFO: loaded from: classes2.dex */
public class C14767hf implements InterfaceC14777hq<C14767hf, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public int f62423a;

    /* JADX INFO: renamed from: a */
    public long f62424a;

    /* JADX INFO: renamed from: a */
    public EnumC14754gt f62425a;

    /* JADX INFO: renamed from: a */
    public C14755gu f62426a;

    /* JADX INFO: renamed from: a */
    public String f62427a;

    /* JADX INFO: renamed from: a */
    public Map<String, String> f62429a;

    /* JADX INFO: renamed from: b */
    public int f62431b;

    /* JADX INFO: renamed from: b */
    public long f62432b;

    /* JADX INFO: renamed from: b */
    public String f62433b;

    /* JADX INFO: renamed from: c */
    public int f62435c;

    /* JADX INFO: renamed from: c */
    public String f62436c;

    /* JADX INFO: renamed from: d */
    public String f62438d;

    /* JADX INFO: renamed from: e */
    public String f62439e;

    /* JADX INFO: renamed from: f */
    public String f62440f;

    /* JADX INFO: renamed from: g */
    public String f62441g;

    /* JADX INFO: renamed from: h */
    public String f62442h;

    /* JADX INFO: renamed from: i */
    public String f62443i;

    /* JADX INFO: renamed from: j */
    public String f62444j;

    /* JADX INFO: renamed from: k */
    public String f62445k;

    /* JADX INFO: renamed from: l */
    public String f62446l;

    /* JADX INFO: renamed from: m */
    public String f62447m;

    /* JADX INFO: renamed from: n */
    public String f62448n;

    /* JADX INFO: renamed from: o */
    public String f62449o;

    /* JADX INFO: renamed from: p */
    public String f62450p;

    /* JADX INFO: renamed from: q */
    public String f62451q;

    /* JADX INFO: renamed from: r */
    public String f62452r;

    /* JADX INFO: renamed from: a */
    private static final tuq0 f62397a = new tuq0("XmPushActionRegistration");

    /* JADX INFO: renamed from: a */
    private static final guq0 f62396a = new guq0("", (byte) 11, 1);

    /* JADX INFO: renamed from: b */
    private static final guq0 f62398b = new guq0("", (byte) 12, 2);

    /* JADX INFO: renamed from: c */
    private static final guq0 f62399c = new guq0("", (byte) 11, 3);

    /* JADX INFO: renamed from: d */
    private static final guq0 f62400d = new guq0("", (byte) 11, 4);

    /* JADX INFO: renamed from: e */
    private static final guq0 f62401e = new guq0("", (byte) 11, 5);

    /* JADX INFO: renamed from: f */
    private static final guq0 f62402f = new guq0("", (byte) 11, 6);

    /* JADX INFO: renamed from: g */
    private static final guq0 f62403g = new guq0("", (byte) 11, 7);

    /* JADX INFO: renamed from: h */
    private static final guq0 f62404h = new guq0("", (byte) 11, 8);

    /* JADX INFO: renamed from: i */
    private static final guq0 f62405i = new guq0("", (byte) 11, 9);

    /* JADX INFO: renamed from: j */
    private static final guq0 f62406j = new guq0("", (byte) 11, 10);

    /* JADX INFO: renamed from: k */
    private static final guq0 f62407k = new guq0("", (byte) 11, 11);

    /* JADX INFO: renamed from: l */
    private static final guq0 f62408l = new guq0("", (byte) 11, 12);

    /* JADX INFO: renamed from: m */
    private static final guq0 f62409m = new guq0("", (byte) 8, 13);

    /* JADX INFO: renamed from: n */
    private static final guq0 f62410n = new guq0("", (byte) 8, 14);

    /* JADX INFO: renamed from: o */
    private static final guq0 f62411o = new guq0("", (byte) 11, 15);

    /* JADX INFO: renamed from: p */
    private static final guq0 f62412p = new guq0("", (byte) 11, 16);

    /* JADX INFO: renamed from: q */
    private static final guq0 f62413q = new guq0("", (byte) 11, 17);

    /* JADX INFO: renamed from: r */
    private static final guq0 f62414r = new guq0("", (byte) 11, 18);

    /* JADX INFO: renamed from: s */
    private static final guq0 f62415s = new guq0("", (byte) 8, 19);

    /* JADX INFO: renamed from: t */
    private static final guq0 f62416t = new guq0("", (byte) 8, 20);

    /* JADX INFO: renamed from: u */
    private static final guq0 f62417u = new guq0("", (byte) 2, 21);

    /* JADX INFO: renamed from: v */
    private static final guq0 f62418v = new guq0("", (byte) 10, 22);

    /* JADX INFO: renamed from: w */
    private static final guq0 f62419w = new guq0("", (byte) 10, 23);

    /* JADX INFO: renamed from: x */
    private static final guq0 f62420x = new guq0("", (byte) 11, 24);

    /* JADX INFO: renamed from: y */
    private static final guq0 f62421y = new guq0("", (byte) 11, 25);

    /* JADX INFO: renamed from: z */
    private static final guq0 f62422z = new guq0("", (byte) 2, 26);

    /* JADX INFO: renamed from: A */
    private static final guq0 f62393A = new guq0("", HttpTokens.CARRIAGE_RETURN, 100);

    /* JADX INFO: renamed from: B */
    private static final guq0 f62394B = new guq0("", (byte) 2, 101);

    /* JADX INFO: renamed from: C */
    private static final guq0 f62395C = new guq0("", (byte) 11, 102);

    /* JADX INFO: renamed from: a */
    private BitSet f62428a = new BitSet(8);

    /* JADX INFO: renamed from: a */
    public boolean f62430a = true;

    /* JADX INFO: renamed from: c */
    public boolean f62437c = false;

    /* JADX INFO: renamed from: b */
    public boolean f62434b = false;

    /* JADX INFO: renamed from: A */
    public boolean m85978A() {
        return this.f62429a != null;
    }

    /* JADX INFO: renamed from: B */
    public boolean m85979B() {
        return this.f62428a.get(7);
    }

    /* JADX INFO: renamed from: C */
    public boolean m85980C() {
        return this.f62452r != null;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14767hf c14767hf) {
        int iM118194e;
        int iM118200k;
        int iM118197h;
        int iM118200k2;
        int iM118194e2;
        int iM118194e3;
        int iM118192c;
        int iM118192c2;
        int iM118200k3;
        int iM118193d;
        int iM118191b;
        int iM118194e4;
        int iM118194e5;
        int iM118194e6;
        int iM118194e7;
        int iM118191b2;
        int iM118191b3;
        int iM118194e8;
        int iM118194e9;
        int iM118194e10;
        int iM118194e11;
        int iM118194e12;
        int iM118194e13;
        int iM118194e14;
        int iM118194e15;
        int iM118194e16;
        int iM118194e17;
        int iM118193d2;
        int iM118194e18;
        if (!getClass().equals(c14767hf.getClass())) {
            return getClass().getName().compareTo(c14767hf.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m85988a()).compareTo(Boolean.valueOf(c14767hf.m85988a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m85988a() && (iM118194e18 = euq0.m118194e(this.f62427a, c14767hf.f62427a)) != 0) {
            return iM118194e18;
        }
        int iCompareTo2 = Boolean.valueOf(m85994b()).compareTo(Boolean.valueOf(c14767hf.m85994b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m85994b() && (iM118193d2 = euq0.m118193d(this.f62426a, c14767hf.f62426a)) != 0) {
            return iM118193d2;
        }
        int iCompareTo3 = Boolean.valueOf(m85999c()).compareTo(Boolean.valueOf(c14767hf.m85999c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m85999c() && (iM118194e17 = euq0.m118194e(this.f62433b, c14767hf.f62433b)) != 0) {
            return iM118194e17;
        }
        int iCompareTo4 = Boolean.valueOf(m86002d()).compareTo(Boolean.valueOf(c14767hf.m86002d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m86002d() && (iM118194e16 = euq0.m118194e(this.f62436c, c14767hf.f62436c)) != 0) {
            return iM118194e16;
        }
        int iCompareTo5 = Boolean.valueOf(m86005e()).compareTo(Boolean.valueOf(c14767hf.m86005e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m86005e() && (iM118194e15 = euq0.m118194e(this.f62438d, c14767hf.f62438d)) != 0) {
            return iM118194e15;
        }
        int iCompareTo6 = Boolean.valueOf(m86008f()).compareTo(Boolean.valueOf(c14767hf.m86008f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (m86008f() && (iM118194e14 = euq0.m118194e(this.f62439e, c14767hf.f62439e)) != 0) {
            return iM118194e14;
        }
        int iCompareTo7 = Boolean.valueOf(m86011g()).compareTo(Boolean.valueOf(c14767hf.m86011g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (m86011g() && (iM118194e13 = euq0.m118194e(this.f62440f, c14767hf.f62440f)) != 0) {
            return iM118194e13;
        }
        int iCompareTo8 = Boolean.valueOf(m86014h()).compareTo(Boolean.valueOf(c14767hf.m86014h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (m86014h() && (iM118194e12 = euq0.m118194e(this.f62441g, c14767hf.f62441g)) != 0) {
            return iM118194e12;
        }
        int iCompareTo9 = Boolean.valueOf(m86016i()).compareTo(Boolean.valueOf(c14767hf.m86016i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (m86016i() && (iM118194e11 = euq0.m118194e(this.f62442h, c14767hf.f62442h)) != 0) {
            return iM118194e11;
        }
        int iCompareTo10 = Boolean.valueOf(m86017j()).compareTo(Boolean.valueOf(c14767hf.m86017j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (m86017j() && (iM118194e10 = euq0.m118194e(this.f62443i, c14767hf.f62443i)) != 0) {
            return iM118194e10;
        }
        int iCompareTo11 = Boolean.valueOf(m86018k()).compareTo(Boolean.valueOf(c14767hf.m86018k()));
        if (iCompareTo11 != 0) {
            return iCompareTo11;
        }
        if (m86018k() && (iM118194e9 = euq0.m118194e(this.f62444j, c14767hf.f62444j)) != 0) {
            return iM118194e9;
        }
        int iCompareTo12 = Boolean.valueOf(m86019l()).compareTo(Boolean.valueOf(c14767hf.m86019l()));
        if (iCompareTo12 != 0) {
            return iCompareTo12;
        }
        if (m86019l() && (iM118194e8 = euq0.m118194e(this.f62445k, c14767hf.f62445k)) != 0) {
            return iM118194e8;
        }
        int iCompareTo13 = Boolean.valueOf(m86020m()).compareTo(Boolean.valueOf(c14767hf.m86020m()));
        if (iCompareTo13 != 0) {
            return iCompareTo13;
        }
        if (m86020m() && (iM118191b3 = euq0.m118191b(this.f62423a, c14767hf.f62423a)) != 0) {
            return iM118191b3;
        }
        int iCompareTo14 = Boolean.valueOf(m86021n()).compareTo(Boolean.valueOf(c14767hf.m86021n()));
        if (iCompareTo14 != 0) {
            return iCompareTo14;
        }
        if (m86021n() && (iM118191b2 = euq0.m118191b(this.f62431b, c14767hf.f62431b)) != 0) {
            return iM118191b2;
        }
        int iCompareTo15 = Boolean.valueOf(m86022o()).compareTo(Boolean.valueOf(c14767hf.m86022o()));
        if (iCompareTo15 != 0) {
            return iCompareTo15;
        }
        if (m86022o() && (iM118194e7 = euq0.m118194e(this.f62446l, c14767hf.f62446l)) != 0) {
            return iM118194e7;
        }
        int iCompareTo16 = Boolean.valueOf(m86023p()).compareTo(Boolean.valueOf(c14767hf.m86023p()));
        if (iCompareTo16 != 0) {
            return iCompareTo16;
        }
        if (m86023p() && (iM118194e6 = euq0.m118194e(this.f62447m, c14767hf.f62447m)) != 0) {
            return iM118194e6;
        }
        int iCompareTo17 = Boolean.valueOf(m86024q()).compareTo(Boolean.valueOf(c14767hf.m86024q()));
        if (iCompareTo17 != 0) {
            return iCompareTo17;
        }
        if (m86024q() && (iM118194e5 = euq0.m118194e(this.f62448n, c14767hf.f62448n)) != 0) {
            return iM118194e5;
        }
        int iCompareTo18 = Boolean.valueOf(m86025r()).compareTo(Boolean.valueOf(c14767hf.m86025r()));
        if (iCompareTo18 != 0) {
            return iCompareTo18;
        }
        if (m86025r() && (iM118194e4 = euq0.m118194e(this.f62449o, c14767hf.f62449o)) != 0) {
            return iM118194e4;
        }
        int iCompareTo19 = Boolean.valueOf(m86026s()).compareTo(Boolean.valueOf(c14767hf.m86026s()));
        if (iCompareTo19 != 0) {
            return iCompareTo19;
        }
        if (m86026s() && (iM118191b = euq0.m118191b(this.f62435c, c14767hf.f62435c)) != 0) {
            return iM118191b;
        }
        int iCompareTo20 = Boolean.valueOf(m86027t()).compareTo(Boolean.valueOf(c14767hf.m86027t()));
        if (iCompareTo20 != 0) {
            return iCompareTo20;
        }
        if (m86027t() && (iM118193d = euq0.m118193d(this.f62425a, c14767hf.f62425a)) != 0) {
            return iM118193d;
        }
        int iCompareTo21 = Boolean.valueOf(m86028u()).compareTo(Boolean.valueOf(c14767hf.m86028u()));
        if (iCompareTo21 != 0) {
            return iCompareTo21;
        }
        if (m86028u() && (iM118200k3 = euq0.m118200k(this.f62430a, c14767hf.f62430a)) != 0) {
            return iM118200k3;
        }
        int iCompareTo22 = Boolean.valueOf(m86029v()).compareTo(Boolean.valueOf(c14767hf.m86029v()));
        if (iCompareTo22 != 0) {
            return iCompareTo22;
        }
        if (m86029v() && (iM118192c2 = euq0.m118192c(this.f62424a, c14767hf.f62424a)) != 0) {
            return iM118192c2;
        }
        int iCompareTo23 = Boolean.valueOf(m86030w()).compareTo(Boolean.valueOf(c14767hf.m86030w()));
        if (iCompareTo23 != 0) {
            return iCompareTo23;
        }
        if (m86030w() && (iM118192c = euq0.m118192c(this.f62432b, c14767hf.f62432b)) != 0) {
            return iM118192c;
        }
        int iCompareTo24 = Boolean.valueOf(m86031x()).compareTo(Boolean.valueOf(c14767hf.m86031x()));
        if (iCompareTo24 != 0) {
            return iCompareTo24;
        }
        if (m86031x() && (iM118194e3 = euq0.m118194e(this.f62450p, c14767hf.f62450p)) != 0) {
            return iM118194e3;
        }
        int iCompareTo25 = Boolean.valueOf(m86032y()).compareTo(Boolean.valueOf(c14767hf.m86032y()));
        if (iCompareTo25 != 0) {
            return iCompareTo25;
        }
        if (m86032y() && (iM118194e2 = euq0.m118194e(this.f62451q, c14767hf.f62451q)) != 0) {
            return iM118194e2;
        }
        int iCompareTo26 = Boolean.valueOf(m86033z()).compareTo(Boolean.valueOf(c14767hf.m86033z()));
        if (iCompareTo26 != 0) {
            return iCompareTo26;
        }
        if (m86033z() && (iM118200k2 = euq0.m118200k(this.f62434b, c14767hf.f62434b)) != 0) {
            return iM118200k2;
        }
        int iCompareTo27 = Boolean.valueOf(m85978A()).compareTo(Boolean.valueOf(c14767hf.m85978A()));
        if (iCompareTo27 != 0) {
            return iCompareTo27;
        }
        if (m85978A() && (iM118197h = euq0.m118197h(this.f62429a, c14767hf.f62429a)) != 0) {
            return iM118197h;
        }
        int iCompareTo28 = Boolean.valueOf(m85979B()).compareTo(Boolean.valueOf(c14767hf.m85979B()));
        if (iCompareTo28 != 0) {
            return iCompareTo28;
        }
        if (m85979B() && (iM118200k = euq0.m118200k(this.f62437c, c14767hf.f62437c)) != 0) {
            return iM118200k;
        }
        int iCompareTo29 = Boolean.valueOf(m85980C()).compareTo(Boolean.valueOf(c14767hf.m85980C()));
        if (iCompareTo29 != 0) {
            return iCompareTo29;
        }
        if (!m85980C() || (iM118194e = euq0.m118194e(this.f62452r, c14767hf.f62452r)) == 0) {
            return 0;
        }
        return iM118194e;
    }

    @Override // com.xiaomi.push.InterfaceC14777hq
    /* JADX INFO: renamed from: b */
    public void mo85540b(quq0 quq0Var) throws C14781ib {
        m85986a();
        quq0Var.mo86237v(f62397a);
        if (this.f62427a != null && m85988a()) {
            quq0Var.mo86234s(f62396a);
            quq0Var.mo86232q(this.f62427a);
            quq0Var.mo86241z();
        }
        if (this.f62426a != null && m85994b()) {
            quq0Var.mo86234s(f62398b);
            this.f62426a.mo85540b(quq0Var);
            quq0Var.mo86241z();
        }
        if (this.f62433b != null) {
            quq0Var.mo86234s(f62399c);
            quq0Var.mo86232q(this.f62433b);
            quq0Var.mo86241z();
        }
        if (this.f62436c != null) {
            quq0Var.mo86234s(f62400d);
            quq0Var.mo86232q(this.f62436c);
            quq0Var.mo86241z();
        }
        if (this.f62438d != null && m86005e()) {
            quq0Var.mo86234s(f62401e);
            quq0Var.mo86232q(this.f62438d);
            quq0Var.mo86241z();
        }
        if (this.f62439e != null && m86008f()) {
            quq0Var.mo86234s(f62402f);
            quq0Var.mo86232q(this.f62439e);
            quq0Var.mo86241z();
        }
        if (this.f62440f != null) {
            quq0Var.mo86234s(f62403g);
            quq0Var.mo86232q(this.f62440f);
            quq0Var.mo86241z();
        }
        if (this.f62441g != null && m86014h()) {
            quq0Var.mo86234s(f62404h);
            quq0Var.mo86232q(this.f62441g);
            quq0Var.mo86241z();
        }
        if (this.f62442h != null && m86016i()) {
            quq0Var.mo86234s(f62405i);
            quq0Var.mo86232q(this.f62442h);
            quq0Var.mo86241z();
        }
        if (this.f62443i != null && m86017j()) {
            quq0Var.mo86234s(f62406j);
            quq0Var.mo86232q(this.f62443i);
            quq0Var.mo86241z();
        }
        if (this.f62444j != null && m86018k()) {
            quq0Var.mo86234s(f62407k);
            quq0Var.mo86232q(this.f62444j);
            quq0Var.mo86241z();
        }
        if (this.f62445k != null && m86019l()) {
            quq0Var.mo86234s(f62408l);
            quq0Var.mo86232q(this.f62445k);
            quq0Var.mo86241z();
        }
        if (m86020m()) {
            quq0Var.mo86234s(f62409m);
            quq0Var.mo86230o(this.f62423a);
            quq0Var.mo86241z();
        }
        if (m86021n()) {
            quq0Var.mo86234s(f62410n);
            quq0Var.mo86230o(this.f62431b);
            quq0Var.mo86241z();
        }
        if (this.f62446l != null && m86022o()) {
            quq0Var.mo86234s(f62411o);
            quq0Var.mo86232q(this.f62446l);
            quq0Var.mo86241z();
        }
        if (this.f62447m != null && m86023p()) {
            quq0Var.mo86234s(f62412p);
            quq0Var.mo86232q(this.f62447m);
            quq0Var.mo86241z();
        }
        if (this.f62448n != null && m86024q()) {
            quq0Var.mo86234s(f62413q);
            quq0Var.mo86232q(this.f62448n);
            quq0Var.mo86241z();
        }
        if (this.f62449o != null && m86025r()) {
            quq0Var.mo86234s(f62414r);
            quq0Var.mo86232q(this.f62449o);
            quq0Var.mo86241z();
        }
        if (m86026s()) {
            quq0Var.mo86234s(f62415s);
            quq0Var.mo86230o(this.f62435c);
            quq0Var.mo86241z();
        }
        if (this.f62425a != null && m86027t()) {
            quq0Var.mo86234s(f62416t);
            quq0Var.mo86230o(this.f62425a.m85765a());
            quq0Var.mo86241z();
        }
        if (m86028u()) {
            quq0Var.mo86234s(f62417u);
            quq0Var.mo86239x(this.f62430a);
            quq0Var.mo86241z();
        }
        if (m86029v()) {
            quq0Var.mo86234s(f62418v);
            quq0Var.mo86231p(this.f62424a);
            quq0Var.mo86241z();
        }
        if (m86030w()) {
            quq0Var.mo86234s(f62419w);
            quq0Var.mo86231p(this.f62432b);
            quq0Var.mo86241z();
        }
        if (this.f62450p != null && m86031x()) {
            quq0Var.mo86234s(f62420x);
            quq0Var.mo86232q(this.f62450p);
            quq0Var.mo86241z();
        }
        if (this.f62451q != null && m86032y()) {
            quq0Var.mo86234s(f62421y);
            quq0Var.mo86232q(this.f62451q);
            quq0Var.mo86241z();
        }
        if (m86033z()) {
            quq0Var.mo86234s(f62422z);
            quq0Var.mo86239x(this.f62434b);
            quq0Var.mo86241z();
        }
        if (this.f62429a != null && m85978A()) {
            quq0Var.mo86234s(f62393A);
            quq0Var.mo86236u(new iuq0((byte) 11, (byte) 11, this.f62429a.size()));
            for (Map.Entry<String, String> entry : this.f62429a.entrySet()) {
                quq0Var.mo86232q(entry.getKey());
                quq0Var.mo86232q(entry.getValue());
            }
            quq0Var.mo86206B();
            quq0Var.mo86241z();
        }
        if (m85979B()) {
            quq0Var.mo86234s(f62394B);
            quq0Var.mo86239x(this.f62437c);
            quq0Var.mo86241z();
        }
        if (this.f62452r != null && m85980C()) {
            quq0Var.mo86234s(f62395C);
            quq0Var.mo86232q(this.f62452r);
            quq0Var.mo86241z();
        }
        quq0Var.mo86205A();
        quq0Var.mo86228m();
    }

    /* JADX INFO: renamed from: c */
    public boolean m85999c() {
        return this.f62433b != null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m86002d() {
        return this.f62436c != null;
    }

    /* JADX INFO: renamed from: e */
    public boolean m86005e() {
        return this.f62438d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C14767hf)) {
            return m85989a((C14767hf) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m86008f() {
        return this.f62439e != null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m86011g() {
        return this.f62440f != null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m86014h() {
        return this.f62441g != null;
    }

    public int hashCode() {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public boolean m86016i() {
        return this.f62442h != null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m86017j() {
        return this.f62443i != null;
    }

    /* JADX INFO: renamed from: k */
    public boolean m86018k() {
        return this.f62444j != null;
    }

    /* JADX INFO: renamed from: l */
    public boolean m86019l() {
        return this.f62445k != null;
    }

    /* JADX INFO: renamed from: m */
    public boolean m86020m() {
        return this.f62428a.get(0);
    }

    /* JADX INFO: renamed from: n */
    public boolean m86021n() {
        return this.f62428a.get(1);
    }

    /* JADX INFO: renamed from: o */
    public boolean m86022o() {
        return this.f62446l != null;
    }

    /* JADX INFO: renamed from: p */
    public boolean m86023p() {
        return this.f62447m != null;
    }

    /* JADX INFO: renamed from: q */
    public boolean m86024q() {
        return this.f62448n != null;
    }

    /* JADX INFO: renamed from: r */
    public boolean m86025r() {
        return this.f62449o != null;
    }

    /* JADX INFO: renamed from: s */
    public boolean m86026s() {
        return this.f62428a.get(2);
    }

    /* JADX INFO: renamed from: t */
    public boolean m86027t() {
        return this.f62425a != null;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionRegistration(");
        boolean z2 = false;
        if (m85988a()) {
            sb.append("debug:");
            String str = this.f62427a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (m85994b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            C14755gu c14755gu = this.f62426a;
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
        String str2 = this.f62433b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(C14839aj.m86496a(str2));
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f62436c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        if (m86005e()) {
            sb.append(", ");
            sb.append("appVersion:");
            String str4 = this.f62438d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (m86008f()) {
            sb.append(", ");
            sb.append("packageName:");
            String str5 = this.f62439e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        sb.append(", ");
        sb.append("token:");
        String str6 = this.f62440f;
        if (str6 == null) {
            sb.append("null");
        } else {
            sb.append(str6);
        }
        if (m86014h()) {
            sb.append(", ");
            sb.append("deviceId:");
            String str7 = this.f62441g;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        if (m86016i()) {
            sb.append(", ");
            sb.append("aliasName:");
            String str8 = this.f62442h;
            if (str8 == null) {
                sb.append("null");
            } else {
                sb.append(str8);
            }
        }
        if (m86017j()) {
            sb.append(", ");
            sb.append("sdkVersion:");
            String str9 = this.f62443i;
            if (str9 == null) {
                sb.append("null");
            } else {
                sb.append(str9);
            }
        }
        if (m86018k()) {
            sb.append(", ");
            sb.append("regId:");
            String str10 = this.f62444j;
            if (str10 == null) {
                sb.append("null");
            } else {
                sb.append(str10);
            }
        }
        if (m86019l()) {
            sb.append(", ");
            sb.append("pushSdkVersionName:");
            String str11 = this.f62445k;
            if (str11 == null) {
                sb.append("null");
            } else {
                sb.append(str11);
            }
        }
        if (m86020m()) {
            sb.append(", ");
            sb.append("pushSdkVersionCode:");
            sb.append(this.f62423a);
        }
        if (m86021n()) {
            sb.append(", ");
            sb.append("appVersionCode:");
            sb.append(this.f62431b);
        }
        if (m86022o()) {
            sb.append(", ");
            sb.append("androidId:");
            String str12 = this.f62446l;
            if (str12 == null) {
                sb.append("null");
            } else {
                sb.append(str12);
            }
        }
        if (m86023p()) {
            sb.append(", ");
            sb.append("imei:");
            String str13 = this.f62447m;
            if (str13 == null) {
                sb.append("null");
            } else {
                sb.append(str13);
            }
        }
        if (m86024q()) {
            sb.append(", ");
            sb.append("serial:");
            String str14 = this.f62448n;
            if (str14 == null) {
                sb.append("null");
            } else {
                sb.append(str14);
            }
        }
        if (m86025r()) {
            sb.append(", ");
            sb.append("imeiMd5:");
            String str15 = this.f62449o;
            if (str15 == null) {
                sb.append("null");
            } else {
                sb.append(str15);
            }
        }
        if (m86026s()) {
            sb.append(", ");
            sb.append("spaceId:");
            sb.append(this.f62435c);
        }
        if (m86027t()) {
            sb.append(", ");
            sb.append("reason:");
            EnumC14754gt enumC14754gt = this.f62425a;
            if (enumC14754gt == null) {
                sb.append("null");
            } else {
                sb.append(enumC14754gt);
            }
        }
        if (m86028u()) {
            sb.append(", ");
            sb.append("validateToken:");
            sb.append(this.f62430a);
        }
        if (m86029v()) {
            sb.append(", ");
            sb.append("miid:");
            sb.append(this.f62424a);
        }
        if (m86030w()) {
            sb.append(", ");
            sb.append("createdTs:");
            sb.append(this.f62432b);
        }
        if (m86031x()) {
            sb.append(", ");
            sb.append("subImei:");
            String str16 = this.f62450p;
            if (str16 == null) {
                sb.append("null");
            } else {
                sb.append(str16);
            }
        }
        if (m86032y()) {
            sb.append(", ");
            sb.append("subImeiMd5:");
            String str17 = this.f62451q;
            if (str17 == null) {
                sb.append("null");
            } else {
                sb.append(str17);
            }
        }
        if (m86033z()) {
            sb.append(", ");
            sb.append("isHybridFrame:");
            sb.append(this.f62434b);
        }
        if (m85978A()) {
            sb.append(", ");
            sb.append("connectionAttrs:");
            Map<String, String> map = this.f62429a;
            if (map == null) {
                sb.append("null");
            } else {
                sb.append(map);
            }
        }
        if (m85979B()) {
            sb.append(", ");
            sb.append("cleanOldRegInfo:");
            sb.append(this.f62437c);
        }
        if (m85980C()) {
            sb.append(", ");
            sb.append("oldRegId:");
            String str18 = this.f62452r;
            if (str18 == null) {
                sb.append("null");
            } else {
                sb.append(str18);
            }
        }
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public boolean m86028u() {
        return this.f62428a.get(3);
    }

    /* JADX INFO: renamed from: v */
    public boolean m86029v() {
        return this.f62428a.get(4);
    }

    /* JADX INFO: renamed from: w */
    public boolean m86030w() {
        return this.f62428a.get(5);
    }

    /* JADX INFO: renamed from: x */
    public boolean m86031x() {
        return this.f62450p != null;
    }

    /* JADX INFO: renamed from: y */
    public boolean m86032y() {
        return this.f62451q != null;
    }

    /* JADX INFO: renamed from: z */
    public boolean m86033z() {
        return this.f62428a.get(6);
    }

    /* JADX INFO: renamed from: c */
    public C14767hf m85996c(String str) {
        this.f62438d = str;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public C14767hf m86000d(String str) {
        this.f62439e = str;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public C14767hf m86003e(String str) {
        this.f62440f = str;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public C14767hf m86006f(String str) {
        this.f62441g = str;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public C14767hf m86009g(String str) {
        this.f62442h = str;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public C14767hf m86012h(String str) {
        this.f62445k = str;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public C14767hf m86015i(String str) {
        this.f62449o = str;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public String m85997c() {
        return this.f62440f;
    }

    /* JADX INFO: renamed from: d */
    public void m86001d(boolean z) {
        this.f62428a.set(3, z);
    }

    /* JADX INFO: renamed from: e */
    public void m86004e(boolean z) {
        this.f62428a.set(4, z);
    }

    /* JADX INFO: renamed from: f */
    public void m86007f(boolean z) {
        this.f62428a.set(5, z);
    }

    /* JADX INFO: renamed from: g */
    public void m86010g(boolean z) {
        this.f62428a.set(6, z);
    }

    /* JADX INFO: renamed from: h */
    public void m86013h(boolean z) {
        this.f62428a.set(7, z);
    }

    /* JADX INFO: renamed from: c */
    public C14767hf m85995c(int i) {
        this.f62435c = i;
        m85998c(true);
        return this;
    }

    /* JADX INFO: renamed from: c */
    public void m85998c(boolean z) {
        this.f62428a.set(2, z);
    }

    /* JADX INFO: renamed from: b */
    public String m85992b() {
        return this.f62436c;
    }

    /* JADX INFO: renamed from: b */
    public C14767hf m85991b(String str) {
        this.f62436c = str;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public C14767hf m85990b(int i) {
        this.f62431b = i;
        m85993b(true);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public void m85993b(boolean z) {
        this.f62428a.set(1, z);
    }

    /* JADX INFO: renamed from: b */
    public boolean m85994b() {
        return this.f62426a != null;
    }

    /* JADX INFO: renamed from: a */
    public String m85985a() {
        return this.f62433b;
    }

    /* JADX INFO: renamed from: a */
    public C14767hf m85984a(String str) {
        this.f62433b = str;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C14767hf m85982a(int i) {
        this.f62423a = i;
        m85987a(true);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public void m85987a(boolean z) {
        this.f62428a.set(0, z);
    }

    /* JADX INFO: renamed from: a */
    public C14767hf m85983a(EnumC14754gt enumC14754gt) {
        this.f62425a = enumC14754gt;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public boolean m85989a(C14767hf c14767hf) {
        if (c14767hf == null) {
            return false;
        }
        boolean zM85988a = m85988a();
        boolean zM85988a2 = c14767hf.m85988a();
        if ((zM85988a || zM85988a2) && !(zM85988a && zM85988a2 && this.f62427a.equals(c14767hf.f62427a))) {
            return false;
        }
        boolean zM85994b = m85994b();
        boolean zM85994b2 = c14767hf.m85994b();
        if ((zM85994b || zM85994b2) && !(zM85994b && zM85994b2 && this.f62426a.m85770a(c14767hf.f62426a))) {
            return false;
        }
        boolean zM85999c = m85999c();
        boolean zM85999c2 = c14767hf.m85999c();
        if ((zM85999c || zM85999c2) && !(zM85999c && zM85999c2 && this.f62433b.equals(c14767hf.f62433b))) {
            return false;
        }
        boolean zM86002d = m86002d();
        boolean zM86002d2 = c14767hf.m86002d();
        if ((zM86002d || zM86002d2) && !(zM86002d && zM86002d2 && this.f62436c.equals(c14767hf.f62436c))) {
            return false;
        }
        boolean zM86005e = m86005e();
        boolean zM86005e2 = c14767hf.m86005e();
        if ((zM86005e || zM86005e2) && !(zM86005e && zM86005e2 && this.f62438d.equals(c14767hf.f62438d))) {
            return false;
        }
        boolean zM86008f = m86008f();
        boolean zM86008f2 = c14767hf.m86008f();
        if ((zM86008f || zM86008f2) && !(zM86008f && zM86008f2 && this.f62439e.equals(c14767hf.f62439e))) {
            return false;
        }
        boolean zM86011g = m86011g();
        boolean zM86011g2 = c14767hf.m86011g();
        if ((zM86011g || zM86011g2) && !(zM86011g && zM86011g2 && this.f62440f.equals(c14767hf.f62440f))) {
            return false;
        }
        boolean zM86014h = m86014h();
        boolean zM86014h2 = c14767hf.m86014h();
        if ((zM86014h || zM86014h2) && !(zM86014h && zM86014h2 && this.f62441g.equals(c14767hf.f62441g))) {
            return false;
        }
        boolean zM86016i = m86016i();
        boolean zM86016i2 = c14767hf.m86016i();
        if ((zM86016i || zM86016i2) && !(zM86016i && zM86016i2 && this.f62442h.equals(c14767hf.f62442h))) {
            return false;
        }
        boolean zM86017j = m86017j();
        boolean zM86017j2 = c14767hf.m86017j();
        if ((zM86017j || zM86017j2) && !(zM86017j && zM86017j2 && this.f62443i.equals(c14767hf.f62443i))) {
            return false;
        }
        boolean zM86018k = m86018k();
        boolean zM86018k2 = c14767hf.m86018k();
        if ((zM86018k || zM86018k2) && !(zM86018k && zM86018k2 && this.f62444j.equals(c14767hf.f62444j))) {
            return false;
        }
        boolean zM86019l = m86019l();
        boolean zM86019l2 = c14767hf.m86019l();
        if ((zM86019l || zM86019l2) && !(zM86019l && zM86019l2 && this.f62445k.equals(c14767hf.f62445k))) {
            return false;
        }
        boolean zM86020m = m86020m();
        boolean zM86020m2 = c14767hf.m86020m();
        if ((zM86020m || zM86020m2) && !(zM86020m && zM86020m2 && this.f62423a == c14767hf.f62423a)) {
            return false;
        }
        boolean zM86021n = m86021n();
        boolean zM86021n2 = c14767hf.m86021n();
        if ((zM86021n || zM86021n2) && !(zM86021n && zM86021n2 && this.f62431b == c14767hf.f62431b)) {
            return false;
        }
        boolean zM86022o = m86022o();
        boolean zM86022o2 = c14767hf.m86022o();
        if ((zM86022o || zM86022o2) && !(zM86022o && zM86022o2 && this.f62446l.equals(c14767hf.f62446l))) {
            return false;
        }
        boolean zM86023p = m86023p();
        boolean zM86023p2 = c14767hf.m86023p();
        if ((zM86023p || zM86023p2) && !(zM86023p && zM86023p2 && this.f62447m.equals(c14767hf.f62447m))) {
            return false;
        }
        boolean zM86024q = m86024q();
        boolean zM86024q2 = c14767hf.m86024q();
        if ((zM86024q || zM86024q2) && !(zM86024q && zM86024q2 && this.f62448n.equals(c14767hf.f62448n))) {
            return false;
        }
        boolean zM86025r = m86025r();
        boolean zM86025r2 = c14767hf.m86025r();
        if ((zM86025r || zM86025r2) && !(zM86025r && zM86025r2 && this.f62449o.equals(c14767hf.f62449o))) {
            return false;
        }
        boolean zM86026s = m86026s();
        boolean zM86026s2 = c14767hf.m86026s();
        if ((zM86026s || zM86026s2) && !(zM86026s && zM86026s2 && this.f62435c == c14767hf.f62435c)) {
            return false;
        }
        boolean zM86027t = m86027t();
        boolean zM86027t2 = c14767hf.m86027t();
        if ((zM86027t || zM86027t2) && !(zM86027t && zM86027t2 && this.f62425a.equals(c14767hf.f62425a))) {
            return false;
        }
        boolean zM86028u = m86028u();
        boolean zM86028u2 = c14767hf.m86028u();
        if ((zM86028u || zM86028u2) && !(zM86028u && zM86028u2 && this.f62430a == c14767hf.f62430a)) {
            return false;
        }
        boolean zM86029v = m86029v();
        boolean zM86029v2 = c14767hf.m86029v();
        if ((zM86029v || zM86029v2) && !(zM86029v && zM86029v2 && this.f62424a == c14767hf.f62424a)) {
            return false;
        }
        boolean zM86030w = m86030w();
        boolean zM86030w2 = c14767hf.m86030w();
        if ((zM86030w || zM86030w2) && !(zM86030w && zM86030w2 && this.f62432b == c14767hf.f62432b)) {
            return false;
        }
        boolean zM86031x = m86031x();
        boolean zM86031x2 = c14767hf.m86031x();
        if ((zM86031x || zM86031x2) && !(zM86031x && zM86031x2 && this.f62450p.equals(c14767hf.f62450p))) {
            return false;
        }
        boolean zM86032y = m86032y();
        boolean zM86032y2 = c14767hf.m86032y();
        if ((zM86032y || zM86032y2) && !(zM86032y && zM86032y2 && this.f62451q.equals(c14767hf.f62451q))) {
            return false;
        }
        boolean zM86033z = m86033z();
        boolean zM86033z2 = c14767hf.m86033z();
        if ((zM86033z || zM86033z2) && !(zM86033z && zM86033z2 && this.f62434b == c14767hf.f62434b)) {
            return false;
        }
        boolean zM85978A = m85978A();
        boolean zM85978A2 = c14767hf.m85978A();
        if ((zM85978A || zM85978A2) && !(zM85978A && zM85978A2 && this.f62429a.equals(c14767hf.f62429a))) {
            return false;
        }
        boolean zM85979B = m85979B();
        boolean zM85979B2 = c14767hf.m85979B();
        if ((zM85979B || zM85979B2) && !(zM85979B && zM85979B2 && this.f62437c == c14767hf.f62437c)) {
            return false;
        }
        boolean zM85980C = m85980C();
        boolean zM85980C2 = c14767hf.m85980C();
        if (zM85980C || zM85980C2) {
            return zM85980C && zM85980C2 && this.f62452r.equals(c14767hf.f62452r);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public boolean m85988a() {
        return this.f62427a != null;
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
                m85986a();
                return;
            }
            short s = guq0VarMo86222g.f104458c;
            switch (s) {
                case 1:
                    if (b == 11) {
                        this.f62427a = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 2:
                    if (b == 12) {
                        C14755gu c14755gu = new C14755gu();
                        this.f62426a = c14755gu;
                        c14755gu.mo85534a(quq0Var);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 3:
                    if (b == 11) {
                        this.f62433b = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 4:
                    if (b == 11) {
                        this.f62436c = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 5:
                    if (b == 11) {
                        this.f62438d = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 6:
                    if (b == 11) {
                        this.f62439e = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 7:
                    if (b == 11) {
                        this.f62440f = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 8:
                    if (b == 11) {
                        this.f62441g = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 9:
                    if (b == 11) {
                        this.f62442h = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 10:
                    if (b == 11) {
                        this.f62443i = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 11:
                    if (b == 11) {
                        this.f62444j = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 12:
                    if (b == 11) {
                        this.f62445k = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 13:
                    if (b == 8) {
                        this.f62423a = quq0Var.mo86218c();
                        m85987a(true);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 14:
                    if (b == 8) {
                        this.f62431b = quq0Var.mo86218c();
                        m85993b(true);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 15:
                    if (b == 11) {
                        this.f62446l = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 16:
                    if (b == 11) {
                        this.f62447m = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 17:
                    if (b == 11) {
                        this.f62448n = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 18:
                    if (b == 11) {
                        this.f62449o = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 19:
                    if (b == 8) {
                        this.f62435c = quq0Var.mo86218c();
                        m85998c(true);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 20:
                    if (b == 8) {
                        this.f62425a = EnumC14754gt.m85764a(quq0Var.mo86218c());
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 21:
                    if (b == 2) {
                        this.f62430a = quq0Var.mo86240y();
                        m86001d(true);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 22:
                    if (b == 10) {
                        this.f62424a = quq0Var.mo86219d();
                        m86004e(true);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 23:
                    if (b == 10) {
                        this.f62432b = quq0Var.mo86219d();
                        m86007f(true);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 24:
                    if (b == 11) {
                        this.f62450p = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 25:
                    if (b == 11) {
                        this.f62451q = quq0Var.mo86220e();
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                case 26:
                    if (b == 2) {
                        this.f62434b = quq0Var.mo86240y();
                        m86010g(true);
                    } else {
                        ruq0.m181208a(quq0Var, b);
                    }
                    break;
                default:
                    switch (s) {
                        case 100:
                            if (b == 13) {
                                iuq0 iuq0VarMo86224i = quq0Var.mo86224i();
                                this.f62429a = new HashMap(iuq0VarMo86224i.f115048c * 2);
                                for (int i = 0; i < iuq0VarMo86224i.f115048c; i++) {
                                    this.f62429a.put(quq0Var.mo86220e(), quq0Var.mo86220e());
                                }
                                quq0Var.mo86210F();
                            } else {
                                ruq0.m181208a(quq0Var, b);
                            }
                            break;
                        case 101:
                            if (b == 2) {
                                this.f62437c = quq0Var.mo86240y();
                                m86013h(true);
                            } else {
                                ruq0.m181208a(quq0Var, b);
                            }
                            break;
                        case 102:
                            if (b == 11) {
                                this.f62452r = quq0Var.mo86220e();
                            } else {
                                ruq0.m181208a(quq0Var, b);
                            }
                            break;
                        default:
                            ruq0.m181208a(quq0Var, b);
                            break;
                    }
                    break;
            }
            quq0Var.mo86209E();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m85986a() throws C14781ib {
        if (this.f62433b != null) {
            if (this.f62436c != null) {
                if (this.f62440f != null) {
                    return;
                }
                throw new C14781ib("Required field 'token' was not present! Struct: " + toString());
            }
            throw new C14781ib("Required field 'appId' was not present! Struct: " + toString());
        }
        throw new C14781ib("Required field 'id' was not present! Struct: " + toString());
    }
}
