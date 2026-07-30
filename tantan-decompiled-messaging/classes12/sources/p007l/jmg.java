package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class jmg {
    /* JADX INFO: renamed from: a */
    public static void m11199a(img imgVar, View view) {
        imgVar.f9091a = view.findViewById(b5c0.f5946A1);
        ViewGroup viewGroup = (ViewGroup) view;
        imgVar.f9092b = viewGroup.getChildAt(0);
        imgVar.f9093c = view.findViewById(b5c0.f6028b1);
        imgVar.f9094d = viewGroup.getChildAt(1);
        imgVar.f9095e = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        imgVar.f9096f = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m11200b(img imgVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11013A, viewGroup, false);
        m11199a(imgVar, viewInflate);
        return viewInflate;
    }

    /* JADX INFO: renamed from: c */
    public static void m11201c(img imgVar) {
        imgVar.f9091a = null;
        imgVar.f9092b = null;
        imgVar.f9093c = null;
        imgVar.f9094d = null;
        imgVar.f9095e = null;
        imgVar.f9096f = null;
    }
}
