package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p1.mobile.putong.core.newui.newmeet.feed.nearby.MeetNearbyItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class l5y {
    /* JADX INFO: renamed from: a */
    public static void m7699a(MeetNearbyItemView meetNearbyItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        meetNearbyItemView.a = viewGroup.getChildAt(0);
        meetNearbyItemView.b = (RelativeLayout) viewGroup.getChildAt(1);
        meetNearbyItemView.c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        meetNearbyItemView.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        meetNearbyItemView.e = viewGroup.getChildAt(2);
        meetNearbyItemView.f = viewGroup.getChildAt(3);
    }
}
