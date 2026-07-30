package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.view.FeedMomentVisibleRangeItemView;
import p147v.VCheckBox;

/* JADX INFO: loaded from: classes12.dex */
public class jgh {
    /* JADX INFO: renamed from: a */
    public static void m141291a(FeedMomentVisibleRangeItemView feedMomentVisibleRangeItemView, View view) {
        feedMomentVisibleRangeItemView.f42427d = (FeedMomentVisibleRangeItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedMomentVisibleRangeItemView.f42428e = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedMomentVisibleRangeItemView.f42429f = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedMomentVisibleRangeItemView.f42430g = (VCheckBox) viewGroup.getChildAt(1);
    }
}
