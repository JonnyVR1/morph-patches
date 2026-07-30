package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.data.MembershipType;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes11.dex */
public class mul0 extends gp60 {
    public mul0(PurchaseType purchaseType, mdf0 mdf0Var) {
        super(purchaseType, mdf0Var);
    }

    @Override // p153l.gp60
    /* JADX INFO: renamed from: b */
    public C22421c<uxj0> mo104620b() {
        return CoreModule.f18264c.f20381e0.m116596o9().distinctUntilChanged(new rcj() { // from class: l.kul0
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return Boolean.valueOf(hp60.m136478b((User) obj, MembershipType.get("vip")) == hp60.m136478b((User) obj2, MembershipType.get("vip")));
            }
        }).skip(1).map(new qcj() { // from class: l.lul0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    @Override // p153l.gp60
    /* JADX INFO: renamed from: c */
    public void mo109543c() {
        super.mo109543c();
        CoreModule.f18264c.f20396j0.m31596K5();
    }

    @Override // p153l.gp60
    /* JADX INFO: renamed from: d */
    public void mo104621d() {
        if (NullChecker.m82486a(this.f105437b) && NullChecker.m82486a(this.f105437b.f136376a) && !TextUtils.isEmpty(this.f105437b.f136376a.couponId)) {
            CoreModule.f18264c.f20376c1.m197851N3();
        }
        if (TEnum.equals(this.f105437b.f136379d, "alipay")) {
            CoreModule.f18264c.f20333O0.m31073C3();
            CoreModule.f18264c.f20333O0.m31072B3();
        }
        CoreModule.f18264c.f20381e0.m116527W9(CoreModule.m30929H().userId());
    }

    @Override // p153l.gp60
    /* JADX INFO: renamed from: e */
    public boolean mo104622e() {
        return wib0.m206579w(this.f105436a);
    }
}
