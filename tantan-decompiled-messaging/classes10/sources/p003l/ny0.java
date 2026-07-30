package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.f6c0;
import l.my0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ny0 {
    /* JADX INFO: renamed from: a */
    public static void m8378a(my0 my0Var, View view) {
        my0Var.a = ((ViewGroup) view).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m8379b(my0 my0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.J, viewGroup, false);
        m8378a(my0Var, viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: c */
    public static void m8380c(my0 my0Var) {
        my0Var.a = null;
    }
}
