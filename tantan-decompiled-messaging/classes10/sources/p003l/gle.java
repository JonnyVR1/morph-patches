package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.f6c0;
import l.fle;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class gle {
    /* JADX INFO: renamed from: a */
    public static void m6719a(fle fleVar, View view) {
        fleVar.u = ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m6720b(fle fleVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.t2, viewGroup, false);
        m6719a(fleVar, viewInflate);
        return viewInflate;
    }
}
