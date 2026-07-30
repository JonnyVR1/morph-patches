package p153l;

import android.text.TextUtils;
import android.view.View;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p051p1.mobile.putong.live.base.data.BLiveCampaign;
import com.p051p1.mobile.putong.live.base.data.BLiveData;
import com.p051p1.mobile.putong.live.base.data.BLiveFirstChargeActivity;
import com.p051p1.mobile.putong.live.base.data.BLiveFirstChargeCampaign;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p051p1.mobile.putong.live.livingroom.common.bottom.BottomItemView;
import java.util.List;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes4.dex */
public class ws3 extends tz0 {

    /* JADX INFO: renamed from: y */
    public boolean f190592y;

    /* JADX INFO: renamed from: z */
    public x20 f190593z;

    public ws3(dum dumVar, BLiveBottomButton bLiveBottomButton, int i, int i2, String str, String str2) {
        super(dumVar, bLiveBottomButton, i, i2, str, 0, str2);
        this.f190592y = true;
        this.f190593z = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A4 */
    public /* synthetic */ void m207722A4(vxj0 vxj0Var) {
        m207734w4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B4 */
    public /* synthetic */ void m207723B4(LiveControlMessage liveControlMessage) {
        m207738C4();
    }

    /* JADX INFO: renamed from: D4 */
    private void m207724D4(final BLiveFirstChargeCampaign bLiveFirstChargeCampaign) {
        final BLiveFirstChargeActivity bLiveFirstChargeActivity;
        if (pzi0.m174454o() <= tzi0.m193666d(bLiveFirstChargeCampaign.firstEnterLiveRoomTime, 72)) {
            bLiveFirstChargeActivity = bLiveFirstChargeCampaign.activityArray.get(0);
        } else {
            long jM174454o = pzi0.m174454o();
            long jM193666d = tzi0.m193666d(bLiveFirstChargeCampaign.firstEnterLiveRoomTime, CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256);
            List<BLiveFirstChargeActivity> list = bLiveFirstChargeCampaign.activityArray;
            bLiveFirstChargeActivity = jM174454o <= jM193666d ? list.get(1) : list.get(2);
        }
        m207725F4(bLiveFirstChargeCampaign, bLiveFirstChargeActivity);
        mo119794b4(true);
        this.f190593z = new x20() { // from class: l.vs3
            @Override // p153l.x20
            public final void call() {
                this.f185552a.m207736y4(bLiveFirstChargeActivity, bLiveFirstChargeCampaign);
            }
        };
    }

    /* JADX INFO: renamed from: F4 */
    private void m207725F4(BLiveFirstChargeCampaign bLiveFirstChargeCampaign, BLiveFirstChargeActivity bLiveFirstChargeActivity) {
        if (pzi0.m174454o() < tzi0.m193666d(bLiveFirstChargeCampaign.firstEnterLiveRoomTime, 24) || pzi0.m174454o() > tzi0.m193666d(bLiveFirstChargeCampaign.firstEnterLiveRoomTime, 72) || ((civ) zrv.m221194l(htd0.f111524f)).m109965i() || bLiveFirstChargeCampaign.isCoinRecharged) {
            return;
        }
        m207739E4(bLiveFirstChargeActivity.f45217id, bLiveFirstChargeCampaign.detailUrl, bLiveFirstChargeCampaign.detailInset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v4 */
    public void m207733v4(BLiveData bLiveData) {
        BLiveFirstChargeCampaign bLiveFirstChargeCampaign;
        if (bLiveData == null || (bLiveFirstChargeCampaign = bLiveData.firstChargeCampaigns) == null) {
            return;
        }
        if (bLiveFirstChargeCampaign.isCoinRecharged || TEnum.equals(bLiveFirstChargeCampaign.firstChargeStatus, "completed") || bLiveFirstChargeCampaign.activityArray.size() != 3) {
            m207734w4();
        } else {
            m207724D4(bLiveFirstChargeCampaign);
        }
    }

    /* JADX INFO: renamed from: w4 */
    private void m207734w4() {
        mo119794b4(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y4 */
    public /* synthetic */ void m207736y4(BLiveFirstChargeActivity bLiveFirstChargeActivity, BLiveFirstChargeCampaign bLiveFirstChargeCampaign) {
        m207739E4(bLiveFirstChargeActivity.f45217id, bLiveFirstChargeCampaign.detailUrl, bLiveFirstChargeCampaign.detailInset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z4 */
    public /* synthetic */ void m207737z4(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            m207738C4();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX INFO: renamed from: C4 */
    public void m207738C4() {
        duringCreated(m213810E2().m168561z1()).subscribe(dhw.m115826e(new y20() { // from class: l.ts3
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f175959a.m207733v4((BLiveData) obj);
            }
        }, new y20() { // from class: l.us3
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f180725a.m207735x4((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2] */
    /* JADX INFO: renamed from: E4 */
    public void m207739E4(String str, String str2, List<Double> list) {
        BLiveCampaign bLiveCampaign = new BLiveCampaign();
        User userM168532l0 = m213810E2().m168532l0();
        if (userM168532l0 == null) {
            return;
        }
        bLiveCampaign.detailUrl = str2 + "?giftPackageID=" + str + "&anchorId=" + userM168532l0.f56859id;
        bLiveCampaign.detailInset = list;
        bLiveCampaign.isNeedCloseBtn = false;
        m213811F2().OpenH5Event.open().mo199273j(px50.m174112c(500).m174144r(bLiveCampaign).m174143q());
        ((civ) zrv.m221194l(htd0.f111524f)).m109980x(true);
    }

    @Override // p153l.e80, p153l.kf2
    /* JADX INFO: renamed from: V3 */
    public void mo96798V3(View view) {
        this.f190592y = false;
        V v2 = this.f126232k;
        if (v2 != 0) {
            ((BottomItemView) v2).mo73321g0(mo149349f4());
        }
        super.mo96798V3(view);
        m213811F2().BootBubbleEvent.dismissBubble().mo199273j("firstRechargeBubble");
        x20 x20Var = this.f190593z;
        if (x20Var != null) {
            x20Var.call();
        }
        mo119794b4(false);
    }

    @Override // p153l.kf2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo96799X3() {
        return BLiveButtonType.get("firstRechargeButton");
    }

    @Override // p153l.kf2
    /* JADX INFO: renamed from: f4 */
    public boolean mo149349f4() {
        return this.f190592y && super.mo149349f4();
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [l.oo2] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m207738C4();
        duringCreated(m213812H2().lifecycle()).subscribe(dhw.m115825d(new y20() { // from class: l.ps3
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f153872a.m207737z4((C4470c) obj);
            }
        }));
        duringCreated(m213811F2().BottomEvent.hideFirstRecharge().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.qs3
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f159242a.m207722A4((vxj0) obj);
            }
        }));
        duringCreated(m213810E2().m168539n1()).filter(new qcj() { // from class: l.rs3
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((LiveControlMessage) obj).type, "complete_first_recharge"));
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.ss3
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f170428a.m207723B4((LiveControlMessage) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x4 */
    public /* synthetic */ void m207735x4(Throwable th) {
    }
}
