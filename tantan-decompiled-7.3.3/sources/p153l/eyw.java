package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VImage;
import p151v.VLinear;
import p151v.VList;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class eyw {
    /* JADX INFO: renamed from: a */
    public static void m123270a(byw bywVar, View view) {
        bywVar.f79065a = (VNavigationBar) ((ViewGroup) view).getChildAt(0);
        bywVar.f79066b = (VList) view.findViewById(adc0.f70301d7);
        ViewGroup viewGroup = (ViewGroup) view;
        bywVar.f79067c = (VLinear) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        bywVar.f79068d = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        bywVar.f79069e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m123271b(byw bywVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125519M6, viewGroup, false);
        m123270a(bywVar, viewInflate);
        return viewInflate;
    }
}
