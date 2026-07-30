package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p1.mobile.putong.core.newui.newmeet.feed.nearby.MeetNearbyUserItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class n5y {
    /* JADX INFO: renamed from: a */
    public static void m8318a(MeetNearbyUserItemView meetNearbyUserItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        meetNearbyUserItemView.a = viewGroup.getChildAt(0);
        meetNearbyUserItemView.b = (TextView) viewGroup.getChildAt(3);
        meetNearbyUserItemView.c = viewGroup.getChildAt(4);
        meetNearbyUserItemView.d = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        meetNearbyUserItemView.e = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        meetNearbyUserItemView.f = (TextView) viewGroup.getChildAt(5);
        meetNearbyUserItemView.g = (ImageView) viewGroup.getChildAt(6);
        meetNearbyUserItemView.h = viewGroup.getChildAt(7);
        meetNearbyUserItemView.i = viewGroup.getChildAt(8);
    }
}
