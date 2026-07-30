package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.feed.p005ui.moments.MomentsInProfileViewLarge;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class gs00 {
    /* JADX INFO: renamed from: a */
    public static void m10495a(MomentsInProfileViewLarge momentsInProfileViewLarge, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        momentsInProfileViewLarge.f5417c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        momentsInProfileViewLarge.f5418d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        momentsInProfileViewLarge.f5419e = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        momentsInProfileViewLarge.f5420f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        momentsInProfileViewLarge.f5421g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        momentsInProfileViewLarge.f5422h = (LinearLayout) viewGroup.getChildAt(1);
        momentsInProfileViewLarge.f5423i = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        momentsInProfileViewLarge.f5424j = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        momentsInProfileViewLarge.f5425k = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
