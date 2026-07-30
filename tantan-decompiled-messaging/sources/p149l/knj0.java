package p149l;

import android.view.View;
import android.view.ViewGroup;
import p147v.VRecyclerView;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class knj0 {
    /* JADX INFO: renamed from: a */
    public static void m146569a(jnj0 jnj0Var, View view) {
        jnj0Var.f118857i = (VRelative) view;
        ViewGroup viewGroup = (ViewGroup) view;
        jnj0Var.f118858j = (VText) viewGroup.getChildAt(0);
        jnj0Var.f118859k = (VText) viewGroup.getChildAt(1);
        jnj0Var.f118860l = (VRecyclerView) viewGroup.getChildAt(2);
        jnj0Var.f118861m = (VRecyclerView) viewGroup.getChildAt(3);
    }
}
