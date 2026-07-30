package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.FeedListTextWithLinkItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class hbh {
    /* JADX INFO: renamed from: a */
    public static void m10590a(FeedListTextWithLinkItem feedListTextWithLinkItem, View view) {
        feedListTextWithLinkItem.f2327a = (FeedListTextWithLinkItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedListTextWithLinkItem.f2328b = viewGroup.getChildAt(0);
        feedListTextWithLinkItem.f2329c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedListTextWithLinkItem.f2330d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedListTextWithLinkItem.f2331e = (LinearLayout) viewGroup.getChildAt(1);
        feedListTextWithLinkItem.f2332f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedListTextWithLinkItem.f2333g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
