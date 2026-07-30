package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedBasicInfoRootLayout;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedCardCommonLabelView;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import p147v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class ixm {
    /* JADX INFO: renamed from: a */
    public static void m138874a(hxm hxmVar, View view) {
        hxmVar.f109886f = (ExpandedBasicInfoRootLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        hxmVar.f109887g = (VLinear) viewGroup.getChildAt(0);
        hxmVar.f109888h = (VText_Medium) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        hxmVar.f109889i = (ExpandedCardCommonLabelView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
