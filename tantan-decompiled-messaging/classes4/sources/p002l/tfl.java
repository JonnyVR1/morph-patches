package p002l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.archi.message.event.KeyboardEventData;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.entry.HourBoardEntryView;
import com.p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import l.bwr;
import l.e30;
import l.ffw;
import l.vdt;
import l.ypv;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class tfl extends h4t<ho2, HourBoardEntryView> {

    /* JADX INFO: renamed from: i */
    public boolean f20219i;

    /* JADX INFO: renamed from: j */
    public boolean f20220j;

    /* JADX INFO: renamed from: k */
    public boolean f20221k;

    public tfl(bsm bsmVar, HourBoardEntryView hourBoardEntryView) {
        super(bsmVar);
        this.f20220j = false;
        this.f20221k = false;
        C(hourBoardEntryView);
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ void m22943K3(Throwable th) {
    }

    /* JADX INFO: renamed from: M3 */
    private void m22945M3() {
        ((HourBoardEntryView) ((bwr) this).viewModel).m8309q(this.f20219i && !this.f20220j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N3 */
    public /* synthetic */ void m22946N3(KeyboardEventData keyboardEventData) {
        this.f20220j = keyboardEventData.m5201b();
        m22945M3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v3, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: O3 */
    public /* synthetic */ void m22947O3(BLiveHourLeaderBoardItem bLiveHourLeaderBoardItem) {
        if (bLiveHourLeaderBoardItem.currentHourSuggestConfig.enable) {
            this.f20219i = false;
            ((HourBoardEntryView) ((bwr) this).viewModel).m8309q(false);
            return;
        }
        this.f20219i = bLiveHourLeaderBoardItem.isOpen;
        m22945M3();
        if (m25547E2().m17239o().equals(bLiveHourLeaderBoardItem.roomId)) {
            ((HourBoardEntryView) ((bwr) this).viewModel).setNewRank(bLiveHourLeaderBoardItem.rank);
        }
    }

    /* JADX INFO: renamed from: P3 */
    public void m22948P3() {
        String strV4 = ypv.k().v4();
        if (TextUtils.isEmpty(strV4) || vdt.b(2)) {
            m25548F2().HourLeaderBoardEvent.show().j(Boolean.TRUE);
        } else {
            m25548F2().SchemeHandleEvent.handleScheme().j(x1e0.m25605b(3400, strV4));
        }
    }

    /* JADX INFO: renamed from: T */
    public void m22949T() {
        super.T();
        duringCreated((c) m25548F2().KeyboardEvent.show().g()).subscribe(ffw.d(new e30() { // from class: l.sfl
            public final void call(Object obj) {
                this.f18992a.m22946N3((KeyboardEventData) obj);
            }
        }));
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        this.f20220j = false;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [l.ho2] */
    /* JADX INFO: renamed from: t */
    public void m22950t() {
        super.t();
        ((HourBoardEntryView) ((bwr) this).viewModel).init();
        duringCreated(m25547E2().m14596q1().d()).subscribe(ffw.e(new e30() { // from class: l.qfl
            public final void call(Object obj) {
                this.f17969a.m22947O3((BLiveHourLeaderBoardItem) obj);
            }
        }, new e30() { // from class: l.rfl
            public final void call(Object obj) {
                tfl.m22943K3((Throwable) obj);
            }
        }));
    }
}
