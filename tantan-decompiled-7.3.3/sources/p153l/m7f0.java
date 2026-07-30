package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveDefaultOpenParas;
import com.p051p1.mobile.putong.live.base.data.BLiveEntrance;
import com.p051p1.mobile.putong.live.base.data.BLiveInRoomSideBarEntrance;
import com.p051p1.mobile.putong.live.livingroom.util.pref.LiveWatchCounter;
import com.p051p1.mobile.putong.live.livingroom.util.pref.NDayCountedValue;

/* JADX INFO: loaded from: classes4.dex */
public class m7f0 {

    /* JADX INFO: renamed from: a */
    public final NDayCountedValue f135073a = new NDayCountedValue("live_side_default_open", false);

    /* JADX INFO: renamed from: a */
    public void m157279a() {
        this.f135073a.m77528a();
    }

    /* JADX INFO: renamed from: b */
    public boolean m157280b(String str) {
        BLiveEntrance bLiveEntranceM203403E4;
        BLiveInRoomSideBarEntrance bLiveInRoomSideBarEntranceM203691o5 = zrv.m221193k().m203691o5();
        if (bLiveInRoomSideBarEntranceM203691o5 == null || (bLiveEntranceM203403E4 = zrv.m221193k().m203403E4(str)) == null) {
            return false;
        }
        boolean z = LiveWatchCounter.m77513h().m77520l() >= bLiveEntranceM203403E4.defaultOpen.conditions.continousUnwatchDays || LiveWatchCounter.m77513h().m77518j(bLiveEntranceM203403E4.defaultOpen.conditions.onlyOneWatchContinousDays) <= 1;
        int iM77530c = this.f135073a.m77530c();
        int iM77529b = this.f135073a.m77529b(bLiveInRoomSideBarEntranceM203691o5.defaultOpenParas.maxOpenPerNDays.f45268n);
        BLiveDefaultOpenParas bLiveDefaultOpenParas = bLiveInRoomSideBarEntranceM203691o5.defaultOpenParas;
        return bLiveEntranceM203403E4.f45208on && bLiveEntranceM203403E4.defaultOpen.f45209on && z && (iM77530c < bLiveDefaultOpenParas.maxOpenPerDay && iM77529b < bLiveDefaultOpenParas.maxOpenPerNDays.max);
    }
}
