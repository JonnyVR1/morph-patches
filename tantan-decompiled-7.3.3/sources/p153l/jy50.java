package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class jy50 {
    /* JADX INFO: renamed from: a */
    public static void m147468a(iy50 iy50Var, View view) {
        iy50Var.f117512a = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        iy50Var.f117513b = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        iy50Var.f117514c = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        iy50Var.f117515d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        iy50Var.f117516e = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        iy50Var.f117517f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        iy50Var.f117518g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(2);
        iy50Var.f117519h = (VText) viewGroup.getChildAt(1);
        iy50Var.f117520i = (VText) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m147469b(iy50 iy50Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f126090ue, viewGroup, false);
        m147468a(iy50Var, viewInflate);
        return viewInflate;
    }
}
