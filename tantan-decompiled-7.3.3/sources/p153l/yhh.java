package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.view.FeedMomentVisibleRangeItemView;
import p151v.VCheckBox;

/* JADX INFO: loaded from: classes13.dex */
public class yhh {
    /* JADX INFO: renamed from: a */
    public static void m215961a(FeedMomentVisibleRangeItemView feedMomentVisibleRangeItemView, View view) {
        feedMomentVisibleRangeItemView.f43275d = (FeedMomentVisibleRangeItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedMomentVisibleRangeItemView.f43276e = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedMomentVisibleRangeItemView.f43277f = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedMomentVisibleRangeItemView.f43278g = (VCheckBox) viewGroup.getChildAt(1);
    }
}
