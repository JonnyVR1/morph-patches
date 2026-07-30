package p149l;

import com.p046p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.base.data.BLiveVoicePkInfo;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.p046p1.mobile.putong.live.livingroom.voice.fans.VoiceFansView;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p149l.nnn0;

/* JADX INFO: loaded from: classes5.dex */
public class p5n0<T extends nnn0> extends h4t<T, VoiceFansView> {

    /* JADX INFO: renamed from: i */
    public String f147313i;

    /* JADX INFO: renamed from: j */
    public d5n0 f147314j;

    /* JADX INFO: renamed from: k */
    public long f147315k;

    public p5n0(bsm<T> bsmVar, VoiceFansView voiceFansView) {
        super(bsmVar);
        this.f147313i = "";
        this.f147314j = null;
        this.f147315k = 0L;
        mo51532C(voiceFansView);
    }

    /* JADX INFO: renamed from: J3 */
    public static /* synthetic */ void m167491J3(Throwable th) {
    }

    /* JADX INFO: renamed from: L3 */
    public static /* synthetic */ void m167493L3(Throwable th) {
    }

    /* JADX INFO: renamed from: P3 */
    public static /* synthetic */ void m167497P3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V3 */
    public void m167501V3(LongLinkLiveMessage.VoiceMemberUpdate voiceMemberUpdate) {
        if (LongLinkLiveMessage.VoiceMemberUpdate.UpdateType.Count.equals(voiceMemberUpdate.getType())) {
            ((VoiceFansView) this.viewModel).m78068j(voiceMemberUpdate.getTotal());
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
    }

    /* JADX INFO: renamed from: U3 */
    public void m167502U3() {
        this.f147313i = "";
        this.f147314j = null;
        ((VoiceFansView) this.viewModel).m78066e();
        this.f147315k = 0L;
        ((VoiceFansView) this.viewModel).m78067i(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ Boolean m167503W3(LongLinkGiftMessage.LiveRankings liveRankings) {
        return Boolean.valueOf(liveRankings.getRoomId().equals(((nnn0) m206027E2()).m149818o()) && LongLinkGiftMessage.LiveRankingType.live.equals(liveRankings.getType()) && liveRankings.getRankingTime() >= this.f147315k);
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m167504X3(LongLinkGiftMessage.LiveRankings liveRankings) {
        this.f147315k = liveRankings.getRankingTime();
        this.f147314j = new d5n0(liveRankings);
        m167509c4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m167505Y3(bik0.C15867a c15867a) {
        ((VoiceFansView) this.viewModel).m78068j(((nnn0) m206027E2()).m160249P2().m102069r().m201357J());
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m167506Z3(njn0 njn0Var) {
        ((VoiceFansView) this.viewModel).setFansDataByLeaderBoardData(njn0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ void m167507a4(BLiveAbsData bLiveAbsData, Long l2) {
        ((nnn0) m206027E2()).m132086Q1(((nnn0) m206027E2()).m149814k(), bLiveAbsData.room.f44419id);
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m167508b4(BLiveVoicePkInfo bLiveVoicePkInfo) {
        ((VoiceFansView) this.viewModel).setFansViewVisible(bLiveVoicePkInfo == null || !bLiveVoicePkInfo.enable);
    }

    /* JADX INFO: renamed from: c4 */
    public void m167509c4() {
        d5n0 d5n0Var = this.f147314j;
        if (d5n0Var == null) {
            return;
        }
        if (!vwb.m200296J(d5n0Var.m110065b())) {
            mqv<y4n0> mqvVar = this.f147314j.m110065b().get(0);
            hfw.m130790a("FansBoardTAG-FansPresenter-notifyViewModel,first=", mqvVar.f135304a.toString() + ",breakingLeaderBoardUserId=" + this.f147313i);
            if (!mqvVar.f135304a.f196307a.equals(this.f147313i)) {
                this.f147313i = "";
            }
        }
        this.f147314j.m110066c(this.f147313i);
        ((VoiceFansView) this.viewModel).setFansData(this.f147314j);
    }

    /* JADX INFO: renamed from: d4 */
    public void m167510d4(int i) {
        m206028F2().MemberEvent.show().mo172463j(Integer.valueOf(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e4 */
    public void m167511e4(String str) {
        if (m206032L2() || !((nnn0) m206027E2()).m149816m().m137801h()) {
            m206028F2().OpenUserCardDialogEvent.show().mo172463j(UserCardData.builder(1400).userId(str).setFromIdentity(bqq.m103387b(this, ((nnn0) m206027E2()).m132146l0().f56011id, str, 1400)).setTo(bqq.m103390e(this, ((nnn0) m206027E2()).m132146l0().f56011id, str, 1400)).setScene("live").setSource("liveLeaderboard").trackFrom("liveOnlineUser").build());
        }
    }

    public void init() {
        ((VoiceFansView) this.viewModel).m78067i(true);
        final BLiveVoice bLiveVoiceM160258V2 = ((nnn0) m206027E2()).mo149813j();
        ((nnn0) m206027E2()).m132086Q1(((nnn0) m206027E2()).m149814k(), bLiveVoiceM160258V2.room.f44419id);
        duringCreated((C22306c<T>) ((nnn0) m206027E2()).m132160q1().m189071S0()).filter(new w9j() { // from class: l.g5n0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f101175a.m167503W3((LongLinkGiftMessage.LiveRankings) obj);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.h5n0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f105958a.m167504X3((LongLinkGiftMessage.LiveRankings) obj);
            }
        }, new e30() { // from class: l.i5n0
            @Override // p149l.e30
            public final void call(Object obj) {
                p5n0.m167497P3((Throwable) obj);
            }
        }));
        ((VoiceFansView) this.viewModel).m78068j(((nnn0) m206027E2()).m160249P2().m102069r().m201357J());
        C22306c<T> c22306cDuringCreated = duringCreated((C22306c<T>) ((nnn0) m206027E2()).m160251Q2());
        TimeUnit timeUnit = TimeUnit.SECONDS;
        c22306cDuringCreated.throttleFirst(1L, timeUnit).subscribe(ffw.m121193d(new e30() { // from class: l.j5n0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f116335a.m167505Y3((bik0.C15867a) obj);
            }
        }));
        duringCreated((C22306c<T>) ((nnn0) m206027E2()).m132079N0()).subscribe(ffw.m121194e(new e30() { // from class: l.k5n0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f121215a.m167506Z3((njn0) obj);
            }
        }, new e30() { // from class: l.l5n0
            @Override // p149l.e30
            public final void call(Object obj) {
                p5n0.m167493L3((Throwable) obj);
            }
        }));
        duringCreated((C22306c<T>) ((nnn0) m206027E2()).m132160q1().m189094c1()).throttleFirst(2L, timeUnit).subscribe(ffw.m121197h(new e30() { // from class: l.m5n0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f131408a.m167501V3((LongLinkLiveMessage.VoiceMemberUpdate) obj);
            }
        }));
        boolean zM195682M6 = ypv.m215672k().m195682M6();
        int iM195801b6 = ypv.m215672k().m195801b6();
        if (zM195682M6) {
            m129299H3(((nnn0) m206027E2()).m132135h2(iM195801b6, timeUnit)).subscribe(ffw.m121194e(new e30() { // from class: l.n5n0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f137221a.m167507a4(bLiveVoiceM160258V2, (Long) obj);
                }
            }, new e30() { // from class: l.o5n0
                @Override // p149l.e30
                public final void call(Object obj) {
                    p5n0.m167491J3((Throwable) obj);
                }
            }));
        }
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        m167502U3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void reset() {
        this.f147313i = "";
        this.f147314j = null;
        ((VoiceFansView) this.viewModel).m78066e();
        this.f147315k = 0L;
        ((VoiceFansView) this.viewModel).m78067i(true);
        ((VoiceFansView) this.viewModel).m78068j(((nnn0) m206027E2()).mo149813j().memberCount);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        init();
        m129304h3(m206028F2().VoicePkEvent.onVoicePkChange(), new e30() { // from class: l.f5n0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f95190a.m167508b4((BLiveVoicePkInfo) obj);
            }
        });
    }
}
