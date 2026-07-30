package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.feed.newui.topic.topiclist.TopicOfficialItemView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class m9j0 {
    /* JADX INFO: renamed from: a */
    public static void m157575a(TopicOfficialItemView topicOfficialItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        topicOfficialItemView.f44080a = (VText) viewGroup.getChildAt(0);
        topicOfficialItemView.f44081b = (VDraweeView) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m157576b(TopicOfficialItemView topicOfficialItemView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173469A5, viewGroup, false);
        m157575a(topicOfficialItemView, viewInflate);
        return viewInflate;
    }
}
