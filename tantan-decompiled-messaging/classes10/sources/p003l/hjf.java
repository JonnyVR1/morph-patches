package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.f6c0;
import l.gjf;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class hjf {
    /* JADX INFO: renamed from: a */
    public static void m7007a(gjf gjfVar, View view) {
        gjfVar.f = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        gjfVar.g = viewGroup.getChildAt(0);
        gjfVar.h = viewGroup.getChildAt(1);
        gjfVar.i = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m7008b(gjf gjfVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.ld, viewGroup, false);
        m7007a(gjfVar, viewInflate);
        return viewInflate;
    }
}
