package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class wwl0 {
    /* JADX INFO: renamed from: a */
    public static void m208259a(vwl0 vwl0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        vwl0Var._title = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        vwl0Var._subtitle = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        vwl0Var._btn = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        vwl0Var._close = (VImage) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m208260b(vwl0 vwl0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(rec0.f162440F2, viewGroup, false);
        m208259a(vwl0Var, viewInflate);
        return viewInflate;
    }
}
