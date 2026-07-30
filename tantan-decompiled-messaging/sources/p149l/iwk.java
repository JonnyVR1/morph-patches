package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedBasicInfoRootLayout;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedCardCommonLabelView;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import p147v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class iwk {
    /* JADX INFO: renamed from: a */
    public static void m138749a(hwk hwkVar, View view) {
        hwkVar.f109765f = (ExpandedBasicInfoRootLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        hwkVar.f109766g = (VLinear) viewGroup.getChildAt(0);
        hwkVar.f109767h = (VText_Medium) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        hwkVar.f109768i = (ExpandedCardCommonLabelView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
