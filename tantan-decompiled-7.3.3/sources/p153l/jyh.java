package p153l;

import com.p051p1.mobile.putong.feed.FeedModule;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes13.dex */
public class jyh {

    /* JADX INFO: renamed from: e */
    public static jyh f123144e;

    /* JADX INFO: renamed from: a */
    public C22507a<Boolean> f123145a = C22507a.m222759c(Boolean.FALSE);

    /* JADX INFO: renamed from: b */
    public boolean f123146b = false;

    /* JADX INFO: renamed from: c */
    public wyd0 f123147c = new wyd0("feed_see_anim_will_random_user_id" + FeedModule.m61405F().userId(), "");

    /* JADX INFO: renamed from: d */
    public vxd0 f123148d = new vxd0("feed_last_total_likes_count" + FeedModule.m61405F().userId(), 0);

    /* JADX INFO: renamed from: a */
    public static jyh m147543a() {
        if (f123144e == null) {
            synchronized (jyh.class) {
                try {
                    if (f123144e == null) {
                        f123144e = new jyh();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f123144e;
    }
}
