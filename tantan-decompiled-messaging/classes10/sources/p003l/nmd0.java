package p003l;

import android.view.View;
import android.view.ViewGroup;
import l.mmd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class nmd0 {
    /* JADX INFO: renamed from: a */
    public static void m8345a(mmd0 mmd0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        mmd0Var.a = viewGroup.getChildAt(0);
        mmd0Var.b = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        mmd0Var.c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        mmd0Var.d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        mmd0Var.e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        mmd0Var.f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        mmd0Var.g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
    }
}
