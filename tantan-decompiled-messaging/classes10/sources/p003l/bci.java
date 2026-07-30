package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import l.aci;
import l.f6c0;
import v.VRelative;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class bci {
    /* JADX INFO: renamed from: a */
    public static void m5707a(aci aciVar, View view) {
        aciVar.a = (VRelative) view;
        ViewGroup viewGroup = (ViewGroup) view;
        aciVar.b = viewGroup.getChildAt(0);
        aciVar.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        aciVar.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        aciVar.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        aciVar.f = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        aciVar.g = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(2);
        aciVar.h = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        aciVar.i = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        aciVar.j = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        aciVar.k = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        aciVar.l = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m5708b(aci aciVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.l3, viewGroup, false);
        m5707a(aciVar, viewInflate);
        return viewInflate;
    }
}
