package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.view.FeedNewUserBubbleView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class iih {
    /* JADX INFO: renamed from: a */
    public static void m136392a(FeedNewUserBubbleView feedNewUserBubbleView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedNewUserBubbleView.f42431d = (VRelative) viewGroup.getChildAt(0);
        feedNewUserBubbleView.f42432e = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedNewUserBubbleView.f42433f = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedNewUserBubbleView.f42434g = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        feedNewUserBubbleView.f42435h = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        feedNewUserBubbleView.f42436i = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m136393b(FeedNewUserBubbleView feedNewUserBubbleView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142070M1, viewGroup, false);
        m136392a(feedNewUserBubbleView, viewInflate);
        return viewInflate;
    }
}
