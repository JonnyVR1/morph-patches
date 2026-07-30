package p002l;

import android.view.View;
import android.view.ViewGroup;
import l.w3r;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class x3r {
    /* JADX INFO: renamed from: a */
    public static void m25679a(w3r w3rVar, View view) {
        w3rVar.k = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        w3rVar.l = viewGroup.getChildAt(0);
        w3rVar.m = viewGroup.getChildAt(1);
        w3rVar.n = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        w3rVar.o = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
