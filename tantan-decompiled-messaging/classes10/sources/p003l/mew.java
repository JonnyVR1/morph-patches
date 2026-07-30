package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.lew;
import l.n6c0;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class mew {
    /* JADX INFO: renamed from: a */
    public static void m8146a(lew lewVar, View view) {
        lewVar.f = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        lewVar.g = viewGroup.getChildAt(0);
        lewVar.h = viewGroup.getChildAt(4);
        lewVar.i = ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        lewVar.j = ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m8147b(lew lewVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.F, viewGroup, false);
        m8146a(lewVar, viewInflate);
        return viewInflate;
    }
}
