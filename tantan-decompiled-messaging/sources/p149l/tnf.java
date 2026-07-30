package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p147v.VDraweeView;
import p147v.VImage;

/* JADX INFO: loaded from: classes10.dex */
public class tnf {
    /* JADX INFO: renamed from: a */
    public static void m189773a(snf snfVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        snfVar.f165439j = (VImage) viewGroup.getChildAt(0);
        snfVar.f165440k = (VDraweeView) viewGroup.getChildAt(1);
        snfVar.f165441l = (TextView) viewGroup.getChildAt(2);
        snfVar.f165442m = (TextView) viewGroup.getChildAt(3);
        snfVar.f165443n = (TextView) viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m189774b(snf snfVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95669Z2, viewGroup, false);
        m189773a(snfVar, viewInflate);
        return viewInflate;
    }
}
