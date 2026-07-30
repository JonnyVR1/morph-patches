package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveDefaultOpenParas;
import com.p051p1.mobile.putong.live.base.data.BLiveEntrance;
import com.p051p1.mobile.putong.live.base.data.BLiveInRoomSideBarEntrance;
import com.p051p1.mobile.putong.live.livingroom.util.pref.LiveWatchCounter;
import com.p051p1.mobile.putong.live.livingroom.util.pref.NDayCountedValue;

/* JADX INFO: loaded from: classes4.dex */
public class ldp {

    /* JADX INFO: renamed from: a */
    public final NDayCountedValue f131660a = new NDayCountedValue("live_side_default_open", false);

    /* JADX INFO: renamed from: a */
    public void m153784a() {
        this.f131660a.m77528a();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m153785b() {
        return zrv.m221193k().m203728s7() && LiveWatchCounter.m77513h().m77522n();
    }

    /* JADX INFO: renamed from: c */
    public boolean m153786c(String str) {
        BLiveEntrance bLiveEntranceM203403E4;
        BLiveInRoomSideBarEntrance bLiveInRoomSideBarEntranceM203691o5 = zrv.m221193k().m203691o5();
        if (bLiveInRoomSideBarEntranceM203691o5 == null || (bLiveEntranceM203403E4 = zrv.m221193k().m203403E4(str)) == null) {
            return false;
        }
        if (!"square-suggested".equals(str) && !"square-nearby".equals(str) && !"start-push-match".equals(str) && !"start-push-superlike".equals(str) && !"start-push-like".equals(str) && !"start-push-none".equals(str) && !"start-push-follow".equals(str) && !"start-push-match-not-follow".equals(str) && !"live-push-in-app".equals(str)) {
            return m153785b();
        }
        boolean z = LiveWatchCounter.m77513h().m77520l() >= bLiveEntranceM203403E4.defaultOpen.conditions.continousUnwatchDays;
        int iM77530c = this.f131660a.m77530c();
        int iM77529b = this.f131660a.m77529b(bLiveInRoomSideBarEntranceM203691o5.defaultOpenParas.maxOpenPerNDays.f45268n);
        BLiveDefaultOpenParas bLiveDefaultOpenParas = bLiveInRoomSideBarEntranceM203691o5.defaultOpenParas;
        return bLiveEntranceM203403E4.f45208on && bLiveEntranceM203403E4.defaultOpen.f45209on && z && (iM77530c < bLiveDefaultOpenParas.maxOpenPerDay && iM77529b < bLiveDefaultOpenParas.maxOpenPerNDays.max);
    }
}
