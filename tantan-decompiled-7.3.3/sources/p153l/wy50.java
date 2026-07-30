package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import com.p051p1.mobile.putong.feed.p065ui.moments.operation.OperationBannerFeedView;
import p151v.AspectRatioViewPager;
import p151v.VPagerCircleIndicator;

/* JADX INFO: loaded from: classes13.dex */
public class wy50 {
    /* JADX INFO: renamed from: a */
    public static void m208477a(OperationBannerFeedView operationBannerFeedView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        operationBannerFeedView.f44857a = (CardView) viewGroup.getChildAt(0);
        operationBannerFeedView.f44858b = (AspectRatioViewPager) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        operationBannerFeedView.f44859c = (VPagerCircleIndicator) viewGroup.getChildAt(1);
    }
}
