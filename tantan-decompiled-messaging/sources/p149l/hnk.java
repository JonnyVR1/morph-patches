package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.topic.topiclist.GroupTopicListCombineItemView;
import p147v.VImage;

/* JADX INFO: loaded from: classes12.dex */
public class hnk {
    /* JADX INFO: renamed from: a */
    public static void m131942a(GroupTopicListCombineItemView groupTopicListCombineItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        groupTopicListCombineItemView.f43198c = (TextView) viewGroup.getChildAt(0);
        groupTopicListCombineItemView.f43199d = (TextView) viewGroup.getChildAt(1);
        groupTopicListCombineItemView.f43200e = (VImage) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m131943b(GroupTopicListCombineItemView groupTopicListCombineItemView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142029F2, viewGroup, false);
        m131942a(groupTopicListCombineItemView, viewInflate);
        return viewInflate;
    }
}
