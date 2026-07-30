package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.feed.newui.topic.qatopic.FeedChangeQATopicInputJoinView;
import p151v.VEditText;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class jvg {
    /* JADX INFO: renamed from: a */
    public static void m147036a(FeedChangeQATopicInputJoinView feedChangeQATopicInputJoinView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedChangeQATopicInputJoinView.f43902f = viewGroup.getChildAt(0);
        feedChangeQATopicInputJoinView.f43903g = (LinearLayout) viewGroup.getChildAt(1);
        feedChangeQATopicInputJoinView.f43904h = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedChangeQATopicInputJoinView.f43905i = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        feedChangeQATopicInputJoinView.f43906j = (VEditText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        feedChangeQATopicInputJoinView.f43907k = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2)).getChildAt(0);
        feedChangeQATopicInputJoinView.f43908l = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2)).getChildAt(1);
        feedChangeQATopicInputJoinView.f43909m = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m147037b(FeedChangeQATopicInputJoinView feedChangeQATopicInputJoinView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173564Q2, viewGroup, false);
        m147036a(feedChangeQATopicInputJoinView, viewInflate);
        return viewInflate;
    }
}
