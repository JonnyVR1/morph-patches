package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.FeedListActivityTextWithLinkItem;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class wah {
    /* JADX INFO: renamed from: a */
    public static void m202395a(FeedListActivityTextWithLinkItem feedListActivityTextWithLinkItem, View view) {
        feedListActivityTextWithLinkItem.f40823a = (FeedListActivityTextWithLinkItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedListActivityTextWithLinkItem.f40824b = (VLinear) viewGroup.getChildAt(0);
        feedListActivityTextWithLinkItem.f40825c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedListActivityTextWithLinkItem.f40826d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedListActivityTextWithLinkItem.f40827e = (LinearLayout) viewGroup.getChildAt(1);
        feedListActivityTextWithLinkItem.f40828f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedListActivityTextWithLinkItem.f40829g = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        feedListActivityTextWithLinkItem.f40830h = (VRelative) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
