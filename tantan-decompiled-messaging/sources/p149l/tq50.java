package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import com.p046p1.mobile.putong.core.p053ui.operation.OperationBannerView;
import p147v.AspectRatioViewPager;
import p147v.VPagerCircleIndicator;

/* JADX INFO: loaded from: classes10.dex */
public class tq50 {
    /* JADX INFO: renamed from: a */
    public static void m190085a(OperationBannerView operationBannerView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        operationBannerView.f32807a = (CardView) viewGroup.getChildAt(0);
        operationBannerView.f32808b = (AspectRatioViewPager) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        operationBannerView.f32809c = (VPagerCircleIndicator) viewGroup.getChildAt(1);
    }
}
