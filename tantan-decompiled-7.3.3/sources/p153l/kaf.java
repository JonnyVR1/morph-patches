package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VLinear_Dividers;
import p151v.VRecyclerView;
import p151v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes10.dex */
public class kaf {
    /* JADX INFO: renamed from: a */
    public static void m148944a(jaf jafVar, View view) {
        jafVar.f118977u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        jafVar.f118978v = (VRecyclerView) viewGroup.getChildAt(0);
        jafVar.f118979w = (VText_NoTopPadding) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m148945b(jaf jafVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f126027r2, viewGroup, false);
        m148944a(jafVar, viewInflate);
        return viewInflate;
    }
}
