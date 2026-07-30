package p149l;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveIntlGiftLeaderboard;
import com.p046p1.mobile.putong.live.base.data.BLiveIntlGiftStarInfo;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.message.event.KeyboardEventData;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.intlstarboard.IntlLiveStarBoardEntryState;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.intlstarboard.IntlLiveStarBoardEntryView;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.connect.common.Constants;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class e8o extends h4t<ho2, IntlLiveStarBoardEntryView> {

    /* JADX INFO: renamed from: i */
    public c4g0 f89843i;

    /* JADX INFO: renamed from: j */
    public c4g0 f89844j;

    /* JADX INFO: renamed from: k */
    public IntlLiveStarBoardEntryState f89845k;

    /* JADX INFO: renamed from: l */
    public BLiveIntlGiftLeaderboard f89846l;

    /* JADX INFO: renamed from: m */
    public int f89847m;

    /* JADX INFO: renamed from: n */
    public final int f89848n;

    /* JADX INFO: renamed from: o */
    public boolean f89849o;

    /* JADX INFO: renamed from: p */
    public boolean f89850p;

    /* JADX INFO: renamed from: q */
    public int f89851q;

    public e8o(bsm bsmVar, IntlLiveStarBoardEntryView intlLiveStarBoardEntryView) {
        super(bsmVar);
        this.f89845k = IntlLiveStarBoardEntryState.close;
        this.f89846l = BLiveIntlGiftLeaderboard.new_();
        this.f89847m = 5;
        this.f89848n = 5;
        this.f89851q = 0;
        mo51532C(intlLiveStarBoardEntryView);
    }

    /* JADX INFO: renamed from: T3 */
    private void m115262T3() {
        ((IntlLiveStarBoardEntryView) this.viewModel).m74942p0(this.f89849o && !this.f89850p);
    }

    /* JADX INFO: renamed from: O3 */
    public final void m115263O3(IntlLiveStarBoardEntryState intlLiveStarBoardEntryState) {
        if (intlLiveStarBoardEntryState == IntlLiveStarBoardEntryState.intro) {
            m115264P3();
        } else if (intlLiveStarBoardEntryState == IntlLiveStarBoardEntryState.playOwn) {
            m115265R3();
        }
        if (intlLiveStarBoardEntryState == IntlLiveStarBoardEntryState.playStretch) {
            m115266S3();
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [l.ho2] */
    /* JADX INFO: renamed from: P3 */
    public final void m115264P3() {
        this.f89845k = IntlLiveStarBoardEntryState.intro;
        ((IntlLiveStarBoardEntryView) this.viewModel).m74940n0();
        m129300I3(m206027E2().m132135h2(5, TimeUnit.SECONDS), true).take(1).observeOn(jo0.m142408a()).subscribe(ffw.m121197h(new e30() { // from class: l.d8o
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f84881a.m115269W3((Long) obj);
            }
        }));
    }

    @SuppressLint({"StringFormatMatches"})
    /* JADX INFO: renamed from: R3 */
    public final void m115265R3() {
        BLiveIntlGiftStarInfo bLiveIntlGiftStarInfo;
        this.f89845k = IntlLiveStarBoardEntryState.playOwn;
        List<BLiveIntlGiftStarInfo> list = this.f89846l.current;
        y7o y7oVar = new y7o();
        if (vwb.m200296J(list)) {
            bLiveIntlGiftStarInfo = null;
        } else {
            int size = this.f89851q % list.size();
            if (size < 0 || size >= list.size()) {
                this.f89851q = 0;
                bLiveIntlGiftStarInfo = list.get(0);
            } else {
                this.f89851q++;
                bLiveIntlGiftStarInfo = list.get(size);
            }
        }
        if (bLiveIntlGiftStarInfo != null) {
            long j = bLiveIntlGiftStarInfo.rank;
            if (j > 0) {
                String strValueOf = String.valueOf(j);
                if (j > 99) {
                    strValueOf = "99+";
                }
                y7oVar.f196717b = String.format(ypv.f199497e.getString(R$string.f47085Yd), strValueOf);
            } else {
                y7oVar.f196717b = ypv.f199497e.getString(R$string.f47106Zd);
            }
            y7oVar.f196716a = bLiveIntlGiftStarInfo.giftIcon;
            y7oVar.f196718c = bLiveIntlGiftStarInfo.giftId;
        } else {
            y7oVar.f196717b = ypv.f199497e.getString(R$string.f47106Zd);
            y7oVar.f196716a = "";
        }
        ((IntlLiveStarBoardEntryView) this.viewModel).m74939m0(y7oVar);
    }

    /* JADX INFO: renamed from: S3 */
    public final void m115266S3() {
        BLiveIntlGiftStarInfo bLiveIntlGiftStarInfo;
        this.f89845k = IntlLiveStarBoardEntryState.playStretch;
        List<BLiveIntlGiftStarInfo> list = this.f89846l.current;
        y7o y7oVar = new y7o();
        this.f89851q = 0;
        if (vwb.m200296J(list) || (bLiveIntlGiftStarInfo = list.get(0)) == null) {
            return;
        }
        long j = bLiveIntlGiftStarInfo.rank;
        if (j <= 20 && j > 10) {
            y7oVar.f196717b = w8u.m202219v(R$string.f47538t7, Constants.VIA_REPORT_TYPE_SHARE_TO_QQ, x8u.m207433c(bLiveIntlGiftStarInfo.gap));
            y7oVar.f196716a = bLiveIntlGiftStarInfo.giftIcon;
        } else if (j >= 2 && j <= 10) {
            y7oVar.f196717b = w8u.m202218u(R$string.f47560u7, x8u.m207433c(bLiveIntlGiftStarInfo.gap));
            y7oVar.f196716a = bLiveIntlGiftStarInfo.giftIcon;
        } else if (j == 1) {
            y7oVar.f196717b = w8u.m202218u(R$string.f47582v7, x8u.m207433c(bLiveIntlGiftStarInfo.gap));
            y7oVar.f196716a = bLiveIntlGiftStarInfo.giftIcon;
        } else if (j > 0) {
            String strValueOf = String.valueOf(j);
            if (j > 99) {
                strValueOf = "99+";
            }
            y7oVar.f196717b = String.format(ypv.f199497e.getString(R$string.f47085Yd), strValueOf);
            y7oVar.f196716a = bLiveIntlGiftStarInfo.giftIcon;
        } else {
            y7oVar.f196717b = ypv.f199497e.getString(R$string.f47106Zd);
            y7oVar.f196716a = bLiveIntlGiftStarInfo.giftIcon;
        }
        ((IntlLiveStarBoardEntryView) this.viewModel).m74939m0(y7oVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX INFO: renamed from: U3 */
    public final void m115267U3(BLiveIntlGiftLeaderboard bLiveIntlGiftLeaderboard) {
        this.f89849o = bLiveIntlGiftLeaderboard.open;
        m115262T3();
        if (!m206027E2().m132112Z0()) {
            m115268V3(bLiveIntlGiftLeaderboard);
        } else {
            ((IntlLiveStarBoardEntryView) this.viewModel).m74941o0();
            this.f89846l = bLiveIntlGiftLeaderboard;
        }
    }

    /* JADX INFO: renamed from: V3 */
    public final void m115268V3(BLiveIntlGiftLeaderboard bLiveIntlGiftLeaderboard) {
        if (!this.f89849o) {
            mkd0.m154992z(this.f89843i);
            mkd0.m154992z(this.f89844j);
            return;
        }
        long j = bLiveIntlGiftLeaderboard.config.pollingIntervalInSeconds;
        if (j > 0) {
            m115276d4((int) j);
        } else {
            m115276d4(40);
        }
        long j2 = bLiveIntlGiftLeaderboard.config.scrollIntervalInSeconds;
        if (j2 > 5) {
            this.f89847m = (int) j2;
        }
        this.f89846l = bLiveIntlGiftLeaderboard;
        if (this.f89845k == IntlLiveStarBoardEntryState.close) {
            m115263O3(IntlLiveStarBoardEntryState.intro);
            return;
        }
        if (bLiveIntlGiftLeaderboard.homeStretch) {
            mkd0.m154992z(this.f89844j);
            m115263O3(IntlLiveStarBoardEntryState.playStretch);
            return;
        }
        this.f89851q = 0;
        m115263O3(IntlLiveStarBoardEntryState.playOwn);
        if (vwb.m200296J(this.f89846l.current)) {
            return;
        }
        m115275c4();
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m115269W3(Long l2) {
        if (this.f89846l.homeStretch) {
            mkd0.m154992z(this.f89844j);
            m115263O3(IntlLiveStarBoardEntryState.playStretch);
        } else {
            m115263O3(IntlLiveStarBoardEntryState.playOwn);
            if (vwb.m200296J(this.f89846l.current)) {
                return;
            }
            m115275c4();
        }
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m115270X3(Long l2) {
        m115263O3(IntlLiveStarBoardEntryState.playOwn);
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m115271Y3(Long l2) {
        m115273a4();
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m115272Z3(KeyboardEventData keyboardEventData) {
        this.f89850p = keyboardEventData.m71825b();
        m115262T3();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2] */
    /* JADX INFO: renamed from: a4 */
    public void m115273a4() {
        k9o.m145112l(m206027E2().m132146l0().f56011id, m206027E2().m132112Z0() ? "voice" : "live");
    }

    /* JADX INFO: renamed from: b4 */
    public void m115274b4(String str) {
        if (NullChecker.m81303a(this.f89846l)) {
            x1e0.C21019b c21019b = new x1e0.C21019b();
            if (!TextUtils.isEmpty(str)) {
                c21019b.m206702a("giftId", str);
            }
            m206028F2().SchemeHandleEvent.handleScheme().mo172463j(new x1e0.C21018a(200).m206701e(this.f89846l.jumpUrl).m206700d(c21019b).m206699c());
            zvf0.m220396r("e_mln_daily_rank_ent", m206032L2() ? "p_anchor_live_room" : "p_user_live_room");
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX INFO: renamed from: c4 */
    public final void m115275c4() {
        c4g0 c4g0Var = this.f89844j;
        if (c4g0Var == null || c4g0Var.isUnsubscribed()) {
            this.f89844j = m129300I3(m206027E2().m132135h2(this.f89847m, TimeUnit.SECONDS), true).observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.b8o
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f74137a.m115270X3((Long) obj);
                }
            }));
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX INFO: renamed from: d4 */
    public final void m115276d4(int i) {
        c4g0 c4g0Var = this.f89843i;
        if (c4g0Var == null || c4g0Var.isUnsubscribed()) {
            this.f89843i = m129300I3(m206027E2().m132135h2(i, TimeUnit.SECONDS), true).subscribe(ffw.m121193d(new e30() { // from class: l.c8o
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f79776a.m115271Y3((Long) obj);
                }
            }));
        }
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        this.f89845k = IntlLiveStarBoardEntryState.close;
        this.f89846l = BLiveIntlGiftLeaderboard.new_();
        mkd0.m154992z(this.f89844j);
        mkd0.m154992z(this.f89843i);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.ho2] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(k9o.m145110j()).subscribe(ffw.m121193d(new e30() { // from class: l.z7o
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f202044a.m115267U3((BLiveIntlGiftLeaderboard) obj);
            }
        }));
        duringCreated(m206027E2().m132160q1().m189131p()).subscribe(ffw.m121193d(new e30() { // from class: l.z7o
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f202044a.m115267U3((BLiveIntlGiftLeaderboard) obj);
            }
        }));
        m115273a4();
        duringCreated(m206028F2().KeyboardEvent.show().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.a8o
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f68058a.m115272Z3((KeyboardEventData) obj);
            }
        }));
    }
}
