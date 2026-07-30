package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.status.display.statuspage.newtab.FeedStateSquareBottomViewItem;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class c2i {
    /* JADX INFO: renamed from: a */
    public static void m104916a(FeedStateSquareBottomViewItem feedStateSquareBottomViewItem, View view) {
        feedStateSquareBottomViewItem.f42808d = (FeedStateSquareBottomViewItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedStateSquareBottomViewItem.f42809e = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedStateSquareBottomViewItem.f42810f = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedStateSquareBottomViewItem.f42811g = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        feedStateSquareBottomViewItem.f42812h = viewGroup.getChildAt(1);
    }
}
