package p002l;

import android.view.View;
import android.view.ViewGroup;
import l.eyn0;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class fyn0 {
    /* JADX INFO: renamed from: a */
    public static void m13512a(eyn0 eyn0Var, View view) {
        eyn0Var.k = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        eyn0Var.l = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        eyn0Var.m = viewGroup.getChildAt(1);
    }
}
