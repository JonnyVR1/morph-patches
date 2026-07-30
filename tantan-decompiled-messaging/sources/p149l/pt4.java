package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import p147v.VLinear;

/* JADX INFO: loaded from: classes12.dex */
public class pt4 {
    /* JADX INFO: renamed from: a */
    public static void m171280a(nt4 nt4Var, View view) {
        nt4Var.f140415a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        nt4Var.f140416b = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        nt4Var.f140417c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        nt4Var.f140418d = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        nt4Var.f140419e = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m171281b(nt4 nt4Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142174d0, viewGroup, false);
        m171280a(nt4Var, viewInflate);
        return viewInflate;
    }
}
