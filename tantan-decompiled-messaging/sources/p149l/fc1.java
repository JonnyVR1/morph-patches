package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class fc1 {
    /* JADX INFO: renamed from: a */
    public static void m120416a(ec1 ec1Var, View view) {
        ec1Var.f90450j = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ec1Var.f90451k = (VDraweeView) viewGroup.getChildAt(0);
        ec1Var.f90452l = (VDraweeView) viewGroup.getChildAt(1);
        ec1Var.f90453m = (ImageView) viewGroup.getChildAt(2);
        ec1Var.f90454n = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        ec1Var.f90455o = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        ec1Var.f90456p = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        ec1Var.f90457q = (VDraweeView) viewGroup.getChildAt(4);
        ec1Var.f90458r = (VText) viewGroup.getChildAt(5);
        ec1Var.f90459s = (VText) viewGroup.getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m120417b(ec1 ec1Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95458M, viewGroup, false);
        m120416a(ec1Var, viewInflate);
        return viewInflate;
    }
}
