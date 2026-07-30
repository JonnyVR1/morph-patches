package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import l.mxw;
import l.n6c0;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class nxw {
    /* JADX INFO: renamed from: a */
    public static void m8376a(mxw mxwVar, View view) {
        mxwVar.c = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        mxwVar.d = viewGroup.getChildAt(0);
        mxwVar.e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        mxwVar.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        mxwVar.g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        mxwVar.h = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        mxwVar.i = (TextView) viewGroup.getChildAt(2);
        mxwVar.j = viewGroup.getChildAt(3);
        mxwVar.k = viewGroup.getChildAt(4);
        mxwVar.l = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        mxwVar.m = (TextView) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m8377b(mxw mxwVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.P, viewGroup, false);
        m8376a(mxwVar, viewInflate);
        return viewInflate;
    }
}
