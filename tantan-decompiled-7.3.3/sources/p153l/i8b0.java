package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class i8b0 {
    /* JADX INFO: renamed from: a */
    public static void m138997a(h8b0 h8b0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        h8b0Var.f108222i = viewGroup.getChildAt(0);
        h8b0Var.f108223j = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        h8b0Var.f108224k = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        h8b0Var.f108225l = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        h8b0Var.f108226m = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        h8b0Var.f108227n = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m138998b(h8b0 h8b0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199133k, viewGroup, false);
        m138997a(h8b0Var, viewInflate);
        return viewInflate;
    }
}
