package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.newui.poi.view.FeedPoiCardItemAboutMeView;
import com.p046p1.mobile.putong.core.newui.poi.view.FeedPoiCardItemMomentInfoView;
import com.p046p1.mobile.putong.core.newui.poi.view.FeedPoiCardItemMyTagsView;
import com.p046p1.mobile.putong.core.newui.poi.view.FeedPoiCardItemUserHeadView;
import com.p046p1.mobile.putong.core.newui.poi.view.FeedPoiCardItemView;
import com.p046p1.mobile.putong.core.newui.poi.view.FeedPoiCardOperationButton;
import com.p046p1.mobile.putong.core.newui.poi.view.FeedPoiCardScrollView;
import com.p046p1.mobile.putong.core.newui.poi.view.FeedPoiCardSendGreetView;
import com.p046p1.mobile.putong.core.newui.poi.view.FeedPoiCardSmartScrollBar;
import p147v.VFrame_Shadow;

/* JADX INFO: loaded from: classes10.dex */
public class goh {
    /* JADX INFO: renamed from: a */
    public static void m127245a(FeedPoiCardItemView feedPoiCardItemView, View view) {
        feedPoiCardItemView.f26411h = (FeedPoiCardItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedPoiCardItemView.f26412i = (FrameLayout) viewGroup.getChildAt(0);
        feedPoiCardItemView.f26413j = (FeedPoiCardScrollView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedPoiCardItemView.f26414k = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        feedPoiCardItemView.f26415l = (FeedPoiCardItemUserHeadView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        feedPoiCardItemView.f26416m = (FeedPoiCardItemMomentInfoView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        feedPoiCardItemView.f26417n = (FeedPoiCardItemAboutMeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(4);
        feedPoiCardItemView.f26418o = (FeedPoiCardItemMyTagsView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(5);
        feedPoiCardItemView.f26419p = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        feedPoiCardItemView.f26420q = (VFrame_Shadow) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0);
        feedPoiCardItemView.f26421r = (FeedPoiCardOperationButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        feedPoiCardItemView.f26422s = (VFrame_Shadow) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1);
        feedPoiCardItemView.f26423t = (FeedPoiCardOperationButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        feedPoiCardItemView.f26424u = (VFrame_Shadow) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(2);
        feedPoiCardItemView.f26425v = (FeedPoiCardOperationButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        feedPoiCardItemView.f26426w = (VFrame_Shadow) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(3);
        feedPoiCardItemView.f26427x = (FeedPoiCardOperationButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(3)).getChildAt(0);
        feedPoiCardItemView.f26428y = (FeedPoiCardSendGreetView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        feedPoiCardItemView.f26429z = (FeedPoiCardSmartScrollBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
    }
}
