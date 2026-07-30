package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class h340 {
    /* JADX INFO: renamed from: a */
    public static void m10514a(g340 g340Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        g340Var.f8311a = viewGroup.getChildAt(0);
        g340Var.f8312b = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        g340Var.f8313c = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        g340Var.f8314d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m10515b(g340 g340Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11030C2, viewGroup, false);
        m10514a(g340Var, viewInflate);
        return viewInflate;
    }
}
