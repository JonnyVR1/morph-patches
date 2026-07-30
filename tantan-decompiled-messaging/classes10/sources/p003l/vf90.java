package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.f6c0;
import l.uf90;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class vf90 {
    /* JADX INFO: renamed from: a */
    public static void m10219a(uf90 uf90Var, View view) {
        uf90Var.u = (VFrame) view;
    }

    /* JADX INFO: renamed from: b */
    public static View m10220b(uf90 uf90Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.P9, viewGroup, false);
        m10219a(uf90Var, viewInflate);
        return viewInflate;
    }
}
