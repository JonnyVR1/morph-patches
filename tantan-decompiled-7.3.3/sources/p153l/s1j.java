package p153l;

import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.MomentAllowForwardState;
import com.p051p1.mobile.putong.feed.data.ThirdShareSource;

/* JADX INFO: loaded from: classes13.dex */
public class s1j {
    /* JADX INFO: renamed from: a */
    public static boolean m184047a(Moment moment) {
        return m184048b(moment) || m184049c(moment);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m184048b(Moment moment) {
        ThirdShareSource thirdShareSource;
        String str;
        if (moment == null || (thirdShareSource = moment.thirdShareSource) == null || (str = thirdShareSource.sourceId) == null || ksg.m151154A(str) == null) {
            return true;
        }
        return m184050d(moment);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m184049c(Moment moment) {
        Moment momentM151154A;
        if (moment == null || (momentM151154A = ksg.m151154A(moment.thirdShareSource.sourceId)) == null) {
            return true;
        }
        return TEnum.equals(momentM151154A.allowForward, MomentAllowForwardState.disallow);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m184050d(Moment moment) {
        Moment momentM151154A;
        if (moment == null || (momentM151154A = ksg.m151154A(moment.thirdShareSource.sourceId)) == null) {
            return true;
        }
        return (TEnum.equals(momentM151154A.userSetVisibility, "everyone") || TEnum.equals(momentM151154A.userSetVisibility, "unknown_")) ? false : true;
    }
}
