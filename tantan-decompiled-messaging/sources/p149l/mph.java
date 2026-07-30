package p149l;

import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.newui.home.C7994d;
import com.p046p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p046p1.mobile.putong.data.MatchScData;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UssTags;

/* JADX INFO: loaded from: classes11.dex */
public class mph {

    /* JADX INFO: renamed from: l.mph$a */
    public static /* synthetic */ class C18527a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f135046a;

        static {
            int[] iArr = new int[SwipeDirection.values().length];
            f135046a = iArr;
            try {
                iArr[SwipeDirection.UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f135046a[SwipeDirection.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f135046a[SwipeDirection.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static C7994d m155805a(User user, String str, boolean z, SwipeDirection swipeDirection) {
        UssTags ussTags;
        String str2 = "";
        C7994d c7994d = new C7994d(str, HomeStatisticsHelper.ScActionFrom.SUGGEST, user == null ? "" : user.f56011id);
        if (user != null && (ussTags = user.ussTags) != null) {
            str2 = ussTags.eventInfo;
        }
        c7994d.m38487v(str2);
        c7994d.m38482q(m155807c(swipeDirection));
        c7994d.m38484s(z ? "click" : "swipe");
        if (!z) {
            c7994d.m38488w(MatchScData.ModuleId.mid_e_card);
            return c7994d;
        }
        if (swipeDirection == SwipeDirection.RIGHT) {
            c7994d.m38488w(MatchScData.ModuleId.mid_e_likeButton);
            return c7994d;
        }
        if (swipeDirection == SwipeDirection.LEFT) {
            c7994d.m38488w("e_dislikeButton");
            return c7994d;
        }
        if (swipeDirection == SwipeDirection.UP) {
            c7994d.m38488w(MatchScData.ModuleId.mid_e_superlikeButton);
        }
        return c7994d;
    }

    /* JADX INFO: renamed from: b */
    public static C7994d m155806b(String str, String str2) {
        C7994d c7994d = new C7994d(str);
        c7994d.m38482q(HomeStatisticsHelper.ScActionName.UNDO).m38484s("click").m38483r(HomeStatisticsHelper.ScActionFrom.SUGGEST).m38464E(str2);
        c7994d.m38488w("e_undo_button");
        return c7994d;
    }

    /* JADX INFO: renamed from: c */
    public static HomeStatisticsHelper.ScActionName m155807c(SwipeDirection swipeDirection) {
        int i = C18527a.f135046a[swipeDirection.ordinal()];
        if (i == 1) {
            return HomeStatisticsHelper.ScActionName.SUPER_LIKE;
        }
        if (i != 2) {
            return i != 3 ? HomeStatisticsHelper.ScActionName.UNKNOWN : HomeStatisticsHelper.ScActionName.DISLIKE;
        }
        return HomeStatisticsHelper.ScActionName.LIKE;
    }
}
