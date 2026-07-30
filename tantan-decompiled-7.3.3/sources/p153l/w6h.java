package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.feed.newui.group.groupdetail.module.groupfriend.FeedGroupFriendFrag;
import com.p051p1.mobile.putong.feed.newui.photoalbum.momentdetail.feedlist.FeedMaxHeightRecyclerView;
import p151v.VPullDownRefreshLayout;

/* JADX INFO: loaded from: classes13.dex */
public class w6h {
    /* JADX INFO: renamed from: a */
    public static void m205101a(FeedGroupFriendFrag feedGroupFriendFrag, View view) {
        feedGroupFriendFrag.f40937z = (VPullDownRefreshLayout) ((ViewGroup) view).getChildAt(0);
        feedGroupFriendFrag.f40932A = (FeedMaxHeightRecyclerView) view.findViewById(hdc0.f108976x1);
    }

    /* JADX INFO: renamed from: b */
    public static View m205102b(FeedGroupFriendFrag feedGroupFriendFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173496F0, viewGroup, false);
        m205101a(feedGroupFriendFrag, viewInflate);
        return viewInflate;
    }
}
