package p153l;

import android.net.Uri;
import com.p051p1.mobile.longlink.msg.live.leaderboard.LongLinkLeaderboard;
import com.p051p1.mobile.putong.live.base.data.BLiveCampaign;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftStarBoard;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftStarInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftStarOther;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.message.event.KeyboardEventData;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.starboard.StarBoardEntryState;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.starboard.StarBoardEntryView;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.CommonH5Builder;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class b2g0 extends i6t<oo2, StarBoardEntryView> {

    /* JADX INFO: renamed from: i */
    public kcg0 f74609i;

    /* JADX INFO: renamed from: j */
    public kcg0 f74610j;

    /* JADX INFO: renamed from: k */
    public StarBoardEntryState f74611k;

    /* JADX INFO: renamed from: l */
    public BLiveGiftStarBoard f74612l;

    /* JADX INFO: renamed from: m */
    public int f74613m;

    /* JADX INFO: renamed from: n */
    public final int f74614n;

    /* JADX INFO: renamed from: o */
    public boolean f74615o;

    /* JADX INFO: renamed from: p */
    public boolean f74616p;

    /* JADX INFO: renamed from: q */
    public boolean f74617q;

    public b2g0(dum dumVar, StarBoardEntryView starBoardEntryView) {
        super(dumVar);
        this.f74611k = StarBoardEntryState.close;
        this.f74612l = BLiveGiftStarBoard.new_();
        this.f74613m = 5;
        this.f74614n = 5;
        this.f74617q = false;
        mo52715C(starBoardEntryView);
    }

    /* JADX INFO: renamed from: U3 */
    private void m102150U3() {
        BLiveGiftStarInfo bLiveGiftStarInfo = this.f74612l.current;
        this.f74611k = StarBoardEntryState.playOwn;
        t1g0 t1g0Var = new t1g0();
        int i = bLiveGiftStarInfo.rank;
        if (i > 0) {
            if (i > bLiveGiftStarInfo.rankShowLimit) {
                t1g0Var.f171668b = String.format(zrv.f205803e.getString(R$string.f47976ae), Integer.valueOf(bLiveGiftStarInfo.rankShowLimit));
            } else {
                t1g0Var.f171668b = String.format(zrv.f205803e.getString(R$string.f47933Yd), Integer.valueOf(bLiveGiftStarInfo.rank));
            }
            t1g0Var.f171667a = bLiveGiftStarInfo.giftIcon;
        } else {
            t1g0Var.f171668b = zrv.f205803e.getString(R$string.f47954Zd);
            if (jyb.m147479J(this.f74612l.leaderboards)) {
                t1g0Var.f171667a = new Uri.Builder().scheme(ShareConstants.RES_PATH).path(String.valueOf(obc0.f146400l2)).build().toString();
            } else {
                t1g0Var.f171667a = this.f74612l.leaderboards.get(0).giftIcon;
            }
        }
        ((StarBoardEntryView) this.viewModel).m76137m0(t1g0Var);
    }

    /* JADX INFO: renamed from: V3 */
    private void m102151V3() {
        ((StarBoardEntryView) this.viewModel).m76139o0(this.f74615o && !this.f74616p);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: d4 */
    private void m102152d4() {
        LivingNormalApiProvider.m72748r7(m213810E2().m168532l0().f56859id, m213810E2().mo183435j().liveMode);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2] */
    /* JADX INFO: renamed from: f4 */
    private void m102153f4() {
        kcg0 kcg0Var = this.f74610j;
        if (kcg0Var == null || kcg0Var.isUnsubscribed()) {
            this.f74610j = m138859I3(m213810E2().m168521h2(this.f74613m, TimeUnit.SECONDS), true).observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.a2g0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f67987a.m102160Y3((Long) obj);
                }
            }));
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2] */
    /* JADX INFO: renamed from: g4 */
    private void m102154g4(int i) {
        kcg0 kcg0Var = this.f74609i;
        if (kcg0Var == null || kcg0Var.isUnsubscribed()) {
            this.f74609i = m138859I3(m213810E2().m168521h2(i, TimeUnit.SECONDS), true).subscribe(dhw.m115825d(new y20() { // from class: l.z1g0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f202555a.m102161Z3((Long) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: R3 */
    public final void m102155R3(StarBoardEntryState starBoardEntryState) {
        if (starBoardEntryState == StarBoardEntryState.intro) {
            m102156S3(starBoardEntryState);
        } else if (starBoardEntryState == StarBoardEntryState.playOwn) {
            m102150U3();
        }
        if (starBoardEntryState == StarBoardEntryState.playOther) {
            m102157T3();
        }
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [l.oo2] */
    /* JADX INFO: renamed from: S3 */
    public final void m102156S3(StarBoardEntryState starBoardEntryState) {
        this.f74611k = StarBoardEntryState.intro;
        ((StarBoardEntryView) this.viewModel).m76138n0();
        m138859I3(m213810E2().m168521h2(5, TimeUnit.SECONDS), true).take(1).observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.y1g0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f197098a.m102159X3((Long) obj);
            }
        }));
        i4g0.m138526x("e_live_giftstar_rank", mo78457R2());
    }

    /* JADX INFO: renamed from: T3 */
    public final void m102157T3() {
        BLiveGiftStarBoard bLiveGiftStarBoard = this.f74612l;
        final BLiveGiftStarInfo bLiveGiftStarInfo = bLiveGiftStarBoard.current;
        this.f74611k = StarBoardEntryState.playOther;
        BLiveGiftStarOther bLiveGiftStarOther = bLiveGiftStarInfo.rank > 0 ? (BLiveGiftStarOther) jyb.m147529r(bLiveGiftStarBoard.leaderboards, new qcj() { // from class: l.x1g0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveGiftStarOther) obj).giftId == bLiveGiftStarInfo.giftId);
            }
        }) : null;
        if (bLiveGiftStarOther == null && !jyb.m147479J(this.f74612l.leaderboards)) {
            bLiveGiftStarOther = this.f74612l.leaderboards.get(0);
        }
        if (bLiveGiftStarOther == null) {
            return;
        }
        t1g0 t1g0Var = new t1g0();
        t1g0Var.f171667a = bLiveGiftStarOther.giftIcon;
        t1g0Var.f171669c = new ArrayList();
        Iterator<BLiveGiftStarInfo> it = bLiveGiftStarOther.topN.iterator();
        while (it.hasNext()) {
            t1g0Var.f171669c.add(it.next().userImage);
        }
        if (jyb.m147479J(t1g0Var.f171669c)) {
            t1g0Var.f171668b = zrv.f205803e.getString(R$string.f47891Wd);
        } else {
            t1g0Var.f171668b = zrv.f205803e.getString(R$string.f47912Xd);
        }
        ((StarBoardEntryView) this.viewModel).m76137m0(t1g0Var);
    }

    /* JADX INFO: renamed from: W3 */
    public final boolean m102158W3(BLiveGiftStarBoard bLiveGiftStarBoard) {
        StarBoardEntryState starBoardEntryState = this.f74611k;
        if (starBoardEntryState != StarBoardEntryState.playOwn && starBoardEntryState != StarBoardEntryState.playOther) {
            return false;
        }
        BLiveGiftStarInfo bLiveGiftStarInfo = this.f74612l.current;
        int i = bLiveGiftStarInfo.giftId;
        BLiveGiftStarInfo bLiveGiftStarInfo2 = bLiveGiftStarBoard.current;
        return (i == bLiveGiftStarInfo2.giftId && bLiveGiftStarInfo.rank == bLiveGiftStarInfo2.rank) ? false : true;
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m102159X3(Long l2) {
        m102155R3(StarBoardEntryState.playOwn);
        m102153f4();
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m102160Y3(Long l2) {
        StarBoardEntryState starBoardEntryState = this.f74611k;
        if (starBoardEntryState == StarBoardEntryState.intro) {
            m102155R3(StarBoardEntryState.playOwn);
            return;
        }
        StarBoardEntryState starBoardEntryState2 = StarBoardEntryState.playOwn;
        if (starBoardEntryState == starBoardEntryState2) {
            m102155R3(StarBoardEntryState.playOther);
        } else if (starBoardEntryState == StarBoardEntryState.playOther) {
            m102155R3(starBoardEntryState2);
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m102161Z3(Long l2) {
        m102152d4();
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ void m102162a4(BLiveGiftStarBoard bLiveGiftStarBoard) {
        this.f74615o = bLiveGiftStarBoard.open;
        m102151V3();
        if (!this.f74615o) {
            psd0.m173633z(this.f74609i);
            return;
        }
        int i = bLiveGiftStarBoard.config.pollingIntervalInSeconds;
        if (i > 0) {
            m102154g4(i);
        }
        int i2 = bLiveGiftStarBoard.config.scrollIntervalInSeconds;
        if (i2 > 5) {
            this.f74613m = i2;
        }
        if (this.f74611k == StarBoardEntryState.close) {
            m102155R3(StarBoardEntryState.intro);
        }
        boolean zM102158W3 = m102158W3(bLiveGiftStarBoard);
        this.f74612l = bLiveGiftStarBoard;
        if (zM102158W3) {
            m102155R3(StarBoardEntryState.playOwn);
        }
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m102163b4(LongLinkLeaderboard.GiftStarLeaderboardChangeMessage giftStarLeaderboardChangeMessage) {
        m102152d4();
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m102164c4(KeyboardEventData keyboardEventData) {
        this.f74616p = keyboardEventData.m73008b();
        m102151V3();
    }

    /* JADX INFO: renamed from: e4 */
    public void m102165e4() {
        i4g0.m138520r("e_live_giftstar_rank", mo78457R2());
        BLiveCampaign bLiveCampaign = new BLiveCampaign();
        bLiveCampaign.detailUrl = efv.f93857n;
        bLiveCampaign.detailInset = jyb.m147507f0(Double.valueOf(1.0d), Double.valueOf(0.75d));
        bLiveCampaign.webBgType = CommonH5Builder.BgType.TRAN_BG;
        bLiveCampaign.detailGravity = 1;
        bLiveCampaign.isNeedCloseBtn = false;
        m213811F2().OpenH5Event.open().mo199273j(px50.m174112c(4600).m174144r(bLiveCampaign).m174143q());
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        this.f74611k = StarBoardEntryState.close;
        this.f74612l = BLiveGiftStarBoard.new_();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.oo2] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(LivingNormalApiProvider.m72520S4()).subscribe(dhw.m115825d(new y20() { // from class: l.u1g0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f177001a.m102162a4((BLiveGiftStarBoard) obj);
            }
        }));
        duringCreated(m213810E2().m168557x0()).subscribe(dhw.m115825d(new y20() { // from class: l.v1g0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f181973a.m102163b4((LongLinkLeaderboard.GiftStarLeaderboardChangeMessage) obj);
            }
        }));
        m102152d4();
        duringCreated(m213811F2().KeyboardEvent.show().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.w1g0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f186814a.m102164c4((KeyboardEventData) obj);
            }
        }));
    }
}
