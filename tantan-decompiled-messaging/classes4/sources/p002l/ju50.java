package p002l;

import android.graphics.drawable.Drawable;
import com.p000p1.mobile.putong.live.livingroom.increment.operation.OperationWebView;
import com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;
import com.p1.mobile.putong.live.base.data.BLiveOperationItemPopUpDrawer;
import com.tantanapp.common.utils.NullChecker;
import l.bwr;
import l.c4g0;
import l.e30;
import l.ffw;
import l.fld0;
import l.ggv;
import l.jo0;
import l.l3m;
import l.mkd0;
import l.t100;
import l.u3g0;
import l.w9j;
import l.ypv;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ju50 extends wq50<ho2, OperationWebView> implements l3m {

    /* JADX INFO: renamed from: k */
    public String f14020k;

    /* JADX INFO: renamed from: l */
    public c4g0 f14021l;

    /* JADX INFO: renamed from: m */
    public wd4 f14022m;

    /* JADX INFO: renamed from: n */
    public BLiveOperationItemPopUpDrawer f14023n;

    public ju50(bsm bsmVar, OperationWebView operationWebView) {
        super(bsmVar);
        C(operationWebView);
    }

    @Override // p002l.wq50
    /* JADX INFO: renamed from: L3 */
    public int mo16241L3() {
        return t100.d(8.0f);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX INFO: renamed from: T */
    public void m16242T() {
        super.T();
        duringCreated(m25547E2().m14596q1().F()).filter(new w9j() { // from class: l.cu50
            public final Object call(Object obj) {
                LongLinkSocketMessage.OperationUpdateNotice operationUpdateNotice = (LongLinkSocketMessage.OperationUpdateNotice) obj;
                return Boolean.valueOf(NullChecker.a(operationUpdateNotice.getSubscription()) && operationUpdateNotice.getPosition().equals(LongLinkSocketMessage.OperationUpdateNotice.OperationUpdatePosition.H5Drawer));
            }
        }).map(new w9j() { // from class: l.du50
            public final Object call(Object obj) {
                LongLinkSocketMessage.OperationUpdateNotice operationUpdateNotice = (LongLinkSocketMessage.OperationUpdateNotice) obj;
                return LongLinkGiftMessage.LiveCampaignInfo.newBuilder().setData(operationUpdateNotice.getSubscription().getData()).setUpdateType(operationUpdateNotice.getSubscription().getUpdateType()).build();
            }
        }).subscribe(ffw.h(new e30() { // from class: l.eu50
            public final void call(Object obj) {
                this.f9966a.m16254m4((LongLinkGiftMessage.LiveCampaignInfo) obj);
            }
        }));
    }

    @Override // p002l.wq50
    /* JADX INFO: renamed from: T3 */
    public void mo16243T3(Drawable drawable) {
        ((OperationWebView) ((bwr) this).viewModel).m8699I0(drawable);
    }

    /* JADX INFO: renamed from: d4 */
    public void m16244d4() {
        m25548F2().OperationsEvent.showOperationsRoot().j(new ku50.C0652a(8100).m16807i(true).m16799a());
        mkd0.z(this.f14021l);
        ((OperationWebView) ((bwr) this).viewModel).m8698H0();
        m25548F2().OperationsEvent.refreshOperationMessage().j(new ku50.C0652a(8100).m16799a());
    }

    /* JADX INFO: renamed from: e4 */
    public String m16245e4() {
        return this.f14020k;
    }

    /* JADX INFO: renamed from: f4 */
    public final void m16246f4(String str, BLiveOperationItemPopUpDrawer bLiveOperationItemPopUpDrawer) {
        this.f14023n = bLiveOperationItemPopUpDrawer;
        ((ggv) ypv.l(fld0.c)).i = true;
        m25298S3(bLiveOperationItemPopUpDrawer.loading);
        ((OperationWebView) ((bwr) this).viewModel).m8700J0(str, bLiveOperationItemPopUpDrawer);
        m16251k4();
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ Boolean m16247g4(u3g0 u3g0Var) {
        return Boolean.valueOf(((OperationWebView) ((bwr) this).viewModel).m8708v0(u3g0Var));
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m16248h4(u3g0 u3g0Var) {
        this.f14022m = u3g0Var.c;
        u3g0Var.d.call(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m16249i4(ku50 ku50Var) {
        m16246f4(ku50Var.m16791f(), ku50Var.m16792g());
    }

    /* JADX INFO: renamed from: j4 */
    public void m16250j4(LongLinkGiftMessage.LiveCampaignInfo liveCampaignInfo) {
        wd4 wd4Var;
        if (!NullChecker.a(liveCampaignInfo) || (wd4Var = this.f14022m) == null) {
            return;
        }
        wd4Var.m24522a(liveCampaignInfo);
    }

    /* JADX INFO: renamed from: k4 */
    public void m16251k4() {
        mkd0.z(this.f14021l);
        this.f14021l = duringCreated((c) m25548F2().LiveBridgeImplEvent.subscribeCampaign().g()).filter(new w9j() { // from class: l.hu50
            public final Object call(Object obj) {
                return this.f12269a.m16247g4((u3g0) obj);
            }
        }).observeOn(jo0.a()).subscribe(ffw.d(new e30() { // from class: l.iu50
            public final void call(Object obj) {
                this.f13410a.m16248h4((u3g0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l4 */
    public void m16252l4(String str) {
        this.f14020k = str;
    }

    /* JADX INFO: renamed from: m1 */
    public void m16253m1() {
        ((OperationWebView) ((bwr) this).viewModel).m8702o0();
        this.f14022m = null;
    }

    /* JADX INFO: renamed from: m4 */
    public final void m16254m4(LongLinkGiftMessage.LiveCampaignInfo liveCampaignInfo) {
        m16250j4(liveCampaignInfo);
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        mkd0.z(this.f14021l);
        this.f14022m = null;
        ((OperationWebView) ((bwr) this).viewModel).m8698H0();
        this.f14020k = null;
    }

    /* JADX INFO: renamed from: t */
    public void m16255t() {
        super.t();
        duringCreated((c) m25548F2().OperationsEvent.openH5Drawer().g()).filter(new w9j() { // from class: l.fu50
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.a(((ku50) obj).m16792g()));
            }
        }).subscribe(ffw.d(new e30() { // from class: l.gu50
            public final void call(Object obj) {
                this.f11628a.m16249i4((ku50) obj);
            }
        }));
    }
}
