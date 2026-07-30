package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.b1n;
import l.f6c0;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class c1n {
    /* JADX INFO: renamed from: a */
    public static void m5833a(b1n b1nVar, View view) {
        b1nVar.b = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        b1nVar.c = viewGroup.getChildAt(0);
        b1nVar.d = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m5834b(b1n b1nVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.W4, viewGroup, false);
        m5833a(b1nVar, viewInflate);
        return viewInflate;
    }
}
