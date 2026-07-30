package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class pt4 {
    /* JADX INFO: renamed from: a */
    public static void m13216a(nt4 nt4Var, View view) {
        nt4Var.f10861a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        nt4Var.f10862b = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        nt4Var.f10863c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        nt4Var.f10864d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        nt4Var.f10865e = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m13217b(nt4 nt4Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11193d0, viewGroup, false);
        m13216a(nt4Var, viewInflate);
        return viewInflate;
    }
}
