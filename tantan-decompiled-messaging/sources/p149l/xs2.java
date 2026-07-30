package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedBasicInfoRootLayout;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedCardCommonLabelView;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import p147v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class xs2 {
    /* JADX INFO: renamed from: a */
    public static void m210730a(ws2 ws2Var, View view) {
        ws2Var.f187856f = (ExpandedBasicInfoRootLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ws2Var.f187857g = (VLinear) viewGroup.getChildAt(0);
        ws2Var.f187858h = (VText_Medium) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        ws2Var.f187859i = (ExpandedCardCommonLabelView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
