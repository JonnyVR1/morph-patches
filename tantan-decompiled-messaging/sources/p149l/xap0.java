package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p147v.VEditText;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class xap0 {
    /* JADX INFO: renamed from: a */
    public static void m207663a(qap0 qap0Var, View view) {
        qap0Var.f153552a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        qap0Var.f153553b = viewGroup.getChildAt(0);
        qap0Var.f153554c = viewGroup.getChildAt(1);
        qap0Var.f153555d = (RelativeLayout) viewGroup.getChildAt(2);
        qap0Var.f153556e = (VLinear) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        qap0Var.f153557f = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        qap0Var.f153558g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        qap0Var.f153559h = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(2);
        qap0Var.f153560i = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        qap0Var.f153561j = (VEditText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(0);
        qap0Var.f153562k = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m207664b(qap0 qap0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168361gb, viewGroup, false);
        m207663a(qap0Var, viewInflate);
        return viewInflate;
    }
}
