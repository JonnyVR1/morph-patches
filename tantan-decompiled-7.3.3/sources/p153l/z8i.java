package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.feed.newui.photoalbum.DiscoveryPager;
import com.p051p1.mobile.putong.feed.newui.topic.topicplugin.FeedAggregationTabLayout;
import com.p051p1.mobile.putong.feed.newui.topic.topicplugin.FeedTopicContentWithPluginView;

/* JADX INFO: loaded from: classes13.dex */
public class z8i {
    /* JADX INFO: renamed from: a */
    public static void m218967a(FeedTopicContentWithPluginView feedTopicContentWithPluginView, View view) {
        feedTopicContentWithPluginView.f44083c = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedTopicContentWithPluginView.f44084d = (FeedAggregationTabLayout) viewGroup.getChildAt(0);
        feedTopicContentWithPluginView.f44085e = (DiscoveryPager) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m218968b(FeedTopicContentWithPluginView feedTopicContentWithPluginView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173481C3, viewGroup, false);
        m218967a(feedTopicContentWithPluginView, viewInflate);
        return viewInflate;
    }
}
