package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedQaBgRelativeLayout;
import com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTwoOptionTopicItem;
import com.p046p1.mobile.putong.feed.newui.topic.qatopic.QATopicTowOptionVoteView;
import p147v.VFrame;

/* JADX INFO: loaded from: classes12.dex */
public class kmb0 {
    /* JADX INFO: renamed from: a */
    public static void m146489a(QATopicTowOptionVoteView qATopicTowOptionVoteView, View view) {
        qATopicTowOptionVoteView.f43133c = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        qATopicTowOptionVoteView.f43134d = (FeedQaBgRelativeLayout) viewGroup.getChildAt(0);
        qATopicTowOptionVoteView.f43135e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        qATopicTowOptionVoteView.f43136f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        qATopicTowOptionVoteView.f43137g = (FeedQaTwoOptionTopicItem) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        qATopicTowOptionVoteView.f43138h = (FeedQaTwoOptionTopicItem) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        qATopicTowOptionVoteView.f43139i = (LinearLayout) viewGroup.getChildAt(2);
        qATopicTowOptionVoteView.f43140j = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        qATopicTowOptionVoteView.f43141k = (FeedQaTwoOptionTopicItem) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        qATopicTowOptionVoteView.f43142l = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        qATopicTowOptionVoteView.f43143m = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        qATopicTowOptionVoteView.f43144n = (FeedQaTwoOptionTopicItem) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m146490b(QATopicTowOptionVoteView qATopicTowOptionVoteView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142137X2, viewGroup, false);
        m146489a(qATopicTowOptionVoteView, viewInflate);
        return viewInflate;
    }
}
