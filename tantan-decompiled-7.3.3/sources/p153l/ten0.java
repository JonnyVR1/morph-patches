package p153l;

import com.p051p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.base.data.BLiveVoicePkInfo;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.p051p1.mobile.putong.live.livingroom.voice.fans.VoiceFansView;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p153l.rwn0;

/* JADX INFO: loaded from: classes5.dex */
public class ten0<T extends rwn0> extends i6t<T, VoiceFansView> {

    /* JADX INFO: renamed from: i */
    public String f173884i;

    /* JADX INFO: renamed from: j */
    public hen0 f173885j;

    /* JADX INFO: renamed from: k */
    public long f173886k;

    public ten0(dum<T> dumVar, VoiceFansView voiceFansView) {
        super(dumVar);
        this.f173884i = "";
        this.f173885j = null;
        this.f173886k = 0L;
        mo52715C(voiceFansView);
    }

    /* JADX INFO: renamed from: J3 */
    public static /* synthetic */ void m190844J3(Throwable th) {
    }

    /* JADX INFO: renamed from: L3 */
    public static /* synthetic */ void m190846L3(Throwable th) {
    }

    /* JADX INFO: renamed from: P3 */
    public static /* synthetic */ void m190850P3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V3 */
    public void m190854V3(LongLinkLiveMessage.VoiceMemberUpdate voiceMemberUpdate) {
        if (LongLinkLiveMessage.VoiceMemberUpdate.UpdateType.Count.equals(voiceMemberUpdate.getType())) {
            ((VoiceFansView) this.viewModel).m79251j(voiceMemberUpdate.getTotal());
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
    }

    /* JADX INFO: renamed from: U3 */
    public void m190855U3() {
        this.f173884i = "";
        this.f173885j = null;
        ((VoiceFansView) this.viewModel).m79249e();
        this.f173886k = 0L;
        ((VoiceFansView) this.viewModel).m79250i(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ Boolean m190856W3(LongLinkGiftMessage.LiveRankings liveRankings) {
        return Boolean.valueOf(liveRankings.getRoomId().equals(((rwn0) m213810E2()).m202194o()) && LongLinkGiftMessage.LiveRankingType.live.equals(liveRankings.getType()) && liveRankings.getRankingTime() >= this.f173886k);
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m190857X3(LongLinkGiftMessage.LiveRankings liveRankings) {
        this.f173886k = liveRankings.getRankingTime();
        this.f173885j = new hen0(liveRankings);
        m190862c4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m190858Y3(hrk0.C17564a c17564a) {
        ((VoiceFansView) this.viewModel).m79251j(((rwn0) m213810E2()).m183411P2().m136879r().m97114J());
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m190859Z3(rsn0 rsn0Var) {
        ((VoiceFansView) this.viewModel).setFansDataByLeaderBoardData(rsn0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ void m190860a4(BLiveAbsData bLiveAbsData, Long l2) {
        ((rwn0) m213810E2()).m168472Q1(((rwn0) m213810E2()).m202191k(), bLiveAbsData.room.f45267id);
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m190861b4(BLiveVoicePkInfo bLiveVoicePkInfo) {
        ((VoiceFansView) this.viewModel).setFansViewVisible(bLiveVoicePkInfo == null || !bLiveVoicePkInfo.enable);
    }

    /* JADX INFO: renamed from: c4 */
    public void m190862c4() {
        hen0 hen0Var = this.f173885j;
        if (hen0Var == null) {
            return;
        }
        if (!jyb.m147479J(hen0Var.m134668b())) {
            nsv<cen0> nsvVar = this.f173885j.m134668b().get(0);
            fhw.m125605a("FansBoardTAG-FansPresenter-notifyViewModel,first=", nsvVar.f143542a.toString() + ",breakingLeaderBoardUserId=" + this.f173884i);
            if (!nsvVar.f143542a.f81391a.equals(this.f173884i)) {
                this.f173884i = "";
            }
        }
        this.f173885j.m134669c(this.f173884i);
        ((VoiceFansView) this.viewModel).setFansData(this.f173885j);
    }

    /* JADX INFO: renamed from: d4 */
    public void m190863d4(int i) {
        m213811F2().MemberEvent.show().mo199273j(Integer.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e4 */
    public void m190864e4(String str) {
        if (m213815L2() || !((rwn0) m213810E2()).m202193m().m146882h()) {
            m213811F2().OpenUserCardDialogEvent.show().mo199273j(UserCardData.builder(1400).userId(str).setFromIdentity(csq.m112228b(this, ((rwn0) m213810E2()).m168532l0().f56859id, str, 1400)).setTo(csq.m112231e(this, ((rwn0) m213810E2()).m168532l0().f56859id, str, 1400)).setScene("live").setSource("liveLeaderboard").trackFrom("liveOnlineUser").build());
        }
    }

    public void init() {
        ((VoiceFansView) this.viewModel).m79250i(true);
        final BLiveVoice bLiveVoiceM183420V2 = ((rwn0) m213810E2()).mo183435j();
        ((rwn0) m213810E2()).m168472Q1(((rwn0) m213810E2()).m202191k(), bLiveVoiceM183420V2.room.f45267id);
        duringCreated((C22421c<T>) ((rwn0) m213810E2()).m168545q1().m98253S0()).filter(new qcj() { // from class: l.ken0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f126203a.m190856W3((LongLinkGiftMessage.LiveRankings) obj);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.len0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f131768a.m190857X3((LongLinkGiftMessage.LiveRankings) obj);
            }
        }, new y20() { // from class: l.men0
            @Override // p153l.y20
            public final void call(Object obj) {
                ten0.m190850P3((Throwable) obj);
            }
        }));
        ((VoiceFansView) this.viewModel).m79251j(((rwn0) m213810E2()).m183411P2().m136879r().m97114J());
        C22421c<T> c22421cDuringCreated = duringCreated((C22421c<T>) ((rwn0) m213810E2()).m183413Q2());
        TimeUnit timeUnit = TimeUnit.SECONDS;
        c22421cDuringCreated.throttleFirst(1L, timeUnit).subscribe(dhw.m115825d(new y20() { // from class: l.nen0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f141671a.m190858Y3((hrk0.C17564a) obj);
            }
        }));
        duringCreated((C22421c<T>) ((rwn0) m213810E2()).m168467N0()).subscribe(dhw.m115826e(new y20() { // from class: l.oen0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f147006a.m190859Z3((rsn0) obj);
            }
        }, new y20() { // from class: l.pen0
            @Override // p153l.y20
            public final void call(Object obj) {
                ten0.m190846L3((Throwable) obj);
            }
        }));
        duringCreated((C22421c<T>) ((rwn0) m213810E2()).m168545q1().m98276c1()).throttleFirst(2L, timeUnit).subscribe(dhw.m115829h(new y20() { // from class: l.qen0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f157196a.m190854V3((LongLinkLiveMessage.VoiceMemberUpdate) obj);
            }
        }));
        boolean zM203469M6 = zrv.m221193k().m203469M6();
        int iM203588b6 = zrv.m221193k().m203588b6();
        if (zM203469M6) {
            m138858H3(((rwn0) m213810E2()).m168521h2(iM203588b6, timeUnit)).subscribe(dhw.m115826e(new y20() { // from class: l.ren0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f162661a.m190860a4(bLiveVoiceM183420V2, (Long) obj);
                }
            }, new y20() { // from class: l.sen0
                @Override // p153l.y20
                public final void call(Object obj) {
                    ten0.m190844J3((Throwable) obj);
                }
            }));
        }
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        m190855U3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void reset() {
        this.f173884i = "";
        this.f173885j = null;
        ((VoiceFansView) this.viewModel).m79249e();
        this.f173886k = 0L;
        ((VoiceFansView) this.viewModel).m79250i(true);
        ((VoiceFansView) this.viewModel).m79251j(((rwn0) m213810E2()).mo183435j().memberCount);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        init();
        m138863h3(m213811F2().VoicePkEvent.onVoicePkChange(), new y20() { // from class: l.jen0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f120514a.m190861b4((BLiveVoicePkInfo) obj);
            }
        });
    }
}
