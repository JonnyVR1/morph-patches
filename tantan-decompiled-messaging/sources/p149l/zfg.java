package p149l;

import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveInfoMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.message.event.KeyboardEventData;
import com.p046p1.mobile.putong.live.livingroom.common.fans.FansView;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
public class zfg<D extends ho2> extends h4t<D, FansView> {

    /* JADX INFO: renamed from: i */
    public String f202938i;

    /* JADX INFO: renamed from: j */
    public pfg f202939j;

    /* JADX INFO: renamed from: k */
    public long f202940k;

    public zfg(bsm<D> bsmVar, FansView fansView) {
        super(bsmVar);
        this.f202938i = "";
        this.f202939j = null;
        this.f202940k = 0L;
        mo51532C(fansView);
    }

    /* JADX INFO: renamed from: P3 */
    public static /* synthetic */ void m218460P3(Throwable th) {
    }

    /* JADX INFO: renamed from: R3 */
    public static /* synthetic */ void m218461R3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T3 */
    public /* synthetic */ void m218462T3(KeyboardEventData keyboardEventData) {
        ((FansView) this.viewModel).m72821j(!keyboardEventData.m71825b());
    }

    /* JADX INFO: renamed from: S3 */
    public void m218463S3() {
        this.f202938i = "";
        this.f202939j = null;
        ((FansView) this.viewModel).m72820f();
        this.f202940k = 0L;
        ((FansView) this.viewModel).m72821j(false);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated((C22306c) m206028F2().KeyboardEvent.show().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.yfg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f198055a.m218462T3((KeyboardEventData) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ Boolean m218464U3(LongLinkGiftMessage.LiveRankings liveRankings) {
        return Boolean.valueOf(liveRankings.getRoomId().equals(m206027E2().m149818o()) && LongLinkGiftMessage.LiveRankingType.live.equals(liveRankings.getType()));
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m218465V3(LongLinkGiftMessage.LiveRankings liveRankings) {
        if (liveRankings.getRankingTime() >= this.f202940k) {
            this.f202940k = liveRankings.getRankingTime();
            this.f202939j = new pfg(liveRankings);
            m218469Z3();
        }
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m218466W3(LiveInfoMessage liveInfoMessage) {
        if (m206027E2().mo149813j() != null) {
            m206027E2().mo149813j().memberCount = liveInfoMessage.memberCount;
        }
        ((FansView) this.viewModel).m72822k(liveInfoMessage.memberCount);
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m218467X3(LiveControlMessage liveControlMessage) {
        if ("liveinfo".equals(liveControlMessage.type)) {
            m206027E2().m132078M1(m206027E2().m149814k(), m206027E2().mo149813j().room.f44419id);
        } else if ("breaking_leader_board".equals(liveControlMessage.type)) {
            this.f202938i = liveControlMessage.content;
            m218469Z3();
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m218468Y3(far farVar) {
        ((FansView) this.viewModel).setFansDataByLeaderBoardData(farVar);
    }

    /* JADX INFO: renamed from: Z3 */
    public void m218469Z3() {
        pfg pfgVar = this.f202939j;
        if (pfgVar == null) {
            return;
        }
        if (!vwb.m200296J(pfgVar.m168639b())) {
            mqv<i4g> mqvVar = this.f202939j.m168639b().get(0);
            hfw.m130790a("FansBoardTAG-FansPresenter-notifyViewModel,first=", mqvVar.f135304a.toString() + ",breakingLeaderBoardUserId=" + this.f202938i);
            if (!mqvVar.f135304a.f111441a.equals(this.f202938i)) {
                this.f202938i = "";
            }
        }
        this.f202939j.m168640c(this.f202938i);
        ((FansView) this.viewModel).setFansData(this.f202939j);
    }

    /* JADX INFO: renamed from: b4 */
    public void m218470b4(int i) {
        m206028F2().MemberEvent.show().mo172463j(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: c4 */
    public void m218471c4(String str) {
        if (m206032L2() || !m206027E2().m149816m().m137801h()) {
            m206028F2().OpenUserCardDialogEvent.show().mo172463j(UserCardData.builder(1400).userId(str).setFromIdentity(bqq.m103386a(this, m206027E2().m132146l0().f56011id, str, 1400)).setTo(bqq.m103389d(this, m206027E2().m132146l0().f56011id, str, 1400)).setScene("live").setSource("liveLeaderboard").trackFrom("liveOnlineUser").build());
        }
    }

    public void init() {
        ((FansView) this.viewModel).m72821j(true);
        m206027E2().m132078M1(m206027E2().m149814k(), m206027E2().m149818o());
        duringCreated(m206027E2().m132160q1().m189084Z()).filter(new w9j() { // from class: l.rfg
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f159147a.m218464U3((LongLinkGiftMessage.LiveRankings) obj);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.sfg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f164290a.m218465V3((LongLinkGiftMessage.LiveRankings) obj);
            }
        }, new e30() { // from class: l.tfg
            @Override // p149l.e30
            public final void call(Object obj) {
                zfg.m218460P3((Throwable) obj);
            }
        }));
        ((FansView) this.viewModel).m72822k(m206027E2().mo149813j().memberCount);
        duringCreated(m206027E2().m132160q1().m189038C().sample(1L, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.ufg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f176255a.m218466W3((LiveInfoMessage) obj);
            }
        }));
        duringCreated(m206027E2().m132153n1()).subscribe(ffw.m121193d(new e30() { // from class: l.vfg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f181270a.m218467X3((LiveControlMessage) obj);
            }
        }));
        duringCreated(m206027E2().m132150m1()).subscribe(ffw.m121194e(new e30() { // from class: l.wfg
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f186080a.m218468Y3((far) obj);
            }
        }, new e30() { // from class: l.xfg
            @Override // p149l.e30
            public final void call(Object obj) {
                zfg.m218461R3((Throwable) obj);
            }
        }));
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        m218463S3();
    }

    public void reset() {
        this.f202938i = "";
        this.f202939j = null;
        ((FansView) this.viewModel).m72820f();
        this.f202940k = 0L;
        ((FansView) this.viewModel).m72821j(true);
        ((FansView) this.viewModel).m72822k(m206027E2().mo149813j().memberCount);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        init();
    }

    /* JADX INFO: renamed from: a4 */
    public void mo101831a4(RecyclerView recyclerView) {
    }
}
