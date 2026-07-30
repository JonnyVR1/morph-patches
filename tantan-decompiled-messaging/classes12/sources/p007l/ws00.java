package p007l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.feed.p005ui.moments.MomentsInProfileView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ws00 {
    /* JADX INFO: renamed from: a */
    public static void m15918a(MomentsInProfileView momentsInProfileView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        momentsInProfileView.f5405c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        momentsInProfileView.f5406d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        momentsInProfileView.f5407e = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        momentsInProfileView.f5408f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        momentsInProfileView.f5409g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        momentsInProfileView.f5410h = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        momentsInProfileView.f5411i = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        momentsInProfileView.f5412j = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        momentsInProfileView.f5413k = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
