package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.group.aggregation.header.FeedGroupAggregationHeaderView;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class o4h {
    /* JADX INFO: renamed from: a */
    public static void m12443a(FeedGroupAggregationHeaderView feedGroupAggregationHeaderView, View view) {
        feedGroupAggregationHeaderView.f1430a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedGroupAggregationHeaderView.f1431b = viewGroup.getChildAt(0);
        feedGroupAggregationHeaderView.f1432c = (TextView) viewGroup.getChildAt(1);
        feedGroupAggregationHeaderView.f1433d = (TextView) viewGroup.getChildAt(2);
        feedGroupAggregationHeaderView.f1434e = viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m12444b(FeedGroupAggregationHeaderView feedGroupAggregationHeaderView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11028C0, viewGroup, false);
        m12443a(feedGroupAggregationHeaderView, viewInflate);
        return viewInflate;
    }
}
