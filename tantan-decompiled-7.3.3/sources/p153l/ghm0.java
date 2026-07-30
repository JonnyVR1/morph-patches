package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.visitor.VisitorsFilterItemAgeView;
import p151v.VRangeSlider;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ghm0 {
    /* JADX INFO: renamed from: a */
    public static void m130253a(VisitorsFilterItemAgeView visitorsFilterItemAgeView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        visitorsFilterItemAgeView.f38937a = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        visitorsFilterItemAgeView.f38938b = (VRangeSlider) viewGroup.getChildAt(1);
    }
}
