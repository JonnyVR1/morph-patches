package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import p151v.VImage;
import p151v.VRecyclerView;
import p151v.VText_NoTopPadding;

/* JADX INFO: loaded from: classes10.dex */
public class ghp {
    /* JADX INFO: renamed from: a */
    public static void m130254a(fhp fhpVar, View view) {
        fhpVar.f99088g = (ConstraintLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        fhpVar.f99089h = (VImage) viewGroup.getChildAt(0);
        fhpVar.f99090i = (VText_NoTopPadding) viewGroup.getChildAt(1);
        fhpVar.f99091j = (VText_NoTopPadding) viewGroup.getChildAt(2);
        fhpVar.f99092k = (VRecyclerView) viewGroup.getChildAt(3);
        fhpVar.f99093l = (VText_NoTopPadding) viewGroup.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m130255b(fhp fhpVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125694X5, viewGroup, false);
        m130254a(fhpVar, viewInflate);
        return viewInflate;
    }
}
