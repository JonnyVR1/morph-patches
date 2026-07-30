package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.l0x;
import l.n6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class n0x {
    /* JADX INFO: renamed from: a */
    public static void m8295a(l0x l0xVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        l0xVar.c = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        l0xVar.d = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        l0xVar.e = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(2);
        l0xVar.f = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        l0xVar.g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m8296b(l0x l0xVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.Y, viewGroup, false);
        m8295a(l0xVar, viewInflate);
        return viewInflate;
    }
}
