package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.group.groupdetail.module.relatedtopic.FeedGroupTopicItem;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes13.dex */
public class j8h {
    /* JADX INFO: renamed from: a */
    public static void m143834a(FeedGroupTopicItem feedGroupTopicItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedGroupTopicItem.f40972a = (VDraweeView) viewGroup.getChildAt(0);
        feedGroupTopicItem.f40973b = (TextView) viewGroup.getChildAt(1);
        feedGroupTopicItem.f40974c = (TextView) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m143835b(FeedGroupTopicItem feedGroupTopicItem, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173520J0, viewGroup, false);
        m143834a(feedGroupTopicItem, viewInflate);
        return viewInflate;
    }
}
