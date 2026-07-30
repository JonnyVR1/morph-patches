package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p151v.VList;

/* JADX INFO: loaded from: classes10.dex */
public class hsa0 {
    /* JADX INFO: renamed from: a */
    public static void m136961a(gsa0 gsa0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        gsa0Var.f106250a = (TextView) viewGroup.getChildAt(0);
        gsa0Var.f106251b = (VList) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        gsa0Var.f106252c = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m136962b(gsa0 gsa0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(sec0.f167503C, viewGroup, false);
        m136961a(gsa0Var, viewInflate);
        return viewInflate;
    }
}
