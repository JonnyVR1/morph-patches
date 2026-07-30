package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.topeffect.view.TopEffectLayer;
import com.p1.mobile.android.app.c;
import com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p1.mobile.longlink.msg.live.leaderboard.LongLinkLiveLeadBoardMsg;
import com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;
import com.p1.mobile.longlink.msg.livegift.LongLinkConfession;
import com.p1.mobile.longlink.msg.livehierarchy.LongLinkLiveUserLevel;
import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMultiPk;
import com.p1.mobile.longlink.msg.voicelivemessage.VoiceLiveTopBroadCast;
import com.p1.mobile.putong.live.base.data.BLiveUserUpgrade;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;
import l.bwr;
import l.d30;
import l.e30;
import l.ffw;
import l.fld0;
import l.ggv;
import l.j5h0;
import l.q2f;
import l.vpv;
import l.xaj0;
import l.ypv;
import l.zmf0;
import p002l.ho2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class mvi0<V extends ho2> extends h4t<V, TopEffectLayer> {

    /* JADX INFO: renamed from: i */
    public Deque<ovi0> f15672i;

    /* JADX INFO: renamed from: j */
    public Deque<j5h0> f15673j;

    public mvi0(bsm bsmVar, TopEffectLayer topEffectLayer) {
        super(bsmVar);
        this.f15672i = new ArrayDeque();
        this.f15673j = new ArrayDeque();
        C(topEffectLayer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X3 */
    public /* synthetic */ void m18219X3(c cVar) {
        if (cVar == c.i) {
            m18222U3();
            return;
        }
        if (cVar == (m25552L2() ? c.k : c.j)) {
            m18223V3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public void m18220a4(j5h0 j5h0Var) {
        this.f15673j.add(j5h0Var);
        m18238m4();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v12, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v16, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v26, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v30, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v34, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v5, types: [l.ho2] */
    /* JADX INFO: renamed from: T */
    public void m18221T() {
        super.T();
        duringCreated(m25547E2().m14596q1().n()).subscribe(ffw.d(new e30() { // from class: l.gvi0
            public final void call(Object obj) {
                this.f11639a.m18227b4((LongLinkGiftMessage.LiveRanking) obj);
            }
        }));
        lifecycle().subscribe(ffw.d(new e30() { // from class: l.ivi0
            public final void call(Object obj) {
                this.f13435a.m18219X3((c) obj);
            }
        }));
        duringCreated(m25547E2().m14596q1().L()).subscribe(ffw.d(new e30() { // from class: l.jvi0
            public final void call(Object obj) {
                this.f14053a.m18225Y3((BLiveUserUpgrade) obj);
            }
        }));
        m14191h3(m25548F2().MultiPkEventGroup.multiPkOnPlayEffect(), new e30() { // from class: l.kvi0
            public final void call(Object obj) {
                this.f14554a.m18230e4((LongLinkLiveMultiPk.MultiPkAnimation) obj);
            }
        });
        duringCreated(m25547E2().m14596q1().j()).subscribe(ffw.d(new e30() { // from class: l.lvi0
            public final void call(Object obj) {
                this.f15088a.m18229d4((LongLinkLiveLeadBoardMsg.LeaderboardEffectInfo) obj);
            }
        }));
        duringCreated(m25547E2().m14596q1().v1).subscribe(ffw.d(new e30() { // from class: l.xui0
            public final void call(Object obj) {
                this.f22472a.m18231f4((LongLinkLiveUserLevel.RoomTopEffect) obj);
            }
        }));
        q2f.d dVarShowAuctionAnim = m25548F2().VoiceAuctionEvent.showAuctionAnim();
        final TopEffectLayer topEffectLayer = (TopEffectLayer) ((bwr) this).viewModel;
        Objects.requireNonNull(topEffectLayer);
        m14191h3(dVarShowAuctionAnim, new e30() { // from class: l.yui0
            public final void call(Object obj) {
                topEffectLayer.m7659z0((j5h0) obj);
            }
        });
        q2f.d dVarShowSpecialAuctionAnim = m25548F2().VoiceAuctionEvent.showSpecialAuctionAnim();
        final TopEffectLayer topEffectLayer2 = (TopEffectLayer) ((bwr) this).viewModel;
        Objects.requireNonNull(topEffectLayer2);
        m14191h3(dVarShowSpecialAuctionAnim, new e30() { // from class: l.zui0
            public final void call(Object obj) {
                topEffectLayer2.m7657w0((zmf0) obj);
            }
        });
        duringCreated(m25547E2().m14596q1().U0()).subscribe(ffw.h(new e30() { // from class: l.avi0
            public final void call(Object obj) {
                this.f7899a.m18220a4((j5h0) obj);
            }
        }));
        duringCreated(m25547E2().m14596q1().G()).subscribe(ffw.h(new e30() { // from class: l.bvi0
            public final void call(Object obj) {
                this.f8375a.m18232g4((j5h0) obj);
            }
        }));
        duringCreated(m25547E2().m14596q1().K1).subscribe(ffw.d(new e30() { // from class: l.hvi0
            public final void call(Object obj) {
                this.f12279a.m18226Z3((LongLinkConfession.GiftWallGradeFiveNotice) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U3 */
    public final void m18222U3() {
        m18239n4();
        m18238m4();
    }

    /* JADX INFO: renamed from: V3 */
    public final void m18223V3() {
        this.f15672i.clear();
        this.f15673j.clear();
    }

    /* JADX INFO: renamed from: W3 */
    public final boolean m18224W3() {
        return ((TopEffectLayer) ((bwr) this).viewModel).m7648n0() || ((TopEffectLayer) ((bwr) this).viewModel).m7645k0() || ((TopEffectLayer) ((bwr) this).viewModel).m7647m0();
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m18225Y3(BLiveUserUpgrade bLiveUserUpgrade) {
        if (bLiveUserUpgrade.uid.equals(ypv.a.D0())) {
            vpv vpvVar = ypv.a;
            vpvVar.f0(vpvVar.D0());
        }
        bLiveUserUpgrade.liveUserLevel = ((ggv) ypv.l(fld0.c)).v(bLiveUserUpgrade.grade);
        m18234i4(bLiveUserUpgrade);
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m18226Z3(LongLinkConfession.GiftWallGradeFiveNotice giftWallGradeFiveNotice) {
        ((TopEffectLayer) ((bwr) this).viewModel).m7655u0(giftWallGradeFiveNotice);
    }

    /* JADX INFO: renamed from: b4 */
    public void m18227b4(LongLinkGiftMessage.LiveRanking liveRanking) {
        this.f15672i.add(new qvi0(liveRanking));
        m18239n4();
    }

    /* JADX INFO: renamed from: c4 */
    public final void m18228c4(vui0 vui0Var) {
        this.f15672i.add(new uui0(vui0Var));
        m18239n4();
    }

    /* JADX INFO: renamed from: d4 */
    public void m18229d4(LongLinkLiveLeadBoardMsg.LeaderboardEffectInfo leaderboardEffectInfo) {
        this.f15672i.add(new zvi0(leaderboardEffectInfo));
        m18239n4();
    }

    /* JADX INFO: renamed from: e4 */
    public final void m18230e4(LongLinkLiveMultiPk.MultiPkAnimation multiPkAnimation) {
        if (TextUtils.isEmpty(multiPkAnimation.getAnimationUrl())) {
            return;
        }
        ((TopEffectLayer) ((bwr) this).viewModel).m7656v0(multiPkAnimation.getAnimationUrl());
    }

    /* JADX INFO: renamed from: f4 */
    public void m18231f4(LongLinkLiveUserLevel.RoomTopEffect roomTopEffect) {
        this.f15672i.add(new aed0(roomTopEffect));
        m18239n4();
    }

    /* JADX INFO: renamed from: g4 */
    public void m18232g4(j5h0 j5h0Var) {
        this.f15672i.add(new ced0(j5h0Var));
        m18239n4();
    }

    /* JADX INFO: renamed from: h4 */
    public final void m18233h4(LongLinkSocketMessage.TopEffect topEffect) {
        this.f15672i.add(new tui0(topEffect));
        m18239n4();
    }

    /* JADX INFO: renamed from: i4 */
    public final void m18234i4(BLiveUserUpgrade bLiveUserUpgrade) {
        this.f15672i.add(new vxi0(bLiveUserUpgrade));
        m18239n4();
    }

    /* JADX INFO: renamed from: j4 */
    public final void m18235j4(VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessage voiceLiveHourLeaderboardTopEffectMessage) {
        this.f15672i.add(new hwn0(voiceLiveHourLeaderboardTopEffectMessage));
        m18239n4();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m18236k4(LongLinkLiveMessage.VoiceLiveTopEffectMessage voiceLiveTopEffectMessage) {
        ((TopEffectLayer) ((bwr) this).viewModel).m7640E0(voiceLiveTopEffectMessage);
    }

    /* JADX INFO: renamed from: l4 */
    public void m18237l4(String str) {
        m25548F2().SchemeHandleEvent.handleScheme().j(new x1e0.C0891a(200).m25610e(str).m25608c());
    }

    /* JADX INFO: renamed from: m4 */
    public void m18238m4() {
        j5h0 j5h0VarPoll;
        if (((TopEffectLayer) ((bwr) this).viewModel).m7646l0() || (j5h0VarPoll = this.f15673j.poll()) == null) {
            return;
        }
        ((TopEffectLayer) ((bwr) this).viewModel).m7649o0(j5h0VarPoll);
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
    }

    /* JADX INFO: renamed from: n4 */
    public final void m18239n4() {
        ovi0 ovi0VarPoll;
        if (m18224W3() || (ovi0VarPoll = this.f15672i.poll()) == null) {
            return;
        }
        switch (ovi0VarPoll.mo9605b()) {
            case 0:
                ((TopEffectLayer) ((bwr) this).viewModel).m7658y0((LongLinkSocketMessage.TopEffect) ovi0VarPoll.mo9604a(), new d30() { // from class: l.cvi0
                    public final void call() {
                        this.f8951a.m18239n4();
                    }
                });
                break;
            case 1:
                ((TopEffectLayer) ((bwr) this).viewModel).m7650p0((LongLinkGiftMessage.LiveRanking) ovi0VarPoll.mo9604a(), new d30() { // from class: l.cvi0
                    public final void call() {
                        this.f8951a.m18239n4();
                    }
                });
                break;
            case 2:
                xaj0<String, String, String> xaj0VarMo9604a = ((wxi0) ovi0VarPoll).mo9604a();
                ((TopEffectLayer) ((bwr) this).viewModel).m7641G0((String) xaj0VarMo9604a.a, (String) xaj0VarMo9604a.b, (String) xaj0VarMo9604a.c, new d30() { // from class: l.cvi0
                    public final void call() {
                        this.f8951a.m18239n4();
                    }
                });
                break;
            case 3:
                ((TopEffectLayer) ((bwr) this).viewModel).m7637B0((BLiveUserUpgrade) ovi0VarPoll.mo9604a(), new d30() { // from class: l.cvi0
                    public final void call() {
                        this.f8951a.m18239n4();
                    }
                });
                break;
            case 4:
                ((TopEffectLayer) ((bwr) this).viewModel).m7639D0((VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessage) ovi0VarPoll.mo9604a(), new d30() { // from class: l.cvi0
                    public final void call() {
                        this.f8951a.m18239n4();
                    }
                });
                break;
            case 5:
                ((TopEffectLayer) ((bwr) this).viewModel).m7652r0((LongLinkLiveLeadBoardMsg.LeaderboardEffectInfo) ovi0VarPoll.mo9604a(), new d30() { // from class: l.cvi0
                    public final void call() {
                        this.f8951a.m18239n4();
                    }
                });
                break;
            case 6:
                ((TopEffectLayer) ((bwr) this).viewModel).m7651q0((vui0) ovi0VarPoll.mo9604a(), new d30() { // from class: l.cvi0
                    public final void call() {
                        this.f8951a.m18239n4();
                    }
                });
                break;
            case ExpLoopInputType.FRIEND_PURPOSE /* 7 */:
                ((TopEffectLayer) ((bwr) this).viewModel).m7654t0((LongLinkLiveUserLevel.RoomTopEffect) ovi0VarPoll.mo9604a(), new d30() { // from class: l.cvi0
                    public final void call() {
                        this.f8951a.m18239n4();
                    }
                });
                break;
            case ExpLoopInputType.GAME_NAME /* 8 */:
                ((TopEffectLayer) ((bwr) this).viewModel).m7653s0((j5h0) ovi0VarPoll.mo9604a(), new d30() { // from class: l.cvi0
                    public final void call() {
                        this.f8951a.m18239n4();
                    }
                });
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v12, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v4, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v8, types: [l.ho2] */
    /* JADX INFO: renamed from: t */
    public void m18240t() {
        super.t();
        duringCreated(m25547E2().m14596q1().j0()).subscribe(ffw.d(new e30() { // from class: l.wui0
            public final void call(Object obj) {
                this.f21994a.m18233h4((LongLinkSocketMessage.TopEffect) obj);
            }
        }));
        duringCreated(m25547E2().m14596q1().t1()).subscribe(ffw.d(new e30() { // from class: l.dvi0
            public final void call(Object obj) {
                this.f9440a.m18236k4((LongLinkLiveMessage.VoiceLiveTopEffectMessage) obj);
            }
        }));
        duringCreated(m25547E2().m14596q1().P0()).subscribe(ffw.d(new e30() { // from class: l.evi0
            public final void call(Object obj) {
                this.f9976a.m18235j4((VoiceLiveTopBroadCast.VoiceLiveHourLeaderboardTopEffectMessage) obj);
            }
        }));
        duringCreated(m25547E2().m14596q1().r()).subscribe(ffw.h(new e30() { // from class: l.fvi0
            public final void call(Object obj) {
                this.f10644a.m18228c4((vui0) obj);
            }
        }));
    }
}
