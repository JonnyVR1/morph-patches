package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.who;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class xho {
    /* JADX INFO: renamed from: a */
    public static void m10798a(who whoVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        whoVar.b = viewGroup.getChildAt(0);
        whoVar.c = viewGroup.getChildAt(1);
        whoVar.d = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m10799b(who whoVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f5592s, viewGroup, false);
        m10798a(whoVar, viewInflate);
        return viewInflate;
    }
}
