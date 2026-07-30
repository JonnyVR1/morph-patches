package p006l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class pvf {
    /* JADX INFO: renamed from: a */
    public static void m21769a(ovf ovfVar, View view) {
        ovfVar.f18398a = view.findViewById(q4c0.f19625u);
        ViewGroup viewGroup = (ViewGroup) view;
        ovfVar.f18399b = viewGroup.getChildAt(2);
        ovfVar.f18400c = viewGroup.getChildAt(3);
        ovfVar.f18401d = viewGroup.getChildAt(5);
        ovfVar.f18402e = ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(0);
        ovfVar.f18403f = ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(2);
        ovfVar.f18404g = ((ViewGroup) viewGroup.getChildAt(5)).getChildAt(4);
        ovfVar.f18405h = viewGroup.getChildAt(6);
        ovfVar.f18406i = viewGroup.getChildAt(7);
    }

    /* JADX INFO: renamed from: b */
    public static View m21770b(ovf ovfVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(c6c0.f9452t, viewGroup, false);
        m21769a(ovfVar, viewInflate);
        return viewInflate;
    }
}
