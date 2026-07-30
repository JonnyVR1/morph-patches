package p009l;

import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.SignPaymentParam;
import com.p1.mobile.putong.data.PayMethod;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class g5f0 {

    /* JADX INFO: renamed from: a */
    public SignPaymentParam f13309a;

    /* JADX INFO: renamed from: b */
    public Privilege f13310b;

    /* JADX INFO: renamed from: c */
    public boolean f13311c;

    /* JADX INFO: renamed from: d */
    public PayMethod f13312d;

    /* JADX INFO: renamed from: a */
    public f5f0 m14789a() {
        return new f5f0(this.f13309a, this.f13310b, this.f13311c, this.f13312d);
    }

    /* JADX INFO: renamed from: b */
    public g5f0 m14790b(Privilege privilege) {
        this.f13310b = privilege;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public g5f0 m14791c(boolean z) {
        this.f13311c = z;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public g5f0 m14792d(PayMethod payMethod) {
        this.f13312d = payMethod;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public g5f0 m14793e(SignPaymentParam signPaymentParam) {
        this.f13309a = signPaymentParam;
        return this;
    }
}
