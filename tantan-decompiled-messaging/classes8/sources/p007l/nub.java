package p007l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import com.p003p1.mobile.android.p005ui.cropiwa.shape.CropIwaOvalShape;
import com.p003p1.mobile.android.p005ui.cropiwa.shape.CropIwaRectShape;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class nub {

    /* JADX INFO: renamed from: a */
    public int f3451a;

    /* JADX INFO: renamed from: b */
    public int f3452b;

    /* JADX INFO: renamed from: c */
    public int f3453c;

    /* JADX INFO: renamed from: d */
    public int f3454d;

    /* JADX INFO: renamed from: e */
    public int f3455e;

    /* JADX INFO: renamed from: f */
    public int f3456f;

    /* JADX INFO: renamed from: g */
    public int f3457g;

    /* JADX INFO: renamed from: h */
    public int f3458h;

    /* JADX INFO: renamed from: i */
    public int f3459i;

    /* JADX INFO: renamed from: j */
    public int f3460j;

    /* JADX INFO: renamed from: k */
    public j11 f3461k;

    /* JADX INFO: renamed from: l */
    public boolean f3462l;

    /* JADX INFO: renamed from: m */
    public boolean f3463m;

    /* JADX INFO: renamed from: n */
    public boolean f3464n;

    /* JADX INFO: renamed from: o */
    public boolean f3465o;

    /* JADX INFO: renamed from: p */
    public boolean f3466p;

    /* JADX INFO: renamed from: q */
    public boolean f3467q;

    /* JADX INFO: renamed from: r */
    public boolean f3468r;

    /* JADX INFO: renamed from: s */
    public boolean f3469s;

    /* JADX INFO: renamed from: t */
    public rub f3470t;

    /* JADX INFO: renamed from: u */
    public List<zu5> f3471u = new ArrayList();

    /* JADX INFO: renamed from: v */
    public List<zu5> f3472v = new ArrayList();

    /* JADX INFO: renamed from: c */
    public static nub m10095c(Context context) {
        jvc0 jvc0Var = new jvc0(context);
        nub nubVarM10101E = new nub().m10136y(jvc0Var.m9559a(t0c0.f4241y)).m10097A(jvc0Var.m9559a(t0c0.f4242z)).m10102F(jvc0Var.m9559a(t0c0.f4211A)).m10109M(jvc0Var.m9559a(t0c0.f4212B)).m10137z(jvc0Var.m9560b(u1c0.f4455g)).m10098B(jvc0Var.m9560b(u1c0.f4456h)).m10103G(jvc0Var.m9560b(u1c0.f4457i)).m10105I(jvc0Var.m9560b(u1c0.f4459k)).m10104H(jvc0Var.m9560b(u1c0.f4458j)).m10135x(new j11(2, 1)).m10111O(true).m10101E(true);
        nubVarM10101E.m10099C(new CropIwaRectShape(nubVarM10101E));
        return nubVarM10101E;
    }

    /* JADX INFO: renamed from: d */
    public static nub m10096d(Context context, AttributeSet attributeSet) {
        nub nubVarM10095c = m10095c(context);
        if (attributeSet == null) {
            return nubVarM10095c;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.f1956C);
        try {
            nubVarM10095c.m10105I(typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.f2078V, nubVarM10095c.m10125n()));
            nubVarM10095c.m10104H(typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.f2072U, nubVarM10095c.m10124m()));
            nubVarM10095c.m10135x(new j11(typedArrayObtainStyledAttributes.getInteger(b9c0.f1970E, 1), typedArrayObtainStyledAttributes.getInteger(b9c0.f1963D, 1)));
            nubVarM10095c.m10136y(typedArrayObtainStyledAttributes.getColor(b9c0.f1977F, nubVarM10095c.m10117f()));
            nubVarM10095c.m10137z(typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.f1984G, nubVarM10095c.m10118g()));
            nubVarM10095c.m10097A(typedArrayObtainStyledAttributes.getColor(b9c0.f1991H, nubVarM10095c.m10119h()));
            nubVarM10095c.m10098B(typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.f1998I, nubVarM10095c.m10120i()));
            nubVarM10095c.m10102F(typedArrayObtainStyledAttributes.getColor(b9c0.f2048Q, nubVarM10095c.m10122k()));
            nubVarM10095c.m10103G(typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.f2054R, nubVarM10095c.m10123l()));
            nubVarM10095c.m10111O(typedArrayObtainStyledAttributes.getBoolean(b9c0.f2018L, nubVarM10095c.m10113Q()));
            nubVarM10095c.m10109M(typedArrayObtainStyledAttributes.getColor(b9c0.f2084W, nubVarM10095c.m10126o()));
            nubVarM10095c.m10106J(typedArrayObtainStyledAttributes.getBoolean(b9c0.f2024M, false));
            nubVarM10095c.m10108L(typedArrayObtainStyledAttributes.getBoolean(b9c0.f2036O, false));
            nubVarM10095c.m10107K(typedArrayObtainStyledAttributes.getBoolean(b9c0.f2030N, false));
            if (nubVarM10095c.m10130s()) {
                nubVarM10095c.m10099C(new kub(nubVarM10095c));
            } else if (nubVarM10095c.m10131t()) {
                if (nubVarM10095c.f3468r) {
                    nubVarM10095c.m10099C(new lub(nubVarM10095c));
                } else {
                    nubVarM10095c.m10099C(new kub(nubVarM10095c));
                }
            } else if (nubVarM10095c.m10132u()) {
                nubVarM10095c.m10099C(new avb(nubVarM10095c));
            } else {
                nubVarM10095c.m10099C(typedArrayObtainStyledAttributes.getInt(b9c0.f2005J, 0) == 0 ? new CropIwaRectShape(nubVarM10095c) : new CropIwaOvalShape(nubVarM10095c));
            }
            nubVarM10095c.m10101E(typedArrayObtainStyledAttributes.getBoolean(b9c0.f2042P, nubVarM10095c.m10128q()));
            return nubVarM10095c;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: A */
    public nub m10097A(int i) {
        this.f3453c = i;
        return this;
    }

    /* JADX INFO: renamed from: B */
    public nub m10098B(int i) {
        this.f3456f = i;
        return this;
    }

    /* JADX INFO: renamed from: C */
    public nub m10099C(@NonNull rub rubVar) {
        rub rubVar2 = this.f3470t;
        if (rubVar2 != null) {
            m10134w(rubVar2);
        }
        this.f3470t = rubVar;
        return this;
    }

    /* JADX INFO: renamed from: D */
    public nub m10100D(boolean z) {
        this.f3468r = z;
        return this;
    }

    /* JADX INFO: renamed from: E */
    public nub m10101E(boolean z) {
        this.f3462l = z;
        return this;
    }

    /* JADX INFO: renamed from: F */
    public nub m10102F(int i) {
        this.f3454d = i;
        return this;
    }

    /* JADX INFO: renamed from: G */
    public nub m10103G(int i) {
        this.f3457g = i;
        return this;
    }

    /* JADX INFO: renamed from: H */
    public nub m10104H(int i) {
        this.f3458h = i;
        return this;
    }

    /* JADX INFO: renamed from: I */
    public nub m10105I(int i) {
        this.f3459i = i;
        return this;
    }

    /* JADX INFO: renamed from: J */
    public nub m10106J(boolean z) {
        this.f3463m = z;
        return this;
    }

    /* JADX INFO: renamed from: K */
    public nub m10107K(boolean z) {
        this.f3465o = z;
        if (z) {
            if (this.f3468r) {
                m10099C(new lub(this));
                return this;
            }
            m10099C(new kub(this));
        }
        return this;
    }

    /* JADX INFO: renamed from: L */
    public nub m10108L(boolean z) {
        this.f3464n = z;
        return this;
    }

    /* JADX INFO: renamed from: M */
    public nub m10109M(int i) {
        this.f3451a = i;
        return this;
    }

    /* JADX INFO: renamed from: N */
    public nub m10110N(boolean z) {
        this.f3467q = z;
        return this;
    }

    /* JADX INFO: renamed from: O */
    public nub m10111O(boolean z) {
        this.f3469s = z;
        return this;
    }

    /* JADX INFO: renamed from: P */
    public nub m10112P(int i) {
        this.f3460j = i;
        return this;
    }

    /* JADX INFO: renamed from: Q */
    public boolean m10113Q() {
        return this.f3469s;
    }

    /* JADX INFO: renamed from: a */
    public void m10114a(zu5 zu5Var) {
        if (zu5Var != null) {
            this.f3471u.add(zu5Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m10115b() {
        this.f3472v.addAll(this.f3471u);
        Iterator<zu5> it = this.f3472v.iterator();
        while (it.hasNext()) {
            it.next().mo1190a();
        }
        this.f3472v.clear();
    }

    /* JADX INFO: renamed from: e */
    public j11 m10116e() {
        return this.f3461k;
    }

    /* JADX INFO: renamed from: f */
    public int m10117f() {
        return this.f3452b;
    }

    /* JADX INFO: renamed from: g */
    public int m10118g() {
        return this.f3455e;
    }

    /* JADX INFO: renamed from: h */
    public int m10119h() {
        return this.f3453c;
    }

    /* JADX INFO: renamed from: i */
    public int m10120i() {
        return this.f3456f;
    }

    /* JADX INFO: renamed from: j */
    public rub m10121j() {
        return this.f3470t;
    }

    /* JADX INFO: renamed from: k */
    public int m10122k() {
        return this.f3454d;
    }

    /* JADX INFO: renamed from: l */
    public int m10123l() {
        return this.f3457g;
    }

    /* JADX INFO: renamed from: m */
    public int m10124m() {
        return this.f3458h;
    }

    /* JADX INFO: renamed from: n */
    public int m10125n() {
        return this.f3459i;
    }

    /* JADX INFO: renamed from: o */
    public int m10126o() {
        return this.f3451a;
    }

    /* JADX INFO: renamed from: p */
    public int m10127p() {
        return this.f3460j;
    }

    /* JADX INFO: renamed from: q */
    public boolean m10128q() {
        return this.f3462l;
    }

    /* JADX INFO: renamed from: r */
    public boolean m10129r() {
        return this.f3466p;
    }

    /* JADX INFO: renamed from: s */
    public boolean m10130s() {
        return this.f3463m;
    }

    /* JADX INFO: renamed from: t */
    public boolean m10131t() {
        return this.f3465o;
    }

    /* JADX INFO: renamed from: u */
    public boolean m10132u() {
        return this.f3464n;
    }

    /* JADX INFO: renamed from: v */
    public boolean m10133v() {
        return this.f3467q;
    }

    /* JADX INFO: renamed from: w */
    public void m10134w(zu5 zu5Var) {
        this.f3471u.remove(zu5Var);
    }

    /* JADX INFO: renamed from: x */
    public nub m10135x(j11 j11Var) {
        this.f3461k = j11Var;
        return this;
    }

    /* JADX INFO: renamed from: y */
    public nub m10136y(int i) {
        this.f3452b = i;
        return this;
    }

    /* JADX INFO: renamed from: z */
    public nub m10137z(int i) {
        this.f3455e = i;
        return this;
    }
}
