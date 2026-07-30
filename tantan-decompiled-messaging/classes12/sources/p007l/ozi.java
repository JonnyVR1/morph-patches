package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ozi {
    /* JADX INFO: renamed from: a */
    public static void m12875a(nzi nziVar, View view) {
        nziVar.f10948a = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        nziVar.f10949b = viewGroup.getChildAt(0);
        nziVar.f10950c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        nziVar.f10951d = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        nziVar.f10952e = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(0);
        nziVar.f10953f = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3)).getChildAt(2);
        nziVar.f10954g = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m12876b(nzi nziVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11036D2, viewGroup, false);
        m12875a(nziVar, viewInflate);
        return viewInflate;
    }
}
