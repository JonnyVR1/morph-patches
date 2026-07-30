package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.ztz;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class auz {
    /* JADX INFO: renamed from: a */
    public static void m5643a(ztz ztzVar, View view) {
        ztzVar.a = ((ViewGroup) ((ViewGroup) view).getChildAt(0)).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m5644b(ztz ztzVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f6034n2, viewGroup, false);
        m5643a(ztzVar, viewInflate);
        return viewInflate;
    }
}
