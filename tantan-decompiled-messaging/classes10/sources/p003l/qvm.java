package p003l;

import android.view.View;
import android.view.ViewGroup;
import l.pvm;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class qvm {
    /* JADX INFO: renamed from: a */
    public static void m9036a(pvm pvmVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        pvmVar.a = viewGroup.getChildAt(0);
        pvmVar.b = viewGroup.getChildAt(1);
        pvmVar.c = viewGroup.getChildAt(2);
        pvmVar.d = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        pvmVar.e = viewGroup.getChildAt(3);
        pvmVar.f = viewGroup.getChildAt(4);
        pvmVar.g = viewGroup.getChildAt(5);
    }
}
