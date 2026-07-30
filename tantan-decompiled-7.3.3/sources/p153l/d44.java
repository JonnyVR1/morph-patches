package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import p151v.VFrame;
import p151v.VSwitch;

/* JADX INFO: loaded from: classes4.dex */
public class d44 {
    /* JADX INFO: renamed from: a */
    public static void m114106a(c44 c44Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        c44Var.f79662a = viewGroup.getChildAt(0);
        c44Var.f79663b = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        c44Var.f79664c = (VFrame) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        c44Var.f79665d = (VSwitch) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        c44Var.f79666e = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2)).getChildAt(0);
        c44Var.f79667f = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m114107b(c44 c44Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198799J, viewGroup, false);
        m114106a(c44Var, viewInflate);
        return viewInflate;
    }
}
