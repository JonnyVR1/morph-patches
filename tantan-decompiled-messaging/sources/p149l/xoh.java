package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.poi.view.FeedPoiGuideView;
import p147v.VImage;
import p147v.VLinear;

/* JADX INFO: loaded from: classes12.dex */
public class xoh {
    /* JADX INFO: renamed from: a */
    public static void m210418a(FeedPoiGuideView feedPoiGuideView, View view) {
        feedPoiGuideView.f42289a = (FeedPoiGuideView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedPoiGuideView.f42290b = (RelativeLayout) viewGroup.getChildAt(0);
        feedPoiGuideView.f42291c = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedPoiGuideView.f42292d = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedPoiGuideView.f42293e = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        feedPoiGuideView.f42294f = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        feedPoiGuideView.f42295g = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
