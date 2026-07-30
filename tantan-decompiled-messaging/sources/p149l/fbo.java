package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p147v.VFrame;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class fbo {
    /* JADX INFO: renamed from: a */
    public static void m120383a(ebo eboVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        eboVar.f90365a = (VFrame) viewGroup.getChildAt(0);
        eboVar.f90366b = (LinearLayout) viewGroup.getChildAt(1);
        eboVar.f90367c = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m120384b(ebo eboVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95344Ed, viewGroup, false);
        m120383a(eboVar, viewInflate);
        return viewInflate;
    }
}
