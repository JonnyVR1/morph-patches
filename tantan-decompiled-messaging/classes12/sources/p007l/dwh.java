package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedQATopicInputJoinView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class dwh {
    /* JADX INFO: renamed from: a */
    public static void m9580a(FeedQATopicInputJoinView feedQATopicInputJoinView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedQATopicInputJoinView.f4523f = viewGroup.getChildAt(0);
        feedQATopicInputJoinView.f4524g = (LinearLayout) viewGroup.getChildAt(1);
        feedQATopicInputJoinView.f4525h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedQATopicInputJoinView.f4526i = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        feedQATopicInputJoinView.f4527j = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        feedQATopicInputJoinView.f4528k = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m9581b(FeedQATopicInputJoinView feedQATopicInputJoinView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11108P2, viewGroup, false);
        m9580a(feedQATopicInputJoinView, viewInflate);
        return viewInflate;
    }
}
