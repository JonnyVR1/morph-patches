package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class rmc0 {
    /* JADX INFO: renamed from: a */
    public static void m182051a(qmc0 qmc0Var, View view) {
        qmc0Var.f158313f = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        qmc0Var.f158314g = (ImageView) viewGroup.getChildAt(0);
        qmc0Var.f158315h = (VText_Medium) viewGroup.getChildAt(2);
        qmc0Var.f158316i = (VText) viewGroup.getChildAt(3);
        qmc0Var.f158317j = (VText_Medium) viewGroup.getChildAt(4);
        qmc0Var.f158318k = (VText_Medium) viewGroup.getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m182052b(qmc0 qmc0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125492Kb, viewGroup, false);
        m182051a(qmc0Var, viewInflate);
        return viewInflate;
    }
}
