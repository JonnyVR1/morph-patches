package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import l.aoi0;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class boi0 {
    /* JADX INFO: renamed from: a */
    public static void m5773a(aoi0 aoi0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        aoi0Var.b = viewGroup.getChildAt(0);
        aoi0Var.c = viewGroup.getChildAt(1);
        aoi0Var.d = (TextView) viewGroup.getChildAt(2);
        aoi0Var.e = (TextView) viewGroup.getChildAt(3);
        aoi0Var.f = viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m5774b(aoi0 aoi0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.Q3, viewGroup, false);
        m5773a(aoi0Var, viewInflate);
        return viewInflate;
    }
}
