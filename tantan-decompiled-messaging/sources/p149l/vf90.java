package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VFrame;

/* JADX INFO: loaded from: classes10.dex */
public class vf90 {
    /* JADX INFO: renamed from: a */
    public static void m198274a(uf90 uf90Var, View view) {
        uf90Var.f176238u = (VFrame) view;
    }

    /* JADX INFO: renamed from: b */
    public static View m198275b(uf90 uf90Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95516P9, viewGroup, false);
        m198274a(uf90Var, viewInflate);
        return viewInflate;
    }
}
