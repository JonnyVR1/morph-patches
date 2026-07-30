package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.UserPrivilege;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.MembershipType;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public class jmd0 extends bh60 {
    public jmd0(PurchaseType purchaseType, f5f0 f5f0Var) {
        super(purchaseType, f5f0Var);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ Boolean m142175i(List list, List list2) {
        Iterator it = list2.iterator();
        boolean z = true;
        while (it.hasNext()) {
            final UserPrivilege userPrivilege = (UserPrivilege) it.next();
            z = userPrivilege.content.expiredTime == ((UserPrivilege) vwb.m200346r(list, new w9j() { // from class: l.imd0
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
        return mkd0.m154985s(CoreModule.f17545c.f19639e0.m169523o9().distinctUntilChanged(new x9j() { // from class: l.dmd0
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return Boolean.valueOf(ch60.m106851b((User) obj, MembershipType.get("vip")) == ch60.m106851b((User) obj2, MembershipType.get("vip")));
            }
        }).skip(1), CoreModule.f17545c.m31483n3().distinctUntilChanged(new x9j() { // from class: l.emd0
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return Boolean.valueOf(((Counter) obj).likersLimit.expiresTime == ((Counter) obj2).likersLimit.expiresTime);
            }
        }).skip(1), CoreModule.f17545c.f19555C0.m210114x3().distinctUntilChanged(new x9j() { // from class: l.fmd0
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return jmd0.m142175i((List) obj, (List) obj2);
            }
        }).skip(1).map(new w9j() { // from class: l.gmd0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        }), new y9j() { // from class: l.hmd0
            @Override // p149l.y9j
            /* JADX INFO: renamed from: a */
            public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                return roj0.f160388a;
            }
        });
    }

    @Override // p149l.bh60
    /* JADX INFO: renamed from: c */
    public void mo97763c() {
        super.mo97763c();
        if (CoreModule.f17554l.m94651a().mo33583s3()) {
            CoreModule.f17545c.f19654j0.m30593K5();
        }
    }

    @Override // p149l.bh60
    /* JADX INFO: renamed from: d */
    public void mo97764d() {
        if (sab0.m182895m(this.f75560a)) {
            CoreModule.f17545c.f19658k1.m184468H3();
            CoreModule.f17545c.f19658k1.m184462A3();
        }
        if (ura.m195053e().m195057d().mo33841h5() || ura.m195053e().m195057d().mo33697Hg()) {
            CoreModule.f17545c.f19639e0.m169454W9(qib0.f154713b0.f139230a.userId());
            CoreModule.f17545c.f19639e0.m169397H9();
        }
        if (g6a.m124557f()) {
            CoreModule.f17545c.f19634c1.m137864N3();
        } else if (NullChecker.m81303a(this.f75561b) && NullChecker.m81303a(this.f75561b.f95177a) && !TextUtils.isEmpty(this.f75561b.f95177a.couponId)) {
            CoreModule.f17545c.f19634c1.m137864N3();
        }
        if (TEnum.equals(this.f75561b.f95180d, "alipay")) {
            CoreModule.f17545c.f19591O0.m30075C3();
            CoreModule.f17545c.f19591O0.m30074B3();
        }
        CoreModule.f17545c.f19555C0.m210112u4();
    }

    @Override // p149l.bh60
    /* JADX INFO: renamed from: e */
    public boolean mo97765e() {
        return sab0.m182899q(this.f75560a) || sab0.m182895m(this.f75560a);
    }
}
