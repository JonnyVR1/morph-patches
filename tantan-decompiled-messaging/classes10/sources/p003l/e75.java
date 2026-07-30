package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class e75 {
    /* JADX INFO: renamed from: a */
    public static void m6248a(d75 d75Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        d75Var.f4117a = viewGroup.getChildAt(0);
        d75Var.f4118b = viewGroup.getChildAt(1);
        d75Var.f4119c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        d75Var.f4120d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        d75Var.f4121e = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        d75Var.f4122f = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        d75Var.f4123g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        d75Var.f4124h = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m6249b(d75 d75Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.s1, viewGroup, false);
        m6248a(d75Var, viewInflate);
        return viewInflate;
    }
}
