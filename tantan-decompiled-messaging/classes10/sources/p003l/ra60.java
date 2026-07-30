package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.n6c0;
import l.qa60;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ra60 {
    /* JADX INFO: renamed from: a */
    public static void m9094a(qa60 qa60Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        qa60Var.a = viewGroup.getChildAt(0);
        qa60Var.b = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        qa60Var.c = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m9095b(qa60 qa60Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.j, viewGroup, false);
        m9094a(qa60Var, viewInflate);
        return viewInflate;
    }
}
