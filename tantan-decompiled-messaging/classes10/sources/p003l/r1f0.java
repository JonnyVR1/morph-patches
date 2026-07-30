package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.newui.profile.newmine.newprofile.view.SidesSlipHeadItemView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class r1f0 {
    /* JADX INFO: renamed from: a */
    public static void m9070a(SidesSlipHeadItemView sidesSlipHeadItemView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        sidesSlipHeadItemView.c = viewGroup.getChildAt(0);
        sidesSlipHeadItemView.d = viewGroup.getChildAt(1);
        sidesSlipHeadItemView.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        sidesSlipHeadItemView.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        sidesSlipHeadItemView.g = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        sidesSlipHeadItemView.h = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        sidesSlipHeadItemView.i = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        sidesSlipHeadItemView.j = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        sidesSlipHeadItemView.k = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        sidesSlipHeadItemView.l = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        sidesSlipHeadItemView.m = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        sidesSlipHeadItemView.n = viewGroup.getChildAt(2);
        sidesSlipHeadItemView.o = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        sidesSlipHeadItemView.p = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }
}
