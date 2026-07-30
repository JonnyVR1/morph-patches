package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.status.display.statuspage.newtab.FeedStateSquareBottomViewItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class c2i {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static void m9064a(FeedStateSquareBottomViewItem feedStateSquareBottomViewItem, View view) {
        feedStateSquareBottomViewItem.f4269d = (FeedStateSquareBottomViewItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedStateSquareBottomViewItem.f4270e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedStateSquareBottomViewItem.f4271f = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedStateSquareBottomViewItem.f4272g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        feedStateSquareBottomViewItem.f4273h = viewGroup.getChildAt(1);
    }
}
