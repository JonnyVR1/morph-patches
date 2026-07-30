package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.group.groupdetail.module.relatedtopic.FeedGroupTopicItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class u6h {
    /* JADX INFO: renamed from: a */
    public static void m14773a(FeedGroupTopicItem feedGroupTopicItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedGroupTopicItem.f1585a = viewGroup.getChildAt(0);
        feedGroupTopicItem.f1586b = (TextView) viewGroup.getChildAt(1);
        feedGroupTopicItem.f1587c = (TextView) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m14774b(FeedGroupTopicItem feedGroupTopicItem, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11070J0, viewGroup, false);
        m14773a(feedGroupTopicItem, viewInflate);
        return viewInflate;
    }
}
