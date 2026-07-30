package p002l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import l.mem0;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class nem0 {
    /* JADX INFO: renamed from: a */
    public static void m18697a(mem0 mem0Var, View view) {
        mem0Var.k = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        mem0Var.l = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        mem0Var.m = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        mem0Var.n = viewGroup.getChildAt(1);
    }
}
