package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedQATopicInputJoinView;
import p151v.VEditText;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class sxh {
    /* JADX INFO: renamed from: a */
    public static void m188478a(FeedQATopicInputJoinView feedQATopicInputJoinView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedQATopicInputJoinView.f43910f = viewGroup.getChildAt(0);
        feedQATopicInputJoinView.f43911g = (LinearLayout) viewGroup.getChildAt(1);
        feedQATopicInputJoinView.f43912h = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedQATopicInputJoinView.f43913i = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        feedQATopicInputJoinView.f43914j = (VEditText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        feedQATopicInputJoinView.f43915k = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m188479b(FeedQATopicInputJoinView feedQATopicInputJoinView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173558P2, viewGroup, false);
        m188478a(feedQATopicInputJoinView, viewInflate);
        return viewInflate;
    }
}
