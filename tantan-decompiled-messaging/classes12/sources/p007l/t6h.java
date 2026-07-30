package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.feed.newui.group.groupdetail.module.relatedtopic.FeedGroupTopicFrag;
import com.p000p1.mobile.putong.feed.newui.photoalbum.momentdetail.feedlist.FeedMaxHeightRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class t6h {
    /* JADX INFO: renamed from: a */
    public static void m14436a(FeedGroupTopicFrag feedGroupTopicFrag, View view) {
        feedGroupTopicFrag.f1583z = (FeedMaxHeightRecyclerView) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m14437b(FeedGroupTopicFrag feedGroupTopicFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11076K0, viewGroup, false);
        m14436a(feedGroupTopicFrag, viewInflate);
        return viewInflate;
    }
}
