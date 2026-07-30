package p007l;

import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.newui.photoalbum.interaction.module.FeedInteractionTab;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class eah extends pkg {
    @Override // p007l.pkg
    /* JADX INFO: renamed from: d */
    public FeedInteractionTab mo9686d() {
        return FeedInteractionTab.Like;
    }

    @Override // p007l.pkg
    /* JADX INFO: renamed from: g */
    public int mo9687g() {
        if (FeedModule.m1140H() == null || FeedModule.m1140H().counter_() == null || FeedModule.m1140H().counter_().moments == null) {
            return 0;
        }
        return FeedModule.m1140H().counter_().moments.unreadMomentLikes;
    }

    @Override // p007l.p3h
    public String getTitle() {
        return "赞";
    }
}
