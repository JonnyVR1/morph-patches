package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.view.SidesSlipItemView;
import p151v.VDraweeView;
import p151v.VOnlineIndicator;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class z9f0 {
    /* JADX INFO: renamed from: a */
    public static void m219075a(SidesSlipItemView sidesSlipItemView, View view) {
        sidesSlipItemView.f27579c = (SidesSlipItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        sidesSlipItemView.f27580d = viewGroup.getChildAt(0);
        sidesSlipItemView.f27581e = (LinearLayout) viewGroup.getChildAt(1);
        sidesSlipItemView.f27582f = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        sidesSlipItemView.f27583g = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        sidesSlipItemView.f27584h = (VOnlineIndicator) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        sidesSlipItemView.f27585i = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
    }
}
