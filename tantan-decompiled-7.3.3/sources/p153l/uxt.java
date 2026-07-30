package p153l;

import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveEntranceLimitation;
import com.p051p1.mobile.putong.live.base.data.BLiveInRoomSideBarEntrance;
import com.p051p1.mobile.putong.live.base.data.BLiveMotionEffective;
import com.p051p1.mobile.putong.live.livingroom.archi.frag.RoomFrag;
import com.p051p1.mobile.putong.live.livingroom.archi.message.event.KeyboardEventData;
import com.p051p1.mobile.putong.live.livingroom.other.side.entry.LiveSiderEntryView;
import com.p051p1.mobile.putong.live.livingroom.util.pref.LiveWatchCounter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
public class uxt extends i6t<oo2, LiveSiderEntryView> {

    /* JADX INFO: renamed from: i */
    public final BLiveInRoomSideBarEntrance f181495i;

    /* JADX INFO: renamed from: j */
    public final f9c f181496j;

    /* JADX INFO: renamed from: k */
    public final String f181497k;

    public uxt(dum dumVar, LiveSiderEntryView liveSiderEntryView) {
        super(dumVar);
        this.f181495i = zrv.m221193k().m203691o5();
        this.f181496j = new f9c("live_sider_entry_last_click_time", 0L, false);
        this.f181497k = getClass().getSimpleName();
        mo52715C(liveSiderEntryView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f4 */
    public /* synthetic */ void m198522f4(Boolean bool) {
        if (!bool.booleanValue()) {
            m198529X3();
        } else {
            m198540k4();
            m198541m4();
        }
    }

    /* JADX INFO: renamed from: l4 */
    private void m198524l4() {
        i4g0.m138521s("e_live_room_recommend", mo78457R2(), m198528W3());
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m138860d3(i9f0.class, new qcj() { // from class: l.lxt
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f134002a.m198532a4((i9f0) obj);
            }
        });
        duringCreated(m213811F2().KeyboardEvent.show().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.mxt
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f139281a.m198533b4((KeyboardEventData) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: U3 */
    public final boolean m198526U3(boolean z) {
        if (wft.m206159b(2)) {
            return !z;
        }
        return (m198531Z3() || z) ? false : true;
    }

    @Nullable
    /* JADX INFO: renamed from: V3 */
    public final RoomFrag m198527V3() {
        if (m213812H2() instanceof RoomFrag) {
            return (RoomFrag) m213812H2();
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: W3 */
    public final Map<String, Object> m198528W3() {
        HashMap map = new HashMap();
        BLiveAbsData bLiveAbsDataMo183435j = m213810E2().mo183435j();
        if (bLiveAbsDataMo183435j != null) {
            map.put("liveId", bLiveAbsDataMo183435j.f45171id);
            map.put("liveStatus", TEnum.equals(bLiveAbsDataMo183435j.state, "onlive") ? "onLive" : "endLive");
        }
        return map;
    }

    /* JADX INFO: renamed from: X3 */
    public void m198529X3() {
        ((LiveSiderEntryView) this.viewModel).m76775p(false);
        m198525T3(true);
    }

    /* JADX INFO: renamed from: Y3 */
    public final boolean m198530Y3() {
        return ((LiveSiderEntryView) this.viewModel).getVisibility() != 0;
    }

    /* JADX INFO: renamed from: Z3 */
    public final boolean m198531Z3() {
        if (m198527V3() == null || m198527V3().m72983R4() == null) {
            return false;
        }
        return m198527V3().m72983R4().m167559U0();
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ Boolean m198532a4(i9f0 i9f0Var) {
        return Boolean.valueOf(m198530Y3());
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m198533b4(KeyboardEventData keyboardEventData) {
        ((LiveSiderEntryView) this.viewModel).m76775p(!keyboardEventData.m73008b());
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m198534c4(Long l2) {
        ((LiveSiderEntryView) this.viewModel).m76771j();
        n6t.m161798a().m161802e();
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ Boolean m198536e4(Boolean bool) {
        return Boolean.valueOf(m198526U3(bool.booleanValue()));
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m198537g4(List list) {
        boolean zM198539j4 = m198539j4(list.size());
        V v2 = this.viewModel;
        if (!zM198539j4) {
            ((LiveSiderEntryView) v2).m76773l();
        } else {
            ((LiveSiderEntryView) v2).m76774m(list);
            m198542n4();
        }
    }

    /* JADX INFO: renamed from: i4 */
    public void m198538i4() {
        this.f181496j.m124633b();
        if (m198527V3() != null) {
            m198527V3().m72987V4(true, true);
        }
        m198524l4();
        if (zrv.f205799a.m207637H()) {
            mjj.m158580i();
        }
    }

    /* JADX INFO: renamed from: j4 */
    public final boolean m198539j4(int i) {
        BLiveInRoomSideBarEntrance bLiveInRoomSideBarEntrance;
        if (i >= 3 && (bLiveInRoomSideBarEntrance = this.f181495i) != null) {
            BLiveMotionEffective bLiveMotionEffective = bLiveInRoomSideBarEntrance.motionEffective;
            n6t n6tVarM161798a = n6t.m161798a();
            boolean z = bLiveMotionEffective.show;
            boolean zM124632a = this.f181496j.m124632a(bLiveMotionEffective.limitation.unopenedEntranceDays);
            boolean z2 = !LiveWatchCounter.m77513h().m77521m() || LiveWatchCounter.m77513h().m77518j(bLiveMotionEffective.limitation.unwatchDays) <= 1;
            int iM161800c = n6tVarM161798a.m161800c();
            BLiveEntranceLimitation bLiveEntranceLimitation = bLiveMotionEffective.limitation;
            boolean z3 = iM161800c < bLiveEntranceLimitation.maxShowPerDay;
            boolean z4 = n6tVarM161798a.m161799b(bLiveEntranceLimitation.maxShowPerNDays.f45268n) < bLiveMotionEffective.limitation.maxShowPerNDays.max;
            boolean z5 = n6tVarM161798a.m161801d() < bLiveMotionEffective.limitation.maxShow;
            if (z && zM124632a && z2 && z3 && z4 && z5) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public void m198540k4() {
        ((LiveSiderEntryView) this.viewModel).m76775p(true);
        m198525T3(false);
    }

    /* JADX INFO: renamed from: m4 */
    public final void m198541m4() {
        i4g0.m138527y("e_live_room_recommend", mo78457R2(), m198528W3());
    }

    /* JADX INFO: renamed from: n4 */
    public final void m198542n4() {
        BLiveMotionEffective bLiveMotionEffective = this.f181495i.motionEffective;
        ((LiveSiderEntryView) this.viewModel).m76772k();
        duringCreated(C22421c.timer(bLiveMotionEffective.showAfterWatchSeconds, TimeUnit.SECONDS)).observeOn(fo0.m126432a()).subscribe(dhw.m115826e(new y20() { // from class: l.sxt
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f171192a.m198534c4((Long) obj);
            }
        }, new y20() { // from class: l.txt
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f176603a.m198535d4((Throwable) obj);
            }
        }));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m198527V3().m72985T4(true)).onBackpressureLatest().observeOn(fo0.m126432a()).map(new qcj() { // from class: l.nxt
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f144241a.m198536e4((Boolean) obj);
            }
        }).distinctUntilChanged().subscribe(dhw.m115829h(new y20() { // from class: l.oxt
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f149683a.m198522f4((Boolean) obj);
            }
        }));
        v5m v5mVarM97615t = ((agd0) m138856F3(new bgd0(1700))).m97615t();
        ((LiveSiderEntryView) this.viewModel).m76769e(v5mVarM97615t.mo129563c());
        duringCreated((C22421c) v5mVarM97615t.mo129565e().map(new qcj() { // from class: l.pxt
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((wwt) obj).m208300f(3);
            }
        })).subscribe(dhw.m115826e(new y20() { // from class: l.qxt
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f160072a.m198537g4((List) obj);
            }
        }, new y20() { // from class: l.rxt
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f165377a.m198523h4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h4 */
    public /* synthetic */ void m198523h4(Throwable th) {
    }

    /* JADX INFO: renamed from: T3 */
    public final void m198525T3(boolean z) {
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m198535d4(Throwable th) {
    }
}
