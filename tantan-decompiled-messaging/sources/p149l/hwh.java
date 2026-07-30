package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicItem;
import com.p046p1.mobile.putong.feed.newui.topic.qatopic.QATopicVoteBgView;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class hwh {
    /* JADX INFO: renamed from: a */
    public static void m133245a(FeedQaTopicItem feedQaTopicItem, View view) {
        feedQaTopicItem.f43069a = (RelativeLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedQaTopicItem.f43070b = (QATopicVoteBgView) viewGroup.getChildAt(0);
        feedQaTopicItem.f43071c = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        feedQaTopicItem.f43072d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m133246b(FeedQaTopicItem feedQaTopicItem, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142131W2, viewGroup, false);
        m133245a(feedQaTopicItem, viewInflate);
        return viewInflate;
    }
}
