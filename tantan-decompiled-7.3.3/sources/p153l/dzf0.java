package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class dzf0 {
    /* JADX INFO: renamed from: a */
    public static void m118740a(czf0 czf0Var, View view) {
        czf0Var.f84463f = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        czf0Var.f84464g = (VImage) viewGroup.getChildAt(0);
        czf0Var.f84465h = (VDraweeView) viewGroup.getChildAt(1);
        czf0Var.f84466i = (VText_Bold) viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m118741b(czf0 czf0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125783cc, viewGroup, false);
        m118740a(czf0Var, viewInflate);
        return viewInflate;
    }
}
