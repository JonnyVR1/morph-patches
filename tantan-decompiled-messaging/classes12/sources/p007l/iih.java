package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.view.FeedNewUserBubbleView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class iih {
    /* JADX INFO: renamed from: a */
    public static void m10888a(FeedNewUserBubbleView feedNewUserBubbleView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedNewUserBubbleView.f3892d = viewGroup.getChildAt(0);
        feedNewUserBubbleView.f3893e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedNewUserBubbleView.f3894f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedNewUserBubbleView.f3895g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        feedNewUserBubbleView.f3896h = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        feedNewUserBubbleView.f3897i = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m10889b(FeedNewUserBubbleView feedNewUserBubbleView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11089M1, viewGroup, false);
        m10888a(feedNewUserBubbleView, viewInflate);
        return viewInflate;
    }
}
