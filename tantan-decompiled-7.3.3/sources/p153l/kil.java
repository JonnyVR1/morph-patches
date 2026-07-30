package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p051p1.mobile.putong.live.livingroom.archi.message.event.KeyboardEventData;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.entry.HourBoardEntryView;

/* JADX INFO: loaded from: classes4.dex */
public class kil extends i6t<oo2, HourBoardEntryView> {

    /* JADX INFO: renamed from: i */
    public boolean f127004i;

    /* JADX INFO: renamed from: j */
    public boolean f127005j;

    /* JADX INFO: renamed from: k */
    public boolean f127006k;

    public kil(dum dumVar, HourBoardEntryView hourBoardEntryView) {
        super(dumVar);
        this.f127005j = false;
        this.f127006k = false;
        mo52715C(hourBoardEntryView);
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ void m149911K3(Throwable th) {
    }

    /* JADX INFO: renamed from: M3 */
    private void m149913M3() {
        ((HourBoardEntryView) this.viewModel).m75896q(this.f127004i && !this.f127005j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N3 */
    public /* synthetic */ void m149914N3(KeyboardEventData keyboardEventData) {
        this.f127005j = keyboardEventData.m73008b();
        m149913M3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v3, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: O3 */
    public /* synthetic */ void m149915O3(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        if (bLiveHourLeaderBoardItem.currentHourSuggestConfig.enable) {
            this.f127004i = false;
            ((HourBoardEntryView) this.viewModel).m75896q(false);
            return;
        }
        this.f127004i = bLiveHourLeaderBoardItem.isOpen;
        m149913M3();
        if (m213810E2().m202194o().equals(bLiveHourLeaderBoardItem.roomId)) {
            ((HourBoardEntryView) this.viewModel).setNewRank(bLiveHourLeaderBoardItem.rank);
        }
    }

    /* JADX INFO: renamed from: P3 */
    public void m149916P3() {
        String strM203752v4 = zrv.m221193k().m203752v4();
        if (TextUtils.isEmpty(strM203752v4) || wft.m206159b(2)) {
            m213811F2().HourLeaderBoardEvent.show().mo199273j(Boolean.TRUE);
        } else {
            m213811F2().SchemeHandleEvent.handleScheme().mo199273j(bae0.m103149b(3400, strM203752v4));
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m213811F2().KeyboardEvent.show().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.jil
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f121098a.m149914N3((KeyboardEventData) obj);
            }
        }));
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        this.f127005j = false;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.oo2] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        ((HourBoardEntryView) this.viewModel).init();
        duringCreated(m213810E2().m168545q1().m98277d()).subscribe(dhw.m115826e(new y20() { // from class: l.hil
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f110034a.m149915O3((BLiveHourLeaderBoardItem) obj);
            }
        }, new y20() { // from class: l.iil
            @Override // p153l.y20
            public final void call(Object obj) {
                kil.m149911K3((Throwable) obj);
            }
        }));
    }
}
