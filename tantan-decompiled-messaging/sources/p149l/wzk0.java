package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VButton_FakeShadow;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class wzk0 {
    /* JADX INFO: renamed from: a */
    public static void m206289a(vzk0 vzk0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        vzk0Var.f183644a = (VText) viewGroup.getChildAt(2);
        vzk0Var.f183645b = (VButton_FakeShadow) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m206290b(vzk0 vzk0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f79498f0, viewGroup, false);
        m206289a(vzk0Var, viewInflate);
        return viewInflate;
    }
}
