package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicItem;
import com.p046p1.mobile.putong.feed.newui.topic.qatopic.QATopicMultiOptionVoteView;
import p147v.VFrame;

/* JADX INFO: loaded from: classes12.dex */
public class tkb0 {
    /* JADX INFO: renamed from: a */
    public static void m189468a(QATopicMultiOptionVoteView qATopicMultiOptionVoteView, View view) {
        qATopicMultiOptionVoteView.f43088c = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        qATopicMultiOptionVoteView.f43089d = (LinearLayout) viewGroup.getChildAt(0);
        qATopicMultiOptionVoteView.f43090e = (FeedQaTopicItem) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        qATopicMultiOptionVoteView.f43091f = (FeedQaTopicItem) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        qATopicMultiOptionVoteView.f43092g = (FeedQaTopicItem) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        qATopicMultiOptionVoteView.f43093h = (FeedQaTopicItem) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        qATopicMultiOptionVoteView.f43094i = (FeedQaTopicItem) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m189469b(QATopicMultiOptionVoteView qATopicMultiOptionVoteView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142125V2, viewGroup, false);
        m189468a(qATopicMultiOptionVoteView, viewInflate);
        return viewInflate;
    }
}
