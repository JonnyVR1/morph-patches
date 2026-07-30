package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class p8b0 {
    /* JADX INFO: renamed from: a */
    public static void m171228a(o8b0 o8b0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        o8b0Var.f145369i = viewGroup.getChildAt(0);
        o8b0Var.f145370j = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        o8b0Var.f145371k = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        o8b0Var.f145372l = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        o8b0Var.f145373m = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        o8b0Var.f145374n = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m171229b(o8b0 o8b0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199120j, viewGroup, false);
        m171228a(o8b0Var, viewInflate);
        return viewInflate;
    }
}
