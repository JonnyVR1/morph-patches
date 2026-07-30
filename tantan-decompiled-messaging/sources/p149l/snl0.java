package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class snl0 {
    /* JADX INFO: renamed from: a */
    public static void m185068a(rnl0 rnl0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        rnl0Var._title = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(0);
        rnl0Var._subtitle = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(1);
        rnl0Var._btn = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        rnl0Var._close = (VImage) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m185069b(rnl0 rnl0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(m6c0.f131480F2, viewGroup, false);
        m185068a(rnl0Var, viewInflate);
        return viewInflate;
    }
}
