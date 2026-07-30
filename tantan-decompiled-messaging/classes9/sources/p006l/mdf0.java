package p006l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class mdf0 {
    /* JADX INFO: renamed from: a */
    public static void m19221a(ldf0 ldf0Var, View view) {
        ldf0Var._config_root = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ldf0Var._key_name = viewGroup.getChildAt(0);
        ldf0Var._selected_icon = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m19222b(ldf0 ldf0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f9391A, viewGroup, false);
        m19221a(ldf0Var, viewInflate);
        return viewInflate;
    }
}
