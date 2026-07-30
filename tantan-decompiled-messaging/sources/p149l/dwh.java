package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedQATopicInputJoinView;
import p147v.VEditText;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class dwh {
    /* JADX INFO: renamed from: a */
    public static void m113890a(FeedQATopicInputJoinView feedQATopicInputJoinView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedQATopicInputJoinView.f43062f = viewGroup.getChildAt(0);
        feedQATopicInputJoinView.f43063g = (LinearLayout) viewGroup.getChildAt(1);
        feedQATopicInputJoinView.f43064h = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedQATopicInputJoinView.f43065i = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        feedQATopicInputJoinView.f43066j = (VEditText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        feedQATopicInputJoinView.f43067k = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m113891b(FeedQATopicInputJoinView feedQATopicInputJoinView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142089P2, viewGroup, false);
        m113890a(feedQATopicInputJoinView, viewInflate);
        return viewInflate;
    }
}
