package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.poi.view.FeedPoiCardItemUserHeadView;
import p147v.VDraweeView;
import p147v.VLinear_FillerMeasure;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class aoh {
    /* JADX INFO: renamed from: a */
    public static void m97897a(FeedPoiCardItemUserHeadView feedPoiCardItemUserHeadView, View view) {
        feedPoiCardItemUserHeadView.f26403a = (FeedPoiCardItemUserHeadView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedPoiCardItemUserHeadView.f26404b = (VDraweeView) viewGroup.getChildAt(0);
        feedPoiCardItemUserHeadView.f26405c = (VLinear_FillerMeasure) viewGroup.getChildAt(2);
        feedPoiCardItemUserHeadView.f26406d = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        feedPoiCardItemUserHeadView.f26407e = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        feedPoiCardItemUserHeadView.f26408f = (VText) viewGroup.getChildAt(3);
    }
}
