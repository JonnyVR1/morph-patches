package p153l;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.p053ui.cropiwa.shape.CropIwaOvalShape;
import com.p051p1.mobile.android.p053ui.cropiwa.shape.CropIwaRectShape;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class bwb {

    /* JADX INFO: renamed from: a */
    public int f78694a;

    /* JADX INFO: renamed from: b */
    public int f78695b;

    /* JADX INFO: renamed from: c */
    public int f78696c;

    /* JADX INFO: renamed from: d */
    public int f78697d;

    /* JADX INFO: renamed from: e */
    public int f78698e;

    /* JADX INFO: renamed from: f */
    public int f78699f;

    /* JADX INFO: renamed from: g */
    public int f78700g;

    /* JADX INFO: renamed from: h */
    public int f78701h;

    /* JADX INFO: renamed from: i */
    public int f78702i;

    /* JADX INFO: renamed from: j */
    public int f78703j;

    /* JADX INFO: renamed from: k */
    public q11 f78704k;

    /* JADX INFO: renamed from: l */
    public boolean f78705l;

    /* JADX INFO: renamed from: m */
    public boolean f78706m;

    /* JADX INFO: renamed from: n */
    public boolean f78707n;

    /* JADX INFO: renamed from: o */
    public boolean f78708o;

    /* JADX INFO: renamed from: p */
    public boolean f78709p;

    /* JADX INFO: renamed from: q */
    public boolean f78710q;

    /* JADX INFO: renamed from: r */
    public boolean f78711r;

    /* JADX INFO: renamed from: s */
    public boolean f78712s;

    /* JADX INFO: renamed from: t */
    public fwb f78713t;

    /* JADX INFO: renamed from: u */
    public List<dw5> f78714u = new ArrayList();

    /* JADX INFO: renamed from: v */
    public List<dw5> f78715v = new ArrayList();

    /* JADX INFO: renamed from: c */
    public static bwb m106648c(Context context) {
        m3d0 m3d0Var = new m3d0(context);
        bwb bwbVarM106654E = new bwb().m106689y(m3d0Var.m156923a(z8c0.f203364y)).m106650A(m3d0Var.m156923a(z8c0.f203365z)).m106655F(m3d0Var.m156923a(z8c0.f203334A)).m106662M(m3d0Var.m156923a(z8c0.f203335B)).m106690z(m3d0Var.m156924b(bac0.f75668g)).m106651B(m3d0Var.m156924b(bac0.f75669h)).m106656G(m3d0Var.m156924b(bac0.f75670i)).m106658I(m3d0Var.m156924b(bac0.f75672k)).m106657H(m3d0Var.m156924b(bac0.f75671j)).m106688x(new q11(2, 1)).m106664O(true).m106654E(true);
        bwbVarM106654E.m106652C(new CropIwaRectShape(bwbVarM106654E));
        return bwbVarM106654E;
    }

    /* JADX INFO: renamed from: d */
    public static bwb m106649d(Context context, AttributeSet attributeSet) {
        bwb bwbVarM106648c = m106648c(context);
        if (attributeSet == null) {
            return bwbVarM106648c;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hhc0.f109542C);
        try {
            bwbVarM106648c.m106658I(typedArrayObtainStyledAttributes.getDimensionPixelSize(hhc0.f109664V, bwbVarM106648c.m106678n()));
            bwbVarM106648c.m106657H(typedArrayObtainStyledAttributes.getDimensionPixelSize(hhc0.f109658U, bwbVarM106648c.m106677m()));
            bwbVarM106648c.m106688x(new q11(typedArrayObtainStyledAttributes.getInteger(hhc0.f109556E, 1), typedArrayObtainStyledAttributes.getInteger(hhc0.f109549D, 1)));
            bwbVarM106648c.m106689y(typedArrayObtainStyledAttributes.getColor(hhc0.f109563F, bwbVarM106648c.m106670f()));
            bwbVarM106648c.m106690z(typedArrayObtainStyledAttributes.getDimensionPixelSize(hhc0.f109570G, bwbVarM106648c.m106671g()));
            bwbVarM106648c.m106650A(typedArrayObtainStyledAttributes.getColor(hhc0.f109577H, bwbVarM106648c.m106672h()));
            bwbVarM106648c.m106651B(typedArrayObtainStyledAttributes.getDimensionPixelSize(hhc0.f109584I, bwbVarM106648c.m106673i()));
            bwbVarM106648c.m106655F(typedArrayObtainStyledAttributes.getColor(hhc0.f109634Q, bwbVarM106648c.m106675k()));
            bwbVarM106648c.m106656G(typedArrayObtainStyledAttributes.getDimensionPixelSize(hhc0.f109640R, bwbVarM106648c.m106676l()));
            bwbVarM106648c.m106664O(typedArrayObtainStyledAttributes.getBoolean(hhc0.f109604L, bwbVarM106648c.m106666Q()));
            bwbVarM106648c.m106662M(typedArrayObtainStyledAttributes.getColor(hhc0.f109670W, bwbVarM106648c.m106679o()));
            bwbVarM106648c.m106659J(typedArrayObtainStyledAttributes.getBoolean(hhc0.f109610M, false));
            bwbVarM106648c.m106661L(typedArrayObtainStyledAttributes.getBoolean(hhc0.f109622O, false));
            bwbVarM106648c.m106660K(typedArrayObtainStyledAttributes.getBoolean(hhc0.f109616N, false));
            if (bwbVarM106648c.m106683s()) {
                bwbVarM106648c.m106652C(new yvb(bwbVarM106648c));
            } else if (bwbVarM106648c.m106684t()) {
                if (bwbVarM106648c.f78711r) {
                    bwbVarM106648c.m106652C(new zvb(bwbVarM106648c));
                } else {
                    bwbVarM106648c.m106652C(new yvb(bwbVarM106648c));
                }
            } else if (bwbVarM106648c.m106685u()) {
                bwbVarM106648c.m106652C(new owb(bwbVarM106648c));
            } else {
                bwbVarM106648c.m106652C(typedArrayObtainStyledAttributes.getInt(hhc0.f109591J, 0) == 0 ? new CropIwaRectShape(bwbVarM106648c) : new CropIwaOvalShape(bwbVarM106648c));
            }
            bwbVarM106648c.m106654E(typedArrayObtainStyledAttributes.getBoolean(hhc0.f109628P, bwbVarM106648c.m106681q()));
            return bwbVarM106648c;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: A */
    public bwb m106650A(int i) {
        this.f78696c = i;
        return this;
    }

    /* JADX INFO: renamed from: B */
    public bwb m106651B(int i) {
        this.f78699f = i;
        return this;
    }

    /* JADX INFO: renamed from: C */
    public bwb m106652C(@NonNull fwb fwbVar) {
        fwb fwbVar2 = this.f78713t;
        if (fwbVar2 != null) {
            m106687w(fwbVar2);
        }
        this.f78713t = fwbVar;
        return this;
    }

    /* JADX INFO: renamed from: D */
    public bwb m106653D(boolean z) {
        this.f78711r = z;
        return this;
    }

    /* JADX INFO: renamed from: E */
    public bwb m106654E(boolean z) {
        this.f78705l = z;
        return this;
    }

    /* JADX INFO: renamed from: F */
    public bwb m106655F(int i) {
        this.f78697d = i;
        return this;
    }

    /* JADX INFO: renamed from: G */
    public bwb m106656G(int i) {
        this.f78700g = i;
        return this;
    }

    /* JADX INFO: renamed from: H */
    public bwb m106657H(int i) {
        this.f78701h = i;
        return this;
    }

    /* JADX INFO: renamed from: I */
    public bwb m106658I(int i) {
        this.f78702i = i;
        return this;
    }

    /* JADX INFO: renamed from: J */
    public bwb m106659J(boolean z) {
        this.f78706m = z;
        return this;
    }

    /* JADX INFO: renamed from: K */
    public bwb m106660K(boolean z) {
        this.f78708o = z;
        if (z) {
            if (this.f78711r) {
                m106652C(new zvb(this));
                return this;
            }
            m106652C(new yvb(this));
        }
        return this;
    }

    /* JADX INFO: renamed from: L */
    public bwb m106661L(boolean z) {
        this.f78707n = z;
        return this;
    }

    /* JADX INFO: renamed from: M */
    public bwb m106662M(int i) {
        this.f78694a = i;
        return this;
    }

    /* JADX INFO: renamed from: N */
    public bwb m106663N(boolean z) {
        this.f78710q = z;
        return this;
    }

    /* JADX INFO: renamed from: O */
    public bwb m106664O(boolean z) {
        this.f78712s = z;
        return this;
    }

    /* JADX INFO: renamed from: P */
    public bwb m106665P(int i) {
        this.f78703j = i;
        return this;
    }

    /* JADX INFO: renamed from: Q */
    public boolean m106666Q() {
        return this.f78712s;
    }

    /* JADX INFO: renamed from: a */
    public void m106667a(dw5 dw5Var) {
        if (dw5Var != null) {
            this.f78714u.add(dw5Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m106668b() {
        this.f78715v.addAll(this.f78714u);
        Iterator<dw5> it = this.f78715v.iterator();
        while (it.hasNext()) {
            it.next().mo21917a();
        }
        this.f78715v.clear();
    }

    /* JADX INFO: renamed from: e */
    public q11 m106669e() {
        return this.f78704k;
    }

    /* JADX INFO: renamed from: f */
    public int m106670f() {
        return this.f78695b;
    }

    /* JADX INFO: renamed from: g */
    public int m106671g() {
        return this.f78698e;
    }

    /* JADX INFO: renamed from: h */
    public int m106672h() {
        return this.f78696c;
    }

    /* JADX INFO: renamed from: i */
    public int m106673i() {
        return this.f78699f;
    }

    /* JADX INFO: renamed from: j */
    public fwb m106674j() {
        return this.f78713t;
    }

    /* JADX INFO: renamed from: k */
    public int m106675k() {
        return this.f78697d;
    }

    /* JADX INFO: renamed from: l */
    public int m106676l() {
        return this.f78700g;
    }

    /* JADX INFO: renamed from: m */
    public int m106677m() {
        return this.f78701h;
    }

    /* JADX INFO: renamed from: n */
    public int m106678n() {
        return this.f78702i;
    }

    /* JADX INFO: renamed from: o */
    public int m106679o() {
        return this.f78694a;
    }

    /* JADX INFO: renamed from: p */
    public int m106680p() {
        return this.f78703j;
    }

    /* JADX INFO: renamed from: q */
    public boolean m106681q() {
        return this.f78705l;
    }

    /* JADX INFO: renamed from: r */
    public boolean m106682r() {
        return this.f78709p;
    }

    /* JADX INFO: renamed from: s */
    public boolean m106683s() {
        return this.f78706m;
    }

    /* JADX INFO: renamed from: t */
    public boolean m106684t() {
        return this.f78708o;
    }

    /* JADX INFO: renamed from: u */
    public boolean m106685u() {
        return this.f78707n;
    }

    /* JADX INFO: renamed from: v */
    public boolean m106686v() {
        return this.f78710q;
    }

    /* JADX INFO: renamed from: w */
    public void m106687w(dw5 dw5Var) {
        this.f78714u.remove(dw5Var);
    }

    /* JADX INFO: renamed from: x */
    public bwb m106688x(q11 q11Var) {
        this.f78704k = q11Var;
        return this;
    }

    /* JADX INFO: renamed from: y */
    public bwb m106689y(int i) {
        this.f78695b = i;
        return this;
    }

    /* JADX INFO: renamed from: z */
    public bwb m106690z(int i) {
        this.f78698e = i;
        return this;
    }
}
