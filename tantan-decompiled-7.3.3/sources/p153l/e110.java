package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class e110 {
    /* JADX INFO: renamed from: a */
    public static void m118938a(c110 c110Var, View view) {
        c110Var.f79317d = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        c110Var.f79318e = (VImage) viewGroup.getChildAt(0);
        c110Var.f79319f = (VText) viewGroup.getChildAt(1);
        c110Var.f79320g = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        c110Var.f79321h = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        c110Var.f79322i = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        c110Var.f79323j = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        c110Var.f79324k = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m118939b(c110 c110Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173468A4, viewGroup, false);
        m118938a(c110Var, viewInflate);
        return viewInflate;
    }
}
