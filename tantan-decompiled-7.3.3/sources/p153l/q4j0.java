package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p051p1.mobile.longlink.msg.live.leaderboard.LongLinkLiveLeadBoardMsg;
import com.p051p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;
import com.p051p1.mobile.longlink.msg.livegift.LongLinkConfession;
import com.p051p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk;
import com.p051p1.mobile.longlink.msg.voicelivemessage.VoiceLiveTopBroadCast;
import com.p051p1.mobile.putong.live.base.data.BLiveUserUpgrade;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.TopEffectLayer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;
import p137rx.C22421c;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public class q4j0<V extends oo2> extends i6t<V, TopEffectLayer> {

    /* JADX INFO: renamed from: i */
    public Deque<s4j0> f155599i;

    /* JADX INFO: renamed from: j */
    public Deque<rdh0> f155600j;

    public q4j0(dum dumVar, TopEffectLayer topEffectLayer) {
        super(dumVar);
        this.f155599i = new ArrayDeque();
        this.f155600j = new ArrayDeque();
        mo52715C(topEffectLayer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X3 */
    public /* synthetic */ void m175230X3(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            m175232U3();
            return;
        }
        if (c4470c == (m213815L2() ? C4470c.f16269k : C4470c.f16268j)) {
            m175233V3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public void m175231a4(rdh0 rdh0Var) {
        this.f155600j.add(rdh0Var);
        m175248m4();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r0v12, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r0v16, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r0v26, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r0v30, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r0v34, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r0v5, types: [l.oo2] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m213810E2().m168545q1().m98307n()).subscribe(dhw.m115825d(new y20() { // from class: l.k4j0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f123893a.m175237b4((LongLinkGiftMessage.LiveRanking) obj);
            }
        }));
        lifecycle().subscribe(dhw.m115825d(new y20() { // from class: l.m4j0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134806a.m175230X3((C4470c) obj);
            }
        }));
        duringCreated(m213810E2().m168545q1().m98238L()).subscribe(dhw.m115825d(new y20() { // from class: l.n4j0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f140236a.m175235Y3((BLiveUserUpgrade) obj);
            }
        }));
        m138863h3(m213811F2().MultiPkEventGroup.multiPkOnPlayEffect(), new y20() { // from class: l.o4j0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f144984a.m175240e4((LongLinkLiveMultiPk.MultiPkAnimation) obj);
            }
        });
        duringCreated(m213810E2().m168545q1().m98295j()).subscribe(dhw.m115825d(new y20() { // from class: l.p4j0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f150541a.m175239d4((LongLinkLiveLeadBoardMsg.LeaderboardEffectInfo) obj);
            }
        }));
        duringCreated(m213810E2().m168545q1().f71773v1).subscribe(dhw.m115825d(new y20() { // from class: l.b4j0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f74933a.m175241f4((LongLinkLiveUserLevel.RoomTopEffect) obj);
            }
        }));
        v3f.C20736d<rdh0, C22421c<rdh0>> c20736dShowAuctionAnim = m213811F2().VoiceAuctionEvent.showAuctionAnim();
        final TopEffectLayer topEffectLayer = (TopEffectLayer) this.viewModel;
        Objects.requireNonNull(topEffectLayer);
        m138863h3(c20736dShowAuctionAnim, new y20() { // from class: l.c4j0
            @Override // p153l.y20
            public final void call(Object obj) {
                topEffectLayer.m75279z0((rdh0) obj);
            }
        });
        v3f.C20736d<ivf0, C22421c<ivf0>> c20736dShowSpecialAuctionAnim = m213811F2().VoiceAuctionEvent.showSpecialAuctionAnim();
        final TopEffectLayer topEffectLayer2 = (TopEffectLayer) this.viewModel;
        Objects.requireNonNull(topEffectLayer2);
        m138863h3(c20736dShowSpecialAuctionAnim, new y20() { // from class: l.d4j0
            @Override // p153l.y20
            public final void call(Object obj) {
                topEffectLayer2.m75277w0((ivf0) obj);
            }
        });
        duringCreated(m213810E2().m168545q1().m98257U0()).subscribe(dhw.m115829h(new y20() { // from class: l.e4j0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f92101a.m175231a4((rdh0) obj);
            }
        }));
        duringCreated(m213810E2().m168545q1().m98228G()).subscribe(dhw.m115829h(new y20() { // from class: l.f4j0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f97100a.m175242g4((rdh0) obj);
            }
        }));
        duringCreated(m213810E2().m168545q1().f71646K1).subscribe(dhw.m115825d(new y20() { // from class: l.l4j0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f129985a.m175236Z3((LongLinkConfession.GiftWallGradeFiveNotice) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U3 */
    public final void m175232U3() {
        m175249n4();
        m175248m4();
    }

    /* JADX INFO: renamed from: V3 */
    public final void m175233V3() {
        this.f155599i.clear();
        this.f155600j.clear();
    }

    /* JADX INFO: renamed from: W3 */
    public final boolean m175234W3() {
        return ((TopEffectLayer) this.viewModel).m75268n0() || ((TopEffectLayer) this.viewModel).m75265k0() || ((TopEffectLayer) this.viewModel).m75267m0();
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m175235Y3(BLiveUserUpgrade bLiveUserUpgrade) {
        if (bLiveUserUpgrade.uid.equals(zrv.f205799a.m207631D0())) {
            wrv wrvVar = zrv.f205799a;
            wrvVar.m207667f0(wrvVar.m207631D0());
        }
        bLiveUserUpgrade.liveUserLevel = ((hiv) zrv.m221194l(htd0.f111521c)).m135170v(bLiveUserUpgrade.grade);
        m175244i4(bLiveUserUpgrade);
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m175236Z3(LongLinkConfession.GiftWallGradeFiveNotice giftWallGradeFiveNotice) {
        ((TopEffectLayer) this.viewModel).m75275u0(giftWallGradeFiveNotice);
    }

    /* JADX INFO: renamed from: b4 */
    public void m175237b4(LongLinkGiftMessage.LiveRanking liveRanking) {
        this.f155599i.add(new u4j0(liveRanking));
        m175249n4();
    }

    /* JADX INFO: renamed from: c4 */
    public final void m175238c4(z3j0 z3j0Var) {
        this.f155599i.add(new y3j0(z3j0Var));
        m175249n4();
    }

    /* JADX INFO: renamed from: d4 */
    public void m175239d4(LongLinkLiveLeadBoardMsg.LeaderboardEffectInfo leaderboardEffectInfo) {
        this.f155599i.add(new d5j0(leaderboardEffectInfo));
        m175249n4();
    }

    /* JADX INFO: renamed from: e4 */
    public final void m175240e4(LongLinkLiveMultiPk.MultiPkAnimation multiPkAnimation) {
        if (TextUtils.isEmpty(multiPkAnimation.getAnimationUrl())) {
            return;
        }
        ((TopEffectLayer) this.viewModel).m75276v0(multiPkAnimation.getAnimationUrl());
    }

    /* JADX INFO: renamed from: f4 */
    public void m175241f4(LongLinkLiveUserLevel.RoomTopEffect roomTopEffect) {
        this.f155599i.add(new cmd0(roomTopEffect));
        m175249n4();
    }

    /* JADX INFO: renamed from: g4 */
    public void m175242g4(rdh0 rdh0Var) {
        this.f155599i.add(new emd0(rdh0Var));
        m175249n4();
    }

    /* JADX INFO: renamed from: h4 */
    public final void m175243h4(LongLinkSocketMessage.TopEffect topEffect) {
        this.f155599i.add(new x3j0(topEffect));
        m175249n4();
    }

    /* JADX INFO: renamed from: i4 */
    public final void m175244i4(BLiveUserUpgrade bLiveUserUpgrade) {
        this.f155599i.add(new z6j0(bLiveUserUpgrade));
        m175249n4();
    }

    /* JADX INFO: renamed from: j4 */
    public final void m175245j4(VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessage voiceLiveHourLeaderboardTopEffectMessage) {
        this.f155599i.add(new l5o0(voiceLiveHourLeaderboardTopEffectMessage));
        m175249n4();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m175246k4(LongLinkLiveMessage.VoiceLiveTopEffectMessage voiceLiveTopEffectMessage) {
        ((TopEffectLayer) this.viewModel).m75261E0(voiceLiveTopEffectMessage);
    }

    /* JADX INFO: renamed from: l4 */
    public void m175247l4(String str) {
        m213811F2().SchemeHandleEvent.handleScheme().mo199273j(new bae0.C15953a(200).m103154e(str).m103152c());
    }

    /* JADX INFO: renamed from: m4 */
    public void m175248m4() {
        rdh0 rdh0VarPoll;
        if (((TopEffectLayer) this.viewModel).m75266l0() || (rdh0VarPoll = this.f155600j.poll()) == null) {
            return;
        }
        ((TopEffectLayer) this.viewModel).m75269o0(rdh0VarPoll);
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
    }

    /* JADX INFO: renamed from: n4 */
    public final void m175249n4() {
        s4j0 s4j0VarPoll;
        if (m175234W3() || (s4j0VarPoll = this.f155599i.poll()) == null) {
            return;
        }
        switch (s4j0VarPoll.mo96371b()) {
            case 0:
                ((TopEffectLayer) this.viewModel).m75278y0((LongLinkSocketMessage.TopEffect) s4j0VarPoll.mo96370a(), new x20() { // from class: l.g4j0
                    @Override // p153l.x20
                    public final void call() {
                        this.f102182a.m175249n4();
                    }
                });
                break;
            case 1:
                ((TopEffectLayer) this.viewModel).m75270p0((LongLinkGiftMessage.LiveRanking) s4j0VarPoll.mo96370a(), new x20() { // from class: l.g4j0
                    @Override // p153l.x20
                    public final void call() {
                        this.f102182a.m175249n4();
                    }
                });
                break;
            case 2:
                bkj0<String, String, String> bkj0VarMo96370a = ((a7j0) s4j0VarPoll).mo96370a();
                ((TopEffectLayer) this.viewModel).m75262G0(bkj0VarMo96370a.f77081a, bkj0VarMo96370a.f77082b, bkj0VarMo96370a.f77083c, new x20() { // from class: l.g4j0
                    @Override // p153l.x20
                    public final void call() {
                        this.f102182a.m175249n4();
                    }
                });
                break;
            case 3:
                ((TopEffectLayer) this.viewModel).m75259B0((BLiveUserUpgrade) s4j0VarPoll.mo96370a(), new x20() { // from class: l.g4j0
                    @Override // p153l.x20
                    public final void call() {
                        this.f102182a.m175249n4();
                    }
                });
                break;
            case 4:
                ((TopEffectLayer) this.viewModel).m75260D0((VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessage) s4j0VarPoll.mo96370a(), new x20() { // from class: l.g4j0
                    @Override // p153l.x20
                    public final void call() {
                        this.f102182a.m175249n4();
                    }
                });
                break;
            case 5:
                ((TopEffectLayer) this.viewModel).m75272r0((LongLinkLiveLeadBoardMsg.LeaderboardEffectInfo) s4j0VarPoll.mo96370a(), new x20() { // from class: l.g4j0
                    @Override // p153l.x20
                    public final void call() {
                        this.f102182a.m175249n4();
                    }
                });
                break;
            case 6:
                ((TopEffectLayer) this.viewModel).m75271q0((z3j0) s4j0VarPoll.mo96370a(), new x20() { // from class: l.g4j0
                    @Override // p153l.x20
                    public final void call() {
                        this.f102182a.m175249n4();
                    }
                });
                break;
            case 7:
                ((TopEffectLayer) this.viewModel).m75274t0((LongLinkLiveUserLevel.RoomTopEffect) s4j0VarPoll.mo96370a(), new x20() { // from class: l.g4j0
                    @Override // p153l.x20
                    public final void call() {
                        this.f102182a.m175249n4();
                    }
                });
                break;
            case 8:
                ((TopEffectLayer) this.viewModel).m75273s0((rdh0) s4j0VarPoll.mo96370a(), new x20() { // from class: l.g4j0
                    @Override // p153l.x20
                    public final void call() {
                        this.f102182a.m175249n4();
                    }
                });
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r0v12, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r0v4, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r0v8, types: [l.oo2] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213810E2().m168545q1().m98296j0()).subscribe(dhw.m115825d(new y20() { // from class: l.a4j0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f68404a.m175243h4((LongLinkSocketMessage.TopEffect) obj);
            }
        }));
        duringCreated(m213810E2().m168545q1().m98327t1()).subscribe(dhw.m115825d(new y20() { // from class: l.h4j0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f107813a.m175246k4((LongLinkLiveMessage.VoiceLiveTopEffectMessage) obj);
            }
        }));
        duringCreated(m213810E2().m168545q1().m98247P0()).subscribe(dhw.m115825d(new y20() { // from class: l.i4j0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f112921a.m175245j4((VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessage) obj);
            }
        }));
        duringCreated(m213810E2().m168545q1().m98319r()).subscribe(dhw.m115829h(new y20() { // from class: l.j4j0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f118305a.m175238c4((z3j0) obj);
            }
        }));
    }
}
