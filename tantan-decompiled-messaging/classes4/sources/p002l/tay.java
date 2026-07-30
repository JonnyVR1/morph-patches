package p002l;

import android.view.View;
import android.view.ViewGroup;
import l.fay;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class tay {
    /* JADX INFO: renamed from: a */
    public static void m22823a(fay fayVar, View view) {
        fayVar.k = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        fayVar.l = viewGroup.getChildAt(0);
        fayVar.m = viewGroup.getChildAt(1);
        fayVar.n = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        fayVar.o = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }
}
