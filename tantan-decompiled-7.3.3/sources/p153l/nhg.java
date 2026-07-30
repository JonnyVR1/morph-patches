package p153l;

import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveInfoMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.message.event.KeyboardEventData;
import com.p051p1.mobile.putong.live.livingroom.common.fans.FansView;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public class nhg<D extends oo2> extends i6t<D, FansView> {

    /* JADX INFO: renamed from: i */
    public String f141990i;

    /* JADX INFO: renamed from: j */
    public dhg f141991j;

    /* JADX INFO: renamed from: k */
    public long f141992k;

    public nhg(dum<D> dumVar, FansView fansView) {
        super(dumVar);
        this.f141990i = "";
        this.f141991j = null;
        this.f141992k = 0L;
        mo52715C(fansView);
    }

    /* JADX INFO: renamed from: P3 */
    public static /* synthetic */ void m163079P3(Throwable th) {
    }

    /* JADX INFO: renamed from: R3 */
    public static /* synthetic */ void m163080R3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T3 */
    public /* synthetic */ void m163081T3(KeyboardEventData keyboardEventData) {
        ((FansView) this.viewModel).m74004j(!keyboardEventData.m73008b());
    }

    /* JADX INFO: renamed from: S3 */
    public void m163082S3() {
        this.f141990i = "";
        this.f141991j = null;
        ((FansView) this.viewModel).m74003f();
        this.f141992k = 0L;
        ((FansView) this.viewModel).m74004j(false);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated((C22421c) m213811F2().KeyboardEvent.show().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.mhg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f136847a.m163081T3((KeyboardEventData) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ Boolean m163083U3(LongLinkGiftMessage.LiveRankings liveRankings) {
        return Boolean.valueOf(liveRankings.getRoomId().equals(m213810E2().m202194o()) && LongLinkGiftMessage.LiveRankingType.live.equals(liveRankings.getType()));
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m163084V3(LongLinkGiftMessage.LiveRankings liveRankings) {
        if (liveRankings.getRankingTime() >= this.f141992k) {
            this.f141992k = liveRankings.getRankingTime();
            this.f141991j = new dhg(liveRankings);
            m163088Z3();
        }
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m163085W3(LiveInfoMessage liveInfoMessage) {
        if (m213810E2().mo183435j() != null) {
            m213810E2().mo183435j().memberCount = liveInfoMessage.memberCount;
        }
        ((FansView) this.viewModel).m74005k(liveInfoMessage.memberCount);
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m163086X3(LiveControlMessage liveControlMessage) {
        if ("liveinfo".equals(liveControlMessage.type)) {
            m213810E2().m168466M1(m213810E2().m202191k(), m213810E2().mo183435j().room.f45267id);
        } else if ("breaking_leader_board".equals(liveControlMessage.type)) {
            this.f141990i = liveControlMessage.content;
            m163088Z3();
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m163087Y3(hcr hcrVar) {
        ((FansView) this.viewModel).setFansDataByLeaderBoardData(hcrVar);
    }

    /* JADX INFO: renamed from: Z3 */
    public void m163088Z3() {
        dhg dhgVar = this.f141991j;
        if (dhgVar == null) {
            return;
        }
        if (!jyb.m147479J(dhgVar.m115797b())) {
            nsv<w5g> nsvVar = this.f141991j.m115797b().get(0);
            fhw.m125605a("FansBoardTAG-FansPresenter-notifyViewModel,first=", nsvVar.f143542a.toString() + ",breakingLeaderBoardUserId=" + this.f141990i);
            if (!nsvVar.f143542a.f187506a.equals(this.f141990i)) {
                this.f141990i = "";
            }
        }
        this.f141991j.m115798c(this.f141990i);
        ((FansView) this.viewModel).setFansData(this.f141991j);
    }

    /* JADX INFO: renamed from: b4 */
    public void m163090b4(int i) {
        m213811F2().MemberEvent.show().mo199273j(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: c4 */
    public void m163091c4(String str) {
        if (m213815L2() || !m213810E2().m202193m().m146882h()) {
            m213811F2().OpenUserCardDialogEvent.show().mo199273j(UserCardData.builder(1400).userId(str).setFromIdentity(csq.m112227a(this, m213810E2().m168532l0().f56859id, str, 1400)).setTo(csq.m112230d(this, m213810E2().m168532l0().f56859id, str, 1400)).setScene("live").setSource("liveLeaderboard").trackFrom("liveOnlineUser").build());
        }
    }

    public void init() {
        ((FansView) this.viewModel).m74004j(true);
        m213810E2().m168466M1(m213810E2().m202191k(), m213810E2().m202194o());
        duringCreated(m213810E2().m168545q1().m98266Z()).filter(new qcj() { // from class: l.fhg
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f99048a.m163083U3((LongLinkGiftMessage.LiveRankings) obj);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.ghg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f104122a.m163084V3((LongLinkGiftMessage.LiveRankings) obj);
            }
        }, new y20() { // from class: l.hhg
            @Override // p153l.y20
            public final void call(Object obj) {
                nhg.m163079P3((Throwable) obj);
            }
        }));
        ((FansView) this.viewModel).m74005k(m213810E2().mo183435j().memberCount);
        duringCreated(m213810E2().m168545q1().m98220C().sample(1L, TimeUnit.SECONDS)).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.ihg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f114937a.m163085W3((LiveInfoMessage) obj);
            }
        }));
        duringCreated(m213810E2().m168539n1()).subscribe(dhw.m115825d(new y20() { // from class: l.jhg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f120972a.m163086X3((LiveControlMessage) obj);
            }
        }));
        duringCreated(m213810E2().m168536m1()).subscribe(dhw.m115826e(new y20() { // from class: l.khg
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f126869a.m163087Y3((hcr) obj);
            }
        }, new y20() { // from class: l.lhg
            @Override // p153l.y20
            public final void call(Object obj) {
                nhg.m163080R3((Throwable) obj);
            }
        }));
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        m163082S3();
    }

    public void reset() {
        this.f141990i = "";
        this.f141991j = null;
        ((FansView) this.viewModel).m74003f();
        this.f141992k = 0L;
        ((FansView) this.viewModel).m74004j(true);
        ((FansView) this.viewModel).m74005k(m213810E2().mo183435j().memberCount);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        init();
    }

    /* JADX INFO: renamed from: a4 */
    public void mo163089a4(RecyclerView recyclerView) {
    }
}
