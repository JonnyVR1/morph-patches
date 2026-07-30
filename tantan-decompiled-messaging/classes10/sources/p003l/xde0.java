package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import l.f6c0;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class xde0 {
    /* JADX INFO: renamed from: a */
    public static void m10786a(wde0 wde0Var, View view) {
        wde0Var.f8160a = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        wde0Var.f8161b = viewGroup.getChildAt(0);
        wde0Var.f8162c = (FrameLayout) viewGroup.getChildAt(1);
        wde0Var.f8163d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        wde0Var.f8164e = (FrameLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        wde0Var.f8165f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m10787b(wde0 wde0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.Ke, viewGroup, false);
        m10786a(wde0Var, viewInflate);
        return viewInflate;
    }
}
