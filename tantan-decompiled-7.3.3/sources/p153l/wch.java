package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.FeedListTextWithLinkItem;
import p151v.VLinear;
import p151v.VText;
import p151v.VText_Expandable;

/* JADX INFO: loaded from: classes13.dex */
public class wch {
    /* JADX INFO: renamed from: a */
    public static void m205799a(FeedListTextWithLinkItem feedListTextWithLinkItem, View view) {
        feedListTextWithLinkItem.f41714a = (FeedListTextWithLinkItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedListTextWithLinkItem.f41715b = (VLinear) viewGroup.getChildAt(0);
        feedListTextWithLinkItem.f41716c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedListTextWithLinkItem.f41717d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedListTextWithLinkItem.f41718e = (LinearLayout) viewGroup.getChildAt(1);
        feedListTextWithLinkItem.f41719f = (VText_Expandable) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedListTextWithLinkItem.f41720g = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
