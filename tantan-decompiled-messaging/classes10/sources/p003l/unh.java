package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p1.mobile.putong.core.newui.poi.view.FeedPoiCardItemMomentInfoView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class unh {
    /* JADX INFO: renamed from: a */
    public static void m9751a(FeedPoiCardItemMomentInfoView feedPoiCardItemMomentInfoView, View view) {
        feedPoiCardItemMomentInfoView.a = (FeedPoiCardItemMomentInfoView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedPoiCardItemMomentInfoView.b = (RelativeLayout) viewGroup.getChildAt(0);
        feedPoiCardItemMomentInfoView.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedPoiCardItemMomentInfoView.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedPoiCardItemMomentInfoView.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
    }
}
