package p149l;

import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.MomentAllowForwardState;
import com.p046p1.mobile.putong.feed.data.ThirdShareSource;

/* JADX INFO: loaded from: classes12.dex */
public class xyi {
    /* JADX INFO: renamed from: a */
    public static boolean m211769a(Moment moment) {
        return m211770b(moment) || m211771c(moment);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m211770b(Moment moment) {
        ThirdShareSource thirdShareSource;
        String str;
        if (moment == null || (thirdShareSource = moment.thirdShareSource) == null || (str = thirdShareSource.sourceId) == null || vqg.m199495A(str) == null) {
            return true;
        }
        return m211772d(moment);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m211771c(Moment moment) {
        Moment momentM199495A;
        if (moment == null || (momentM199495A = vqg.m199495A(moment.thirdShareSource.sourceId)) == null) {
            return true;
        }
        return TEnum.equals(momentM199495A.allowForward, MomentAllowForwardState.disallow);
    }

    /* JADX INFO: renamed from: d */
    public static boolean m211772d(Moment moment) {
        Moment momentM199495A;
        if (moment == null || (momentM199495A = vqg.m199495A(moment.thirdShareSource.sourceId)) == null) {
            return true;
        }
        return (TEnum.equals(momentM199495A.userSetVisibility, "everyone") || TEnum.equals(momentM199495A.userSetVisibility, "unknown_")) ? false : true;
    }
}
