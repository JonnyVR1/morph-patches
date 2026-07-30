package p149l;

import android.text.TextUtils;
import android.view.View;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p046p1.mobile.putong.live.base.data.BLiveCampaign;
import com.p046p1.mobile.putong.live.base.data.BLiveData;
import com.p046p1.mobile.putong.live.base.data.BLiveFirstChargeActivity;
import com.p046p1.mobile.putong.live.base.data.BLiveFirstChargeCampaign;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p046p1.mobile.putong.live.livingroom.common.bottom.BottomItemView;
import java.util.List;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes4.dex */
public class xr3 extends mz0 {

    /* JADX INFO: renamed from: y */
    public boolean f194082y;

    /* JADX INFO: renamed from: z */
    public d30 f194083z;

    public xr3(bsm bsmVar, BLiveBottomButton bLiveBottomButton, int i, int i2, String str, String str2) {
        super(bsmVar, bLiveBottomButton, i, i2, str, 0, str2);
        this.f194082y = true;
        this.f194083z = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A4 */
    public /* synthetic */ void m210628A4(soj0 soj0Var) {
        m210640w4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B4 */
    public /* synthetic */ void m210629B4(LiveControlMessage liveControlMessage) {
        m210644C4();
    }

    /* JADX INFO: renamed from: D4 */
    private void m210630D4(final BLiveFirstChargeCampaign bLiveFirstChargeCampaign) {
        final BLiveFirstChargeActivity bLiveFirstChargeActivity;
        if (mqi0.m155944o() <= qqi0.m175936d(bLiveFirstChargeCampaign.firstEnterLiveRoomTime, 72)) {
            bLiveFirstChargeActivity = bLiveFirstChargeCampaign.activityArray.get(0);
        } else {
            long jM155944o = mqi0.m155944o();
            long jM175936d = qqi0.m175936d(bLiveFirstChargeCampaign.firstEnterLiveRoomTime, CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256);
            List<BLiveFirstChargeActivity> list = bLiveFirstChargeCampaign.activityArray;
            bLiveFirstChargeActivity = jM155944o <= jM175936d ? list.get(1) : list.get(2);
        }
        m210631F4(bLiveFirstChargeCampaign, bLiveFirstChargeActivity);
        mo111419b4(true);
        this.f194083z = new d30() { // from class: l.wr3
            @Override // p149l.d30
            public final void call() {
                this.f187756a.m210642y4(bLiveFirstChargeActivity, bLiveFirstChargeCampaign);
            }
        };
    }

    /* JADX INFO: renamed from: F4 */
    private void m210631F4(BLiveFirstChargeCampaign bLiveFirstChargeCampaign, BLiveFirstChargeActivity bLiveFirstChargeActivity) {
        if (mqi0.m155944o() < qqi0.m175936d(bLiveFirstChargeCampaign.firstEnterLiveRoomTime, 24) || mqi0.m155944o() > qqi0.m175936d(bLiveFirstChargeCampaign.firstEnterLiveRoomTime, 72) || ((bgv) ypv.m215673l(fld0.f98151f)).m101729i() || bLiveFirstChargeCampaign.isCoinRecharged) {
            return;
        }
        m210645E4(bLiveFirstChargeActivity.f44369id, bLiveFirstChargeCampaign.detailUrl, bLiveFirstChargeCampaign.detailInset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v4 */
    public void m210639v4(BLiveData bLiveData) {
        BLiveFirstChargeCampaign bLiveFirstChargeCampaign;
        if (bLiveData == null || (bLiveFirstChargeCampaign = bLiveData.firstChargeCampaigns) == null) {
            return;
        }
        if (bLiveFirstChargeCampaign.isCoinRecharged || TEnum.equals(bLiveFirstChargeCampaign.firstChargeStatus, "completed") || bLiveFirstChargeCampaign.activityArray.size() != 3) {
            m210640w4();
        } else {
            m210630D4(bLiveFirstChargeCampaign);
        }
    }

    /* JADX INFO: renamed from: w4 */
    private void m210640w4() {
        mo111419b4(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y4 */
    public /* synthetic */ void m210642y4(BLiveFirstChargeActivity bLiveFirstChargeActivity, BLiveFirstChargeCampaign bLiveFirstChargeCampaign) {
        m210645E4(bLiveFirstChargeActivity.f44369id, bLiveFirstChargeCampaign.detailUrl, bLiveFirstChargeCampaign.detailInset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z4 */
    public /* synthetic */ void m210643z4(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            m210644C4();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX INFO: renamed from: C4 */
    public void m210644C4() {
        duringCreated(m206027E2().m132177z1()).subscribe(ffw.m121194e(new e30() { // from class: l.ur3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f177804a.m210639v4((BLiveData) obj);
            }
        }, new e30() { // from class: l.vr3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f182698a.m210641x4((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX INFO: renamed from: E4 */
    public void m210645E4(String str, String str2, List<Double> list) {
        BLiveCampaign bLiveCampaign = new BLiveCampaign();
        User userM132146l0 = m206027E2().m132146l0();
        if (userM132146l0 == null) {
            return;
        }
        bLiveCampaign.detailUrl = str2 + "?giftPackageID=" + str + "&anchorId=" + userM132146l0.f56011id;
        bLiveCampaign.detailInset = list;
        bLiveCampaign.isNeedCloseBtn = false;
        m206028F2().OpenH5Event.open().mo172463j(jp50.m142568c(500).m142601r(bLiveCampaign).m142600q());
        ((bgv) ypv.m215673l(fld0.f98151f)).m101744x(true);
    }

    @Override // p149l.i80, p149l.df2
    /* JADX INFO: renamed from: V3 */
    public void mo103804V3(View view) {
        this.f194082y = false;
        V v2 = this.f85887k;
        if (v2 != 0) {
            ((BottomItemView) v2).mo72138g0(mo111422f4());
        }
        super.mo103804V3(view);
        m206028F2().BootBubbleEvent.dismissBubble().mo172463j("firstRechargeBubble");
        d30 d30Var = this.f194083z;
        if (d30Var != null) {
            d30Var.call();
        }
        mo111419b4(false);
    }

    @Override // p149l.df2
    /* JADX INFO: renamed from: X3 */
    public BLiveButtonType mo103807X3() {
        return BLiveButtonType.get("firstRechargeButton");
    }

    @Override // p149l.df2
    /* JADX INFO: renamed from: f4 */
    public boolean mo111422f4() {
        return this.f194082y && super.mo111422f4();
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [l.ho2] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m210644C4();
        duringCreated(m206029H2().lifecycle()).subscribe(ffw.m121193d(new e30() { // from class: l.qr3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f155962a.m210643z4((C4319c) obj);
            }
        }));
        duringCreated(m206028F2().BottomEvent.hideFirstRecharge().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.rr3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f160722a.m210628A4((soj0) obj);
            }
        }));
        duringCreated(m206027E2().m132153n1()).filter(new w9j() { // from class: l.sr3
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((LiveControlMessage) obj).type, "complete_first_recharge"));
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.tr3
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f171785a.m210629B4((LiveControlMessage) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x4 */
    public /* synthetic */ void m210641x4(Throwable th) {
    }
}
