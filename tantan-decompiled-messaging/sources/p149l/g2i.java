package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.feed.newui.status.display.statuspage.newtab.FeedSquareBottomStickoutView;
import com.p046p1.mobile.putong.feed.newui.status.display.statuspage.newtab.FeedStateSquareItem;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class g2i {
    /* JADX INFO: renamed from: a */
    public static void m124159a(FeedStateSquareItem feedStateSquareItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedStateSquareItem.f42813d = (FeedSquareBottomStickoutView) viewGroup.getChildAt(0);
        feedStateSquareItem.f42814e = (ConstraintLayout) viewGroup.getChildAt(1);
        feedStateSquareItem.f42815f = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedStateSquareItem.f42816g = (Space) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        feedStateSquareItem.f42817h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        feedStateSquareItem.f42818i = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        feedStateSquareItem.f42819j = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        feedStateSquareItem.f42820k = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        feedStateSquareItem.f42821l = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
        feedStateSquareItem.f42822m = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7);
        feedStateSquareItem.f42823n = (Space) viewGroup.getChildAt(2);
    }
}
