package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.f6c0;
import l.zva0;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class awa0 {
    /* JADX INFO: renamed from: a */
    public static void m5647a(zva0 zva0Var, View view) {
        zva0Var.v = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        zva0Var.w = viewGroup.getChildAt(0);
        zva0Var.x = viewGroup.getChildAt(1);
        zva0Var.y = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m5648b(zva0 zva0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.Y9, viewGroup, false);
        m5647a(zva0Var, viewInflate);
        return viewInflate;
    }
}
