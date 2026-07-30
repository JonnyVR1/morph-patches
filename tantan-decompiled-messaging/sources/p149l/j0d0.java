package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class j0d0 {
    /* JADX INFO: renamed from: a */
    public static void m139161a(i0d0 i0d0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        i0d0Var._icon_close = (VImage) viewGroup.getChildAt(0);
        i0d0Var._image = (VImage) viewGroup.getChildAt(1);
        i0d0Var._title = (VText) viewGroup.getChildAt(2);
        i0d0Var._content = (VText) viewGroup.getChildAt(3);
        i0d0Var._confirm = (VText) viewGroup.getChildAt(4);
        i0d0Var._cancel = (VText) viewGroup.getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m139162b(i0d0 i0d0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f121365c, viewGroup, false);
        m139161a(i0d0Var, viewInflate);
        return viewInflate;
    }
}
