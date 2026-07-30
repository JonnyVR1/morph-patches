package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.feed.newui.photoalbum.DiscoveryPager;
import com.p000p1.mobile.putong.feed.newui.topic.topicplugin.FeedAggregationTabLayout;
import com.p000p1.mobile.putong.feed.newui.topic.topicplugin.FeedTopicContentWithPluginView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class k7i {
    /* JADX INFO: renamed from: a */
    public static void m11394a(FeedTopicContentWithPluginView feedTopicContentWithPluginView, View view) {
        feedTopicContentWithPluginView.f4696c = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedTopicContentWithPluginView.f4697d = (FeedAggregationTabLayout) viewGroup.getChildAt(0);
        feedTopicContentWithPluginView.f4698e = (DiscoveryPager) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m11395b(FeedTopicContentWithPluginView feedTopicContentWithPluginView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11031C3, viewGroup, false);
        m11394a(feedTopicContentWithPluginView, viewInflate);
        return viewInflate;
    }
}
