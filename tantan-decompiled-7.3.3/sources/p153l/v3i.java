package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.feed.newui.status.display.statuspage.newtab.FeedSquareBottomStickoutView;
import com.p051p1.mobile.putong.feed.newui.status.display.statuspage.newtab.FeedStateSquareItem;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class v3i {
    /* JADX INFO: renamed from: a */
    public static void m199279a(FeedStateSquareItem feedStateSquareItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedStateSquareItem.f43661d = (FeedSquareBottomStickoutView) viewGroup.getChildAt(0);
        feedStateSquareItem.f43662e = (ConstraintLayout) viewGroup.getChildAt(1);
        feedStateSquareItem.f43663f = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedStateSquareItem.f43664g = (Space) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        feedStateSquareItem.f43665h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        feedStateSquareItem.f43666i = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        feedStateSquareItem.f43667j = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        feedStateSquareItem.f43668k = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        feedStateSquareItem.f43669l = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
        feedStateSquareItem.f43670m = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7);
        feedStateSquareItem.f43671n = (Space) viewGroup.getChildAt(2);
    }
}
