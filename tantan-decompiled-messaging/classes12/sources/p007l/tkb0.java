package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicItem;
import com.p000p1.mobile.putong.feed.newui.topic.qatopic.QATopicMultiOptionVoteView;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class tkb0 {
    /* JADX INFO: renamed from: a */
    public static void m14562a(QATopicMultiOptionVoteView qATopicMultiOptionVoteView, View view) {
        qATopicMultiOptionVoteView.f4549c = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        qATopicMultiOptionVoteView.f4550d = (LinearLayout) viewGroup.getChildAt(0);
        qATopicMultiOptionVoteView.f4551e = (FeedQaTopicItem) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        qATopicMultiOptionVoteView.f4552f = (FeedQaTopicItem) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        qATopicMultiOptionVoteView.f4553g = (FeedQaTopicItem) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        qATopicMultiOptionVoteView.f4554h = (FeedQaTopicItem) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        qATopicMultiOptionVoteView.f4555i = (FeedQaTopicItem) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m14563b(QATopicMultiOptionVoteView qATopicMultiOptionVoteView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11144V2, viewGroup, false);
        m14562a(qATopicMultiOptionVoteView, viewInflate);
        return viewInflate;
    }
}
