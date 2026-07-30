package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.p058ui.profile.views.ProfileCustomBar;
import com.p051p1.mobile.putong.newui.view.ODiamondTagLabel;
import p151v.VImage;
import p151v.VLinear_FillerMeasure;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class er90 {
    /* JADX INFO: renamed from: a */
    public static void m122137a(ProfileCustomBar profileCustomBar, View view) {
        profileCustomBar.f34995a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        profileCustomBar.f34996b = viewGroup.getChildAt(0);
        profileCustomBar.f34997c = (ConstraintLayout) viewGroup.getChildAt(1);
        profileCustomBar.f34998d = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        profileCustomBar.f34999e = (VLinear_FillerMeasure) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        profileCustomBar.f35000f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        profileCustomBar.f35001g = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        profileCustomBar.f35002h = (ODiamondTagLabel) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2);
        profileCustomBar.f35003i = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(3);
        profileCustomBar.f35004j = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        profileCustomBar.f35005k = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        profileCustomBar.f35006l = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        profileCustomBar.f35007m = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        profileCustomBar.f35008n = viewGroup.getChildAt(2);
    }
}
