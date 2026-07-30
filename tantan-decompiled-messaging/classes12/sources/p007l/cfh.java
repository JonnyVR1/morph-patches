package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.view.FeedMomentForwardSheetItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class cfh {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m9130a(FeedMomentForwardSheetItemView feedMomentForwardSheetItemView, View view) {
        feedMomentForwardSheetItemView.f3884d = (FeedMomentForwardSheetItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedMomentForwardSheetItemView.f3885e = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedMomentForwardSheetItemView.f3886f = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedMomentForwardSheetItemView.f3887g = viewGroup.getChildAt(1);
    }
}
