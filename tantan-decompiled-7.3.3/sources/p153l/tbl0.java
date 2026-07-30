package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import p151v.VFrame_Shadow;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class tbl0 {
    /* JADX INFO: renamed from: a */
    public static void m190067a(sbl0 sbl0Var, View view) {
        sbl0Var.f167152e = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        sbl0Var.f167153f = (VFrame_Shadow) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        sbl0Var.f167154g = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        sbl0Var.f167155h = (VFrame_Shadow) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        sbl0Var.f167156i = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        sbl0Var.f167157j = (VFrame_Shadow) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        sbl0Var.f167158k = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m190068b(sbl0 sbl0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f126153y9, viewGroup, false);
        m190067a(sbl0Var, viewInflate);
        return viewInflate;
    }
}
