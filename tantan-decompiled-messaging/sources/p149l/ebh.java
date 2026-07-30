package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.FeedListTextWithCommentItem;
import p147v.VLinear;
import p147v.VText;
import p147v.VText_Expandable;

/* JADX INFO: loaded from: classes12.dex */
public class ebh {
    /* JADX INFO: renamed from: a */
    public static void m115471a(FeedListTextWithCommentItem feedListTextWithCommentItem, View view) {
        feedListTextWithCommentItem.f40855a = (FeedListTextWithCommentItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedListTextWithCommentItem.f40856b = (VLinear) viewGroup.getChildAt(0);
        feedListTextWithCommentItem.f40857c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedListTextWithCommentItem.f40858d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedListTextWithCommentItem.f40859e = (LinearLayout) viewGroup.getChildAt(1);
        feedListTextWithCommentItem.f40860f = (VText_Expandable) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedListTextWithCommentItem.f40861g = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
