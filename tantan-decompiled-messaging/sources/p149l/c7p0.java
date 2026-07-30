package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p147v.VFrame;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class c7p0 {
    /* JADX INFO: renamed from: a */
    public static void m105622a(z6p0 z6p0Var, View view) {
        z6p0Var._root = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        z6p0Var._layout_empty = viewGroup.getChildAt(0);
        z6p0Var._hock = viewGroup.getChildAt(1);
        z6p0Var._bg = viewGroup.getChildAt(2);
        z6p0Var._top_holder = viewGroup.getChildAt(3);
        z6p0Var._close = (VImage) viewGroup.getChildAt(4);
        z6p0Var._icon = (VImage) viewGroup.getChildAt(5);
        z6p0Var._title = (VText) viewGroup.getChildAt(6);
        z6p0Var._content = (VFrame) viewGroup.getChildAt(7);
        z6p0Var._title_content = (VText) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(0);
        z6p0Var._notice_content = (VText) ((ViewGroup) viewGroup.getChildAt(7)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m105623b(z6p0 z6p0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168348fb, viewGroup, false);
        m105622a(z6p0Var, viewInflate);
        return viewInflate;
    }
}
