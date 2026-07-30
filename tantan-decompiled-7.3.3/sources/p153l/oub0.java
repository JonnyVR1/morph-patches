package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedQaBgRelativeLayout;
import com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTwoOptionTopicItem;
import com.p051p1.mobile.putong.feed.newui.topic.qatopic.QATopicTowOptionVoteView;
import p151v.VFrame;

/* JADX INFO: loaded from: classes13.dex */
public class oub0 {
    /* JADX INFO: renamed from: a */
    public static void m169283a(QATopicTowOptionVoteView qATopicTowOptionVoteView, View view) {
        qATopicTowOptionVoteView.f43981c = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        qATopicTowOptionVoteView.f43982d = (FeedQaBgRelativeLayout) viewGroup.getChildAt(0);
        qATopicTowOptionVoteView.f43983e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        qATopicTowOptionVoteView.f43984f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        qATopicTowOptionVoteView.f43985g = (FeedQaTwoOptionTopicItem) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        qATopicTowOptionVoteView.f43986h = (FeedQaTwoOptionTopicItem) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        qATopicTowOptionVoteView.f43987i = (LinearLayout) viewGroup.getChildAt(2);
        qATopicTowOptionVoteView.f43988j = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        qATopicTowOptionVoteView.f43989k = (FeedQaTwoOptionTopicItem) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        qATopicTowOptionVoteView.f43990l = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        qATopicTowOptionVoteView.f43991m = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        qATopicTowOptionVoteView.f43992n = (FeedQaTwoOptionTopicItem) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m169284b(QATopicTowOptionVoteView qATopicTowOptionVoteView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173606X2, viewGroup, false);
        m169283a(qATopicTowOptionVoteView, viewInflate);
        return viewInflate;
    }
}
