package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.core.newui.poi.view.FeedPoiCardItemMomentInfoView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class jph {
    /* JADX INFO: renamed from: a */
    public static void m146499a(FeedPoiCardItemMomentInfoView feedPoiCardItemMomentInfoView, View view) {
        feedPoiCardItemMomentInfoView.f27136a = (FeedPoiCardItemMomentInfoView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedPoiCardItemMomentInfoView.f27137b = (RelativeLayout) viewGroup.getChildAt(0);
        feedPoiCardItemMomentInfoView.f27138c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedPoiCardItemMomentInfoView.f27139d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedPoiCardItemMomentInfoView.f27140e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
    }
}
