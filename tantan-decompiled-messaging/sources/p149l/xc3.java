package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VRadioButton;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class xc3 {
    /* JADX INFO: renamed from: a */
    public static void m208064a(wc3 wc3Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        wc3Var.f185639a = viewGroup.getChildAt(0);
        wc3Var.f185640b = (ConstraintLayout) viewGroup.getChildAt(1);
        wc3Var.f185641c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        wc3Var.f185642d = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        wc3Var.f185643e = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        wc3Var.f185644f = (VButton) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        wc3Var.f185645g = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        wc3Var.f185646h = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        wc3Var.f185647i = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
        wc3Var.f185648j = (VRadioButton) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7);
    }
}
