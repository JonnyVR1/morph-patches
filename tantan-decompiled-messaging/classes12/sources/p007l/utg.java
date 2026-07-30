package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedChangeQATopicInputJoinView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class utg {
    /* JADX INFO: renamed from: a */
    public static void m15135a(FeedChangeQATopicInputJoinView feedChangeQATopicInputJoinView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedChangeQATopicInputJoinView.f4515f = viewGroup.getChildAt(0);
        feedChangeQATopicInputJoinView.f4516g = (LinearLayout) viewGroup.getChildAt(1);
        feedChangeQATopicInputJoinView.f4517h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedChangeQATopicInputJoinView.f4518i = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        feedChangeQATopicInputJoinView.f4519j = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        feedChangeQATopicInputJoinView.f4520k = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2)).getChildAt(0);
        feedChangeQATopicInputJoinView.f4521l = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2)).getChildAt(1);
        feedChangeQATopicInputJoinView.f4522m = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m15136b(FeedChangeQATopicInputJoinView feedChangeQATopicInputJoinView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11114Q2, viewGroup, false);
        m15135a(feedChangeQATopicInputJoinView, viewInflate);
        return viewInflate;
    }
}
