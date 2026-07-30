package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.PurchaseSavePop;
import com.p046p1.mobile.putong.core.data.PurchaseSavePopUserID;
import com.p046p1.mobile.putong.core.data.SalvagePopUser;
import com.p046p1.mobile.putong.core.data.SalvagePopUserType;
import com.p046p1.mobile.putong.data.CommonData;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class t99 extends ax6 {

    /* JADX INFO: renamed from: R */
    public zpd0 f168996R;

    /* JADX INFO: renamed from: S */
    public zpd0 f168997S;

    /* JADX INFO: renamed from: T */
    public List<SalvagePopUser> f168998T;

    /* JADX INFO: renamed from: U */
    public List<SalvagePopUser> f168999U;

    public t99(C4732c c4732c) {
        super(c4732c);
        this.f168996R = new zpd0("premium_salvage_dlg_last_show_time_" + CoreModule.m29931H().userId(), 0L);
        this.f168997S = new zpd0("ultra1_salvage_dlg_last_show_time_" + CoreModule.m29931H().userId(), 0L);
    }

    /* JADX INFO: renamed from: i3 */
    public C22306c<Unit> m187614i3() {
        return scheduled("/purchase/save/pop", 0, new v9j() { // from class: l.m99
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f132684a.m187621p3();
            }
        });
    }

    /* JADX INFO: renamed from: j3 */
    public void m187615j3() {
        m187614i3();
        m187618m3();
    }

    /* JADX INFO: renamed from: k3 */
    public final List<User> m187616k3(List<User> list, List<PurchaseSavePopUserID> list2) {
        User user;
        if (list == null || list2 == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (User user2 : list) {
            if (user2 != null && !TextUtils.isEmpty(user2.f56011id)) {
                map.put(user2.f56011id, user2);
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
    public final int m187617l3(List<PurchaseSavePopUserID> list, String str) {
        for (PurchaseSavePopUserID purchaseSavePopUserID : list) {
            if (purchaseSavePopUserID != null && purchaseSavePopUserID.userID.equals(str)) {
                return purchaseSavePopUserID.superLikeCountBy;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: m3 */
    public C22306c<Unit> m187618m3() {
        return scheduled("/purchase/save/pop?popType=ultra", 0, new v9j() { // from class: l.l99
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f126927a.m187624s3();
            }
        });
    }

    /* JADX INFO: renamed from: n3 */
    public final /* synthetic */ Envelope m187619n3(Envelope envelope) {
        if (!vwb.m200296J(((CommonData) envelope.getModuleData(CommonData.class)).users)) {
            this.f72126Q.m31492w3(envelope, null);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: o3 */
    public final /* synthetic */ Unit m187620o3(Envelope envelope) {
        PurchaseSavePop purchaseSavePop;
        CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        CommonData commonData = (CommonData) envelope.getModuleData(CommonData.class);
        if (coreData == null || (purchaseSavePop = coreData.purchaseSavePop) == null) {
            return Unit.INSTANCE;
        }
        List<User> listM187616k3 = m187616k3(commonData.users, purchaseSavePop.seeList);
        List<User> listM187616k4 = m187616k3(commonData.users, coreData.purchaseSavePop.rightSwipeList);
        if (vwb.m200296J(listM187616k4) || listM187616k4.size() < 4) {
            return Unit.INSTANCE;
        }
        int i = 0;
        if (!vwb.m200296J(listM187616k3) && listM187616k3.size() >= 6) {
            this.f168998T = new ArrayList();
            for (int i2 = 0; i2 < 3; i2++) {
                SalvagePopUser salvagePopUserNew_ = SalvagePopUser.new_();
                salvagePopUserNew_.user = listM187616k4.get(i2);
                salvagePopUserNew_.salvagePopUserType = SalvagePopUserType.get(SalvagePopUserType.rightSwipe);
                this.f168998T.add(salvagePopUserNew_);
            }
            while (i < 3) {
                SalvagePopUser salvagePopUserNew_2 = SalvagePopUser.new_();
                salvagePopUserNew_2.user = listM187616k3.get(i);
                salvagePopUserNew_2.salvagePopUserType = SalvagePopUserType.get("see");
                this.f168998T.add(salvagePopUserNew_2);
                i++;
            }
            return Unit.INSTANCE;
        }
        if (vwb.m200296J(listM187616k3) || listM187616k3.size() < 2) {
            this.f168998T = new ArrayList();
            while (i < 4) {
                SalvagePopUser salvagePopUserNew_3 = SalvagePopUser.new_();
                salvagePopUserNew_3.user = listM187616k4.get(i);
                salvagePopUserNew_3.salvagePopUserType = SalvagePopUserType.get(SalvagePopUserType.rightSwipe);
                this.f168998T.add(salvagePopUserNew_3);
                i++;
            }
            return Unit.INSTANCE;
        }
        this.f168998T = new ArrayList();
        for (int i3 = 0; i3 < 2; i3++) {
            SalvagePopUser salvagePopUserNew_4 = SalvagePopUser.new_();
            salvagePopUserNew_4.user = listM187616k4.get(i3);
            salvagePopUserNew_4.salvagePopUserType = SalvagePopUserType.get(SalvagePopUserType.rightSwipe);
            this.f168998T.add(salvagePopUserNew_4);
        }
        while (i < 2) {
            SalvagePopUser salvagePopUserNew_5 = SalvagePopUser.new_();
            salvagePopUserNew_5.user = listM187616k3.get(i);
            salvagePopUserNew_5.salvagePopUserType = SalvagePopUserType.get("see");
            this.f168998T.add(salvagePopUserNew_5);
            i++;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: p3 */
    public final /* synthetic */ C22306c m187621p3() {
        return ia20.m135121e(new v9j() { // from class: l.q99
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/purchase/save/pop")).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.r99
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f158285a.m187619n3((Envelope) obj);
            }
        }).observeOn(jo0.m142408a()).map(new w9j() { // from class: l.s99
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f163158a.m187620o3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: q3 */
    public final /* synthetic */ Envelope m187622q3(Envelope envelope) {
        if (!vwb.m200296J(((CommonData) envelope.getModuleData(CommonData.class)).users)) {
            this.f72126Q.m31492w3(envelope, null);
        }
        return envelope;
    }

    /* JADX INFO: renamed from: r3 */
    public final /* synthetic */ Unit m187623r3(Envelope envelope) {
        PurchaseSavePop purchaseSavePop;
        CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        CommonData commonData = (CommonData) envelope.getModuleData(CommonData.class);
        if (coreData == null || (purchaseSavePop = coreData.purchaseSavePop) == null) {
            return Unit.INSTANCE;
        }
        List<User> listM187616k3 = m187616k3(commonData.users, purchaseSavePop.ultraList);
        this.f168999U = new ArrayList();
        if (!vwb.m200296J(listM187616k3) && listM187616k3.size() == 1) {
            SalvagePopUser salvagePopUserNew_ = SalvagePopUser.new_();
            User user = listM187616k3.get(0);
            salvagePopUserNew_.user = user;
            salvagePopUserNew_.superLikeCountBy = m187617l3(coreData.purchaseSavePop.ultraList, user.f56011id);
            salvagePopUserNew_.salvagePopUserType = SalvagePopUserType.get("ultra");
            this.f168999U.add(salvagePopUserNew_);
        } else if (!vwb.m200296J(listM187616k3) && listM187616k3.size() == 4) {
            for (int i = 0; i < 4; i++) {
                SalvagePopUser salvagePopUserNew_2 = SalvagePopUser.new_();
                salvagePopUserNew_2.user = listM187616k3.get(i);
                salvagePopUserNew_2.salvagePopUserType = SalvagePopUserType.get("ultra");
                salvagePopUserNew_2.superLikeCountBy = m187617l3(coreData.purchaseSavePop.ultraList, salvagePopUserNew_2.user.f56011id);
                this.f168999U.add(salvagePopUserNew_2);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: s3 */
    public final /* synthetic */ C22306c m187624s3() {
        return ia20.m135121e(new v9j() { // from class: l.n99
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/purchase/save/pop?popType=ultra")).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.o99
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f142699a.m187622q3((Envelope) obj);
            }
        }).observeOn(jo0.m142408a()).map(new w9j() { // from class: l.p99
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f147685a.m187623r3((Envelope) obj);
            }
        });
    }
}
