package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import p151v.VButton;
import p151v.VImage;
import p151v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class mwb0 {
    /* JADX INFO: renamed from: a */
    public static void m160475a(lwb0 lwb0Var, View view) {
        lwb0Var.f133794f = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        lwb0Var.f133795g = (VImage) viewGroup.getChildAt(0);
        lwb0Var.f133796h = (VImage) viewGroup.getChildAt(1);
        lwb0Var.f133797i = (VText_Bold) viewGroup.getChildAt(2);
        lwb0Var.f133798j = (VButton) viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m160476b(lwb0 lwb0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125973o, viewGroup, false);
        m160475a(lwb0Var, viewInflate);
        return viewInflate;
    }
}
