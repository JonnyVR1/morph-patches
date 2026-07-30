package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.feed.newui.group.groupdetail.module.relatedtopic.FeedGroupTopicFrag;
import com.p051p1.mobile.putong.feed.newui.photoalbum.momentdetail.feedlist.FeedMaxHeightRecyclerView;

/* JADX INFO: loaded from: classes13.dex */
public class i8h {
    /* JADX INFO: renamed from: a */
    public static void m139009a(FeedGroupTopicFrag feedGroupTopicFrag, View view) {
        feedGroupTopicFrag.f40970z = (FeedMaxHeightRecyclerView) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m139010b(FeedGroupTopicFrag feedGroupTopicFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173526K0, viewGroup, false);
        m139009a(feedGroupTopicFrag, viewInflate);
        return viewInflate;
    }
}
