package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveCampaign;
import com.p051p1.mobile.putong.live.base.data.BLiveData;
import com.p051p1.mobile.putong.live.base.data.BLiveFirstChargeActivity;
import com.p051p1.mobile.putong.live.base.data.BLiveFirstChargeCampaign;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import java.util.List;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes4.dex */
public class fri extends qct<oo2> {

    /* JADX INFO: renamed from: i */
    public final kf2 f100427i;

    /* JADX INFO: renamed from: j */
    public x20 f100428j;

    public fri(dum dumVar, kf2 kf2Var) {
        super(dumVar);
        this.f100428j = null;
        this.f100427i = kf2Var;
    }

    /* JADX INFO: renamed from: R3 */
    public final void m126935R3(BLiveData bLiveData) {
        BLiveFirstChargeCampaign bLiveFirstChargeCampaign;
        if (bLiveData == null || (bLiveFirstChargeCampaign = bLiveData.firstChargeCampaigns) == null) {
            return;
        }
        if (bLiveFirstChargeCampaign.isCoinRecharged || TEnum.equals(bLiveFirstChargeCampaign.firstChargeStatus, "completed") || bLiveFirstChargeCampaign.activityArray.size() != 3) {
            m126936S3();
        } else {
            m126943Z3(bLiveFirstChargeCampaign);
        }
    }

    /* JADX INFO: renamed from: S3 */
    public final void m126936S3() {
        this.f100427i.mo119794b4(false);
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m126938U3(BLiveFirstChargeActivity bLiveFirstChargeActivity, BLiveFirstChargeCampaign bLiveFirstChargeCampaign) {
        m126944a4(bLiveFirstChargeActivity.f45217id, bLiveFirstChargeCampaign.detailUrl, bLiveFirstChargeCampaign.detailInset);
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m126939V3(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            m126942Y3();
        }
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m126940W3(vxj0 vxj0Var) {
        m126936S3();
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m126941X3(LiveControlMessage liveControlMessage) {
        m126942Y3();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX INFO: renamed from: Y3 */
    public void m126942Y3() {
        duringCreated(m213810E2().m168561z1()).subscribe(dhw.m115826e(new y20() { // from class: l.cri
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f83329a.m126935R3((BLiveData) obj);
            }
        }, new y20() { // from class: l.dri
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f90392a.m126937T3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m126943Z3(final BLiveFirstChargeCampaign bLiveFirstChargeCampaign) {
        final BLiveFirstChargeActivity bLiveFirstChargeActivity;
        if (pzi0.m174454o() <= tzi0.m193666d(bLiveFirstChargeCampaign.firstEnterLiveRoomTime, 72)) {
            bLiveFirstChargeActivity = bLiveFirstChargeCampaign.activityArray.get(0);
        } else {
            long jM174454o = pzi0.m174454o();
            long jM193666d = tzi0.m193666d(bLiveFirstChargeCampaign.firstEnterLiveRoomTime, CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256);
            List<BLiveFirstChargeActivity> list = bLiveFirstChargeCampaign.activityArray;
            bLiveFirstChargeActivity = jM174454o <= jM193666d ? list.get(1) : list.get(2);
        }
        m126946c4(bLiveFirstChargeCampaign, bLiveFirstChargeActivity);
        this.f100427i.mo119794b4(true);
        this.f100428j = new x20() { // from class: l.eri
            @Override // p153l.x20
            public final void call() {
                this.f95474a.m126938U3(bLiveFirstChargeActivity, bLiveFirstChargeCampaign);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2] */
    /* JADX INFO: renamed from: a4 */
    public void m126944a4(String str, String str2, List<Double> list) {
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

    /* JADX INFO: renamed from: b4 */
    public void m126945b4() {
        m126942Y3();
        duringCreated(m213812H2().lifecycle()).subscribe(dhw.m115825d(new y20() { // from class: l.yqi
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f201216a.m126939V3((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c4 */
    public final void m126946c4(BLiveFirstChargeCampaign bLiveFirstChargeCampaign, BLiveFirstChargeActivity bLiveFirstChargeActivity) {
        if (pzi0.m174454o() < tzi0.m193666d(bLiveFirstChargeCampaign.firstEnterLiveRoomTime, 24) || pzi0.m174454o() > tzi0.m193666d(bLiveFirstChargeCampaign.firstEnterLiveRoomTime, 72) || ((civ) zrv.m221194l(htd0.f111524f)).m109965i() || bLiveFirstChargeCampaign.isCoinRecharged) {
            return;
        }
        m126944a4(bLiveFirstChargeActivity.f45217id, bLiveFirstChargeCampaign.detailUrl, bLiveFirstChargeCampaign.detailInset);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [l.oo2] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().BottomEvent.hideFirstRecharge().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.zqi
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f205615a.m126940W3((vxj0) obj);
            }
        }));
        duringCreated(m213810E2().m168539n1()).filter(new qcj() { // from class: l.ari
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((LiveControlMessage) obj).type, "complete_first_recharge"));
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.bri
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f78026a.m126941X3((LiveControlMessage) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ void m126937T3(Throwable th) {
    }
}
