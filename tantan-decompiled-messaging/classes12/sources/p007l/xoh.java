package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.poi.view.FeedPoiGuideView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class xoh {
    /* JADX INFO: renamed from: a */
    public static void m16801a(FeedPoiGuideView feedPoiGuideView, View view) {
        feedPoiGuideView.f3750a = (FeedPoiGuideView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedPoiGuideView.f3751b = (RelativeLayout) viewGroup.getChildAt(0);
        feedPoiGuideView.f3752c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedPoiGuideView.f3753d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedPoiGuideView.f3754e = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        feedPoiGuideView.f3755f = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        feedPoiGuideView.f3756g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
