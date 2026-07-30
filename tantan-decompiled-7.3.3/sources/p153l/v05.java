package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class v05 {
    /* JADX INFO: renamed from: a */
    public static void m198880a(t05 t05Var, View view) {
        t05Var.f171446f = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        t05Var.f171447g = (VImage) viewGroup.getChildAt(0);
        t05Var.f171448h = (VDraweeView) viewGroup.getChildAt(1);
        t05Var.f171449i = (VText_Bold) viewGroup.getChildAt(2);
        t05Var.f171450j = (VText) viewGroup.getChildAt(3);
        t05Var.f171451k = (VLinear) viewGroup.getChildAt(4);
        t05Var.f171452l = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        t05Var.f171453m = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1)).getChildAt(2);
        t05Var.f171454n = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
        t05Var.f171455o = (VText_Bold) viewGroup.getChildAt(5);
        t05Var.f171456p = (VRecyclerView) viewGroup.getChildAt(6);
        t05Var.f171457q = viewGroup.getChildAt(7);
        t05Var.f171458r = (VText_Bold) viewGroup.getChildAt(8);
    }

    /* JADX INFO: renamed from: b */
    public static View m198881b(t05 t05Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125840g1, viewGroup, false);
        m198880a(t05Var, viewInflate);
        return viewInflate;
    }
}
