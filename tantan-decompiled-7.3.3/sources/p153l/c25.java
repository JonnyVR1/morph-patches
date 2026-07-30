package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class c25 {
    /* JADX INFO: renamed from: a */
    public static void m107674a(b25 b25Var, View view) {
        b25Var.f74567a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        b25Var.f74568b = (VDraweeView) viewGroup.getChildAt(0);
        b25Var.f74569c = (VImage) viewGroup.getChildAt(1);
        b25Var.f74570d = (VText_Bold) viewGroup.getChildAt(2);
        b25Var.f74571e = (VText_Bold) viewGroup.getChildAt(3);
        b25Var.f74572f = (VText) viewGroup.getChildAt(4);
        b25Var.f74573g = (VLinear) viewGroup.getChildAt(5);
        b25Var.f74574h = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        b25Var.f74575i = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1)).getChildAt(2);
        b25Var.f74576j = (VText) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(2);
        b25Var.f74577k = (VText_Bold) viewGroup.getChildAt(6);
        b25Var.f74578l = (VRecyclerView) viewGroup.getChildAt(7);
        b25Var.f74579m = viewGroup.getChildAt(8);
        b25Var.f74580n = (FrameLayout) viewGroup.getChildAt(9);
        b25Var.f74581o = (VText_Bold) ((ViewGroup) viewGroup.getChildAt(9)).getChildAt(0);
        b25Var.f74582p = (TextView) ((ViewGroup) viewGroup.getChildAt(9)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m107675b(b25 b25Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125958n1, viewGroup, false);
        m107674a(b25Var, viewInflate);
        return viewInflate;
    }
}
