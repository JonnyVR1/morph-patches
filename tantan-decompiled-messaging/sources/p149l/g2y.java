package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.businessdata.meet.AbsMeetUserItemData;
import com.p046p1.mobile.putong.core.businessdata.meet.MeetLiveItemData;
import com.p046p1.mobile.putong.core.data.MyMeetLiveItem;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class g2y {
    /* JADX INFO: renamed from: a */
    public static String m124191a() {
        return "喜欢的人";
    }

    /* JADX INFO: renamed from: b */
    public static String m124192b(AbsMeetUserItemData absMeetUserItemData, MyMeetLiveItem myMeetLiveItem, User user) {
        if (myMeetLiveItem.anonymous && NullChecker.m81303a(user) && !vwb.m200296J(user.profile.extensions.live.voiceImgUrl)) {
            return "follow";
        }
        if (absMeetUserItemData.isSuperLikeUser()) {
            return "superlike";
        }
        if (absMeetUserItemData.isLikedUser()) {
            return "like";
        }
        return absMeetUserItemData.isPicksUser() ? "picks" : "";
    }

    /* JADX INFO: renamed from: c */
    public static String m124193c(MeetLiveItemData meetLiveItemData) {
        if (meetLiveItemData.isAnonymous()) {
            return "follow";
        }
        if (meetLiveItemData.isMatched()) {
            return "matched";
        }
        if (meetLiveItemData.isPicksUser()) {
            return "picks";
        }
        if (meetLiveItemData.isSuperLikedMe()) {
            return "superlike";
        }
        return meetLiveItemData.isLikedUser() ? "like" : "";
    }

    /* JADX INFO: renamed from: d */
    public static boolean m124194d(Act act, String str) {
        boolean zM210044G3 = xma.m210044G3();
        if (!CoreModule.m29935P().m94651a().mo33497ff(str)) {
            return false;
        }
        if (!zM210044G3 && sja.m184461r3() <= 0) {
            return false;
        }
        CoreModule.m29935P().m94651a().mo33366Mc(act, CoreModule.m29935P().m94651a().mo33612vo(str));
        return true;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m124195e(Act act, String str) {
        if (xma.m210047L3()) {
            return false;
        }
        if (m124194d(act, str)) {
            return true;
        }
        CoreModule.m29935P().m94651a().mo33565pr(act, CoreModule.m29935P().m94651a().mo33612vo(str), Privilege.greet);
        return true;
    }
}
