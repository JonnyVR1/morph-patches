package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import p151v.VImage;
import p151v.VText;
import p151v.VText_AutoFit;

/* JADX INFO: loaded from: classes10.dex */
public class pu80 {
    /* JADX INFO: renamed from: a */
    public static void m173835a(ou80 ou80Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ou80Var.f149091j = (VImage) viewGroup.getChildAt(0);
        ou80Var.f149092k = (VImage) viewGroup.getChildAt(1);
        ou80Var.f149093l = (LinearLayout) viewGroup.getChildAt(2);
        ou80Var.f149094m = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        ou80Var.f149095n = (VText_AutoFit) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        ou80Var.f149096o = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        ou80Var.f149097p = (VText_AutoFit) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        ou80Var.f149098q = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        ou80Var.f149099r = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        ou80Var.f149100s = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3)).getChildAt(0);
        ou80Var.f149101t = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4);
        ou80Var.f149102u = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5);
        ou80Var.f149103v = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5)).getChildAt(0)).getChildAt(0);
        ou80Var.f149104w = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5)).getChildAt(0)).getChildAt(1);
        ou80Var.f149105x = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5)).getChildAt(1)).getChildAt(0);
        ou80Var.f149106y = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5)).getChildAt(1)).getChildAt(1);
        ou80Var.f149107z = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(6);
        ou80Var.f149068A = (ConstraintLayout) viewGroup.getChildAt(3);
        ou80Var.f149069B = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        ou80Var.f149070C = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        ou80Var.f149071D = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        ou80Var.f149072E = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(3);
        ou80Var.f149073F = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(4);
        ou80Var.f149074G = (RelativeLayout) viewGroup.getChildAt(4);
        ou80Var.f149075H = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        ou80Var.f149076I = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        ou80Var.f149077J = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(3);
        ou80Var.f149078K = (VText) viewGroup.getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m173836b(ou80 ou80Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(rec0.f162610u0, viewGroup, false);
        m173835a(ou80Var, viewInflate);
        return viewInflate;
    }
}
