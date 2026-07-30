package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class deo0 {
    /* JADX INFO: renamed from: a */
    public static void m115446a(ceo0 ceo0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ceo0Var.f81399a = viewGroup.getChildAt(0);
        ceo0Var.f81400b = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        ceo0Var.f81401c = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        ceo0Var.f81402d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m115447b(ceo0 ceo0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198965W9, viewGroup, false);
        m115446a(ceo0Var, viewInflate);
        return viewInflate;
    }
}
