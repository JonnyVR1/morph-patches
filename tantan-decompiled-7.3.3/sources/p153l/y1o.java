package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.view.LoopViewPager;
import com.p051p1.mobile.putong.live.base.view.LoopViewPagerIndicator;
import com.p051p1.mobile.putong.live.external.intl.view.widgets.IntlLiveSquareBannerView;

/* JADX INFO: loaded from: classes9.dex */
public class y1o {
    /* JADX INFO: renamed from: a */
    public static void m213957a(IntlLiveSquareBannerView intlLiveSquareBannerView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlLiveSquareBannerView.f46670a = (LoopViewPager) viewGroup.getChildAt(0);
        intlLiveSquareBannerView.f46671b = (LoopViewPagerIndicator) viewGroup.getChildAt(1);
    }
}
