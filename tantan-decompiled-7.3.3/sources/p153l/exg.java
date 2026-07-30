package p153l;

import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.newui.photoalbum.interaction.module.FeedInteractionTab;

/* JADX INFO: loaded from: classes13.dex */
public class exg extends emg {
    @Override // p153l.emg
    /* JADX INFO: renamed from: d */
    public FeedInteractionTab mo121359d() {
        return FeedInteractionTab.Comment;
    }

    @Override // p153l.emg
    /* JADX INFO: renamed from: g */
    public int mo121362g() {
        if (FeedModule.m61406H().counter_() == null) {
            return 0;
        }
        return FeedModule.m61406H().counter_().moments.unreadMomentComments;
    }

    @Override // p153l.e5h
    public String getTitle() {
        return "评论";
    }
}
