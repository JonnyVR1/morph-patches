package p009l;

import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.businessdata.meet.AbsMeetUserItemData;
import com.p1.mobile.putong.core.businessdata.meet.MeetLiveItemData;
import com.p1.mobile.putong.core.data.MyMeetLiveItem;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.sja;
import l.vwb;
import l.xma;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class g2y {
    /* JADX INFO: renamed from: a */
    public static String m14764a() {
        return "喜欢的人";
    }

    /* JADX INFO: renamed from: b */
    public static String m14765b(AbsMeetUserItemData absMeetUserItemData, MyMeetLiveItem myMeetLiveItem, User user) {
        if (myMeetLiveItem.anonymous && NullChecker.a(user) && !vwb.J(user.profile.extensions.live.voiceImgUrl)) {
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
    public static String m14766c(MeetLiveItemData meetLiveItemData) {
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
    public static boolean m14767d(Act act, String str) {
        boolean zG3 = xma.G3();
        if (!CoreModule.P().a().ff(str)) {
            return false;
        }
        if (!zG3 && sja.r3() <= 0) {
            return false;
        }
        CoreModule.P().a().Mc(act, CoreModule.P().a().vo(str));
        return true;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m14768e(Act act, String str) {
        if (xma.L3()) {
            return false;
        }
        if (m14767d(act, str)) {
            return true;
        }
        CoreModule.P().a().pr(act, CoreModule.P().a().vo(str), Privilege.greet);
        return true;
    }
}
