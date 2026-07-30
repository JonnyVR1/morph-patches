package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p046p1.mobile.putong.live.livingroom.archi.message.event.KeyboardEventData;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.entry.HourBoardNewEntryView;

/* JADX INFO: loaded from: classes4.dex */
public class pfl extends h4t<ho2, HourBoardNewEntryView> {

    /* JADX INFO: renamed from: i */
    public boolean f148570i;

    /* JADX INFO: renamed from: j */
    public boolean f148571j;

    /* JADX INFO: renamed from: k */
    public boolean f148572k;

    public pfl(bsm bsmVar, HourBoardNewEntryView hourBoardNewEntryView) {
        super(bsmVar);
        this.f148571j = false;
        this.f148572k = false;
        mo51532C(hourBoardNewEntryView);
    }

    /* JADX INFO: renamed from: L3 */
    public static /* synthetic */ void m168644L3(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N3 */
    public /* synthetic */ void m168645N3(KeyboardEventData keyboardEventData) {
        this.f148572k = keyboardEventData.m71825b();
        m168646M3();
    }

    /* JADX INFO: renamed from: M3 */
    public final void m168646M3() {
        ((HourBoardNewEntryView) this.viewModel).m74729J(this.f148570i && !this.f148572k);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m168647O3(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        if (!bLiveHourLeaderBoardItem.currentHourSuggestConfig.enable) {
            this.f148570i = false;
            ((HourBoardNewEntryView) this.viewModel).m74729J(false);
            return;
        }
        this.f148570i = bLiveHourLeaderBoardItem.isOpen;
        m168646M3();
        if (m206027E2().m149818o().equals(bLiveHourLeaderBoardItem.roomId)) {
            ((HourBoardNewEntryView) this.viewModel).setNewRank(bLiveHourLeaderBoardItem);
        }
    }

    /* JADX INFO: renamed from: P3 */
    public void m168648P3() {
        String strM195965v4 = ypv.m215672k().m195965v4();
        if (TextUtils.isEmpty(strM195965v4) || vdt.m198092b(2)) {
            m206028F2().HourLeaderBoardEvent.show().mo172463j(Boolean.TRUE);
        } else {
            m206028F2().SchemeHandleEvent.handleScheme().mo172463j(x1e0.m206696b(3400, strM195965v4));
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        ((HourBoardNewEntryView) this.viewModel).init();
        duringCreated(m206028F2().KeyboardEvent.show().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.mfl
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f133600a.m168645N3((KeyboardEventData) obj);
            }
        }));
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        this.f148572k = false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206027E2().m132160q1().m189095d()).subscribe(ffw.m121194e(new e30() { // from class: l.nfl
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f138802a.m168647O3((BLiveHourLeaderBoardItem) obj);
            }
        }, new e30() { // from class: l.ofl
            @Override // p149l.e30
            public final void call(Object obj) {
                pfl.m168644L3((Throwable) obj);
            }
        }));
    }
}
