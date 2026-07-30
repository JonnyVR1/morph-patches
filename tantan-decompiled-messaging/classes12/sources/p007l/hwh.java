package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicItem;
import com.p000p1.mobile.putong.feed.newui.topic.qatopic.QATopicVoteBgView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class hwh {
    /* JADX INFO: renamed from: a */
    public static void m10732a(FeedQaTopicItem feedQaTopicItem, View view) {
        feedQaTopicItem.f4530a = (RelativeLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedQaTopicItem.f4531b = (QATopicVoteBgView) viewGroup.getChildAt(0);
        feedQaTopicItem.f4532c = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        feedQaTopicItem.f4533d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m10733b(FeedQaTopicItem feedQaTopicItem, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11150W2, viewGroup, false);
        m10732a(feedQaTopicItem, viewInflate);
        return viewInflate;
    }
}
