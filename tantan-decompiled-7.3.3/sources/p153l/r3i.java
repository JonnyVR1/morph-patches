package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.status.display.statuspage.newtab.FeedStateSquareBottomViewItem;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class r3i {
    /* JADX INFO: renamed from: a */
    public static void m179618a(FeedStateSquareBottomViewItem feedStateSquareBottomViewItem, View view) {
        feedStateSquareBottomViewItem.f43656d = (FeedStateSquareBottomViewItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedStateSquareBottomViewItem.f43657e = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedStateSquareBottomViewItem.f43658f = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedStateSquareBottomViewItem.f43659g = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        feedStateSquareBottomViewItem.f43660h = viewGroup.getChildAt(1);
    }
}
