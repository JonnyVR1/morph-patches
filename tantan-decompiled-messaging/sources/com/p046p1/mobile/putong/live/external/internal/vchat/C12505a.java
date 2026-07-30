package com.p046p1.mobile.putong.live.external.internal.vchat;

import android.content.Intent;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4317a;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.live.base.data.BLiveCoin;
import com.p046p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.p046p1.mobile.putong.live.base.data.BLiveMerchandise;
import com.p046p1.mobile.putong.live.external.internal.vchat.C12505a;
import com.p046p1.mobile.putong.live.external.internal.vchat.recharge.LiveVChatRechargeAct;
import java.util.List;
import p133rx.C22306c;
import p149l.cll;
import p149l.d30;
import p149l.upv;
import p149l.w9j;
import p149l.ypv;
import p149l.ytr;
import p149l.zeu;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.a */
/* JADX INFO: loaded from: classes13.dex */
public class C12505a {

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.a$a */
    public class a implements C4317a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f45064a;

        public a(d30 d30Var) {
            this.f45064a = d30Var;
        }

        @Override // com.p046p1.mobile.android.app.C4317a.a
        /* JADX INFO: renamed from: a */
        public boolean mo20401a(int i, int i2, Intent intent) {
            d30 d30Var;
            if (i2 != 1 || (d30Var = this.f45064a) == null) {
                return false;
            }
            d30Var.call();
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ List m69231a(List list) {
        return list.size() > 5 ? list.subList(0, 5) : list;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ boolean m69235e(zeu zeuVar, int i, int i2, Intent intent) {
        if (i2 != 1) {
            return false;
        }
        zeuVar.m218411K2().LiveVideoChatEvent.m69199i().mo172463j(new C12506b());
        zeuVar.m218411K2().LiveVideoChatEvent.m69198h().mo172463j("");
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ boolean m69236f(d30 d30Var, int i, int i2, Intent intent) {
        if (i2 != 1 || d30Var == null) {
            return false;
        }
        d30Var.call();
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static List<BLiveMerchandise> m69239i(List<BLiveMerchandise> list, BLiveMerchandise bLiveMerchandise) {
        if (bLiveMerchandise != null) {
            bLiveMerchandise.isCustomRecharge = true;
            bLiveMerchandise.defaultStockKeepUnit.prices.price = 10.0d;
            bLiveMerchandise.quantity = 0;
            bLiveMerchandise.isCustomRechargeInput = false;
            list.add(bLiveMerchandise);
        }
        return list;
    }

    /* JADX INFO: renamed from: j */
    public static C22306c<List<BLiveMerchandise>> m69240j() {
        return C22306c.just(ypv.f199493a.m199352j()).flatMap(new w9j() { // from class: l.fhu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ypv.f199493a.m199343e0((String) obj, false);
            }
        }).filter(new w9j() { // from class: l.ghu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((List) obj).isEmpty());
            }
        }).map(new w9j() { // from class: l.hhu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C12505a.m69231a((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public static C22306c<BLiveMerchandise> m69241k() {
        return ypv.f199493a.m199343e0(ProductCategory.customCoin, false).filter(new w9j() { // from class: l.dhu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((List) obj).isEmpty());
            }
        }).flatMap(new w9j() { // from class: l.ehu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C22306c.just((BLiveMerchandise) ((List) obj).get(0));
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public static C22306c<BLiveCoin> m69242l() {
        return upv.m194921i(cll.m107499l(ytr.m216079h("/coins")), "refreshCoins", BLiveExtraResponse.JSON_ADAPTER).map(new w9j() { // from class: l.chu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((BLiveExtraResponse) obj).data.coins;
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public static void m69243m(Act act, boolean z) {
        act.startActivity(LiveVChatRechargeAct.m69684X1(act, z));
        act.overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: n */
    public static void m69244n(Act act, boolean z, int i, d30 d30Var) {
        act.startActivityForResult(LiveVChatRechargeAct.m69685Y1(act, z, i), new a(d30Var));
        act.overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: o */
    public static void m69245o(Act act, boolean z, final d30 d30Var) {
        act.startActivityForResult(LiveVChatRechargeAct.m69684X1(act, z), new C4317a.a() { // from class: l.ihu
            @Override // com.p046p1.mobile.android.app.C4317a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo20401a(int i, int i2, Intent intent) {
                return C12505a.m69236f(d30Var, i, i2, intent);
            }
        });
        act.overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: p */
    public static void m69246p(final zeu zeuVar, boolean z) {
        zeuVar.act().startActivityForResult(LiveVChatRechargeAct.m69684X1(zeuVar.act(), z), new C4317a.a() { // from class: l.bhu
            @Override // com.p046p1.mobile.android.app.C4317a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo20401a(int i, int i2, Intent intent) {
                return C12505a.m69235e(zeuVar, i, i2, intent);
            }
        });
        zeuVar.act().overridePendingTransition(0, 0);
    }
}
