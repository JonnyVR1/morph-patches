package p007l;

import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.newui.photoalbum.interaction.module.FeedInteractionTab;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class pvg extends pkg {
    @Override // p007l.pkg
    /* JADX INFO: renamed from: d */
    public FeedInteractionTab mo9686d() {
        return FeedInteractionTab.Comment;
    }

    @Override // p007l.pkg
    /* JADX INFO: renamed from: g */
    public int mo9687g() {
        if (FeedModule.m1140H().counter_() == null) {
            return 0;
        }
        return FeedModule.m1140H().counter_().moments.unreadMomentComments;
    }

    @Override // p007l.p3h
    public String getTitle() {
        return "评论";
    }
}
