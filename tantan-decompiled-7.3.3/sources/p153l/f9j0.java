package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile.TopicListItemView;
import p151v.VLinear;

/* JADX INFO: loaded from: classes13.dex */
public class f9j0 {
    /* JADX INFO: renamed from: a */
    public static void m124666a(TopicListItemView topicListItemView, View view) {
        topicListItemView.f42595a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        topicListItemView.f42596b = (TextView) viewGroup.getChildAt(0);
        topicListItemView.f42597c = (TextView) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m124667b(TopicListItemView topicListItemView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173487D3, viewGroup, false);
        m124666a(topicListItemView, viewInflate);
        return viewInflate;
    }
}
