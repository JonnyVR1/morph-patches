package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.topic.topiclist.FeedGroupTopicListCombineItemViewNewUI;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class v6h {
    /* JADX INFO: renamed from: a */
    public static void m15343a(FeedGroupTopicListCombineItemViewNewUI feedGroupTopicListCombineItemViewNewUI, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedGroupTopicListCombineItemViewNewUI.f4656c = viewGroup.getChildAt(0);
        feedGroupTopicListCombineItemViewNewUI.f4657d = (TextView) viewGroup.getChildAt(1);
        feedGroupTopicListCombineItemViewNewUI.f4658e = (TextView) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m15344b(FeedGroupTopicListCombineItemViewNewUI feedGroupTopicListCombineItemViewNewUI, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11277p0, viewGroup, false);
        m15343a(feedGroupTopicListCombineItemViewNewUI, viewInflate);
        return viewInflate;
    }
}
