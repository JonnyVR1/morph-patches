package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.newui.poi.view.FeedPoiCardItemAboutMeView;
import com.p051p1.mobile.putong.core.newui.poi.view.FeedPoiCardItemMomentInfoView;
import com.p051p1.mobile.putong.core.newui.poi.view.FeedPoiCardItemMyTagsView;
import com.p051p1.mobile.putong.core.newui.poi.view.FeedPoiCardItemUserHeadView;
import com.p051p1.mobile.putong.core.newui.poi.view.FeedPoiCardItemView;
import com.p051p1.mobile.putong.core.newui.poi.view.FeedPoiCardOperationButton;
import com.p051p1.mobile.putong.core.newui.poi.view.FeedPoiCardScrollView;
import com.p051p1.mobile.putong.core.newui.poi.view.FeedPoiCardSendGreetView;
import com.p051p1.mobile.putong.core.newui.poi.view.FeedPoiCardSmartScrollBar;
import p151v.VFrame_Shadow;

/* JADX INFO: loaded from: classes10.dex */
public class vph {
    /* JADX INFO: renamed from: a */
    public static void m202236a(FeedPoiCardItemView feedPoiCardItemView, View view) {
        feedPoiCardItemView.f27153h = (FeedPoiCardItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedPoiCardItemView.f27154i = (FrameLayout) viewGroup.getChildAt(0);
        feedPoiCardItemView.f27155j = (FeedPoiCardScrollView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedPoiCardItemView.f27156k = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        feedPoiCardItemView.f27157l = (FeedPoiCardItemUserHeadView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        feedPoiCardItemView.f27158m = (FeedPoiCardItemMomentInfoView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        feedPoiCardItemView.f27159n = (FeedPoiCardItemAboutMeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(4);
        feedPoiCardItemView.f27160o = (FeedPoiCardItemMyTagsView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(5);
        feedPoiCardItemView.f27161p = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        feedPoiCardItemView.f27162q = (VFrame_Shadow) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        feedPoiCardItemView.f27163r = (FeedPoiCardOperationButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        feedPoiCardItemView.f27164s = (VFrame_Shadow) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        feedPoiCardItemView.f27165t = (FeedPoiCardOperationButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        feedPoiCardItemView.f27166u = (VFrame_Shadow) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(2);
        feedPoiCardItemView.f27167v = (FeedPoiCardOperationButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        feedPoiCardItemView.f27168w = (VFrame_Shadow) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(3);
        feedPoiCardItemView.f27169x = (FeedPoiCardOperationButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(3)).getChildAt(0);
        feedPoiCardItemView.f27170y = (FeedPoiCardSendGreetView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        feedPoiCardItemView.f27171z = (FeedPoiCardSmartScrollBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
    }
}
