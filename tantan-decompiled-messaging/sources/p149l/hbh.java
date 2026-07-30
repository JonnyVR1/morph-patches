package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.FeedListTextWithLinkItem;
import p147v.VLinear;
import p147v.VText;
import p147v.VText_Expandable;

/* JADX INFO: loaded from: classes12.dex */
public class hbh {
    /* JADX INFO: renamed from: a */
    public static void m130330a(FeedListTextWithLinkItem feedListTextWithLinkItem, View view) {
        feedListTextWithLinkItem.f40866a = (FeedListTextWithLinkItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedListTextWithLinkItem.f40867b = (VLinear) viewGroup.getChildAt(0);
        feedListTextWithLinkItem.f40868c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedListTextWithLinkItem.f40869d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedListTextWithLinkItem.f40870e = (LinearLayout) viewGroup.getChildAt(1);
        feedListTextWithLinkItem.f40871f = (VText_Expandable) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedListTextWithLinkItem.f40872g = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
