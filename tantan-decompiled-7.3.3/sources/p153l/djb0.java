package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes10.dex */
public class djb0 {
    /* JADX INFO: renamed from: a */
    public static void m116072a(cjb0 cjb0Var, View view) {
        cjb0Var._root = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        cjb0Var._intro_root = (FrameLayout) viewGroup.getChildAt(0);
        cjb0Var._payment_root = (FrameLayout) viewGroup.getChildAt(1);
        cjb0Var._agreement_root = (FrameLayout) viewGroup.getChildAt(2);
    }
}
