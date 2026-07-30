package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p147v.VImage;
import p147v.VText;
import p147v.VText_AutoFit;

/* JADX INFO: loaded from: classes10.dex */
public class lm80 {
    /* JADX INFO: renamed from: a */
    public static void m150556a(km80 km80Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        km80Var.f123764j = (VImage) viewGroup.getChildAt(0);
        km80Var.f123765k = (VImage) viewGroup.getChildAt(1);
        km80Var.f123766l = (LinearLayout) viewGroup.getChildAt(2);
        km80Var.f123767m = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        km80Var.f123768n = (VText_AutoFit) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        km80Var.f123769o = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        km80Var.f123770p = (VText_AutoFit) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        km80Var.f123771q = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        km80Var.f123772r = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        km80Var.f123773s = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3)).getChildAt(0);
        km80Var.f123774t = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4);
        km80Var.f123775u = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5);
        km80Var.f123776v = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5)).getChildAt(0)).getChildAt(0);
        km80Var.f123777w = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5)).getChildAt(0)).getChildAt(1);
        km80Var.f123778x = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5)).getChildAt(1)).getChildAt(0);
        km80Var.f123779y = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5)).getChildAt(1)).getChildAt(1);
        km80Var.f123780z = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(6);
        km80Var.f123741A = (ConstraintLayout) viewGroup.getChildAt(3);
        km80Var.f123742B = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        km80Var.f123743C = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        km80Var.f123744D = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        km80Var.f123745E = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(3);
        km80Var.f123746F = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(4);
        km80Var.f123747G = (RelativeLayout) viewGroup.getChildAt(4);
        km80Var.f123748H = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        km80Var.f123749I = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        km80Var.f123750J = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(3);
        km80Var.f123751K = (VText) viewGroup.getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m150557b(km80 km80Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(m6c0.f131650u0, viewGroup, false);
        m150556a(km80Var, viewInflate);
        return viewInflate;
    }
}
