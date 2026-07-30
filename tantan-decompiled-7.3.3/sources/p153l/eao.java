package p153l;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveIntlGiftLeaderboard;
import com.p051p1.mobile.putong.live.base.data.BLiveIntlGiftStarInfo;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.message.event.KeyboardEventData;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.intlstarboard.IntlLiveStarBoardEntryState;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.intlstarboard.IntlLiveStarBoardEntryView;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.connect.common.Constants;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class eao extends i6t<oo2, IntlLiveStarBoardEntryView> {

    /* JADX INFO: renamed from: i */
    public kcg0 f92794i;

    /* JADX INFO: renamed from: j */
    public kcg0 f92795j;

    /* JADX INFO: renamed from: k */
    public IntlLiveStarBoardEntryState f92796k;

    /* JADX INFO: renamed from: l */
    public BLiveIntlGiftLeaderboard f92797l;

    /* JADX INFO: renamed from: m */
    public int f92798m;

    /* JADX INFO: renamed from: n */
    public final int f92799n;

    /* JADX INFO: renamed from: o */
    public boolean f92800o;

    /* JADX INFO: renamed from: p */
    public boolean f92801p;

    /* JADX INFO: renamed from: q */
    public int f92802q;

    public eao(dum dumVar, IntlLiveStarBoardEntryView intlLiveStarBoardEntryView) {
        super(dumVar);
        this.f92796k = IntlLiveStarBoardEntryState.close;
        this.f92797l = BLiveIntlGiftLeaderboard.new_();
        this.f92798m = 5;
        this.f92799n = 5;
        this.f92802q = 0;
        mo52715C(intlLiveStarBoardEntryView);
    }

    /* JADX INFO: renamed from: T3 */
    private void m120084T3() {
        ((IntlLiveStarBoardEntryView) this.viewModel).m76125p0(this.f92800o && !this.f92801p);
    }

    /* JADX INFO: renamed from: O3 */
    public final void m120085O3(IntlLiveStarBoardEntryState intlLiveStarBoardEntryState) {
        if (intlLiveStarBoardEntryState == IntlLiveStarBoardEntryState.intro) {
            m120086P3();
        } else if (intlLiveStarBoardEntryState == IntlLiveStarBoardEntryState.playOwn) {
            m120087R3();
        }
        if (intlLiveStarBoardEntryState == IntlLiveStarBoardEntryState.playStretch) {
            m120088S3();
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [l.oo2] */
    /* JADX INFO: renamed from: P3 */
    public final void m120086P3() {
        this.f92796k = IntlLiveStarBoardEntryState.intro;
        ((IntlLiveStarBoardEntryView) this.viewModel).m76123n0();
        m138859I3(m213810E2().m168521h2(5, TimeUnit.SECONDS), true).take(1).observeOn(fo0.m126432a()).subscribe(dhw.m115829h(new y20() { // from class: l.dao
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f85898a.m120091W3((Long) obj);
            }
        }));
    }

    @SuppressLint({"StringFormatMatches"})
    /* JADX INFO: renamed from: R3 */
    public final void m120087R3() {
        BLiveIntlGiftStarInfo bLiveIntlGiftStarInfo;
        this.f92796k = IntlLiveStarBoardEntryState.playOwn;
        List<BLiveIntlGiftStarInfo> list = this.f92797l.current;
        y9o y9oVar = new y9o();
        if (jyb.m147479J(list)) {
            bLiveIntlGiftStarInfo = null;
        } else {
            int size = this.f92802q % list.size();
            if (size < 0 || size >= list.size()) {
                this.f92802q = 0;
                bLiveIntlGiftStarInfo = list.get(0);
            } else {
                this.f92802q++;
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
                y9oVar.f198110b = String.format(zrv.f205803e.getString(R$string.f47933Yd), strValueOf);
            } else {
                y9oVar.f198110b = zrv.f205803e.getString(R$string.f47954Zd);
            }
            y9oVar.f198109a = bLiveIntlGiftStarInfo.giftIcon;
            y9oVar.f198111c = bLiveIntlGiftStarInfo.giftId;
        } else {
            y9oVar.f198110b = zrv.f205803e.getString(R$string.f47954Zd);
            y9oVar.f198109a = "";
        }
        ((IntlLiveStarBoardEntryView) this.viewModel).m76122m0(y9oVar);
    }

    /* JADX INFO: renamed from: S3 */
    public final void m120088S3() {
        BLiveIntlGiftStarInfo bLiveIntlGiftStarInfo;
        this.f92796k = IntlLiveStarBoardEntryState.playStretch;
        List<BLiveIntlGiftStarInfo> list = this.f92797l.current;
        y9o y9oVar = new y9o();
        this.f92802q = 0;
        if (jyb.m147479J(list) || (bLiveIntlGiftStarInfo = list.get(0)) == null) {
            return;
        }
        long j = bLiveIntlGiftStarInfo.rank;
        if (j <= 20 && j > 10) {
            y9oVar.f198110b = xau.m209912v(R$string.f48386t7, Constants.VIA_REPORT_TYPE_SHARE_TO_QQ, yau.m214935c(bLiveIntlGiftStarInfo.gap));
            y9oVar.f198109a = bLiveIntlGiftStarInfo.giftIcon;
        } else if (j >= 2 && j <= 10) {
            y9oVar.f198110b = xau.m209911u(R$string.f48408u7, yau.m214935c(bLiveIntlGiftStarInfo.gap));
            y9oVar.f198109a = bLiveIntlGiftStarInfo.giftIcon;
        } else if (j == 1) {
            y9oVar.f198110b = xau.m209911u(R$string.f48430v7, yau.m214935c(bLiveIntlGiftStarInfo.gap));
            y9oVar.f198109a = bLiveIntlGiftStarInfo.giftIcon;
        } else if (j > 0) {
            String strValueOf = String.valueOf(j);
            if (j > 99) {
                strValueOf = "99+";
            }
            y9oVar.f198110b = String.format(zrv.f205803e.getString(R$string.f47933Yd), strValueOf);
            y9oVar.f198109a = bLiveIntlGiftStarInfo.giftIcon;
        } else {
            y9oVar.f198110b = zrv.f205803e.getString(R$string.f47954Zd);
            y9oVar.f198109a = bLiveIntlGiftStarInfo.giftIcon;
        }
        ((IntlLiveStarBoardEntryView) this.viewModel).m76122m0(y9oVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2] */
    /* JADX INFO: renamed from: U3 */
    public final void m120089U3(BLiveIntlGiftLeaderboard bLiveIntlGiftLeaderboard) {
        this.f92800o = bLiveIntlGiftLeaderboard.open;
        m120084T3();
        if (!m213810E2().m168498Z0()) {
            m120090V3(bLiveIntlGiftLeaderboard);
        } else {
            ((IntlLiveStarBoardEntryView) this.viewModel).m76124o0();
            this.f92797l = bLiveIntlGiftLeaderboard;
        }
    }

    /* JADX INFO: renamed from: V3 */
    public final void m120090V3(BLiveIntlGiftLeaderboard bLiveIntlGiftLeaderboard) {
        if (!this.f92800o) {
            psd0.m173633z(this.f92794i);
            psd0.m173633z(this.f92795j);
            return;
        }
        long j = bLiveIntlGiftLeaderboard.config.pollingIntervalInSeconds;
        if (j > 0) {
            m120098d4((int) j);
        } else {
            m120098d4(40);
        }
        long j2 = bLiveIntlGiftLeaderboard.config.scrollIntervalInSeconds;
        if (j2 > 5) {
            this.f92798m = (int) j2;
        }
        this.f92797l = bLiveIntlGiftLeaderboard;
        if (this.f92796k == IntlLiveStarBoardEntryState.close) {
            m120085O3(IntlLiveStarBoardEntryState.intro);
            return;
        }
        if (bLiveIntlGiftLeaderboard.homeStretch) {
            psd0.m173633z(this.f92795j);
            m120085O3(IntlLiveStarBoardEntryState.playStretch);
            return;
        }
        this.f92802q = 0;
        m120085O3(IntlLiveStarBoardEntryState.playOwn);
        if (jyb.m147479J(this.f92797l.current)) {
            return;
        }
        m120097c4();
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m120091W3(Long l2) {
        if (this.f92797l.homeStretch) {
            psd0.m173633z(this.f92795j);
            m120085O3(IntlLiveStarBoardEntryState.playStretch);
        } else {
            m120085O3(IntlLiveStarBoardEntryState.playOwn);
            if (jyb.m147479J(this.f92797l.current)) {
                return;
            }
            m120097c4();
        }
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m120092X3(Long l2) {
        m120085O3(IntlLiveStarBoardEntryState.playOwn);
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m120093Y3(Long l2) {
        m120095a4();
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m120094Z3(KeyboardEventData keyboardEventData) {
        this.f92801p = keyboardEventData.m73008b();
        m120084T3();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.oo2] */
    /* JADX INFO: renamed from: a4 */
    public void m120095a4() {
        kbo.m149075l(m213810E2().m168532l0().f56859id, m213810E2().m168498Z0() ? "voice" : "live");
    }

    /* JADX INFO: renamed from: b4 */
    public void m120096b4(String str) {
        if (NullChecker.m82486a(this.f92797l)) {
            bae0.C15954b c15954b = new bae0.C15954b();
            if (!TextUtils.isEmpty(str)) {
                c15954b.m103155a("giftId", str);
            }
            m213811F2().SchemeHandleEvent.handleScheme().mo199273j(new bae0.C15953a(200).m103154e(this.f92797l.jumpUrl).m103153d(c15954b).m103152c());
            i4g0.m138520r("e_mln_daily_rank_ent", m213815L2() ? "p_anchor_live_room" : "p_user_live_room");
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2] */
    /* JADX INFO: renamed from: c4 */
    public final void m120097c4() {
        kcg0 kcg0Var = this.f92795j;
        if (kcg0Var == null || kcg0Var.isUnsubscribed()) {
            this.f92795j = m138859I3(m213810E2().m168521h2(this.f92798m, TimeUnit.SECONDS), true).observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.bao
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f75722a.m120092X3((Long) obj);
                }
            }));
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2] */
    /* JADX INFO: renamed from: d4 */
    public final void m120098d4(int i) {
        kcg0 kcg0Var = this.f92794i;
        if (kcg0Var == null || kcg0Var.isUnsubscribed()) {
            this.f92794i = m138859I3(m213810E2().m168521h2(i, TimeUnit.SECONDS), true).subscribe(dhw.m115825d(new y20() { // from class: l.cao
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f80608a.m120093Y3((Long) obj);
                }
            }));
        }
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        this.f92796k = IntlLiveStarBoardEntryState.close;
        this.f92797l = BLiveIntlGiftLeaderboard.new_();
        psd0.m173633z(this.f92795j);
        psd0.m173633z(this.f92794i);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.oo2] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(kbo.m149073j()).subscribe(dhw.m115825d(new y20() { // from class: l.z9o
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f203500a.m120089U3((BLiveIntlGiftLeaderboard) obj);
            }
        }));
        duringCreated(m213810E2().m168545q1().m98313p()).subscribe(dhw.m115825d(new y20() { // from class: l.z9o
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f203500a.m120089U3((BLiveIntlGiftLeaderboard) obj);
            }
        }));
        m120095a4();
        duringCreated(m213811F2().KeyboardEvent.show().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.aao
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f69154a.m120094Z3((KeyboardEventData) obj);
            }
        }));
    }
}
