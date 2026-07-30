package p153l;

import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes13.dex */
public class cc70 {
    /* JADX INFO: renamed from: a */
    public C22421c<pf60<Links, List<User>>> m108703a(Links links) {
        return FeedModule.f39703d.m145497Cd(xi5.m211109k(links.next), "fans/list/next");
    }

    /* JADX INFO: renamed from: b */
    public C22421c<pf60<Links, List<User>>> m108704b(Links links) {
        return FeedModule.f39703d.m145497Cd(xi5.m211110l(links.next), "following/list/next");
    }

    /* JADX INFO: renamed from: c */
    public C22421c<pf60<Links, List<User>>> m108705c() {
        return FeedModule.f39703d.m145497Cd(xi5.m211110l(""), "following_list_previous");
    }
}
