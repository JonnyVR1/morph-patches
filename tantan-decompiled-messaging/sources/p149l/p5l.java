package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.p053ui.profile.views.HomeCardTopNameViewBar;
import com.p046p1.mobile.putong.newui.view.ODiamondTagLabel;
import p147v.VImage;
import p147v.VLinear_FillerMeasure;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class p5l {
    /* JADX INFO: renamed from: a */
    public static void m167490a(HomeCardTopNameViewBar homeCardTopNameViewBar, View view) {
        homeCardTopNameViewBar.f34125a = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        homeCardTopNameViewBar.f34126b = (VLinear_FillerMeasure) viewGroup.getChildAt(0);
        homeCardTopNameViewBar.f34127c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        homeCardTopNameViewBar.f34128d = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        homeCardTopNameViewBar.f34129e = (ODiamondTagLabel) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        homeCardTopNameViewBar.f34130f = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
    }
}
