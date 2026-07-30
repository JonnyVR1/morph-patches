package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.f6c0;
import l.zd2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ae2 {
    /* JADX INFO: renamed from: a */
    public static void m5359a(zd2 zd2Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        zd2Var.l = viewGroup.getChildAt(1);
        zd2Var.m = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m5360b(zd2 zd2Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.U, viewGroup, false);
        m5359a(zd2Var, viewInflate);
        return viewInflate;
    }
}
