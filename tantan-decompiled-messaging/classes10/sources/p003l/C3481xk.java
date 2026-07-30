package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.n6c0;
import l.wk;

/* JADX INFO: renamed from: l.xk */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class C3481xk {
    /* JADX INFO: renamed from: a */
    public static void m10871a(wk wkVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        wkVar.a = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        wkVar.b = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m10872b(wk wkVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(n6c0.O0, viewGroup, false);
        m10871a(wkVar, viewInflate);
        return viewInflate;
    }
}
