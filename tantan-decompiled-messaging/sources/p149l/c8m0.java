package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.visitor.VisitorsFilterItemAgeView;
import p147v.VRangeSlider;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class c8m0 {
    /* JADX INFO: renamed from: a */
    public static void m105799a(VisitorsFilterItemAgeView visitorsFilterItemAgeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        visitorsFilterItemAgeView.f38089a = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        visitorsFilterItemAgeView.f38090b = (VRangeSlider) viewGroup.getChildAt(1);
    }
}
