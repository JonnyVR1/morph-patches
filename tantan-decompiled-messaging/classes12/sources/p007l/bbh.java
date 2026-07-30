package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.FeedListImageLinkItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class bbh {
    /* JADX INFO: renamed from: a */
    public static void m8780a(FeedListImageLinkItem feedListImageLinkItem, View view) {
        feedListImageLinkItem.f2299a = (FeedListImageLinkItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedListImageLinkItem.f2300b = viewGroup.getChildAt(0);
        feedListImageLinkItem.f2301c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedListImageLinkItem.f2302d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedListImageLinkItem.f2303e = (LinearLayout) viewGroup.getChildAt(1);
        feedListImageLinkItem.f2304f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedListImageLinkItem.f2305g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        feedListImageLinkItem.f2306h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
