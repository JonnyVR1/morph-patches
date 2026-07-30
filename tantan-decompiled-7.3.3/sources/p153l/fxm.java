package p153l;

import android.view.View;
import android.view.ViewGroup;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class fxm {
    /* JADX INFO: renamed from: a */
    public static void m127993a(exm exmVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        exmVar.f96301a = (VLinear) viewGroup.getChildAt(0);
        exmVar.f96302b = (VRelative) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        exmVar.f96303c = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        exmVar.f96304d = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        exmVar.f96305e = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        exmVar.f96306f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        exmVar.f96307g = (VText) viewGroup.getChildAt(1);
    }
}
