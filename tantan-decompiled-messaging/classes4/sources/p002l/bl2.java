package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class bl2 {
    /* JADX INFO: renamed from: a */
    public static void m10457a(al2 al2Var, View view) {
        al2Var.f7685a = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        al2Var.f7686b = viewGroup.getChildAt(0);
        al2Var.f7687c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        al2Var.f7688d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m10458b(al2 al2Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19756Z0, viewGroup, false);
        m10457a(al2Var, viewInflate);
        return viewInflate;
    }
}
