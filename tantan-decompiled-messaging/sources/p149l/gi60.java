package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.data.PayMethod;

/* JADX INFO: loaded from: classes9.dex */
public class gi60 implements kzl {

    /* JADX INFO: renamed from: a */
    public Act f102843a;

    /* JADX INFO: renamed from: b */
    public String f102844b;

    /* JADX INFO: renamed from: c */
    public PurchaseType f102845c;

    /* JADX INFO: renamed from: d */
    public C8765d f102846d;

    /* JADX INFO: renamed from: e */
    public PayMethod f102847e;

    /* JADX INFO: renamed from: f */
    public hi60 f102848f;

    public gi60(Act act, String str, PurchaseType purchaseType, C8765d c8765d, PayMethod payMethod) {
        this.f102843a = act;
        this.f102844b = str;
        this.f102845c = purchaseType;
        this.f102846d = c8765d;
        this.f102847e = payMethod;
        this.f102848f = hi60.m131212i(act, purchaseType);
    }

    /* JADX INFO: renamed from: a */
    public Act m126256a() {
        return this.f102843a;
    }

    /* JADX INFO: renamed from: b */
    public String m126257b() {
        return this.f102844b;
    }

    /* JADX INFO: renamed from: c */
    public PayMethod m126258c() {
        return this.f102847e;
    }

    /* JADX INFO: renamed from: d */
    public C8765d m126259d() {
        return this.f102846d;
    }

    /* JADX INFO: renamed from: e */
    public hi60 m126260e() {
        return this.f102848f;
    }

    /* JADX INFO: renamed from: f */
    public PurchaseType m126261f() {
        return this.f102845c;
    }
}
