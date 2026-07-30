package p007l;

import com.p000p1.mobile.putong.feed.FeedModule;
import l.mqi0;
import l.tpd0;
import l.zpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class rah {

    /* JADX INFO: renamed from: a */
    public static long f12579a = 86400000;

    /* JADX INFO: renamed from: b */
    public static zpd0 f12580b = new zpd0("last_start_show_quick_comment_time_" + FeedModule.m1139F().userId(), 0L);

    /* JADX INFO: renamed from: c */
    public static tpd0 f12581c = new tpd0("quick_comment_show_count_" + FeedModule.m1139F().userId(), 0);

    /* JADX INFO: renamed from: a */
    public static boolean m13889a() {
        if (mqi0.o() - ((Long) f12580b.get()).longValue() > f12579a) {
            f12580b.put(Long.valueOf(mqi0.o()));
            f12581c.put(1);
            return true;
        }
        int iIntValue = ((Integer) f12581c.get()).intValue();
        if (iIntValue >= nkg.m12249l()) {
            return false;
        }
        f12581c.put(Integer.valueOf(iIntValue + 1));
        return true;
    }
}
