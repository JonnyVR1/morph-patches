package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedChangeQATopicInputJoinView;
import p147v.VEditText;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class utg {
    /* JADX INFO: renamed from: a */
    public static void m195304a(FeedChangeQATopicInputJoinView feedChangeQATopicInputJoinView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedChangeQATopicInputJoinView.f43054f = viewGroup.getChildAt(0);
        feedChangeQATopicInputJoinView.f43055g = (LinearLayout) viewGroup.getChildAt(1);
        feedChangeQATopicInputJoinView.f43056h = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedChangeQATopicInputJoinView.f43057i = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        feedChangeQATopicInputJoinView.f43058j = (VEditText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        feedChangeQATopicInputJoinView.f43059k = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2)).getChildAt(0);
        feedChangeQATopicInputJoinView.f43060l = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2)).getChildAt(1);
        feedChangeQATopicInputJoinView.f43061m = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m195305b(FeedChangeQATopicInputJoinView feedChangeQATopicInputJoinView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142095Q2, viewGroup, false);
        m195304a(feedChangeQATopicInputJoinView, viewInflate);
        return viewInflate;
    }
}
