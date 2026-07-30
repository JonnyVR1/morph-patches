package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import p151v.VFrame_Shadow;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class qkf {
    /* JADX INFO: renamed from: a */
    public static void m176950a(pkf pkfVar, View view) {
        pkfVar.f152828e = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        pkfVar.f152829f = (VFrame_Shadow) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        pkfVar.f152830g = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        pkfVar.f152831h = (VFrame_Shadow) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        pkfVar.f152832i = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        pkfVar.f152833j = (VFrame_Shadow) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        pkfVar.f152834k = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m176951b(pkf pkfVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125554O9, viewGroup, false);
        m176950a(pkfVar, viewInflate);
        return viewInflate;
    }
}
