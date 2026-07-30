package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ofh {
    /* JADX INFO: renamed from: a */
    public static void m12633a(nfh nfhVar, View view) {
        nfhVar.f10780a = (VFrame) view;
        ViewGroup viewGroup = (ViewGroup) view;
        nfhVar.f10781b = viewGroup.getChildAt(0);
        nfhVar.f10782c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        nfhVar.f10783d = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        nfhVar.f10784e = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
        nfhVar.f10785f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        nfhVar.f10786g = viewGroup.getChildAt(1);
        nfhVar.f10787h = viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m12634b(nfh nfhVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11283q, viewGroup, false);
        m12633a(nfhVar, viewInflate);
        return viewInflate;
    }
}
