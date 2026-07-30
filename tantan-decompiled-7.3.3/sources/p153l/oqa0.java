package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VList;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class oqa0 {
    /* JADX INFO: renamed from: a */
    public static void m168799a(nqa0 nqa0Var, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        nqa0Var.f143194a = (VNavigationBar) viewGroup.getChildAt(0);
        nqa0Var.f143195b = (VList) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m168800b(nqa0 nqa0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(sec0.f167604z, viewGroup, false);
        m168799a(nqa0Var, viewInflate);
        return viewInflate;
    }
}
