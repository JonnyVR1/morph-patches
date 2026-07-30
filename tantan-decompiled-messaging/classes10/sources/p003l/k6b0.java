package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import l.j6b0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class k6b0 {
    /* JADX INFO: renamed from: a */
    public static void m7543a(j6b0 j6b0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        j6b0Var.e = viewGroup.getChildAt(0);
        j6b0Var.f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        j6b0Var.g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        j6b0Var.h = (FrameLayout) viewGroup.getChildAt(1);
        j6b0Var.i = (FrameLayout) viewGroup.getChildAt(2);
    }
}
