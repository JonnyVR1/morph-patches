package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import l.egr;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ggr {
    /* JADX INFO: renamed from: a */
    public static void m6633a(egr egrVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        egrVar.a = viewGroup.getChildAt(0);
        egrVar.b = viewGroup.getChildAt(1);
        egrVar.c = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        egrVar.d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        egrVar.e = (Button) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m6634b(egr egrVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f5482N0, viewGroup, false);
        m6633a(egrVar, viewInflate);
        return viewInflate;
    }
}
