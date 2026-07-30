package p007l;

import com.p000p1.mobile.putong.data.Links;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import java.util.List;
import l.j760;
import l.xh5;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class w370 {
    /* JADX INFO: renamed from: a */
    public c<j760<Links, List<User>>> m15681a(Links links) {
        return FeedModule.f316d.m16437Cd(xh5.k(links.next), "fans/list/next");
    }

    /* JADX INFO: renamed from: b */
    public c<j760<Links, List<User>>> m15682b(Links links) {
        return FeedModule.f316d.m16437Cd(xh5.l(links.next), "following/list/next");
    }

    /* JADX INFO: renamed from: c */
    public c<j760<Links, List<User>>> m15683c() {
        return FeedModule.f316d.m16437Cd(xh5.l(""), "following_list_previous");
    }
}
