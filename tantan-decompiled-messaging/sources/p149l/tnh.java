package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.poi.view.FeedPoiCardItemAboutMeView;
import com.p046p1.mobile.putong.core.p053ui.profile.views.FlowView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class tnh {
    /* JADX INFO: renamed from: a */
    public static void m189775a(FeedPoiCardItemAboutMeView feedPoiCardItemAboutMeView, View view) {
        feedPoiCardItemAboutMeView.f26376a = (FeedPoiCardItemAboutMeView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedPoiCardItemAboutMeView.f26377b = (VText) viewGroup.getChildAt(0);
        feedPoiCardItemAboutMeView.f26378c = (VText) viewGroup.getChildAt(1);
        feedPoiCardItemAboutMeView.f26379d = (FlowView) viewGroup.getChildAt(2);
    }
}
