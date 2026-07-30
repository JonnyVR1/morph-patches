package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.FeedListImageLinkItem;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class bbh {
    /* JADX INFO: renamed from: a */
    public static void m100957a(FeedListImageLinkItem feedListImageLinkItem, View view) {
        feedListImageLinkItem.f40838a = (FeedListImageLinkItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedListImageLinkItem.f40839b = (VLinear) viewGroup.getChildAt(0);
        feedListImageLinkItem.f40840c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedListImageLinkItem.f40841d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedListImageLinkItem.f40842e = (LinearLayout) viewGroup.getChildAt(1);
        feedListImageLinkItem.f40843f = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedListImageLinkItem.f40844g = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        feedListImageLinkItem.f40845h = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
