package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import com.p051p1.mobile.putong.core.p058ui.operation.OperationBannerView;
import p151v.AspectRatioViewPager;
import p151v.VPagerCircleIndicator;

/* JADX INFO: loaded from: classes10.dex */
public class zy50 {
    /* JADX INFO: renamed from: a */
    public static void m222106a(OperationBannerView operationBannerView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        operationBannerView.f33655a = (CardView) viewGroup.getChildAt(0);
        operationBannerView.f33656b = (AspectRatioViewPager) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        operationBannerView.f33657c = (VPagerCircleIndicator) viewGroup.getChildAt(1);
    }
}
