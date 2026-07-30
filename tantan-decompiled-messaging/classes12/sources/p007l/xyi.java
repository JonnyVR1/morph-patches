package p007l;

import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.MomentAllowForwardState;
import com.p000p1.mobile.putong.feed.data.ThirdShareSource;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class xyi {
    /* JADX INFO: renamed from: a */
    public static boolean m16874a(Moment moment) {
        return m16875b(moment) || m16876c(moment);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m16875b(Moment moment) {
        ThirdShareSource thirdShareSource;
        String str;
        if (moment == null || (thirdShareSource = moment.thirdShareSource) == null || (str = thirdShareSource.sourceId) == null || vqg.m15465A(str) == null) {
            return true;
        }
        return m16877d(moment);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m16876c(Moment moment) {
        Moment momentM15465A;
        if (moment == null || (momentM15465A = vqg.m15465A(moment.thirdShareSource.sourceId)) == null) {
            return true;
        }
        return TEnum.equals(momentM15465A.allowForward, MomentAllowForwardState.disallow);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m16877d(Moment moment) {
        Moment momentM15465A;
        if (moment == null || (momentM15465A = vqg.m15465A(moment.thirdShareSource.sourceId)) == null) {
            return true;
        }
        return (TEnum.equals(momentM15465A.userSetVisibility, "everyone") || TEnum.equals(momentM15465A.userSetVisibility, "unknown_")) ? false : true;
    }
}
