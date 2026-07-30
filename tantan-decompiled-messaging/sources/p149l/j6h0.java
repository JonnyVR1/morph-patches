package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class j6h0 {
    /* JADX INFO: renamed from: a */
    public static void m140029a(i6h0 i6h0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        i6h0Var._close = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        i6h0Var._sub_title = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(2)).getChildAt(1);
        i6h0Var._btn = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m140030b(i6h0 i6h0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(m6c0.f131589f2, viewGroup, false);
        m140029a(i6h0Var, viewInflate);
        return viewInflate;
    }
}
