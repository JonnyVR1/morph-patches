package p149l;

import android.view.View;
import android.view.ViewGroup;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VRadioButton;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class xee0 {
    /* JADX INFO: renamed from: a */
    public static void m208578a(wee0 wee0Var, View view) {
        wee0Var.f185928k = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        wee0Var.f185929l = viewGroup.getChildAt(0);
        wee0Var.f185930m = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        wee0Var.f185931n = (VButton) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        wee0Var.f185932o = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        wee0Var.f185933p = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        wee0Var.f185934q = (VRadioButton) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
    }
}
