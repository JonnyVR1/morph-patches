package p002l;

import com.p1.mobile.putong.live.base.data.BLiveDefaultOpenParas;
import com.p1.mobile.putong.live.base.data.BLiveEntrance;
import com.p1.mobile.putong.live.base.data.BLiveInRoomSideBarEntrance;
import com.p1.mobile.putong.live.livingroom.util.pref.LiveWatchCounter;
import com.p1.mobile.putong.live.livingroom.util.pref.NDayCountedValue;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class lbp {

    /* JADX INFO: renamed from: a */
    public final NDayCountedValue f14755a = new NDayCountedValue("live_side_default_open", false);

    /* JADX INFO: renamed from: a */
    public void m17125a() {
        this.f14755a.a();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m17126b() {
        return ypv.k().s7() && LiveWatchCounter.h().n();
    }

    /* JADX INFO: renamed from: c */
    public boolean m17127c(String str) {
        BLiveEntrance bLiveEntranceE4;
        BLiveInRoomSideBarEntrance bLiveInRoomSideBarEntranceO5 = ypv.k().o5();
        if (bLiveInRoomSideBarEntranceO5 == null || (bLiveEntranceE4 = ypv.k().E4(str)) == null) {
            return false;
        }
        if (!"square-suggested".equals(str) && !"square-nearby".equals(str) && !"start-push-match".equals(str) && !"start-push-superlike".equals(str) && !"start-push-like".equals(str) && !"start-push-none".equals(str) && !"start-push-follow".equals(str) && !"start-push-match-not-follow".equals(str) && !"live-push-in-app".equals(str)) {
            return m17126b();
        }
        boolean z = LiveWatchCounter.h().l() >= bLiveEntranceE4.defaultOpen.conditions.continousUnwatchDays;
        int iC = this.f14755a.c();
        int iB = this.f14755a.b(bLiveInRoomSideBarEntranceO5.defaultOpenParas.maxOpenPerNDays.n);
        BLiveDefaultOpenParas bLiveDefaultOpenParas = bLiveInRoomSideBarEntranceO5.defaultOpenParas;
        return bLiveEntranceE4.on && bLiveEntranceE4.defaultOpen.on && z && (iC < bLiveDefaultOpenParas.maxOpenPerDay && iB < bLiveDefaultOpenParas.maxOpenPerNDays.max);
    }
}
