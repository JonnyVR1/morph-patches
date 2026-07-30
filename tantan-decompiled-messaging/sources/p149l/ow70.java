package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.view.PkUpDownScorllView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ow70 {
    /* JADX INFO: renamed from: a */
    public static void m166288a(nw70 nw70Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        nw70Var.f140906i = viewGroup.getChildAt(0);
        nw70Var.f140907j = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        nw70Var.f140908k = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        nw70Var.f140909l = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        nw70Var.f140910m = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        nw70Var.f140911n = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        nw70Var.f140912o = (PkUpDownScorllView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(1);
        nw70Var.f140913p = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        nw70Var.f140914q = (ConstraintLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5)).getChildAt(0);
        nw70Var.f140915r = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5)).getChildAt(0)).getChildAt(0);
        nw70Var.f140916s = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5)).getChildAt(0)).getChildAt(1);
        nw70Var.f140917t = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5)).getChildAt(0)).getChildAt(2);
        nw70Var.f140918u = (ConstraintLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5)).getChildAt(1);
        nw70Var.f140919v = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5)).getChildAt(1)).getChildAt(0);
        nw70Var.f140920w = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5)).getChildAt(1)).getChildAt(1);
        nw70Var.f140921x = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5)).getChildAt(1)).getChildAt(2);
        nw70Var.f140922y = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5)).getChildAt(1)).getChildAt(3);
        nw70Var.f140923z = (ConstraintLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5)).getChildAt(2);
        nw70Var.f140899A = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5)).getChildAt(2)).getChildAt(0);
        nw70Var.f140900B = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5)).getChildAt(2)).getChildAt(1);
        nw70Var.f140901C = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5)).getChildAt(2)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m166289b(nw70 nw70Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168264Z4, viewGroup, false);
        m166288a(nw70Var, viewInflate);
        return viewInflate;
    }
}
