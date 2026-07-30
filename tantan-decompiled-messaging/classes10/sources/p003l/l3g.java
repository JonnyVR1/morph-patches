package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class l3g {
    /* JADX INFO: renamed from: a */
    public static void m7661a(k3g k3gVar, View view) {
        k3gVar.f5417a = (RelativeLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        k3gVar.f5418b = viewGroup.getChildAt(0);
        k3gVar.f5419c = viewGroup.getChildAt(1);
        k3gVar.f5420d = viewGroup.getChildAt(2);
        k3gVar.f5421e = viewGroup.getChildAt(3);
        k3gVar.f5422f = viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m7662b(k3g k3gVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.j3, viewGroup, false);
        m7661a(k3gVar, viewInflate);
        return viewInflate;
    }
}
