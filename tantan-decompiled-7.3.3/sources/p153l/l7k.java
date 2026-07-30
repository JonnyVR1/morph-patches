package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.p060gp.GpRateGuideDialog;
import p151v.VCheckBox;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class l7k {
    /* JADX INFO: renamed from: a */
    public static void m153142a(GpRateGuideDialog gpRateGuideDialog, View view) {
        gpRateGuideDialog.f30137a = (VImage) view.findViewById(adc0.f70282c5);
        gpRateGuideDialog.f30138b = (VText) view.findViewById(adc0.f70409je);
        gpRateGuideDialog.f30139c = (VText) view.findViewById(adc0.f70061P1);
        gpRateGuideDialog.f30140d = (VLinear) view.findViewById(adc0.f70363h1);
        gpRateGuideDialog.f30141e = (VCheckBox) view.findViewById(adc0.f70329f1);
        gpRateGuideDialog.f30142f = (VText) view.findViewById(adc0.f70380i1);
        gpRateGuideDialog.f30143g = (VText) view.findViewById(adc0.f70660ya);
        gpRateGuideDialog.f30144h = (VText) view.findViewById(adc0.f70068P8);
    }

    /* JADX INFO: renamed from: b */
    public static View m153143b(GpRateGuideDialog gpRateGuideDialog, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125936ld, viewGroup, false);
        m153142a(gpRateGuideDialog, viewInflate);
        return viewInflate;
    }
}
