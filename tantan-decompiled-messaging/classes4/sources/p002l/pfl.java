package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.archi.message.event.KeyboardEventData;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.entry.HourBoardNewEntryView;
import com.p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import l.bwr;
import l.e30;
import l.ffw;
import l.vdt;
import l.ypv;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class pfl extends h4t<ho2, HourBoardNewEntryView> {

    /* JADX INFO: renamed from: i */
    public boolean f17252i;

    /* JADX INFO: renamed from: j */
    public boolean f17253j;

    /* JADX INFO: renamed from: k */
    public boolean f17254k;

    public pfl(bsm bsmVar, HourBoardNewEntryView hourBoardNewEntryView) {
        super(bsmVar);
        this.f17253j = false;
        this.f17254k = false;
        C(hourBoardNewEntryView);
    }

    /* JADX INFO: renamed from: L3 */
    public static /* synthetic */ void m20231L3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N3 */
    public /* synthetic */ void m20232N3(KeyboardEventData keyboardEventData) {
        this.f17254k = keyboardEventData.m5201b();
        m20233M3();
    }

    /* JADX INFO: renamed from: M3 */
    public final void m20233M3() {
        ((HourBoardNewEntryView) ((bwr) this).viewModel).m8326J(this.f17252i && !this.f17254k);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m20234O3(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        if (!bLiveHourLeaderBoardItem.currentHourSuggestConfig.enable) {
            this.f17252i = false;
            ((HourBoardNewEntryView) ((bwr) this).viewModel).m8326J(false);
            return;
        }
        this.f17252i = bLiveHourLeaderBoardItem.isOpen;
        m20233M3();
        if (m25547E2().m17239o().equals(bLiveHourLeaderBoardItem.roomId)) {
            ((HourBoardNewEntryView) ((bwr) this).viewModel).setNewRank(bLiveHourLeaderBoardItem);
        }
    }

    /* JADX INFO: renamed from: P3 */
    public void m20235P3() {
        String strV4 = ypv.k().v4();
        if (TextUtils.isEmpty(strV4) || vdt.b(2)) {
            m25548F2().HourLeaderBoardEvent.show().j(Boolean.TRUE);
        } else {
            m25548F2().SchemeHandleEvent.handleScheme().j(x1e0.m25605b(3400, strV4));
        }
    }

    /* JADX INFO: renamed from: T */
    public void m20236T() {
        super.T();
        ((HourBoardNewEntryView) ((bwr) this).viewModel).init();
        duringCreated((c) m25548F2().KeyboardEvent.show().g()).subscribe(ffw.d(new e30() { // from class: l.mfl
            public final void call(Object obj) {
                this.f15371a.m20232N3((KeyboardEventData) obj);
            }
        }));
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        this.f17254k = false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    /* JADX INFO: renamed from: t */
    public void m20237t() {
        super.t();
        duringCreated(m25547E2().m14596q1().d()).subscribe(ffw.e(new e30() { // from class: l.nfl
            public final void call(Object obj) {
                this.f16013a.m20234O3((BLiveHourLeaderBoardItem) obj);
            }
        }, new e30() { // from class: l.ofl
            public final void call(Object obj) {
                pfl.m20231L3((Throwable) obj);
            }
        }));
    }
}
