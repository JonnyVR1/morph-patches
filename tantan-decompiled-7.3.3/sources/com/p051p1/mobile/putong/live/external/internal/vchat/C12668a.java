package com.p051p1.mobile.putong.live.external.internal.vchat;

import android.content.Intent;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4468a;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.live.base.data.BLiveCoin;
import com.p051p1.mobile.putong.live.base.data.BLiveExtraResponse;
import com.p051p1.mobile.putong.live.base.data.BLiveMerchandise;
import com.p051p1.mobile.putong.live.external.internal.vchat.C12668a;
import com.p051p1.mobile.putong.live.external.internal.vchat.recharge.LiveVChatRechargeAct;
import java.util.List;
import p137rx.C22421c;
import p153l.ahu;
import p153l.qcj;
import p153l.rnl;
import p153l.vrv;
import p153l.x20;
import p153l.zrv;
import p153l.zvr;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.a */
/* JADX INFO: loaded from: classes9.dex */
public class C12668a {

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.a$a */
    public class a implements C4468a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ x20 f45912a;

        public a(x20 x20Var) {
            this.f45912a = x20Var;
        }

        @Override // com.p051p1.mobile.android.app.C4468a.a
        /* JADX INFO: renamed from: a */
        public boolean mo21400a(int i, int i2, Intent intent) {
            x20 x20Var;
            if (i2 != 1 || (x20Var = this.f45912a) == null) {
                return false;
            }
            x20Var.call();
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ List m70414a(List list) {
        return list.size() > 5 ? list.subList(0, 5) : list;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ boolean m70418e(ahu ahuVar, int i, int i2, Intent intent) {
        if (i2 != 1) {
            return false;
        }
        ahuVar.m97928K2().LiveVideoChatEvent.m70382i().mo199273j(new C12669b());
        ahuVar.m97928K2().LiveVideoChatEvent.m70381h().mo199273j("");
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ boolean m70419f(x20 x20Var, int i, int i2, Intent intent) {
        if (i2 != 1 || x20Var == null) {
            return false;
        }
        x20Var.call();
        return false;
    }

    /* JADX INFO: renamed from: i */
    public static List<BLiveMerchandise> m70422i(List<BLiveMerchandise> list, BLiveMerchandise bLiveMerchandise) {
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
    public static C22421c<List<BLiveMerchandise>> m70423j() {
        return C22421c.just(zrv.f205799a.m207674j()).flatMap(new qcj() { // from class: l.gju
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return zrv.f205799a.m207665e0((String) obj, false);
            }
        }).filter(new qcj() { // from class: l.hju
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((List) obj).isEmpty());
            }
        }).map(new qcj() { // from class: l.iju
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C12668a.m70414a((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public static C22421c<BLiveMerchandise> m70424k() {
        return zrv.f205799a.m207665e0(ProductCategory.customCoin, false).filter(new qcj() { // from class: l.eju
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((List) obj).isEmpty());
            }
        }).flatMap(new qcj() { // from class: l.fju
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C22421c.just((BLiveMerchandise) ((List) obj).get(0));
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public static C22421c<BLiveCoin> m70425l() {
        return vrv.m202548i(rnl.m182263l(zvr.m221808h("/coins")), "refreshCoins", BLiveExtraResponse.JSON_ADAPTER).map(new qcj() { // from class: l.dju
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((BLiveExtraResponse) obj).data.coins;
            }
        });
    }

    /* JADX INFO: renamed from: m */
    public static void m70426m(Act act, boolean z) {
        act.startActivity(LiveVChatRechargeAct.m70867Y1(act, z));
        act.overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: n */
    public static void m70427n(Act act, boolean z, int i, x20 x20Var) {
        act.startActivityForResult(LiveVChatRechargeAct.m70868Z1(act, z, i), new a(x20Var));
        act.overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: o */
    public static void m70428o(Act act, boolean z, final x20 x20Var) {
        act.startActivityForResult(LiveVChatRechargeAct.m70867Y1(act, z), new C4468a.a() { // from class: l.jju
            @Override // com.p051p1.mobile.android.app.C4468a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo21400a(int i, int i2, Intent intent) {
                return C12668a.m70419f(x20Var, i, i2, intent);
            }
        });
        act.overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: p */
    public static void m70429p(final ahu ahuVar, boolean z) {
        ahuVar.act().startActivityForResult(LiveVChatRechargeAct.m70867Y1(ahuVar.act(), z), new C4468a.a() { // from class: l.cju
            @Override // com.p051p1.mobile.android.app.C4468a.a
            /* JADX INFO: renamed from: a */
            public final boolean mo21400a(int i, int i2, Intent intent) {
                return C12668a.m70418e(ahuVar, i, i2, intent);
            }
        });
        ahuVar.act().overridePendingTransition(0, 0);
    }
}
