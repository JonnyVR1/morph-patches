package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class d15 {
    /* JADX INFO: renamed from: a */
    public static void m109569a(c15 c15Var, View view) {
        c15Var.f78208a = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        c15Var.f78209b = (VDraweeView) viewGroup.getChildAt(0);
        c15Var.f78210c = (VImage) viewGroup.getChildAt(1);
        c15Var.f78211d = (VText_Bold) viewGroup.getChildAt(2);
        c15Var.f78212e = (VText_Bold) viewGroup.getChildAt(3);
        c15Var.f78213f = (VText) viewGroup.getChildAt(4);
        c15Var.f78214g = (VLinear) viewGroup.getChildAt(5);
        c15Var.f78215h = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        c15Var.f78216i = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1)).getChildAt(2);
        c15Var.f78217j = (VText) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(2);
        c15Var.f78218k = (VText_Bold) viewGroup.getChildAt(6);
        c15Var.f78219l = (VRecyclerView) viewGroup.getChildAt(7);
        c15Var.f78220m = viewGroup.getChildAt(8);
        c15Var.f78221n = (FrameLayout) viewGroup.getChildAt(9);
        c15Var.f78222o = (VText_Bold) ((ViewGroup) viewGroup.getChildAt(9)).getChildAt(0);
        c15Var.f78223p = (TextView) ((ViewGroup) viewGroup.getChildAt(9)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m109570b(c15 c15Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95904n1, viewGroup, false);
        m109569a(c15Var, viewInflate);
        return viewInflate;
    }
}
