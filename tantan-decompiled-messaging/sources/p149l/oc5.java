package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class oc5 {
    /* JADX INFO: renamed from: a */
    public static void m163477a(nc5 nc5Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        nc5Var.f138099a = (LinearLayout) viewGroup.getChildAt(0);
        nc5Var.f138100b = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        nc5Var.f138101c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        nc5Var.f138102d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        nc5Var.f138103e = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        nc5Var.f138104f = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        nc5Var.f138105g = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        nc5Var.f138106h = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        nc5Var.f138107i = (VText) viewGroup.getChildAt(2);
    }
}
