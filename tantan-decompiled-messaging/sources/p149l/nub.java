package p149l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.p048ui.cropiwa.shape.CropIwaOvalShape;
import com.p046p1.mobile.android.p048ui.cropiwa.shape.CropIwaRectShape;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class nub {

    /* JADX INFO: renamed from: a */
    public int f140591a;

    /* JADX INFO: renamed from: b */
    public int f140592b;

    /* JADX INFO: renamed from: c */
    public int f140593c;

    /* JADX INFO: renamed from: d */
    public int f140594d;

    /* JADX INFO: renamed from: e */
    public int f140595e;

    /* JADX INFO: renamed from: f */
    public int f140596f;

    /* JADX INFO: renamed from: g */
    public int f140597g;

    /* JADX INFO: renamed from: h */
    public int f140598h;

    /* JADX INFO: renamed from: i */
    public int f140599i;

    /* JADX INFO: renamed from: j */
    public int f140600j;

    /* JADX INFO: renamed from: k */
    public j11 f140601k;

    /* JADX INFO: renamed from: l */
    public boolean f140602l;

    /* JADX INFO: renamed from: m */
    public boolean f140603m;

    /* JADX INFO: renamed from: n */
    public boolean f140604n;

    /* JADX INFO: renamed from: o */
    public boolean f140605o;

    /* JADX INFO: renamed from: p */
    public boolean f140606p;

    /* JADX INFO: renamed from: q */
    public boolean f140607q;

    /* JADX INFO: renamed from: r */
    public boolean f140608r;

    /* JADX INFO: renamed from: s */
    public boolean f140609s;

    /* JADX INFO: renamed from: t */
    public rub f140610t;

    /* JADX INFO: renamed from: u */
    public List<zu5> f140611u = new ArrayList();

    /* JADX INFO: renamed from: v */
    public List<zu5> f140612v = new ArrayList();

    /* JADX INFO: renamed from: c */
    public static nub m161440c(Context context) {
        jvc0 jvc0Var = new jvc0(context);
        nub nubVarM161446E = new nub().m161481y(jvc0Var.m143483a(t0c0.f167173y)).m161442A(jvc0Var.m143483a(t0c0.f167174z)).m161447F(jvc0Var.m143483a(t0c0.f167143A)).m161454M(jvc0Var.m143483a(t0c0.f167144B)).m161482z(jvc0Var.m143484b(u1c0.f172993g)).m161443B(jvc0Var.m143484b(u1c0.f172994h)).m161448G(jvc0Var.m143484b(u1c0.f172995i)).m161450I(jvc0Var.m143484b(u1c0.f172997k)).m161449H(jvc0Var.m143484b(u1c0.f172996j)).m161480x(new j11(2, 1)).m161456O(true).m161446E(true);
        nubVarM161446E.m161444C(new CropIwaRectShape(nubVarM161446E));
        return nubVarM161446E;
    }

    /* JADX INFO: renamed from: d */
    public static nub m161441d(Context context, AttributeSet attributeSet) {
        nub nubVarM161440c = m161440c(context);
        if (attributeSet == null) {
            return nubVarM161440c;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b9c0.f74233C);
        try {
            nubVarM161440c.m161450I(typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.f74355V, nubVarM161440c.m161470n()));
            nubVarM161440c.m161449H(typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.f74349U, nubVarM161440c.m161469m()));
            nubVarM161440c.m161480x(new j11(typedArrayObtainStyledAttributes.getInteger(b9c0.f74247E, 1), typedArrayObtainStyledAttributes.getInteger(b9c0.f74240D, 1)));
            nubVarM161440c.m161481y(typedArrayObtainStyledAttributes.getColor(b9c0.f74254F, nubVarM161440c.m161462f()));
            nubVarM161440c.m161482z(typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.f74261G, nubVarM161440c.m161463g()));
            nubVarM161440c.m161442A(typedArrayObtainStyledAttributes.getColor(b9c0.f74268H, nubVarM161440c.m161464h()));
            nubVarM161440c.m161443B(typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.f74275I, nubVarM161440c.m161465i()));
            nubVarM161440c.m161447F(typedArrayObtainStyledAttributes.getColor(b9c0.f74325Q, nubVarM161440c.m161467k()));
            nubVarM161440c.m161448G(typedArrayObtainStyledAttributes.getDimensionPixelSize(b9c0.f74331R, nubVarM161440c.m161468l()));
            nubVarM161440c.m161456O(typedArrayObtainStyledAttributes.getBoolean(b9c0.f74295L, nubVarM161440c.m161458Q()));
            nubVarM161440c.m161454M(typedArrayObtainStyledAttributes.getColor(b9c0.f74361W, nubVarM161440c.m161471o()));
            nubVarM161440c.m161451J(typedArrayObtainStyledAttributes.getBoolean(b9c0.f74301M, false));
            nubVarM161440c.m161453L(typedArrayObtainStyledAttributes.getBoolean(b9c0.f74313O, false));
            nubVarM161440c.m161452K(typedArrayObtainStyledAttributes.getBoolean(b9c0.f74307N, false));
            if (nubVarM161440c.m161475s()) {
                nubVarM161440c.m161444C(new kub(nubVarM161440c));
            } else if (nubVarM161440c.m161476t()) {
                if (nubVarM161440c.f140608r) {
                    nubVarM161440c.m161444C(new lub(nubVarM161440c));
                } else {
                    nubVarM161440c.m161444C(new kub(nubVarM161440c));
                }
            } else if (nubVarM161440c.m161477u()) {
                nubVarM161440c.m161444C(new avb(nubVarM161440c));
            } else {
                nubVarM161440c.m161444C(typedArrayObtainStyledAttributes.getInt(b9c0.f74282J, 0) == 0 ? new CropIwaRectShape(nubVarM161440c) : new CropIwaOvalShape(nubVarM161440c));
            }
            nubVarM161440c.m161446E(typedArrayObtainStyledAttributes.getBoolean(b9c0.f74319P, nubVarM161440c.m161473q()));
            return nubVarM161440c;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: A */
    public nub m161442A(int i) {
        this.f140593c = i;
        return this;
    }

    /* JADX INFO: renamed from: B */
    public nub m161443B(int i) {
        this.f140596f = i;
        return this;
    }

    /* JADX INFO: renamed from: C */
    public nub m161444C(@NonNull rub rubVar) {
        rub rubVar2 = this.f140610t;
        if (rubVar2 != null) {
            m161479w(rubVar2);
        }
        this.f140610t = rubVar;
        return this;
    }

    /* JADX INFO: renamed from: D */
    public nub m161445D(boolean z) {
        this.f140608r = z;
        return this;
    }

    /* JADX INFO: renamed from: E */
    public nub m161446E(boolean z) {
        this.f140602l = z;
        return this;
    }

    /* JADX INFO: renamed from: F */
    public nub m161447F(int i) {
        this.f140594d = i;
        return this;
    }

    /* JADX INFO: renamed from: G */
    public nub m161448G(int i) {
        this.f140597g = i;
        return this;
    }

    /* JADX INFO: renamed from: H */
    public nub m161449H(int i) {
        this.f140598h = i;
        return this;
    }

    /* JADX INFO: renamed from: I */
    public nub m161450I(int i) {
        this.f140599i = i;
        return this;
    }

    /* JADX INFO: renamed from: J */
    public nub m161451J(boolean z) {
        this.f140603m = z;
        return this;
    }

    /* JADX INFO: renamed from: K */
    public nub m161452K(boolean z) {
        this.f140605o = z;
        if (z) {
            if (this.f140608r) {
                m161444C(new lub(this));
                return this;
            }
            m161444C(new kub(this));
        }
        return this;
    }

    /* JADX INFO: renamed from: L */
    public nub m161453L(boolean z) {
        this.f140604n = z;
        return this;
    }

    /* JADX INFO: renamed from: M */
    public nub m161454M(int i) {
        this.f140591a = i;
        return this;
    }

    /* JADX INFO: renamed from: N */
    public nub m161455N(boolean z) {
        this.f140607q = z;
        return this;
    }

    /* JADX INFO: renamed from: O */
    public nub m161456O(boolean z) {
        this.f140609s = z;
        return this;
    }

    /* JADX INFO: renamed from: P */
    public nub m161457P(int i) {
        this.f140600j = i;
        return this;
    }

    /* JADX INFO: renamed from: Q */
    public boolean m161458Q() {
        return this.f140609s;
    }

    /* JADX INFO: renamed from: a */
    public void m161459a(zu5 zu5Var) {
        if (zu5Var != null) {
            this.f140611u.add(zu5Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m161460b() {
        this.f140612v.addAll(this.f140611u);
        Iterator<zu5> it = this.f140612v.iterator();
        while (it.hasNext()) {
            it.next().mo20918a();
        }
        this.f140612v.clear();
    }

    /* JADX INFO: renamed from: e */
    public j11 m161461e() {
        return this.f140601k;
    }

    /* JADX INFO: renamed from: f */
    public int m161462f() {
        return this.f140592b;
    }

    /* JADX INFO: renamed from: g */
    public int m161463g() {
        return this.f140595e;
    }

    /* JADX INFO: renamed from: h */
    public int m161464h() {
        return this.f140593c;
    }

    /* JADX INFO: renamed from: i */
    public int m161465i() {
        return this.f140596f;
    }

    /* JADX INFO: renamed from: j */
    public rub m161466j() {
        return this.f140610t;
    }

    /* JADX INFO: renamed from: k */
    public int m161467k() {
        return this.f140594d;
    }

    /* JADX INFO: renamed from: l */
    public int m161468l() {
        return this.f140597g;
    }

    /* JADX INFO: renamed from: m */
    public int m161469m() {
        return this.f140598h;
    }

    /* JADX INFO: renamed from: n */
    public int m161470n() {
        return this.f140599i;
    }

    /* JADX INFO: renamed from: o */
    public int m161471o() {
        return this.f140591a;
    }

    /* JADX INFO: renamed from: p */
    public int m161472p() {
        return this.f140600j;
    }

    /* JADX INFO: renamed from: q */
    public boolean m161473q() {
        return this.f140602l;
    }

    /* JADX INFO: renamed from: r */
    public boolean m161474r() {
        return this.f140606p;
    }

    /* JADX INFO: renamed from: s */
    public boolean m161475s() {
        return this.f140603m;
    }

    /* JADX INFO: renamed from: t */
    public boolean m161476t() {
        return this.f140605o;
    }

    /* JADX INFO: renamed from: u */
    public boolean m161477u() {
        return this.f140604n;
    }

    /* JADX INFO: renamed from: v */
    public boolean m161478v() {
        return this.f140607q;
    }

    /* JADX INFO: renamed from: w */
    public void m161479w(zu5 zu5Var) {
        this.f140611u.remove(zu5Var);
    }

    /* JADX INFO: renamed from: x */
    public nub m161480x(j11 j11Var) {
        this.f140601k = j11Var;
        return this;
    }

    /* JADX INFO: renamed from: y */
    public nub m161481y(int i) {
        this.f140592b = i;
        return this;
    }

    /* JADX INFO: renamed from: z */
    public nub m161482z(int i) {
        this.f140595e = i;
        return this;
    }
}
