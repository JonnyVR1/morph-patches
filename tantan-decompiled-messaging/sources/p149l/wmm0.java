package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import p147v.VFrame;
import p147v.VSwitchButton;

/* JADX INFO: loaded from: classes4.dex */
public class wmm0 {
    /* JADX INFO: renamed from: a */
    public static void m203993a(vmm0 vmm0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        vmm0Var.f182121a = (RelativeLayout) viewGroup.getChildAt(0);
        vmm0Var.f182122b = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        vmm0Var.f182123c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        vmm0Var.f182124d = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        vmm0Var.f182125e = (VSwitchButton) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        vmm0Var.f182126f = (LinearLayout) viewGroup.getChildAt(1);
        vmm0Var.f182127g = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        vmm0Var.f182128h = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        vmm0Var.f182129i = (LinearLayout) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m203994b(vmm0 vmm0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168183S7, viewGroup, false);
        m203993a(vmm0Var, viewInflate);
        return viewInflate;
    }
}
