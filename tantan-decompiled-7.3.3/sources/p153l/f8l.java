package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.p058ui.profile.views.HomeCardTopNameViewBar;
import com.p051p1.mobile.putong.newui.view.ODiamondTagLabel;
import p151v.VImage;
import p151v.VLinear_FillerMeasure;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class f8l {
    /* JADX INFO: renamed from: a */
    public static void m124552a(HomeCardTopNameViewBar homeCardTopNameViewBar, View view) {
        homeCardTopNameViewBar.f34973a = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        homeCardTopNameViewBar.f34974b = (VLinear_FillerMeasure) viewGroup.getChildAt(0);
        homeCardTopNameViewBar.f34975c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        homeCardTopNameViewBar.f34976d = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        homeCardTopNameViewBar.f34977e = (ODiamondTagLabel) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        homeCardTopNameViewBar.f34978f = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
    }
}
