package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedQaBgRelativeLayout;
import com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTwoOptionTopicItem;
import com.p000p1.mobile.putong.feed.newui.topic.qatopic.QATopicTowOptionVoteView;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class kmb0 {
    /* JADX INFO: renamed from: a */
    public static void m11501a(QATopicTowOptionVoteView qATopicTowOptionVoteView, View view) {
        qATopicTowOptionVoteView.f4594c = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        qATopicTowOptionVoteView.f4595d = (FeedQaBgRelativeLayout) viewGroup.getChildAt(0);
        qATopicTowOptionVoteView.f4596e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        qATopicTowOptionVoteView.f4597f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        qATopicTowOptionVoteView.f4598g = (FeedQaTwoOptionTopicItem) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        qATopicTowOptionVoteView.f4599h = (FeedQaTwoOptionTopicItem) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        qATopicTowOptionVoteView.f4600i = (LinearLayout) viewGroup.getChildAt(2);
        qATopicTowOptionVoteView.f4601j = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        qATopicTowOptionVoteView.f4602k = (FeedQaTwoOptionTopicItem) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        qATopicTowOptionVoteView.f4603l = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        qATopicTowOptionVoteView.f4604m = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        qATopicTowOptionVoteView.f4605n = (FeedQaTwoOptionTopicItem) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m11502b(QATopicTowOptionVoteView qATopicTowOptionVoteView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11156X2, viewGroup, false);
        m11501a(qATopicTowOptionVoteView, viewInflate);
        return viewInflate;
    }
}
