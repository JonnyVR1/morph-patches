package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class elg {
    /* JADX INFO: renamed from: a */
    public static void m9930a(clg clgVar, View view) {
        clgVar.f6672q = ((ViewGroup) view).getChildAt(0);
        clgVar.f6673r = view.findViewById(b5c0.f6105y);
        ViewGroup viewGroup = (ViewGroup) view;
        clgVar.f6674s = viewGroup.getChildAt(1);
        clgVar.f6675t = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        clgVar.f6676u = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        clgVar.f6677v = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m9931b(clg clgVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11155X1, viewGroup, false);
        m9930a(clgVar, viewInflate);
        return viewInflate;
    }
}
