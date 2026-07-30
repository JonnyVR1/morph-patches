package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.FeedListTextWithCommentItem;
import p151v.VLinear;
import p151v.VText;
import p151v.VText_Expandable;

/* JADX INFO: loaded from: classes13.dex */
public class tch {
    /* JADX INFO: renamed from: a */
    public static void m190448a(FeedListTextWithCommentItem feedListTextWithCommentItem, View view) {
        feedListTextWithCommentItem.f41703a = (FeedListTextWithCommentItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedListTextWithCommentItem.f41704b = (VLinear) viewGroup.getChildAt(0);
        feedListTextWithCommentItem.f41705c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedListTextWithCommentItem.f41706d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedListTextWithCommentItem.f41707e = (LinearLayout) viewGroup.getChildAt(1);
        feedListTextWithCommentItem.f41708f = (VText_Expandable) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedListTextWithCommentItem.f41709g = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
