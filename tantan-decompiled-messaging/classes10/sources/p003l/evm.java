package p003l;

import android.view.View;
import android.view.ViewGroup;
import l.dvm;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class evm {
    /* JADX INFO: renamed from: a */
    public static void m6338a(dvm dvmVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        dvmVar.a = viewGroup.getChildAt(0);
        dvmVar.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        dvmVar.c = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        dvmVar.d = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        dvmVar.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        dvmVar.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        dvmVar.g = viewGroup.getChildAt(1);
    }
}
