package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import l.f6c0;
import l.gne;
import v.VLinear_Dividers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class hne {
    /* JADX INFO: renamed from: a */
    public static void m7042a(gne gneVar, View view) {
        gneVar.u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        gneVar.v = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        gneVar.w = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        gneVar.x = viewGroup.getChildAt(1);
        gneVar.y = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        gneVar.z = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        gneVar.A = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        gneVar.B = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        gneVar.C = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m7043b(gne gneVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.A9, viewGroup, false);
        m7042a(gneVar, viewInflate);
        return viewInflate;
    }
}
