package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedBasicInfoRootLayout;
import l.ws2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class xs2 {
    /* JADX INFO: renamed from: a */
    public static void m10950a(ws2 ws2Var, View view) {
        ws2Var.f = (ExpandedBasicInfoRootLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ws2Var.g = viewGroup.getChildAt(0);
        ws2Var.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        ws2Var.i = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
