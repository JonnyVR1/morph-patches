package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.view.LoopViewPager;
import com.p046p1.mobile.putong.live.base.view.LoopViewPagerIndicator;
import com.p046p1.mobile.putong.live.external.intl.view.widgets.IntlLiveSquareBannerView;

/* JADX INFO: loaded from: classes13.dex */
public class yzn {
    /* JADX INFO: renamed from: a */
    public static void m216685a(IntlLiveSquareBannerView intlLiveSquareBannerView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlLiveSquareBannerView.f45822a = (LoopViewPager) viewGroup.getChildAt(0);
        intlLiveSquareBannerView.f45823b = (LoopViewPagerIndicator) viewGroup.getChildAt(1);
    }
}
