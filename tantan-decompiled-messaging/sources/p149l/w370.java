package p149l;

import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes12.dex */
public class w370 {
    /* JADX INFO: renamed from: a */
    public C22306c<j760<Links, List<User>>> m201258a(Links links) {
        return FeedModule.f38855d.m209256Cd(xh5.m208763k(links.next), "fans/list/next");
    }

    /* JADX INFO: renamed from: b */
    public C22306c<j760<Links, List<User>>> m201259b(Links links) {
        return FeedModule.f38855d.m209256Cd(xh5.m208764l(links.next), "following/list/next");
    }

    /* JADX INFO: renamed from: c */
    public C22306c<j760<Links, List<User>>> m201260c() {
        return FeedModule.f38855d.m209256Cd(xh5.m208764l(""), "following_list_previous");
    }
}
