package p002l;

import android.text.TextUtils;
import android.view.View;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p000p1.mobile.putong.live.livingroom.common.bottom.BottomItemView;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p1.mobile.putong.live.base.data.BLiveButtonType;
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
public class xr3 extends mz0 {

    /* JADX INFO: renamed from: y */
    public boolean f22424y;

    /* JADX INFO: renamed from: z */
    public d30 f22425z;

    public xr3(bsm bsmVar, BLiveBottomButton bLiveBottomButton, int i, int i2, String str, String str2) {
        super(bsmVar, bLiveBottomButton, i, i2, str, 0, str2);
        this.f22424y = true;
        this.f22425z = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A4 */
    public /* synthetic */ void m26069A4(soj0 soj0Var) {
        m26081w4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B4 */
    public /* synthetic */ void m26070B4(LiveControlMessage liveControlMessage) {
        m26085C4();
    }

    /* JADX INFO: renamed from: D4 */
    private void m26071D4(final BLiveFirstChargeCampaign bLiveFirstChargeCampaign) {
        final BLiveFirstChargeActivity bLiveFirstChargeActivity;
        if (mqi0.o() <= qqi0.d(bLiveFirstChargeCampaign.firstEnterLiveRoomTime, 72)) {
            bLiveFirstChargeActivity = (BLiveFirstChargeActivity) bLiveFirstChargeCampaign.activityArray.get(0);
        } else {
            long jO = mqi0.o();
            long jD = qqi0.d(bLiveFirstChargeCampaign.firstEnterLiveRoomTime, 168);
            List list = bLiveFirstChargeCampaign.activityArray;
            bLiveFirstChargeActivity = jO <= jD ? (BLiveFirstChargeActivity) list.get(1) : (BLiveFirstChargeActivity) list.get(2);
        }
        m26072F4(bLiveFirstChargeCampaign, bLiveFirstChargeActivity);
        mo11811b4(true);
        this.f22425z = new d30() { // from class: l.wr3
            public final void call() {
                this.f21945a.m26083y4(bLiveFirstChargeActivity, bLiveFirstChargeCampaign);
            }
        };
    }

    /* JADX INFO: renamed from: F4 */
    private void m26072F4(BLiveFirstChargeCampaign bLiveFirstChargeCampaign, BLiveFirstChargeActivity bLiveFirstChargeActivity) {
        if (mqi0.o() < qqi0.d(bLiveFirstChargeCampaign.firstEnterLiveRoomTime, 24) || mqi0.o() > qqi0.d(bLiveFirstChargeCampaign.firstEnterLiveRoomTime, 72) || ((bgv) ypv.l(fld0.f)).i() || bLiveFirstChargeCampaign.isCoinRecharged) {
            return;
        }
        m26086E4(bLiveFirstChargeActivity.id, bLiveFirstChargeCampaign.detailUrl, bLiveFirstChargeCampaign.detailInset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v4 */
    public void m26080v4(BLiveData bLiveData) {
        BLiveFirstChargeCampaign bLiveFirstChargeCampaign;
        if (bLiveData == null || (bLiveFirstChargeCampaign = bLiveData.firstChargeCampaigns) == null) {
            return;
        }
        if (bLiveFirstChargeCampaign.isCoinRecharged || TEnum.equals(bLiveFirstChargeCampaign.firstChargeStatus, "completed") || bLiveFirstChargeCampaign.activityArray.size() != 3) {
            m26081w4();
        } else {
            m26071D4(bLiveFirstChargeCampaign);
        }
    }

    /* JADX INFO: renamed from: w4 */
    private void m26081w4() {
        mo11811b4(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y4 */
    public /* synthetic */ void m26083y4(BLiveFirstChargeActivity bLiveFirstChargeActivity, BLiveFirstChargeCampaign bLiveFirstChargeCampaign) {
        m26086E4(bLiveFirstChargeActivity.id, bLiveFirstChargeCampaign.detailUrl, bLiveFirstChargeCampaign.detailInset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z4 */
    public /* synthetic */ void m26084z4(c cVar) {
        if (cVar == c.i) {
            m26085C4();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX INFO: renamed from: C4 */
    public void m26085C4() {
        duringCreated(m25547E2().m14613z1()).subscribe(ffw.e(new e30() { // from class: l.ur3
            public final void call(Object obj) {
                this.f20758a.m26080v4((BLiveData) obj);
            }
        }, new e30() { // from class: l.vr3
            public final void call(Object obj) {
                this.f21274a.m26082x4((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX INFO: renamed from: E4 */
    public void m26086E4(String str, String str2, List<Double> list) {
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

    @Override // p002l.i80, p002l.df2
    /* JADX INFO: renamed from: V3 */
    public void mo10610V3(View view) {
        this.f22424y = false;
        V v = this.f9196k;
        if (v != 0) {
            ((BottomItemView) v).mo5611g0(mo11814f4());
        }
        super.mo10610V3(view);
        m25548F2().BootBubbleEvent.dismissBubble().j("firstRechargeBubble");
        d30 d30Var = this.f22425z;
        if (d30Var != null) {
            d30Var.call();
        }
        mo11811b4(false);
    }

    @Override // p002l.df2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo10613X3() {
        return BLiveButtonType.get("firstRechargeButton");
    }

    @Override // p002l.df2
    /* JADX INFO: renamed from: f4 */
    public boolean mo11814f4() {
        return this.f22424y && super.mo11814f4();
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [l.ho2] */
    /* JADX INFO: renamed from: t */
    public void m26087t() {
        super.t();
        m26085C4();
        duringCreated(m25549H2().lifecycle()).subscribe(ffw.d(new e30() { // from class: l.qr3
            public final void call(Object obj) {
                this.f18187a.m26084z4((c) obj);
            }
        }));
        duringCreated((rx.c) m25548F2().BottomEvent.hideFirstRecharge().g()).subscribe(ffw.d(new e30() { // from class: l.rr3
            public final void call(Object obj) {
                this.f18658a.m26069A4((soj0) obj);
            }
        }));
        duringCreated(m25547E2().m14589n1()).filter(new w9j() { // from class: l.sr3
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((LiveControlMessage) obj).type, "complete_first_recharge"));
            }
        }).subscribe(ffw.d(new e30() { // from class: l.tr3
            public final void call(Object obj) {
                this.f20356a.m26070B4((LiveControlMessage) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x4 */
    public /* synthetic */ void m26082x4(Throwable th) {
    }
}
