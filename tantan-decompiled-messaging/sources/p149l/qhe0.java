package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p147v.VEditText;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class qhe0 {
    /* JADX INFO: renamed from: a */
    public static void m174535a(phe0 phe0Var, View view) {
        phe0Var.f148900a = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        phe0Var.f148901b = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        phe0Var.f148902c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        phe0Var.f148903d = (VText) viewGroup.getChildAt(1);
        phe0Var.f148904e = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        phe0Var.f148905f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(0);
        phe0Var.f148906g = (VEditText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1)).getChildAt(1);
        phe0Var.f148907h = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        phe0Var.f148908i = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        phe0Var.f148909j = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(0);
        phe0Var.f148910k = (VEditText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1)).getChildAt(1);
        phe0Var.f148911l = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        phe0Var.f148912m = (VText) viewGroup.getChildAt(4);
        phe0Var.f148913n = (VText) ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        phe0Var.f148914o = (VText) ((ViewGroup) viewGroup.getChildAt(6)).getChildAt(1);
        phe0Var.f148915p = (VText) viewGroup.getChildAt(7);
        phe0Var.f148916q = (VText) ((ViewGroup) viewGroup.getChildAt(8)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m174536b(phe0 phe0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f126555r4, viewGroup, false);
        m174535a(phe0Var, viewInflate);
        return viewInflate;
    }
}
