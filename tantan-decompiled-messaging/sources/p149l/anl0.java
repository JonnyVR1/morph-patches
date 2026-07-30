package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.UserPrivilege;
import com.p046p1.mobile.putong.data.MembershipType;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public class anl0 extends bh60 {
    public anl0(PurchaseType purchaseType, f5f0 f5f0Var) {
        super(purchaseType, f5f0Var);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Boolean m97760h(List list, List list2) {
        Iterator it = list2.iterator();
        boolean z = true;
        while (it.hasNext()) {
            final UserPrivilege userPrivilege = (UserPrivilege) it.next();
            z = userPrivilege.content.expiredTime == ((UserPrivilege) vwb.m200346r(list, new w9j() { // from class: l.zml0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TextUtils.equals(userPrivilege.f56011id, ((UserPrivilege) obj).f56011id));
                }
            })).content.expiredTime;
            if (!z) {
                break;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // p149l.bh60
    /* JADX INFO: renamed from: b */
    public C22306c<roj0> mo97762b() {
        return mkd0.m154984r(CoreModule.f17545c.f19639e0.m169523o9().distinctUntilChanged(new x9j() { // from class: l.wml0
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return Boolean.valueOf(ch60.m106851b((User) obj, MembershipType.get("vip")) == ch60.m106851b((User) obj2, MembershipType.get("vip")));
            }
        }).skip(1), CoreModule.f17545c.f19555C0.m210114x3().distinctUntilChanged(new x9j() { // from class: l.xml0
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return anl0.m97760h((List) obj, (List) obj2);
            }
        }).skip(1), new x9j() { // from class: l.yml0
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return roj0.f160388a;
            }
        });
    }

    @Override // p149l.bh60
    /* JADX INFO: renamed from: c */
    public void mo97763c() {
        super.mo97763c();
        CoreModule.f17545c.f19654j0.m30593K5();
    }

    @Override // p149l.bh60
    /* JADX INFO: renamed from: d */
    public void mo97764d() {
        CoreModule.f17545c.f19555C0.m210112u4();
        CoreModule.f17545c.f19639e0.m169454W9(CoreModule.m29931H().userId());
        if (NullChecker.m81303a(this.f75561b) && NullChecker.m81303a(this.f75561b.f95177a) && !TextUtils.isEmpty(this.f75561b.f95177a.couponId)) {
            CoreModule.f17545c.f19634c1.m137864N3();
        }
        if (TEnum.equals(this.f75561b.f95180d, "alipay")) {
            CoreModule.f17545c.f19591O0.m30075C3();
            CoreModule.f17545c.f19591O0.m30074B3();
        }
    }

    @Override // p149l.bh60
    /* JADX INFO: renamed from: e */
    public boolean mo97765e() {
        return sab0.m182905w(this.f75560a) && ura.m195053e().m195057d().mo33922t();
    }
}
