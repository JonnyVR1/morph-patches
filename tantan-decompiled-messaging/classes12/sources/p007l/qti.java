package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.FollowActionPopupView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class qti {
    /* JADX INFO: renamed from: a */
    public static void m13729a(FollowActionPopupView followActionPopupView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        followActionPopupView.f2354a = (ImageView) viewGroup.getChildAt(1);
        followActionPopupView.f2355b = viewGroup.getChildAt(2);
        followActionPopupView.f2356c = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        followActionPopupView.f2357d = (TextView) viewGroup.getChildAt(3);
        followActionPopupView.f2358e = (TextView) viewGroup.getChildAt(4);
        followActionPopupView.f2359f = viewGroup.getChildAt(5);
    }
}
