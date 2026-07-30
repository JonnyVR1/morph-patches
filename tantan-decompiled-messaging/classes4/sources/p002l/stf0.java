package p002l;

import android.net.Uri;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p000p1.mobile.putong.live.livingroom.archi.message.event.KeyboardEventData;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.starboard.StarBoardEntryState;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.starboard.StarBoardEntryView;
import com.p1.mobile.longlink.msg.live.leaderboard.LongLinkLeaderboard;
import com.p1.mobile.putong.live.base.data.BLiveCampaign;
import com.p1.mobile.putong.live.base.data.BLiveGiftStarBoard;
import com.p1.mobile.putong.live.base.data.BLiveGiftStarInfo;
import com.p1.mobile.putong.live.base.data.BLiveGiftStarOther;
import com.p1.mobile.putong.ui.webview.mk.CommonH5Builder;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import l.bwr;
import l.c4g0;
import l.ddv;
import l.e30;
import l.ffw;
import l.jo0;
import l.mkd0;
import l.vwb;
import l.w9j;
import l.ypv;
import l.zvf0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class stf0 extends h4t<ho2, StarBoardEntryView> {

    /* JADX INFO: renamed from: i */
    public c4g0 f19283i;

    /* JADX INFO: renamed from: j */
    public c4g0 f19284j;

    /* JADX INFO: renamed from: k */
    public StarBoardEntryState f19285k;

    /* JADX INFO: renamed from: l */
    public BLiveGiftStarBoard f19286l;

    /* JADX INFO: renamed from: m */
    public int f19287m;

    /* JADX INFO: renamed from: n */
    public final int f19288n;

    /* JADX INFO: renamed from: o */
    public boolean f19289o;

    /* JADX INFO: renamed from: p */
    public boolean f19290p;

    /* JADX INFO: renamed from: q */
    public boolean f19291q;

    public stf0(bsm bsmVar, StarBoardEntryView starBoardEntryView) {
        super(bsmVar);
        this.f19285k = StarBoardEntryState.close;
        this.f19286l = BLiveGiftStarBoard.new_();
        this.f19287m = 5;
        this.f19288n = 5;
        this.f19291q = false;
        C(starBoardEntryView);
    }

    /* JADX INFO: renamed from: U3 */
    private void m22688U3() {
        BLiveGiftStarInfo bLiveGiftStarInfo = this.f19286l.current;
        this.f19285k = StarBoardEntryState.playOwn;
        ktf0 ktf0Var = new ktf0();
        int i = bLiveGiftStarInfo.rank;
        if (i > 0) {
            if (i > bLiveGiftStarInfo.rankShowLimit) {
                ktf0Var.f14508b = String.format(ypv.e.getString(R$string.f3170ae), Integer.valueOf(bLiveGiftStarInfo.rankShowLimit));
            } else {
                ktf0Var.f14508b = String.format(ypv.e.getString(R$string.f3127Yd), Integer.valueOf(bLiveGiftStarInfo.rank));
            }
            ktf0Var.f14507a = bLiveGiftStarInfo.giftIcon;
        } else {
            ktf0Var.f14508b = ypv.e.getString(R$string.f3148Zd);
            if (vwb.J(this.f19286l.leaderboards)) {
                ktf0Var.f14507a = new Uri.Builder().scheme("res").path(String.valueOf(i3c0.f12857l2)).build().toString();
            } else {
                ktf0Var.f14507a = ((BLiveGiftStarOther) this.f19286l.leaderboards.get(0)).giftIcon;
            }
        }
        ((StarBoardEntryView) ((bwr) this).viewModel).m8560m0(ktf0Var);
    }

    /* JADX INFO: renamed from: V3 */
    private void m22689V3() {
        ((StarBoardEntryView) ((bwr) this).viewModel).m8562o0(this.f19289o && !this.f19290p);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: d4 */
    private void m22690d4() {
        LivingNormalApiProvider.m4931r7(((DbObject) m25547E2().m14582l0()).id, m25547E2().m17234j().liveMode);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX INFO: renamed from: f4 */
    private void m22691f4() {
        c4g0 c4g0Var = this.f19284j;
        if (c4g0Var == null || c4g0Var.isUnsubscribed()) {
            this.f19284j = m14187I3(m25547E2().m14571h2(this.f19287m, TimeUnit.SECONDS), true).observeOn(jo0.a()).subscribe(ffw.d(new e30() { // from class: l.rtf0
                public final void call(Object obj) {
                    this.f18674a.m22698Y3((Long) obj);
                }
            }));
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX INFO: renamed from: g4 */
    private void m22692g4(int i) {
        c4g0 c4g0Var = this.f19283i;
        if (c4g0Var == null || c4g0Var.isUnsubscribed()) {
            this.f19283i = m14187I3(m25547E2().m14571h2(i, TimeUnit.SECONDS), true).subscribe(ffw.d(new e30() { // from class: l.qtf0
                public final void call(Object obj) {
                    this.f18212a.m22699Z3((Long) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: R3 */
    public final void m22693R3(StarBoardEntryState starBoardEntryState) {
        if (starBoardEntryState == StarBoardEntryState.intro) {
            m22694S3(starBoardEntryState);
        } else if (starBoardEntryState == StarBoardEntryState.playOwn) {
            m22688U3();
        }
        if (starBoardEntryState == StarBoardEntryState.playOther) {
            m22695T3();
        }
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [l.ho2] */
    /* JADX INFO: renamed from: S3 */
    public final void m22694S3(StarBoardEntryState starBoardEntryState) {
        this.f19285k = StarBoardEntryState.intro;
        ((StarBoardEntryView) ((bwr) this).viewModel).m8561n0();
        m14187I3(m25547E2().m14571h2(5, TimeUnit.SECONDS), true).take(1).observeOn(jo0.a()).subscribe(ffw.d(new e30() { // from class: l.ptf0
            public final void call(Object obj) {
                this.f17641a.m22697X3((Long) obj);
            }
        }));
        zvf0.x("e_live_giftstar_rank", mo21430R2());
    }

    /* JADX INFO: renamed from: T3 */
    public final void m22695T3() {
        BLiveGiftStarBoard bLiveGiftStarBoard = this.f19286l;
        final BLiveGiftStarInfo bLiveGiftStarInfo = bLiveGiftStarBoard.current;
        this.f19285k = StarBoardEntryState.playOther;
        BLiveGiftStarOther bLiveGiftStarOther = bLiveGiftStarInfo.rank > 0 ? (BLiveGiftStarOther) vwb.r(bLiveGiftStarBoard.leaderboards, new w9j() { // from class: l.otf0
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveGiftStarOther) obj).giftId == bLiveGiftStarInfo.giftId);
            }
        }) : null;
        if (bLiveGiftStarOther == null && !vwb.J(this.f19286l.leaderboards)) {
            bLiveGiftStarOther = (BLiveGiftStarOther) this.f19286l.leaderboards.get(0);
        }
        if (bLiveGiftStarOther == null) {
            return;
        }
        ktf0 ktf0Var = new ktf0();
        ktf0Var.f14507a = bLiveGiftStarOther.giftIcon;
        ktf0Var.f14509c = new ArrayList();
        Iterator it = bLiveGiftStarOther.topN.iterator();
        while (it.hasNext()) {
            ktf0Var.f14509c.add(((BLiveGiftStarInfo) it.next()).userImage);
        }
        if (vwb.J(ktf0Var.f14509c)) {
            ktf0Var.f14508b = ypv.e.getString(R$string.f3085Wd);
        } else {
            ktf0Var.f14508b = ypv.e.getString(R$string.f3106Xd);
        }
        ((StarBoardEntryView) ((bwr) this).viewModel).m8560m0(ktf0Var);
    }

    /* JADX INFO: renamed from: W3 */
    public final boolean m22696W3(BLiveGiftStarBoard bLiveGiftStarBoard) {
        StarBoardEntryState starBoardEntryState = this.f19285k;
        if (starBoardEntryState != StarBoardEntryState.playOwn && starBoardEntryState != StarBoardEntryState.playOther) {
            return false;
        }
        BLiveGiftStarInfo bLiveGiftStarInfo = this.f19286l.current;
        int i = bLiveGiftStarInfo.giftId;
        BLiveGiftStarInfo bLiveGiftStarInfo2 = bLiveGiftStarBoard.current;
        return (i == bLiveGiftStarInfo2.giftId && bLiveGiftStarInfo.rank == bLiveGiftStarInfo2.rank) ? false : true;
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m22697X3(Long l2) {
        m22693R3(StarBoardEntryState.playOwn);
        m22691f4();
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m22698Y3(Long l2) {
        StarBoardEntryState starBoardEntryState = this.f19285k;
        if (starBoardEntryState == StarBoardEntryState.intro) {
            m22693R3(StarBoardEntryState.playOwn);
            return;
        }
        StarBoardEntryState starBoardEntryState2 = StarBoardEntryState.playOwn;
        if (starBoardEntryState == starBoardEntryState2) {
            m22693R3(StarBoardEntryState.playOther);
        } else if (starBoardEntryState == StarBoardEntryState.playOther) {
            m22693R3(starBoardEntryState2);
        }
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m22699Z3(Long l2) {
        m22690d4();
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ void m22700a4(BLiveGiftStarBoard bLiveGiftStarBoard) {
        this.f19289o = bLiveGiftStarBoard.open;
        m22689V3();
        if (!this.f19289o) {
            mkd0.z(this.f19283i);
            return;
        }
        int i = bLiveGiftStarBoard.config.pollingIntervalInSeconds;
        if (i > 0) {
            m22692g4(i);
        }
        int i2 = bLiveGiftStarBoard.config.scrollIntervalInSeconds;
        if (i2 > 5) {
            this.f19287m = i2;
        }
        if (this.f19285k == StarBoardEntryState.close) {
            m22693R3(StarBoardEntryState.intro);
        }
        boolean zM22696W3 = m22696W3(bLiveGiftStarBoard);
        this.f19286l = bLiveGiftStarBoard;
        if (zM22696W3) {
            m22693R3(StarBoardEntryState.playOwn);
        }
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m22701b4(LongLinkLeaderboard.GiftStarLeaderboardChangeMessage giftStarLeaderboardChangeMessage) {
        m22690d4();
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m22702c4(KeyboardEventData keyboardEventData) {
        this.f19290p = keyboardEventData.m5201b();
        m22689V3();
    }

    /* JADX INFO: renamed from: e4 */
    public void m22703e4() {
        zvf0.r("e_live_giftstar_rank", mo21430R2());
        BLiveCampaign bLiveCampaign = new BLiveCampaign();
        bLiveCampaign.detailUrl = ddv.n;
        bLiveCampaign.detailInset = vwb.f0(new Double[]{Double.valueOf(1.0d), Double.valueOf(0.75d)});
        bLiveCampaign.webBgType = CommonH5Builder.BgType.TRAN_BG;
        bLiveCampaign.detailGravity = 1;
        bLiveCampaign.isNeedCloseBtn = false;
        m25548F2().OpenH5Event.open().j(jp50.m16064c(4600).m16097r(bLiveCampaign).m16096q());
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        this.f19285k = StarBoardEntryState.close;
        this.f19286l = BLiveGiftStarBoard.new_();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.ho2] */
    /* JADX INFO: renamed from: t */
    public void m22704t() {
        super.t();
        duringCreated(LivingNormalApiProvider.m4703S4()).subscribe(ffw.d(new e30() { // from class: l.ltf0
            public final void call(Object obj) {
                this.f15052a.m22700a4((BLiveGiftStarBoard) obj);
            }
        }));
        duringCreated(m25547E2().m14609x0()).subscribe(ffw.d(new e30() { // from class: l.mtf0
            public final void call(Object obj) {
                this.f15625a.m22701b4((LongLinkLeaderboard.GiftStarLeaderboardChangeMessage) obj);
            }
        }));
        m22690d4();
        duringCreated((c) m25548F2().KeyboardEvent.show().g()).subscribe(ffw.d(new e30() { // from class: l.ntf0
            public final void call(Object obj) {
                this.f16190a.m22702c4((KeyboardEventData) obj);
            }
        }));
    }
}
