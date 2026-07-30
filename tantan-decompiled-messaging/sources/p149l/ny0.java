package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VButton_FakeShadow;

/* JADX INFO: loaded from: classes10.dex */
public class ny0 {
    /* JADX INFO: renamed from: a */
    public static void m161960a(my0 my0Var, View view) {
        my0Var.f136239a = (VButton_FakeShadow) ((ViewGroup) view).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m161961b(my0 my0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95410J, viewGroup, false);
        m161960a(my0Var, viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: c */
    public static void m161962c(my0 my0Var) {
        my0Var.f136239a = null;
    }
}
