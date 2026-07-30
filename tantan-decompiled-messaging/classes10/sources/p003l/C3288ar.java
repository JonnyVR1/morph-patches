package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import l.n6c0;
import l.zq;

/* JADX INFO: renamed from: l.ar */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class C3288ar {
    /* JADX INFO: renamed from: a */
    public static void m5509a(zq zqVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        zqVar.a = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        zqVar.b = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        zqVar.c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        zqVar.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m5510b(zq zqVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.g, viewGroup, false);
        m5509a(zqVar, viewInflate);
        return viewInflate;
    }
}
