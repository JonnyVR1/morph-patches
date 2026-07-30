package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.poi.view.FeedPoiGuideView;
import p151v.VImage;
import p151v.VLinear;

/* JADX INFO: loaded from: classes13.dex */
public class mqh {
    /* JADX INFO: renamed from: a */
    public static void m159507a(FeedPoiGuideView feedPoiGuideView, View view) {
        feedPoiGuideView.f43137a = (FeedPoiGuideView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedPoiGuideView.f43138b = (RelativeLayout) viewGroup.getChildAt(0);
        feedPoiGuideView.f43139c = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedPoiGuideView.f43140d = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedPoiGuideView.f43141e = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        feedPoiGuideView.f43142f = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        feedPoiGuideView.f43143g = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
