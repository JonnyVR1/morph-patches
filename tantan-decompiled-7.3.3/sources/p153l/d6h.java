package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.group.aggregation.header.FeedGroupAggregationHeaderView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;

/* JADX INFO: loaded from: classes13.dex */
public class d6h {
    /* JADX INFO: renamed from: a */
    public static void m114440a(FeedGroupAggregationHeaderView feedGroupAggregationHeaderView, View view) {
        feedGroupAggregationHeaderView.f40817a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedGroupAggregationHeaderView.f40818b = (VDraweeView) viewGroup.getChildAt(0);
        feedGroupAggregationHeaderView.f40819c = (TextView) viewGroup.getChildAt(1);
        feedGroupAggregationHeaderView.f40820d = (TextView) viewGroup.getChildAt(2);
        feedGroupAggregationHeaderView.f40821e = (VImage) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m114441b(FeedGroupAggregationHeaderView feedGroupAggregationHeaderView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173478C0, viewGroup, false);
        m114440a(feedGroupAggregationHeaderView, viewInflate);
        return viewInflate;
    }
}
