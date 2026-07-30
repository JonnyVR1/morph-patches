package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.poi.view.FeedPoiCardItemAboutMeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class tnh {
    /* JADX INFO: renamed from: a */
    public static void m9598a(FeedPoiCardItemAboutMeView feedPoiCardItemAboutMeView, View view) {
        feedPoiCardItemAboutMeView.a = (FeedPoiCardItemAboutMeView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedPoiCardItemAboutMeView.b = viewGroup.getChildAt(0);
        feedPoiCardItemAboutMeView.c = viewGroup.getChildAt(1);
        feedPoiCardItemAboutMeView.d = viewGroup.getChildAt(2);
    }
}
