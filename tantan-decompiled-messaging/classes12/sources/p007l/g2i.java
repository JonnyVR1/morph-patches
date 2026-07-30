package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import com.p000p1.mobile.putong.feed.newui.status.display.statuspage.newtab.FeedSquareBottomStickoutView;
import com.p000p1.mobile.putong.feed.newui.status.display.statuspage.newtab.FeedStateSquareItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class g2i {
    /* JADX INFO: renamed from: a */
    public static void m10363a(FeedStateSquareItem feedStateSquareItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedStateSquareItem.f4274d = (FeedSquareBottomStickoutView) viewGroup.getChildAt(0);
        feedStateSquareItem.f4275e = viewGroup.getChildAt(1);
        feedStateSquareItem.f4276f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedStateSquareItem.f4277g = (Space) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        feedStateSquareItem.f4278h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        feedStateSquareItem.f4279i = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        feedStateSquareItem.f4280j = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        feedStateSquareItem.f4281k = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        feedStateSquareItem.f4282l = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
        feedStateSquareItem.f4283m = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7);
        feedStateSquareItem.f4284n = (Space) viewGroup.getChildAt(2);
    }
}
