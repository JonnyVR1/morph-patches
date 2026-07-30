package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.topic.topiclist.GroupTopicListCombineItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class hnk {
    /* JADX INFO: renamed from: a */
    public static void m10680a(GroupTopicListCombineItemView groupTopicListCombineItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        groupTopicListCombineItemView.f4659c = (TextView) viewGroup.getChildAt(0);
        groupTopicListCombineItemView.f4660d = (TextView) viewGroup.getChildAt(1);
        groupTopicListCombineItemView.f4661e = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m10681b(GroupTopicListCombineItemView groupTopicListCombineItemView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11048F2, viewGroup, false);
        m10680a(groupTopicListCombineItemView, viewInflate);
        return viewInflate;
    }
}
