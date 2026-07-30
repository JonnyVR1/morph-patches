package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.topic.topiclist.FeedGroupTopicListCombineItemViewNewUI;
import p147v.VImage;

/* JADX INFO: loaded from: classes12.dex */
public class v6h {
    /* JADX INFO: renamed from: a */
    public static void m197202a(FeedGroupTopicListCombineItemViewNewUI feedGroupTopicListCombineItemViewNewUI, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedGroupTopicListCombineItemViewNewUI.f43195c = (VImage) viewGroup.getChildAt(0);
        feedGroupTopicListCombineItemViewNewUI.f43196d = (TextView) viewGroup.getChildAt(1);
        feedGroupTopicListCombineItemViewNewUI.f43197e = (TextView) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m197203b(FeedGroupTopicListCombineItemViewNewUI feedGroupTopicListCombineItemViewNewUI, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142258p0, viewGroup, false);
        m197202a(feedGroupTopicListCombineItemViewNewUI, viewInflate);
        return viewInflate;
    }
}
