package p009l;

import android.text.TextUtils;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.data.UserPrivilege;
import com.p1.mobile.putong.data.PaymentParam;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import l.roj0;
import l.sab0;
import l.w9j;
import l.x9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ndi extends bh60 {
    public ndi(PurchaseType purchaseType, f5f0 f5f0Var) {
        super(purchaseType, f5f0Var);
    }

    @Override // p009l.bh60
    /* JADX INFO: renamed from: b */
    public c<roj0> mo11532b() {
        return CoreModule.c.C0.u3(SummarizedPrivilegesId.get("femaleVip")).distinctUntilChanged(new x9j() { // from class: l.ldi
            public final Object call(Object obj, Object obj2) {
                return Boolean.valueOf(((UserPrivilege) obj).content.expiredTime == ((UserPrivilege) obj2).content.expiredTime);
            }
        }).skip(1).map(new w9j() { // from class: l.mdi
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    @Override // p009l.bh60
    /* JADX INFO: renamed from: c */
    public void mo11533c() {
        super.mo11533c();
        CoreModule.c.E0.S3();
        CoreModule.c.e0.W9(CoreModule.H().userId());
        CoreModule.c.E0.Z3();
    }

    @Override // p009l.bh60
    /* JADX INFO: renamed from: d */
    public void mo11534d() {
        if (TEnum.equals(this.f10107b.f12816d, "alipay")) {
            CoreModule.c.O0.C3();
            CoreModule.c.O0.B3();
        }
        CoreModule.c.C0.u4();
        if (NullChecker.a(this.f10107b) && NullChecker.a(this.f10107b.f12813a) && !TextUtils.isEmpty(((PaymentParam) this.f10107b.f12813a).couponId)) {
            CoreModule.c.c1.N3();
        }
    }

    @Override // p009l.bh60
    /* JADX INFO: renamed from: e */
    public boolean mo11535e() {
        return sab0.g(this.f10106a);
    }
}
