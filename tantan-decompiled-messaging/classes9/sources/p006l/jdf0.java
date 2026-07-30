package p006l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class jdf0 {
    /* JADX INFO: renamed from: a */
    public static void m17432a(idf0 idf0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        idf0Var._list = viewGroup.getChildAt(1);
        idf0Var._btn = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m17433b(idf0 idf0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f9455w, viewGroup, false);
        m17432a(idf0Var, viewInflate);
        return viewInflate;
    }
}
