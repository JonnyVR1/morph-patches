package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.p053ui.profile.views.ProfileCustomBar;
import com.p046p1.mobile.putong.newui.view.ODiamondTagLabel;
import p147v.VImage;
import p147v.VLinear_FillerMeasure;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class aj90 {
    /* JADX INFO: renamed from: a */
    public static void m96971a(ProfileCustomBar profileCustomBar, View view) {
        profileCustomBar.f34147a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        profileCustomBar.f34148b = viewGroup.getChildAt(0);
        profileCustomBar.f34149c = (ConstraintLayout) viewGroup.getChildAt(1);
        profileCustomBar.f34150d = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        profileCustomBar.f34151e = (VLinear_FillerMeasure) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        profileCustomBar.f34152f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        profileCustomBar.f34153g = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        profileCustomBar.f34154h = (ODiamondTagLabel) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2);
        profileCustomBar.f34155i = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(3);
        profileCustomBar.f34156j = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        profileCustomBar.f34157k = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        profileCustomBar.f34158l = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        profileCustomBar.f34159m = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        profileCustomBar.f34160n = viewGroup.getChildAt(2);
    }
}
