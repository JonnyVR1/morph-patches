package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import l.wsr;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class xsr {
    /* JADX INFO: renamed from: a */
    public static void m26108a(wsr wsrVar, View view) {
        wsrVar.k = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        wsrVar.l = viewGroup.getChildAt(0);
        wsrVar.m = (TextView) viewGroup.getChildAt(1);
        wsrVar.n = (TextView) viewGroup.getChildAt(2);
        wsrVar.o = (TextView) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m26109b(wsr wsrVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19819e, viewGroup, false);
        m26108a(wsrVar, viewInflate);
        return viewInflate;
    }
}
