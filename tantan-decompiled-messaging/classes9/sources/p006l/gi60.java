package p006l;

import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.p1.mobile.putong.data.PayMethod;
import l.kzl;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class gi60 implements kzl {

    /* JADX INFO: renamed from: a */
    public Act f13319a;

    /* JADX INFO: renamed from: b */
    public String f13320b;

    /* JADX INFO: renamed from: c */
    public PurchaseType f13321c;

    /* JADX INFO: renamed from: d */
    public d f13322d;

    /* JADX INFO: renamed from: e */
    public PayMethod f13323e;

    /* JADX INFO: renamed from: f */
    public hi60 f13324f;

    public gi60(Act act, String str, PurchaseType purchaseType, d dVar, PayMethod payMethod) {
        this.f13319a = act;
        this.f13320b = str;
        this.f13321c = purchaseType;
        this.f13322d = dVar;
        this.f13323e = payMethod;
        this.f13324f = hi60.m16218i(act, purchaseType);
    }

    /* JADX INFO: renamed from: a */
    public Act m15800a() {
        return this.f13319a;
    }

    /* JADX INFO: renamed from: b */
    public String m15801b() {
        return this.f13320b;
    }

    /* JADX INFO: renamed from: c */
    public PayMethod m15802c() {
        return this.f13323e;
    }

    /* JADX INFO: renamed from: d */
    public d m15803d() {
        return this.f13322d;
    }

    /* JADX INFO: renamed from: e */
    public hi60 m15804e() {
        return this.f13324f;
    }

    /* JADX INFO: renamed from: f */
    public PurchaseType m15805f() {
        return this.f13321c;
    }
}
