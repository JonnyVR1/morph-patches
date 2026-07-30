package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveDefaultOpenParas;
import com.p046p1.mobile.putong.live.base.data.BLiveEntrance;
import com.p046p1.mobile.putong.live.base.data.BLiveInRoomSideBarEntrance;
import com.p046p1.mobile.putong.live.livingroom.util.pref.LiveWatchCounter;
import com.p046p1.mobile.putong.live.livingroom.util.pref.NDayCountedValue;

/* JADX INFO: loaded from: classes4.dex */
public class fze0 {

    /* JADX INFO: renamed from: a */
    public final NDayCountedValue f99958a = new NDayCountedValue("live_side_default_open", false);

    /* JADX INFO: renamed from: a */
    public void m123827a() {
        this.f99958a.m76345a();
    }

    /* JADX INFO: renamed from: b */
    public boolean m123828b(String str) {
        BLiveEntrance bLiveEntranceM195616E4;
        BLiveInRoomSideBarEntrance bLiveInRoomSideBarEntranceM195904o5 = ypv.m215672k().m195904o5();
        if (bLiveInRoomSideBarEntranceM195904o5 == null || (bLiveEntranceM195616E4 = ypv.m215672k().m195616E4(str)) == null) {
            return false;
        }
        boolean z = LiveWatchCounter.m76330h().m76337l() >= bLiveEntranceM195616E4.defaultOpen.conditions.continousUnwatchDays || LiveWatchCounter.m76330h().m76335j(bLiveEntranceM195616E4.defaultOpen.conditions.onlyOneWatchContinousDays) <= 1;
        int iM76347c = this.f99958a.m76347c();
        int iM76346b = this.f99958a.m76346b(bLiveInRoomSideBarEntranceM195904o5.defaultOpenParas.maxOpenPerNDays.f44420n);
        BLiveDefaultOpenParas bLiveDefaultOpenParas = bLiveInRoomSideBarEntranceM195904o5.defaultOpenParas;
        return bLiveEntranceM195616E4.f44360on && bLiveEntranceM195616E4.defaultOpen.f44361on && z && (iM76347c < bLiveDefaultOpenParas.maxOpenPerDay && iM76346b < bLiveDefaultOpenParas.maxOpenPerNDays.max);
    }
}
