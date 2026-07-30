package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedBasicInfoRootLayout;
import l.hxm;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ixm {
    /* JADX INFO: renamed from: a */
    public static void m7306a(hxm hxmVar, View view) {
        hxmVar.f = (ExpandedBasicInfoRootLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        hxmVar.g = viewGroup.getChildAt(0);
        hxmVar.h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        hxmVar.i = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }
}
