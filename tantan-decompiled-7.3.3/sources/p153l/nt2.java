package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedBasicInfoRootLayout;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedCardCommonLabelView;
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;
import p151v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class nt2 {
    /* JADX INFO: renamed from: a */
    public static void m164688a(mt2 mt2Var, View view) {
        mt2Var.f138536f = (ExpandedBasicInfoRootLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        mt2Var.f138537g = (VLinear) viewGroup.getChildAt(0);
        mt2Var.f138538h = (VText_Medium) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        mt2Var.f138539i = (ExpandedCardCommonLabelView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
