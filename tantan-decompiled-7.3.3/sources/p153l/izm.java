package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedBasicInfoRootLayout;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedCardCommonLabelView;
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;
import p151v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class izm {
    /* JADX INFO: renamed from: a */
    public static void m142812a(hzm hzmVar, View view) {
        hzmVar.f112265f = (ExpandedBasicInfoRootLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        hzmVar.f112266g = (VLinear) viewGroup.getChildAt(0);
        hzmVar.f112267h = (VText_Medium) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        hzmVar.f112268i = (ExpandedCardCommonLabelView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
