package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.roundcorners.view.RoundFrameLayout;
import l.haa0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class iaa0 {
    /* JADX INFO: renamed from: a */
    public static void m7143a(haa0 haa0Var, View view) {
        haa0Var.f = (RoundFrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        haa0Var.g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        haa0Var.h = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        haa0Var.i = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        haa0Var.j = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
    }
}
