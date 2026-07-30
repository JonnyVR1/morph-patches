package p153l;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VRadioButton;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class md3 {
    /* JADX INFO: renamed from: a */
    public static void m157954a(ld3 ld3Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ld3Var.f131400a = viewGroup.getChildAt(0);
        ld3Var.f131401b = (ConstraintLayout) viewGroup.getChildAt(1);
        ld3Var.f131402c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        ld3Var.f131403d = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        ld3Var.f131404e = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        ld3Var.f131405f = (VButton) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        ld3Var.f131406g = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        ld3Var.f131407h = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        ld3Var.f131408i = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
        ld3Var.f131409j = (VRadioButton) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7);
    }
}
