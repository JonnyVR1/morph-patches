package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.pay.R$string;

/* JADX INFO: loaded from: classes9.dex */
public class hi60 implements kzl {

    /* JADX INFO: renamed from: a */
    public boolean f107874a = false;

    /* JADX INFO: renamed from: b */
    public boolean f107875b = false;

    /* JADX INFO: renamed from: c */
    public boolean f107876c = false;

    /* JADX INFO: renamed from: d */
    public boolean f107877d = false;

    /* JADX INFO: renamed from: e */
    public CharSequence f107878e;

    /* JADX INFO: renamed from: f */
    public CharSequence f107879f;

    /* JADX INFO: renamed from: g */
    public CharSequence f107880g;

    /* JADX INFO: renamed from: h */
    public CharSequence f107881h;

    /* JADX INFO: renamed from: i */
    public static hi60 m131212i(Act act, PurchaseType purchaseType) {
        hi60 hi60Var = new hi60();
        hi60Var.m131221j(act, hi60Var, purchaseType);
        return hi60Var;
    }

    /* JADX INFO: renamed from: a */
    public CharSequence m131213a() {
        return this.f107879f;
    }

    /* JADX INFO: renamed from: b */
    public CharSequence m131214b() {
        return this.f107880g;
    }

    /* JADX INFO: renamed from: c */
    public CharSequence m131215c() {
        return this.f107881h;
    }

    /* JADX INFO: renamed from: d */
    public CharSequence m131216d() {
        return this.f107878e;
    }

    /* JADX INFO: renamed from: e */
    public boolean m131217e() {
        return this.f107874a;
    }

    /* JADX INFO: renamed from: f */
    public boolean m131218f() {
        return this.f107875b;
    }

    /* JADX INFO: renamed from: g */
    public boolean m131219g() {
        return this.f107876c;
    }

    /* JADX INFO: renamed from: h */
    public boolean m131220h() {
        return this.f107877d;
    }

    /* JADX INFO: renamed from: j */
    public final void m131221j(Act act, hi60 hi60Var, PurchaseType purchaseType) {
        if (hi60Var.f107878e == null) {
            hi60Var.f107878e = act.getString(R$string.f27353X9);
        }
        if (hi60Var.f107879f == null) {
            hi60Var.f107879f = act.getString(R$string.f27287R9);
        }
        if (hi60Var.f107880g == null) {
            hi60Var.f107880g = vs80.m199853b(purchaseType);
        }
        if (hi60Var.f107881h == null) {
            hi60Var.f107881h = "";
        }
    }

    /* JADX INFO: renamed from: k */
    public void m131222k(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f107879f)) {
            this.f107875b = true;
        }
        this.f107879f = charSequence;
    }

    /* JADX INFO: renamed from: l */
    public void m131223l(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f107880g)) {
            this.f107874a = true;
        }
        this.f107880g = charSequence;
    }

    /* JADX INFO: renamed from: m */
    public void m131224m(CharSequence charSequence, boolean z) {
        if (!TextUtils.equals(charSequence, this.f107881h) || !z) {
            this.f107876c = true;
        }
        this.f107881h = charSequence;
    }
}
