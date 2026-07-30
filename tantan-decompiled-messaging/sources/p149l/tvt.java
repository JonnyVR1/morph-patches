package p149l;

import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveEntranceLimitation;
import com.p046p1.mobile.putong.live.base.data.BLiveInRoomSideBarEntrance;
import com.p046p1.mobile.putong.live.base.data.BLiveMotionEffective;
import com.p046p1.mobile.putong.live.livingroom.archi.frag.RoomFrag;
import com.p046p1.mobile.putong.live.livingroom.archi.message.event.KeyboardEventData;
import com.p046p1.mobile.putong.live.livingroom.other.side.entry.LiveSiderEntryView;
import com.p046p1.mobile.putong.live.livingroom.util.pref.LiveWatchCounter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class tvt extends h4t<ho2, LiveSiderEntryView> {

    /* JADX INFO: renamed from: i */
    public final BLiveInRoomSideBarEntrance f172338i;

    /* JADX INFO: renamed from: j */
    public final z7c f172339j;

    /* JADX INFO: renamed from: k */
    public final String f172340k;

    public tvt(bsm bsmVar, LiveSiderEntryView liveSiderEntryView) {
        super(bsmVar);
        this.f172338i = ypv.m215672k().m195904o5();
        this.f172339j = new z7c("live_sider_entry_last_click_time", 0L, false);
        this.f172340k = getClass().getSimpleName();
        mo51532C(liveSiderEntryView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f4 */
    public /* synthetic */ void m190795f4(Boolean bool) {
        if (!bool.booleanValue()) {
            m190802X3();
        } else {
            m190813k4();
            m190814m4();
        }
    }

    /* JADX INFO: renamed from: l4 */
    private void m190797l4() {
        zvf0.m220397s("e_live_room_recommend", mo77274R2(), m190801W3());
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m129301d3(b1f0.class, new w9j() { // from class: l.kvt
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f124792a.m190805a4((b1f0) obj);
            }
        });
        duringCreated(m206028F2().KeyboardEvent.show().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.lvt
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f130194a.m190806b4((KeyboardEventData) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U3 */
    public final boolean m190799U3(boolean z) {
        if (vdt.m198092b(2)) {
            return !z;
        }
        return (m190804Z3() || z) ? false : true;
    }

    @Nullable
    /* JADX INFO: renamed from: V3 */
    public final RoomFrag m190800V3() {
        if (m206029H2() instanceof RoomFrag) {
            return (RoomFrag) m206029H2();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: W3 */
    public final Map<String, Object> m190801W3() {
        HashMap map = new HashMap();
        BLiveAbsData bLiveAbsDataMo149813j = m206027E2().mo149813j();
        if (bLiveAbsDataMo149813j != null) {
            map.put("liveId", bLiveAbsDataMo149813j.f44323id);
            map.put("liveStatus", TEnum.equals(bLiveAbsDataMo149813j.state, "onlive") ? "onLive" : "endLive");
        }
        return map;
    }

    /* JADX INFO: renamed from: X3 */
    public void m190802X3() {
        ((LiveSiderEntryView) this.viewModel).m75592p(false);
        m190798T3(true);
    }

    /* JADX INFO: renamed from: Y3 */
    public final boolean m190803Y3() {
        return ((LiveSiderEntryView) this.viewModel).getVisibility() != 0;
    }

    /* JADX INFO: renamed from: Z3 */
    public final boolean m190804Z3() {
        if (m190800V3() == null || m190800V3().m71800R4() == null) {
            return false;
        }
        return m190800V3().m71800R4().m148884U0();
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ Boolean m190805a4(b1f0 b1f0Var) {
        return Boolean.valueOf(m190803Y3());
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m190806b4(KeyboardEventData keyboardEventData) {
        ((LiveSiderEntryView) this.viewModel).m75592p(!keyboardEventData.m71825b());
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m190807c4(Long l2) {
        ((LiveSiderEntryView) this.viewModel).m75588j();
        m4t.m153098a().m153102e();
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ Boolean m190809e4(Boolean bool) {
        return Boolean.valueOf(m190799U3(bool.booleanValue()));
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m190810g4(List list) {
        boolean zM190812j4 = m190812j4(list.size());
        V v2 = this.viewModel;
        if (!zM190812j4) {
            ((LiveSiderEntryView) v2).m75590l();
        } else {
            ((LiveSiderEntryView) v2).m75591m(list);
            m190815n4();
        }
    }

    /* JADX INFO: renamed from: i4 */
    public void m190811i4() {
        this.f172339j.m217452b();
        if (m190800V3() != null) {
            m190800V3().m71804V4(true, true);
        }
        m190797l4();
        if (ypv.f199493a.m199315H()) {
            sgj.m184096i();
        }
    }

    /* JADX INFO: renamed from: j4 */
    public final boolean m190812j4(int i) {
        BLiveInRoomSideBarEntrance bLiveInRoomSideBarEntrance;
        if (i >= 3 && (bLiveInRoomSideBarEntrance = this.f172338i) != null) {
            BLiveMotionEffective bLiveMotionEffective = bLiveInRoomSideBarEntrance.motionEffective;
            m4t m4tVarM153098a = m4t.m153098a();
            boolean z = bLiveMotionEffective.show;
            boolean zM217451a = this.f172339j.m217451a(bLiveMotionEffective.limitation.unopenedEntranceDays);
            boolean z2 = !LiveWatchCounter.m76330h().m76338m() || LiveWatchCounter.m76330h().m76335j(bLiveMotionEffective.limitation.unwatchDays) <= 1;
            int iM153100c = m4tVarM153098a.m153100c();
            BLiveEntranceLimitation bLiveEntranceLimitation = bLiveMotionEffective.limitation;
            boolean z3 = iM153100c < bLiveEntranceLimitation.maxShowPerDay;
            boolean z4 = m4tVarM153098a.m153099b(bLiveEntranceLimitation.maxShowPerNDays.f44420n) < bLiveMotionEffective.limitation.maxShowPerNDays.max;
            boolean z5 = m4tVarM153098a.m153101d() < bLiveMotionEffective.limitation.maxShow;
            if (z && zM217451a && z2 && z3 && z4 && z5) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public void m190813k4() {
        ((LiveSiderEntryView) this.viewModel).m75592p(true);
        m190798T3(false);
    }

    /* JADX INFO: renamed from: m4 */
    public final void m190814m4() {
        zvf0.m220403y("e_live_room_recommend", mo77274R2(), m190801W3());
    }

    /* JADX INFO: renamed from: n4 */
    public final void m190815n4() {
        BLiveMotionEffective bLiveMotionEffective = this.f172338i.motionEffective;
        ((LiveSiderEntryView) this.viewModel).m75589k();
        duringCreated(C22306c.timer(bLiveMotionEffective.showAfterWatchSeconds, TimeUnit.SECONDS)).observeOn(jo0.m142408a()).subscribe(ffw.m121194e(new e30() { // from class: l.rvt
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f161271a.m190807c4((Long) obj);
            }
        }, new e30() { // from class: l.svt
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f166592a.m190808d4((Throwable) obj);
            }
        }));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m190800V3().m71802T4(true)).onBackpressureLatest().observeOn(jo0.m142408a()).map(new w9j() { // from class: l.mvt
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f135988a.m190809e4((Boolean) obj);
            }
        }).distinctUntilChanged().subscribe(ffw.m121197h(new e30() { // from class: l.nvt
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f140844a.m190795f4((Boolean) obj);
            }
        }));
        e3m e3mVarM207278t = ((x7d0) m129297F3(new y7d0(1700))).m207278t();
        ((LiveSiderEntryView) this.viewModel).m75586e(e3mVarM207278t.mo114609c());
        duringCreated((C22306c) e3mVarM207278t.mo114611e().map(new w9j() { // from class: l.ovt
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((vut) obj).m200126f(3);
            }
        })).subscribe(ffw.m121194e(new e30() { // from class: l.pvt
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f151504a.m190810g4((List) obj);
            }
        }, new e30() { // from class: l.qvt
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f156626a.m190796h4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h4 */
    public /* synthetic */ void m190796h4(Throwable th) {
    }

    /* JADX INFO: renamed from: T3 */
    public final void m190798T3(boolean z) {
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m190808d4(Throwable th) {
    }
}
