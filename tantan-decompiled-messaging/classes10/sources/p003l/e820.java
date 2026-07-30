package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.p1.mobile.putong.core.newui.nearby.NearbyItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class e820 {
    /* JADX INFO: renamed from: a */
    public static void m6251a(NearbyItemView nearbyItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        nearbyItemView.a = viewGroup.getChildAt(0);
        nearbyItemView.b = (TextView) viewGroup.getChildAt(3);
        nearbyItemView.c = viewGroup.getChildAt(4);
        nearbyItemView.d = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        nearbyItemView.e = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        nearbyItemView.f = (TextView) viewGroup.getChildAt(5);
        nearbyItemView.g = (ImageView) viewGroup.getChildAt(6);
        nearbyItemView.h = viewGroup.getChildAt(7);
        nearbyItemView.i = viewGroup.getChildAt(8);
    }
}
