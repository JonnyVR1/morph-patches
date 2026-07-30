package p149l;

import android.graphics.drawable.Drawable;
import com.p046p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p046p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationItemPopUpDrawer;
import com.p046p1.mobile.putong.live.livingroom.increment.operation.OperationWebView;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class ju50 extends wq50<ho2, OperationWebView> implements l3m {

    /* JADX INFO: renamed from: k */
    public String f119738k;

    /* JADX INFO: renamed from: l */
    public c4g0 f119739l;

    /* JADX INFO: renamed from: m */
    public wd4 f119740m;

    /* JADX INFO: renamed from: n */
    public BLiveOperationItemPopUpDrawer f119741n;

    public ju50(bsm bsmVar, OperationWebView operationWebView) {
        super(bsmVar);
        mo51532C(operationWebView);
    }

    @Override // p149l.wq50
    /* JADX INFO: renamed from: L3 */
    public int mo143249L3() {
        return t100.m186890d(8.0f);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m206027E2().m132160q1().m189044F()).filter(new w9j() { // from class: l.cu50
            @Override // p149l.w9j
            public final Object call(Object obj) {
                LongLinkSocketMessage.OperationUpdateNotice operationUpdateNotice = (LongLinkSocketMessage.OperationUpdateNotice) obj;
                return Boolean.valueOf(NullChecker.m81303a(operationUpdateNotice.getSubscription()) && operationUpdateNotice.getPosition().equals(LongLinkSocketMessage.OperationUpdateNotice.OperationUpdatePosition.H5Drawer));
            }
        }).map(new w9j() { // from class: l.du50
            @Override // p149l.w9j
            public final Object call(Object obj) {
                LongLinkSocketMessage.OperationUpdateNotice operationUpdateNotice = (LongLinkSocketMessage.OperationUpdateNotice) obj;
                return LongLinkGiftMessage.LiveCampaignInfo.newBuilder().setData(operationUpdateNotice.getSubscription().getData()).setUpdateType(operationUpdateNotice.getSubscription().getUpdateType()).build();
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.eu50
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f93217a.m143260m4((LongLinkGiftMessage.LiveCampaignInfo) obj);
            }
        }));
    }

    @Override // p149l.wq50
    /* JADX INFO: renamed from: T3 */
    public void mo143250T3(Drawable drawable) {
        ((OperationWebView) this.viewModel).m75087I0(drawable);
    }

    /* JADX INFO: renamed from: d4 */
    public void m143251d4() {
        m206028F2().OperationsEvent.showOperationsRoot().mo172463j(new ku50.C18083a(8100).m147264i(true).m147256a());
        mkd0.m154992z(this.f119739l);
        ((OperationWebView) this.viewModel).m75086H0();
        m206028F2().OperationsEvent.refreshOperationMessage().mo172463j(new ku50.C18083a(8100).m147256a());
    }

    /* JADX INFO: renamed from: e4 */
    public String m143252e4() {
        return this.f119738k;
    }

    /* JADX INFO: renamed from: f4 */
    public final void m143253f4(String str, BLiveOperationItemPopUpDrawer bLiveOperationItemPopUpDrawer) {
        this.f119741n = bLiveOperationItemPopUpDrawer;
        ((ggv) ypv.m215673l(fld0.f98148c)).f102548i = true;
        m205023S3(bLiveOperationItemPopUpDrawer.loading);
        ((OperationWebView) this.viewModel).m75088J0(str, bLiveOperationItemPopUpDrawer);
        m143258k4();
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ Boolean m143254g4(u3g0 u3g0Var) {
        return Boolean.valueOf(((OperationWebView) this.viewModel).m75096v0(u3g0Var));
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m143255h4(u3g0 u3g0Var) {
        this.f119740m = u3g0Var.f173611c;
        u3g0Var.f173612d.call(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m143256i4(ku50 ku50Var) {
        m143253f4(ku50Var.m147248f(), ku50Var.m147249g());
    }

    /* JADX INFO: renamed from: j4 */
    public void m143257j4(LongLinkGiftMessage.LiveCampaignInfo liveCampaignInfo) {
        wd4 wd4Var;
        if (!NullChecker.m81303a(liveCampaignInfo) || (wd4Var = this.f119740m) == null) {
            return;
        }
        wd4Var.mo147900a(liveCampaignInfo);
    }

    /* JADX INFO: renamed from: k4 */
    public void m143258k4() {
        mkd0.m154992z(this.f119739l);
        this.f119739l = duringCreated(m206028F2().LiveBridgeImplEvent.subscribeCampaign().m172460g()).filter(new w9j() { // from class: l.hu50
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f109517a.m143254g4((u3g0) obj);
            }
        }).observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.iu50
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f114974a.m143255h4((u3g0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l4 */
    public void m143259l4(String str) {
        this.f119738k = str;
    }

    @Override // p149l.l3m
    /* JADX INFO: renamed from: m1 */
    public void mo105734m1() {
        ((OperationWebView) this.viewModel).m75090o0();
        this.f119740m = null;
    }

    /* JADX INFO: renamed from: m4 */
    public final void m143260m4(LongLinkGiftMessage.LiveCampaignInfo liveCampaignInfo) {
        m143257j4(liveCampaignInfo);
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        mkd0.m154992z(this.f119739l);
        this.f119740m = null;
        ((OperationWebView) this.viewModel).m75086H0();
        this.f119738k = null;
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().OperationsEvent.openH5Drawer().m172460g()).filter(new w9j() { // from class: l.fu50
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a(((ku50) obj).m147249g()));
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.gu50
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f104378a.m143256i4((ku50) obj);
            }
        }));
    }
}
