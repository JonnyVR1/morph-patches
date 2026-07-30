package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.view.FeedMomentVisibleRangeItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class jgh {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m11177a(FeedMomentVisibleRangeItemView feedMomentVisibleRangeItemView, View view) {
        feedMomentVisibleRangeItemView.f3888d = (FeedMomentVisibleRangeItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedMomentVisibleRangeItemView.f3889e = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedMomentVisibleRangeItemView.f3890f = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedMomentVisibleRangeItemView.f3891g = viewGroup.getChildAt(1);
    }
}
