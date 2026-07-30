package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.poi.view.FeedPoiCardItemUserHeadView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class aoh {
    /* JADX INFO: renamed from: a */
    public static void m5493a(FeedPoiCardItemUserHeadView feedPoiCardItemUserHeadView, View view) {
        feedPoiCardItemUserHeadView.a = (FeedPoiCardItemUserHeadView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedPoiCardItemUserHeadView.b = viewGroup.getChildAt(0);
        feedPoiCardItemUserHeadView.c = viewGroup.getChildAt(2);
        feedPoiCardItemUserHeadView.d = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        feedPoiCardItemUserHeadView.e = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        feedPoiCardItemUserHeadView.f = viewGroup.getChildAt(3);
    }
}
