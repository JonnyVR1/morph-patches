package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import l.f6c0;
import l.ls90;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ms90 {
    /* JADX INFO: renamed from: a */
    public static void m8262a(ls90 ls90Var, View view) {
        ls90Var.u = (RelativeLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ls90Var.v = viewGroup.getChildAt(0);
        ls90Var.w = viewGroup.getChildAt(1);
        ls90Var.x = (RelativeLayout) viewGroup.getChildAt(2);
        ls90Var.y = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        ls90Var.z = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0);
        ls90Var.A = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(1);
        ls90Var.B = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        ls90Var.C = (LinearLayout) viewGroup.getChildAt(3);
        ls90Var.D = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0);
        ls90Var.E = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1);
        ls90Var.F = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        ls90Var.G = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0);
        ls90Var.H = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(1);
        ls90Var.I = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        ls90Var.J = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(0);
        ls90Var.K = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(1);
        ls90Var.L = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m8263b(ls90 ls90Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.L9, viewGroup, false);
        m8262a(ls90Var, viewInflate);
        return viewInflate;
    }
}
