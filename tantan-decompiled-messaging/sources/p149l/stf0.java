package p149l;

import android.net.Uri;
import com.p046p1.mobile.longlink.msg.live.leaderboard.LongLinkLeaderboard;
import com.p046p1.mobile.putong.live.base.data.BLiveCampaign;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftStarBoard;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftStarInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftStarOther;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.message.event.KeyboardEventData;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.starboard.StarBoardEntryState;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.starboard.StarBoardEntryView;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.CommonH5Builder;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class stf0 extends h4t<ho2, StarBoardEntryView> {

    /* JADX INFO: renamed from: i */
    public c4g0 f166339i;

    /* JADX INFO: renamed from: j */
    public c4g0 f166340j;

    /* JADX INFO: renamed from: k */
    public StarBoardEntryState f166341k;

    /* JADX INFO: renamed from: l */
    public BLiveGiftStarBoard f166342l;

    /* JADX INFO: renamed from: m */
    public int f166343m;

    /* JADX INFO: renamed from: n */
    public final int f166344n;

    /* JADX INFO: renamed from: o */
    public boolean f166345o;

    /* JADX INFO: renamed from: p */
    public boolean f166346p;

    /* JADX INFO: renamed from: q */
    public boolean f166347q;

    public stf0(bsm bsmVar, StarBoardEntryView starBoardEntryView) {
        super(bsmVar);
        this.f166341k = StarBoardEntryState.close;
        this.f166342l = BLiveGiftStarBoard.new_();
        this.f166343m = 5;
        this.f166344n = 5;
        this.f166347q = false;
        mo51532C(starBoardEntryView);
    }

    /* JADX INFO: renamed from: U3 */
    private void m185927U3() {
        BLiveGiftStarInfo bLiveGiftStarInfo = this.f166342l.current;
        this.f166341k = StarBoardEntryState.playOwn;
        ktf0 ktf0Var = new ktf0();
        int i = bLiveGiftStarInfo.rank;
        if (i > 0) {
            if (i > bLiveGiftStarInfo.rankShowLimit) {
                ktf0Var.f124583b = String.format(ypv.f199497e.getString(R$string.f47128ae), Integer.valueOf(bLiveGiftStarInfo.rankShowLimit));
            } else {
                ktf0Var.f124583b = String.format(ypv.f199497e.getString(R$string.f47085Yd), Integer.valueOf(bLiveGiftStarInfo.rank));
            }
            ktf0Var.f124582a = bLiveGiftStarInfo.giftIcon;
        } else {
            ktf0Var.f124583b = ypv.f199497e.getString(R$string.f47106Zd);
            if (vwb.m200296J(this.f166342l.leaderboards)) {
                ktf0Var.f124582a = new Uri.Builder().scheme(ShareConstants.RES_PATH).path(String.valueOf(i3c0.f111072l2)).build().toString();
            } else {
                ktf0Var.f124582a = this.f166342l.leaderboards.get(0).giftIcon;
            }
        }
        ((StarBoardEntryView) this.viewModel).m74954m0(ktf0Var);
    }

    /* JADX INFO: renamed from: V3 */
    private void m185928V3() {
        ((StarBoardEntryView) this.viewModel).m74956o0(this.f166345o && !this.f166346p);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: d4 */
    private void m185929d4() {
        LivingNormalApiProvider.m71565r7(m206027E2().m132146l0().f56011id, m206027E2().mo149813j().liveMode);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX INFO: renamed from: f4 */
    private void m185930f4() {
        c4g0 c4g0Var = this.f166340j;
        if (c4g0Var == null || c4g0Var.isUnsubscribed()) {
            this.f166340j = m129300I3(m206027E2().m132135h2(this.f166343m, TimeUnit.SECONDS), true).observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.rtf0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f160963a.m185937Y3((Long) obj);
                }
            }));
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX INFO: renamed from: g4 */
    private void m185931g4(int i) {
        c4g0 c4g0Var = this.f166339i;
        if (c4g0Var == null || c4g0Var.isUnsubscribed()) {
            this.f166339i = m129300I3(m206027E2().m132135h2(i, TimeUnit.SECONDS), true).subscribe(ffw.m121193d(new e30() { // from class: l.qtf0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f156325a.m185938Z3((Long) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: R3 */
    public final void m185932R3(StarBoardEntryState starBoardEntryState) {
        if (starBoardEntryState == StarBoardEntryState.intro) {
            m185933S3(starBoardEntryState);
        } else if (starBoardEntryState == StarBoardEntryState.playOwn) {
            m185927U3();
        }
        if (starBoardEntryState == StarBoardEntryState.playOther) {
            m185934T3();
        }
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [l.ho2] */
    /* JADX INFO: renamed from: S3 */
    public final void m185933S3(StarBoardEntryState starBoardEntryState) {
        this.f166341k = StarBoardEntryState.intro;
        ((StarBoardEntryView) this.viewModel).m74955n0();
        m129300I3(m206027E2().m132135h2(5, TimeUnit.SECONDS), true).take(1).observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.ptf0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f151159a.m185936X3((Long) obj);
            }
        }));
        zvf0.m220402x("e_live_giftstar_rank", mo77274R2());
    }

    /* JADX INFO: renamed from: T3 */
    public final void m185934T3() {
        BLiveGiftStarBoard bLiveGiftStarBoard = this.f166342l;
        final BLiveGiftStarInfo bLiveGiftStarInfo = bLiveGiftStarBoard.current;
        this.f166341k = StarBoardEntryState.playOther;
        BLiveGiftStarOther bLiveGiftStarOther = bLiveGiftStarInfo.rank > 0 ? (BLiveGiftStarOther) vwb.m200346r(bLiveGiftStarBoard.leaderboards, new w9j() { // from class: l.otf0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveGiftStarOther) obj).giftId == bLiveGiftStarInfo.giftId);
            }
        }) : null;
        if (bLiveGiftStarOther == null && !vwb.m200296J(this.f166342l.leaderboards)) {
            bLiveGiftStarOther = this.f166342l.leaderboards.get(0);
        }
        if (bLiveGiftStarOther == null) {
            return;
        }
        ktf0 ktf0Var = new ktf0();
        ktf0Var.f124582a = bLiveGiftStarOther.giftIcon;
        ktf0Var.f124584c = new ArrayList();
        Iterator<BLiveGiftStarInfo> it = bLiveGiftStarOther.topN.iterator();
        while (it.hasNext()) {
            ktf0Var.f124584c.add(it.next().userImage);
        }
        if (vwb.m200296J(ktf0Var.f124584c)) {
            ktf0Var.f124583b = ypv.f199497e.getString(R$string.f47043Wd);
        } else {
            ktf0Var.f124583b = ypv.f199497e.getString(R$string.f47064Xd);
        }
        ((StarBoardEntryView) this.viewModel).m74954m0(ktf0Var);
    }

    /* JADX INFO: renamed from: W3 */
    public final boolean m185935W3(BLiveGiftStarBoard bLiveGiftStarBoard) {
        StarBoardEntryState starBoardEntryState = this.f166341k;
        if (starBoardEntryState != StarBoardEntryState.playOwn && starBoardEntryState != StarBoardEntryState.playOther) {
            return false;
        }
        BLiveGiftStarInfo bLiveGiftStarInfo = this.f166342l.current;
        int i = bLiveGiftStarInfo.giftId;
        BLiveGiftStarInfo bLiveGiftStarInfo2 = bLiveGiftStarBoard.current;
        return (i == bLiveGiftStarInfo2.giftId && bLiveGiftStarInfo.rank == bLiveGiftStarInfo2.rank) ? false : true;
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m185936X3(Long l2) {
        m185932R3(StarBoardEntryState.playOwn);
        m185930f4();
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m185937Y3(Long l2) {
        StarBoardEntryState starBoardEntryState = this.f166341k;
        if (starBoardEntryState == StarBoardEntryState.intro) {
            m185932R3(StarBoardEntryState.playOwn);
            return;
        }
        StarBoardEntryState starBoardEntryState2 = StarBoardEntryState.playOwn;
        if (starBoardEntryState == starBoardEntryState2) {
            m185932R3(StarBoardEntryState.playOther);
        } else if (starBoardEntryState == StarBoardEntryState.playOther) {
            m185932R3(starBoardEntryState2);
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m185938Z3(Long l2) {
        m185929d4();
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ void m185939a4(BLiveGiftStarBoard bLiveGiftStarBoard) {
        this.f166345o = bLiveGiftStarBoard.open;
        m185928V3();
        if (!this.f166345o) {
            mkd0.m154992z(this.f166339i);
            return;
        }
        int i = bLiveGiftStarBoard.config.pollingIntervalInSeconds;
        if (i > 0) {
            m185931g4(i);
        }
        int i2 = bLiveGiftStarBoard.config.scrollIntervalInSeconds;
        if (i2 > 5) {
            this.f166343m = i2;
        }
        if (this.f166341k == StarBoardEntryState.close) {
            m185932R3(StarBoardEntryState.intro);
        }
        boolean zM185935W3 = m185935W3(bLiveGiftStarBoard);
        this.f166342l = bLiveGiftStarBoard;
        if (zM185935W3) {
            m185932R3(StarBoardEntryState.playOwn);
        }
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m185940b4(LongLinkLeaderboard.GiftStarLeaderboardChangeMessage giftStarLeaderboardChangeMessage) {
        m185929d4();
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m185941c4(KeyboardEventData keyboardEventData) {
        this.f166346p = keyboardEventData.m71825b();
        m185928V3();
    }

    /* JADX INFO: renamed from: e4 */
    public void m185942e4() {
        zvf0.m220396r("e_live_giftstar_rank", mo77274R2());
        BLiveCampaign bLiveCampaign = new BLiveCampaign();
        bLiveCampaign.detailUrl = ddv.f85664n;
        bLiveCampaign.detailInset = vwb.m200324f0(Double.valueOf(1.0d), Double.valueOf(0.75d));
        bLiveCampaign.webBgType = CommonH5Builder.BgType.TRAN_BG;
        bLiveCampaign.detailGravity = 1;
        bLiveCampaign.isNeedCloseBtn = false;
        m206028F2().OpenH5Event.open().mo172463j(jp50.m142568c(4600).m142601r(bLiveCampaign).m142600q());
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        this.f166341k = StarBoardEntryState.close;
        this.f166342l = BLiveGiftStarBoard.new_();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.ho2] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(LivingNormalApiProvider.m71337S4()).subscribe(ffw.m121193d(new e30() { // from class: l.ltf0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f129964a.m185939a4((BLiveGiftStarBoard) obj);
            }
        }));
        duringCreated(m206027E2().m132173x0()).subscribe(ffw.m121193d(new e30() { // from class: l.mtf0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f135593a.m185940b4((LongLinkLeaderboard.GiftStarLeaderboardChangeMessage) obj);
            }
        }));
        m185929d4();
        duringCreated(m206028F2().KeyboardEvent.show().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.ntf0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f140470a.m185941c4((KeyboardEventData) obj);
            }
        }));
    }
}
