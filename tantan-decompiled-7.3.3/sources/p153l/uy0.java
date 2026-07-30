package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VButton_FakeShadow;

/* JADX INFO: loaded from: classes10.dex */
public class uy0 {
    /* JADX INFO: renamed from: a */
    public static void m198577a(ty0 ty0Var, View view) {
        ty0Var.f176628a = (VButton_FakeShadow) ((ViewGroup) view).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m198578b(ty0 ty0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125464J, viewGroup, false);
        m198577a(ty0Var, viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: c */
    public static void m198579c(ty0 ty0Var) {
        ty0Var.f176628a = null;
    }
}
