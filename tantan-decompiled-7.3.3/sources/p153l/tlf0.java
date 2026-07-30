package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VFrame;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class tlf0 {
    /* JADX INFO: renamed from: a */
    public static void m191635a(slf0 slf0Var, View view) {
        slf0Var._config_root = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        slf0Var._key_name = (VText) viewGroup.getChildAt(0);
        slf0Var._selected_icon = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m191636b(slf0 slf0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(hec0.f109073A, viewGroup, false);
        m191635a(slf0Var, viewInflate);
        return viewInflate;
    }
}
