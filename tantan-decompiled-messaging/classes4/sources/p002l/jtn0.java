package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import l.itn0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class jtn0 {
    /* JADX INFO: renamed from: a */
    public static void m16225a(itn0 itn0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        itn0Var.c = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        itn0Var.d = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        itn0Var.e = viewGroup.getChildAt(1);
        itn0Var.f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m16226b(itn0 itn0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f20076x9, viewGroup, false);
        m16225a(itn0Var, viewInflate);
        return viewInflate;
    }
}
