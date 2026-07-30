package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class hyp {
    /* JADX INFO: renamed from: a */
    public static void m137763a(gyp gypVar, View view) {
        gypVar.f107082f = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        gypVar.f107083g = (VImage) viewGroup.getChildAt(0);
        gypVar.f107084h = (VImage) viewGroup.getChildAt(1);
        gypVar.f107085i = (VText_Bold) viewGroup.getChildAt(2);
        gypVar.f107086j = (VText) viewGroup.getChildAt(4);
        gypVar.f107087k = (VText_Bold) viewGroup.getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m137764b(gyp gypVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125777c6, viewGroup, false);
        m137763a(gypVar, viewInflate);
        return viewInflate;
    }
}
