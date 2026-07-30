package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.feed.newui.photoalbum.DiscoveryPager;
import com.p046p1.mobile.putong.feed.newui.topic.topicplugin.FeedAggregationTabLayout;
import com.p046p1.mobile.putong.feed.newui.topic.topicplugin.FeedTopicContentWithPluginView;

/* JADX INFO: loaded from: classes12.dex */
public class k7i {
    /* JADX INFO: renamed from: a */
    public static void m144676a(FeedTopicContentWithPluginView feedTopicContentWithPluginView, View view) {
        feedTopicContentWithPluginView.f43235c = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedTopicContentWithPluginView.f43236d = (FeedAggregationTabLayout) viewGroup.getChildAt(0);
        feedTopicContentWithPluginView.f43237e = (DiscoveryPager) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m144677b(FeedTopicContentWithPluginView feedTopicContentWithPluginView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142012C3, viewGroup, false);
        m144676a(feedTopicContentWithPluginView, viewInflate);
        return viewInflate;
    }
}
