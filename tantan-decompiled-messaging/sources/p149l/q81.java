package p149l;

import com.p046p1.mobile.longlink.msg.liveroom.LongLinkVoiceAuctionMessage;
import com.p046p1.mobile.putong.live.base.data.BLiveAuctionCounter;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceAuction;
import com.p046p1.mobile.putong.live.livingroom.voice.call.auction.view.LiveVoiceCallAuctionToolbarView;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.CommonH5Builder;
import com.tantanapp.common.utils.NullChecker;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes5.dex */
public class q81 extends h4t<nnn0, LiveVoiceCallAuctionToolbarView> {

    /* JADX INFO: renamed from: i */
    public C22392a<BLiveVoiceAuction> f153110i;

    /* JADX INFO: renamed from: j */
    public LongLinkVoiceAuctionMessage.VoiceLiveAuctionCounter f153111j;

    public q81(bsm<? extends nnn0> bsmVar, LiveVoiceCallAuctionToolbarView liveVoiceCallAuctionToolbarView, C22392a<BLiveVoiceAuction> c22392a) {
        super(bsmVar);
        this.f153110i = c22392a;
        mo51532C(liveVoiceCallAuctionToolbarView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T3 */
    public /* synthetic */ Boolean m173324T3(bik0.C15867a c15867a) {
        return Boolean.valueOf(e0o0.m114322h(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U3 */
    public /* synthetic */ void m173325U3(Boolean bool) {
        if (this.f153110i.m221519i()) {
            ((LiveVoiceCallAuctionToolbarView) this.viewModel).m77882l(bool.booleanValue(), this.f153110i.m221515e());
        }
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ Boolean m173326R3(BLiveAuctionCounter bLiveAuctionCounter) {
        return Boolean.valueOf(NullChecker.m81303a(bLiveAuctionCounter) && bLiveAuctionCounter.applyUnreadCount > 0 && e0o0.m114322h(this));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(p61.m167540b0(((nnn0) this.f188512e.f77102h).m149818o())).filter(new w9j() { // from class: l.j81
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f116673a.m173326R3((BLiveAuctionCounter) obj);
            }
        }).map(new w9j() { // from class: l.k81
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LongLinkVoiceAuctionMessage.VoiceLiveAuctionCounter.newBuilder().setCurrentTime(mqi0.m155944o() / 1000).setUpdateType(LongLinkVoiceAuctionMessage.VoiceLiveAuctionCounter.Type.updateApplyUnreadCount).setApplyUnreadCount(((BLiveAuctionCounter) obj).applyUnreadCount).build();
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.l81
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f126780a.m173327S3((LongLinkVoiceAuctionMessage.VoiceLiveAuctionCounter) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m173328V3(BLiveVoiceAuction bLiveVoiceAuction) {
        ((LiveVoiceCallAuctionToolbarView) this.viewModel).m77882l(e0o0.m114322h(this), bLiveVoiceAuction);
    }

    /* JADX INFO: renamed from: X3 */
    public void m173330X3() {
        m206028F2().OpenH5Event.open().mo172463j(jp50.m142568c(7013).m142598B(ddv.f85636H).m142599p(CommonH5Builder.BgType.TRAN_GRAY_BG).m142602s(t100.f167261j).m142609z(1.0d, 0.7d).m142603t(80).m142600q());
    }

    /* JADX INFO: renamed from: Y3, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void m173329W3(LongLinkVoiceAuctionMessage.VoiceLiveAuctionCounter voiceLiveAuctionCounter) {
        if (!NullChecker.m81303a(this.f153111j) || this.f153111j.getCurrentTime() <= voiceLiveAuctionCounter.getCurrentTime()) {
            long applyUnreadCount = NullChecker.m81303a(this.f153111j) ? this.f153111j.getApplyUnreadCount() : 0L;
            long applyUnreadCount2 = voiceLiveAuctionCounter.getApplyUnreadCount();
            if (applyUnreadCount == 0 && applyUnreadCount2 > 0) {
                pul0.m171452j(this);
            }
            this.f153111j = voiceLiveAuctionCounter;
            ((LiveVoiceCallAuctionToolbarView) this.viewModel).m77885p(voiceLiveAuctionCounter.getApplyUnreadCount());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(((nnn0) m206027E2()).m160251Q2()).map(new w9j() { // from class: l.m81
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f132505a.m173324T3((bik0.C15867a) obj);
            }
        }).distinctUntilChanged().subscribe(ffw.m121193d(new e30() { // from class: l.n81
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f137571a.m173325U3((Boolean) obj);
            }
        }));
        duringCreated(this.f153110i).observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.o81
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f142592a.m173328V3((BLiveVoiceAuction) obj);
            }
        }));
        duringCreated(((nnn0) m206027E2()).f108769z.m181789r().m189049H0()).subscribe(ffw.m121197h(new e30() { // from class: l.p81
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f147559a.m173329W3((LongLinkVoiceAuctionMessage.VoiceLiveAuctionCounter) obj);
            }
        }));
    }
}
