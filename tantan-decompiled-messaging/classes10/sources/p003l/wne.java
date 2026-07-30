package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import l.f6c0;
import l.vne;
import v.VLinear_Dividers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class wne {
    /* JADX INFO: renamed from: a */
    public static void m10532a(vne vneVar, View view) {
        vneVar.u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        vneVar.v = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        vneVar.w = viewGroup.getChildAt(1);
        vneVar.x = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        vneVar.y = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        vneVar.z = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        vneVar.A = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        vneVar.B = (LinearLayout) viewGroup.getChildAt(2);
        vneVar.C = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        vneVar.D = (ImageView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        vneVar.E = viewGroup.getChildAt(3);
        vneVar.F = viewGroup.getChildAt(4);
        vneVar.G = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m10533b(vne vneVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.Ca, viewGroup, false);
        m10532a(vneVar, viewInflate);
        return viewInflate;
    }
}
