package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import l.f6c0;
import l.haw;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class iaw {
    /* JADX INFO: renamed from: a */
    public static void m7145a(haw hawVar, View view) {
        hawVar.j = (FrameLayout) view;
        hawVar.k = ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m7146b(haw hawVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.k6, viewGroup, false);
        m7145a(hawVar, viewInflate);
        return viewInflate;
    }
}
