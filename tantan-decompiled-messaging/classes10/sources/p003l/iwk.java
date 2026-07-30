package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedBasicInfoRootLayout;
import l.hwk;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class iwk {
    /* JADX INFO: renamed from: a */
    public static void m7303a(hwk hwkVar, View view) {
        hwkVar.f = (ExpandedBasicInfoRootLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        hwkVar.g = viewGroup.getChildAt(0);
        hwkVar.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        hwkVar.i = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
