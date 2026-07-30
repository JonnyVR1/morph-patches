package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.PurchaseSavePop;
import com.p1.mobile.putong.core.data.PurchaseSavePopUserID;
import com.p1.mobile.putong.core.data.SalvagePopUser;
import com.p1.mobile.putong.core.data.SalvagePopUserType;
import com.p1.mobile.putong.data.CommonData;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import l.jo0;
import l.v9j;
import l.vwb;
import l.w9j;
import l.zpd0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class t99 extends ax6 {

    /* JADX INFO: renamed from: R */
    public zpd0 f21959R;

    /* JADX INFO: renamed from: S */
    public zpd0 f21960S;

    /* JADX INFO: renamed from: T */
    public List<SalvagePopUser> f21961T;

    /* JADX INFO: renamed from: U */
    public List<SalvagePopUser> f21962U;

    public t99(C0158c c0158c) {
        super(c0158c);
        this.f21959R = new zpd0("premium_salvage_dlg_last_show_time_" + CoreModule.m1850H().userId(), 0L);
        this.f21960S = new zpd0("ultra1_salvage_dlg_last_show_time_" + CoreModule.m1850H().userId(), 0L);
    }

    /* JADX INFO: renamed from: i3 */
    public c<Unit> m24529i3() {
        return scheduled("/purchase/save/pop", 0, new v9j() { // from class: l.m99
            public final Object call() {
                return this.f16870a.m24536p3();
            }
        });
    }

    /* JADX INFO: renamed from: j3 */
    public void m24530j3() {
        m24529i3();
        m24533m3();
    }

    /* JADX INFO: renamed from: k3 */
    public final List<User> m24531k3(List<User> list, List<PurchaseSavePopUserID> list2) {
        User user;
        if (list == null || list2 == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (User user2 : list) {
            if (user2 != null && !TextUtils.isEmpty(((DbObject) user2).id)) {
                map.put(((DbObject) user2).id, user2);
            }
        }
        for (PurchaseSavePopUserID purchaseSavePopUserID : list2) {
            if (purchaseSavePopUserID != null && !TextUtils.isEmpty(purchaseSavePopUserID.userID) && (user = (User) map.get(purchaseSavePopUserID.userID)) != null) {
                arrayList.add(user);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: l3 */
    public final int m24532l3(List<PurchaseSavePopUserID> list, String str) {
        for (PurchaseSavePopUserID purchaseSavePopUserID : list) {
            if (purchaseSavePopUserID != null && purchaseSavePopUserID.userID.equals(str)) {
                return purchaseSavePopUserID.superLikeCountBy;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: m3 */
    public c<Unit> m24533m3() {
        return scheduled("/purchase/save/pop?popType=ultra", 0, new v9j() { // from class: l.l99
            public final Object call() {
                return this.f16279a.m24539s3();
            }
        });
    }

    /* JADX INFO: renamed from: n3 */
    public final /* synthetic */ Envelope m24534n3(Envelope envelope) {
        if (!vwb.J(envelope.getModuleData(CommonData.class).users)) {
            this.f8580Q.m3422w3(envelope, null);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: o3 */
    public final /* synthetic */ Unit m24535o3(Envelope envelope) {
        PurchaseSavePop purchaseSavePop;
        CoreData moduleData = envelope.getModuleData(CoreData.class);
        CommonData moduleData2 = envelope.getModuleData(CommonData.class);
        if (moduleData == null || (purchaseSavePop = moduleData.purchaseSavePop) == null) {
            return Unit.INSTANCE;
        }
        List<User> listM24531k3 = m24531k3(moduleData2.users, purchaseSavePop.seeList);
        List<User> listM24531k4 = m24531k3(moduleData2.users, moduleData.purchaseSavePop.rightSwipeList);
        if (vwb.J(listM24531k4) || listM24531k4.size() < 4) {
            return Unit.INSTANCE;
        }
        int i = 0;
        if (!vwb.J(listM24531k3) && listM24531k3.size() >= 6) {
            this.f21961T = new ArrayList();
            for (int i2 = 0; i2 < 3; i2++) {
                SalvagePopUser salvagePopUserNew_ = SalvagePopUser.new_();
                salvagePopUserNew_.user = listM24531k4.get(i2);
                salvagePopUserNew_.salvagePopUserType = SalvagePopUserType.get("rightSwipe");
                this.f21961T.add(salvagePopUserNew_);
            }
            while (i < 3) {
                SalvagePopUser salvagePopUserNew_2 = SalvagePopUser.new_();
                salvagePopUserNew_2.user = listM24531k3.get(i);
                salvagePopUserNew_2.salvagePopUserType = SalvagePopUserType.get("see");
                this.f21961T.add(salvagePopUserNew_2);
                i++;
            }
            return Unit.INSTANCE;
        }
        if (vwb.J(listM24531k3) || listM24531k3.size() < 2) {
            this.f21961T = new ArrayList();
            while (i < 4) {
                SalvagePopUser salvagePopUserNew_3 = SalvagePopUser.new_();
                salvagePopUserNew_3.user = listM24531k4.get(i);
                salvagePopUserNew_3.salvagePopUserType = SalvagePopUserType.get("rightSwipe");
                this.f21961T.add(salvagePopUserNew_3);
                i++;
            }
            return Unit.INSTANCE;
        }
        this.f21961T = new ArrayList();
        for (int i3 = 0; i3 < 2; i3++) {
            SalvagePopUser salvagePopUserNew_4 = SalvagePopUser.new_();
            salvagePopUserNew_4.user = listM24531k4.get(i3);
            salvagePopUserNew_4.salvagePopUserType = SalvagePopUserType.get("rightSwipe");
            this.f21961T.add(salvagePopUserNew_4);
        }
        while (i < 2) {
            SalvagePopUser salvagePopUserNew_5 = SalvagePopUser.new_();
            salvagePopUserNew_5.user = listM24531k3.get(i);
            salvagePopUserNew_5.salvagePopUserType = SalvagePopUserType.get("see");
            this.f21961T.add(salvagePopUserNew_5);
            i++;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p3 */
    public final /* synthetic */ c m24536p3() {
        return ia20.m16571e(new v9j() { // from class: l.q99
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3130G("/purchase/save/pop")).f().b();
            }
        }).map(new w9j() { // from class: l.r99
            public final Object call(Object obj) {
                return this.f20416a.m24534n3((Envelope) obj);
            }
        }).observeOn(jo0.a()).map(new w9j() { // from class: l.s99
            public final Object call(Object obj) {
                return this.f21151a.m24535o3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q3 */
    public final /* synthetic */ Envelope m24537q3(Envelope envelope) {
        if (!vwb.J(envelope.getModuleData(CommonData.class).users)) {
            this.f8580Q.m3422w3(envelope, null);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: r3 */
    public final /* synthetic */ Unit m24538r3(Envelope envelope) {
        PurchaseSavePop purchaseSavePop;
        CoreData moduleData = envelope.getModuleData(CoreData.class);
        CommonData moduleData2 = envelope.getModuleData(CommonData.class);
        if (moduleData == null || (purchaseSavePop = moduleData.purchaseSavePop) == null) {
            return Unit.INSTANCE;
        }
        List<User> listM24531k3 = m24531k3(moduleData2.users, purchaseSavePop.ultraList);
        this.f21962U = new ArrayList();
        if (!vwb.J(listM24531k3) && listM24531k3.size() == 1) {
            SalvagePopUser salvagePopUserNew_ = SalvagePopUser.new_();
            User user = listM24531k3.get(0);
            salvagePopUserNew_.user = user;
            salvagePopUserNew_.superLikeCountBy = m24532l3(moduleData.purchaseSavePop.ultraList, ((DbObject) user).id);
            salvagePopUserNew_.salvagePopUserType = SalvagePopUserType.get("ultra");
            this.f21962U.add(salvagePopUserNew_);
        } else if (!vwb.J(listM24531k3) && listM24531k3.size() == 4) {
            for (int i = 0; i < 4; i++) {
                SalvagePopUser salvagePopUserNew_2 = SalvagePopUser.new_();
                salvagePopUserNew_2.user = listM24531k3.get(i);
                salvagePopUserNew_2.salvagePopUserType = SalvagePopUserType.get("ultra");
                salvagePopUserNew_2.superLikeCountBy = m24532l3(moduleData.purchaseSavePop.ultraList, ((DbObject) salvagePopUserNew_2.user).id);
                this.f21962U.add(salvagePopUserNew_2);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s3 */
    public final /* synthetic */ c m24539s3() {
        return ia20.m16571e(new v9j() { // from class: l.n99
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3130G("/purchase/save/pop?popType=ultra")).f().b();
            }
        }).map(new w9j() { // from class: l.o99
            public final Object call(Object obj) {
                return this.f18079a.m24537q3((Envelope) obj);
            }
        }).observeOn(jo0.a()).map(new w9j() { // from class: l.p99
            public final Object call(Object obj) {
                return this.f18636a.m24538r3((Envelope) obj);
            }
        });
    }
}
