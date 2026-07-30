package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import l.zsn0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class atn0 {
    /* JADX INFO: renamed from: a */
    public static void m10074a(zsn0 zsn0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        zsn0Var.a = viewGroup.getChildAt(0);
        zsn0Var.b = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        zsn0Var.c = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        zsn0Var.d = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m10075b(zsn0 zsn0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f20037u9, viewGroup, false);
        m10074a(zsn0Var, viewInflate);
        return viewInflate;
    }
}
