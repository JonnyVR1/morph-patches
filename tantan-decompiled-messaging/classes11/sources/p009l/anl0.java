package p009l;

import android.text.TextUtils;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.UserPrivilege;
import com.p1.mobile.putong.data.MembershipType;
import com.p1.mobile.putong.data.PaymentParam;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;
import l.mkd0;
import l.roj0;
import l.sab0;
import l.ura;
import l.vwb;
import l.w9j;
import l.x9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class anl0 extends bh60 {
    public anl0(PurchaseType purchaseType, f5f0 f5f0Var) {
        super(purchaseType, f5f0Var);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Boolean m11530h(List list, List list2) {
        Iterator it = list2.iterator();
        boolean z = true;
        while (it.hasNext()) {
            final UserPrivilege userPrivilege = (UserPrivilege) it.next();
            z = userPrivilege.content.expiredTime == ((UserPrivilege) vwb.r(list, new w9j() { // from class: l.zml0
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(((DbObject) userPrivilege).id, ((DbObject) ((UserPrivilege) obj)).id));
                }
            })).content.expiredTime;
            if (!z) {
                break;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // p009l.bh60
    /* JADX INFO: renamed from: b */
    public c<roj0> mo11532b() {
        return mkd0.r(CoreModule.c.e0.o9().distinctUntilChanged(new x9j() { // from class: l.wml0
            public final Object call(Object obj, Object obj2) {
                return Boolean.valueOf(ch60.m12550b((User) obj, MembershipType.get("vip")) == ch60.m12550b((User) obj2, MembershipType.get("vip")));
            }
        }).skip(1), CoreModule.c.C0.x3().distinctUntilChanged(new x9j() { // from class: l.xml0
            public final Object call(Object obj, Object obj2) {
                return anl0.m11530h((List) obj, (List) obj2);
            }
        }).skip(1), new x9j() { // from class: l.yml0
            public final Object call(Object obj, Object obj2) {
                return roj0.a;
            }
        });
    }

    @Override // p009l.bh60
    /* JADX INFO: renamed from: c */
    public void mo11533c() {
        super.mo11533c();
        CoreModule.c.j0.K5();
    }

    @Override // p009l.bh60
    /* JADX INFO: renamed from: d */
    public void mo11534d() {
        CoreModule.c.C0.u4();
        CoreModule.c.e0.W9(CoreModule.H().userId());
        if (NullChecker.a(this.f10107b) && NullChecker.a(this.f10107b.f12813a) && !TextUtils.isEmpty(((PaymentParam) this.f10107b.f12813a).couponId)) {
            CoreModule.c.c1.N3();
        }
        if (TEnum.equals(this.f10107b.f12816d, "alipay")) {
            CoreModule.c.O0.C3();
            CoreModule.c.O0.B3();
        }
    }

    @Override // p009l.bh60
    /* JADX INFO: renamed from: e */
    public boolean mo11535e() {
        return sab0.w(this.f10106a) && ura.e().d().t();
    }
}
