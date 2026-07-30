package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import p151v.VDraweeView;
import p151v.VFrame_ColorFilter;
import p151v.VImage;
import p151v.VProgressBar;

/* JADX INFO: loaded from: classes10.dex */
public class cby {
    /* JADX INFO: renamed from: a */
    public static void m108661a(bby bbyVar, View view) {
        bbyVar.f76003a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        bbyVar.f76004b = (VDraweeView) viewGroup.getChildAt(0);
        bbyVar.f76005c = (FrameLayout) viewGroup.getChildAt(1);
        bbyVar.f76006d = (VFrame_ColorFilter) viewGroup.getChildAt(2);
        bbyVar.f76007e = (VImage) view.findViewById(ddc0.f87871A);
        bbyVar.f76008f = (VProgressBar) view.findViewById(ddc0.f87911q);
        ViewGroup viewGroup2 = (ViewGroup) view;
        bbyVar.f76009g = (ProgressBar) viewGroup2.getChildAt(3);
        bbyVar.f76010h = (VImage) viewGroup2.getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m108662b(bby bbyVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(pec0.f152044u0, viewGroup, false);
        m108661a(bbyVar, viewInflate);
        return viewInflate;
    }
}
