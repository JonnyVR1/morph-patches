package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.home.views.CardMomentLayoutView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class dl4 {
    /* JADX INFO: renamed from: a */
    public static void m6172a(CardMomentLayoutView cardMomentLayoutView, View view) {
        cardMomentLayoutView.c = (CardMomentLayoutView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        cardMomentLayoutView.d = viewGroup.getChildAt(0);
        cardMomentLayoutView.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        cardMomentLayoutView.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        cardMomentLayoutView.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        cardMomentLayoutView.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        cardMomentLayoutView.i = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        cardMomentLayoutView.j = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
