package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import l.aoe;
import l.f6c0;
import v.VLinear_Dividers;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class boe {
    /* JADX INFO: renamed from: a */
    public static void m5770a(aoe aoeVar, View view) {
        aoeVar.u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        aoeVar.v = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        aoeVar.w = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        aoeVar.x = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        aoeVar.y = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        aoeVar.z = (LinearLayout) viewGroup.getChildAt(1);
        aoeVar.A = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        aoeVar.B = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        aoeVar.C = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        aoeVar.D = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        aoeVar.E = viewGroup.getChildAt(2);
        aoeVar.F = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        aoeVar.G = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        aoeVar.H = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m5771b(aoe aoeVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.La, viewGroup, false);
        m5770a(aoeVar, viewInflate);
        return viewInflate;
    }
}
