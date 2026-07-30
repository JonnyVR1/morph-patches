package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import p151v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class ix70 {
    /* JADX INFO: renamed from: a */
    public static void m142496a(jw70 jw70Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        jw70Var.f122887i = viewGroup.getChildAt(0);
        jw70Var.f122888j = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        jw70Var.f122889k = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        jw70Var.f122890l = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m142497b(jw70 jw70Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198924T4, viewGroup, false);
        m142496a(jw70Var, viewInflate);
        return viewInflate;
    }
}
