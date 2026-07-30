package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.core.newui.poi.view.FeedPoiCardItemMomentInfoView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class unh {
    /* JADX INFO: renamed from: a */
    public static void m194422a(FeedPoiCardItemMomentInfoView feedPoiCardItemMomentInfoView, View view) {
        feedPoiCardItemMomentInfoView.f26394a = (FeedPoiCardItemMomentInfoView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedPoiCardItemMomentInfoView.f26395b = (RelativeLayout) viewGroup.getChildAt(0);
        feedPoiCardItemMomentInfoView.f26396c = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedPoiCardItemMomentInfoView.f26397d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedPoiCardItemMomentInfoView.f26398e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
    }
}
