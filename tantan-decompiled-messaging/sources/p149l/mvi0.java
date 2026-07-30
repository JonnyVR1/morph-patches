package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p046p1.mobile.longlink.msg.live.leaderboard.LongLinkLiveLeadBoardMsg;
import com.p046p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;
import com.p046p1.mobile.longlink.msg.livegift.LongLinkConfession;
import com.p046p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk;
import com.p046p1.mobile.longlink.msg.voicelivemessage.VoiceLiveTopBroadCast;
import com.p046p1.mobile.putong.live.base.data.BLiveUserUpgrade;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.TopEffectLayer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;
import p133rx.C22306c;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
public class mvi0<V extends ho2> extends h4t<V, TopEffectLayer> {

    /* JADX INFO: renamed from: i */
    public Deque<ovi0> f135904i;

    /* JADX INFO: renamed from: j */
    public Deque<j5h0> f135905j;

    public mvi0(bsm bsmVar, TopEffectLayer topEffectLayer) {
        super(bsmVar);
        this.f135904i = new ArrayDeque();
        this.f135905j = new ArrayDeque();
        mo51532C(topEffectLayer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X3 */
    public /* synthetic */ void m156496X3(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            m156498U3();
            return;
        }
        if (c4319c == (m206032L2() ? C4319c.f15550k : C4319c.f15549j)) {
            m156499V3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public void m156497a4(j5h0 j5h0Var) {
        this.f135905j.add(j5h0Var);
        m156514m4();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v12, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v16, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v26, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v30, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v34, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v5, types: [l.ho2] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m206027E2().m132160q1().m189125n()).subscribe(ffw.m121193d(new e30() { // from class: l.gvi0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f104576a.m156503b4((LongLinkGiftMessage.LiveRanking) obj);
            }
        }));
        lifecycle().subscribe(ffw.m121193d(new e30() { // from class: l.ivi0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f115170a.m156496X3((C4319c) obj);
            }
        }));
        duringCreated(m206027E2().m132160q1().m189056L()).subscribe(ffw.m121193d(new e30() { // from class: l.jvi0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f119943a.m156501Y3((BLiveUserUpgrade) obj);
            }
        }));
        m129304h3(m206028F2().MultiPkEventGroup.multiPkOnPlayEffect(), new e30() { // from class: l.kvi0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f124776a.m156506e4((LongLinkLiveMultiPk.MultiPkAnimation) obj);
            }
        });
        duringCreated(m206027E2().m132160q1().m189113j()).subscribe(ffw.m121193d(new e30() { // from class: l.lvi0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f130167a.m156505d4((LongLinkLiveLeadBoardMsg.LeaderboardEffectInfo) obj);
            }
        }));
        duringCreated(m206027E2().m132160q1().f170506v1).subscribe(ffw.m121193d(new e30() { // from class: l.xui0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f194502a.m156507f4((LongLinkLiveUserLevel.RoomTopEffect) obj);
            }
        }));
        q2f.C19397d<j5h0, C22306c<j5h0>> c19397dShowAuctionAnim = m206028F2().VoiceAuctionEvent.showAuctionAnim();
        final TopEffectLayer topEffectLayer = (TopEffectLayer) this.viewModel;
        Objects.requireNonNull(topEffectLayer);
        m129304h3(c19397dShowAuctionAnim, new e30() { // from class: l.yui0
            @Override // p149l.e30
            public final void call(Object obj) {
                topEffectLayer.m74096z0((j5h0) obj);
            }
        });
        q2f.C19397d<zmf0, C22306c<zmf0>> c19397dShowSpecialAuctionAnim = m206028F2().VoiceAuctionEvent.showSpecialAuctionAnim();
        final TopEffectLayer topEffectLayer2 = (TopEffectLayer) this.viewModel;
        Objects.requireNonNull(topEffectLayer2);
        m129304h3(c19397dShowSpecialAuctionAnim, new e30() { // from class: l.zui0
            @Override // p149l.e30
            public final void call(Object obj) {
                topEffectLayer2.m74094w0((zmf0) obj);
            }
        });
        duringCreated(m206027E2().m132160q1().m189075U0()).subscribe(ffw.m121197h(new e30() { // from class: l.avi0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f71943a.m156497a4((j5h0) obj);
            }
        }));
        duringCreated(m206027E2().m132160q1().m189046G()).subscribe(ffw.m121197h(new e30() { // from class: l.bvi0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f77451a.m156508g4((j5h0) obj);
            }
        }));
        duringCreated(m206027E2().m132160q1().f170379K1).subscribe(ffw.m121193d(new e30() { // from class: l.hvi0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f109647a.m156502Z3((LongLinkConfession.GiftWallGradeFiveNotice) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U3 */
    public final void m156498U3() {
        m156515n4();
        m156514m4();
    }

    /* JADX INFO: renamed from: V3 */
    public final void m156499V3() {
        this.f135904i.clear();
        this.f135905j.clear();
    }

    /* JADX INFO: renamed from: W3 */
    public final boolean m156500W3() {
        return ((TopEffectLayer) this.viewModel).m74085n0() || ((TopEffectLayer) this.viewModel).m74082k0() || ((TopEffectLayer) this.viewModel).m74084m0();
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m156501Y3(BLiveUserUpgrade bLiveUserUpgrade) {
        if (bLiveUserUpgrade.uid.equals(ypv.f199493a.m199309D0())) {
            vpv vpvVar = ypv.f199493a;
            vpvVar.m199345f0(vpvVar.m199309D0());
        }
        bLiveUserUpgrade.liveUserLevel = ((ggv) ypv.m215673l(fld0.f98148c)).m126036v(bLiveUserUpgrade.grade);
        m156510i4(bLiveUserUpgrade);
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m156502Z3(LongLinkConfession.GiftWallGradeFiveNotice giftWallGradeFiveNotice) {
        ((TopEffectLayer) this.viewModel).m74092u0(giftWallGradeFiveNotice);
    }

    /* JADX INFO: renamed from: b4 */
    public void m156503b4(LongLinkGiftMessage.LiveRanking liveRanking) {
        this.f135904i.add(new qvi0(liveRanking));
        m156515n4();
    }

    /* JADX INFO: renamed from: c4 */
    public final void m156504c4(vui0 vui0Var) {
        this.f135904i.add(new uui0(vui0Var));
        m156515n4();
    }

    /* JADX INFO: renamed from: d4 */
    public void m156505d4(LongLinkLiveLeadBoardMsg.LeaderboardEffectInfo leaderboardEffectInfo) {
        this.f135904i.add(new zvi0(leaderboardEffectInfo));
        m156515n4();
    }

    /* JADX INFO: renamed from: e4 */
    public final void m156506e4(LongLinkLiveMultiPk.MultiPkAnimation multiPkAnimation) {
        if (TextUtils.isEmpty(multiPkAnimation.getAnimationUrl())) {
            return;
        }
        ((TopEffectLayer) this.viewModel).m74093v0(multiPkAnimation.getAnimationUrl());
    }

    /* JADX INFO: renamed from: f4 */
    public void m156507f4(LongLinkLiveUserLevel.RoomTopEffect roomTopEffect) {
        this.f135904i.add(new aed0(roomTopEffect));
        m156515n4();
    }

    /* JADX INFO: renamed from: g4 */
    public void m156508g4(j5h0 j5h0Var) {
        this.f135904i.add(new ced0(j5h0Var));
        m156515n4();
    }

    /* JADX INFO: renamed from: h4 */
    public final void m156509h4(LongLinkSocketMessage.TopEffect topEffect) {
        this.f135904i.add(new tui0(topEffect));
        m156515n4();
    }

    /* JADX INFO: renamed from: i4 */
    public final void m156510i4(BLiveUserUpgrade bLiveUserUpgrade) {
        this.f135904i.add(new vxi0(bLiveUserUpgrade));
        m156515n4();
    }

    /* JADX INFO: renamed from: j4 */
    public final void m156511j4(VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessage voiceLiveHourLeaderboardTopEffectMessage) {
        this.f135904i.add(new hwn0(voiceLiveHourLeaderboardTopEffectMessage));
        m156515n4();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m156512k4(LongLinkLiveMessage.VoiceLiveTopEffectMessage voiceLiveTopEffectMessage) {
        ((TopEffectLayer) this.viewModel).m74078E0(voiceLiveTopEffectMessage);
    }

    /* JADX INFO: renamed from: l4 */
    public void m156513l4(String str) {
        m206028F2().SchemeHandleEvent.handleScheme().mo172463j(new x1e0.C21018a(200).m206701e(str).m206699c());
    }

    /* JADX INFO: renamed from: m4 */
    public void m156514m4() {
        j5h0 j5h0VarPoll;
        if (((TopEffectLayer) this.viewModel).m74083l0() || (j5h0VarPoll = this.f135905j.poll()) == null) {
            return;
        }
        ((TopEffectLayer) this.viewModel).m74086o0(j5h0VarPoll);
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
    }

    /* JADX INFO: renamed from: n4 */
    public final void m156515n4() {
        ovi0 ovi0VarPoll;
        if (m156500W3() || (ovi0VarPoll = this.f135904i.poll()) == null) {
            return;
        }
        switch (ovi0VarPoll.mo96085b()) {
            case 0:
                ((TopEffectLayer) this.viewModel).m74095y0((LongLinkSocketMessage.TopEffect) ovi0VarPoll.mo96084a(), new d30() { // from class: l.cvi0
                    @Override // p149l.d30
                    public final void call() {
                        this.f82663a.m156515n4();
                    }
                });
                break;
            case 1:
                ((TopEffectLayer) this.viewModel).m74087p0((LongLinkGiftMessage.LiveRanking) ovi0VarPoll.mo96084a(), new d30() { // from class: l.cvi0
                    @Override // p149l.d30
                    public final void call() {
                        this.f82663a.m156515n4();
                    }
                });
                break;
            case 2:
                xaj0<String, String, String> xaj0VarMo96084a = ((wxi0) ovi0VarPoll).mo96084a();
                ((TopEffectLayer) this.viewModel).m74079G0(xaj0VarMo96084a.f191751a, xaj0VarMo96084a.f191752b, xaj0VarMo96084a.f191753c, new d30() { // from class: l.cvi0
                    @Override // p149l.d30
                    public final void call() {
                        this.f82663a.m156515n4();
                    }
                });
                break;
            case 3:
                ((TopEffectLayer) this.viewModel).m74076B0((BLiveUserUpgrade) ovi0VarPoll.mo96084a(), new d30() { // from class: l.cvi0
                    @Override // p149l.d30
                    public final void call() {
                        this.f82663a.m156515n4();
                    }
                });
                break;
            case 4:
                ((TopEffectLayer) this.viewModel).m74077D0((VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessage) ovi0VarPoll.mo96084a(), new d30() { // from class: l.cvi0
                    @Override // p149l.d30
                    public final void call() {
                        this.f82663a.m156515n4();
                    }
                });
                break;
            case 5:
                ((TopEffectLayer) this.viewModel).m74089r0((LongLinkLiveLeadBoardMsg.LeaderboardEffectInfo) ovi0VarPoll.mo96084a(), new d30() { // from class: l.cvi0
                    @Override // p149l.d30
                    public final void call() {
                        this.f82663a.m156515n4();
                    }
                });
                break;
            case 6:
                ((TopEffectLayer) this.viewModel).m74088q0((vui0) ovi0VarPoll.mo96084a(), new d30() { // from class: l.cvi0
                    @Override // p149l.d30
                    public final void call() {
                        this.f82663a.m156515n4();
                    }
                });
                break;
            case 7:
                ((TopEffectLayer) this.viewModel).m74091t0((LongLinkLiveUserLevel.RoomTopEffect) ovi0VarPoll.mo96084a(), new d30() { // from class: l.cvi0
                    @Override // p149l.d30
                    public final void call() {
                        this.f82663a.m156515n4();
                    }
                });
                break;
            case 8:
                ((TopEffectLayer) this.viewModel).m74090s0((j5h0) ovi0VarPoll.mo96084a(), new d30() { // from class: l.cvi0
                    @Override // p149l.d30
                    public final void call() {
                        this.f82663a.m156515n4();
                    }
                });
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v12, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v4, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v8, types: [l.ho2] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206027E2().m132160q1().m189114j0()).subscribe(ffw.m121193d(new e30() { // from class: l.wui0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f188136a.m156509h4((LongLinkSocketMessage.TopEffect) obj);
            }
        }));
        duringCreated(m206027E2().m132160q1().m189145t1()).subscribe(ffw.m121193d(new e30() { // from class: l.dvi0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f88063a.m156512k4((LongLinkLiveMessage.VoiceLiveTopEffectMessage) obj);
            }
        }));
        duringCreated(m206027E2().m132160q1().m189065P0()).subscribe(ffw.m121193d(new e30() { // from class: l.evi0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f93339a.m156511j4((VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessage) obj);
            }
        }));
        duringCreated(m206027E2().m132160q1().m189137r()).subscribe(ffw.m121197h(new e30() { // from class: l.fvi0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f99449a.m156504c4((vui0) obj);
            }
        }));
    }
}
