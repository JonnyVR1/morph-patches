package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VFrame;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class mha0 {
    /* JADX INFO: renamed from: a */
    public static void m154613a(lha0 lha0Var, View view) {
        lha0Var._config_root = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        lha0Var._key_name = (VText) viewGroup.getChildAt(0);
        lha0Var._selected_icon = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m154614b(lha0 lha0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.f137386x, viewGroup, false);
        m154613a(lha0Var, viewInflate);
        return viewInflate;
    }
}
