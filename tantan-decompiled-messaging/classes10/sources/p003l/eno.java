package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.cno;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class eno {
    /* JADX INFO: renamed from: a */
    public static void m6309a(cno cnoVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        cnoVar.d = viewGroup.getChildAt(0);
        cnoVar.e = viewGroup.getChildAt(1);
        cnoVar.f = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m6310b(cno cnoVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f5917W0, viewGroup, false);
        m6309a(cnoVar, viewInflate);
        return viewInflate;
    }
}
