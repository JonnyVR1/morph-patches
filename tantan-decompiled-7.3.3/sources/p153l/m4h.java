package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.feed.newui.status.display.statuspage.newtab.FeedFakeSquareItem;
import com.p051p1.mobile.putong.feed.newui.status.display.statuspage.newtab.FeedSquareBottomStickoutView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class m4h {
    /* JADX INFO: renamed from: a */
    public static void m157035a(FeedFakeSquareItem feedFakeSquareItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedFakeSquareItem.f43631d = (FeedSquareBottomStickoutView) viewGroup.getChildAt(0);
        feedFakeSquareItem.f43632e = (ConstraintLayout) viewGroup.getChildAt(1);
        feedFakeSquareItem.f43633f = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedFakeSquareItem.f43634g = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        feedFakeSquareItem.f43635h = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        feedFakeSquareItem.f43636i = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        feedFakeSquareItem.f43637j = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        feedFakeSquareItem.f43638k = (Space) viewGroup.getChildAt(2);
    }
}
