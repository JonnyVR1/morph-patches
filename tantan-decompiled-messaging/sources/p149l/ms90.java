package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ms90 {
    /* JADX INFO: renamed from: a */
    public static void m156121a(ls90 ls90Var, View view) {
        ls90Var.f129832u = (RelativeLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ls90Var.f129833v = (VText) viewGroup.getChildAt(0);
        ls90Var.f129834w = (VText) viewGroup.getChildAt(1);
        ls90Var.f129835x = (RelativeLayout) viewGroup.getChildAt(2);
        ls90Var.f129836y = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        ls90Var.f129837z = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0);
        ls90Var.f129820A = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(1);
        ls90Var.f129821B = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        ls90Var.f129822C = (LinearLayout) viewGroup.getChildAt(3);
        ls90Var.f129823D = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0);
        ls90Var.f129824E = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1);
        ls90Var.f129825F = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        ls90Var.f129826G = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0);
        ls90Var.f129827H = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(1);
        ls90Var.f129828I = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        ls90Var.f129829J = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(0);
        ls90Var.f129830K = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(1);
        ls90Var.f129831L = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m156122b(ls90 ls90Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95452L9, viewGroup, false);
        m156121a(ls90Var, viewInflate);
        return viewInflate;
    }
}
