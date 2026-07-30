package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p151v.VFrame;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class qrd {
    /* JADX INFO: renamed from: a */
    public static void m177536a(prd prdVar, View view) {
        prdVar.f153752a = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        prdVar.f153753b = viewGroup.getChildAt(0);
        prdVar.f153754c = (LinearLayout) viewGroup.getChildAt(1);
        prdVar.f153755d = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        prdVar.f153756e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        prdVar.f153757f = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        prdVar.f153758g = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m177537b(prd prdVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125585Q8, viewGroup, false);
        m177536a(prdVar, viewInflate);
        return viewInflate;
    }
}
