package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class bm0 {
    /* JADX INFO: renamed from: a */
    public static void m104951a(am0 am0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        am0Var.f72178a = (VText) viewGroup.getChildAt(2);
        am0Var.f72179b = (VText) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m104952b(am0 am0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198994Z2, viewGroup, false);
        m104951a(am0Var, viewInflate);
        return viewInflate;
    }
}
