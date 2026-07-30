package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.poi.view.FeedPoiCardItemAboutMeView;
import com.p051p1.mobile.putong.core.p058ui.profile.views.FlowView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class iph {
    /* JADX INFO: renamed from: a */
    public static void m141462a(FeedPoiCardItemAboutMeView feedPoiCardItemAboutMeView, View view) {
        feedPoiCardItemAboutMeView.f27118a = (FeedPoiCardItemAboutMeView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedPoiCardItemAboutMeView.f27119b = (VText) viewGroup.getChildAt(0);
        feedPoiCardItemAboutMeView.f27120c = (VText) viewGroup.getChildAt(1);
        feedPoiCardItemAboutMeView.f27121d = (FlowView) viewGroup.getChildAt(2);
    }
}
