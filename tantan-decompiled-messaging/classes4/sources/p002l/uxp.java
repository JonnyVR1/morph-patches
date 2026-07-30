package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import l.txp;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class uxp {
    /* JADX INFO: renamed from: a */
    public static void m23672a(txp txpVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        txpVar.a = viewGroup.getChildAt(0);
        txpVar.b = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        txpVar.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(0);
        txpVar.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m23673b(txp txpVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19551I, viewGroup, false);
        m23672a(txpVar, viewInflate);
        return viewInflate;
    }
}
