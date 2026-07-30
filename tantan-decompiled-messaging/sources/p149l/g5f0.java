package p149l;

import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.SignPaymentParam;
import com.p046p1.mobile.putong.data.PayMethod;

/* JADX INFO: loaded from: classes11.dex */
public class g5f0 {

    /* JADX INFO: renamed from: a */
    public SignPaymentParam f101143a;

    /* JADX INFO: renamed from: b */
    public Privilege f101144b;

    /* JADX INFO: renamed from: c */
    public boolean f101145c;

    /* JADX INFO: renamed from: d */
    public PayMethod f101146d;

    /* JADX INFO: renamed from: a */
    public f5f0 m124518a() {
        return new f5f0(this.f101143a, this.f101144b, this.f101145c, this.f101146d);
    }

    /* JADX INFO: renamed from: b */
    public g5f0 m124519b(Privilege privilege) {
        this.f101144b = privilege;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public g5f0 m124520c(boolean z) {
        this.f101145c = z;
        return this;
    }

    /* JADX INFO: renamed from: d */
    public g5f0 m124521d(PayMethod payMethod) {
        this.f101146d = payMethod;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public g5f0 m124522e(SignPaymentParam signPaymentParam) {
        this.f101143a = signPaymentParam;
        return this;
    }
}
