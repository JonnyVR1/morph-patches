package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VButton_FakeShadow;
import p147v.VMaterialEdit;

/* JADX INFO: loaded from: classes9.dex */
public class x960 {
    /* JADX INFO: renamed from: a */
    public static void m207483a(w960 w960Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        w960Var.f185304a = (VMaterialEdit) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        w960Var.f185305b = (VButton_FakeShadow) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m207484b(w960 w960Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f79473M, viewGroup, false);
        m207483a(w960Var, viewInflate);
        return viewInflate;
    }
}
