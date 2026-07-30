package p002l;

import com.p1.mobile.putong.live.base.data.BLiveDefaultOpenParas;
import com.p1.mobile.putong.live.base.data.BLiveEntrance;
import com.p1.mobile.putong.live.base.data.BLiveInRoomSideBarEntrance;
import com.p1.mobile.putong.live.livingroom.util.pref.LiveWatchCounter;
import com.p1.mobile.putong.live.livingroom.util.pref.NDayCountedValue;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class fze0 {

    /* JADX INFO: renamed from: a */
    public final NDayCountedValue f10696a = new NDayCountedValue("live_side_default_open", false);

    /* JADX INFO: renamed from: a */
    public void m13513a() {
        this.f10696a.a();
    }

    /* JADX INFO: renamed from: b */
    public boolean m13514b(String str) {
        BLiveEntrance bLiveEntranceE4;
        BLiveInRoomSideBarEntrance bLiveInRoomSideBarEntranceO5 = ypv.k().o5();
        if (bLiveInRoomSideBarEntranceO5 == null || (bLiveEntranceE4 = ypv.k().E4(str)) == null) {
            return false;
        }
        boolean z = LiveWatchCounter.h().l() >= bLiveEntranceE4.defaultOpen.conditions.continousUnwatchDays || LiveWatchCounter.h().j(bLiveEntranceE4.defaultOpen.conditions.onlyOneWatchContinousDays) <= 1;
        int iC = this.f10696a.c();
        int iB = this.f10696a.b(bLiveInRoomSideBarEntranceO5.defaultOpenParas.maxOpenPerNDays.n);
        BLiveDefaultOpenParas bLiveDefaultOpenParas = bLiveInRoomSideBarEntranceO5.defaultOpenParas;
        return bLiveEntranceE4.on && bLiveEntranceE4.defaultOpen.on && z && (iC < bLiveDefaultOpenParas.maxOpenPerDay && iB < bLiveDefaultOpenParas.maxOpenPerNDays.max);
    }
}
