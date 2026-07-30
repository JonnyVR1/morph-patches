package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VText;
import p151v.fresco.photodraweeview.PhotoDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class kt9 {
    /* JADX INFO: renamed from: a */
    public static void m151340a(jt9 jt9Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        jt9Var.f122565a = (PhotoDraweeView) viewGroup.getChildAt(0);
        jt9Var.f122566b = viewGroup.getChildAt(1);
        jt9Var.f122567c = (VText) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m151341b(jt9 jt9Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(qec0.f156989a1, viewGroup, false);
        m151340a(jt9Var, viewInflate);
        return viewInflate;
    }
}
