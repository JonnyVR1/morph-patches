package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import com.p000p1.mobile.putong.feed.newui.status.display.statuspage.newtab.FeedFakeSquareItem;
import com.p000p1.mobile.putong.feed.newui.status.display.statuspage.newtab.FeedSquareBottomStickoutView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class x2h {
    /* JADX INFO: renamed from: a */
    public static void m15999a(FeedFakeSquareItem feedFakeSquareItem, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedFakeSquareItem.f4244d = (FeedSquareBottomStickoutView) viewGroup.getChildAt(0);
        feedFakeSquareItem.f4245e = viewGroup.getChildAt(1);
        feedFakeSquareItem.f4246f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedFakeSquareItem.f4247g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        feedFakeSquareItem.f4248h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        feedFakeSquareItem.f4249i = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        feedFakeSquareItem.f4250j = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        feedFakeSquareItem.f4251k = (Space) viewGroup.getChildAt(2);
    }
}
