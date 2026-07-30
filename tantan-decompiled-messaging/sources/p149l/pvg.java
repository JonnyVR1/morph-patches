package p149l;

import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.newui.photoalbum.interaction.module.FeedInteractionTab;

/* JADX INFO: loaded from: classes12.dex */
public class pvg extends pkg {
    @Override // p149l.pkg
    /* JADX INFO: renamed from: d */
    public FeedInteractionTab mo115417d() {
        return FeedInteractionTab.Comment;
    }

    @Override // p149l.pkg
    /* JADX INFO: renamed from: g */
    public int mo115418g() {
        if (FeedModule.m60222H().counter_() == null) {
            return 0;
        }
        return FeedModule.m60222H().counter_().moments.unreadMomentComments;
    }

    @Override // p149l.p3h
    public String getTitle() {
        return "评论";
    }
}
