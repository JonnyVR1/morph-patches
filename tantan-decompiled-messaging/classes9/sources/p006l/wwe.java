package p006l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class wwe {
    /* JADX INFO: renamed from: a */
    public static void m26792a(vwe vweVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        vweVar.f24502a = viewGroup.getChildAt(2);
        vweVar.f24503b = viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m26793b(vwe vweVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f9451s, viewGroup, false);
        m26792a(vweVar, viewInflate);
        return viewInflate;
    }
}
