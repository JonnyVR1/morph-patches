package p153l;

import android.graphics.drawable.Drawable;
import com.p051p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p051p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationItemPopUpDrawer;
import com.p051p1.mobile.putong.live.livingroom.increment.operation.OperationWebView;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class p260 extends cz50<oo2, OperationWebView> implements c6m {

    /* JADX INFO: renamed from: k */
    public String f150242k;

    /* JADX INFO: renamed from: l */
    public kcg0 f150243l;

    /* JADX INFO: renamed from: m */
    public ve4 f150244m;

    /* JADX INFO: renamed from: n */
    public BLiveOperationItemPopUpDrawer f150245n;

    public p260(dum dumVar, OperationWebView operationWebView) {
        super(dumVar);
        mo52715C(operationWebView);
    }

    @Override // p153l.cz50
    /* JADX INFO: renamed from: L3 */
    public int mo113259L3() {
        return qa00.m175859d(8.0f);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m213810E2().m168545q1().m98226F()).filter(new qcj() { // from class: l.i260
            @Override // p153l.qcj
            public final Object call(Object obj) {
                LongLinkSocketMessage.OperationUpdateNotice operationUpdateNotice = (LongLinkSocketMessage.OperationUpdateNotice) obj;
                return Boolean.valueOf(NullChecker.m82486a(operationUpdateNotice.getSubscription()) && operationUpdateNotice.getPosition().equals(LongLinkSocketMessage.OperationUpdateNotice.OperationUpdatePosition.H5Drawer));
            }
        }).map(new qcj() { // from class: l.j260
            @Override // p153l.qcj
            public final Object call(Object obj) {
                LongLinkSocketMessage.OperationUpdateNotice operationUpdateNotice = (LongLinkSocketMessage.OperationUpdateNotice) obj;
                return LongLinkGiftMessage.LiveCampaignInfo.newBuilder().setData(operationUpdateNotice.getSubscription().getData()).setUpdateType(operationUpdateNotice.getSubscription().getUpdateType()).build();
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.k260
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f123577a.m170342m4((LongLinkGiftMessage.LiveCampaignInfo) obj);
            }
        }));
    }

    @Override // p153l.cz50
    /* JADX INFO: renamed from: T3 */
    public void mo113266T3(Drawable drawable) {
        ((OperationWebView) this.viewModel).m76270I0(drawable);
    }

    /* JADX INFO: renamed from: d4 */
    public void m170333d4() {
        m213811F2().OperationsEvent.showOperationsRoot().mo199273j(new q260.C19505a(8100).m175010i(true).m175002a());
        psd0.m173633z(this.f150243l);
        ((OperationWebView) this.viewModel).m76269H0();
        m213811F2().OperationsEvent.refreshOperationMessage().mo199273j(new q260.C19505a(8100).m175002a());
    }

    /* JADX INFO: renamed from: e4 */
    public String m170334e4() {
        return this.f150242k;
    }

    /* JADX INFO: renamed from: f4 */
    public final void m170335f4(String str, BLiveOperationItemPopUpDrawer bLiveOperationItemPopUpDrawer) {
        this.f150245n = bLiveOperationItemPopUpDrawer;
        ((hiv) zrv.m221194l(htd0.f111521c)).f110078i = true;
        m113265S3(bLiveOperationItemPopUpDrawer.loading);
        ((OperationWebView) this.viewModel).m76271J0(str, bLiveOperationItemPopUpDrawer);
        m170340k4();
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ Boolean m170336g4(bcg0 bcg0Var) {
        return Boolean.valueOf(((OperationWebView) this.viewModel).m76279v0(bcg0Var));
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m170337h4(bcg0 bcg0Var) {
        this.f150244m = bcg0Var.f76144c;
        bcg0Var.f76145d.call(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m170338i4(q260 q260Var) {
        m170335f4(q260Var.m174994f(), q260Var.m174995g());
    }

    /* JADX INFO: renamed from: j4 */
    public void m170339j4(LongLinkGiftMessage.LiveCampaignInfo liveCampaignInfo) {
        ve4 ve4Var;
        if (!NullChecker.m82486a(liveCampaignInfo) || (ve4Var = this.f150244m) == null) {
            return;
        }
        ve4Var.mo152372a(liveCampaignInfo);
    }

    /* JADX INFO: renamed from: k4 */
    public void m170340k4() {
        psd0.m173633z(this.f150243l);
        this.f150243l = duringCreated(m213811F2().LiveBridgeImplEvent.subscribeCampaign().m199270g()).filter(new qcj() { // from class: l.n260
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f139816a.m170336g4((bcg0) obj);
            }
        }).observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.o260
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f144723a.m170337h4((bcg0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l4 */
    public void m170341l4(String str) {
        this.f150242k = str;
    }

    @Override // p153l.c6m
    /* JADX INFO: renamed from: m1 */
    public void mo108170m1() {
        ((OperationWebView) this.viewModel).m76273o0();
        this.f150244m = null;
    }

    /* JADX INFO: renamed from: m4 */
    public final void m170342m4(LongLinkGiftMessage.LiveCampaignInfo liveCampaignInfo) {
        m170339j4(liveCampaignInfo);
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        psd0.m173633z(this.f150243l);
        this.f150244m = null;
        ((OperationWebView) this.viewModel).m76269H0();
        this.f150242k = null;
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().OperationsEvent.openH5Drawer().m199270g()).filter(new qcj() { // from class: l.l260
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a(((q260) obj).m174995g()));
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.m260
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134501a.m170338i4((q260) obj);
            }
        }));
    }
}
