package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p147v.VEditText;
import p147v.VList;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class bf00 {
    /* JADX INFO: renamed from: a */
    public static void m101508a(af00 af00Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        af00Var.f69134a = (VList) viewGroup.getChildAt(0);
        af00Var.f69135b = (LinearLayout) viewGroup.getChildAt(1);
        af00Var.f69136c = (VEditText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        af00Var.f69137d = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        af00Var.f69138e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m101509b(af00 af00Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142269q4, viewGroup, false);
        m101508a(af00Var, viewInflate);
        return viewInflate;
    }
}
