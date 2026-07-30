package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveCampaign;
import com.p046p1.mobile.putong.live.base.data.BLiveData;
import com.p046p1.mobile.putong.live.base.data.BLiveFirstChargeActivity;
import com.p046p1.mobile.putong.live.base.data.BLiveFirstChargeCampaign;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import java.util.List;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes4.dex */
public class joi extends pat<ho2> {

    /* JADX INFO: renamed from: i */
    public final df2 f118981i;

    /* JADX INFO: renamed from: j */
    public d30 f118982j;

    public joi(bsm bsmVar, df2 df2Var) {
        super(bsmVar);
        this.f118982j = null;
        this.f118981i = df2Var;
    }

    /* JADX INFO: renamed from: R3 */
    public final void m142501R3(BLiveData bLiveData) {
        BLiveFirstChargeCampaign bLiveFirstChargeCampaign;
        if (bLiveData == null || (bLiveFirstChargeCampaign = bLiveData.firstChargeCampaigns) == null) {
            return;
        }
        if (bLiveFirstChargeCampaign.isCoinRecharged || TEnum.equals(bLiveFirstChargeCampaign.firstChargeStatus, "completed") || bLiveFirstChargeCampaign.activityArray.size() != 3) {
            m142502S3();
        } else {
            m142509Z3(bLiveFirstChargeCampaign);
        }
    }

    /* JADX INFO: renamed from: S3 */
    public final void m142502S3() {
        this.f118981i.mo111419b4(false);
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m142504U3(BLiveFirstChargeActivity bLiveFirstChargeActivity, BLiveFirstChargeCampaign bLiveFirstChargeCampaign) {
        m142510a4(bLiveFirstChargeActivity.f44369id, bLiveFirstChargeCampaign.detailUrl, bLiveFirstChargeCampaign.detailInset);
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m142505V3(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            m142508Y3();
        }
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m142506W3(soj0 soj0Var) {
        m142502S3();
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m142507X3(LiveControlMessage liveControlMessage) {
        m142508Y3();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX INFO: renamed from: Y3 */
    public void m142508Y3() {
        duringCreated(m206027E2().m132177z1()).subscribe(ffw.m121194e(new e30() { // from class: l.goi
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f103676a.m142501R3((BLiveData) obj);
            }
        }, new e30() { // from class: l.hoi
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f108828a.m142503T3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z3 */
    public final void m142509Z3(final BLiveFirstChargeCampaign bLiveFirstChargeCampaign) {
        final BLiveFirstChargeActivity bLiveFirstChargeActivity;
        if (mqi0.m155944o() <= qqi0.m175936d(bLiveFirstChargeCampaign.firstEnterLiveRoomTime, 72)) {
            bLiveFirstChargeActivity = bLiveFirstChargeCampaign.activityArray.get(0);
        } else {
            long jM155944o = mqi0.m155944o();
            long jM175936d = qqi0.m175936d(bLiveFirstChargeCampaign.firstEnterLiveRoomTime, CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256);
            List<BLiveFirstChargeActivity> list = bLiveFirstChargeCampaign.activityArray;
            bLiveFirstChargeActivity = jM155944o <= jM175936d ? list.get(1) : list.get(2);
        }
        m142512c4(bLiveFirstChargeCampaign, bLiveFirstChargeActivity);
        this.f118981i.mo111419b4(true);
        this.f118982j = new d30() { // from class: l.ioi
            @Override // p149l.d30
            public final void call() {
                this.f114162a.m142504U3(bLiveFirstChargeActivity, bLiveFirstChargeCampaign);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX INFO: renamed from: a4 */
    public void m142510a4(String str, String str2, List<Double> list) {
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

    /* JADX INFO: renamed from: b4 */
    public void m142511b4() {
        m142508Y3();
        duringCreated(m206029H2().lifecycle()).subscribe(ffw.m121193d(new e30() { // from class: l.coi
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f81843a.m142505V3((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c4 */
    public final void m142512c4(BLiveFirstChargeCampaign bLiveFirstChargeCampaign, BLiveFirstChargeActivity bLiveFirstChargeActivity) {
        if (mqi0.m155944o() < qqi0.m175936d(bLiveFirstChargeCampaign.firstEnterLiveRoomTime, 24) || mqi0.m155944o() > qqi0.m175936d(bLiveFirstChargeCampaign.firstEnterLiveRoomTime, 72) || ((bgv) ypv.m215673l(fld0.f98151f)).m101729i() || bLiveFirstChargeCampaign.isCoinRecharged) {
            return;
        }
        m142510a4(bLiveFirstChargeActivity.f44369id, bLiveFirstChargeCampaign.detailUrl, bLiveFirstChargeCampaign.detailInset);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [l.ho2] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().BottomEvent.hideFirstRecharge().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.doi
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f87169a.m142506W3((soj0) obj);
            }
        }));
        duringCreated(m206027E2().m132153n1()).filter(new w9j() { // from class: l.eoi
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((LiveControlMessage) obj).type, "complete_first_recharge"));
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.foi
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f98560a.m142507X3((LiveControlMessage) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ void m142503T3(Throwable th) {
    }
}
