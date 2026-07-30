package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.group.groupdetail.module.relatedtopic.FeedGroupTopicItem;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes12.dex */
public class u6h {
    /* JADX INFO: renamed from: a */
    public static void m191976a(FeedGroupTopicItem feedGroupTopicItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedGroupTopicItem.f40124a = (VDraweeView) viewGroup.getChildAt(0);
        feedGroupTopicItem.f40125b = (TextView) viewGroup.getChildAt(1);
        feedGroupTopicItem.f40126c = (TextView) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m191977b(FeedGroupTopicItem feedGroupTopicItem, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142051J0, viewGroup, false);
        m191976a(feedGroupTopicItem, viewInflate);
        return viewInflate;
    }
}
