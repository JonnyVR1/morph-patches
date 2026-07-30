package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.feed.newui.status.display.statuspage.newtab.FeedFakeSquareItem;
import com.p046p1.mobile.putong.feed.newui.status.display.statuspage.newtab.FeedSquareBottomStickoutView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class x2h {
    /* JADX INFO: renamed from: a */
    public static void m206853a(FeedFakeSquareItem feedFakeSquareItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedFakeSquareItem.f42783d = (FeedSquareBottomStickoutView) viewGroup.getChildAt(0);
        feedFakeSquareItem.f42784e = (ConstraintLayout) viewGroup.getChildAt(1);
        feedFakeSquareItem.f42785f = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedFakeSquareItem.f42786g = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        feedFakeSquareItem.f42787h = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        feedFakeSquareItem.f42788i = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        feedFakeSquareItem.f42789j = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        feedFakeSquareItem.f42790k = (Space) viewGroup.getChildAt(2);
    }
}
