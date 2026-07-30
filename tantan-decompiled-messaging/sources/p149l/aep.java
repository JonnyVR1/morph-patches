package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p147v.VImage;
import p147v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes10.dex */
public class aep {
    /* JADX INFO: renamed from: a */
    public static void m96121a(zdp zdpVar, View view) {
        zdpVar.f202692g = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        zdpVar.f202693h = (VImage) viewGroup.getChildAt(0);
        zdpVar.f202694i = (VImage) viewGroup.getChildAt(1);
        zdpVar.f202695j = (VText_NoTopPadding) viewGroup.getChildAt(2);
        zdpVar.f202696k = (VText_NoTopPadding) viewGroup.getChildAt(3);
        zdpVar.f202697l = (VText_NoTopPadding) viewGroup.getChildAt(4);
        zdpVar.f202698m = (VText_NoTopPadding) viewGroup.getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m96122b(zdp zdpVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f121330R, viewGroup, false);
        m96121a(zdpVar, viewInflate);
        return viewInflate;
    }
}
