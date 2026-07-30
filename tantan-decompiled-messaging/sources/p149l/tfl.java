package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p046p1.mobile.putong.live.livingroom.archi.message.event.KeyboardEventData;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.entry.HourBoardEntryView;

/* JADX INFO: loaded from: classes4.dex */
public class tfl extends h4t<ho2, HourBoardEntryView> {

    /* JADX INFO: renamed from: i */
    public boolean f169999i;

    /* JADX INFO: renamed from: j */
    public boolean f170000j;

    /* JADX INFO: renamed from: k */
    public boolean f170001k;

    public tfl(bsm bsmVar, HourBoardEntryView hourBoardEntryView) {
        super(bsmVar);
        this.f170000j = false;
        this.f170001k = false;
        mo51532C(hourBoardEntryView);
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ void m188743K3(Throwable th) {
    }

    /* JADX INFO: renamed from: M3 */
    private void m188745M3() {
        ((HourBoardEntryView) this.viewModel).m74713q(this.f169999i && !this.f170000j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N3 */
    public /* synthetic */ void m188746N3(KeyboardEventData keyboardEventData) {
        this.f170000j = keyboardEventData.m71825b();
        m188745M3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v3, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: O3 */
    public /* synthetic */ void m188747O3(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        if (bLiveHourLeaderBoardItem.currentHourSuggestConfig.enable) {
            this.f169999i = false;
            ((HourBoardEntryView) this.viewModel).m74713q(false);
            return;
        }
        this.f169999i = bLiveHourLeaderBoardItem.isOpen;
        m188745M3();
        if (m206027E2().m149818o().equals(bLiveHourLeaderBoardItem.roomId)) {
            ((HourBoardEntryView) this.viewModel).setNewRank(bLiveHourLeaderBoardItem.rank);
        }
    }

    /* JADX INFO: renamed from: P3 */
    public void m188748P3() {
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
        duringCreated(m206028F2().KeyboardEvent.show().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.sfl
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f164303a.m188746N3((KeyboardEventData) obj);
            }
        }));
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        this.f170000j = false;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.ho2] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        ((HourBoardEntryView) this.viewModel).init();
        duringCreated(m206027E2().m132160q1().m189095d()).subscribe(ffw.m121194e(new e30() { // from class: l.qfl
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f154140a.m188747O3((BLiveHourLeaderBoardItem) obj);
            }
        }, new e30() { // from class: l.rfl
            @Override // p149l.e30
            public final void call(Object obj) {
                tfl.m188743K3((Throwable) obj);
            }
        }));
    }
}
