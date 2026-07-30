package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.core.ui.likeminded.LikeMindedCardTabView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ddr {
    /* JADX INFO: renamed from: a */
    public static void m6110a(LikeMindedCardTabView likeMindedCardTabView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        likeMindedCardTabView.a = viewGroup.getChildAt(0);
        likeMindedCardTabView.b = (TextView) viewGroup.getChildAt(1);
    }
}
