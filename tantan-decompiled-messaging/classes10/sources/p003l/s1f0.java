package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.newui.profile.newmine.newprofile.view.SidesSlipItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class s1f0 {
    /* JADX INFO: renamed from: a */
    public static void m9204a(SidesSlipItemView sidesSlipItemView, View view) {
        sidesSlipItemView.c = (SidesSlipItemView) view;
        ViewGroup viewGroup = (ViewGroup) view;
        sidesSlipItemView.d = viewGroup.getChildAt(0);
        sidesSlipItemView.e = (LinearLayout) viewGroup.getChildAt(1);
        sidesSlipItemView.f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        sidesSlipItemView.g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        sidesSlipItemView.h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        sidesSlipItemView.i = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
    }
}
