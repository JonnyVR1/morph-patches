package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.feed.newui.group.groupdetail.module.relatedtopic.FeedGroupTopicFrag;
import com.p046p1.mobile.putong.feed.newui.photoalbum.momentdetail.feedlist.FeedMaxHeightRecyclerView;

/* JADX INFO: loaded from: classes12.dex */
public class t6h {
    /* JADX INFO: renamed from: a */
    public static void m187379a(FeedGroupTopicFrag feedGroupTopicFrag, View view) {
        feedGroupTopicFrag.f40122z = (FeedMaxHeightRecyclerView) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m187380b(FeedGroupTopicFrag feedGroupTopicFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142057K0, viewGroup, false);
        m187379a(feedGroupTopicFrag, viewInflate);
        return viewInflate;
    }
}
