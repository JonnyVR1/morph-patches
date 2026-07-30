package p002l;

import android.view.View;
import android.view.ViewGroup;
import l.kmj0;
import v.VRelative;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class lmj0 {
    /* JADX INFO: renamed from: a */
    public static void m17314a(kmj0 kmj0Var, View view) {
        kmj0Var.d = (VRelative) view;
        ViewGroup viewGroup = (ViewGroup) view;
        kmj0Var.e = viewGroup.getChildAt(0);
        kmj0Var.f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        kmj0Var.g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        kmj0Var.h = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        kmj0Var.i = viewGroup.getChildAt(1);
    }
}
