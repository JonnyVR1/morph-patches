package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VFrame;

/* JADX INFO: loaded from: classes10.dex */
public class zn90 {
    /* JADX INFO: renamed from: a */
    public static void m220586a(yn90 yn90Var, View view) {
        yn90Var.f200801u = (VFrame) view;
    }

    /* JADX INFO: renamed from: b */
    public static View m220587b(yn90 yn90Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125682W9, viewGroup, false);
        m220586a(yn90Var, viewInflate);
        return viewInflate;
    }
}
