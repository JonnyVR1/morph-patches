package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.feed.newui.group.groupdetail.module.groupfriend.FeedGroupFriendFrag;
import com.p046p1.mobile.putong.feed.newui.photoalbum.momentdetail.feedlist.FeedMaxHeightRecyclerView;
import p147v.VPullDownRefreshLayout;

/* JADX INFO: loaded from: classes12.dex */
public class h5h {
    /* JADX INFO: renamed from: a */
    public static void m129400a(FeedGroupFriendFrag feedGroupFriendFrag, View view) {
        feedGroupFriendFrag.f40089z = (VPullDownRefreshLayout) ((ViewGroup) view).getChildAt(0);
        feedGroupFriendFrag.f40084A = (FeedMaxHeightRecyclerView) view.findViewById(b5c0.f73623x1);
    }

    /* JADX INFO: renamed from: b */
    public static View m129401b(FeedGroupFriendFrag feedGroupFriendFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142027F0, viewGroup, false);
        m129400a(feedGroupFriendFrag, viewInflate);
        return viewInflate;
    }
}
