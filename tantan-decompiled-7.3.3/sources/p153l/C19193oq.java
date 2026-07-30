package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: renamed from: l.oq */
/* JADX INFO: loaded from: classes10.dex */
public class C19193oq {
    /* JADX INFO: renamed from: a */
    public static void m168776a(C18920nq c18920nq, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        c18920nq.f143151a = (VNavigationBar) viewGroup.getChildAt(0);
        c18920nq.f143152b = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        c18920nq.f143153c = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        c18920nq.f143154d = (VText) viewGroup.getChildAt(2);
        c18920nq.f143155e = (VText) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m168777b(C18920nq c18920nq, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(sec0.f167564f, viewGroup, false);
        m168776a(c18920nq, viewInflate);
        return viewInflate;
    }
}
