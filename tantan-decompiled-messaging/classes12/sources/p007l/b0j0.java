package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile.TopicListItemView;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class b0j0 {
    /* JADX INFO: renamed from: a */
    public static void m8627a(TopicListItemView topicListItemView, View view) {
        topicListItemView.f3208a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        topicListItemView.f3209b = (TextView) viewGroup.getChildAt(0);
        topicListItemView.f3210c = (TextView) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m8628b(TopicListItemView topicListItemView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11037D3, viewGroup, false);
        m8627a(topicListItemView, viewInflate);
        return viewInflate;
    }
}
