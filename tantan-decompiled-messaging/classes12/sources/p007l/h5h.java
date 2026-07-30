package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.feed.newui.group.groupdetail.module.groupfriend.FeedGroupFriendFrag;
import com.p000p1.mobile.putong.feed.newui.photoalbum.momentdetail.feedlist.FeedMaxHeightRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class h5h {
    /* JADX INFO: renamed from: a */
    public static void m10551a(FeedGroupFriendFrag feedGroupFriendFrag, View view) {
        feedGroupFriendFrag.f1550z = ((ViewGroup) view).getChildAt(0);
        feedGroupFriendFrag.f1545A = (FeedMaxHeightRecyclerView) view.findViewById(b5c0.f6104x1);
    }

    /* JADX INFO: renamed from: b */
    public static View m10552b(FeedGroupFriendFrag feedGroupFriendFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11046F0, viewGroup, false);
        m10551a(feedGroupFriendFrag, viewInflate);
        return viewInflate;
    }
}
