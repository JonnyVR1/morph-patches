package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import p151v.VButton;

/* JADX INFO: loaded from: classes10.dex */
public class m2i0 {
    /* JADX INFO: renamed from: a */
    public static void m156862a(l2i0 l2i0Var, View view) {
        l2i0Var.f129773a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        l2i0Var.f129774b = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        l2i0Var.f129775c = (VButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        l2i0Var.f129776d = (FrameLayout) viewGroup.getChildAt(1);
        l2i0Var.f129777e = (VButton) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m156863b(l2i0 l2i0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125396Ec, viewGroup, false);
        m156862a(l2i0Var, viewInflate);
        return viewInflate;
    }
}
