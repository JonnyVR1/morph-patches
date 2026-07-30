package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p151v.VImage;
import p151v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes10.dex */
public class agp {
    /* JADX INFO: renamed from: a */
    public static void m97714a(zfp zfpVar, View view) {
        zfpVar.f204181g = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        zfpVar.f204182h = (VImage) viewGroup.getChildAt(0);
        zfpVar.f204183i = (VImage) viewGroup.getChildAt(1);
        zfpVar.f204184j = (VText_NoTopPadding) viewGroup.getChildAt(2);
        zfpVar.f204185k = (VText_NoTopPadding) viewGroup.getChildAt(3);
        zfpVar.f204186l = (VText_NoTopPadding) viewGroup.getChildAt(4);
        zfpVar.f204187m = (VText_NoTopPadding) viewGroup.getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m97715b(zfp zfpVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(pec0.f151938R, viewGroup, false);
        m97714a(zfpVar, viewInflate);
        return viewInflate;
    }
}
