package p149l;

import android.view.View;
import android.view.ViewGroup;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class lmj0 {
    /* JADX INFO: renamed from: a */
    public static void m150592a(kmj0 kmj0Var, View view) {
        kmj0Var.f123802d = (VRelative) view;
        ViewGroup viewGroup = (ViewGroup) view;
        kmj0Var.f123803e = (VLinear) viewGroup.getChildAt(0);
        kmj0Var.f123804f = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        kmj0Var.f123805g = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        kmj0Var.f123806h = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        kmj0Var.f123807i = (VLinear) viewGroup.getChildAt(1);
    }
}
