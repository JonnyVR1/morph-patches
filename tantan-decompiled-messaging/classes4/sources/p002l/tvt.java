package p002l;

import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.archi.frag.RoomFrag;
import com.p000p1.mobile.putong.live.livingroom.archi.message.event.KeyboardEventData;
import com.p000p1.mobile.putong.live.livingroom.other.side.entry.LiveSiderEntryView;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveEntranceLimitation;
import com.p1.mobile.putong.live.base.data.BLiveInRoomSideBarEntrance;
import com.p1.mobile.putong.live.base.data.BLiveMotionEffective;
import com.p1.mobile.putong.live.livingroom.util.pref.LiveWatchCounter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import l.bwr;
import l.e30;
import l.ffw;
import l.jo0;
import l.m4t;
import l.s7m;
import l.sgj;
import l.vdt;
import l.w9j;
import l.ypv;
import l.z7c;
import l.zvf0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class tvt extends h4t<ho2, LiveSiderEntryView> {

    /* JADX INFO: renamed from: i */
    public final BLiveInRoomSideBarEntrance f20406i;

    /* JADX INFO: renamed from: j */
    public final z7c f20407j;

    /* JADX INFO: renamed from: k */
    public final String f20408k;

    public tvt(bsm bsmVar, LiveSiderEntryView liveSiderEntryView) {
        super(bsmVar);
        this.f20406i = ypv.k().o5();
        this.f20407j = new z7c("live_sider_entry_last_click_time", 0L, false);
        this.f20408k = getClass().getSimpleName();
        C(liveSiderEntryView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f4 */
    public /* synthetic */ void m23203f4(Boolean bool) {
        if (!bool.booleanValue()) {
            m23211X3();
        } else {
            m23222k4();
            m23223m4();
        }
    }

    /* JADX INFO: renamed from: l4 */
    private void m23205l4() {
        zvf0.s("e_live_room_recommend", mo21430R2(), m23210W3());
    }

    /* JADX INFO: renamed from: T */
    public void m23206T() {
        super.T();
        m14188d3(b1f0.class, new w9j() { // from class: l.kvt
            public final Object call(Object obj) {
                return this.f14558a.m23214a4((b1f0) obj);
            }
        });
        duringCreated((c) m25548F2().KeyboardEvent.show().g()).subscribe(ffw.d(new e30() { // from class: l.lvt
            public final void call(Object obj) {
                this.f15092a.m23215b4((KeyboardEventData) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U3 */
    public final boolean m23208U3(boolean z) {
        if (vdt.b(2)) {
            return !z;
        }
        return (m23213Z3() || z) ? false : true;
    }

    @Nullable
    /* JADX INFO: renamed from: V3 */
    public final RoomFrag m23209V3() {
        if (m25549H2() instanceof RoomFrag) {
            return m25549H2();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: W3 */
    public final Map<String, Object> m23210W3() {
        HashMap map = new HashMap();
        BLiveAbsData bLiveAbsDataM17234j = m25547E2().m17234j();
        if (bLiveAbsDataM17234j != null) {
            map.put("liveId", bLiveAbsDataM17234j.id);
            map.put("liveStatus", TEnum.equals(bLiveAbsDataM17234j.state, "onlive") ? "onLive" : "endLive");
        }
        return map;
    }

    /* JADX INFO: renamed from: X3 */
    public void m23211X3() {
        ((LiveSiderEntryView) ((bwr) this).viewModel).m9233p(false);
        m23207T3(true);
    }

    /* JADX INFO: renamed from: Y3 */
    public final boolean m23212Y3() {
        return ((LiveSiderEntryView) ((bwr) this).viewModel).getVisibility() != 0;
    }

    /* JADX INFO: renamed from: Z3 */
    public final boolean m23213Z3() {
        if (m23209V3() == null || m23209V3().m5169R4() == null) {
            return false;
        }
        return m23209V3().m5169R4().m17075U0();
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ Boolean m23214a4(b1f0 b1f0Var) {
        return Boolean.valueOf(m23212Y3());
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m23215b4(KeyboardEventData keyboardEventData) {
        ((LiveSiderEntryView) ((bwr) this).viewModel).m9233p(!keyboardEventData.m5201b());
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m23216c4(Long l2) {
        ((LiveSiderEntryView) ((bwr) this).viewModel).m9229j();
        m4t.a().e();
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ Boolean m23218e4(Boolean bool) {
        return Boolean.valueOf(m23208U3(bool.booleanValue()));
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m23219g4(List list) {
        boolean zM23221j4 = m23221j4(list.size());
        s7m s7mVar = ((bwr) this).viewModel;
        if (!zM23221j4) {
            ((LiveSiderEntryView) s7mVar).m9231l();
        } else {
            ((LiveSiderEntryView) s7mVar).m9232m(list);
            m23224n4();
        }
    }

    /* JADX INFO: renamed from: i4 */
    public void m23220i4() {
        this.f20407j.b();
        if (m23209V3() != null) {
            m23209V3().m5173V4(true, true);
        }
        m23205l4();
        if (ypv.a.H()) {
            sgj.i();
        }
    }

    /* JADX INFO: renamed from: j4 */
    public final boolean m23221j4(int i) {
        BLiveInRoomSideBarEntrance bLiveInRoomSideBarEntrance;
        if (i >= 3 && (bLiveInRoomSideBarEntrance = this.f20406i) != null) {
            BLiveMotionEffective bLiveMotionEffective = bLiveInRoomSideBarEntrance.motionEffective;
            m4t m4tVarA = m4t.a();
            boolean z = bLiveMotionEffective.show;
            boolean zA = this.f20407j.a(bLiveMotionEffective.limitation.unopenedEntranceDays);
            boolean z2 = !LiveWatchCounter.h().m() || LiveWatchCounter.h().j(bLiveMotionEffective.limitation.unwatchDays) <= 1;
            int iC = m4tVarA.c();
            BLiveEntranceLimitation bLiveEntranceLimitation = bLiveMotionEffective.limitation;
            boolean z3 = iC < bLiveEntranceLimitation.maxShowPerDay;
            boolean z4 = m4tVarA.b(bLiveEntranceLimitation.maxShowPerNDays.n) < bLiveMotionEffective.limitation.maxShowPerNDays.max;
            boolean z5 = m4tVarA.d() < bLiveMotionEffective.limitation.maxShow;
            if (z && zA && z2 && z3 && z4 && z5) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public void m23222k4() {
        ((LiveSiderEntryView) ((bwr) this).viewModel).m9233p(true);
        m23207T3(false);
    }

    /* JADX INFO: renamed from: m4 */
    public final void m23223m4() {
        zvf0.y("e_live_room_recommend", mo21430R2(), m23210W3());
    }

    /* JADX INFO: renamed from: n4 */
    public final void m23224n4() {
        BLiveMotionEffective bLiveMotionEffective = this.f20406i.motionEffective;
        ((LiveSiderEntryView) ((bwr) this).viewModel).m9230k();
        duringCreated(c.timer(bLiveMotionEffective.showAfterWatchSeconds, TimeUnit.SECONDS)).observeOn(jo0.a()).subscribe(ffw.e(new e30() { // from class: l.rvt
            public final void call(Object obj) {
                this.f18697a.m23216c4((Long) obj);
            }
        }, new e30() { // from class: l.svt
            public final void call(Object obj) {
                this.f19303a.m23217d4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t */
    public void m23225t() {
        super.t();
        duringCreated(m23209V3().m5171T4(true)).onBackpressureLatest().observeOn(jo0.a()).map(new w9j() { // from class: l.mvt
            public final Object call(Object obj) {
                return this.f15715a.m23218e4((Boolean) obj);
            }
        }).distinctUntilChanged().subscribe(ffw.h(new e30() { // from class: l.nvt
            public final void call(Object obj) {
                this.f16273a.m23203f4((Boolean) obj);
            }
        }));
        e3m e3mVarM25730t = ((x7d0) m14184F3(new y7d0(1700))).m25730t();
        ((LiveSiderEntryView) ((bwr) this).viewModel).m9226e(e3mVarM25730t.mo12167c());
        duringCreated(e3mVarM25730t.mo12169e().map(new w9j() { // from class: l.ovt
            public final Object call(Object obj) {
                return ((vut) obj).m24168f(3);
            }
        })).subscribe(ffw.e(new e30() { // from class: l.pvt
            public final void call(Object obj) {
                this.f17700a.m23219g4((List) obj);
            }
        }, new e30() { // from class: l.qvt
            public final void call(Object obj) {
                this.f18250a.m23204h4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h4 */
    public /* synthetic */ void m23204h4(Throwable th) {
    }

    /* JADX INFO: renamed from: T3 */
    public final void m23207T3(boolean z) {
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m23217d4(Throwable th) {
    }
}
