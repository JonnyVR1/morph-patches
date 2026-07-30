package p153l;

import com.p051p1.mobile.putong.feed.FeedModule;

/* JADX INFO: loaded from: classes13.dex */
public class gch {

    /* JADX INFO: renamed from: a */
    public static long f103570a = 86400000;

    /* JADX INFO: renamed from: b */
    public static byd0 f103571b = new byd0("last_start_show_quick_comment_time_" + FeedModule.m61405F().userId(), 0L);

    /* JADX INFO: renamed from: c */
    public static vxd0 f103572c = new vxd0("quick_comment_show_count_" + FeedModule.m61405F().userId(), 0);

    /* JADX INFO: renamed from: a */
    public static boolean m129869a() {
        if (pzi0.m174454o() - f103571b.get().longValue() > f103570a) {
            f103571b.put(Long.valueOf(pzi0.m174454o()));
            f103572c.put(1);
            return true;
        }
        int iIntValue = f103572c.get().intValue();
        if (iIntValue >= cmg.m111219l()) {
            return false;
        }
        f103572c.put(Integer.valueOf(iIntValue + 1));
        return true;
    }
}
