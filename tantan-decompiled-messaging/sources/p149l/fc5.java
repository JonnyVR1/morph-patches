package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p046p1.mobile.putong.core.p053ui.GradientBgButton;
import com.p046p1.mobile.putong.core.p053ui.purchase.CoinGuideView;
import p147v.VCheckBox;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class fc5 {
    /* JADX INFO: renamed from: a */
    public static void m120420a(CoinGuideView coinGuideView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        coinGuideView.f34340a = (GradientBgButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        coinGuideView.f34341b = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        coinGuideView.f34342c = (VText) viewGroup.getChildAt(1);
        coinGuideView.f34343d = (VText) viewGroup.getChildAt(2);
        coinGuideView.f34344e = (VText) viewGroup.getChildAt(3);
        coinGuideView.f34345f = (VCheckBox) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        coinGuideView.f34346g = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
    }
}
