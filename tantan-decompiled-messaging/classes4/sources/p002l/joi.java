package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.BLiveCampaign;
import com.p1.mobile.putong.live.base.data.BLiveData;
import com.p1.mobile.putong.live.base.data.BLiveFirstChargeActivity;
import com.p1.mobile.putong.live.base.data.BLiveFirstChargeCampaign;
import com.tantanapp.common.data.DbObject;
import java.util.List;
import l.bgv;
import l.d30;
import l.e30;
import l.ffw;
import l.fld0;
import l.mqi0;
import l.qqi0;
import l.soj0;
import l.w9j;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class joi extends pat<ho2> {

    /* JADX INFO: renamed from: i */
    public final df2 f13889i;

    /* JADX INFO: renamed from: j */
    public d30 f13890j;

    public joi(bsm bsmVar, df2 df2Var) {
        super(bsmVar);
        this.f13890j = null;
        this.f13889i = df2Var;
    }

    /* JADX INFO: renamed from: R3 */
    public final void m16051R3(BLiveData bLiveData) {
        BLiveFirstChargeCampaign bLiveFirstChargeCampaign;
        if (bLiveData == null || (bLiveFirstChargeCampaign = bLiveData.firstChargeCampaigns) == null) {
            return;
        }
        if (bLiveFirstChargeCampaign.isCoinRecharged || TEnum.equals(bLiveFirstChargeCampaign.firstChargeStatus, "completed") || bLiveFirstChargeCampaign.activityArray.size() != 3) {
            m16052S3();
        } else {
            m16059Z3(bLiveFirstChargeCampaign);
        }
    }

    /* JADX INFO: renamed from: S3 */
    public final void m16052S3() {
        this.f13889i.mo11811b4(false);
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m16054U3(BLiveFirstChargeActivity bLiveFirstChargeActivity, BLiveFirstChargeCampaign bLiveFirstChargeCampaign) {
        m16060a4(bLiveFirstChargeActivity.id, bLiveFirstChargeCampaign.detailUrl, bLiveFirstChargeCampaign.detailInset);
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m16055V3(c cVar) {
        if (cVar == c.i) {
            m16058Y3();
        }
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m16056W3(soj0 soj0Var) {
        m16052S3();
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m16057X3(LiveControlMessage liveControlMessage) {
        m16058Y3();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX INFO: renamed from: Y3 */
    public void m16058Y3() {
        duringCreated(m25547E2().m14613z1()).subscribe(ffw.e(new e30() { // from class: l.goi
            public final void call(Object obj) {
                this.f11565a.m16051R3((BLiveData) obj);
            }
        }, new e30() { // from class: l.hoi
            public final void call(Object obj) {
                this.f12203a.m16053T3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m16059Z3(final BLiveFirstChargeCampaign bLiveFirstChargeCampaign) {
        final BLiveFirstChargeActivity bLiveFirstChargeActivity;
        if (mqi0.o() <= qqi0.d(bLiveFirstChargeCampaign.firstEnterLiveRoomTime, 72)) {
            bLiveFirstChargeActivity = (BLiveFirstChargeActivity) bLiveFirstChargeCampaign.activityArray.get(0);
        } else {
            long jO = mqi0.o();
            long jD = qqi0.d(bLiveFirstChargeCampaign.firstEnterLiveRoomTime, 168);
            List list = bLiveFirstChargeCampaign.activityArray;
            bLiveFirstChargeActivity = jO <= jD ? (BLiveFirstChargeActivity) list.get(1) : (BLiveFirstChargeActivity) list.get(2);
        }
        m16062c4(bLiveFirstChargeCampaign, bLiveFirstChargeActivity);
        this.f13889i.mo11811b4(true);
        this.f13890j = new d30() { // from class: l.ioi
            public final void call() {
                this.f13338a.m16054U3(bLiveFirstChargeActivity, bLiveFirstChargeCampaign);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX INFO: renamed from: a4 */
    public void m16060a4(String str, String str2, List<Double> list) {
        BLiveCampaign bLiveCampaign = new BLiveCampaign();
        User userM14582l0 = m25547E2().m14582l0();
        if (userM14582l0 == null) {
            return;
        }
        bLiveCampaign.detailUrl = str2 + "?giftPackageID=" + str + "&anchorId=" + ((DbObject) userM14582l0).id;
        bLiveCampaign.detailInset = list;
        bLiveCampaign.isNeedCloseBtn = false;
        m25548F2().OpenH5Event.open().j(jp50.m16064c(500).m16097r(bLiveCampaign).m16096q());
        ((bgv) ypv.l(fld0.f)).x(true);
    }

    /* JADX INFO: renamed from: b4 */
    public void m16061b4() {
        m16058Y3();
        duringCreated(m25549H2().lifecycle()).subscribe(ffw.d(new e30() { // from class: l.coi
            public final void call(Object obj) {
                this.f8845a.m16055V3((c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c4 */
    public final void m16062c4(BLiveFirstChargeCampaign bLiveFirstChargeCampaign, BLiveFirstChargeActivity bLiveFirstChargeActivity) {
        if (mqi0.o() < qqi0.d(bLiveFirstChargeCampaign.firstEnterLiveRoomTime, 24) || mqi0.o() > qqi0.d(bLiveFirstChargeCampaign.firstEnterLiveRoomTime, 72) || ((bgv) ypv.l(fld0.f)).i() || bLiveFirstChargeCampaign.isCoinRecharged) {
            return;
        }
        m16060a4(bLiveFirstChargeActivity.id, bLiveFirstChargeCampaign.detailUrl, bLiveFirstChargeCampaign.detailInset);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [l.ho2] */
    /* JADX INFO: renamed from: t */
    public void m16063t() {
        super.t();
        duringCreated((rx.c) m25548F2().BottomEvent.hideFirstRecharge().g()).subscribe(ffw.d(new e30() { // from class: l.doi
            public final void call(Object obj) {
                this.f9375a.m16056W3((soj0) obj);
            }
        }));
        duringCreated(m25547E2().m14589n1()).filter(new w9j() { // from class: l.eoi
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((LiveControlMessage) obj).type, "complete_first_recharge"));
            }
        }).subscribe(ffw.d(new e30() { // from class: l.foi
            public final void call(Object obj) {
                this.f10573a.m16057X3((LiveControlMessage) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ void m16053T3(Throwable th) {
    }
}
