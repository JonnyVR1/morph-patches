package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import l.quz;
import v.VRelative;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ruz {
    /* JADX INFO: renamed from: a */
    public static void m9193a(quz quzVar, View view) {
        quzVar.a = (VRelative) view;
        quzVar.b = ((ViewGroup) view).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m9194b(quz quzVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f6076t2, viewGroup, false);
        m9193a(quzVar, viewInflate);
        return viewInflate;
    }
}
