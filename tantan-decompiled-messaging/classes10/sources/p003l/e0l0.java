package p003l;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.ui.roundcorners.view.RoundFrameLayout;
import l.d0l0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class e0l0 {
    /* JADX INFO: renamed from: a */
    public static void m6231a(d0l0 d0l0Var, View view) {
        d0l0Var.f = (RoundFrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        d0l0Var.g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        d0l0Var.h = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        d0l0Var.i = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
