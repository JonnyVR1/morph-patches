package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import p151v.VLinear;

/* JADX INFO: loaded from: classes13.dex */
public class ou4 {
    /* JADX INFO: renamed from: a */
    public static void m169220a(mu4 mu4Var, View view) {
        mu4Var.f138722a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        mu4Var.f138723b = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        mu4Var.f138724c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        mu4Var.f138725d = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        mu4Var.f138726e = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m169221b(mu4 mu4Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173643d0, viewGroup, false);
        m169220a(mu4Var, viewInflate);
        return viewInflate;
    }
}
