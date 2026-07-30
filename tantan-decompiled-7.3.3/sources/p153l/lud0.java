package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.UserPrivilege;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.MembershipType;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes11.dex */
public class lud0 extends gp60 {
    public lud0(PurchaseType purchaseType, mdf0 mdf0Var) {
        super(purchaseType, mdf0Var);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ Boolean m155920i(List list, List list2) {
        Iterator it = list2.iterator();
        boolean z = true;
        while (it.hasNext()) {
            final UserPrivilege userPrivilege = (UserPrivilege) it.next();
            z = userPrivilege.content.expiredTime == ((UserPrivilege) jyb.m147529r(list, new qcj() { // from class: l.kud0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(userPrivilege.f56859id, ((UserPrivilege) obj).f56859id));
                }
            })).content.expiredTime;
            if (!z) {
                break;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // p153l.gp60
    /* JADX INFO: renamed from: b */
    public C22421c<uxj0> mo104620b() {
        return psd0.m173626s(CoreModule.f18264c.f20381e0.m116596o9().distinctUntilChanged(new rcj() { // from class: l.fud0
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return Boolean.valueOf(hp60.m136478b((User) obj, MembershipType.get("vip")) == hp60.m136478b((User) obj2, MembershipType.get("vip")));
            }
        }).skip(1), CoreModule.f18264c.m32486n3().distinctUntilChanged(new rcj() { // from class: l.gud0
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return Boolean.valueOf(((Counter) obj).likersLimit.expiresTime == ((Counter) obj2).likersLimit.expiresTime);
            }
        }).skip(1), CoreModule.f18264c.f20297C0.m146427y3().distinctUntilChanged(new rcj() { // from class: l.hud0
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return lud0.m155920i((List) obj, (List) obj2);
            }
        }).skip(1).map(new qcj() { // from class: l.iud0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        }), new scj() { // from class: l.jud0
            @Override // p153l.scj
            /* JADX INFO: renamed from: a */
            public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                return uxj0.f181467a;
            }
        });
    }

    @Override // p153l.gp60
    /* JADX INFO: renamed from: c */
    public void mo109543c() {
        super.mo109543c();
        if (CoreModule.f18273l.m143405a().mo34586s3()) {
            CoreModule.f18264c.f20396j0.m31596K5();
        }
    }

    @Override // p153l.gp60
    /* JADX INFO: renamed from: d */
    public void mo104621d() {
        if (wib0.m206569m(this.f105436a)) {
            CoreModule.f18264c.f20400k1.m121129H3();
            CoreModule.f18264c.f20400k1.m121123A3();
        }
        if (gta.m132210e().m132214d().mo34844h5() || gta.m132210e().m132214d().mo34700Hg()) {
            CoreModule.f18264c.f20381e0.m116527W9(uqb0.f180396b0.f170324a.userId());
            CoreModule.f18264c.f20381e0.m116470H9();
        }
        if (s7a.m184977f()) {
            CoreModule.f18264c.f20376c1.m197851N3();
        } else if (NullChecker.m82486a(this.f105437b) && NullChecker.m82486a(this.f105437b.f136376a) && !TextUtils.isEmpty(this.f105437b.f136376a.couponId)) {
            CoreModule.f18264c.f20376c1.m197851N3();
        }
        if (TEnum.equals(this.f105437b.f136379d, "alipay")) {
            CoreModule.f18264c.f20333O0.m31073C3();
            CoreModule.f18264c.f20333O0.m31072B3();
        }
        CoreModule.f18264c.f20297C0.m146425v4();
    }

    @Override // p153l.gp60
    /* JADX INFO: renamed from: e */
    public boolean mo104622e() {
        return wib0.m206573q(this.f105436a) || wib0.m206569m(this.f105436a);
    }
}
