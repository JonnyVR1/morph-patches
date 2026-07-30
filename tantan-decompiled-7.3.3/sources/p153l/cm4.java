package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p051p1.mobile.putong.core.newui.home.views.CardMomentLayoutView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class cm4 {
    /* JADX INFO: renamed from: a */
    public static void m111083a(CardMomentLayoutView cardMomentLayoutView, View view) {
        cardMomentLayoutView.f24403c = (CardMomentLayoutView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        cardMomentLayoutView.f24404d = (VFrame) viewGroup.getChildAt(0);
        cardMomentLayoutView.f24405e = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        cardMomentLayoutView.f24406f = (SimpleDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        cardMomentLayoutView.f24407g = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        cardMomentLayoutView.f24408h = (SimpleDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        cardMomentLayoutView.f24409i = (SimpleDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        cardMomentLayoutView.f24410j = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
