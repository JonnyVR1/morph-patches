package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.FeedListActivityTextWithLinkItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class wah {
    /* JADX INFO: renamed from: a */
    public static void m15766a(FeedListActivityTextWithLinkItem feedListActivityTextWithLinkItem, View view) {
        feedListActivityTextWithLinkItem.f2284a = (FeedListActivityTextWithLinkItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedListActivityTextWithLinkItem.f2285b = viewGroup.getChildAt(0);
        feedListActivityTextWithLinkItem.f2286c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedListActivityTextWithLinkItem.f2287d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedListActivityTextWithLinkItem.f2288e = (LinearLayout) viewGroup.getChildAt(1);
        feedListActivityTextWithLinkItem.f2289f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedListActivityTextWithLinkItem.f2290g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        feedListActivityTextWithLinkItem.f2291h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
