package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.businessdata.meet.AbsMeetUserItemData;
import com.p051p1.mobile.putong.core.businessdata.meet.MeetLiveItemData;
import com.p051p1.mobile.putong.core.data.MyMeetLiveItem;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class dby {
    /* JADX INFO: renamed from: a */
    public static String m115173a() {
        return "喜欢的人";
    }

    /* JADX INFO: renamed from: b */
    public static String m115174b(AbsMeetUserItemData absMeetUserItemData, MyMeetLiveItem myMeetLiveItem, User user) {
        if (myMeetLiveItem.anonymous && NullChecker.m82486a(user) && !jyb.m147479J(user.profile.extensions.live.voiceImgUrl)) {
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
    public static String m115175c(MeetLiveItemData meetLiveItemData) {
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
    public static boolean m115176d(Act act, String str) {
        boolean zM146358H3 = joa.m146358H3();
        if (!CoreModule.m30933P().m143405a().mo34500ff(str)) {
            return false;
        }
        if (!zM146358H3 && ela.m121122r3() <= 0) {
            return false;
        }
        CoreModule.m30933P().m143405a().mo34369Mc(act, CoreModule.m30933P().m143405a().mo34615vo(str));
        return true;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m115177e(Act act, String str) {
        if (joa.m146361M3()) {
            return false;
        }
        if (m115176d(act, str)) {
            return true;
        }
        CoreModule.m30933P().m143405a().mo34568pr(act, CoreModule.m30933P().m143405a().mo34615vo(str), Privilege.greet);
        return true;
    }
}
