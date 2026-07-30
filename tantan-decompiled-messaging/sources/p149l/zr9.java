package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VText;
import p147v.fresco.photodraweeview.PhotoDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class zr9 {
    /* JADX INFO: renamed from: a */
    public static void m219925a(yr9 yr9Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        yr9Var.f199646a = (PhotoDraweeView) viewGroup.getChildAt(0);
        yr9Var.f199647b = viewGroup.getChildAt(1);
        yr9Var.f199648c = (VText) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m219926b(yr9 yr9Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f126433a1, viewGroup, false);
        m219925a(yr9Var, viewInflate);
        return viewInflate;
    }
}
