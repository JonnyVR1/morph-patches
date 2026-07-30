package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicItem;
import com.p051p1.mobile.putong.feed.newui.topic.qatopic.QATopicMultiOptionVoteView;
import p151v.VFrame;

/* JADX INFO: loaded from: classes13.dex */
public class xsb0 {
    /* JADX INFO: renamed from: a */
    public static void m212963a(QATopicMultiOptionVoteView qATopicMultiOptionVoteView, View view) {
        qATopicMultiOptionVoteView.f43936c = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        qATopicMultiOptionVoteView.f43937d = (LinearLayout) viewGroup.getChildAt(0);
        qATopicMultiOptionVoteView.f43938e = (FeedQaTopicItem) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        qATopicMultiOptionVoteView.f43939f = (FeedQaTopicItem) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        qATopicMultiOptionVoteView.f43940g = (FeedQaTopicItem) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        qATopicMultiOptionVoteView.f43941h = (FeedQaTopicItem) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        qATopicMultiOptionVoteView.f43942i = (FeedQaTopicItem) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m212964b(QATopicMultiOptionVoteView qATopicMultiOptionVoteView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173594V2, viewGroup, false);
        m212963a(qATopicMultiOptionVoteView, viewInflate);
        return viewInflate;
    }
}
