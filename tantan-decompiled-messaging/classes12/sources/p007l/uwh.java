package p007l;

import com.p000p1.mobile.putong.feed.FeedModule;
import l.tpd0;
import l.uqd0;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class uwh {

    /* JADX INFO: renamed from: e */
    public static uwh f13973e;

    /* JADX INFO: renamed from: a */
    public a<Boolean> f13974a = a.c(Boolean.FALSE);

    /* JADX INFO: renamed from: b */
    public boolean f13975b = false;

    /* JADX INFO: renamed from: c */
    public uqd0 f13976c = new uqd0("feed_see_anim_will_random_user_id" + FeedModule.m1139F().userId(), "");

    /* JADX INFO: renamed from: d */
    public tpd0 f13977d = new tpd0("feed_last_total_likes_count" + FeedModule.m1139F().userId(), 0);

    /* JADX INFO: renamed from: a */
    public static uwh m15178a() {
        if (f13973e == null) {
            synchronized (uwh.class) {
                try {
                    if (f13973e == null) {
                        f13973e = new uwh();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f13973e;
    }
}
