package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p051p1.mobile.putong.live.livingroom.archi.message.event.KeyboardEventData;
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.entry.HourBoardNewEntryView;

/* JADX INFO: loaded from: classes4.dex */
public class gil extends i6t<oo2, HourBoardNewEntryView> {

    /* JADX INFO: renamed from: i */
    public boolean f104502i;

    /* JADX INFO: renamed from: j */
    public boolean f104503j;

    /* JADX INFO: renamed from: k */
    public boolean f104504k;

    public gil(dum dumVar, HourBoardNewEntryView hourBoardNewEntryView) {
        super(dumVar);
        this.f104503j = false;
        this.f104504k = false;
        mo52715C(hourBoardNewEntryView);
    }

    /* JADX INFO: renamed from: L3 */
    public static /* synthetic */ void m130333L3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N3 */
    public /* synthetic */ void m130334N3(KeyboardEventData keyboardEventData) {
        this.f104504k = keyboardEventData.m73008b();
        m130335M3();
    }

    /* JADX INFO: renamed from: M3 */
    public final void m130335M3() {
        ((HourBoardNewEntryView) this.viewModel).m75912J(this.f104502i && !this.f104504k);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m130336O3(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        if (!bLiveHourLeaderBoardItem.currentHourSuggestConfig.enable) {
            this.f104502i = false;
            ((HourBoardNewEntryView) this.viewModel).m75912J(false);
            return;
        }
        this.f104502i = bLiveHourLeaderBoardItem.isOpen;
        m130335M3();
        if (m213810E2().m202194o().equals(bLiveHourLeaderBoardItem.roomId)) {
            ((HourBoardNewEntryView) this.viewModel).setNewRank(bLiveHourLeaderBoardItem);
        }
    }

    /* JADX INFO: renamed from: P3 */
    public void m130337P3() {
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
        ((HourBoardNewEntryView) this.viewModel).init();
        duringCreated(m213811F2().KeyboardEvent.show().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.dil
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f88664a.m130334N3((KeyboardEventData) obj);
            }
        }));
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        this.f104504k = false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213810E2().m168545q1().m98277d()).subscribe(dhw.m115826e(new y20() { // from class: l.eil
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f94180a.m130336O3((BLiveHourLeaderBoardItem) obj);
            }
        }, new y20() { // from class: l.fil
            @Override // p153l.y20
            public final void call(Object obj) {
                gil.m130333L3((Throwable) obj);
            }
        }));
    }
}
