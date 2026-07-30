package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.poi.view.FeedPoiCardItemUserHeadView;
import p151v.VDraweeView;
import p151v.VLinear_FillerMeasure;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class pph {
    /* JADX INFO: renamed from: a */
    public static void m173200a(FeedPoiCardItemUserHeadView feedPoiCardItemUserHeadView, View view) {
        feedPoiCardItemUserHeadView.f27145a = (FeedPoiCardItemUserHeadView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedPoiCardItemUserHeadView.f27146b = (VDraweeView) viewGroup.getChildAt(0);
        feedPoiCardItemUserHeadView.f27147c = (VLinear_FillerMeasure) viewGroup.getChildAt(2);
        feedPoiCardItemUserHeadView.f27148d = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        feedPoiCardItemUserHeadView.f27149e = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        feedPoiCardItemUserHeadView.f27150f = (VText) viewGroup.getChildAt(3);
    }
}
