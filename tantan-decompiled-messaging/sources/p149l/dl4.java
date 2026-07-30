package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p046p1.mobile.putong.core.newui.home.views.CardMomentLayoutView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class dl4 {
    /* JADX INFO: renamed from: a */
    public static void m112326a(CardMomentLayoutView cardMomentLayoutView, View view) {
        cardMomentLayoutView.f23661c = (CardMomentLayoutView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        cardMomentLayoutView.f23662d = (VFrame) viewGroup.getChildAt(0);
        cardMomentLayoutView.f23663e = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        cardMomentLayoutView.f23664f = (SimpleDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        cardMomentLayoutView.f23665g = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        cardMomentLayoutView.f23666h = (SimpleDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        cardMomentLayoutView.f23667i = (SimpleDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        cardMomentLayoutView.f23668j = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
