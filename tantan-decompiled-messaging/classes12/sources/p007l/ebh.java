package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.FeedListTextWithCommentItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ebh {
    /* JADX INFO: renamed from: a */
    public static void m9691a(FeedListTextWithCommentItem feedListTextWithCommentItem, View view) {
        feedListTextWithCommentItem.f2316a = (FeedListTextWithCommentItem) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedListTextWithCommentItem.f2317b = viewGroup.getChildAt(0);
        feedListTextWithCommentItem.f2318c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedListTextWithCommentItem.f2319d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedListTextWithCommentItem.f2320e = (LinearLayout) viewGroup.getChildAt(1);
        feedListTextWithCommentItem.f2321f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedListTextWithCommentItem.f2322g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
