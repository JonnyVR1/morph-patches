package p002l;

import android.view.View;
import android.view.ViewGroup;
import l.byj;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class oyj {
    /* JADX INFO: renamed from: a */
    public static void m19906a(byj byjVar, View view) {
        byjVar.k = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        byjVar.l = viewGroup.getChildAt(0);
        byjVar.m = viewGroup.getChildAt(1);
        byjVar.n = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        byjVar.o = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        byjVar.p = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        byjVar.q = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(2);
        byjVar.r = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }
}
