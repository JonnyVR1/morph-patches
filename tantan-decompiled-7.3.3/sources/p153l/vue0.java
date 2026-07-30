package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VEditText;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class vue0 {
    /* JADX INFO: renamed from: a */
    public static void m202785a(uue0 uue0Var, View view) {
        uue0Var.f181059a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        uue0Var.f181060b = (VEditText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        uue0Var.f181061c = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        uue0Var.f181062d = (VEditText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        uue0Var.f181063e = (VText) viewGroup.getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m202786b(uue0 uue0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(qec0.f157118s4, viewGroup, false);
        m202785a(uue0Var, viewInflate);
        return viewInflate;
    }
}
