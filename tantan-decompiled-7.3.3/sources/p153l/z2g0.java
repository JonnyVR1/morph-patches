package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import p151v.VDraweeView;
import p151v.VIcon;

/* JADX INFO: loaded from: classes10.dex */
public class z2g0 {
    /* JADX INFO: renamed from: a */
    public static void m218417a(y2g0 y2g0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        y2g0Var.f197214j = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        y2g0Var.f197215k = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        y2g0Var.f197216l = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        y2g0Var.f197217m = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        y2g0Var.f197218n = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3);
        y2g0Var.f197219o = (VIcon) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(4);
        y2g0Var.f197220p = (VText_Bold) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(5);
        y2g0Var.f197221q = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        y2g0Var.f197222r = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        y2g0Var.f197223s = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        y2g0Var.f197224t = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m218418b(y2g0 y2g0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f126071tc, viewGroup, false);
        m218417a(y2g0Var, viewInflate);
        return viewInflate;
    }
}
