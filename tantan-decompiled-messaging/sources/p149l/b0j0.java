package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.personfeedinprofile.TopicListItemView;
import p147v.VLinear;

/* JADX INFO: loaded from: classes12.dex */
public class b0j0 {
    /* JADX INFO: renamed from: a */
    public static void m99780a(TopicListItemView topicListItemView, View view) {
        topicListItemView.f41747a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        topicListItemView.f41748b = (TextView) viewGroup.getChildAt(0);
        topicListItemView.f41749c = (TextView) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m99781b(TopicListItemView topicListItemView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142018D3, viewGroup, false);
        m99780a(topicListItemView, viewInflate);
        return viewInflate;
    }
}
