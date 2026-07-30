package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.qho;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class tho {
    /* JADX INFO: renamed from: a */
    public static void m9577a(qho qhoVar, View view) {
        qhoVar.a = ((ViewGroup) view).getChildAt(0);
        qhoVar.b = view.findViewById(x4c0.f8346p);
    }

    /* JADX INFO: renamed from: b */
    public static View m9578b(qho qhoVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f5457F, viewGroup, false);
        m9577a(qhoVar, viewInflate);
        return viewInflate;
    }
}
