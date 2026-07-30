package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.view.PkUpDownScorllView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class u480 {
    /* JADX INFO: renamed from: a */
    public static void m194466a(t480 t480Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        t480Var.f172036i = viewGroup.getChildAt(0);
        t480Var.f172037j = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        t480Var.f172038k = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        t480Var.f172039l = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        t480Var.f172040m = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        t480Var.f172041n = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        t480Var.f172042o = (PkUpDownScorllView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(1);
        t480Var.f172043p = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        t480Var.f172044q = (ConstraintLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5)).getChildAt(0);
        t480Var.f172045r = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5)).getChildAt(0)).getChildAt(0);
        t480Var.f172046s = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5)).getChildAt(0)).getChildAt(1);
        t480Var.f172047t = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5)).getChildAt(0)).getChildAt(2);
        t480Var.f172048u = (ConstraintLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5)).getChildAt(1);
        t480Var.f172049v = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5)).getChildAt(1)).getChildAt(0);
        t480Var.f172050w = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5)).getChildAt(1)).getChildAt(1);
        t480Var.f172051x = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5)).getChildAt(1)).getChildAt(2);
        t480Var.f172052y = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5)).getChildAt(1)).getChildAt(3);
        t480Var.f172053z = (ConstraintLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5)).getChildAt(2);
        t480Var.f172029A = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5)).getChildAt(2)).getChildAt(0);
        t480Var.f172030B = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5)).getChildAt(2)).getChildAt(1);
        t480Var.f172031C = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5)).getChildAt(2)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m194467b(t480 t480Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198996Z4, viewGroup, false);
        m194466a(t480Var, viewInflate);
        return viewInflate;
    }
}
