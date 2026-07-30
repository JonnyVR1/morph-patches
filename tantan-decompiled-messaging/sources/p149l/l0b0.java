package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class l0b0 {
    /* JADX INFO: renamed from: a */
    public static void m148036a(k0b0 k0b0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        k0b0Var.f120467i = viewGroup.getChildAt(0);
        k0b0Var.f120468j = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        k0b0Var.f120469k = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        k0b0Var.f120470l = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        k0b0Var.f120471m = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        k0b0Var.f120472n = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m148037b(k0b0 k0b0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168388j, viewGroup, false);
        m148036a(k0b0Var, viewInflate);
        return viewInflate;
    }
}
