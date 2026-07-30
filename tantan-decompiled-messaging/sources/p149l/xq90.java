package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VLinear_Dividers;
import p147v.VText;
import p147v.VText_Tags;

/* JADX INFO: loaded from: classes10.dex */
public class xq90 {
    /* JADX INFO: renamed from: a */
    public static void m210560a(wq90 wq90Var, View view) {
        wq90Var.f187664u = (VLinear_Dividers) view;
        ViewGroup viewGroup = (ViewGroup) view;
        wq90Var.f187665v = (VText) viewGroup.getChildAt(0);
        wq90Var.f187666w = (VText_Tags) viewGroup.getChildAt(1);
        wq90Var.f187667x = (VText_Tags) viewGroup.getChildAt(2);
        wq90Var.f187668y = (VText_Tags) viewGroup.getChildAt(3);
        wq90Var.f187669z = (VText_Tags) viewGroup.getChildAt(4);
        wq90Var.f187653A = (VText_Tags) viewGroup.getChildAt(5);
        wq90Var.f187654B = (VText_Tags) viewGroup.getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m210561b(wq90 wq90Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95644X9, viewGroup, false);
        m210560a(wq90Var, viewInflate);
        return viewInflate;
    }
}
