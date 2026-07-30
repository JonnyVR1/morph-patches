package p153l;

import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.newui.home.C8145d;
import com.p051p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p051p1.mobile.putong.data.MatchScData;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UssTags;

/* JADX INFO: loaded from: classes11.dex */
public class brh {

    /* JADX INFO: renamed from: l.brh$a */
    public static /* synthetic */ class C16097a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f78025a;

        static {
            int[] iArr = new int[SwipeDirection.values().length];
            f78025a = iArr;
            try {
                iArr[SwipeDirection.UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f78025a[SwipeDirection.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f78025a[SwipeDirection.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static C8145d m106136a(User user, String str, boolean z, SwipeDirection swipeDirection) {
        UssTags ussTags;
        String str2 = "";
        C8145d c8145d = new C8145d(str, HomeStatisticsHelper.ScActionFrom.SUGGEST, user == null ? "" : user.f56859id);
        if (user != null && (ussTags = user.ussTags) != null) {
            str2 = ussTags.eventInfo;
        }
        c8145d.m39490v(str2);
        c8145d.m39485q(m106138c(swipeDirection));
        c8145d.m39487s(z ? "click" : "swipe");
        if (!z) {
            c8145d.m39491w(MatchScData.ModuleId.mid_e_card);
            return c8145d;
        }
        if (swipeDirection == SwipeDirection.RIGHT) {
            c8145d.m39491w(MatchScData.ModuleId.mid_e_likeButton);
            return c8145d;
        }
        if (swipeDirection == SwipeDirection.LEFT) {
            c8145d.m39491w("e_dislikeButton");
            return c8145d;
        }
        if (swipeDirection == SwipeDirection.UP) {
            c8145d.m39491w(MatchScData.ModuleId.mid_e_superlikeButton);
        }
        return c8145d;
    }

    /* JADX INFO: renamed from: b */
    public static C8145d m106137b(String str, String str2) {
        C8145d c8145d = new C8145d(str);
        c8145d.m39485q(HomeStatisticsHelper.ScActionName.UNDO).m39487s("click").m39486r(HomeStatisticsHelper.ScActionFrom.SUGGEST).m39467E(str2);
        c8145d.m39491w("e_undo_button");
        return c8145d;
    }

    /* JADX INFO: renamed from: c */
    public static HomeStatisticsHelper.ScActionName m106138c(SwipeDirection swipeDirection) {
        int i = C16097a.f78025a[swipeDirection.ordinal()];
        if (i == 1) {
            return HomeStatisticsHelper.ScActionName.SUPER_LIKE;
        }
        if (i != 2) {
            return i != 3 ? HomeStatisticsHelper.ScActionName.UNKNOWN : HomeStatisticsHelper.ScActionName.DISLIKE;
        }
        return HomeStatisticsHelper.ScActionName.LIKE;
    }
}
