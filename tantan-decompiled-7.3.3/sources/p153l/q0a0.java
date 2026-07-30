package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class q0a0 {
    /* JADX INFO: renamed from: a */
    public static void m174686a(p0a0 p0a0Var, View view) {
        p0a0Var.f150032u = (RelativeLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        p0a0Var.f150033v = (VText) viewGroup.getChildAt(0);
        p0a0Var.f150034w = (VText) viewGroup.getChildAt(1);
        p0a0Var.f150035x = (RelativeLayout) viewGroup.getChildAt(2);
        p0a0Var.f150036y = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        p0a0Var.f150037z = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0);
        p0a0Var.f150020A = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(1);
        p0a0Var.f150021B = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        p0a0Var.f150022C = (LinearLayout) viewGroup.getChildAt(3);
        p0a0Var.f150023D = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(0);
        p0a0Var.f150024E = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1);
        p0a0Var.f150025F = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        p0a0Var.f150026G = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0);
        p0a0Var.f150027H = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(1);
        p0a0Var.f150028I = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        p0a0Var.f150029J = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(0);
        p0a0Var.f150030K = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(1);
        p0a0Var.f150031L = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2)).getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m174687b(p0a0 p0a0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125618S9, viewGroup, false);
        m174686a(p0a0Var, viewInflate);
        return viewInflate;
    }
}
