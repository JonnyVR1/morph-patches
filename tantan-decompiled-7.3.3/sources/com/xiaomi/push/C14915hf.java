package com.xiaomi.push;

import com.xiaomi.push.service.C14987aj;
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

/* JADX INFO: renamed from: com.xiaomi.push.hf */
/* JADX INFO: loaded from: classes2.dex */
public class C14915hf implements InterfaceC14925hq<C14915hf, Object>, Serializable, Cloneable {

    /* JADX INFO: renamed from: a */
    public int f63270a;

    /* JADX INFO: renamed from: a */
    public long f63271a;

    /* JADX INFO: renamed from: a */
    public EnumC14902gt f63272a;

    /* JADX INFO: renamed from: a */
    public C14903gu f63273a;

    /* JADX INFO: renamed from: a */
    public String f63274a;

    /* JADX INFO: renamed from: a */
    public Map<String, String> f63276a;

    /* JADX INFO: renamed from: b */
    public int f63278b;

    /* JADX INFO: renamed from: b */
    public long f63279b;

    /* JADX INFO: renamed from: b */
    public String f63280b;

    /* JADX INFO: renamed from: c */
    public int f63282c;

    /* JADX INFO: renamed from: c */
    public String f63283c;

    /* JADX INFO: renamed from: d */
    public String f63285d;

    /* JADX INFO: renamed from: e */
    public String f63286e;

    /* JADX INFO: renamed from: f */
    public String f63287f;

    /* JADX INFO: renamed from: g */
    public String f63288g;

    /* JADX INFO: renamed from: h */
    public String f63289h;

    /* JADX INFO: renamed from: i */
    public String f63290i;

    /* JADX INFO: renamed from: j */
    public String f63291j;

    /* JADX INFO: renamed from: k */
    public String f63292k;

    /* JADX INFO: renamed from: l */
    public String f63293l;

    /* JADX INFO: renamed from: m */
    public String f63294m;

    /* JADX INFO: renamed from: n */
    public String f63295n;

    /* JADX INFO: renamed from: o */
    public String f63296o;

    /* JADX INFO: renamed from: p */
    public String f63297p;

    /* JADX INFO: renamed from: q */
    public String f63298q;

    /* JADX INFO: renamed from: r */
    public String f63299r;

    /* JADX INFO: renamed from: a */
    private static final z3r0 f63244a = new z3r0("XmPushActionRegistration");

    /* JADX INFO: renamed from: a */
    private static final m3r0 f63243a = new m3r0("", (byte) 11, 1);

    /* JADX INFO: renamed from: b */
    private static final m3r0 f63245b = new m3r0("", (byte) 12, 2);

    /* JADX INFO: renamed from: c */
    private static final m3r0 f63246c = new m3r0("", (byte) 11, 3);

    /* JADX INFO: renamed from: d */
    private static final m3r0 f63247d = new m3r0("", (byte) 11, 4);

    /* JADX INFO: renamed from: e */
    private static final m3r0 f63248e = new m3r0("", (byte) 11, 5);

    /* JADX INFO: renamed from: f */
    private static final m3r0 f63249f = new m3r0("", (byte) 11, 6);

    /* JADX INFO: renamed from: g */
    private static final m3r0 f63250g = new m3r0("", (byte) 11, 7);

    /* JADX INFO: renamed from: h */
    private static final m3r0 f63251h = new m3r0("", (byte) 11, 8);

    /* JADX INFO: renamed from: i */
    private static final m3r0 f63252i = new m3r0("", (byte) 11, 9);

    /* JADX INFO: renamed from: j */
    private static final m3r0 f63253j = new m3r0("", (byte) 11, 10);

    /* JADX INFO: renamed from: k */
    private static final m3r0 f63254k = new m3r0("", (byte) 11, 11);

    /* JADX INFO: renamed from: l */
    private static final m3r0 f63255l = new m3r0("", (byte) 11, 12);

    /* JADX INFO: renamed from: m */
    private static final m3r0 f63256m = new m3r0("", (byte) 8, 13);

    /* JADX INFO: renamed from: n */
    private static final m3r0 f63257n = new m3r0("", (byte) 8, 14);

    /* JADX INFO: renamed from: o */
    private static final m3r0 f63258o = new m3r0("", (byte) 11, 15);

    /* JADX INFO: renamed from: p */
    private static final m3r0 f63259p = new m3r0("", (byte) 11, 16);

    /* JADX INFO: renamed from: q */
    private static final m3r0 f63260q = new m3r0("", (byte) 11, 17);

    /* JADX INFO: renamed from: r */
    private static final m3r0 f63261r = new m3r0("", (byte) 11, 18);

    /* JADX INFO: renamed from: s */
    private static final m3r0 f63262s = new m3r0("", (byte) 8, 19);

    /* JADX INFO: renamed from: t */
    private static final m3r0 f63263t = new m3r0("", (byte) 8, 20);

    /* JADX INFO: renamed from: u */
    private static final m3r0 f63264u = new m3r0("", (byte) 2, 21);

    /* JADX INFO: renamed from: v */
    private static final m3r0 f63265v = new m3r0("", (byte) 10, 22);

    /* JADX INFO: renamed from: w */
    private static final m3r0 f63266w = new m3r0("", (byte) 10, 23);

    /* JADX INFO: renamed from: x */
    private static final m3r0 f63267x = new m3r0("", (byte) 11, 24);

    /* JADX INFO: renamed from: y */
    private static final m3r0 f63268y = new m3r0("", (byte) 11, 25);

    /* JADX INFO: renamed from: z */
    private static final m3r0 f63269z = new m3r0("", (byte) 2, 26);

    /* JADX INFO: renamed from: A */
    private static final m3r0 f63240A = new m3r0("", HttpTokens.CARRIAGE_RETURN, 100);

    /* JADX INFO: renamed from: B */
    private static final m3r0 f63241B = new m3r0("", (byte) 2, 101);

    /* JADX INFO: renamed from: C */
    private static final m3r0 f63242C = new m3r0("", (byte) 11, 102);

    /* JADX INFO: renamed from: a */
    private BitSet f63275a = new BitSet(8);

    /* JADX INFO: renamed from: a */
    public boolean f63277a = true;

    /* JADX INFO: renamed from: c */
    public boolean f63284c = false;

    /* JADX INFO: renamed from: b */
    public boolean f63281b = false;

    /* JADX INFO: renamed from: A */
    public boolean m87149A() {
        return this.f63276a != null;
    }

    /* JADX INFO: renamed from: B */
    public boolean m87150B() {
        return this.f63275a.get(7);
    }

    /* JADX INFO: renamed from: C */
    public boolean m87151C() {
        return this.f63299r != null;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C14915hf c14915hf) {
        int iM148146e;
        int iM148152k;
        int iM148149h;
        int iM148152k2;
        int iM148146e2;
        int iM148146e3;
        int iM148144c;
        int iM148144c2;
        int iM148152k3;
        int iM148145d;
        int iM148143b;
        int iM148146e4;
        int iM148146e5;
        int iM148146e6;
        int iM148146e7;
        int iM148143b2;
        int iM148143b3;
        int iM148146e8;
        int iM148146e9;
        int iM148146e10;
        int iM148146e11;
        int iM148146e12;
        int iM148146e13;
        int iM148146e14;
        int iM148146e15;
        int iM148146e16;
        int iM148146e17;
        int iM148145d2;
        int iM148146e18;
        if (!getClass().equals(c14915hf.getClass())) {
            return getClass().getName().compareTo(c14915hf.getClass().getName());
        }
        int iCompareTo = Boolean.valueOf(m87159a()).compareTo(Boolean.valueOf(c14915hf.m87159a()));
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        if (m87159a() && (iM148146e18 = k3r0.m148146e(this.f63274a, c14915hf.f63274a)) != 0) {
            return iM148146e18;
        }
        int iCompareTo2 = Boolean.valueOf(m87165b()).compareTo(Boolean.valueOf(c14915hf.m87165b()));
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        if (m87165b() && (iM148145d2 = k3r0.m148145d(this.f63273a, c14915hf.f63273a)) != 0) {
            return iM148145d2;
        }
        int iCompareTo3 = Boolean.valueOf(m87170c()).compareTo(Boolean.valueOf(c14915hf.m87170c()));
        if (iCompareTo3 != 0) {
            return iCompareTo3;
        }
        if (m87170c() && (iM148146e17 = k3r0.m148146e(this.f63280b, c14915hf.f63280b)) != 0) {
            return iM148146e17;
        }
        int iCompareTo4 = Boolean.valueOf(m87173d()).compareTo(Boolean.valueOf(c14915hf.m87173d()));
        if (iCompareTo4 != 0) {
            return iCompareTo4;
        }
        if (m87173d() && (iM148146e16 = k3r0.m148146e(this.f63283c, c14915hf.f63283c)) != 0) {
            return iM148146e16;
        }
        int iCompareTo5 = Boolean.valueOf(m87176e()).compareTo(Boolean.valueOf(c14915hf.m87176e()));
        if (iCompareTo5 != 0) {
            return iCompareTo5;
        }
        if (m87176e() && (iM148146e15 = k3r0.m148146e(this.f63285d, c14915hf.f63285d)) != 0) {
            return iM148146e15;
        }
        int iCompareTo6 = Boolean.valueOf(m87179f()).compareTo(Boolean.valueOf(c14915hf.m87179f()));
        if (iCompareTo6 != 0) {
            return iCompareTo6;
        }
        if (m87179f() && (iM148146e14 = k3r0.m148146e(this.f63286e, c14915hf.f63286e)) != 0) {
            return iM148146e14;
        }
        int iCompareTo7 = Boolean.valueOf(m87182g()).compareTo(Boolean.valueOf(c14915hf.m87182g()));
        if (iCompareTo7 != 0) {
            return iCompareTo7;
        }
        if (m87182g() && (iM148146e13 = k3r0.m148146e(this.f63287f, c14915hf.f63287f)) != 0) {
            return iM148146e13;
        }
        int iCompareTo8 = Boolean.valueOf(m87185h()).compareTo(Boolean.valueOf(c14915hf.m87185h()));
        if (iCompareTo8 != 0) {
            return iCompareTo8;
        }
        if (m87185h() && (iM148146e12 = k3r0.m148146e(this.f63288g, c14915hf.f63288g)) != 0) {
            return iM148146e12;
        }
        int iCompareTo9 = Boolean.valueOf(m87187i()).compareTo(Boolean.valueOf(c14915hf.m87187i()));
        if (iCompareTo9 != 0) {
            return iCompareTo9;
        }
        if (m87187i() && (iM148146e11 = k3r0.m148146e(this.f63289h, c14915hf.f63289h)) != 0) {
            return iM148146e11;
        }
        int iCompareTo10 = Boolean.valueOf(m87188j()).compareTo(Boolean.valueOf(c14915hf.m87188j()));
        if (iCompareTo10 != 0) {
            return iCompareTo10;
        }
        if (m87188j() && (iM148146e10 = k3r0.m148146e(this.f63290i, c14915hf.f63290i)) != 0) {
            return iM148146e10;
        }
        int iCompareTo11 = Boolean.valueOf(m87189k()).compareTo(Boolean.valueOf(c14915hf.m87189k()));
        if (iCompareTo11 != 0) {
            return iCompareTo11;
        }
        if (m87189k() && (iM148146e9 = k3r0.m148146e(this.f63291j, c14915hf.f63291j)) != 0) {
            return iM148146e9;
        }
        int iCompareTo12 = Boolean.valueOf(m87190l()).compareTo(Boolean.valueOf(c14915hf.m87190l()));
        if (iCompareTo12 != 0) {
            return iCompareTo12;
        }
        if (m87190l() && (iM148146e8 = k3r0.m148146e(this.f63292k, c14915hf.f63292k)) != 0) {
            return iM148146e8;
        }
        int iCompareTo13 = Boolean.valueOf(m87191m()).compareTo(Boolean.valueOf(c14915hf.m87191m()));
        if (iCompareTo13 != 0) {
            return iCompareTo13;
        }
        if (m87191m() && (iM148143b3 = k3r0.m148143b(this.f63270a, c14915hf.f63270a)) != 0) {
            return iM148143b3;
        }
        int iCompareTo14 = Boolean.valueOf(m87192n()).compareTo(Boolean.valueOf(c14915hf.m87192n()));
        if (iCompareTo14 != 0) {
            return iCompareTo14;
        }
        if (m87192n() && (iM148143b2 = k3r0.m148143b(this.f63278b, c14915hf.f63278b)) != 0) {
            return iM148143b2;
        }
        int iCompareTo15 = Boolean.valueOf(m87193o()).compareTo(Boolean.valueOf(c14915hf.m87193o()));
        if (iCompareTo15 != 0) {
            return iCompareTo15;
        }
        if (m87193o() && (iM148146e7 = k3r0.m148146e(this.f63293l, c14915hf.f63293l)) != 0) {
            return iM148146e7;
        }
        int iCompareTo16 = Boolean.valueOf(m87194p()).compareTo(Boolean.valueOf(c14915hf.m87194p()));
        if (iCompareTo16 != 0) {
            return iCompareTo16;
        }
        if (m87194p() && (iM148146e6 = k3r0.m148146e(this.f63294m, c14915hf.f63294m)) != 0) {
            return iM148146e6;
        }
        int iCompareTo17 = Boolean.valueOf(m87195q()).compareTo(Boolean.valueOf(c14915hf.m87195q()));
        if (iCompareTo17 != 0) {
            return iCompareTo17;
        }
        if (m87195q() && (iM148146e5 = k3r0.m148146e(this.f63295n, c14915hf.f63295n)) != 0) {
            return iM148146e5;
        }
        int iCompareTo18 = Boolean.valueOf(m87196r()).compareTo(Boolean.valueOf(c14915hf.m87196r()));
        if (iCompareTo18 != 0) {
            return iCompareTo18;
        }
        if (m87196r() && (iM148146e4 = k3r0.m148146e(this.f63296o, c14915hf.f63296o)) != 0) {
            return iM148146e4;
        }
        int iCompareTo19 = Boolean.valueOf(m87197s()).compareTo(Boolean.valueOf(c14915hf.m87197s()));
        if (iCompareTo19 != 0) {
            return iCompareTo19;
        }
        if (m87197s() && (iM148143b = k3r0.m148143b(this.f63282c, c14915hf.f63282c)) != 0) {
            return iM148143b;
        }
        int iCompareTo20 = Boolean.valueOf(m87198t()).compareTo(Boolean.valueOf(c14915hf.m87198t()));
        if (iCompareTo20 != 0) {
            return iCompareTo20;
        }
        if (m87198t() && (iM148145d = k3r0.m148145d(this.f63272a, c14915hf.f63272a)) != 0) {
            return iM148145d;
        }
        int iCompareTo21 = Boolean.valueOf(m87199u()).compareTo(Boolean.valueOf(c14915hf.m87199u()));
        if (iCompareTo21 != 0) {
            return iCompareTo21;
        }
        if (m87199u() && (iM148152k3 = k3r0.m148152k(this.f63277a, c14915hf.f63277a)) != 0) {
            return iM148152k3;
        }
        int iCompareTo22 = Boolean.valueOf(m87200v()).compareTo(Boolean.valueOf(c14915hf.m87200v()));
        if (iCompareTo22 != 0) {
            return iCompareTo22;
        }
        if (m87200v() && (iM148144c2 = k3r0.m148144c(this.f63271a, c14915hf.f63271a)) != 0) {
            return iM148144c2;
        }
        int iCompareTo23 = Boolean.valueOf(m87201w()).compareTo(Boolean.valueOf(c14915hf.m87201w()));
        if (iCompareTo23 != 0) {
            return iCompareTo23;
        }
        if (m87201w() && (iM148144c = k3r0.m148144c(this.f63279b, c14915hf.f63279b)) != 0) {
            return iM148144c;
        }
        int iCompareTo24 = Boolean.valueOf(m87202x()).compareTo(Boolean.valueOf(c14915hf.m87202x()));
        if (iCompareTo24 != 0) {
            return iCompareTo24;
        }
        if (m87202x() && (iM148146e3 = k3r0.m148146e(this.f63297p, c14915hf.f63297p)) != 0) {
            return iM148146e3;
        }
        int iCompareTo25 = Boolean.valueOf(m87203y()).compareTo(Boolean.valueOf(c14915hf.m87203y()));
        if (iCompareTo25 != 0) {
            return iCompareTo25;
        }
        if (m87203y() && (iM148146e2 = k3r0.m148146e(this.f63298q, c14915hf.f63298q)) != 0) {
            return iM148146e2;
        }
        int iCompareTo26 = Boolean.valueOf(m87204z()).compareTo(Boolean.valueOf(c14915hf.m87204z()));
        if (iCompareTo26 != 0) {
            return iCompareTo26;
        }
        if (m87204z() && (iM148152k2 = k3r0.m148152k(this.f63281b, c14915hf.f63281b)) != 0) {
            return iM148152k2;
        }
        int iCompareTo27 = Boolean.valueOf(m87149A()).compareTo(Boolean.valueOf(c14915hf.m87149A()));
        if (iCompareTo27 != 0) {
            return iCompareTo27;
        }
        if (m87149A() && (iM148149h = k3r0.m148149h(this.f63276a, c14915hf.f63276a)) != 0) {
            return iM148149h;
        }
        int iCompareTo28 = Boolean.valueOf(m87150B()).compareTo(Boolean.valueOf(c14915hf.m87150B()));
        if (iCompareTo28 != 0) {
            return iCompareTo28;
        }
        if (m87150B() && (iM148152k = k3r0.m148152k(this.f63284c, c14915hf.f63284c)) != 0) {
            return iM148152k;
        }
        int iCompareTo29 = Boolean.valueOf(m87151C()).compareTo(Boolean.valueOf(c14915hf.m87151C()));
        if (iCompareTo29 != 0) {
            return iCompareTo29;
        }
        if (!m87151C() || (iM148146e = k3r0.m148146e(this.f63299r, c14915hf.f63299r)) == 0) {
            return 0;
        }
        return iM148146e;
    }

    @Override // com.xiaomi.push.InterfaceC14925hq
    /* JADX INFO: renamed from: b */
    public void mo86711b(w3r0 w3r0Var) throws C14929ib {
        m87157a();
        w3r0Var.mo87408v(f63244a);
        if (this.f63274a != null && m87159a()) {
            w3r0Var.mo87405s(f63243a);
            w3r0Var.mo87403q(this.f63274a);
            w3r0Var.mo87412z();
        }
        if (this.f63273a != null && m87165b()) {
            w3r0Var.mo87405s(f63245b);
            this.f63273a.mo86711b(w3r0Var);
            w3r0Var.mo87412z();
        }
        if (this.f63280b != null) {
            w3r0Var.mo87405s(f63246c);
            w3r0Var.mo87403q(this.f63280b);
            w3r0Var.mo87412z();
        }
        if (this.f63283c != null) {
            w3r0Var.mo87405s(f63247d);
            w3r0Var.mo87403q(this.f63283c);
            w3r0Var.mo87412z();
        }
        if (this.f63285d != null && m87176e()) {
            w3r0Var.mo87405s(f63248e);
            w3r0Var.mo87403q(this.f63285d);
            w3r0Var.mo87412z();
        }
        if (this.f63286e != null && m87179f()) {
            w3r0Var.mo87405s(f63249f);
            w3r0Var.mo87403q(this.f63286e);
            w3r0Var.mo87412z();
        }
        if (this.f63287f != null) {
            w3r0Var.mo87405s(f63250g);
            w3r0Var.mo87403q(this.f63287f);
            w3r0Var.mo87412z();
        }
        if (this.f63288g != null && m87185h()) {
            w3r0Var.mo87405s(f63251h);
            w3r0Var.mo87403q(this.f63288g);
            w3r0Var.mo87412z();
        }
        if (this.f63289h != null && m87187i()) {
            w3r0Var.mo87405s(f63252i);
            w3r0Var.mo87403q(this.f63289h);
            w3r0Var.mo87412z();
        }
        if (this.f63290i != null && m87188j()) {
            w3r0Var.mo87405s(f63253j);
            w3r0Var.mo87403q(this.f63290i);
            w3r0Var.mo87412z();
        }
        if (this.f63291j != null && m87189k()) {
            w3r0Var.mo87405s(f63254k);
            w3r0Var.mo87403q(this.f63291j);
            w3r0Var.mo87412z();
        }
        if (this.f63292k != null && m87190l()) {
            w3r0Var.mo87405s(f63255l);
            w3r0Var.mo87403q(this.f63292k);
            w3r0Var.mo87412z();
        }
        if (m87191m()) {
            w3r0Var.mo87405s(f63256m);
            w3r0Var.mo87401o(this.f63270a);
            w3r0Var.mo87412z();
        }
        if (m87192n()) {
            w3r0Var.mo87405s(f63257n);
            w3r0Var.mo87401o(this.f63278b);
            w3r0Var.mo87412z();
        }
        if (this.f63293l != null && m87193o()) {
            w3r0Var.mo87405s(f63258o);
            w3r0Var.mo87403q(this.f63293l);
            w3r0Var.mo87412z();
        }
        if (this.f63294m != null && m87194p()) {
            w3r0Var.mo87405s(f63259p);
            w3r0Var.mo87403q(this.f63294m);
            w3r0Var.mo87412z();
        }
        if (this.f63295n != null && m87195q()) {
            w3r0Var.mo87405s(f63260q);
            w3r0Var.mo87403q(this.f63295n);
            w3r0Var.mo87412z();
        }
        if (this.f63296o != null && m87196r()) {
            w3r0Var.mo87405s(f63261r);
            w3r0Var.mo87403q(this.f63296o);
            w3r0Var.mo87412z();
        }
        if (m87197s()) {
            w3r0Var.mo87405s(f63262s);
            w3r0Var.mo87401o(this.f63282c);
            w3r0Var.mo87412z();
        }
        if (this.f63272a != null && m87198t()) {
            w3r0Var.mo87405s(f63263t);
            w3r0Var.mo87401o(this.f63272a.m86936a());
            w3r0Var.mo87412z();
        }
        if (m87199u()) {
            w3r0Var.mo87405s(f63264u);
            w3r0Var.mo87410x(this.f63277a);
            w3r0Var.mo87412z();
        }
        if (m87200v()) {
            w3r0Var.mo87405s(f63265v);
            w3r0Var.mo87402p(this.f63271a);
            w3r0Var.mo87412z();
        }
        if (m87201w()) {
            w3r0Var.mo87405s(f63266w);
            w3r0Var.mo87402p(this.f63279b);
            w3r0Var.mo87412z();
        }
        if (this.f63297p != null && m87202x()) {
            w3r0Var.mo87405s(f63267x);
            w3r0Var.mo87403q(this.f63297p);
            w3r0Var.mo87412z();
        }
        if (this.f63298q != null && m87203y()) {
            w3r0Var.mo87405s(f63268y);
            w3r0Var.mo87403q(this.f63298q);
            w3r0Var.mo87412z();
        }
        if (m87204z()) {
            w3r0Var.mo87405s(f63269z);
            w3r0Var.mo87410x(this.f63281b);
            w3r0Var.mo87412z();
        }
        if (this.f63276a != null && m87149A()) {
            w3r0Var.mo87405s(f63240A);
            w3r0Var.mo87407u(new o3r0((byte) 11, (byte) 11, this.f63276a.size()));
            for (Map.Entry<String, String> entry : this.f63276a.entrySet()) {
                w3r0Var.mo87403q(entry.getKey());
                w3r0Var.mo87403q(entry.getValue());
            }
            w3r0Var.mo87377B();
            w3r0Var.mo87412z();
        }
        if (m87150B()) {
            w3r0Var.mo87405s(f63241B);
            w3r0Var.mo87410x(this.f63284c);
            w3r0Var.mo87412z();
        }
        if (this.f63299r != null && m87151C()) {
            w3r0Var.mo87405s(f63242C);
            w3r0Var.mo87403q(this.f63299r);
            w3r0Var.mo87412z();
        }
        w3r0Var.mo87376A();
        w3r0Var.mo87399m();
    }

    /* JADX INFO: renamed from: c */
    public boolean m87170c() {
        return this.f63280b != null;
    }

    /* JADX INFO: renamed from: d */
    public boolean m87173d() {
        return this.f63283c != null;
    }

    /* JADX INFO: renamed from: e */
    public boolean m87176e() {
        return this.f63285d != null;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof C14915hf)) {
            return m87160a((C14915hf) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public boolean m87179f() {
        return this.f63286e != null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m87182g() {
        return this.f63287f != null;
    }

    /* JADX INFO: renamed from: h */
    public boolean m87185h() {
        return this.f63288g != null;
    }

    public int hashCode() {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public boolean m87187i() {
        return this.f63289h != null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m87188j() {
        return this.f63290i != null;
    }

    /* JADX INFO: renamed from: k */
    public boolean m87189k() {
        return this.f63291j != null;
    }

    /* JADX INFO: renamed from: l */
    public boolean m87190l() {
        return this.f63292k != null;
    }

    /* JADX INFO: renamed from: m */
    public boolean m87191m() {
        return this.f63275a.get(0);
    }

    /* JADX INFO: renamed from: n */
    public boolean m87192n() {
        return this.f63275a.get(1);
    }

    /* JADX INFO: renamed from: o */
    public boolean m87193o() {
        return this.f63293l != null;
    }

    /* JADX INFO: renamed from: p */
    public boolean m87194p() {
        return this.f63294m != null;
    }

    /* JADX INFO: renamed from: q */
    public boolean m87195q() {
        return this.f63295n != null;
    }

    /* JADX INFO: renamed from: r */
    public boolean m87196r() {
        return this.f63296o != null;
    }

    /* JADX INFO: renamed from: s */
    public boolean m87197s() {
        return this.f63275a.get(2);
    }

    /* JADX INFO: renamed from: t */
    public boolean m87198t() {
        return this.f63272a != null;
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("XmPushActionRegistration(");
        boolean z2 = false;
        if (m87159a()) {
            sb.append("debug:");
            String str = this.f63274a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (m87165b()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append("target:");
            C14903gu c14903gu = this.f63273a;
            if (c14903gu == null) {
                sb.append("null");
            } else {
                sb.append(c14903gu);
            }
        } else {
            z2 = z;
        }
        if (!z2) {
            sb.append(", ");
        }
        sb.append("id:");
        String str2 = this.f63280b;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(C14987aj.m87667a(str2));
        }
        sb.append(", ");
        sb.append("appId:");
        String str3 = this.f63283c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        if (m87176e()) {
            sb.append(", ");
            sb.append("appVersion:");
            String str4 = this.f63285d;
            if (str4 == null) {
                sb.append("null");
            } else {
                sb.append(str4);
            }
        }
        if (m87179f()) {
            sb.append(", ");
            sb.append("packageName:");
            String str5 = this.f63286e;
            if (str5 == null) {
                sb.append("null");
            } else {
                sb.append(str5);
            }
        }
        sb.append(", ");
        sb.append("token:");
        String str6 = this.f63287f;
        if (str6 == null) {
            sb.append("null");
        } else {
            sb.append(str6);
        }
        if (m87185h()) {
            sb.append(", ");
            sb.append("deviceId:");
            String str7 = this.f63288g;
            if (str7 == null) {
                sb.append("null");
            } else {
                sb.append(str7);
            }
        }
        if (m87187i()) {
            sb.append(", ");
            sb.append("aliasName:");
            String str8 = this.f63289h;
            if (str8 == null) {
                sb.append("null");
            } else {
                sb.append(str8);
            }
        }
        if (m87188j()) {
            sb.append(", ");
            sb.append("sdkVersion:");
            String str9 = this.f63290i;
            if (str9 == null) {
                sb.append("null");
            } else {
                sb.append(str9);
            }
        }
        if (m87189k()) {
            sb.append(", ");
            sb.append("regId:");
            String str10 = this.f63291j;
            if (str10 == null) {
                sb.append("null");
            } else {
                sb.append(str10);
            }
        }
        if (m87190l()) {
            sb.append(", ");
            sb.append("pushSdkVersionName:");
            String str11 = this.f63292k;
            if (str11 == null) {
                sb.append("null");
            } else {
                sb.append(str11);
            }
        }
        if (m87191m()) {
            sb.append(", ");
            sb.append("pushSdkVersionCode:");
            sb.append(this.f63270a);
        }
        if (m87192n()) {
            sb.append(", ");
            sb.append("appVersionCode:");
            sb.append(this.f63278b);
        }
        if (m87193o()) {
            sb.append(", ");
            sb.append("androidId:");
            String str12 = this.f63293l;
            if (str12 == null) {
                sb.append("null");
            } else {
                sb.append(str12);
            }
        }
        if (m87194p()) {
            sb.append(", ");
            sb.append("imei:");
            String str13 = this.f63294m;
            if (str13 == null) {
                sb.append("null");
            } else {
                sb.append(str13);
            }
        }
        if (m87195q()) {
            sb.append(", ");
            sb.append("serial:");
            String str14 = this.f63295n;
            if (str14 == null) {
                sb.append("null");
            } else {
                sb.append(str14);
            }
        }
        if (m87196r()) {
            sb.append(", ");
            sb.append("imeiMd5:");
            String str15 = this.f63296o;
            if (str15 == null) {
                sb.append("null");
            } else {
                sb.append(str15);
            }
        }
        if (m87197s()) {
            sb.append(", ");
            sb.append("spaceId:");
            sb.append(this.f63282c);
        }
        if (m87198t()) {
            sb.append(", ");
            sb.append("reason:");
            EnumC14902gt enumC14902gt = this.f63272a;
            if (enumC14902gt == null) {
                sb.append("null");
            } else {
                sb.append(enumC14902gt);
            }
        }
        if (m87199u()) {
            sb.append(", ");
            sb.append("validateToken:");
            sb.append(this.f63277a);
        }
        if (m87200v()) {
            sb.append(", ");
            sb.append("miid:");
            sb.append(this.f63271a);
        }
        if (m87201w()) {
            sb.append(", ");
            sb.append("createdTs:");
            sb.append(this.f63279b);
        }
        if (m87202x()) {
            sb.append(", ");
            sb.append("subImei:");
            String str16 = this.f63297p;
            if (str16 == null) {
                sb.append("null");
            } else {
                sb.append(str16);
            }
        }
        if (m87203y()) {
            sb.append(", ");
            sb.append("subImeiMd5:");
            String str17 = this.f63298q;
            if (str17 == null) {
                sb.append("null");
            } else {
                sb.append(str17);
            }
        }
        if (m87204z()) {
            sb.append(", ");
            sb.append("isHybridFrame:");
            sb.append(this.f63281b);
        }
        if (m87149A()) {
            sb.append(", ");
            sb.append("connectionAttrs:");
            Map<String, String> map = this.f63276a;
            if (map == null) {
                sb.append("null");
            } else {
                sb.append(map);
            }
        }
        if (m87150B()) {
            sb.append(", ");
            sb.append("cleanOldRegInfo:");
            sb.append(this.f63284c);
        }
        if (m87151C()) {
            sb.append(", ");
            sb.append("oldRegId:");
            String str18 = this.f63299r;
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
    public boolean m87199u() {
        return this.f63275a.get(3);
    }

    /* JADX INFO: renamed from: v */
    public boolean m87200v() {
        return this.f63275a.get(4);
    }

    /* JADX INFO: renamed from: w */
    public boolean m87201w() {
        return this.f63275a.get(5);
    }

    /* JADX INFO: renamed from: x */
    public boolean m87202x() {
        return this.f63297p != null;
    }

    /* JADX INFO: renamed from: y */
    public boolean m87203y() {
        return this.f63298q != null;
    }

    /* JADX INFO: renamed from: z */
    public boolean m87204z() {
        return this.f63275a.get(6);
    }

    /* JADX INFO: renamed from: c */
    public C14915hf m87167c(String str) {
        this.f63285d = str;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public C14915hf m87171d(String str) {
        this.f63286e = str;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public C14915hf m87174e(String str) {
        this.f63287f = str;
        return this;
    }

    /* JADX INFO: renamed from: f */
    public C14915hf m87177f(String str) {
        this.f63288g = str;
        return this;
    }

    /* JADX INFO: renamed from: g */
    public C14915hf m87180g(String str) {
        this.f63289h = str;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public C14915hf m87183h(String str) {
        this.f63292k = str;
        return this;
    }

    /* JADX INFO: renamed from: i */
    public C14915hf m87186i(String str) {
        this.f63296o = str;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public String m87168c() {
        return this.f63287f;
    }

    /* JADX INFO: renamed from: d */
    public void m87172d(boolean z) {
        this.f63275a.set(3, z);
    }

    /* JADX INFO: renamed from: e */
    public void m87175e(boolean z) {
        this.f63275a.set(4, z);
    }

    /* JADX INFO: renamed from: f */
    public void m87178f(boolean z) {
        this.f63275a.set(5, z);
    }

    /* JADX INFO: renamed from: g */
    public void m87181g(boolean z) {
        this.f63275a.set(6, z);
    }

    /* JADX INFO: renamed from: h */
    public void m87184h(boolean z) {
        this.f63275a.set(7, z);
    }

    /* JADX INFO: renamed from: c */
    public C14915hf m87166c(int i) {
        this.f63282c = i;
        m87169c(true);
        return this;
    }

    /* JADX INFO: renamed from: c */
    public void m87169c(boolean z) {
        this.f63275a.set(2, z);
    }

    /* JADX INFO: renamed from: b */
    public String m87163b() {
        return this.f63283c;
    }

    /* JADX INFO: renamed from: b */
    public C14915hf m87162b(String str) {
        this.f63283c = str;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public C14915hf m87161b(int i) {
        this.f63278b = i;
        m87164b(true);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public void m87164b(boolean z) {
        this.f63275a.set(1, z);
    }

    /* JADX INFO: renamed from: b */
    public boolean m87165b() {
        return this.f63273a != null;
    }

    /* JADX INFO: renamed from: a */
    public String m87156a() {
        return this.f63280b;
    }

    /* JADX INFO: renamed from: a */
    public C14915hf m87155a(String str) {
        this.f63280b = str;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C14915hf m87153a(int i) {
        this.f63270a = i;
        m87158a(true);
        return this;
    }

    /* JADX INFO: renamed from: a */
    public void m87158a(boolean z) {
        this.f63275a.set(0, z);
    }

    /* JADX INFO: renamed from: a */
    public C14915hf m87154a(EnumC14902gt enumC14902gt) {
        this.f63272a = enumC14902gt;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public boolean m87160a(C14915hf c14915hf) {
        if (c14915hf == null) {
            return false;
        }
        boolean zM87159a = m87159a();
        boolean zM87159a2 = c14915hf.m87159a();
        if ((zM87159a || zM87159a2) && !(zM87159a && zM87159a2 && this.f63274a.equals(c14915hf.f63274a))) {
            return false;
        }
        boolean zM87165b = m87165b();
        boolean zM87165b2 = c14915hf.m87165b();
        if ((zM87165b || zM87165b2) && !(zM87165b && zM87165b2 && this.f63273a.m86941a(c14915hf.f63273a))) {
            return false;
        }
        boolean zM87170c = m87170c();
        boolean zM87170c2 = c14915hf.m87170c();
        if ((zM87170c || zM87170c2) && !(zM87170c && zM87170c2 && this.f63280b.equals(c14915hf.f63280b))) {
            return false;
        }
        boolean zM87173d = m87173d();
        boolean zM87173d2 = c14915hf.m87173d();
        if ((zM87173d || zM87173d2) && !(zM87173d && zM87173d2 && this.f63283c.equals(c14915hf.f63283c))) {
            return false;
        }
        boolean zM87176e = m87176e();
        boolean zM87176e2 = c14915hf.m87176e();
        if ((zM87176e || zM87176e2) && !(zM87176e && zM87176e2 && this.f63285d.equals(c14915hf.f63285d))) {
            return false;
        }
        boolean zM87179f = m87179f();
        boolean zM87179f2 = c14915hf.m87179f();
        if ((zM87179f || zM87179f2) && !(zM87179f && zM87179f2 && this.f63286e.equals(c14915hf.f63286e))) {
            return false;
        }
        boolean zM87182g = m87182g();
        boolean zM87182g2 = c14915hf.m87182g();
        if ((zM87182g || zM87182g2) && !(zM87182g && zM87182g2 && this.f63287f.equals(c14915hf.f63287f))) {
            return false;
        }
        boolean zM87185h = m87185h();
        boolean zM87185h2 = c14915hf.m87185h();
        if ((zM87185h || zM87185h2) && !(zM87185h && zM87185h2 && this.f63288g.equals(c14915hf.f63288g))) {
            return false;
        }
        boolean zM87187i = m87187i();
        boolean zM87187i2 = c14915hf.m87187i();
        if ((zM87187i || zM87187i2) && !(zM87187i && zM87187i2 && this.f63289h.equals(c14915hf.f63289h))) {
            return false;
        }
        boolean zM87188j = m87188j();
        boolean zM87188j2 = c14915hf.m87188j();
        if ((zM87188j || zM87188j2) && !(zM87188j && zM87188j2 && this.f63290i.equals(c14915hf.f63290i))) {
            return false;
        }
        boolean zM87189k = m87189k();
        boolean zM87189k2 = c14915hf.m87189k();
        if ((zM87189k || zM87189k2) && !(zM87189k && zM87189k2 && this.f63291j.equals(c14915hf.f63291j))) {
            return false;
        }
        boolean zM87190l = m87190l();
        boolean zM87190l2 = c14915hf.m87190l();
        if ((zM87190l || zM87190l2) && !(zM87190l && zM87190l2 && this.f63292k.equals(c14915hf.f63292k))) {
            return false;
        }
        boolean zM87191m = m87191m();
        boolean zM87191m2 = c14915hf.m87191m();
        if ((zM87191m || zM87191m2) && !(zM87191m && zM87191m2 && this.f63270a == c14915hf.f63270a)) {
            return false;
        }
        boolean zM87192n = m87192n();
        boolean zM87192n2 = c14915hf.m87192n();
        if ((zM87192n || zM87192n2) && !(zM87192n && zM87192n2 && this.f63278b == c14915hf.f63278b)) {
            return false;
        }
        boolean zM87193o = m87193o();
        boolean zM87193o2 = c14915hf.m87193o();
        if ((zM87193o || zM87193o2) && !(zM87193o && zM87193o2 && this.f63293l.equals(c14915hf.f63293l))) {
            return false;
        }
        boolean zM87194p = m87194p();
        boolean zM87194p2 = c14915hf.m87194p();
        if ((zM87194p || zM87194p2) && !(zM87194p && zM87194p2 && this.f63294m.equals(c14915hf.f63294m))) {
            return false;
        }
        boolean zM87195q = m87195q();
        boolean zM87195q2 = c14915hf.m87195q();
        if ((zM87195q || zM87195q2) && !(zM87195q && zM87195q2 && this.f63295n.equals(c14915hf.f63295n))) {
            return false;
        }
        boolean zM87196r = m87196r();
        boolean zM87196r2 = c14915hf.m87196r();
        if ((zM87196r || zM87196r2) && !(zM87196r && zM87196r2 && this.f63296o.equals(c14915hf.f63296o))) {
            return false;
        }
        boolean zM87197s = m87197s();
        boolean zM87197s2 = c14915hf.m87197s();
        if ((zM87197s || zM87197s2) && !(zM87197s && zM87197s2 && this.f63282c == c14915hf.f63282c)) {
            return false;
        }
        boolean zM87198t = m87198t();
        boolean zM87198t2 = c14915hf.m87198t();
        if ((zM87198t || zM87198t2) && !(zM87198t && zM87198t2 && this.f63272a.equals(c14915hf.f63272a))) {
            return false;
        }
        boolean zM87199u = m87199u();
        boolean zM87199u2 = c14915hf.m87199u();
        if ((zM87199u || zM87199u2) && !(zM87199u && zM87199u2 && this.f63277a == c14915hf.f63277a)) {
            return false;
        }
        boolean zM87200v = m87200v();
        boolean zM87200v2 = c14915hf.m87200v();
        if ((zM87200v || zM87200v2) && !(zM87200v && zM87200v2 && this.f63271a == c14915hf.f63271a)) {
            return false;
        }
        boolean zM87201w = m87201w();
        boolean zM87201w2 = c14915hf.m87201w();
        if ((zM87201w || zM87201w2) && !(zM87201w && zM87201w2 && this.f63279b == c14915hf.f63279b)) {
            return false;
        }
        boolean zM87202x = m87202x();
        boolean zM87202x2 = c14915hf.m87202x();
        if ((zM87202x || zM87202x2) && !(zM87202x && zM87202x2 && this.f63297p.equals(c14915hf.f63297p))) {
            return false;
        }
        boolean zM87203y = m87203y();
        boolean zM87203y2 = c14915hf.m87203y();
        if ((zM87203y || zM87203y2) && !(zM87203y && zM87203y2 && this.f63298q.equals(c14915hf.f63298q))) {
            return false;
        }
        boolean zM87204z = m87204z();
        boolean zM87204z2 = c14915hf.m87204z();
        if ((zM87204z || zM87204z2) && !(zM87204z && zM87204z2 && this.f63281b == c14915hf.f63281b)) {
            return false;
        }
        boolean zM87149A = m87149A();
        boolean zM87149A2 = c14915hf.m87149A();
        if ((zM87149A || zM87149A2) && !(zM87149A && zM87149A2 && this.f63276a.equals(c14915hf.f63276a))) {
            return false;
        }
        boolean zM87150B = m87150B();
        boolean zM87150B2 = c14915hf.m87150B();
        if ((zM87150B || zM87150B2) && !(zM87150B && zM87150B2 && this.f63284c == c14915hf.f63284c)) {
            return false;
        }
        boolean zM87151C = m87151C();
        boolean zM87151C2 = c14915hf.m87151C();
        if (zM87151C || zM87151C2) {
            return zM87151C && zM87151C2 && this.f63299r.equals(c14915hf.f63299r);
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public boolean m87159a() {
        return this.f63274a != null;
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
                m87157a();
                return;
            }
            short s = m3r0VarMo87393g.f134701c;
            switch (s) {
                case 1:
                    if (b == 11) {
                        this.f63274a = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 2:
                    if (b == 12) {
                        C14903gu c14903gu = new C14903gu();
                        this.f63273a = c14903gu;
                        c14903gu.mo86705a(w3r0Var);
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 3:
                    if (b == 11) {
                        this.f63280b = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 4:
                    if (b == 11) {
                        this.f63283c = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 5:
                    if (b == 11) {
                        this.f63285d = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 6:
                    if (b == 11) {
                        this.f63286e = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 7:
                    if (b == 11) {
                        this.f63287f = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 8:
                    if (b == 11) {
                        this.f63288g = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 9:
                    if (b == 11) {
                        this.f63289h = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 10:
                    if (b == 11) {
                        this.f63290i = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 11:
                    if (b == 11) {
                        this.f63291j = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 12:
                    if (b == 11) {
                        this.f63292k = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 13:
                    if (b == 8) {
                        this.f63270a = w3r0Var.mo87389c();
                        m87158a(true);
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 14:
                    if (b == 8) {
                        this.f63278b = w3r0Var.mo87389c();
                        m87164b(true);
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 15:
                    if (b == 11) {
                        this.f63293l = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 16:
                    if (b == 11) {
                        this.f63294m = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 17:
                    if (b == 11) {
                        this.f63295n = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 18:
                    if (b == 11) {
                        this.f63296o = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 19:
                    if (b == 8) {
                        this.f63282c = w3r0Var.mo87389c();
                        m87169c(true);
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 20:
                    if (b == 8) {
                        this.f63272a = EnumC14902gt.m86935a(w3r0Var.mo87389c());
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 21:
                    if (b == 2) {
                        this.f63277a = w3r0Var.mo87411y();
                        m87172d(true);
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 22:
                    if (b == 10) {
                        this.f63271a = w3r0Var.mo87390d();
                        m87175e(true);
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 23:
                    if (b == 10) {
                        this.f63279b = w3r0Var.mo87390d();
                        m87178f(true);
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 24:
                    if (b == 11) {
                        this.f63297p = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 25:
                    if (b == 11) {
                        this.f63298q = w3r0Var.mo87391e();
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                case 26:
                    if (b == 2) {
                        this.f63281b = w3r0Var.mo87411y();
                        m87181g(true);
                    } else {
                        x3r0.m209259a(w3r0Var, b);
                    }
                    break;
                default:
                    switch (s) {
                        case 100:
                            if (b == 13) {
                                o3r0 o3r0VarMo87395i = w3r0Var.mo87395i();
                                this.f63276a = new HashMap(o3r0VarMo87395i.f144851c * 2);
                                for (int i = 0; i < o3r0VarMo87395i.f144851c; i++) {
                                    this.f63276a.put(w3r0Var.mo87391e(), w3r0Var.mo87391e());
                                }
                                w3r0Var.mo87381F();
                            } else {
                                x3r0.m209259a(w3r0Var, b);
                            }
                            break;
                        case 101:
                            if (b == 2) {
                                this.f63284c = w3r0Var.mo87411y();
                                m87184h(true);
                            } else {
                                x3r0.m209259a(w3r0Var, b);
                            }
                            break;
                        case 102:
                            if (b == 11) {
                                this.f63299r = w3r0Var.mo87391e();
                            } else {
                                x3r0.m209259a(w3r0Var, b);
                            }
                            break;
                        default:
                            x3r0.m209259a(w3r0Var, b);
                            break;
                    }
                    break;
            }
            w3r0Var.mo87380E();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m87157a() throws C14929ib {
        if (this.f63280b != null) {
            if (this.f63283c != null) {
                if (this.f63287f != null) {
                    return;
                }
                throw new C14929ib("Required field 'token' was not present! Struct: " + toString());
            }
            throw new C14929ib("Required field 'appId' was not present! Struct: " + toString());
        }
        throw new C14929ib("Required field 'id' was not present! Struct: " + toString());
    }
}
