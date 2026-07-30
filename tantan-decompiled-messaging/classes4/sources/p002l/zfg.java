package p002l;

import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveInfoMessage;
import com.p000p1.mobile.putong.live.livingroom.archi.message.event.KeyboardEventData;
import com.p000p1.mobile.putong.live.livingroom.common.fans.FansView;
import com.p000p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.tantanapp.common.data.DbObject;
import java.util.concurrent.TimeUnit;
import l.bwr;
import l.e30;
import l.ffw;
import l.hfw;
import l.jo0;
import l.mqv;
import l.vwb;
import l.w9j;
import p002l.ho2;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class zfg<D extends ho2> extends h4t<D, FansView> {

    /* JADX INFO: renamed from: i */
    public String f23376i;

    /* JADX INFO: renamed from: j */
    public pfg f23377j;

    /* JADX INFO: renamed from: k */
    public long f23378k;

    public zfg(bsm<D> bsmVar, FansView fansView) {
        super(bsmVar);
        this.f23376i = "";
        this.f23377j = null;
        this.f23378k = 0L;
        C(fansView);
    }

    /* JADX INFO: renamed from: P3 */
    public static /* synthetic */ void m27182P3(Throwable th) {
    }

    /* JADX INFO: renamed from: R3 */
    public static /* synthetic */ void m27183R3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T3 */
    public /* synthetic */ void m27184T3(KeyboardEventData keyboardEventData) {
        ((FansView) ((bwr) this).viewModel).m6334j(!keyboardEventData.m5201b());
    }

    /* JADX INFO: renamed from: S3 */
    public void m27185S3() {
        this.f23376i = "";
        this.f23377j = null;
        ((FansView) ((bwr) this).viewModel).m6332f();
        this.f23378k = 0L;
        ((FansView) ((bwr) this).viewModel).m6334j(false);
    }

    /* JADX INFO: renamed from: T */
    public void m27186T() {
        super.T();
        duringCreated((c) m25548F2().KeyboardEvent.show().g()).subscribe(ffw.d(new e30() { // from class: l.yfg
            public final void call(Object obj) {
                this.f22847a.m27184T3((KeyboardEventData) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ Boolean m27187U3(LongLinkGiftMessage.LiveRankings liveRankings) {
        return Boolean.valueOf(liveRankings.getRoomId().equals(m25547E2().m17239o()) && LongLinkGiftMessage.LiveRankingType.live.equals(liveRankings.getType()));
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m27188V3(LongLinkGiftMessage.LiveRankings liveRankings) {
        if (liveRankings.getRankingTime() >= this.f23378k) {
            this.f23378k = liveRankings.getRankingTime();
            this.f23377j = new pfg(liveRankings);
            m27192Z3();
        }
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m27189W3(LiveInfoMessage liveInfoMessage) {
        if (m25547E2().m17234j() != null) {
            m25547E2().m17234j().memberCount = liveInfoMessage.memberCount;
        }
        ((FansView) ((bwr) this).viewModel).m6335k(liveInfoMessage.memberCount);
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m27190X3(LiveControlMessage liveControlMessage) {
        if ("liveinfo".equals(liveControlMessage.type)) {
            m25547E2().m14514M1(m25547E2().m17235k(), m25547E2().m17234j().room.id);
        } else if ("breaking_leader_board".equals(liveControlMessage.type)) {
            this.f23376i = liveControlMessage.content;
            m27192Z3();
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m27191Y3(far farVar) {
        ((FansView) ((bwr) this).viewModel).setFansDataByLeaderBoardData(farVar);
    }

    /* JADX INFO: renamed from: Z3 */
    public void m27192Z3() {
        pfg pfgVar = this.f23377j;
        if (pfgVar == null) {
            return;
        }
        if (!vwb.J(pfgVar.m20227b())) {
            mqv<i4g> mqvVar = this.f23377j.m20227b().get(0);
            hfw.a("FansBoardTAG-FansPresenter-notifyViewModel,first=", ((i4g) mqvVar.a).toString() + ",breakingLeaderBoardUserId=" + this.f23376i);
            if (!((i4g) mqvVar.a).f13039a.equals(this.f23376i)) {
                this.f23376i = "";
            }
        }
        this.f23377j.m20228c(this.f23376i);
        ((FansView) ((bwr) this).viewModel).setFansData(this.f23377j);
    }

    /* JADX INFO: renamed from: b4 */
    public void m27193b4(int i) {
        m25548F2().MemberEvent.show().j(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: c4 */
    public void m27194c4(String str) {
        if (m25552L2() || !m25547E2().m17237m().m15305h()) {
            m25548F2().OpenUserCardDialogEvent.show().j(UserCardData.builder(1400).userId(str).setFromIdentity(bqq.m10554a(this, ((DbObject) m25547E2().m14582l0()).id, str, 1400)).setTo(bqq.m10557d(this, ((DbObject) m25547E2().m14582l0()).id, str, 1400)).setScene("live").setSource("liveLeaderboard").trackFrom("liveOnlineUser").build());
        }
    }

    public void init() {
        ((FansView) ((bwr) this).viewModel).m6334j(true);
        m25547E2().m14514M1(m25547E2().m17235k(), m25547E2().m17239o());
        duringCreated(m25547E2().m14596q1().Z()).filter(new w9j() { // from class: l.rfg
            public final Object call(Object obj) {
                return this.f18498a.m27187U3((LongLinkGiftMessage.LiveRankings) obj);
            }
        }).subscribe(ffw.e(new e30() { // from class: l.sfg
            public final void call(Object obj) {
                this.f18991a.m27188V3((LongLinkGiftMessage.LiveRankings) obj);
            }
        }, new e30() { // from class: l.tfg
            public final void call(Object obj) {
                zfg.m27182P3((Throwable) obj);
            }
        }));
        ((FansView) ((bwr) this).viewModel).m6335k(m25547E2().m17234j().memberCount);
        duringCreated(m25547E2().m14596q1().C().sample(1L, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(jo0.a()).subscribe(ffw.d(new e30() { // from class: l.ufg
            public final void call(Object obj) {
                this.f20616a.m27189W3((LiveInfoMessage) obj);
            }
        }));
        duringCreated(m25547E2().m14589n1()).subscribe(ffw.d(new e30() { // from class: l.vfg
            public final void call(Object obj) {
                this.f21109a.m27190X3((LiveControlMessage) obj);
            }
        }));
        duringCreated(m25547E2().m14586m1()).subscribe(ffw.e(new e30() { // from class: l.wfg
            public final void call(Object obj) {
                this.f21719a.m27191Y3((far) obj);
            }
        }, new e30() { // from class: l.xfg
            public final void call(Object obj) {
                zfg.m27183R3((Throwable) obj);
            }
        }));
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        m27185S3();
    }

    public void reset() {
        this.f23376i = "";
        this.f23377j = null;
        ((FansView) ((bwr) this).viewModel).m6332f();
        this.f23378k = 0L;
        ((FansView) ((bwr) this).viewModel).m6334j(true);
        ((FansView) ((bwr) this).viewModel).m6335k(m25547E2().m17234j().memberCount);
    }

    /* JADX INFO: renamed from: t */
    public void m27195t() {
        super.t();
        init();
    }

    /* JADX INFO: renamed from: a4 */
    public void mo10340a4(RecyclerView recyclerView) {
    }
}
