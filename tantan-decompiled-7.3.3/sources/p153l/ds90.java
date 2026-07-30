package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.p058ui.profile.views.FlowTagsView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ds90 {
    /* JADX INFO: renamed from: a */
    public static void m117720a(cs90 cs90Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cs90Var.f83440u = (VLinear) viewGroup.getChildAt(0);
        cs90Var.f83441v = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        cs90Var.f83442w = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        cs90Var.f83443x = (FlowTagsView) viewGroup.getChildAt(1);
        cs90Var.f83444y = (VLinear) viewGroup.getChildAt(2);
        cs90Var.f83445z = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        cs90Var.f83431A = (VLinear) viewGroup.getChildAt(3);
        cs90Var.f83432B = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        cs90Var.f83433C = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0);
        cs90Var.f83434D = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(1);
        cs90Var.f83435E = (ConstraintLayout) viewGroup.getChildAt(4);
        cs90Var.f83436F = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        cs90Var.f83437G = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        cs90Var.f83438H = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m117721b(cs90 cs90Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125410F9, viewGroup, false);
        m117720a(cs90Var, viewInflate);
        return viewInflate;
    }
}
