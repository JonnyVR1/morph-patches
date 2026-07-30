package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import com.p046p1.mobile.putong.feed.p060ui.moments.operation.OperationBannerFeedView;
import p147v.AspectRatioViewPager;
import p147v.VPagerCircleIndicator;

/* JADX INFO: loaded from: classes12.dex */
public class qq50 {
    /* JADX INFO: renamed from: a */
    public static void m175878a(OperationBannerFeedView operationBannerFeedView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        operationBannerFeedView.f44009a = (CardView) viewGroup.getChildAt(0);
        operationBannerFeedView.f44010b = (AspectRatioViewPager) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        operationBannerFeedView.f44011c = (VPagerCircleIndicator) viewGroup.getChildAt(1);
    }
}
