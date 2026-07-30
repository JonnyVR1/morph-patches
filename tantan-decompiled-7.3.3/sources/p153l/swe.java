package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VButton;

/* JADX INFO: loaded from: classes10.dex */
public class swe {
    /* JADX INFO: renamed from: a */
    public static void m188278a(rwe rweVar, View view) {
        rweVar.f165128a = (VButton) ((ViewGroup) view).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m188279b(rwe rweVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f126004pd, viewGroup, false);
        m188278a(rweVar, viewInflate);
        return viewInflate;
    }
}
