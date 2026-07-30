package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.topic.topiclist.GroupTopicListCombineItemView;
import p151v.VImage;

/* JADX INFO: loaded from: classes13.dex */
public class xpk {
    /* JADX INFO: renamed from: a */
    public static void m212657a(GroupTopicListCombineItemView groupTopicListCombineItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        groupTopicListCombineItemView.f44046c = (TextView) viewGroup.getChildAt(0);
        groupTopicListCombineItemView.f44047d = (TextView) viewGroup.getChildAt(1);
        groupTopicListCombineItemView.f44048e = (VImage) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m212658b(GroupTopicListCombineItemView groupTopicListCombineItemView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173498F2, viewGroup, false);
        m212657a(groupTopicListCombineItemView, viewInflate);
        return viewInflate;
    }
}
