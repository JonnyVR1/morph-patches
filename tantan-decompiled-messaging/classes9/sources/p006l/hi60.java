package p006l;

import android.text.TextUtils;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.pay.R;
import l.kzl;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class hi60 implements kzl {

    /* JADX INFO: renamed from: a */
    public boolean f13887a = false;

    /* JADX INFO: renamed from: b */
    public boolean f13888b = false;

    /* JADX INFO: renamed from: c */
    public boolean f13889c = false;

    /* JADX INFO: renamed from: d */
    public boolean f13890d = false;

    /* JADX INFO: renamed from: e */
    public CharSequence f13891e;

    /* JADX INFO: renamed from: f */
    public CharSequence f13892f;

    /* JADX INFO: renamed from: g */
    public CharSequence f13893g;

    /* JADX INFO: renamed from: h */
    public CharSequence f13894h;

    /* JADX INFO: renamed from: i */
    public static hi60 m16218i(Act act, PurchaseType purchaseType) {
        hi60 hi60Var = new hi60();
        hi60Var.m16227j(act, hi60Var, purchaseType);
        return hi60Var;
    }

    /* JADX INFO: renamed from: a */
    public CharSequence m16219a() {
        return this.f13892f;
    }

    /* JADX INFO: renamed from: b */
    public CharSequence m16220b() {
        return this.f13893g;
    }

    /* JADX INFO: renamed from: c */
    public CharSequence m16221c() {
        return this.f13894h;
    }

    /* JADX INFO: renamed from: d */
    public CharSequence m16222d() {
        return this.f13891e;
    }

    /* JADX INFO: renamed from: e */
    public boolean m16223e() {
        return this.f13887a;
    }

    /* JADX INFO: renamed from: f */
    public boolean m16224f() {
        return this.f13888b;
    }

    /* JADX INFO: renamed from: g */
    public boolean m16225g() {
        return this.f13889c;
    }

    /* JADX INFO: renamed from: h */
    public boolean m16226h() {
        return this.f13890d;
    }

    /* JADX INFO: renamed from: j */
    public final void m16227j(Act act, hi60 hi60Var, PurchaseType purchaseType) {
        if (hi60Var.f13891e == null) {
            hi60Var.f13891e = act.getString(R.string.X9);
        }
        if (hi60Var.f13892f == null) {
            hi60Var.f13892f = act.getString(R.string.R9);
        }
        if (hi60Var.f13893g == null) {
            hi60Var.f13893g = vs80.m25865b(purchaseType);
        }
        if (hi60Var.f13894h == null) {
            hi60Var.f13894h = "";
        }
    }

    /* JADX INFO: renamed from: k */
    public void m16228k(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f13892f)) {
            this.f13888b = true;
        }
        this.f13892f = charSequence;
    }

    /* JADX INFO: renamed from: l */
    public void m16229l(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f13893g)) {
            this.f13887a = true;
        }
        this.f13893g = charSequence;
    }

    /* JADX INFO: renamed from: m */
    public void m16230m(CharSequence charSequence, boolean z) {
        if (!TextUtils.equals(charSequence, this.f13894h) || !z) {
            this.f13889c = true;
        }
        this.f13894h = charSequence;
    }
}
