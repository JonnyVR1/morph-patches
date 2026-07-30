package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.feed.newui.camera.widget.FeedBeautyMakeupPageView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class spg {
    /* JADX INFO: renamed from: a */
    public static void m14278a(FeedBeautyMakeupPageView feedBeautyMakeupPageView, View view) {
        feedBeautyMakeupPageView.f1043a = (FeedBeautyMakeupPageView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedBeautyMakeupPageView.f1044b = viewGroup.getChildAt(0);
        feedBeautyMakeupPageView.f1045c = (LinearLayout) viewGroup.getChildAt(1);
        feedBeautyMakeupPageView.f1046d = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        feedBeautyMakeupPageView.f1047e = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        feedBeautyMakeupPageView.f1048f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
