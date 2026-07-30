package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.live.livingroom.archi.frag.RoomIndicatorView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class q8d0 {
    /* JADX INFO: renamed from: a */
    public static void m21069a(RoomIndicatorView roomIndicatorView, View view) {
        roomIndicatorView.f3785a = (RoomIndicatorView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        roomIndicatorView.f3786b = (LinearLayout) viewGroup.getChildAt(1);
        roomIndicatorView.f3787c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        roomIndicatorView.f3788d = (LinearLayout) viewGroup.getChildAt(2);
        roomIndicatorView.f3789e = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
    }
}
