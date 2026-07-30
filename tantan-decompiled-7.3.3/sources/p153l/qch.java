package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.FeedListImageLinkItem;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class qch {
    /* JADX INFO: renamed from: a */
    public static void m176123a(FeedListImageLinkItem feedListImageLinkItem, View view) {
        feedListImageLinkItem.f41686a = (FeedListImageLinkItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedListImageLinkItem.f41687b = (VLinear) viewGroup.getChildAt(0);
        feedListImageLinkItem.f41688c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedListImageLinkItem.f41689d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedListImageLinkItem.f41690e = (LinearLayout) viewGroup.getChildAt(1);
        feedListImageLinkItem.f41691f = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedListImageLinkItem.f41692g = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        feedListImageLinkItem.f41693h = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
