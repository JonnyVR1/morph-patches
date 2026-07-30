package p002l;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.archi.message.event.KeyboardEventData;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.intlstarboard.IntlLiveStarBoardEntryState;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.intlstarboard.IntlLiveStarBoardEntryView;
import com.p1.mobile.putong.live.base.data.BLiveIntlGiftLeaderboard;
import com.p1.mobile.putong.live.base.data.BLiveIntlGiftStarInfo;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.concurrent.TimeUnit;
import l.bwr;
import l.c4g0;
import l.e30;
import l.ffw;
import l.jo0;
import l.mkd0;
import l.vwb;
import l.w8u;
import l.x8u;
import l.ypv;
import l.zvf0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class e8o extends h4t<ho2, IntlLiveStarBoardEntryView> {

    /* JADX INFO: renamed from: i */
    public c4g0 f9624i;

    /* JADX INFO: renamed from: j */
    public c4g0 f9625j;

    /* JADX INFO: renamed from: k */
    public IntlLiveStarBoardEntryState f9626k;

    /* JADX INFO: renamed from: l */
    public BLiveIntlGiftLeaderboard f9627l;

    /* JADX INFO: renamed from: m */
    public int f9628m;

    /* JADX INFO: renamed from: n */
    public final int f9629n;

    /* JADX INFO: renamed from: o */
    public boolean f9630o;

    /* JADX INFO: renamed from: p */
    public boolean f9631p;

    /* JADX INFO: renamed from: q */
    public int f9632q;

    public e8o(bsm bsmVar, IntlLiveStarBoardEntryView intlLiveStarBoardEntryView) {
        super(bsmVar);
        this.f9626k = IntlLiveStarBoardEntryState.close;
        this.f9627l = BLiveIntlGiftLeaderboard.new_();
        this.f9628m = 5;
        this.f9629n = 5;
        this.f9632q = 0;
        C(intlLiveStarBoardEntryView);
    }

    /* JADX INFO: renamed from: T3 */
    private void m12277T3() {
        ((IntlLiveStarBoardEntryView) ((bwr) this).viewModel).m8546p0(this.f9630o && !this.f9631p);
    }

    /* JADX INFO: renamed from: O3 */
    public final void m12278O3(IntlLiveStarBoardEntryState intlLiveStarBoardEntryState) {
        if (intlLiveStarBoardEntryState == IntlLiveStarBoardEntryState.intro) {
            m12279P3();
        } else if (intlLiveStarBoardEntryState == IntlLiveStarBoardEntryState.playOwn) {
            m12280R3();
        }
        if (intlLiveStarBoardEntryState == IntlLiveStarBoardEntryState.playStretch) {
            m12281S3();
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [l.ho2] */
    /* JADX INFO: renamed from: P3 */
    public final void m12279P3() {
        this.f9626k = IntlLiveStarBoardEntryState.intro;
        ((IntlLiveStarBoardEntryView) ((bwr) this).viewModel).m8544n0();
        m14187I3(m25547E2().m14571h2(5, TimeUnit.SECONDS), true).take(1).observeOn(jo0.a()).subscribe(ffw.h(new e30() { // from class: l.d8o
            public final void call(Object obj) {
                this.f9115a.m12284W3((Long) obj);
            }
        }));
    }

    @SuppressLint({"StringFormatMatches"})
    /* JADX INFO: renamed from: R3 */
    public final void m12280R3() {
        BLiveIntlGiftStarInfo bLiveIntlGiftStarInfo;
        this.f9626k = IntlLiveStarBoardEntryState.playOwn;
        List list = this.f9627l.current;
        y7o y7oVar = new y7o();
        if (vwb.J(list)) {
            bLiveIntlGiftStarInfo = null;
        } else {
            int size = this.f9632q % list.size();
            if (size < 0 || size >= list.size()) {
                this.f9632q = 0;
                bLiveIntlGiftStarInfo = (BLiveIntlGiftStarInfo) list.get(0);
            } else {
                this.f9632q++;
                bLiveIntlGiftStarInfo = (BLiveIntlGiftStarInfo) list.get(size);
            }
        }
        if (bLiveIntlGiftStarInfo != null) {
            long j = bLiveIntlGiftStarInfo.rank;
            if (j > 0) {
                String strValueOf = String.valueOf(j);
                if (j > 99) {
                    strValueOf = "99+";
                }
                y7oVar.f22731b = String.format(ypv.e.getString(R$string.f3127Yd), strValueOf);
            } else {
                y7oVar.f22731b = ypv.e.getString(R$string.f3148Zd);
            }
            y7oVar.f22730a = bLiveIntlGiftStarInfo.giftIcon;
            y7oVar.f22732c = bLiveIntlGiftStarInfo.giftId;
        } else {
            y7oVar.f22731b = ypv.e.getString(R$string.f3148Zd);
            y7oVar.f22730a = "";
        }
        ((IntlLiveStarBoardEntryView) ((bwr) this).viewModel).m8543m0(y7oVar);
    }

    /* JADX INFO: renamed from: S3 */
    public final void m12281S3() {
        BLiveIntlGiftStarInfo bLiveIntlGiftStarInfo;
        this.f9626k = IntlLiveStarBoardEntryState.playStretch;
        List list = this.f9627l.current;
        y7o y7oVar = new y7o();
        this.f9632q = 0;
        if (vwb.J(list) || (bLiveIntlGiftStarInfo = (BLiveIntlGiftStarInfo) list.get(0)) == null) {
            return;
        }
        long j = bLiveIntlGiftStarInfo.rank;
        if (j <= 20 && j > 10) {
            y7oVar.f22731b = w8u.v(R$string.f3580t7, new Object[]{"10", x8u.c(bLiveIntlGiftStarInfo.gap)});
            y7oVar.f22730a = bLiveIntlGiftStarInfo.giftIcon;
        } else if (j >= 2 && j <= 10) {
            y7oVar.f22731b = w8u.u(R$string.f3602u7, x8u.c(bLiveIntlGiftStarInfo.gap));
            y7oVar.f22730a = bLiveIntlGiftStarInfo.giftIcon;
        } else if (j == 1) {
            y7oVar.f22731b = w8u.u(R$string.f3624v7, x8u.c(bLiveIntlGiftStarInfo.gap));
            y7oVar.f22730a = bLiveIntlGiftStarInfo.giftIcon;
        } else if (j > 0) {
            String strValueOf = String.valueOf(j);
            if (j > 99) {
                strValueOf = "99+";
            }
            y7oVar.f22731b = String.format(ypv.e.getString(R$string.f3127Yd), strValueOf);
            y7oVar.f22730a = bLiveIntlGiftStarInfo.giftIcon;
        } else {
            y7oVar.f22731b = ypv.e.getString(R$string.f3148Zd);
            y7oVar.f22730a = bLiveIntlGiftStarInfo.giftIcon;
        }
        ((IntlLiveStarBoardEntryView) ((bwr) this).viewModel).m8543m0(y7oVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX INFO: renamed from: U3 */
    public final void m12282U3(BLiveIntlGiftLeaderboard bLiveIntlGiftLeaderboard) {
        this.f9630o = bLiveIntlGiftLeaderboard.open;
        m12277T3();
        if (!m25547E2().m14548Z0()) {
            m12283V3(bLiveIntlGiftLeaderboard);
        } else {
            ((IntlLiveStarBoardEntryView) ((bwr) this).viewModel).m8545o0();
            this.f9627l = bLiveIntlGiftLeaderboard;
        }
    }

    /* JADX INFO: renamed from: V3 */
    public final void m12283V3(BLiveIntlGiftLeaderboard bLiveIntlGiftLeaderboard) {
        if (!this.f9630o) {
            mkd0.z(this.f9624i);
            mkd0.z(this.f9625j);
            return;
        }
        long j = bLiveIntlGiftLeaderboard.config.pollingIntervalInSeconds;
        if (j > 0) {
            m12291d4((int) j);
        } else {
            m12291d4(40);
        }
        long j2 = bLiveIntlGiftLeaderboard.config.scrollIntervalInSeconds;
        if (j2 > 5) {
            this.f9628m = (int) j2;
        }
        this.f9627l = bLiveIntlGiftLeaderboard;
        if (this.f9626k == IntlLiveStarBoardEntryState.close) {
            m12278O3(IntlLiveStarBoardEntryState.intro);
            return;
        }
        if (bLiveIntlGiftLeaderboard.homeStretch) {
            mkd0.z(this.f9625j);
            m12278O3(IntlLiveStarBoardEntryState.playStretch);
            return;
        }
        this.f9632q = 0;
        m12278O3(IntlLiveStarBoardEntryState.playOwn);
        if (vwb.J(this.f9627l.current)) {
            return;
        }
        m12290c4();
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m12284W3(Long l2) {
        if (this.f9627l.homeStretch) {
            mkd0.z(this.f9625j);
            m12278O3(IntlLiveStarBoardEntryState.playStretch);
        } else {
            m12278O3(IntlLiveStarBoardEntryState.playOwn);
            if (vwb.J(this.f9627l.current)) {
                return;
            }
            m12290c4();
        }
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m12285X3(Long l2) {
        m12278O3(IntlLiveStarBoardEntryState.playOwn);
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m12286Y3(Long l2) {
        m12288a4();
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m12287Z3(KeyboardEventData keyboardEventData) {
        this.f9631p = keyboardEventData.m5201b();
        m12277T3();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2] */
    /* JADX INFO: renamed from: a4 */
    public void m12288a4() {
        k9o.m16582l(((DbObject) m25547E2().m14582l0()).id, m25547E2().m14548Z0() ? "voice" : "live");
    }

    /* JADX INFO: renamed from: b4 */
    public void m12289b4(String str) {
        if (NullChecker.a(this.f9627l)) {
            x1e0.C0892b c0892b = new x1e0.C0892b();
            if (!TextUtils.isEmpty(str)) {
                c0892b.m25611a("giftId", str);
            }
            m25548F2().SchemeHandleEvent.handleScheme().j(new x1e0.C0891a(200).m25610e(this.f9627l.jumpUrl).m25609d(c0892b).m25608c());
            zvf0.r("e_mln_daily_rank_ent", m25552L2() ? "p_anchor_live_room" : "p_user_live_room");
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX INFO: renamed from: c4 */
    public final void m12290c4() {
        c4g0 c4g0Var = this.f9625j;
        if (c4g0Var == null || c4g0Var.isUnsubscribed()) {
            this.f9625j = m14187I3(m25547E2().m14571h2(this.f9628m, TimeUnit.SECONDS), true).observeOn(jo0.a()).subscribe(ffw.d(new e30() { // from class: l.b8o
                public final void call(Object obj) {
                    this.f8034a.m12285X3((Long) obj);
                }
            }));
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX INFO: renamed from: d4 */
    public final void m12291d4(int i) {
        c4g0 c4g0Var = this.f9624i;
        if (c4g0Var == null || c4g0Var.isUnsubscribed()) {
            this.f9624i = m14187I3(m25547E2().m14571h2(i, TimeUnit.SECONDS), true).subscribe(ffw.d(new e30() { // from class: l.c8o
                public final void call(Object obj) {
                    this.f8543a.m12286Y3((Long) obj);
                }
            }));
        }
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        this.f9626k = IntlLiveStarBoardEntryState.close;
        this.f9627l = BLiveIntlGiftLeaderboard.new_();
        mkd0.z(this.f9625j);
        mkd0.z(this.f9624i);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.ho2] */
    /* JADX INFO: renamed from: t */
    public void m12292t() {
        super.t();
        duringCreated(k9o.m16580j()).subscribe(ffw.d(new e30() { // from class: l.z7o
            public final void call(Object obj) {
                this.f23295a.m12282U3((BLiveIntlGiftLeaderboard) obj);
            }
        }));
        duringCreated(m25547E2().m14596q1().p()).subscribe(ffw.d(new e30() { // from class: l.z7o
            public final void call(Object obj) {
                this.f23295a.m12282U3((BLiveIntlGiftLeaderboard) obj);
            }
        }));
        m12288a4();
        duringCreated((c) m25548F2().KeyboardEvent.show().g()).subscribe(ffw.d(new e30() { // from class: l.a8o
            public final void call(Object obj) {
                this.f7446a.m12287Z3((KeyboardEventData) obj);
            }
        }));
    }
}
