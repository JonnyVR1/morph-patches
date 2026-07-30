package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.topic.topiclist.FeedGroupTopicListCombineItemViewNewUI;
import p151v.VImage;

/* JADX INFO: loaded from: classes13.dex */
public class k8h {
    /* JADX INFO: renamed from: a */
    public static void m148710a(FeedGroupTopicListCombineItemViewNewUI feedGroupTopicListCombineItemViewNewUI, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedGroupTopicListCombineItemViewNewUI.f44043c = (VImage) viewGroup.getChildAt(0);
        feedGroupTopicListCombineItemViewNewUI.f44044d = (TextView) viewGroup.getChildAt(1);
        feedGroupTopicListCombineItemViewNewUI.f44045e = (TextView) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m148711b(FeedGroupTopicListCombineItemViewNewUI feedGroupTopicListCombineItemViewNewUI, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173727p0, viewGroup, false);
        m148710a(feedGroupTopicListCombineItemViewNewUI, viewInflate);
        return viewInflate;
    }
}
