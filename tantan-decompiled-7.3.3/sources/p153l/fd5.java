package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p051p1.mobile.putong.core.p058ui.GradientBgButton;
import com.p051p1.mobile.putong.core.p058ui.purchase.CoinGuideView;
import p151v.VCheckBox;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class fd5 {
    /* JADX INFO: renamed from: a */
    public static void m125082a(CoinGuideView coinGuideView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        coinGuideView.f35188a = (GradientBgButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        coinGuideView.f35189b = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        coinGuideView.f35190c = (VText) viewGroup.getChildAt(1);
        coinGuideView.f35191d = (VText) viewGroup.getChildAt(2);
        coinGuideView.f35192e = (VText) viewGroup.getChildAt(3);
        coinGuideView.f35193f = (VCheckBox) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        coinGuideView.f35194g = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
    }
}
