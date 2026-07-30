package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VFrame;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class mdf0 {
    /* JADX INFO: renamed from: a */
    public static void m154059a(ldf0 ldf0Var, View view) {
        ldf0Var._config_root = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        ldf0Var._key_name = (VText) viewGroup.getChildAt(0);
        ldf0Var._selected_icon = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m154060b(ldf0 ldf0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f79461A, viewGroup, false);
        m154059a(ldf0Var, viewInflate);
        return viewInflate;
    }
}
