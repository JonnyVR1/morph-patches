package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p147v.VEditText;
import p147v.VFrame;
import p147v.VIcon;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class if40 {
    /* JADX INFO: renamed from: a */
    public static void m135881a(hf40 hf40Var, View view) {
        hf40Var.f107431a = (VRelative) view;
        ViewGroup viewGroup = (ViewGroup) view;
        hf40Var.f107432b = viewGroup.getChildAt(0);
        hf40Var.f107433c = (VLinear) viewGroup.getChildAt(1);
        hf40Var.f107434d = (VFrame) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        hf40Var.f107435e = (VIcon) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        hf40Var.f107436f = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        hf40Var.f107437g = (VRecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        hf40Var.f107438h = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        hf40Var.f107439i = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(0);
        hf40Var.f107440j = (VEditText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(0)).getChildAt(0);
        hf40Var.f107441k = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4)).getChildAt(0)).getChildAt(1);
        hf40Var.f107442l = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m135882b(hf40 hf40Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f126443b4, viewGroup, false);
        m135881a(hf40Var, viewInflate);
        return viewInflate;
    }
}
