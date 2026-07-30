package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.view.SidesSlipHeadItemView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class y9f0 {
    /* JADX INFO: renamed from: a */
    public static void m214819a(SidesSlipHeadItemView sidesSlipHeadItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        sidesSlipHeadItemView.f27548c = (VDraweeView) viewGroup.getChildAt(0);
        sidesSlipHeadItemView.f27549d = (VLinear) viewGroup.getChildAt(1);
        sidesSlipHeadItemView.f27550e = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        sidesSlipHeadItemView.f27551f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        sidesSlipHeadItemView.f27552g = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        sidesSlipHeadItemView.f27553h = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        sidesSlipHeadItemView.f27554i = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        sidesSlipHeadItemView.f27555j = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        sidesSlipHeadItemView.f27556k = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        sidesSlipHeadItemView.f27557l = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        sidesSlipHeadItemView.f27558m = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        sidesSlipHeadItemView.f27559n = (VFrame) viewGroup.getChildAt(2);
        sidesSlipHeadItemView.f27560o = (VImage) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        sidesSlipHeadItemView.f27561p = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
