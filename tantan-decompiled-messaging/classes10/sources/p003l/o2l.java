package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class o2l {
    /* JADX INFO: renamed from: a */
    public static void m8389a(n2l n2lVar, View view) {
        n2lVar.f6466f = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        n2lVar.f6467g = viewGroup.getChildAt(0);
        n2lVar.f6468h = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        n2lVar.f6469i = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        n2lVar.f6470j = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        n2lVar.f6471k = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        n2lVar.f6472l = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m8390b(n2l n2lVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.J0, viewGroup, false);
        m8389a(n2lVar, viewInflate);
        return viewInflate;
    }
}
