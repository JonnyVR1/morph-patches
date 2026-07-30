package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import l.f6c0;
import l.nne;
import v.VLinear_Dividers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class one {
    /* JADX INFO: renamed from: a */
    public static void m8514a(nne nneVar, View view) {
        nneVar.u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        nneVar.v = viewGroup.getChildAt(0);
        nneVar.w = viewGroup.getChildAt(1);
        nneVar.x = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        nneVar.y = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        nneVar.z = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        nneVar.A = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        nneVar.B = (LinearLayout) viewGroup.getChildAt(2);
        nneVar.C = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        nneVar.D = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        nneVar.E = (LinearLayout) viewGroup.getChildAt(3);
        nneVar.F = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        nneVar.G = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        nneVar.H = (LinearLayout) viewGroup.getChildAt(4);
        nneVar.I = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        nneVar.J = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        nneVar.K = (LinearLayout) viewGroup.getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m8515b(nne nneVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.ra, viewGroup, false);
        m8514a(nneVar, viewInflate);
        return viewInflate;
    }
}
