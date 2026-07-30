package p009l;

import com.p000p1.mobile.putong.core.newui.home.C0158d;
import com.p000p1.mobile.putong.core.newui.home.HomeStatisticsHelper;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UssTags;
import com.tantanapp.common.data.DbObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class mph {

    /* JADX INFO: renamed from: l.mph$a */
    public static /* synthetic */ class C1037a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f17016a;

        static {
            int[] iArr = new int[SwipeDirection.values().length];
            f17016a = iArr;
            try {
                iArr[SwipeDirection.UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17016a[SwipeDirection.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17016a[SwipeDirection.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0158d m18529a(User user, String str, boolean z, SwipeDirection swipeDirection) {
        UssTags ussTags;
        String str2 = "";
        C0158d c0158d = new C0158d(str, HomeStatisticsHelper.ScActionFrom.SUGGEST, user == null ? "" : ((DbObject) user).id);
        if (user != null && (ussTags = user.ussTags) != null) {
            str2 = ussTags.eventInfo;
        }
        c0158d.m2465v(str2);
        c0158d.m2460q(m18531c(swipeDirection));
        c0158d.m2462s(z ? "click" : "swipe");
        if (!z) {
            c0158d.m2466w("e_card");
            return c0158d;
        }
        if (swipeDirection == SwipeDirection.RIGHT) {
            c0158d.m2466w("e_likeButton");
            return c0158d;
        }
        if (swipeDirection == SwipeDirection.LEFT) {
            c0158d.m2466w("e_dislikeButton");
            return c0158d;
        }
        if (swipeDirection == SwipeDirection.UP) {
            c0158d.m2466w("e_superlikeButton");
        }
        return c0158d;
    }

    /* JADX INFO: renamed from: b */
    public static C0158d m18530b(String str, String str2) {
        C0158d c0158d = new C0158d(str);
        c0158d.m2460q(HomeStatisticsHelper.ScActionName.UNDO).m2462s("click").m2461r(HomeStatisticsHelper.ScActionFrom.SUGGEST).m2442E(str2);
        c0158d.m2466w("e_undo_button");
        return c0158d;
    }

    /* JADX INFO: renamed from: c */
    public static HomeStatisticsHelper.ScActionName m18531c(SwipeDirection swipeDirection) {
        int i = C1037a.f17016a[swipeDirection.ordinal()];
        if (i == 1) {
            return HomeStatisticsHelper.ScActionName.SUPER_LIKE;
        }
        if (i != 2) {
            return i != 3 ? HomeStatisticsHelper.ScActionName.UNKNOWN : HomeStatisticsHelper.ScActionName.DISLIKE;
        }
        return HomeStatisticsHelper.ScActionName.LIKE;
    }
}
