package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p147v.smart_refresh.SmartRefreshLayout;

/* JADX INFO: loaded from: classes4.dex */
public class gon0 {
    /* JADX INFO: renamed from: a */
    public static void m127277a(fon0 fon0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        fon0Var.f98581a = (VLinear) viewGroup.getChildAt(0);
        fon0Var.f98582b = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        fon0Var.f98583c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        fon0Var.f98584d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        fon0Var.f98585e = (SmartRefreshLayout) viewGroup.getChildAt(1);
        fon0Var.f98586f = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        fon0Var.f98587g = (ImageView) viewGroup.getChildAt(2);
        fon0Var.f98588h = (TextView) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m127278b(fon0 fon0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f167968A8, viewGroup, false);
        m127277a(fon0Var, viewInflate);
        return viewInflate;
    }
}
