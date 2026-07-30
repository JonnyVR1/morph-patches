package p003l;

import android.view.View;
import android.view.ViewGroup;
import l.gmo;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class hmo {
    /* JADX INFO: renamed from: a */
    public static void m7041a(gmo gmoVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        gmoVar.a = viewGroup.getChildAt(0);
        gmoVar.b = viewGroup.getChildAt(1);
        gmoVar.c = viewGroup.getChildAt(2);
        gmoVar.d = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        gmoVar.e = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        gmoVar.f = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        gmoVar.g = viewGroup.getChildAt(3);
        gmoVar.h = viewGroup.getChildAt(4);
        gmoVar.i = viewGroup.getChildAt(5);
        gmoVar.j = viewGroup.getChildAt(6);
    }
}
