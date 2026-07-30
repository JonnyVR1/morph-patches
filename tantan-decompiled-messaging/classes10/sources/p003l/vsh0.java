package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class vsh0 {
    /* JADX INFO: renamed from: a */
    public static void m10343a(ush0 ush0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ush0Var.f7813j = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        ush0Var.f7814k = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        ush0Var.f7815l = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        ush0Var.f7816m = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m10344b(ush0 ush0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.g8, viewGroup, false);
        m10343a(ush0Var, viewInflate);
        return viewInflate;
    }
}
