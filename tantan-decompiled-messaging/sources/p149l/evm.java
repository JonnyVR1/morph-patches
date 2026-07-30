package p149l;

import android.view.View;
import android.view.ViewGroup;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class evm {
    /* JADX INFO: renamed from: a */
    public static void m118299a(dvm dvmVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        dvmVar.f88070a = (VLinear) viewGroup.getChildAt(0);
        dvmVar.f88071b = (VRelative) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        dvmVar.f88072c = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        dvmVar.f88073d = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        dvmVar.f88074e = (VLinear) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        dvmVar.f88075f = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        dvmVar.f88076g = (VText) viewGroup.getChildAt(1);
    }
}
