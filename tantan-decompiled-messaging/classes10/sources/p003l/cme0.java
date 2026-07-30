package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import l.bme0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class cme0 {
    /* JADX INFO: renamed from: a */
    public static void m5967a(bme0 bme0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        bme0Var.a = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        bme0Var.b = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        bme0Var.c = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        bme0Var.d = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m5968b(bme0 bme0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f5875P5, viewGroup, false);
        m5967a(bme0Var, viewInflate);
        return viewInflate;
    }
}
