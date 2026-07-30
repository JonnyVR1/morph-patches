package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.active.SpotlightActiveCard;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class hqf0 {
    /* JADX INFO: renamed from: a */
    public static void m7061a(SpotlightActiveCard spotlightActiveCard, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        spotlightActiveCard.d = viewGroup.getChildAt(0);
        spotlightActiveCard.e = (TextView) viewGroup.getChildAt(1);
        spotlightActiveCard.f = viewGroup.getChildAt(2);
        spotlightActiveCard.g = (TextView) viewGroup.getChildAt(3);
        spotlightActiveCard.h = viewGroup.getChildAt(4);
        spotlightActiveCard.i = viewGroup.getChildAt(5);
        spotlightActiveCard.j = (TextView) viewGroup.getChildAt(6);
    }
}
