package p153l;

import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.SignPaymentParam;
import com.p051p1.mobile.putong.data.PayMethod;

/* JADX INFO: loaded from: classes11.dex */
public class ndf0 {

    /* JADX INFO: renamed from: a */
    public SignPaymentParam f141488a;

    /* JADX INFO: renamed from: b */
    public Privilege f141489b;

    /* JADX INFO: renamed from: c */
    public boolean f141490c;

    /* JADX INFO: renamed from: d */
    public PayMethod f141491d;

    /* JADX INFO: renamed from: a */
    public mdf0 m162700a() {
        return new mdf0(this.f141488a, this.f141489b, this.f141490c, this.f141491d);
    }

    /* JADX INFO: renamed from: b */
    public ndf0 m162701b(Privilege privilege) {
        this.f141489b = privilege;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public ndf0 m162702c(boolean z) {
        this.f141490c = z;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public ndf0 m162703d(PayMethod payMethod) {
        this.f141491d = payMethod;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public ndf0 m162704e(SignPaymentParam signPaymentParam) {
        this.f141488a = signPaymentParam;
        return this;
    }
}
