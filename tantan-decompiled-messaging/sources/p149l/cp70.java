package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import p147v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class cp70 {
    /* JADX INFO: renamed from: a */
    public static void m108113a(do70 do70Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        do70Var.f87136i = viewGroup.getChildAt(0);
        do70Var.f87137j = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        do70Var.f87138k = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        do70Var.f87139l = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m108114b(do70 do70Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168192T4, viewGroup, false);
        m108113a(do70Var, viewInflate);
        return viewInflate;
    }
}
