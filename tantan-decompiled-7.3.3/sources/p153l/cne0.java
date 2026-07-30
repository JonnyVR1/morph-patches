package p153l;

import android.view.View;
import android.view.ViewGroup;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VRadioButton;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class cne0 {
    /* JADX INFO: renamed from: a */
    public static void m111498a(bne0 bne0Var, View view) {
        bne0Var.f77462k = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        bne0Var.f77463l = viewGroup.getChildAt(0);
        bne0Var.f77464m = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        bne0Var.f77465n = (VButton) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        bne0Var.f77466o = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        bne0Var.f77467p = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        bne0Var.f77468q = (VRadioButton) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
    }
}
