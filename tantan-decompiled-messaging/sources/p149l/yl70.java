package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import p147v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class yl70 {
    /* JADX INFO: renamed from: a */
    public static void m215257a(xl70 xl70Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        xl70Var.f193387i = viewGroup.getChildAt(0);
        xl70Var.f193388j = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        xl70Var.f193389k = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        xl70Var.f193390l = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        xl70Var.f193391m = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m215258b(xl70 xl70Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168168R4, viewGroup, false);
        m215257a(xl70Var, viewInflate);
        return viewInflate;
    }
}
