package p153l;

import com.p051p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage;
import com.p051p1.mobile.putong.live.base.data.BLiveAuctionCounter;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceAuction;
import com.p051p1.mobile.putong.live.livingroom.voice.call.auction.view.LiveVoiceCallAuctionToolbarView;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.CommonH5Builder;
import com.tantanapp.common.utils.NullChecker;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes5.dex */
public class x81 extends i6t<rwn0, LiveVoiceCallAuctionToolbarView> {

    /* JADX INFO: renamed from: i */
    public C22507a<BLiveVoiceAuction> f192775i;

    /* JADX INFO: renamed from: j */
    public LongLinkVoiceAuctionMessage.VoiceLiveAuctionCounter f192776j;

    public x81(dum<? extends rwn0> dumVar, LiveVoiceCallAuctionToolbarView liveVoiceCallAuctionToolbarView, C22507a<BLiveVoiceAuction> c22507a) {
        super(dumVar);
        this.f192775i = c22507a;
        mo52715C(liveVoiceCallAuctionToolbarView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T3 */
    public /* synthetic */ Boolean m209660T3(hrk0.C17564a c17564a) {
        return Boolean.valueOf(i9o0.m139137h(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U3 */
    public /* synthetic */ void m209661U3(Boolean bool) {
        if (this.f192775i.m222765i()) {
            ((LiveVoiceCallAuctionToolbarView) this.viewModel).m79065l(bool.booleanValue(), this.f192775i.m222761e());
        }
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ Boolean m209662R3(BLiveAuctionCounter bLiveAuctionCounter) {
        return Boolean.valueOf(NullChecker.m82486a(bLiveAuctionCounter) && bLiveAuctionCounter.applyUnreadCount > 0 && i9o0.m139137h(this));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(w61.m205039b0(((rwn0) this.f196918e.f90822h).m202194o())).filter(new qcj() { // from class: l.q81
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f156061a.m209662R3((BLiveAuctionCounter) obj);
            }
        }).map(new qcj() { // from class: l.r81
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LongLinkVoiceAuctionMessage.VoiceLiveAuctionCounter.newBuilder().setCurrentTime(pzi0.m174454o() / 1000).setUpdateType(LongLinkVoiceAuctionMessage.VoiceLiveAuctionCounter.Type.updateApplyUnreadCount).setApplyUnreadCount(((BLiveAuctionCounter) obj).applyUnreadCount).build();
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.s81
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f166736a.m209663S3((LongLinkVoiceAuctionMessage.VoiceLiveAuctionCounter) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m209664V3(BLiveVoiceAuction bLiveVoiceAuction) {
        ((LiveVoiceCallAuctionToolbarView) this.viewModel).m79065l(i9o0.m139137h(this), bLiveVoiceAuction);
    }

    /* JADX INFO: renamed from: X3 */
    public void m209666X3() {
        m213811F2().OpenH5Event.open().mo199273j(px50.m174112c(7013).m174141B(efv.f93829H).m174142p(CommonH5Builder.BgType.TRAN_GRAY_BG).m174145s(qa00.f156323j).m174152z(1.0d, 0.7d).m174146t(80).m174143q());
    }

    /* JADX INFO: renamed from: Y3, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void m209665W3(LongLinkVoiceAuctionMessage.VoiceLiveAuctionCounter voiceLiveAuctionCounter) {
        if (!NullChecker.m82486a(this.f192776j) || this.f192776j.getCurrentTime() <= voiceLiveAuctionCounter.getCurrentTime()) {
            long applyUnreadCount = NullChecker.m82486a(this.f192776j) ? this.f192776j.getApplyUnreadCount() : 0L;
            long applyUnreadCount2 = voiceLiveAuctionCounter.getApplyUnreadCount();
            if (applyUnreadCount == 0 && applyUnreadCount2 > 0) {
                t3m0.m189096j(this);
            }
            this.f192776j = voiceLiveAuctionCounter;
            ((LiveVoiceCallAuctionToolbarView) this.viewModel).m79068p(voiceLiveAuctionCounter.getApplyUnreadCount());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(((rwn0) m213810E2()).m183413Q2()).map(new qcj() { // from class: l.t81
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f172487a.m209660T3((hrk0.C17564a) obj);
            }
        }).distinctUntilChanged().subscribe(dhw.m115825d(new y20() { // from class: l.u81
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f177963a.m209661U3((Boolean) obj);
            }
        }));
        duringCreated(this.f192775i).observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.v81
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f182843a.m209664V3((BLiveVoiceAuction) obj);
            }
        }));
        duringCreated(((rwn0) m213810E2()).f148282z.m170284r().m98231H0()).subscribe(dhw.m115829h(new y20() { // from class: l.w81
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f187821a.m209665W3((LongLinkVoiceAuctionMessage.VoiceLiveAuctionCounter) obj);
            }
        }));
    }
}
