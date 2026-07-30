package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p147v.VIcon;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class qc5 {
    /* JADX INFO: renamed from: a */
    public static void m173865a(pc5 pc5Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        pc5Var.f148140a = (VText) viewGroup.getChildAt(1);
        pc5Var.f148141b = (VText) viewGroup.getChildAt(2);
        pc5Var.f148142c = (LinearLayout) viewGroup.getChildAt(3);
        pc5Var.f148143d = (VIcon) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        pc5Var.f148144e = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
    }
}
