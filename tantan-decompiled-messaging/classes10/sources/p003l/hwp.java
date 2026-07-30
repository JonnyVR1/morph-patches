package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.f6c0;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class hwp {
    /* JADX INFO: renamed from: a */
    public static void m7084a(gwp gwpVar, View view) {
        gwpVar.f4743f = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        gwpVar.f4744g = viewGroup.getChildAt(0);
        gwpVar.f4745h = viewGroup.getChildAt(1);
        gwpVar.f4746i = viewGroup.getChildAt(2);
        gwpVar.f4747j = viewGroup.getChildAt(4);
        gwpVar.f4748k = viewGroup.getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m7085b(gwp gwpVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.b6, viewGroup, false);
        m7084a(gwpVar, viewInflate);
        return viewInflate;
    }
}
