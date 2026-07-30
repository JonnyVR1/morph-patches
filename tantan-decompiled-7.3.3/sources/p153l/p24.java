package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public class p24 {
    /* JADX INFO: renamed from: a */
    public static void m170324a(o24 o24Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        o24Var.f144716a = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        o24Var.f144717b = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        o24Var.f144718c = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m170325b(o24 o24Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198835M, viewGroup, false);
        m170324a(o24Var, viewInflate);
        return viewInflate;
    }
}
