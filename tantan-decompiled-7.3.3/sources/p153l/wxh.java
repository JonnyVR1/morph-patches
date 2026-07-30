package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedQaTopicItem;
import com.p051p1.mobile.putong.feed.newui.topic.qatopic.QATopicVoteBgView;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class wxh {
    /* JADX INFO: renamed from: a */
    public static void m208412a(FeedQaTopicItem feedQaTopicItem, View view) {
        feedQaTopicItem.f43917a = (RelativeLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedQaTopicItem.f43918b = (QATopicVoteBgView) viewGroup.getChildAt(0);
        feedQaTopicItem.f43919c = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        feedQaTopicItem.f43920d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m208413b(FeedQaTopicItem feedQaTopicItem, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173600W2, viewGroup, false);
        m208412a(feedQaTopicItem, viewInflate);
        return viewInflate;
    }
}
