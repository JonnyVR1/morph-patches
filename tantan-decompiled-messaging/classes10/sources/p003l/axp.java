package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import l.f6c0;
import l.zwp;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class axp {
    /* JADX INFO: renamed from: a */
    public static void m5651a(zwp zwpVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        zwpVar.a = viewGroup.getChildAt(0);
        zwpVar.b = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        zwpVar.c = (Button) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m5652b(zwp zwpVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.Hc, viewGroup, false);
        m5651a(zwpVar, viewInflate);
        return viewInflate;
    }
}
