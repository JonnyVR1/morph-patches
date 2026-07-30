package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.group.aggregation.header.FeedGroupAggregationHeaderView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;

/* JADX INFO: loaded from: classes12.dex */
public class o4h {
    /* JADX INFO: renamed from: a */
    public static void m162574a(FeedGroupAggregationHeaderView feedGroupAggregationHeaderView, View view) {
        feedGroupAggregationHeaderView.f39969a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedGroupAggregationHeaderView.f39970b = (VDraweeView) viewGroup.getChildAt(0);
        feedGroupAggregationHeaderView.f39971c = (TextView) viewGroup.getChildAt(1);
        feedGroupAggregationHeaderView.f39972d = (TextView) viewGroup.getChildAt(2);
        feedGroupAggregationHeaderView.f39973e = (VImage) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m162575b(FeedGroupAggregationHeaderView feedGroupAggregationHeaderView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142009C0, viewGroup, false);
        m162574a(feedGroupAggregationHeaderView, viewInflate);
        return viewInflate;
    }
}
