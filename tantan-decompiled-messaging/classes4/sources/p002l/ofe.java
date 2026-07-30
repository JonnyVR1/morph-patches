package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ofe {
    /* JADX INFO: renamed from: a */
    public static void m19445a(nfe nfeVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        nfeVar._head = viewGroup.getChildAt(0);
        nfeVar._count = viewGroup.getChildAt(1);
        nfeVar._content = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m19446b(nfe nfeVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19480C0, viewGroup, false);
        m19445a(nfeVar, viewInflate);
        return viewInflate;
    }
}
