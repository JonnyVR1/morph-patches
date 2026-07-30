package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class kxw {
    /* JADX INFO: renamed from: a */
    public static void m151894a(jxw jxwVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        jxwVar.f123091a = viewGroup.getChildAt(0);
        jxwVar.f123092b = (LinearLayout) viewGroup.getChildAt(1);
        jxwVar.f123093c = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m151895b(jxw jxwVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125670Vd, viewGroup, false);
        m151894a(jxwVar, viewInflate);
        return viewInflate;
    }
}
