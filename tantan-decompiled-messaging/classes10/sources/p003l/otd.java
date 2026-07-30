package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import l.n6c0;
import l.ntd;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class otd {
    /* JADX INFO: renamed from: a */
    public static void m8593a(ntd ntdVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ntdVar.a = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        ntdVar.b = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        ntdVar.c = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        ntdVar.d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
        ntdVar.e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(5);
    }

    /* JADX INFO: renamed from: b */
    public static View m8594b(ntd ntdVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.p, viewGroup, false);
        m8593a(ntdVar, viewInflate);
        return viewInflate;
    }
}
