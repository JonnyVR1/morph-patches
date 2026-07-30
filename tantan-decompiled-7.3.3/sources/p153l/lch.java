package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.FeedListActivityTextWithLinkItem;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class lch {
    /* JADX INFO: renamed from: a */
    public static void m153683a(FeedListActivityTextWithLinkItem feedListActivityTextWithLinkItem, View view) {
        feedListActivityTextWithLinkItem.f41671a = (FeedListActivityTextWithLinkItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedListActivityTextWithLinkItem.f41672b = (VLinear) viewGroup.getChildAt(0);
        feedListActivityTextWithLinkItem.f41673c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedListActivityTextWithLinkItem.f41674d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedListActivityTextWithLinkItem.f41675e = (LinearLayout) viewGroup.getChildAt(1);
        feedListActivityTextWithLinkItem.f41676f = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedListActivityTextWithLinkItem.f41677g = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        feedListActivityTextWithLinkItem.f41678h = (VRelative) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
