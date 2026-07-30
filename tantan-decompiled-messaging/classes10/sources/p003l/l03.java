package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class l03 {
    /* JADX INFO: renamed from: a */
    public static void m7651a(k03 k03Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        k03Var.f5401a = (LinearLayout) viewGroup.getChildAt(0);
        k03Var.f5402b = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        k03Var.f5403c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(0);
        k03Var.f5404d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(2);
        k03Var.f5405e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3)).getChildAt(4);
        k03Var.f5406f = (TextView) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m7652b(k03 k03Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.d, viewGroup, false);
        m7651a(k03Var, viewInflate);
        return viewInflate;
    }
}
