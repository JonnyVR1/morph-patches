package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p147v.VButton_FakeShadow;
import p147v.VButton_FakeShadowSmall;
import p147v.VMaterialEdit;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class j960 {
    /* JADX INFO: renamed from: a */
    public static void m140545a(i960 i960Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        i960Var.f112107a = (VNavigationBar) viewGroup.getChildAt(0);
        i960Var.f112108b = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        i960Var.f112109c = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        i960Var.f112110d = (VButton_FakeShadowSmall) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        i960Var.f112111e = (VMaterialEdit) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        i960Var.f112112f = (VMaterialEdit) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3);
        i960Var.f112113g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(4);
        i960Var.f112114h = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(5);
        i960Var.f112115i = (VButton_FakeShadow) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m140546b(i960 i960Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.f137340b, viewGroup, false);
        m140545a(i960Var, viewInflate);
        return viewInflate;
    }
}
