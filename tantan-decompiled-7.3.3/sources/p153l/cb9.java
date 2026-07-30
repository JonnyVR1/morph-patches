package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.PurchaseSavePop;
import com.p051p1.mobile.putong.core.data.PurchaseSavePopUserID;
import com.p051p1.mobile.putong.core.data.SalvagePopUser;
import com.p051p1.mobile.putong.core.data.SalvagePopUserType;
import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class cb9 extends dy6 {

    /* JADX INFO: renamed from: R */
    public byd0 f80710R;

    /* JADX INFO: renamed from: S */
    public byd0 f80711S;

    /* JADX INFO: renamed from: T */
    public List<SalvagePopUser> f80712T;

    /* JADX INFO: renamed from: U */
    public List<SalvagePopUser> f80713U;

    public cb9(C4883c c4883c) {
        super(c4883c);
        this.f80710R = new byd0("premium_salvage_dlg_last_show_time_" + CoreModule.m30929H().userId(), 0L);
        this.f80711S = new byd0("ultra1_salvage_dlg_last_show_time_" + CoreModule.m30929H().userId(), 0L);
    }

    /* JADX INFO: renamed from: i3 */
    public C22421c<Unit> m108610i3() {
        return scheduled("/purchase/save/pop", 0, new pcj() { // from class: l.va9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f183072a.m108617p3();
            }
        });
    }

    /* JADX INFO: renamed from: j3 */
    public void m108611j3() {
        m108610i3();
        m108614m3();
    }

    /* JADX INFO: renamed from: k3 */
    public final List<User> m108612k3(List<User> list, List<PurchaseSavePopUserID> list2) {
        User user;
        if (list == null || list2 == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (User user2 : list) {
            if (user2 != null && !TextUtils.isEmpty(user2.f56859id)) {
                map.put(user2.f56859id, user2);
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
    public final int m108613l3(List<PurchaseSavePopUserID> list, String str) {
        for (PurchaseSavePopUserID purchaseSavePopUserID : list) {
            if (purchaseSavePopUserID != null && purchaseSavePopUserID.userID.equals(str)) {
                return purchaseSavePopUserID.superLikeCountBy;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: m3 */
    public C22421c<Unit> m108614m3() {
        return scheduled("/purchase/save/pop?popType=ultra", 0, new pcj() { // from class: l.ua9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f178186a.m108620s3();
            }
        });
    }

    /* JADX INFO: renamed from: n3 */
    public final /* synthetic */ Envelope m108615n3(Envelope envelope) {
        if (!jyb.m147479J(((CommonData) envelope.getModuleData(CommonData.class)).users)) {
            this.f91137Q.m32495w3(envelope, null);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: o3 */
    public final /* synthetic */ Unit m108616o3(Envelope envelope) {
        PurchaseSavePop purchaseSavePop;
        CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        CommonData commonData = (CommonData) envelope.getModuleData(CommonData.class);
        if (coreData == null || (purchaseSavePop = coreData.purchaseSavePop) == null) {
            return Unit.INSTANCE;
        }
        List<User> listM108612k3 = m108612k3(commonData.users, purchaseSavePop.seeList);
        List<User> listM108612k4 = m108612k3(commonData.users, coreData.purchaseSavePop.rightSwipeList);
        if (jyb.m147479J(listM108612k4) || listM108612k4.size() < 4) {
            return Unit.INSTANCE;
        }
        int i = 0;
        if (!jyb.m147479J(listM108612k3) && listM108612k3.size() >= 6) {
            this.f80712T = new ArrayList();
            for (int i2 = 0; i2 < 3; i2++) {
                SalvagePopUser salvagePopUserNew_ = SalvagePopUser.new_();
                salvagePopUserNew_.user = listM108612k4.get(i2);
                salvagePopUserNew_.salvagePopUserType = SalvagePopUserType.get(SalvagePopUserType.rightSwipe);
                this.f80712T.add(salvagePopUserNew_);
            }
            while (i < 3) {
                SalvagePopUser salvagePopUserNew_2 = SalvagePopUser.new_();
                salvagePopUserNew_2.user = listM108612k3.get(i);
                salvagePopUserNew_2.salvagePopUserType = SalvagePopUserType.get("see");
                this.f80712T.add(salvagePopUserNew_2);
                i++;
            }
            return Unit.INSTANCE;
        }
        if (jyb.m147479J(listM108612k3) || listM108612k3.size() < 2) {
            this.f80712T = new ArrayList();
            while (i < 4) {
                SalvagePopUser salvagePopUserNew_3 = SalvagePopUser.new_();
                salvagePopUserNew_3.user = listM108612k4.get(i);
                salvagePopUserNew_3.salvagePopUserType = SalvagePopUserType.get(SalvagePopUserType.rightSwipe);
                this.f80712T.add(salvagePopUserNew_3);
                i++;
            }
            return Unit.INSTANCE;
        }
        this.f80712T = new ArrayList();
        for (int i3 = 0; i3 < 2; i3++) {
            SalvagePopUser salvagePopUserNew_4 = SalvagePopUser.new_();
            salvagePopUserNew_4.user = listM108612k4.get(i3);
            salvagePopUserNew_4.salvagePopUserType = SalvagePopUserType.get(SalvagePopUserType.rightSwipe);
            this.f80712T.add(salvagePopUserNew_4);
        }
        while (i < 2) {
            SalvagePopUser salvagePopUserNew_5 = SalvagePopUser.new_();
            salvagePopUserNew_5.user = listM108612k3.get(i);
            salvagePopUserNew_5.salvagePopUserType = SalvagePopUserType.get("see");
            this.f80712T.add(salvagePopUserNew_5);
            i++;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p3 */
    public final /* synthetic */ C22421c m108617p3() {
        return qi20.m176658e(new pcj() { // from class: l.za9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/purchase/save/pop")).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.ab9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f69216a.m108615n3((Envelope) obj);
            }
        }).observeOn(fo0.m126432a()).map(new qcj() { // from class: l.bb9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f75777a.m108616o3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q3 */
    public final /* synthetic */ Envelope m108618q3(Envelope envelope) {
        if (!jyb.m147479J(((CommonData) envelope.getModuleData(CommonData.class)).users)) {
            this.f91137Q.m32495w3(envelope, null);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: r3 */
    public final /* synthetic */ Unit m108619r3(Envelope envelope) {
        PurchaseSavePop purchaseSavePop;
        CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        CommonData commonData = (CommonData) envelope.getModuleData(CommonData.class);
        if (coreData == null || (purchaseSavePop = coreData.purchaseSavePop) == null) {
            return Unit.INSTANCE;
        }
        List<User> listM108612k3 = m108612k3(commonData.users, purchaseSavePop.ultraList);
        this.f80713U = new ArrayList();
        if (!jyb.m147479J(listM108612k3) && listM108612k3.size() == 1) {
            SalvagePopUser salvagePopUserNew_ = SalvagePopUser.new_();
            User user = listM108612k3.get(0);
            salvagePopUserNew_.user = user;
            salvagePopUserNew_.superLikeCountBy = m108613l3(coreData.purchaseSavePop.ultraList, user.f56859id);
            salvagePopUserNew_.salvagePopUserType = SalvagePopUserType.get("ultra");
            this.f80713U.add(salvagePopUserNew_);
        } else if (!jyb.m147479J(listM108612k3) && listM108612k3.size() == 4) {
            for (int i = 0; i < 4; i++) {
                SalvagePopUser salvagePopUserNew_2 = SalvagePopUser.new_();
                salvagePopUserNew_2.user = listM108612k3.get(i);
                salvagePopUserNew_2.salvagePopUserType = SalvagePopUserType.get("ultra");
                salvagePopUserNew_2.superLikeCountBy = m108613l3(coreData.purchaseSavePop.ultraList, salvagePopUserNew_2.user.f56859id);
                this.f80713U.add(salvagePopUserNew_2);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s3 */
    public final /* synthetic */ C22421c m108620s3() {
        return qi20.m176658e(new pcj() { // from class: l.wa9
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/purchase/save/pop?popType=ultra")).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.xa9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f192996a.m108618q3((Envelope) obj);
            }
        }).observeOn(fo0.m126432a()).map(new qcj() { // from class: l.ya9
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f198158a.m108619r3((Envelope) obj);
            }
        });
    }
}
