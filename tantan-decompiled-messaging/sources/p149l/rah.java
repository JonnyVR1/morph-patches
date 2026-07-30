package p149l;

import com.p046p1.mobile.putong.feed.FeedModule;

/* JADX INFO: loaded from: classes12.dex */
public class rah {

    /* JADX INFO: renamed from: a */
    public static long f158517a = 86400000;

    /* JADX INFO: renamed from: b */
    public static zpd0 f158518b = new zpd0("last_start_show_quick_comment_time_" + FeedModule.m60221F().userId(), 0L);

    /* JADX INFO: renamed from: c */
    public static tpd0 f158519c = new tpd0("quick_comment_show_count_" + FeedModule.m60221F().userId(), 0);

    /* JADX INFO: renamed from: a */
    public static boolean m178493a() {
        if (mqi0.m155944o() - f158518b.get().longValue() > f158517a) {
            f158518b.put(Long.valueOf(mqi0.m155944o()));
            f158519c.put(1);
            return true;
        }
        int iIntValue = f158519c.get().intValue();
        if (iIntValue >= nkg.m159890l()) {
            return false;
        }
        f158519c.put(Integer.valueOf(iIntValue + 1));
        return true;
    }
}
