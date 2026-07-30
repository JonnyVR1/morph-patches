package p149l;

import com.p046p1.mobile.putong.feed.FeedModule;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes12.dex */
public class uwh {

    /* JADX INFO: renamed from: e */
    public static uwh f178643e;

    /* JADX INFO: renamed from: a */
    public C22392a<Boolean> f178644a = C22392a.m221513c(Boolean.FALSE);

    /* JADX INFO: renamed from: b */
    public boolean f178645b = false;

    /* JADX INFO: renamed from: c */
    public uqd0 f178646c = new uqd0("feed_see_anim_will_random_user_id" + FeedModule.m60221F().userId(), "");

    /* JADX INFO: renamed from: d */
    public tpd0 f178647d = new tpd0("feed_last_total_likes_count" + FeedModule.m60221F().userId(), 0);

    /* JADX INFO: renamed from: a */
    public static uwh m196129a() {
        if (f178643e == null) {
            synchronized (uwh.class) {
                try {
                    if (f178643e == null) {
                        f178643e = new uwh();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f178643e;
    }
}
