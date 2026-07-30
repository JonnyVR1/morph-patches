package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import l.f6c0;
import l.snf;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class tnf {
    /* JADX INFO: renamed from: a */
    public static void m9596a(snf snfVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        snfVar.j = viewGroup.getChildAt(0);
        snfVar.k = viewGroup.getChildAt(1);
        snfVar.l = (TextView) viewGroup.getChildAt(2);
        snfVar.m = (TextView) viewGroup.getChildAt(3);
        snfVar.n = (TextView) viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m9597b(snf snfVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.Z2, viewGroup, false);
        m9596a(snfVar, viewInflate);
        return viewInflate;
    }
}
