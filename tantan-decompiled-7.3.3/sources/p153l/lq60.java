package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.data.PayMethod;

/* JADX INFO: loaded from: classes12.dex */
public class lq60 implements e2m {

    /* JADX INFO: renamed from: a */
    public Act f133145a;

    /* JADX INFO: renamed from: b */
    public String f133146b;

    /* JADX INFO: renamed from: c */
    public PurchaseType f133147c;

    /* JADX INFO: renamed from: d */
    public C8928d f133148d;

    /* JADX INFO: renamed from: e */
    public PayMethod f133149e;

    /* JADX INFO: renamed from: f */
    public mq60 f133150f;

    public lq60(Act act, String str, PurchaseType purchaseType, C8928d c8928d, PayMethod payMethod) {
        this.f133145a = act;
        this.f133146b = str;
        this.f133147c = purchaseType;
        this.f133148d = c8928d;
        this.f133149e = payMethod;
        this.f133150f = mq60.m159464i(act, purchaseType);
    }

    /* JADX INFO: renamed from: a */
    public Act m155318a() {
        return this.f133145a;
    }

    /* JADX INFO: renamed from: b */
    public String m155319b() {
        return this.f133146b;
    }

    /* JADX INFO: renamed from: c */
    public PayMethod m155320c() {
        return this.f133149e;
    }

    /* JADX INFO: renamed from: d */
    public C8928d m155321d() {
        return this.f133148d;
    }

    /* JADX INFO: renamed from: e */
    public mq60 m155322e() {
        return this.f133150f;
    }

    /* JADX INFO: renamed from: f */
    public PurchaseType m155323f() {
        return this.f133147c;
    }
}
