package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.view.FeedNewUserBubbleView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class xjh {
    /* JADX INFO: renamed from: a */
    public static void m211215a(FeedNewUserBubbleView feedNewUserBubbleView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedNewUserBubbleView.f43279d = (VRelative) viewGroup.getChildAt(0);
        feedNewUserBubbleView.f43280e = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedNewUserBubbleView.f43281f = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedNewUserBubbleView.f43282g = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        feedNewUserBubbleView.f43283h = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        feedNewUserBubbleView.f43284i = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m211216b(FeedNewUserBubbleView feedNewUserBubbleView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173539M1, viewGroup, false);
        m211215a(feedNewUserBubbleView, viewInflate);
        return viewInflate;
    }
}
