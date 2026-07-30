package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class luw {
    /* JADX INFO: renamed from: a */
    public static void m151823a(kuw kuwVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        kuwVar.f124724a = viewGroup.getChildAt(0);
        kuwVar.f124725b = (LinearLayout) viewGroup.getChildAt(1);
        kuwVar.f124726c = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m151824b(kuw kuwVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95504Od, viewGroup, false);
        m151823a(kuwVar, viewInflate);
        return viewInflate;
    }
}
