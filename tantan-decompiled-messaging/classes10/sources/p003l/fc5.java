package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p1.mobile.putong.core.ui.purchase.CoinGuideView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class fc5 {
    /* JADX INFO: renamed from: a */
    public static void m6468a(CoinGuideView coinGuideView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        coinGuideView.a = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        coinGuideView.b = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        coinGuideView.c = viewGroup.getChildAt(1);
        coinGuideView.d = viewGroup.getChildAt(2);
        coinGuideView.e = viewGroup.getChildAt(3);
        coinGuideView.f = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        coinGuideView.g = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
    }
}
